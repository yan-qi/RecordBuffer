/**
 * Copyright (C) 2016 Turn Inc. (yan.qi@turn.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package datamine.storage.idl.validate.exceptions;

/**
 * @author yqi
 * @date Apr 9, 2015
 */
public class NameDuplicationException extends AbstractValidationException {

	private static final long serialVersionUID = -7094032288245418128L;
	private static final String MSG_PATTERN = 
			"%s has already been used!";
		
	public NameDuplicationException(String name) {
		super(String.format(MSG_PATTERN, name));
	}
	
}
