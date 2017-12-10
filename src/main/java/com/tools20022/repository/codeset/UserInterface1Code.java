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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.UserInterface1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of user interface to display or print information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface1Code#CardholderDisplay
 * UserInterface1Code.mmCardholderDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface1Code#CardholderReceipt
 * UserInterface1Code.mmCardholderReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface1Code#MerchantDisplay
 * UserInterface1Code.mmMerchantDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface1Code#MerchantReceipt
 * UserInterface1Code.mmMerchantReceipt}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
 * UserInterfaceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CDSP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UserInterface1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of user interface to display or print information."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UserInterface1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface1Code
	 * UserInterface1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderDisplay"</li>
	 * </ul>
	 */
	public static final UserInterface1Code CardholderDisplay = new UserInterface1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderDisplay";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface1Code.mmObject();
			codeName = UserInterfaceCode.CardholderDisplay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface1Code
	 * UserInterface1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderReceipt"</li>
	 * </ul>
	 */
	public static final UserInterface1Code CardholderReceipt = new UserInterface1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface1Code.mmObject();
			codeName = UserInterfaceCode.CardholderReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface1Code
	 * UserInterface1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantDisplay"</li>
	 * </ul>
	 */
	public static final UserInterface1Code MerchantDisplay = new UserInterface1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantDisplay";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface1Code.mmObject();
			codeName = UserInterfaceCode.MerchantDisplay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface1Code
	 * UserInterface1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantReceipt"</li>
	 * </ul>
	 */
	public static final UserInterface1Code MerchantReceipt = new UserInterface1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface1Code.mmObject();
			codeName = UserInterfaceCode.MerchantReceipt.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UserInterface1Code> codesByName = new LinkedHashMap<>();

	protected UserInterface1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CDSP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UserInterface1Code";
				definition = "Type of user interface to display or print information.";
				trace_lazy = () -> UserInterfaceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UserInterface1Code.CardholderDisplay, com.tools20022.repository.codeset.UserInterface1Code.CardholderReceipt,
						com.tools20022.repository.codeset.UserInterface1Code.MerchantDisplay, com.tools20022.repository.codeset.UserInterface1Code.MerchantReceipt);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CardholderDisplay.getCodeName().get(), CardholderDisplay);
		codesByName.put(CardholderReceipt.getCodeName().get(), CardholderReceipt);
		codesByName.put(MerchantDisplay.getCodeName().get(), MerchantDisplay);
		codesByName.put(MerchantReceipt.getCodeName().get(), MerchantReceipt);
	}

	public static UserInterface1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UserInterface1Code[] values() {
		UserInterface1Code[] values = new UserInterface1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UserInterface1Code> {
		@Override
		public UserInterface1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UserInterface1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}