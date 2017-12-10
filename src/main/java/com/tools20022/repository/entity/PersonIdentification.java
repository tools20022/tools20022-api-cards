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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.Party10Choice;
import com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Unique and unambiguous way to identify a person.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PersonIdentification" src="doc-files/PersonIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmSocialSecurityNumber
 * PersonIdentification.mmSocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPerson
 * PersonIdentification.mmPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPersonName
 * PersonIdentification.mmPersonName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmDriversLicenseNumber
 * PersonIdentification.mmDriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmAlienRegistrationNumber
 * PersonIdentification.mmAlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPassportNumber
 * PersonIdentification.mmPassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmIdentityCardNumber
 * PersonIdentification.mmIdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmEmployerIdentificationNumber
 * PersonIdentification.mmEmployerIdentificationNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName#mmIdentification
 * PersonName.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
 * Person.mmPersonIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party10Choice#mmPrivateIdentification
 * Party10Choice.mmPrivateIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice
 * PersonIdentificationSchemeName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericPersonIdentification1
 * GenericPersonIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification5
 * PersonIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2
 * ContactDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification7
 * PersonIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification11
 * PersonIdentification11}</li>
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
 * "PersonIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a person."</li>
 * </ul>
 */
public class PersonIdentification extends PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text socialSecurityNumber;
	/**
	 * Number assigned by a social security agency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmSocialSecurityNumber
	 * PersonIdentification7.mmSocialSecurityNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmSocialSecurityNumber
	 * PersonIdentification11.mmSocialSecurityNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a social security agency."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSocialSecurityNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentification7.mmSocialSecurityNumber, PersonIdentification11.mmSocialSecurityNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PersonIdentification.class.getMethod("getSocialSecurityNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Person person;
	/**
	 * Person for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
	 * Person.mmPersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#mmDateAndPlaceOfBirth
	 * PersonIdentification5.mmDateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmDateAndPlaceOfBirth
	 * PersonIdentification7.mmDateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmDateAndPlaceOfBirth
	 * PersonIdentification11.mmDateAndPlaceOfBirth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPerson = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentification5.mmDateAndPlaceOfBirth, PersonIdentification7.mmDateAndPlaceOfBirth, PersonIdentification11.mmDateAndPlaceOfBirth);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Person for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.mmPersonIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PersonName> personName;
	/**
	 * Name by which a person is known and which is usually used to identify
	 * that person. It is derived from PartyName (association between
	 * PartyIdentificationInformation and PartyName).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmIdentification
	 * PersonName.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PersonName
	 * PersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a person is known and which is usually used to identify that person. It is derived from PartyName (association between PartyIdentificationInformation and PartyName)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPersonName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PersonName";
			definition = "Name by which a person is known and which is usually used to identify that person. It is derived from PartyName (association between PartyIdentificationInformation and PartyName).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonName.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PersonName.mmObject();
		}
	};
	protected Max35Text driversLicenseNumber;
	/**
	 * Number assigned by a license authority to a driver's license.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmDriversLicenseNumber
	 * PersonIdentification7.mmDriversLicenseNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmDriverLicenseNumber
	 * PersonIdentification11.mmDriverLicenseNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriversLicenseNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a license authority to a driver's license."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDriversLicenseNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentification7.mmDriversLicenseNumber, PersonIdentification11.mmDriverLicenseNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DriversLicenseNumber";
			definition = "Number assigned by a license authority to a driver's license.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PersonIdentification.class.getMethod("getDriversLicenseNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text alienRegistrationNumber;
	/**
	 * Number assigned by a government agency to identify foreign nationals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmAlienRegistrationNumber
	 * PersonIdentification7.mmAlienRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmAlienRegistrationNumber
	 * PersonIdentification11.mmAlienRegistrationNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlienRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a government agency to identify foreign nationals."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAlienRegistrationNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentification7.mmAlienRegistrationNumber, PersonIdentification11.mmAlienRegistrationNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PersonIdentification.class.getMethod("getAlienRegistrationNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text passportNumber;
	/**
	 * Number assigned by a passport authority to a passport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmPassportNumber
	 * PersonIdentification7.mmPassportNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmPassportNumber
	 * PersonIdentification11.mmPassportNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a passport authority to a passport."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPassportNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentification7.mmPassportNumber, PersonIdentification11.mmPassportNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority to a passport.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PersonIdentification.class.getMethod("getPassportNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identityCardNumber;
	/**
	 * Number assigned by a national authority to an identity card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmIdentityCardNumber
	 * PersonIdentification7.mmIdentityCardNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmIdentityCardNumber
	 * PersonIdentification11.mmIdentityCardNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCardNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national authority to an identity card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentityCardNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentification7.mmIdentityCardNumber, PersonIdentification11.mmIdentityCardNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentityCardNumber";
			definition = "Number assigned by a national authority to an identity card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PersonIdentification.class.getMethod("getIdentityCardNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text employerIdentificationNumber;
	/**
	 * Number assigned to an employer by a registration authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmEmployerIdentificationNumber
	 * PersonIdentification7.mmEmployerIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmEmployerIdentificationNumber
	 * PersonIdentification11.mmEmployerIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned to an employer by a registration authority."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEmployerIdentificationNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentification7.mmEmployerIdentificationNumber, PersonIdentification11.mmEmployerIdentificationNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployerIdentificationNumber";
			definition = "Number assigned to an employer by a registration authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PersonIdentification.class.getMethod("getEmployerIdentificationNumber", new Class[]{});
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
				name = "PersonIdentification";
				definition = "Unique and unambiguous way to identify a person.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonName.mmIdentification, com.tools20022.repository.entity.Person.mmPersonIdentification);
				derivationElement_lazy = () -> Arrays.asList(Party10Choice.mmPrivateIdentification);
				superType_lazy = () -> PartyIdentificationInformation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonIdentification.mmSocialSecurityNumber, com.tools20022.repository.entity.PersonIdentification.mmPerson,
						com.tools20022.repository.entity.PersonIdentification.mmPersonName, com.tools20022.repository.entity.PersonIdentification.mmDriversLicenseNumber,
						com.tools20022.repository.entity.PersonIdentification.mmAlienRegistrationNumber, com.tools20022.repository.entity.PersonIdentification.mmPassportNumber,
						com.tools20022.repository.entity.PersonIdentification.mmIdentityCardNumber, com.tools20022.repository.entity.PersonIdentification.mmEmployerIdentificationNumber);
				derivationComponent_lazy = () -> Arrays.asList(PersonIdentificationSchemeName1Choice.mmObject(), GenericPersonIdentification1.mmObject(), PersonIdentification5.mmObject(), ContactDetails2.mmObject(),
						PersonIdentification7.mmObject(), PersonIdentification11.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PersonIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(Max35Text socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(com.tools20022.repository.entity.Person person) {
		this.person = person;
	}

	public List<PersonName> getPersonName() {
		return personName;
	}

	public void setPersonName(List<com.tools20022.repository.entity.PersonName> personName) {
		this.personName = personName;
	}

	public Max35Text getDriversLicenseNumber() {
		return driversLicenseNumber;
	}

	public void setDriversLicenseNumber(Max35Text driversLicenseNumber) {
		this.driversLicenseNumber = driversLicenseNumber;
	}

	public Max35Text getAlienRegistrationNumber() {
		return alienRegistrationNumber;
	}

	public void setAlienRegistrationNumber(Max35Text alienRegistrationNumber) {
		this.alienRegistrationNumber = alienRegistrationNumber;
	}

	public Max35Text getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(Max35Text passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Max35Text getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber(Max35Text identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	public Max35Text getEmployerIdentificationNumber() {
		return employerIdentificationNumber;
	}

	public void setEmployerIdentificationNumber(Max35Text employerIdentificationNumber) {
		this.employerIdentificationNumber = employerIdentificationNumber;
	}
}