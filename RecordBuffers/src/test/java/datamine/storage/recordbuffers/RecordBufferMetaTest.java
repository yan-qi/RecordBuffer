/**
 * Copyright (C) 2015 Turn Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package datamine.storage.recordbuffers;

import org.testng.Assert;
import org.testng.annotations.Test;

import datamine.storage.recordbuffers.example.model.MainTableMetadata;

public class RecordBufferMetaTest {
	@Test
	public void getField() {
		RecordBufferMeta<MainTableMetadata> rbm = 
				RecordBufferMeta.getRecordOperator(MainTableMetadata.class);
		
		Assert.assertEquals(MainTableMetadata.LONG_REQUIRED_COLUMN, rbm.getField("long_required_column"));
		Assert.assertEquals(null, rbm.getField("fake_user_id"));
	}
}