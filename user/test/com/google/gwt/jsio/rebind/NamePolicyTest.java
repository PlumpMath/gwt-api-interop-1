/*
 * Copyright 2007 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.jsio.rebind;

import junit.framework.TestCase;

/**
 * Tests the built-in NamePolicy classes.
 */
public class NamePolicyTest extends TestCase {

  public void testBean() {
    assertEquals("fooBar", NamePolicy.BEAN.convert("FooBar"));
  }
  
  public void testCStyle() {
    assertEquals("foo_bar_quux", NamePolicy.C_STYLE.convert("FooBarQuux"));
  }
  
  public void testExact() {
    assertEquals("FooBar", NamePolicy.EXACT.convert("FooBar"));
  }
  
  public void testLower() {
    assertEquals("foobar", NamePolicy.LOWER.convert("FooBar"));
  }
  
  public void testUpper() {
    assertEquals("FOOBAR", NamePolicy.UPPER.convert("FooBar"));
  }
}
