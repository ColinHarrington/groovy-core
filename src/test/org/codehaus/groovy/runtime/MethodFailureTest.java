/*
 * Copyright 2003-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.groovy.runtime;

import groovy.lang.Closure;
import groovy.lang.GroovyMotherOfAllObjects;
import groovy.lang.GroovyRuntimeException;
import groovy.util.GroovyTestCase;

/**
 * Tests failing method invocations to ensure correct exceptions
 *
 * @author <a href="mailto:james@coredevelopers.net">James Strachan</a>
 * @version $Revision$
 */
public class MethodFailureTest extends GroovyTestCase {

    public void testFailingMethod() {
        MockGroovyMotherOfAllObjects object = new MockGroovyMotherOfAllObjects();
        try {
            object.invokeMethod("nonExistentMethod", "hello");

            fail("Should have thrown an exception");
        }
        catch (GroovyRuntimeException e) {
            System.out.println(e);
        }
    }

    public void testMethodWhichCallsTheFailingMethod() {
        MockGroovyMotherOfAllObjects object = new MockGroovyMotherOfAllObjects();
        try {
            object.invokeMethod("methodThatFails", null);

            fail("Should have thrown an exception");
        }
        catch (GroovyRuntimeException e) {
            System.out.println(e);
            //e.printStackTrace();
        }
    }

    public void testMethodWhichCallsTheFailingMethodInsideAClosure() {
        MockGroovyMotherOfAllObjects object = new MockGroovyMotherOfAllObjects();
        try {
            object.invokeMethod("callClosure", new Closure(this) {
                protected Object doCall(GroovyMotherOfAllObjects object) {
                    return object.invokeMethod("nonExistentMethod", "hello");
                }
            });

            fail("Should have thrown an exception");
        }
        catch (GroovyRuntimeException e) {
            System.out.println(e);
            //e.printStackTrace();
        }
    }

}
