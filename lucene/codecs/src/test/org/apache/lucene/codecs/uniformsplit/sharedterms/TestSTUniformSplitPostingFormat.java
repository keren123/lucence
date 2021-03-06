/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.lucene.codecs.uniformsplit.sharedterms;

import org.apache.lucene.codecs.PostingsFormat;
import org.apache.lucene.codecs.uniformsplit.TestUniformSplitPostingFormat;
import org.apache.lucene.codecs.uniformsplit.UniformSplitTermsWriter;
import org.apache.lucene.tests.codecs.uniformsplit.sharedterms.STUniformSplitRot13PostingsFormat;

/** Tests {@link STUniformSplitPostingsFormat} with block encoding using ROT13 cypher. */
public class TestSTUniformSplitPostingFormat extends TestUniformSplitPostingFormat {

  @Override
  protected PostingsFormat getPostingsFormat() {
    return checkEncoding
        ? new STUniformSplitRot13PostingsFormat()
        : new STUniformSplitPostingsFormat(
            UniformSplitTermsWriter.DEFAULT_TARGET_NUM_BLOCK_LINES,
            UniformSplitTermsWriter.DEFAULT_DELTA_NUM_LINES,
            null,
            null,
            random().nextBoolean());
  }
}
