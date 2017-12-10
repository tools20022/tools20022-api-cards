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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Min3Max4Text;
import com.tools20022.repository.entity.CardPaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party performing the card payment transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MerchantRole" src="doc-files/MerchantRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
 * CardPaymentPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MerchantRole#mmMerchantCategoryCode
 * MerchantRole.mmMerchantCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MerchantRole#mmMerchantIdentification
 * MerchantRole.mmMerchantIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#mmMerchant
 * CardPaymentEnvironment61.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmMerchant
 * CardPaymentEnvironment60.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66#mmMerchantIdentification
 * CardPaymentEnvironment66.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmMerchant
 * CardPaymentEnvironment62.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment58#mmMerchant
 * CardPaymentEnvironment58.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59#mmMerchant
 * CardPaymentEnvironment59.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#mmMerchant
 * CardPaymentEnvironment57.mmMerchant}</li>
 * </ul>
 * </li>
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
 * "MerchantRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party performing the card payment transaction."</li>
 * </ul>
 */
public class MerchantRole extends CardPaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Min3Max4Text merchantCategoryCode;
	/**
	 * Category code conform to ISO 18245, related to the type of services or
	 * goods the merchant provides for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min3Max4Text Min3Max4Text}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmMerchantCategoryCode
	 * CardTransaction5.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmMerchantCategoryCode
	 * CardTransaction15.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmMerchantCategoryCode
	 * CardPaymentTransaction71.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmMerchantCategoryCode
	 * CardPaymentTransaction75.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmMerchantCategoryCode
	 * CardPaymentTransaction74.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmMerchantCategoryCode
	 * CardPaymentTransaction70.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmMerchantCategoryCode
	 * CardPaymentTransaction72.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmMerchantCategoryCode
	 * CardPaymentTransaction76.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#mmMerchantCategoryCode
	 * CommonData6.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmMerchantCategoryCode
	 * CardPaymentTransaction69.mmMerchantCategoryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantCategoryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMerchantCategoryCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransaction5.mmMerchantCategoryCode, CardTransaction15.mmMerchantCategoryCode, CardPaymentTransaction71.mmMerchantCategoryCode, CardPaymentTransaction75.mmMerchantCategoryCode,
					CardPaymentTransaction74.mmMerchantCategoryCode, CardPaymentTransaction70.mmMerchantCategoryCode, CardPaymentTransaction72.mmMerchantCategoryCode, CardPaymentTransaction76.mmMerchantCategoryCode,
					CommonData6.mmMerchantCategoryCode, CardPaymentTransaction69.mmMerchantCategoryCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MerchantRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min3Max4Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MerchantRole.class.getMethod("getMerchantCategoryCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text merchantIdentification;
	/**
	 * Number that identifies the merchant to the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number that identifies the merchant to the card issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMerchantIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MerchantRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantIdentification";
			definition = "Number that identifies the merchant to the card issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MerchantRole.class.getMethod("getMerchantIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MerchantRole";
				definition = "Party performing the card payment transaction.";
				derivationElement_lazy = () -> Arrays.asList(CardPaymentEnvironment61.mmMerchant, CardPaymentEnvironment60.mmMerchant, CardPaymentEnvironment66.mmMerchantIdentification, CardPaymentEnvironment62.mmMerchant,
						CardPaymentEnvironment58.mmMerchant, CardPaymentEnvironment59.mmMerchant, CardPaymentEnvironment57.mmMerchant);
				superType_lazy = () -> CardPaymentPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MerchantRole.mmMerchantCategoryCode, com.tools20022.repository.entity.MerchantRole.mmMerchantIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MerchantRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Min3Max4Text getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(Min3Max4Text merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public Max35Text getMerchantIdentification() {
		return merchantIdentification;
	}

	public void setMerchantIdentification(Max35Text merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
	}
}