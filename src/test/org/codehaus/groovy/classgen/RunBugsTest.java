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
package org.codehaus.groovy.classgen;

import groovy.lang.GroovyMotherOfAllObjects;

/**
 * A helper class for testing bugs in code generation errors. By turning on the
 * logging in TestSupport we can dump the ASM code generation code for inner
 * classes etc.
 *
 * @author <a href="mailto:james@coredevelopers.net">James Strachan</a>
 * @version $Revision$
 */
public class RunBugsTest extends TestSupport {

    public void testStaticMethodCall() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/StaticMethodCallBug.groovy");
        object.invokeMethod("testBug", null);
    }

    public void testTryCatchBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/TryCatchBug.groovy");
        object.invokeMethod("testBug", null);
    }

    public void testRodsBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/RodsBug.groovy");
        object.invokeMethod("testBug", null);
    }

    public void testCastBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/ClosureMethodCallTest.groovy");
        object.invokeMethod("testCallingClosureWithMultipleArguments", null);
    }

    public void testGuillaumesMapBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/GuillaumesMapBug.groovy");
        object.invokeMethod("testBug", null);
    }

    public void testUseClosureInScript() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/script/UseClosureInScript.groovy");
        object.invokeMethod("run", null);
    }

    public void testUseStaticInClosure() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/UseStaticInClosureBug.groovy");
        object.invokeMethod("testBug2", null);
    }

    public void testPrimitiveTypeFieldTest() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/PrimitiveTypeFieldTest.groovy");
        object.invokeMethod("testPrimitiveField", null);
    }
    
    public void testMethodDispatchBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/MethodDispatchBug.groovy");
        object.invokeMethod("testBug", null);
    }
    public void testClosureInClosureTest() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/ClosureInClosureTest.groovy");
        object.invokeMethod("testInvisibleVariable", null);
    }
    public void testStaticMarkupBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/StaticMarkupBug.groovy");
        object.invokeMethod("testBug", null);
    }
    public void testOverloadInvokeMethodBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/OverloadInvokeMethodBug.groovy");
        object.invokeMethod("testBug", null);
    }
    public void testClosureVariableBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/ClosureVariableBug.groovy");
        object.invokeMethod("testBug", null);
    }
    
    public void testMarkupAndMethodBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/MarkupAndMethodBug.groovy");
        object.invokeMethod("testBug", null);
    }
    public void testClosureParameterPassingBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/ClosureParameterPassingBug.groovy");
        object.invokeMethod("testBug", null);
    }
    public void testNestedClosureBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/NestedClosure2Bug.groovy");
        object.invokeMethod("testFieldBug", null);
    }
    public void testSuperMethod2Bug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/SuperMethod2Bug.groovy");
        object.invokeMethod("testBug", null);
    }
    public void testToStringBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/ToStringBug.groovy");
        object.invokeMethod("testBug", null);
    }
    public void testByteIndexBug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/ByteIndexBug.groovy");
        object.invokeMethod("testBug", null);
    }
    public void testGroovy252_Bug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/Groovy252_Bug.groovy");
        object.invokeMethod("testBug", null);
    }

    public void testGroovy303_Bug() throws Exception {
        GroovyMotherOfAllObjects object = compile("src/test/groovy/bugs/Groovy303_Bug.groovy");
        object.invokeMethod("testBug", null);
    }


}
