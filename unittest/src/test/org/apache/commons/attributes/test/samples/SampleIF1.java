/*
 * Copyright 2003-2004 The Apache Software Foundation
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
package org.apache.commons.attributes.test.samples;

/**
 * @@Dependency ( SampleService.class, "sample-if-1-c" )
 */
public interface SampleIF1 {
    
    /**
     * @@Dependency ( SampleService.class, "sample-if-1" )
     * @@ThreadSafe ()
     */
    public void someMethod (int parameter);
    
    /**
     * @@.return Dependency ( SampleService.class, "sample-if-return" )
     * @@.param2 Dependency ( SampleService.class, "sample-if-param-2" )
     */
    public Integer methodWithAttributes (int param1, int param2);
}