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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information related to a non-standardised identification, such as a
 * proprietary party identification or account identification.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="GenericIdentification"
 * src="doc-files/GenericIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
 * GenericIdentification.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForContactPoint
 * GenericIdentification.mmIdentificationForContactPoint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccount
 * GenericIdentification.mmIdentificationForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
 * GenericIdentification.mmRelatedPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIssueDate
 * GenericIdentification.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmExpiryDate
 * GenericIdentification.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmScheme
 * GenericIdentification.mmScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForSecuritiesCertificate
 * GenericIdentification.mmIdentificationForSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForLot
 * GenericIdentification.mmIdentificationForLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmPartyRole
 * GenericIdentification.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForCashProceedsIncome
 * GenericIdentification.mmIdentificationForCashProceedsIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedStatusReason
 * GenericIdentification.mmRelatedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForBankTransaction
 * GenericIdentification.mmIdentificationForBankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccountCostReferencePattern
 * GenericIdentification.mmIdentificationForAccountCostReferencePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmAccount
 * GenericIdentification.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSystemIdentification
 * GenericIdentification.mmRelatedSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
 * GenericIdentification.mmIdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCashAccountService
 * GenericIdentification.mmRelatedCashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInvestmentFundClass
 * GenericIdentification.mmIdentificationForInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedLocation
 * GenericIdentification.mmIdentifiedLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
 * GenericIdentification.mmIdentifiedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPurchaseOrder
 * GenericIdentification.mmRelatedPurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCertificate
 * GenericIdentification.mmRelatedCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmFundClassification
 * InvestmentFundClass.mmFundClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
 * SecuritiesIdentification.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmGenericIdentification
 * InformationPartyRole.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmIdentification
 * ContactPoint.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
 * PartyIdentificationInformation.mmOtherIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmType
 * Account.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
 * AccountIdentification.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmCostReferencePattern
 * AccountIdentification.mmCostReferencePattern}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIdentification
 * Location.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmIdentification
 * Scheme.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
 * Document.mmDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
 * StatusReason.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
 * SystemIdentification.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
 * LotBreakdown.mmLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmIdentification
 * CashAccountService.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
 * SecuritiesCertificate.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestName
 * Interest.mmInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
 * CashProceedsDefinition.mmIncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmProprietaryIdentification
 * BankTransaction.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
 * PurchaseOrder.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmCertificate
 * RegisteredContract.mmCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification32#mmType
 * GenericIdentification32.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification53#mmType
 * GenericIdentification53.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification71#mmType
 * GenericIdentification71.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification73#mmType
 * GenericIdentification73.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification74#mmType
 * GenericIdentification74.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification75#mmType
 * GenericIdentification75.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification76#mmType
 * GenericIdentification76.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification77#mmType
 * GenericIdentification77.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification94#mmType
 * GenericIdentification94.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification90#mmType
 * GenericIdentification90.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification92#mmType
 * GenericIdentification92.mmType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification1
 * GenericIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification13
 * GenericIdentification13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification4
 * GenericIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation4
 * SimpleIdentificationInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification32
 * GenericIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification48
 * GenericIdentification48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification53
 * GenericIdentification53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification71
 * GenericIdentification71}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification73
 * GenericIdentification73}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification74
 * GenericIdentification74}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification72
 * GenericIdentification72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification75
 * GenericIdentification75}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification76
 * GenericIdentification76}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification77
 * GenericIdentification77}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification94
 * GenericIdentification94}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification90
 * GenericIdentification90}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification93
 * GenericIdentification93}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification92
 * GenericIdentification92}</li>
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
 * "GenericIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to a non-standardised identification, such as a proprietary party identification or account identification."
 * </li>
 * </ul>
 */
public class GenericIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Name or number assigned by an entity to enable recognition of that
	 * entity, for example account identifier, identification assigned by a
	 * provider to identify its customers.
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1#mmIdentification
	 * GenericIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13#mmIdentification
	 * GenericIdentification13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2#mmMemberIdentification
	 * ClearingSystemMemberIdentification2.mmMemberIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#mmIdentification
	 * GenericFinancialIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BranchData2#mmIdentification
	 * BranchData2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification4#mmIdentification
	 * GenericIdentification4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#mmIdentification
	 * GenericOrganisationIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#mmIdentification
	 * GenericPersonIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation4#mmIdentification
	 * SimpleIdentificationInformation4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32#mmIdentification
	 * GenericIdentification32.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentIdentification1#mmProviderIdentification
	 * PointOfInteractionComponentIdentification1.mmProviderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification48#mmIdentification
	 * GenericIdentification48.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1#mmAssigner
	 * PointOfInteractionComponentAssessment1.mmAssigner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmCashierIdentification
	 * SaleContext1.mmCashierIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegalOrganisation1#mmIdentification
	 * LegalOrganisation1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22#mmIdentification
	 * DocumentIdentification22.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmDocumentNumber
	 * DocumentGeneralInformation2.mmDocumentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification23#mmIdentification
	 * DocumentIdentification23.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53#mmIdentification
	 * GenericIdentification53.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71#mmIdentification
	 * GenericIdentification71.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73#mmIdentification
	 * GenericIdentification73.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification74#mmIdentification
	 * GenericIdentification74.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72#mmIdentification
	 * GenericIdentification72.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification75#mmIdentification
	 * GenericIdentification75.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification76#mmIdentification
	 * GenericIdentification76.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommandIdentification1#mmProcessor
	 * ATMCommandIdentification1.mmProcessor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification77#mmIdentification
	 * GenericIdentification77.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmCashierIdentification
	 * SaleContext2.mmCashierIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification94#mmIdentification
	 * GenericIdentification94.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification90#mmIdentification
	 * GenericIdentification90.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification93#mmIdentification
	 * GenericIdentification93.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification92#mmIdentification
	 * GenericIdentification92.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIdentification
	 * InvoiceHeader2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmQuotationDocumentIdentification
	 * TradeAgreement13.mmQuotationDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmContractDocumentIdentification
	 * TradeAgreement13.mmContractDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmBuyerOrderIdentificationDocument
	 * TradeAgreement13.mmBuyerOrderIdentificationDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmDeliveryNoteIdentification
	 * LineItem16.mmDeliveryNoteIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GenericIdentification1.mmIdentification, GenericIdentification13.mmIdentification, ClearingSystemMemberIdentification2.mmMemberIdentification,
					GenericFinancialIdentification1.mmIdentification, BranchData2.mmIdentification, GenericIdentification4.mmIdentification, GenericOrganisationIdentification1.mmIdentification,
					GenericPersonIdentification1.mmIdentification, SimpleIdentificationInformation4.mmIdentification, GenericIdentification32.mmIdentification, PointOfInteractionComponentIdentification1.mmProviderIdentification,
					GenericIdentification48.mmIdentification, PointOfInteractionComponentAssessment1.mmAssigner, SaleContext1.mmCashierIdentification, LegalOrganisation1.mmIdentification, DocumentIdentification22.mmIdentification,
					DocumentGeneralInformation2.mmDocumentNumber, DocumentIdentification23.mmIdentification, GenericIdentification53.mmIdentification, GenericIdentification71.mmIdentification, GenericIdentification73.mmIdentification,
					GenericIdentification74.mmIdentification, GenericIdentification72.mmIdentification, GenericIdentification75.mmIdentification, GenericIdentification76.mmIdentification, ATMCommandIdentification1.mmProcessor,
					GenericIdentification77.mmIdentification, SaleContext2.mmCashierIdentification, GenericIdentification94.mmIdentification, GenericIdentification90.mmIdentification, GenericIdentification93.mmIdentification,
					GenericIdentification92.mmIdentification, InvoiceHeader2.mmIdentification, TradeAgreement13.mmQuotationDocumentIdentification, TradeAgreement13.mmContractDocumentIdentification,
					TradeAgreement13.mmBuyerOrderIdentificationDocument, LineItem16.mmDeliveryNoteIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return GenericIdentification.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> identificationForContactPoint;
	/**
	 * Contact point which uses a generic identification as identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmIdentification
	 * ContactPoint.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contact point which uses a generic identification as identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentificationForContactPoint = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForContactPoint";
			definition = "Contact point which uses a generic identification as identification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected AccountIdentification identificationForAccount;
	/**
	 * Account Identification which uses a generic identification as proprietary
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
	 * AccountIdentification.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account Identification which uses a generic identification as proprietary identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentificationForAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccount";
			definition = "Account Identification which uses a generic identification as proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmProprietaryIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
		}
	};
	protected PartyIdentificationInformation relatedPartyIdentification;
	/**
	 * Party identified with a scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party identified with a scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPartyIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPartyIdentification";
			definition = "Party identified with a scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmOtherIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
		}
	};
	protected ISODate issueDate;
	/**
	 * Date at which the identification was issued.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the identification was issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIssueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date at which the identification was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return GenericIdentification.class.getMethod("getIssueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate expiryDate;
	/**
	 * Date at which the identification expires.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the identification expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the identification expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return GenericIdentification.class.getMethod("getExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Scheme scheme;
	/**
	 * Information regarding an enumerated code list and its owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#mmIdentification
	 * Scheme.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#mmSchemeName
	 * GenericFinancialIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#mmSchemeName
	 * GenericOrganisationIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#mmSchemeName
	 * GenericPersonIdentification1.mmSchemeName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information regarding an enumerated code list and its owner."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmScheme = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(GenericFinancialIdentification1.mmSchemeName, GenericOrganisationIdentification1.mmSchemeName, GenericPersonIdentification1.mmSchemeName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Information regarding an enumerated code list and its owner.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
		}
	};
	protected SecuritiesCertificate identificationForSecuritiesCertificate;
	/**
	 * Securities certificate which uses a generic identification as certificate
	 * number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
	 * SecuritiesCertificate.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForSecuritiesCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities certificate which uses a generic identification as certificate number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentificationForSecuritiesCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForSecuritiesCertificate";
			definition = "Securities certificate which uses a generic identification as certificate number.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmObject();
		}
	};
	protected LotBreakdown identificationForLot;
	/**
	 * Lot breakdown which uses a generic identification as lot number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
	 * LotBreakdown.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Lot breakdown which uses a generic identification as lot number."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentificationForLot = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForLot";
			definition = "Lot breakdown which uses a generic identification as lot number.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmLotNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InformationPartyRole> partyRole;
	/**
	 * Entity that assigns the identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmGenericIdentification
	 * InformationPartyRole.mmGenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that assigns the identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Entity that assigns the identification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmGenericIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
		}
	};
	protected CashProceedsDefinition identificationForCashProceedsIncome;
	/**
	 * Cash proceeds definition which uses a generic identification as type of
	 * income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
	 * CashProceedsDefinition.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForCashProceedsIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds definition which uses a generic identification as type of income."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentificationForCashProceedsIncome = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForCashProceedsIncome";
			definition = "Cash proceeds definition which uses a generic identification as type of income.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmIncomeType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
		}
	};
	protected StatusReason relatedStatusReason;
	/**
	 * Specifies the status reason for which a data source scheme is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
	 * StatusReason.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StatusReason
	 * StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status reason for which a data source scheme is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedStatusReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedStatusReason";
			definition = "Specifies the status reason for which a data source scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.mmDataSourceScheme;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.BankTransaction> identificationForBankTransaction;
	/**
	 * Bank transaction which uses a generic identification as proprietary
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmProprietaryIdentification
	 * BankTransaction.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForBankTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bank transaction which uses a generic identification as proprietary identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentificationForBankTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForBankTransaction";
			definition = "Bank transaction which uses a generic identification as proprietary identification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmProprietaryIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
		}
	};
	protected AccountIdentification identificationForAccountCostReferencePattern;
	/**
	 * Account identification for which a cost reference pattern is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmCostReferencePattern
	 * AccountIdentification.mmCostReferencePattern}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForAccountCostReferencePattern"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account identification for which a cost reference pattern is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentificationForAccountCostReferencePattern = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccountCostReferencePattern";
			definition = "Account identification for which a cost reference pattern is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmCostReferencePattern;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
		}
	};
	protected Account account;
	/**
	 * Account for which a type is specified
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#mmType
	 * Account.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which a type is specified"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a type is specified";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected SystemIdentification relatedSystemIdentification;
	/**
	 * System identification which uses a generic identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
	 * SystemIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System identification which uses a generic identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSystemIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSystemIdentification";
			definition = "System identification which uses a generic identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
		}
	};
	protected Interest identificationForInterestName;
	/**
	 * Interest which uses a generic identification as name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestName
	 * Interest.mmInterestName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForInterestName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest which uses a generic identification as name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentificationForInterestName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInterestName";
			definition = "Interest which uses a generic identification as name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmInterestName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected CashAccountService relatedCashAccountService;
	/**
	 * Cash account service identified in a generic way.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmIdentification
	 * CashAccountService.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account service identified in a generic way."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCashAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashAccountService";
			definition = "Cash account service identified in a generic way.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
		}
	};
	protected InvestmentFundClass identificationForInvestmentFundClass;
	/**
	 * Investment fund class which uses a generic identification as fund
	 * classification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmFundClassification
	 * InvestmentFundClass.mmFundClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForInvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class which uses a generic identification as fund classification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentificationForInvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInvestmentFundClass";
			definition = "Investment fund class which uses a generic identification as fund classification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmFundClassification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	protected Location identifiedLocation;
	/**
	 * Location for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmIdentification
	 * Location.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentifiedLocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedLocation";
			definition = "Location for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected SecuritiesIdentification relatedSecuritiesIdentification;
	/**
	 * Securities identification for which generic identification elements and
	 * scheme are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
	 * SecuritiesIdentification.mmGenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities identification for which generic identification elements and scheme are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesIdentification";
			definition = "Securities identification for which generic identification elements and scheme are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmGenericIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected Document identifiedDocument;
	/**
	 * Document for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
	 * Document.mmDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentifiedDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedDocument";
			definition = "Document for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmDocumentIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	protected PurchaseOrder relatedPurchaseOrder;
	/**
	 * Purchase order for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
	 * PurchaseOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PurchaseOrder
	 * PurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purchase order for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPurchaseOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPurchaseOrder";
			definition = "Purchase order for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
		}
	};
	protected RegisteredContract relatedCertificate;
	/**
	 * Related certificate against which all transactions in the scope of the
	 * regulatory requirements are registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmCertificate
	 * RegisteredContract.mmCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related certificate against which all transactions in the scope of the regulatory requirements are registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCertificate";
			definition = "Related certificate against which all transactions in the scope of the regulatory requirements are registered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GenericIdentification";
				definition = "Information related to a non-standardised identification, such as a proprietary party identification or account identification.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmFundClassification, com.tools20022.repository.entity.SecuritiesIdentification.mmGenericIdentification,
						com.tools20022.repository.entity.InformationPartyRole.mmGenericIdentification, com.tools20022.repository.entity.ContactPoint.mmIdentification,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmOtherIdentification, com.tools20022.repository.entity.Account.mmType,
						com.tools20022.repository.entity.AccountIdentification.mmProprietaryIdentification, com.tools20022.repository.entity.AccountIdentification.mmCostReferencePattern,
						com.tools20022.repository.entity.Location.mmIdentification, com.tools20022.repository.entity.Scheme.mmIdentification, com.tools20022.repository.entity.Document.mmDocumentIdentification,
						com.tools20022.repository.entity.StatusReason.mmDataSourceScheme, com.tools20022.repository.entity.SystemIdentification.mmIdentification, com.tools20022.repository.entity.LotBreakdown.mmLotNumber,
						com.tools20022.repository.entity.CashAccountService.mmIdentification, com.tools20022.repository.entity.SecuritiesCertificate.mmNumber, com.tools20022.repository.entity.Interest.mmInterestName,
						com.tools20022.repository.entity.CashProceedsDefinition.mmIncomeType, com.tools20022.repository.entity.BankTransaction.mmProprietaryIdentification, com.tools20022.repository.entity.PurchaseOrder.mmIdentification,
						com.tools20022.repository.entity.RegisteredContract.mmCertificate);
				derivationElement_lazy = () -> Arrays.asList(GenericIdentification32.mmType, GenericIdentification53.mmType, GenericIdentification71.mmType, GenericIdentification73.mmType, GenericIdentification74.mmType,
						GenericIdentification75.mmType, GenericIdentification76.mmType, GenericIdentification77.mmType, GenericIdentification94.mmType, GenericIdentification90.mmType, GenericIdentification92.mmType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentification, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForContactPoint,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccount, com.tools20022.repository.entity.GenericIdentification.mmRelatedPartyIdentification,
						com.tools20022.repository.entity.GenericIdentification.mmIssueDate, com.tools20022.repository.entity.GenericIdentification.mmExpiryDate, com.tools20022.repository.entity.GenericIdentification.mmScheme,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForSecuritiesCertificate, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForLot,
						com.tools20022.repository.entity.GenericIdentification.mmPartyRole, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForCashProceedsIncome,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedStatusReason, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForBankTransaction,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccountCostReferencePattern, com.tools20022.repository.entity.GenericIdentification.mmAccount,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedSystemIdentification, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInterestName,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedCashAccountService, com.tools20022.repository.entity.GenericIdentification.mmIdentificationForInvestmentFundClass,
						com.tools20022.repository.entity.GenericIdentification.mmIdentifiedLocation, com.tools20022.repository.entity.GenericIdentification.mmRelatedSecuritiesIdentification,
						com.tools20022.repository.entity.GenericIdentification.mmIdentifiedDocument, com.tools20022.repository.entity.GenericIdentification.mmRelatedPurchaseOrder,
						com.tools20022.repository.entity.GenericIdentification.mmRelatedCertificate);
				derivationComponent_lazy = () -> Arrays.asList(GenericIdentification1.mmObject(), GenericIdentification13.mmObject(), GenericIdentification4.mmObject(), SimpleIdentificationInformation4.mmObject(),
						GenericIdentification32.mmObject(), GenericIdentification48.mmObject(), GenericIdentification53.mmObject(), GenericIdentification71.mmObject(), GenericIdentification73.mmObject(), GenericIdentification74.mmObject(),
						GenericIdentification72.mmObject(), GenericIdentification75.mmObject(), GenericIdentification76.mmObject(), GenericIdentification77.mmObject(), GenericIdentification94.mmObject(), GenericIdentification90.mmObject(),
						GenericIdentification93.mmObject(), GenericIdentification92.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return GenericIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public List<ContactPoint> getIdentificationForContactPoint() {
		return identificationForContactPoint;
	}

	public void setIdentificationForContactPoint(List<com.tools20022.repository.entity.ContactPoint> identificationForContactPoint) {
		this.identificationForContactPoint = identificationForContactPoint;
	}

	public AccountIdentification getIdentificationForAccount() {
		return identificationForAccount;
	}

	public void setIdentificationForAccount(com.tools20022.repository.entity.AccountIdentification identificationForAccount) {
		this.identificationForAccount = identificationForAccount;
	}

	public PartyIdentificationInformation getRelatedPartyIdentification() {
		return relatedPartyIdentification;
	}

	public void setRelatedPartyIdentification(com.tools20022.repository.entity.PartyIdentificationInformation relatedPartyIdentification) {
		this.relatedPartyIdentification = relatedPartyIdentification;
	}

	public ISODate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
	}

	public ISODate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(com.tools20022.repository.entity.Scheme scheme) {
		this.scheme = scheme;
	}

	public SecuritiesCertificate getIdentificationForSecuritiesCertificate() {
		return identificationForSecuritiesCertificate;
	}

	public void setIdentificationForSecuritiesCertificate(com.tools20022.repository.entity.SecuritiesCertificate identificationForSecuritiesCertificate) {
		this.identificationForSecuritiesCertificate = identificationForSecuritiesCertificate;
	}

	public LotBreakdown getIdentificationForLot() {
		return identificationForLot;
	}

	public void setIdentificationForLot(com.tools20022.repository.entity.LotBreakdown identificationForLot) {
		this.identificationForLot = identificationForLot;
	}

	public List<InformationPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.InformationPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public CashProceedsDefinition getIdentificationForCashProceedsIncome() {
		return identificationForCashProceedsIncome;
	}

	public void setIdentificationForCashProceedsIncome(com.tools20022.repository.entity.CashProceedsDefinition identificationForCashProceedsIncome) {
		this.identificationForCashProceedsIncome = identificationForCashProceedsIncome;
	}

	public StatusReason getRelatedStatusReason() {
		return relatedStatusReason;
	}

	public void setRelatedStatusReason(com.tools20022.repository.entity.StatusReason relatedStatusReason) {
		this.relatedStatusReason = relatedStatusReason;
	}

	public List<BankTransaction> getIdentificationForBankTransaction() {
		return identificationForBankTransaction;
	}

	public void setIdentificationForBankTransaction(List<com.tools20022.repository.entity.BankTransaction> identificationForBankTransaction) {
		this.identificationForBankTransaction = identificationForBankTransaction;
	}

	public AccountIdentification getIdentificationForAccountCostReferencePattern() {
		return identificationForAccountCostReferencePattern;
	}

	public void setIdentificationForAccountCostReferencePattern(com.tools20022.repository.entity.AccountIdentification identificationForAccountCostReferencePattern) {
		this.identificationForAccountCostReferencePattern = identificationForAccountCostReferencePattern;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.entity.Account account) {
		this.account = account;
	}

	public SystemIdentification getRelatedSystemIdentification() {
		return relatedSystemIdentification;
	}

	public void setRelatedSystemIdentification(com.tools20022.repository.entity.SystemIdentification relatedSystemIdentification) {
		this.relatedSystemIdentification = relatedSystemIdentification;
	}

	public Interest getIdentificationForInterestName() {
		return identificationForInterestName;
	}

	public void setIdentificationForInterestName(com.tools20022.repository.entity.Interest identificationForInterestName) {
		this.identificationForInterestName = identificationForInterestName;
	}

	public CashAccountService getRelatedCashAccountService() {
		return relatedCashAccountService;
	}

	public void setRelatedCashAccountService(com.tools20022.repository.entity.CashAccountService relatedCashAccountService) {
		this.relatedCashAccountService = relatedCashAccountService;
	}

	public InvestmentFundClass getIdentificationForInvestmentFundClass() {
		return identificationForInvestmentFundClass;
	}

	public void setIdentificationForInvestmentFundClass(com.tools20022.repository.entity.InvestmentFundClass identificationForInvestmentFundClass) {
		this.identificationForInvestmentFundClass = identificationForInvestmentFundClass;
	}

	public Location getIdentifiedLocation() {
		return identifiedLocation;
	}

	public void setIdentifiedLocation(com.tools20022.repository.entity.Location identifiedLocation) {
		this.identifiedLocation = identifiedLocation;
	}

	public SecuritiesIdentification getRelatedSecuritiesIdentification() {
		return relatedSecuritiesIdentification;
	}

	public void setRelatedSecuritiesIdentification(com.tools20022.repository.entity.SecuritiesIdentification relatedSecuritiesIdentification) {
		this.relatedSecuritiesIdentification = relatedSecuritiesIdentification;
	}

	public Document getIdentifiedDocument() {
		return identifiedDocument;
	}

	public void setIdentifiedDocument(com.tools20022.repository.entity.Document identifiedDocument) {
		this.identifiedDocument = identifiedDocument;
	}

	public PurchaseOrder getRelatedPurchaseOrder() {
		return relatedPurchaseOrder;
	}

	public void setRelatedPurchaseOrder(com.tools20022.repository.entity.PurchaseOrder relatedPurchaseOrder) {
		this.relatedPurchaseOrder = relatedPurchaseOrder;
	}

	public RegisteredContract getRelatedCertificate() {
		return relatedCertificate;
	}

	public void setRelatedCertificate(com.tools20022.repository.entity.RegisteredContract relatedCertificate) {
		this.relatedCertificate = relatedCertificate;
	}
}