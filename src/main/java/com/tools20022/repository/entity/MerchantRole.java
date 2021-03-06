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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment70#mmMerchant
 * CardPaymentEnvironment70.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment68#mmMerchant
 * CardPaymentEnvironment68.mmMerchant}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonData7#mmMerchantCategoryCode
	 * CommonData7.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction83#mmMerchantCategoryCode
	 * CardPaymentTransaction83.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction81#mmMerchantCategoryCode
	 * CardPaymentTransaction81.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmMerchantCategoryCode
	 * CardPaymentTransaction80.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction85#mmMerchantCategoryCode
	 * CardPaymentTransaction85.mmMerchantCategoryCode}</li>
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
	public static final MMBusinessAttribute<MerchantRole, Min3Max4Text> mmMerchantCategoryCode = new MMBusinessAttribute<MerchantRole, Min3Max4Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransaction5.mmMerchantCategoryCode, CardTransaction15.mmMerchantCategoryCode, CommonData7.mmMerchantCategoryCode, CardPaymentTransaction83.mmMerchantCategoryCode,
					CardPaymentTransaction81.mmMerchantCategoryCode, CardPaymentTransaction80.mmMerchantCategoryCode, CardPaymentTransaction85.mmMerchantCategoryCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MerchantRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min3Max4Text.mmObject();
		}

		@Override
		public Min3Max4Text getValue(MerchantRole obj) {
			return obj.getMerchantCategoryCode();
		}

		@Override
		public void setValue(MerchantRole obj, Min3Max4Text value) {
			obj.setMerchantCategoryCode(value);
		}
	};
	protected Max35Text merchantIdentification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<MerchantRole, Max35Text> mmMerchantIdentification = new MMBusinessAttribute<MerchantRole, Max35Text>() {
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

		@Override
		public Max35Text getValue(MerchantRole obj) {
			return obj.getMerchantIdentification();
		}

		@Override
		public void setValue(MerchantRole obj, Max35Text value) {
			obj.setMerchantIdentification(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MerchantRole";
				definition = "Party performing the card payment transaction.";
				derivationElement_lazy = () -> Arrays.asList(CardPaymentEnvironment70.mmMerchant, CardPaymentEnvironment68.mmMerchant);
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

	public MerchantRole setMerchantCategoryCode(Min3Max4Text merchantCategoryCode) {
		this.merchantCategoryCode = Objects.requireNonNull(merchantCategoryCode);
		return this;
	}

	public Max35Text getMerchantIdentification() {
		return merchantIdentification;
	}

	public MerchantRole setMerchantIdentification(Max35Text merchantIdentification) {
		this.merchantIdentification = Objects.requireNonNull(merchantIdentification);
		return this;
	}
}