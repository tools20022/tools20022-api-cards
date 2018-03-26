/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.SupplementaryData1;

/**
 * This component may not be used without the explicit approval of a SEG and
 * submission to the RA of ISO 20022 compliant structure(s) to be used in the
 * Envelope element.
 */
public class ConstraintSupplementaryDataRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This component may not be used without the explicit approval of a SEG and submission to the RA of ISO 20022 compliant structure(s) to be used in the Envelope element."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SupplementaryData1> forSupplementaryData1 = new MMConstraint<SupplementaryData1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "This component may not be used without the explicit approval of a SEG and submission to the RA of ISO 20022 compliant structure(s) to be used in the Envelope element.";
			owner_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public void executeValidator(SupplementaryData1 obj) throws Exception {
			checkSupplementaryData1(obj);
		}
	};

	/**
	 * This component may not be used without the explicit approval of a SEG and
	 * submission to the RA of ISO 20022 compliant structure(s) to be used in
	 * the Envelope element.
	 */
	public static void checkSupplementaryData1(SupplementaryData1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}