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
import com.tools20022.repository.codeset.CopyDuplicateCode;
import com.tools20022.repository.codeset.DataSetTypeCode;
import com.tools20022.repository.codeset.DocumentTypeCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * General information that unambiguously identifies a document, such as
 * identification number and issue date time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Document" src="doc-files/Document.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmIssueDate
 * Document.mmIssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmCopyDuplicate
 * Document.mmCopyDuplicate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPlaceOfStorage
 * Document.mmPlaceOfStorage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmPaymentObligation
 * Document.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmType
 * Document.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmAmount
 * Document.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmAgreement
 * Document.mmAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPlaceOfIssue
 * Document.mmPlaceOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmDocumentVersion
 * Document.mmDocumentVersion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmStatus
 * Document.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmReconciliation
 * Document.mmReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmLetterOfCredit
 * Document.mmLetterOfCredit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPartyRole
 * Document.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmDataSetType
 * Document.mmDataSetType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmTransport
 * Document.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmSignedIndicator
 * Document.mmSignedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmRemittedAmount
 * Document.mmRemittedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmGuarantee
 * Document.mmGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmLanguage
 * Document.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPurpose
 * Document.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
 * Document.mmDocumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmEvidence
 * Document.mmEvidence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmCommercialTrade
 * Document.mmCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPresentation
 * Document.mmPresentation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmRelatedContract
 * Document.mmRelatedContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
 * GenericIdentification.mmIdentifiedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmStoredDocument
 * ContactPoint.mmStoredDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIssuedDocument
 * Location.mmIssuedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmDocument
 * Agreement.mmDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DocumentPartyRole#mmDocument
 * DocumentPartyRole.mmDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
 * PaymentObligation.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedDocument
 * Presentation.mmPresentedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmDocuments
 * CommercialTrade.mmDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportDocuments
 * Transport.mmTransportDocuments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LetterOfCredit#mmDocument
 * LetterOfCredit.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmDocument
 * Guarantee.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmDocument
 * Reconciliation.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Evidence#mmRelatedDocument
 * Evidence.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
 * RegisteredContract.mmAttachment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmAdditionalReferenceDocument
 * TradeAgreement13.mmAdditionalReferenceDocument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PrivateCertificate
 * PrivateCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InsuranceCertificate
 * InsuranceCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecurityCertificate
 * SecurityCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeCertificate
 * TradeCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment Assessment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliveryNote DeliveryNote}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification22
 * DocumentIdentification22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2
 * DocumentGeneralInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification23
 * DocumentIdentification23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2 InvoiceHeader2}</li>
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
 * "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General information that unambiguously identifies a document, such as identification number and issue date time."
 * </li>
 * </ul>
 */
public class Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime issueDate;
	/**
	 * Issue date of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22#mmDateOfIssue
	 * DocumentIdentification22.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmIssueDate
	 * DocumentGeneralInformation2.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification23#mmDateOfIssue
	 * DocumentIdentification23.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIssueDateTime
	 * InvoiceHeader2.mmIssueDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue date of the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIssueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentIdentification22.mmDateOfIssue, DocumentGeneralInformation2.mmIssueDate, DocumentIdentification23.mmDateOfIssue, InvoiceHeader2.mmIssueDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getIssueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CopyDuplicateCode copyDuplicate;
	/**
	 * Specifies if this document is a copy, a duplicate, or a duplicate of a
	 * copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
	 * CopyDuplicateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if this document is a copy, a duplicate, or a duplicate of a copy."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCopyDuplicate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CopyDuplicate";
			definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CopyDuplicateCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getCopyDuplicate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> placeOfStorage;
	/**
	 * Specifies where the document is stored.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmStoredDocument
	 * ContactPoint.mmStoredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfStorage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies where the document is stored."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfStorage = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfStorage";
			definition = "Specifies where the document is stored.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmStoredDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected PaymentObligation paymentObligation;
	/**
	 * Document which is referred to in a payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document which is referred to in a payment obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Document which is referred to in a payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmAssociatedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected DocumentTypeCode type;
	/**
	 * Specifies the type of the document, for example commercial invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmDocumentType
	 * DocumentGeneralInformation2.mmDocumentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmTypeCode
	 * InvoiceHeader2.mmTypeCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the document, for example commercial invoice."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentGeneralInformation2.mmDocumentType, InvoiceHeader2.mmTypeCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the document, for example commercial invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DocumentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount amount;
	/**
	 * Amount of money and currency of a document. <br>
	 * The amount can be either the original amount due and payable for instance
	 * the ordered amount, or the amount actually remitted for the referred
	 * document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Agreement> agreement;
	/**
	 * Agreement which is materialised by a document
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDocument
	 * Agreement.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Agreement Agreement}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement which is materialised by a document"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agreement";
			definition = "Agreement which is materialised by a document";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
		}
	};
	protected Location placeOfIssue;
	/**
	 * Place where the document was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmIssuedDocument
	 * Location.mmIssuedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the document was issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfIssue = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfIssue";
			definition = "Place where the document was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmIssuedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Number documentVersion;
	/**
	 * Unambiguous identification of the version of a document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of the version of a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDocumentVersion = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentVersion";
			definition = "Unambiguous identification of the version of a document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getDocumentVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text status;
	/**
	 * Status of the document (eg delivered, paid, etc.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the document (eg delivered, paid, etc.)"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the document (eg delivered, paid, etc.)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Reconciliation> reconciliation;
	/**
	 * Reconciliation process for which a document is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmDocument
	 * Reconciliation.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reconciliation process for which a document is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process for which a document is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};
	protected LetterOfCredit letterOfCredit;
	/**
	 * Written undertaking by a bank to honour a demand for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#mmDocument
	 * LetterOfCredit.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LetterOfCredit
	 * LetterOfCredit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Written undertaking by a bank to honour a demand for payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLetterOfCredit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Written undertaking by a bank to honour a demand for payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DocumentPartyRole> partyRole;
	/**
	 * Role played by a party in the context of a document or in the context of
	 * the business linked to the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DocumentPartyRole#mmDocument
	 * DocumentPartyRole.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DocumentPartyRole
	 * DocumentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of a document or in the context of the business linked to the document."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of a document or in the context of the business linked to the document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DocumentPartyRole.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DocumentPartyRole.mmObject();
		}
	};
	protected DataSetTypeCode dataSetType;
	/**
	 * Specifies the type of data set in which the document is included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode
	 * DataSetTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of data set in which the document is included."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDataSetType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataSetType";
			definition = "Specifies the type of data set in which the document is included.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getDataSetType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Transport transport;
	/**
	 * Transport process for which related documents are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportDocuments
	 * Transport.mmTransportDocuments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport process for which related documents are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Transport process for which related documents are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmTransportDocuments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	protected YesNoIndicator signedIndicator;
	/**
	 * Indication whether the document must be signed or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication whether the document must be signed or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSignedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignedIndicator";
			definition = "Indication whether the document must be signed or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getSignedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount remittedAmount;
	/**
	 * Amount of money remitted for the referred document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money remitted for the referred document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRemittedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getRemittedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Guarantee> guarantee;
	/**
	 * Guarantee that is described in a document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmDocument
	 * Guarantee.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Guarantee Guarantee}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee that is described in a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGuarantee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee that is described in a document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
		}
	};
	protected LanguageCode language;
	/**
	 * Language used for textual information in the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmLanguageCode
	 * InvoiceHeader2.mmLanguageCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language used for textual information in the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLanguage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceHeader2.mmLanguageCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language used for textual information in the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getLanguage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text purpose;
	/**
	 * Specifies the function of the document.
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmDocumentPurpose
	 * InvoiceHeader2.mmDocumentPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the function of the document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceHeader2.mmDocumentPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the function of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Document.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GenericIdentification documentIdentification;
	/**
	 * Identification of a document for instance unique identification of the
	 * purchase order, assigned by the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
	 * GenericIdentification.mmIdentifiedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmName
	 * InvoiceHeader2.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a document for instance unique identification of the purchase order, assigned by the buyer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDocumentIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceHeader2.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentIdentification";
			definition = "Identification of a document for instance unique identification of the purchase order, assigned by the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentifiedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Evidence> evidence;
	/**
	 * Proof of evidence which uses a document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Evidence#mmRelatedDocument
	 * Evidence.mmRelatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Evidence Evidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Evidence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proof of evidence which uses a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEvidence = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Evidence";
			definition = "Proof of evidence which uses a document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Evidence.mmRelatedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Evidence.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CommercialTrade> commercialTrade;
	/**
	 * Trade for which a certificare is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmDocuments
	 * CommercialTrade.mmDocuments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which a certificare is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Trade for which a certificare is issued.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmDocuments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};
	protected Presentation presentation;
	/**
	 * Presentation of documents and statements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedDocument
	 * Presentation.mmPresentedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Presentation
	 * Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Presentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation of documents and statements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPresentation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Presentation";
			definition = "Presentation of documents and statements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Presentation.mmPresentedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
		}
	};
	protected RegisteredContract relatedContract;
	/**
	 * Related document which materialises the agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
	 * RegisteredContract.mmAttachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related document which materialises the agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedContract";
			definition = "Related document which materialises the agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmAttachment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Document";
				definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentifiedDocument, com.tools20022.repository.entity.ContactPoint.mmStoredDocument,
						com.tools20022.repository.entity.Location.mmIssuedDocument, com.tools20022.repository.entity.Agreement.mmDocument, com.tools20022.repository.entity.DocumentPartyRole.mmDocument,
						com.tools20022.repository.entity.PaymentObligation.mmAssociatedDocument, com.tools20022.repository.entity.Presentation.mmPresentedDocument, com.tools20022.repository.entity.CommercialTrade.mmDocuments,
						com.tools20022.repository.entity.Transport.mmTransportDocuments, com.tools20022.repository.entity.LetterOfCredit.mmDocument, com.tools20022.repository.entity.Guarantee.mmDocument,
						com.tools20022.repository.entity.Reconciliation.mmDocument, com.tools20022.repository.entity.Evidence.mmRelatedDocument, com.tools20022.repository.entity.RegisteredContract.mmAttachment);
				derivationElement_lazy = () -> Arrays.asList(TradeAgreement13.mmAdditionalReferenceDocument);
				subType_lazy = () -> Arrays.asList(PrivateCertificate.mmObject(), InsuranceCertificate.mmObject(), SecurityCertificate.mmObject(), TradeCertificate.mmObject(), Assessment.mmObject(), DeliveryNote.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Document.mmIssueDate, com.tools20022.repository.entity.Document.mmCopyDuplicate, com.tools20022.repository.entity.Document.mmPlaceOfStorage,
						com.tools20022.repository.entity.Document.mmPaymentObligation, com.tools20022.repository.entity.Document.mmType, com.tools20022.repository.entity.Document.mmAmount,
						com.tools20022.repository.entity.Document.mmAgreement, com.tools20022.repository.entity.Document.mmPlaceOfIssue, com.tools20022.repository.entity.Document.mmDocumentVersion,
						com.tools20022.repository.entity.Document.mmStatus, com.tools20022.repository.entity.Document.mmReconciliation, com.tools20022.repository.entity.Document.mmLetterOfCredit,
						com.tools20022.repository.entity.Document.mmPartyRole, com.tools20022.repository.entity.Document.mmDataSetType, com.tools20022.repository.entity.Document.mmTransport,
						com.tools20022.repository.entity.Document.mmSignedIndicator, com.tools20022.repository.entity.Document.mmRemittedAmount, com.tools20022.repository.entity.Document.mmGuarantee,
						com.tools20022.repository.entity.Document.mmLanguage, com.tools20022.repository.entity.Document.mmPurpose, com.tools20022.repository.entity.Document.mmDocumentIdentification,
						com.tools20022.repository.entity.Document.mmEvidence, com.tools20022.repository.entity.Document.mmCommercialTrade, com.tools20022.repository.entity.Document.mmPresentation,
						com.tools20022.repository.entity.Document.mmRelatedContract);
				derivationComponent_lazy = () -> Arrays.asList(DocumentIdentification22.mmObject(), DocumentGeneralInformation2.mmObject(), DocumentIdentification23.mmObject(), InvoiceHeader2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Document.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(ISODateTime issueDate) {
		this.issueDate = issueDate;
	}

	public CopyDuplicateCode getCopyDuplicate() {
		return copyDuplicate;
	}

	public void setCopyDuplicate(CopyDuplicateCode copyDuplicate) {
		this.copyDuplicate = copyDuplicate;
	}

	public List<ContactPoint> getPlaceOfStorage() {
		return placeOfStorage;
	}

	public void setPlaceOfStorage(List<com.tools20022.repository.entity.ContactPoint> placeOfStorage) {
		this.placeOfStorage = placeOfStorage;
	}

	public PaymentObligation getPaymentObligation() {
		return paymentObligation;
	}

	public void setPaymentObligation(com.tools20022.repository.entity.PaymentObligation paymentObligation) {
		this.paymentObligation = paymentObligation;
	}

	public DocumentTypeCode getType() {
		return type;
	}

	public void setType(DocumentTypeCode type) {
		this.type = type;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = amount;
	}

	public List<Agreement> getAgreement() {
		return agreement;
	}

	public void setAgreement(List<com.tools20022.repository.entity.Agreement> agreement) {
		this.agreement = agreement;
	}

	public Location getPlaceOfIssue() {
		return placeOfIssue;
	}

	public void setPlaceOfIssue(com.tools20022.repository.entity.Location placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

	public Number getDocumentVersion() {
		return documentVersion;
	}

	public void setDocumentVersion(Number documentVersion) {
		this.documentVersion = documentVersion;
	}

	public Max140Text getStatus() {
		return status;
	}

	public void setStatus(Max140Text status) {
		this.status = status;
	}

	public List<Reconciliation> getReconciliation() {
		return reconciliation;
	}

	public void setReconciliation(List<com.tools20022.repository.entity.Reconciliation> reconciliation) {
		this.reconciliation = reconciliation;
	}

	public LetterOfCredit getLetterOfCredit() {
		return letterOfCredit;
	}

	public void setLetterOfCredit(com.tools20022.repository.entity.LetterOfCredit letterOfCredit) {
		this.letterOfCredit = letterOfCredit;
	}

	public List<DocumentPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.DocumentPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public DataSetTypeCode getDataSetType() {
		return dataSetType;
	}

	public void setDataSetType(DataSetTypeCode dataSetType) {
		this.dataSetType = dataSetType;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(com.tools20022.repository.entity.Transport transport) {
		this.transport = transport;
	}

	public YesNoIndicator getSignedIndicator() {
		return signedIndicator;
	}

	public void setSignedIndicator(YesNoIndicator signedIndicator) {
		this.signedIndicator = signedIndicator;
	}

	public CurrencyAndAmount getRemittedAmount() {
		return remittedAmount;
	}

	public void setRemittedAmount(CurrencyAndAmount remittedAmount) {
		this.remittedAmount = remittedAmount;
	}

	public List<Guarantee> getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(List<com.tools20022.repository.entity.Guarantee> guarantee) {
		this.guarantee = guarantee;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public void setLanguage(LanguageCode language) {
		this.language = language;
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max35Text purpose) {
		this.purpose = purpose;
	}

	public GenericIdentification getDocumentIdentification() {
		return documentIdentification;
	}

	public void setDocumentIdentification(com.tools20022.repository.entity.GenericIdentification documentIdentification) {
		this.documentIdentification = documentIdentification;
	}

	public List<Evidence> getEvidence() {
		return evidence;
	}

	public void setEvidence(List<com.tools20022.repository.entity.Evidence> evidence) {
		this.evidence = evidence;
	}

	public List<CommercialTrade> getCommercialTrade() {
		return commercialTrade;
	}

	public void setCommercialTrade(List<com.tools20022.repository.entity.CommercialTrade> commercialTrade) {
		this.commercialTrade = commercialTrade;
	}

	public Presentation getPresentation() {
		return presentation;
	}

	public void setPresentation(com.tools20022.repository.entity.Presentation presentation) {
		this.presentation = presentation;
	}

	public RegisteredContract getRelatedContract() {
		return relatedContract;
	}

	public void setRelatedContract(com.tools20022.repository.entity.RegisteredContract relatedContract) {
		this.relatedContract = relatedContract;
	}
}