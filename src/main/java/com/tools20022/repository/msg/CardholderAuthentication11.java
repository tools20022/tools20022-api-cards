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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AuthenticationMethod5Code;
import com.tools20022.repository.codeset.AuthenticationResult1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.entity.Authentication;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AddressVerification1;
import com.tools20022.repository.msg.ContentInformationType17;
import com.tools20022.repository.msg.OnLinePIN6;
import com.tools20022.repository.msg.PersonIdentification15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related to the authentication of the cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11#mmAuthenticationMethod
 * CardholderAuthentication11.mmAuthenticationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11#mmAuthenticationValue
 * CardholderAuthentication11.mmAuthenticationValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11#mmProtectedAuthenticationValue
 * CardholderAuthentication11.mmProtectedAuthenticationValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11#mmCardholderOnLinePIN
 * CardholderAuthentication11.mmCardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11#mmCardholderIdentification
 * CardholderAuthentication11.mmCardholderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11#mmAddressVerification
 * CardholderAuthentication11.mmAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11#mmAuthenticationType
 * CardholderAuthentication11.mmAuthenticationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11#mmAuthenticationLevel
 * CardholderAuthentication11.mmAuthenticationLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11#mmAuthenticationResult
 * CardholderAuthentication11.mmAuthenticationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11#mmAuthenticationAdditionalInformation
 * CardholderAuthentication11.mmAuthenticationAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Authentication
 * Authentication}</li>
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
 * "CardholderAuthentication11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to the authentication of the cardholder."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardholderAuthentication11", propOrder = {"authenticationMethod", "authenticationValue", "protectedAuthenticationValue", "cardholderOnLinePIN", "cardholderIdentification", "addressVerification", "authenticationType",
		"authenticationLevel", "authenticationResult", "authenticationAdditionalInformation"})
public class CardholderAuthentication11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AuthntcnMtd", required = true)
	protected AuthenticationMethod5Code authenticationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationMethod
	 * Authentication.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11
	 * CardholderAuthentication11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method and data intended to be used for this transaction to authenticate the cardholder or its card."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication11, AuthenticationMethod5Code> mmAuthenticationMethod = new MMMessageAttribute<CardholderAuthentication11, AuthenticationMethod5Code>() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication11.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method and data intended to be used for this transaction to authenticate the cardholder or its card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethod5Code.mmObject();
		}

		@Override
		public AuthenticationMethod5Code getValue(CardholderAuthentication11 obj) {
			return obj.getAuthenticationMethod();
		}

		@Override
		public void setValue(CardholderAuthentication11 obj, AuthenticationMethod5Code value) {
			obj.setAuthenticationMethod(value);
		}
	};
	@XmlElement(name = "AuthntcnVal")
	protected Max5000Binary authenticationValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationValue
	 * Authentication.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11
	 * CardholderAuthentication11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value used to authenticate the cardholder."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication11, Optional<Max5000Binary>> mmAuthenticationValue = new MMMessageAttribute<CardholderAuthentication11, Optional<Max5000Binary>>() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication11.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationValue";
			definition = "Value used to authenticate the cardholder.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}

		@Override
		public Optional<Max5000Binary> getValue(CardholderAuthentication11 obj) {
			return obj.getAuthenticationValue();
		}

		@Override
		public void setValue(CardholderAuthentication11 obj, Optional<Max5000Binary> value) {
			obj.setAuthenticationValue(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctdAuthntcnVal")
	protected ContentInformationType17 protectedAuthenticationValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType17
	 * ContentInformationType17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11
	 * CardholderAuthentication11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdAuthntcnVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedAuthenticationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protection of the authentication value."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardholderAuthentication11, Optional<ContentInformationType17>> mmProtectedAuthenticationValue = new MMMessageAssociationEnd<CardholderAuthentication11, Optional<ContentInformationType17>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication11.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAuthntcnVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAuthenticationValue";
			definition = "Protection of the authentication value.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType17.mmObject();
		}

		@Override
		public Optional<ContentInformationType17> getValue(CardholderAuthentication11 obj) {
			return obj.getProtectedAuthenticationValue();
		}

		@Override
		public void setValue(CardholderAuthentication11 obj, Optional<ContentInformationType17> value) {
			obj.setProtectedAuthenticationValue(value.orElse(null));
		}
	};
	@XmlElement(name = "CrdhldrOnLinePIN")
	protected OnLinePIN6 cardholderOnLinePIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OnLinePIN6 OnLinePIN6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11
	 * CardholderAuthentication11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrOnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderOnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encrypted personal identification number (PIN) and related information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardholderAuthentication11, Optional<OnLinePIN6>> mmCardholderOnLinePIN = new MMMessageAssociationEnd<CardholderAuthentication11, Optional<OnLinePIN6>>() {
		{
			businessComponentTrace_lazy = () -> Authentication.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication11.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrOnLinePIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderOnLinePIN";
			definition = "Encrypted personal identification number (PIN) and related information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OnLinePIN6.mmObject();
		}

		@Override
		public Optional<OnLinePIN6> getValue(CardholderAuthentication11 obj) {
			return obj.getCardholderOnLinePIN();
		}

		@Override
		public void setValue(CardholderAuthentication11 obj, Optional<OnLinePIN6> value) {
			obj.setCardholderOnLinePIN(value.orElse(null));
		}
	};
	@XmlElement(name = "CrdhldrId")
	protected PersonIdentification15 cardholderIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PersonIdentification15
	 * PersonIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11
	 * CardholderAuthentication11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the cardholder to verify."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardholderAuthentication11, Optional<PersonIdentification15>> mmCardholderIdentification = new MMMessageAssociationEnd<CardholderAuthentication11, Optional<PersonIdentification15>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication11.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentification";
			definition = "Identification of the cardholder to verify.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PersonIdentification15.mmObject();
		}

		@Override
		public Optional<PersonIdentification15> getValue(CardholderAuthentication11 obj) {
			return obj.getCardholderIdentification();
		}

		@Override
		public void setValue(CardholderAuthentication11 obj, Optional<PersonIdentification15> value) {
			obj.setCardholderIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AdrVrfctn")
	protected AddressVerification1 addressVerification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AddressVerification1
	 * AddressVerification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11
	 * CardholderAuthentication11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrVrfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numeric characters of the cardholder's billing or shipping address for verification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardholderAuthentication11, Optional<AddressVerification1>> mmAddressVerification = new MMMessageAssociationEnd<CardholderAuthentication11, Optional<AddressVerification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication11.mmObject();
			isDerived = false;
			xmlTag = "AdrVrfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressVerification";
			definition = "Numeric characters of the cardholder's billing or shipping address for verification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AddressVerification1.mmObject();
		}

		@Override
		public Optional<AddressVerification1> getValue(CardholderAuthentication11 obj) {
			return obj.getAddressVerification();
		}

		@Override
		public void setValue(CardholderAuthentication11 obj, Optional<AddressVerification1> value) {
			obj.setAddressVerification(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthntcnTp")
	protected Max35Text authenticationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11
	 * CardholderAuthentication11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of authentication for a given method - e.g. three-domain authentication, scheme-proprietary authentication, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication11, Optional<Max35Text>> mmAuthenticationType = new MMMessageAttribute<CardholderAuthentication11, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication11.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationType";
			definition = "Type of authentication for a given method - e.g. three-domain authentication, scheme-proprietary authentication, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardholderAuthentication11 obj) {
			return obj.getAuthenticationType();
		}

		@Override
		public void setValue(CardholderAuthentication11 obj, Optional<Max35Text> value) {
			obj.setAuthenticationType(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthntcnLvl")
	protected Max35Text authenticationLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11
	 * CardholderAuthentication11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Level of authentication for a given type – e.g. value assigned by scheme rules or by bilateral agreements."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication11, Optional<Max35Text>> mmAuthenticationLevel = new MMMessageAttribute<CardholderAuthentication11, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication11.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationLevel";
			definition = "Level of authentication for a given type – e.g. value assigned by scheme rules or by bilateral agreements.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardholderAuthentication11 obj) {
			return obj.getAuthenticationLevel();
		}

		@Override
		public void setValue(CardholderAuthentication11 obj, Optional<Max35Text> value) {
			obj.setAuthenticationLevel(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthntcnRslt")
	protected AuthenticationResult1Code authenticationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code
	 * AuthenticationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11
	 * CardholderAuthentication11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of authentication."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication11, Optional<AuthenticationResult1Code>> mmAuthenticationResult = new MMMessageAttribute<CardholderAuthentication11, Optional<AuthenticationResult1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication11.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationResult";
			definition = "Result of authentication.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AuthenticationResult1Code.mmObject();
		}

		@Override
		public Optional<AuthenticationResult1Code> getValue(CardholderAuthentication11 obj) {
			return obj.getAuthenticationResult();
		}

		@Override
		public void setValue(CardholderAuthentication11 obj, Optional<AuthenticationResult1Code> value) {
			obj.setAuthenticationResult(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthntcnAddtlInf")
	protected Max35Text authenticationAdditionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication11
	 * CardholderAuthentication11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the result of the authentication."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication11, Optional<Max35Text>> mmAuthenticationAdditionalInformation = new MMMessageAttribute<CardholderAuthentication11, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication11.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationAdditionalInformation";
			definition = "Additional information related to the result of the authentication.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardholderAuthentication11 obj) {
			return obj.getAuthenticationAdditionalInformation();
		}

		@Override
		public void setValue(CardholderAuthentication11 obj, Optional<Max35Text> value) {
			obj.setAuthenticationAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardholderAuthentication11.mmAuthenticationMethod, com.tools20022.repository.msg.CardholderAuthentication11.mmAuthenticationValue,
						com.tools20022.repository.msg.CardholderAuthentication11.mmProtectedAuthenticationValue, com.tools20022.repository.msg.CardholderAuthentication11.mmCardholderOnLinePIN,
						com.tools20022.repository.msg.CardholderAuthentication11.mmCardholderIdentification, com.tools20022.repository.msg.CardholderAuthentication11.mmAddressVerification,
						com.tools20022.repository.msg.CardholderAuthentication11.mmAuthenticationType, com.tools20022.repository.msg.CardholderAuthentication11.mmAuthenticationLevel,
						com.tools20022.repository.msg.CardholderAuthentication11.mmAuthenticationResult, com.tools20022.repository.msg.CardholderAuthentication11.mmAuthenticationAdditionalInformation);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderAuthentication11";
				definition = "Data related to the authentication of the cardholder.";
			}
		});
		return mmObject_lazy.get();
	}

	public AuthenticationMethod5Code getAuthenticationMethod() {
		return authenticationMethod;
	}

	public CardholderAuthentication11 setAuthenticationMethod(AuthenticationMethod5Code authenticationMethod) {
		this.authenticationMethod = Objects.requireNonNull(authenticationMethod);
		return this;
	}

	public Optional<Max5000Binary> getAuthenticationValue() {
		return authenticationValue == null ? Optional.empty() : Optional.of(authenticationValue);
	}

	public CardholderAuthentication11 setAuthenticationValue(Max5000Binary authenticationValue) {
		this.authenticationValue = authenticationValue;
		return this;
	}

	public Optional<ContentInformationType17> getProtectedAuthenticationValue() {
		return protectedAuthenticationValue == null ? Optional.empty() : Optional.of(protectedAuthenticationValue);
	}

	public CardholderAuthentication11 setProtectedAuthenticationValue(ContentInformationType17 protectedAuthenticationValue) {
		this.protectedAuthenticationValue = protectedAuthenticationValue;
		return this;
	}

	public Optional<OnLinePIN6> getCardholderOnLinePIN() {
		return cardholderOnLinePIN == null ? Optional.empty() : Optional.of(cardholderOnLinePIN);
	}

	public CardholderAuthentication11 setCardholderOnLinePIN(OnLinePIN6 cardholderOnLinePIN) {
		this.cardholderOnLinePIN = cardholderOnLinePIN;
		return this;
	}

	public Optional<PersonIdentification15> getCardholderIdentification() {
		return cardholderIdentification == null ? Optional.empty() : Optional.of(cardholderIdentification);
	}

	public CardholderAuthentication11 setCardholderIdentification(PersonIdentification15 cardholderIdentification) {
		this.cardholderIdentification = cardholderIdentification;
		return this;
	}

	public Optional<AddressVerification1> getAddressVerification() {
		return addressVerification == null ? Optional.empty() : Optional.of(addressVerification);
	}

	public CardholderAuthentication11 setAddressVerification(AddressVerification1 addressVerification) {
		this.addressVerification = addressVerification;
		return this;
	}

	public Optional<Max35Text> getAuthenticationType() {
		return authenticationType == null ? Optional.empty() : Optional.of(authenticationType);
	}

	public CardholderAuthentication11 setAuthenticationType(Max35Text authenticationType) {
		this.authenticationType = authenticationType;
		return this;
	}

	public Optional<Max35Text> getAuthenticationLevel() {
		return authenticationLevel == null ? Optional.empty() : Optional.of(authenticationLevel);
	}

	public CardholderAuthentication11 setAuthenticationLevel(Max35Text authenticationLevel) {
		this.authenticationLevel = authenticationLevel;
		return this;
	}

	public Optional<AuthenticationResult1Code> getAuthenticationResult() {
		return authenticationResult == null ? Optional.empty() : Optional.of(authenticationResult);
	}

	public CardholderAuthentication11 setAuthenticationResult(AuthenticationResult1Code authenticationResult) {
		this.authenticationResult = authenticationResult;
		return this;
	}

	public Optional<Max35Text> getAuthenticationAdditionalInformation() {
		return authenticationAdditionalInformation == null ? Optional.empty() : Optional.of(authenticationAdditionalInformation);
	}

	public CardholderAuthentication11 setAuthenticationAdditionalInformation(Max35Text authenticationAdditionalInformation) {
		this.authenticationAdditionalInformation = authenticationAdditionalInformation;
		return this;
	}
}