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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Document, ISODateTime> mmIssueDate = new MMBusinessAttribute<Document, ISODateTime>() {
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

		@Override
		public ISODateTime getValue(Document obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(Document obj, ISODateTime value) {
			obj.setIssueDate(value);
		}
	};
	protected CopyDuplicateCode copyDuplicate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Document, CopyDuplicateCode> mmCopyDuplicate = new MMBusinessAttribute<Document, CopyDuplicateCode>() {
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

		@Override
		public CopyDuplicateCode getValue(Document obj) {
			return obj.getCopyDuplicate();
		}

		@Override
		public void setValue(Document obj, CopyDuplicateCode value) {
			obj.setCopyDuplicate(value);
		}
	};
	protected List<ContactPoint> placeOfStorage;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, List<ContactPoint>> mmPlaceOfStorage = new MMBusinessAssociationEnd<Document, List<ContactPoint>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfStorage";
			definition = "Specifies where the document is stored.";
			minOccurs = 0;
			opposite_lazy = () -> ContactPoint.mmStoredDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(Document obj) {
			return obj.getPlaceOfStorage();
		}

		@Override
		public void setValue(Document obj, List<ContactPoint> value) {
			obj.setPlaceOfStorage(value);
		}
	};
	protected PaymentObligation paymentObligation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, Optional<PaymentObligation>> mmPaymentObligation = new MMBusinessAssociationEnd<Document, Optional<PaymentObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Document which is referred to in a payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentObligation.mmAssociatedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}

		@Override
		public Optional<PaymentObligation> getValue(Document obj) {
			return obj.getPaymentObligation();
		}

		@Override
		public void setValue(Document obj, Optional<PaymentObligation> value) {
			obj.setPaymentObligation(value.orElse(null));
		}
	};
	protected DocumentTypeCode type;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Document, DocumentTypeCode> mmType = new MMBusinessAttribute<Document, DocumentTypeCode>() {
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

		@Override
		public DocumentTypeCode getValue(Document obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Document obj, DocumentTypeCode value) {
			obj.setType(value);
		}
	};
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Document, ActiveCurrencyAndAmount> mmAmount = new MMBusinessAttribute<Document, ActiveCurrencyAndAmount>() {
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

		@Override
		public ActiveCurrencyAndAmount getValue(Document obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Document obj, ActiveCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected List<Agreement> agreement;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, List<Agreement>> mmAgreement = new MMBusinessAssociationEnd<Document, List<Agreement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agreement";
			definition = "Agreement which is materialised by a document";
			minOccurs = 0;
			opposite_lazy = () -> Agreement.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Agreement.mmObject();
		}

		@Override
		public List<Agreement> getValue(Document obj) {
			return obj.getAgreement();
		}

		@Override
		public void setValue(Document obj, List<Agreement> value) {
			obj.setAgreement(value);
		}
	};
	protected Location placeOfIssue;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, Optional<Location>> mmPlaceOfIssue = new MMBusinessAssociationEnd<Document, Optional<Location>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfIssue";
			definition = "Place where the document was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Location.mmIssuedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}

		@Override
		public Optional<Location> getValue(Document obj) {
			return obj.getPlaceOfIssue();
		}

		@Override
		public void setValue(Document obj, Optional<Location> value) {
			obj.setPlaceOfIssue(value.orElse(null));
		}
	};
	protected Number documentVersion;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Document, Number> mmDocumentVersion = new MMBusinessAttribute<Document, Number>() {
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

		@Override
		public Number getValue(Document obj) {
			return obj.getDocumentVersion();
		}

		@Override
		public void setValue(Document obj, Number value) {
			obj.setDocumentVersion(value);
		}
	};
	protected Max140Text status;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Document, Max140Text> mmStatus = new MMBusinessAttribute<Document, Max140Text>() {
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

		@Override
		public Max140Text getValue(Document obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(Document obj, Max140Text value) {
			obj.setStatus(value);
		}
	};
	protected List<Reconciliation> reconciliation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, List<Reconciliation>> mmReconciliation = new MMBusinessAssociationEnd<Document, List<Reconciliation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process for which a document is specified.";
			minOccurs = 0;
			opposite_lazy = () -> Reconciliation.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Reconciliation.mmObject();
		}

		@Override
		public List<Reconciliation> getValue(Document obj) {
			return obj.getReconciliation();
		}

		@Override
		public void setValue(Document obj, List<Reconciliation> value) {
			obj.setReconciliation(value);
		}
	};
	protected LetterOfCredit letterOfCredit;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, LetterOfCredit> mmLetterOfCredit = new MMBusinessAssociationEnd<Document, LetterOfCredit>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Written undertaking by a bank to honour a demand for payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> LetterOfCredit.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LetterOfCredit.mmObject();
		}

		@Override
		public LetterOfCredit getValue(Document obj) {
			return obj.getLetterOfCredit();
		}

		@Override
		public void setValue(Document obj, LetterOfCredit value) {
			obj.setLetterOfCredit(value);
		}
	};
	protected List<DocumentPartyRole> partyRole;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, List<DocumentPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<Document, List<DocumentPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of a document or in the context of the business linked to the document.";
			minOccurs = 0;
			opposite_lazy = () -> DocumentPartyRole.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DocumentPartyRole.mmObject();
		}

		@Override
		public List<DocumentPartyRole> getValue(Document obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Document obj, List<DocumentPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected DataSetTypeCode dataSetType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Document, DataSetTypeCode> mmDataSetType = new MMBusinessAttribute<Document, DataSetTypeCode>() {
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

		@Override
		public DataSetTypeCode getValue(Document obj) {
			return obj.getDataSetType();
		}

		@Override
		public void setValue(Document obj, DataSetTypeCode value) {
			obj.setDataSetType(value);
		}
	};
	protected Transport transport;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, Transport> mmTransport = new MMBusinessAssociationEnd<Document, Transport>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Transport process for which related documents are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Transport.mmTransportDocuments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Transport.mmObject();
		}

		@Override
		public Transport getValue(Document obj) {
			return obj.getTransport();
		}

		@Override
		public void setValue(Document obj, Transport value) {
			obj.setTransport(value);
		}
	};
	protected YesNoIndicator signedIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Document, YesNoIndicator> mmSignedIndicator = new MMBusinessAttribute<Document, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(Document obj) {
			return obj.getSignedIndicator();
		}

		@Override
		public void setValue(Document obj, YesNoIndicator value) {
			obj.setSignedIndicator(value);
		}
	};
	protected CurrencyAndAmount remittedAmount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Document, CurrencyAndAmount> mmRemittedAmount = new MMBusinessAttribute<Document, CurrencyAndAmount>() {
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

		@Override
		public CurrencyAndAmount getValue(Document obj) {
			return obj.getRemittedAmount();
		}

		@Override
		public void setValue(Document obj, CurrencyAndAmount value) {
			obj.setRemittedAmount(value);
		}
	};
	protected List<Guarantee> guarantee;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, List<Guarantee>> mmGuarantee = new MMBusinessAssociationEnd<Document, List<Guarantee>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee that is described in a document.";
			minOccurs = 0;
			opposite_lazy = () -> Guarantee.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Guarantee.mmObject();
		}

		@Override
		public List<Guarantee> getValue(Document obj) {
			return obj.getGuarantee();
		}

		@Override
		public void setValue(Document obj, List<Guarantee> value) {
			obj.setGuarantee(value);
		}
	};
	protected LanguageCode language;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Document, LanguageCode> mmLanguage = new MMBusinessAttribute<Document, LanguageCode>() {
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

		@Override
		public LanguageCode getValue(Document obj) {
			return obj.getLanguage();
		}

		@Override
		public void setValue(Document obj, LanguageCode value) {
			obj.setLanguage(value);
		}
	};
	protected Max35Text purpose;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Document, Max35Text> mmPurpose = new MMBusinessAttribute<Document, Max35Text>() {
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

		@Override
		public Max35Text getValue(Document obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(Document obj, Max35Text value) {
			obj.setPurpose(value);
		}
	};
	protected GenericIdentification documentIdentification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, GenericIdentification> mmDocumentIdentification = new MMBusinessAssociationEnd<Document, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceHeader2.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentIdentification";
			definition = "Identification of a document for instance unique identification of the purchase order, assigned by the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmIdentifiedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(Document obj) {
			return obj.getDocumentIdentification();
		}

		@Override
		public void setValue(Document obj, GenericIdentification value) {
			obj.setDocumentIdentification(value);
		}
	};
	protected List<Evidence> evidence;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, List<Evidence>> mmEvidence = new MMBusinessAssociationEnd<Document, List<Evidence>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Evidence";
			definition = "Proof of evidence which uses a document.";
			minOccurs = 0;
			opposite_lazy = () -> Evidence.mmRelatedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Evidence.mmObject();
		}

		@Override
		public List<Evidence> getValue(Document obj) {
			return obj.getEvidence();
		}

		@Override
		public void setValue(Document obj, List<Evidence> value) {
			obj.setEvidence(value);
		}
	};
	protected List<CommercialTrade> commercialTrade;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, List<CommercialTrade>> mmCommercialTrade = new MMBusinessAssociationEnd<Document, List<CommercialTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Trade for which a certificare is issued.";
			minOccurs = 0;
			opposite_lazy = () -> CommercialTrade.mmDocuments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CommercialTrade.mmObject();
		}

		@Override
		public List<CommercialTrade> getValue(Document obj) {
			return obj.getCommercialTrade();
		}

		@Override
		public void setValue(Document obj, List<CommercialTrade> value) {
			obj.setCommercialTrade(value);
		}
	};
	protected Presentation presentation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, Optional<Presentation>> mmPresentation = new MMBusinessAssociationEnd<Document, Optional<Presentation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Presentation";
			definition = "Presentation of documents and statements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Presentation.mmPresentedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Presentation.mmObject();
		}

		@Override
		public Optional<Presentation> getValue(Document obj) {
			return obj.getPresentation();
		}

		@Override
		public void setValue(Document obj, Optional<Presentation> value) {
			obj.setPresentation(value.orElse(null));
		}
	};
	protected RegisteredContract relatedContract;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Document, RegisteredContract> mmRelatedContract = new MMBusinessAssociationEnd<Document, RegisteredContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedContract";
			definition = "Related document which materialises the agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegisteredContract.mmAttachment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}

		@Override
		public RegisteredContract getValue(Document obj) {
			return obj.getRelatedContract();
		}

		@Override
		public void setValue(Document obj, RegisteredContract value) {
			obj.setRelatedContract(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Document";
				definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmIdentifiedDocument, ContactPoint.mmStoredDocument, Location.mmIssuedDocument, Agreement.mmDocument, DocumentPartyRole.mmDocument,
						PaymentObligation.mmAssociatedDocument, Presentation.mmPresentedDocument, CommercialTrade.mmDocuments, Transport.mmTransportDocuments, LetterOfCredit.mmDocument, Guarantee.mmDocument, Reconciliation.mmDocument,
						Evidence.mmRelatedDocument, RegisteredContract.mmAttachment);
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

	public Document setIssueDate(ISODateTime issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public CopyDuplicateCode getCopyDuplicate() {
		return copyDuplicate;
	}

	public Document setCopyDuplicate(CopyDuplicateCode copyDuplicate) {
		this.copyDuplicate = Objects.requireNonNull(copyDuplicate);
		return this;
	}

	public List<ContactPoint> getPlaceOfStorage() {
		return placeOfStorage == null ? placeOfStorage = new ArrayList<>() : placeOfStorage;
	}

	public Document setPlaceOfStorage(List<ContactPoint> placeOfStorage) {
		this.placeOfStorage = Objects.requireNonNull(placeOfStorage);
		return this;
	}

	public Optional<PaymentObligation> getPaymentObligation() {
		return paymentObligation == null ? Optional.empty() : Optional.of(paymentObligation);
	}

	public Document setPaymentObligation(PaymentObligation paymentObligation) {
		this.paymentObligation = paymentObligation;
		return this;
	}

	public DocumentTypeCode getType() {
		return type;
	}

	public Document setType(DocumentTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public Document setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public List<Agreement> getAgreement() {
		return agreement == null ? agreement = new ArrayList<>() : agreement;
	}

	public Document setAgreement(List<Agreement> agreement) {
		this.agreement = Objects.requireNonNull(agreement);
		return this;
	}

	public Optional<Location> getPlaceOfIssue() {
		return placeOfIssue == null ? Optional.empty() : Optional.of(placeOfIssue);
	}

	public Document setPlaceOfIssue(Location placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
		return this;
	}

	public Number getDocumentVersion() {
		return documentVersion;
	}

	public Document setDocumentVersion(Number documentVersion) {
		this.documentVersion = Objects.requireNonNull(documentVersion);
		return this;
	}

	public Max140Text getStatus() {
		return status;
	}

	public Document setStatus(Max140Text status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<Reconciliation> getReconciliation() {
		return reconciliation == null ? reconciliation = new ArrayList<>() : reconciliation;
	}

	public Document setReconciliation(List<Reconciliation> reconciliation) {
		this.reconciliation = Objects.requireNonNull(reconciliation);
		return this;
	}

	public LetterOfCredit getLetterOfCredit() {
		return letterOfCredit;
	}

	public Document setLetterOfCredit(LetterOfCredit letterOfCredit) {
		this.letterOfCredit = Objects.requireNonNull(letterOfCredit);
		return this;
	}

	public List<DocumentPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Document setPartyRole(List<DocumentPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public DataSetTypeCode getDataSetType() {
		return dataSetType;
	}

	public Document setDataSetType(DataSetTypeCode dataSetType) {
		this.dataSetType = Objects.requireNonNull(dataSetType);
		return this;
	}

	public Transport getTransport() {
		return transport;
	}

	public Document setTransport(Transport transport) {
		this.transport = Objects.requireNonNull(transport);
		return this;
	}

	public YesNoIndicator getSignedIndicator() {
		return signedIndicator;
	}

	public Document setSignedIndicator(YesNoIndicator signedIndicator) {
		this.signedIndicator = Objects.requireNonNull(signedIndicator);
		return this;
	}

	public CurrencyAndAmount getRemittedAmount() {
		return remittedAmount;
	}

	public Document setRemittedAmount(CurrencyAndAmount remittedAmount) {
		this.remittedAmount = Objects.requireNonNull(remittedAmount);
		return this;
	}

	public List<Guarantee> getGuarantee() {
		return guarantee == null ? guarantee = new ArrayList<>() : guarantee;
	}

	public Document setGuarantee(List<Guarantee> guarantee) {
		this.guarantee = Objects.requireNonNull(guarantee);
		return this;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public Document setLanguage(LanguageCode language) {
		this.language = Objects.requireNonNull(language);
		return this;
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public Document setPurpose(Max35Text purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public GenericIdentification getDocumentIdentification() {
		return documentIdentification;
	}

	public Document setDocumentIdentification(GenericIdentification documentIdentification) {
		this.documentIdentification = Objects.requireNonNull(documentIdentification);
		return this;
	}

	public List<Evidence> getEvidence() {
		return evidence == null ? evidence = new ArrayList<>() : evidence;
	}

	public Document setEvidence(List<Evidence> evidence) {
		this.evidence = Objects.requireNonNull(evidence);
		return this;
	}

	public List<CommercialTrade> getCommercialTrade() {
		return commercialTrade == null ? commercialTrade = new ArrayList<>() : commercialTrade;
	}

	public Document setCommercialTrade(List<CommercialTrade> commercialTrade) {
		this.commercialTrade = Objects.requireNonNull(commercialTrade);
		return this;
	}

	public Optional<Presentation> getPresentation() {
		return presentation == null ? Optional.empty() : Optional.of(presentation);
	}

	public Document setPresentation(Presentation presentation) {
		this.presentation = presentation;
		return this;
	}

	public RegisteredContract getRelatedContract() {
		return relatedContract;
	}

	public Document setRelatedContract(RegisteredContract relatedContract) {
		this.relatedContract = Objects.requireNonNull(relatedContract);
		return this;
	}
}