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
import com.tools20022.repository.codeset.CurrencyConversionResponse3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Result of a requested currency conversion.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#Allowed
 * CurrencyConversionResponse3Code.mmAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#Assumed
 * CurrencyConversionResponse3Code.mmAssumed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#InvalidCard
 * CurrencyConversionResponse3Code.mmInvalidCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#InvalidMerchant
 * CurrencyConversionResponse3Code.mmInvalidMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#InvalidProduct
 * CurrencyConversionResponse3Code.mmInvalidProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#NoRate
 * CurrencyConversionResponse3Code.mmNoRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#NotAvailable
 * CurrencyConversionResponse3Code.mmNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#Restriction
 * CurrencyConversionResponse3Code.mmRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#Catalogue
 * CurrencyConversionResponse3Code.mmCatalogue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
 * CurrencyConversionResponseCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyConversionResponse3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of a requested currency conversion."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CurrencyConversionResponse3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
	 * CurrencyConversionResponse3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allowed"</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse3Code Allowed = new CurrencyConversionResponse3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Allowed";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmObject();
			codeName = CurrencyConversionResponseCode.Allowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
	 * CurrencyConversionResponse3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assumed"</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse3Code Assumed = new CurrencyConversionResponse3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assumed";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmObject();
			codeName = CurrencyConversionResponseCode.Assumed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
	 * CurrencyConversionResponse3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCard"</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse3Code InvalidCard = new CurrencyConversionResponse3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCard";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmObject();
			codeName = CurrencyConversionResponseCode.InvalidCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
	 * CurrencyConversionResponse3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMerchant"</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse3Code InvalidMerchant = new CurrencyConversionResponse3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMerchant";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmObject();
			codeName = CurrencyConversionResponseCode.InvalidMerchant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
	 * CurrencyConversionResponse3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidProduct"</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse3Code InvalidProduct = new CurrencyConversionResponse3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidProduct";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmObject();
			codeName = CurrencyConversionResponseCode.InvalidProduct.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
	 * CurrencyConversionResponse3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRate"</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse3Code NoRate = new CurrencyConversionResponse3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRate";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmObject();
			codeName = CurrencyConversionResponseCode.NoRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
	 * CurrencyConversionResponse3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailable"</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse3Code NotAvailable = new CurrencyConversionResponse3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmObject();
			codeName = CurrencyConversionResponseCode.NotAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
	 * CurrencyConversionResponse3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse3Code Restriction = new CurrencyConversionResponse3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmObject();
			codeName = CurrencyConversionResponseCode.Restriction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
	 * CurrencyConversionResponse3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Catalogue"</li>
	 * </ul>
	 */
	public static final CurrencyConversionResponse3Code Catalogue = new CurrencyConversionResponse3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Catalogue";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmObject();
			codeName = CurrencyConversionResponseCode.Catalogue.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CurrencyConversionResponse3Code> codesByName = new LinkedHashMap<>();

	protected CurrencyConversionResponse3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversionResponse3Code";
				definition = "Result of a requested currency conversion.";
				trace_lazy = () -> CurrencyConversionResponseCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponse3Code.Allowed, com.tools20022.repository.codeset.CurrencyConversionResponse3Code.Assumed,
						com.tools20022.repository.codeset.CurrencyConversionResponse3Code.InvalidCard, com.tools20022.repository.codeset.CurrencyConversionResponse3Code.InvalidMerchant,
						com.tools20022.repository.codeset.CurrencyConversionResponse3Code.InvalidProduct, com.tools20022.repository.codeset.CurrencyConversionResponse3Code.NoRate,
						com.tools20022.repository.codeset.CurrencyConversionResponse3Code.NotAvailable, com.tools20022.repository.codeset.CurrencyConversionResponse3Code.Restriction,
						com.tools20022.repository.codeset.CurrencyConversionResponse3Code.Catalogue);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Allowed.getCodeName().get(), Allowed);
		codesByName.put(Assumed.getCodeName().get(), Assumed);
		codesByName.put(InvalidCard.getCodeName().get(), InvalidCard);
		codesByName.put(InvalidMerchant.getCodeName().get(), InvalidMerchant);
		codesByName.put(InvalidProduct.getCodeName().get(), InvalidProduct);
		codesByName.put(NoRate.getCodeName().get(), NoRate);
		codesByName.put(NotAvailable.getCodeName().get(), NotAvailable);
		codesByName.put(Restriction.getCodeName().get(), Restriction);
		codesByName.put(Catalogue.getCodeName().get(), Catalogue);
	}

	public static CurrencyConversionResponse3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CurrencyConversionResponse3Code[] values() {
		CurrencyConversionResponse3Code[] values = new CurrencyConversionResponse3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CurrencyConversionResponse3Code> {
		@Override
		public CurrencyConversionResponse3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CurrencyConversionResponse3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}