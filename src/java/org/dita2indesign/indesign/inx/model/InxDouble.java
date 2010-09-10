/**
 * Copyright 2009 DITA2InDesign project (dita2indesign.sourceforge.net)  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at     http://www.apache.org/licenses/LICENSE-2.0  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.  n nLicensed under the Apache License, Version 2.0 (the "License"); nyou may not use this file except in compliance with the License. nYou may obtain a copy of the License at n n   http://www.apache.org/licenses/LICENSE-2.0 n nUnless required by applicable law or agreed to in writing, software ndistributed under the License is distributed on an "AS IS" BASIS, nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. nSee the License for the specific language governing permissions and nlimitations under the License.   Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at     http://www.apache.org/licenses/LICENSE-2.0  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
 */
package org.dita2indesign.indesign.inx.model;

/**
 *
 */
public class InxDouble extends InxValue {

	protected double value;

	/**
	 * @param rawValue
	 */
	public InxDouble(String rawValue) {
		this.value = Double.parseDouble(rawValue);
	}
	
	/**
	 * 
	 */
	public InxDouble() {
	}

	/**
	 * @param value
	 */
	public InxDouble(double value) {
		this.value = value;
	}

	public Double getValue() {
		return new Double(value);
	}

	/* (non-Javadoc)
	 * @see org.dita2indesign.indesign.inx.model.InxValue#toEncodedString()
	 */
	@Override
	public String toEncodedString() {
		return "D_" + Double.toString(value);
	}
	
	public boolean equals(InxDouble cand) {
		if (!(cand instanceof InxDouble)) return false;
		return cand.getValue().equals(this.getValue());
	}
	
	public int hashCode() {
		return String.valueOf(this.getValue()).hashCode() + 11; // So this doesn't compare equal to the string we just hashed.
	}
	

}
