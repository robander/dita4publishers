/**
 * Copyright 2009 DITA2InDesign project (dita2indesign.sourceforge.net)  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at     http://www.apache.org/licenses/LICENSE-2.0  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.  n nLicensed under the Apache License, Version 2.0 (the "License"); nyou may not use this file except in compliance with the License. nYou may obtain a copy of the License at n n   http://www.apache.org/licenses/LICENSE-2.0 n nUnless required by applicable law or agreed to in writing, software ndistributed under the License is distributed on an "AS IS" BASIS, nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. nSee the License for the specific language governing permissions and nlimitations under the License.   Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at     http://www.apache.org/licenses/LICENSE-2.0  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
 */
package org.dita2indesign.indesign.inx.model;


/**
 *
 */
public class InxRecordList extends InxValueList {


	/**
	 * 
	 */
	public InxRecordList() {
		super();
	}

	/**
	 * @param valueStr
	 * @throws Exception 
	 */
	public InxRecordList(String valueStr) throws Exception {
		// INX record items appear to be normal atomic values
		// preceded by a numeric data type value (probably from
		// the C code type constants).
		if (valueStr.startsWith("z_") || valueStr.startsWith("rz_")) {
			int p = valueStr.indexOf("_");
			valueStr = valueStr.substring(p+1);
		}

		// Get the list item count (size):
		
		String[] parts = valueStr.split("_");
		int p = 0; // Should be data type of first item in the list.

		p = processRecordListParts(this, parts, p);
	}

	public String toEncodedString() {
		String typeCode = "z";
		return encodeListAsString(typeCode);
	}



}
