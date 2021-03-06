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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Authentication;
import com.tools20022.repository.entity.CardPaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Party entitled by a card issuer to use a card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardholderRole" src="doc-files/CardholderRole.svg">
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
 * {@linkplain com.tools20022.repository.entity.CardholderRole#mmAuthentication
 * CardholderRole.mmAuthentication}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmCardholder
 * Authentication.mmCardholder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment68#mmCardholder
 * CardPaymentEnvironment68.mmCardholder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder9 Cardholder9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
 * AntiMoneyLaundering1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomer5 ATMCustomer5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomer6 ATMCustomer6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomer4 ATMCustomer4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder13 Cardholder13}</li>
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
 * "CardholderRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party entitled by a card issuer to use a card."</li>
 * </ul>
 */
public class CardholderRole extends CardPaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Authentication> authentication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmCardholder
	 * Authentication.mmCardholder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder9#mmAuthentication
	 * Cardholder9.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCustomer4#mmAuthentication
	 * ATMCustomer4.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder13#mmAuthentication
	 * Cardholder13.mmAuthentication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to the authentication of the cardholder."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CardholderRole, List<Authentication>> mmAuthentication = new MMBusinessAssociationEnd<CardholderRole, List<Authentication>>() {
		{
			derivation_lazy = () -> Arrays.asList(Cardholder9.mmAuthentication, ATMCustomer4.mmAuthentication, Cardholder13.mmAuthentication);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardholderRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Authentication";
			definition = "Data related to the authentication of the cardholder.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Authentication.mmCardholder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
		}

		@Override
		public List<Authentication> getValue(CardholderRole obj) {
			return obj.getAuthentication();
		}

		@Override
		public void setValue(CardholderRole obj, List<Authentication> value) {
			obj.setAuthentication(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderRole";
				definition = "Party entitled by a card issuer to use a card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Authentication.mmCardholder);
				derivationElement_lazy = () -> Arrays.asList(CardPaymentEnvironment68.mmCardholder);
				superType_lazy = () -> CardPaymentPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardholderRole.mmAuthentication);
				derivationComponent_lazy = () -> Arrays.asList(Cardholder9.mmObject(), AntiMoneyLaundering1.mmObject(), ATMCustomer5.mmObject(), ATMCustomer6.mmObject(), ATMCustomer4.mmObject(), Cardholder13.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardholderRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Authentication> getAuthentication() {
		return authentication == null ? authentication = new ArrayList<>() : authentication;
	}

	public CardholderRole setAuthentication(List<com.tools20022.repository.entity.Authentication> authentication) {
		this.authentication = Objects.requireNonNull(authentication);
		return this;
	}
}