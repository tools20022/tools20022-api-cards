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
import com.tools20022.repository.codeset.LegalStructureCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Organised structure that is set up for a particular purpose. For example, a
 * business, government body, department, charity, or financial institution.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Organisation" src="doc-files/Organisation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmPurpose
 * Organisation.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmRegistrationDate
 * Organisation.mmRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
 * Organisation.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmParentOrganisation
 * Organisation.mmParentOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmBranch
 * Organisation.mmBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmSecuritiesModification
 * Organisation.mmSecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfOperation
 * Organisation.mmPlaceOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfRegistration
 * Organisation.mmPlaceOfRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmDescription
 * Organisation.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmLegalStructure
 * Organisation.mmLegalStructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmSector
 * Organisation.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmRelatedIndicationOfInterest
 * Organisation.mmRelatedIndicationOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmStrategy
 * Organisation.mmStrategy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationHierarchy
 * Organisation.mmOrganisationHierarchy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmRepresentativeOfficer
 * Organisation.mmRepresentativeOfficer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmEstablishmentDate
 * Organisation.mmEstablishmentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmParentOrganisation
 * Organisation.mmParentOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation#mmBranch
 * Organisation.mmBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisation
 * OrganisationIdentification.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmOperatingOrganisation
 * Location.mmOperatingOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmRegisteredOrganisation
 * Location.mmRegisteredOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
 * SecuritiesModification.mmNewOrganisationInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmOrganisation
 * Sector.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer#mmOrganisation
 * RepresentativeOfficer.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmOrganisations
 * BuyOrSellIndicationOfInterest.mmOrganisations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy#mmOrganisation
 * OrganisationStrategy.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy#mmOrganisation
 * OrganisationHierarchy.mmOrganisation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeParty3#mmLegalOrganisation
 * TradeParty3.mmLegalOrganisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialInstitution
 * FinancialInstitution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
 * BranchAndFinancialInstitutionIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation9 Organisation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation1
 * LegalOrganisation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation18 Organisation18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation19 Organisation19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation25 Organisation25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation26 Organisation26}</li>
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
 * "Organisation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution."
 * </li>
 * </ul>
 */
public class Organisation extends Party {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text purpose;
	/**
	 * Purpose of the organisation, eg, charity.
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
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purpose of the organisation, eg, charity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, eg, charity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime registrationDate;
	/**
	 * Date and time at which a given organisation was officially registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a given organisation was officially registered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegistrationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getRegistrationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.OrganisationIdentification> organisationIdentification;
	/**
	 * Specific identification assigned to an organisation. It is derived from
	 * the association between Party and PartyIdentification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisation
	 * OrganisationIdentification.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5#mmFinancialInstitutionIdentification
	 * BranchAndFinancialInstitutionIdentification5.
	 * mmFinancialInstitutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5#mmBranchIdentification
	 * BranchAndFinancialInstitutionIdentification5.mmBranchIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrganisationIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BranchAndFinancialInstitutionIdentification5.mmFinancialInstitutionIdentification, BranchAndFinancialInstitutionIdentification5.mmBranchIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationIdentification";
			definition = "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
		}
	};
	protected Organisation parentOrganisation;
	/**
	 * Organisation which is divided in branches.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmBranch
	 * Organisation.mmBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation which is divided in branches."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmParentOrganisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentOrganisation";
			definition = "Organisation which is divided in branches.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmBranch;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Organisation> branch;
	/**
	 * Specifies an organisation which is not a head office.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmParentOrganisation
	 * Organisation.mmParentOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Branch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies an organisation which is not a head office."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBranch = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Branch";
			definition = "Specifies an organisation which is not a head office.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmParentOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected SecuritiesModification securitiesModification;
	/**
	 * Specifies the process which originates the changes to an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
	 * SecuritiesModification.mmNewOrganisationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the process which originates the changes to an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesModification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Specifies the process which originates the changes to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmNewOrganisationInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Location> placeOfOperation;
	/**
	 * Place (including country) in which the organisation has its business
	 * activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmOperatingOrganisation
	 * Location.mmOperatingOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place (including country) in which the organisation has its business activity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfOperation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfOperation";
			definition = "Place (including country) in which the organisation has its business activity.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmOperatingOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Location placeOfRegistration;
	/**
	 * Place (including country) in which the organisation is registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmRegisteredOrganisation
	 * Location.mmRegisteredOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place (including country) in which the organisation is registered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfRegistration = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfRegistration";
			definition = "Place (including country) in which the organisation is registered.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmRegisteredOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Max350Text description;
	/**
	 * Description of an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Description of an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LegalStructureCode legalStructure;
	/**
	 * Legal standing of the organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalStructureCode
	 * LegalStructureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalStructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal standing of the organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLegalStructure = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalStructure";
			definition = "Legal standing of the organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegalStructureCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getLegalStructure", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Sector sector;
	/**
	 * Sector of business of the organisation, for example, pharmaceutical.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Sector#mmOrganisation
	 * Sector.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Sector Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sector of business of the organisation, for example, pharmaceutical."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSector = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Sector of business of the organisation, for example, pharmaceutical.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}
	};
	protected BuyOrSellIndicationOfInterest relatedIndicationOfInterest;
	/**
	 * Indication of interest process for which a list of organisations is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmOrganisations
	 * BuyOrSellIndicationOfInterest.mmOrganisations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process for which a list of organisations is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process for which a list of organisations is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmOrganisations;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	protected OrganisationStrategy strategy;
	/**
	 * Strategy related to an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy#mmOrganisation
	 * OrganisationStrategy.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationStrategy
	 * OrganisationStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Strategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy related to an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStrategy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationStrategy.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationStrategy.mmObject();
		}
	};
	protected OrganisationHierarchy organisationHierarchy;
	/**
	 * Description of the structure of a company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy#mmOrganisation
	 * OrganisationHierarchy.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationHierarchy
	 * OrganisationHierarchy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationHierarchy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the structure of a company."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrganisationHierarchy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationHierarchy";
			definition = "Description of the structure of a company.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.mmObject();
		}
	};
	protected RepresentativeOfficer representativeOfficer;
	/**
	 * Officer who has some rights to represent a given organisation. In account
	 * management, it is the person to be contacted by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer#mmOrganisation
	 * RepresentativeOfficer.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RepresentativeOfficer
	 * RepresentativeOfficer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepresentativeOfficer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRepresentativeOfficer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepresentativeOfficer";
			definition = "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmObject();
		}
	};
	protected ISODate establishmentDate;
	/**
	 * Date when the organisation was established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstablishmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the organisation was established."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEstablishmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstablishmentDate";
			definition = "Date when the organisation was established.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Organisation.class.getMethod("getEstablishmentDate", new Class[]{});
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
				name = "Organisation";
				definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.mmParentOrganisation, com.tools20022.repository.entity.Organisation.mmBranch,
						com.tools20022.repository.entity.OrganisationIdentification.mmOrganisation, com.tools20022.repository.entity.Location.mmOperatingOrganisation, com.tools20022.repository.entity.Location.mmRegisteredOrganisation,
						com.tools20022.repository.entity.SecuritiesModification.mmNewOrganisationInformation, com.tools20022.repository.entity.Sector.mmOrganisation, com.tools20022.repository.entity.RepresentativeOfficer.mmOrganisation,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmOrganisations, com.tools20022.repository.entity.OrganisationStrategy.mmOrganisation,
						com.tools20022.repository.entity.OrganisationHierarchy.mmOrganisation);
				derivationElement_lazy = () -> Arrays.asList(TradeParty3.mmLegalOrganisation);
				subType_lazy = () -> Arrays.asList(FinancialInstitution.mmObject());
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.mmPurpose, com.tools20022.repository.entity.Organisation.mmRegistrationDate,
						com.tools20022.repository.entity.Organisation.mmOrganisationIdentification, com.tools20022.repository.entity.Organisation.mmParentOrganisation, com.tools20022.repository.entity.Organisation.mmBranch,
						com.tools20022.repository.entity.Organisation.mmSecuritiesModification, com.tools20022.repository.entity.Organisation.mmPlaceOfOperation, com.tools20022.repository.entity.Organisation.mmPlaceOfRegistration,
						com.tools20022.repository.entity.Organisation.mmDescription, com.tools20022.repository.entity.Organisation.mmLegalStructure, com.tools20022.repository.entity.Organisation.mmSector,
						com.tools20022.repository.entity.Organisation.mmRelatedIndicationOfInterest, com.tools20022.repository.entity.Organisation.mmStrategy, com.tools20022.repository.entity.Organisation.mmOrganisationHierarchy,
						com.tools20022.repository.entity.Organisation.mmRepresentativeOfficer, com.tools20022.repository.entity.Organisation.mmEstablishmentDate);
				derivationComponent_lazy = () -> Arrays.asList(BranchAndFinancialInstitutionIdentification5.mmObject(), Organisation9.mmObject(), LegalOrganisation1.mmObject(), Organisation18.mmObject(), Organisation19.mmObject(),
						Organisation25.mmObject(), Organisation26.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Organisation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max35Text purpose) {
		this.purpose = purpose;
	}

	public ISODateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(ISODateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public List<OrganisationIdentification> getOrganisationIdentification() {
		return organisationIdentification;
	}

	public void setOrganisationIdentification(List<com.tools20022.repository.entity.OrganisationIdentification> organisationIdentification) {
		this.organisationIdentification = organisationIdentification;
	}

	public Organisation getParentOrganisation() {
		return parentOrganisation;
	}

	public void setParentOrganisation(com.tools20022.repository.entity.Organisation parentOrganisation) {
		this.parentOrganisation = parentOrganisation;
	}

	public List<Organisation> getBranch() {
		return branch;
	}

	public void setBranch(List<com.tools20022.repository.entity.Organisation> branch) {
		this.branch = branch;
	}

	public SecuritiesModification getSecuritiesModification() {
		return securitiesModification;
	}

	public void setSecuritiesModification(com.tools20022.repository.entity.SecuritiesModification securitiesModification) {
		this.securitiesModification = securitiesModification;
	}

	public List<Location> getPlaceOfOperation() {
		return placeOfOperation;
	}

	public void setPlaceOfOperation(List<com.tools20022.repository.entity.Location> placeOfOperation) {
		this.placeOfOperation = placeOfOperation;
	}

	public Location getPlaceOfRegistration() {
		return placeOfRegistration;
	}

	public void setPlaceOfRegistration(com.tools20022.repository.entity.Location placeOfRegistration) {
		this.placeOfRegistration = placeOfRegistration;
	}

	public Max350Text getDescription() {
		return description;
	}

	public void setDescription(Max350Text description) {
		this.description = description;
	}

	public LegalStructureCode getLegalStructure() {
		return legalStructure;
	}

	public void setLegalStructure(LegalStructureCode legalStructure) {
		this.legalStructure = legalStructure;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(com.tools20022.repository.entity.Sector sector) {
		this.sector = sector;
	}

	public BuyOrSellIndicationOfInterest getRelatedIndicationOfInterest() {
		return relatedIndicationOfInterest;
	}

	public void setRelatedIndicationOfInterest(com.tools20022.repository.entity.BuyOrSellIndicationOfInterest relatedIndicationOfInterest) {
		this.relatedIndicationOfInterest = relatedIndicationOfInterest;
	}

	public OrganisationStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(com.tools20022.repository.entity.OrganisationStrategy strategy) {
		this.strategy = strategy;
	}

	public OrganisationHierarchy getOrganisationHierarchy() {
		return organisationHierarchy;
	}

	public void setOrganisationHierarchy(com.tools20022.repository.entity.OrganisationHierarchy organisationHierarchy) {
		this.organisationHierarchy = organisationHierarchy;
	}

	public RepresentativeOfficer getRepresentativeOfficer() {
		return representativeOfficer;
	}

	public void setRepresentativeOfficer(com.tools20022.repository.entity.RepresentativeOfficer representativeOfficer) {
		this.representativeOfficer = representativeOfficer;
	}

	public ISODate getEstablishmentDate() {
		return establishmentDate;
	}

	public void setEstablishmentDate(ISODate establishmentDate) {
		this.establishmentDate = establishmentDate;
	}
}