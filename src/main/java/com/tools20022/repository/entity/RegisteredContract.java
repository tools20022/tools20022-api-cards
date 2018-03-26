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
import com.tools20022.repository.codeset.CommunicationMethodCode;
import com.tools20022.repository.codeset.PriorityCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Contract registered for regulatory purpose by a registration agent for the
 * journaling of payments made against the contract.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RegisteredContract" src="doc-files/RegisteredContract.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmCertificate
 * RegisteredContract.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmContractBalance
 * RegisteredContract.mmContractBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmReportingParty
 * RegisteredContract.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmIdentification
 * RegisteredContract.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmDeliveryDate
 * RegisteredContract.mmDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRegistrationAgent
 * RegisteredContract.mmRegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmReceivingParty
 * RegisteredContract.mmReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmPriority
 * RegisteredContract.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRegistrationDate
 * RegisteredContract.mmRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmClosureReason
 * RegisteredContract.mmClosureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmClosureDate
 * RegisteredContract.mmClosureDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmPaymentScheduleType
 * RegisteredContract.mmPaymentScheduleType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmSubmissionDate
 * RegisteredContract.mmSubmissionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmSendingParty
 * RegisteredContract.mmSendingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmDeliveryMethod
 * RegisteredContract.mmDeliveryMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmSubmissionMethod
 * RegisteredContract.mmSubmissionMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRelatedPayment
 * RegisteredContract.mmRelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
 * RegisteredContract.mmAttachment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCertificate
 * GenericIdentification.mmRelatedCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmRelatedContract
 * Document.mmRelatedContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmContractRegistration
 * Payment.mmContractRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRelatedClosureReason
 * StatusReason.mmRelatedClosureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#mmRelatedRegisteredContract
 * CashBalance.mmRelatedRegisteredContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedPaymentScheduleType
 * PaymentTerms.mmRelatedPaymentScheduleType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedReportingParty
 * RegulatoryReportingRole.mmRelatedReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedRegistrationAgent
 * RegulatoryReportingRole.mmRelatedRegistrationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedReceivingParty
 * RegulatoryReportingRole.mmRelatedReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedSendingParty
 * RegulatoryReportingRole.mmRelatedSendingParty}</li>
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
 * "RegisteredContract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contract registered for regulatory purpose by a registration agent for the journaling of payments made against the contract."
 * </li>
 * </ul>
 */
public class RegisteredContract extends Contract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification certificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCertificate
	 * GenericIdentification.mmRelatedCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate against which all transactions in the scope of the regulatory requirements are registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegisteredContract, GenericIdentification> mmCertificate = new MMBusinessAssociationEnd<RegisteredContract, GenericIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Certificate";
			definition = "Certificate against which all transactions in the scope of the regulatory requirements are registered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmRelatedCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(RegisteredContract obj) {
			return obj.getCertificate();
		}

		@Override
		public void setValue(RegisteredContract obj, GenericIdentification value) {
			obj.setCertificate(value);
		}
	};
	protected CashBalance contractBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmRelatedRegisteredContract
	 * CashBalance.mmRelatedRegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashBalance
	 * CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract balance on date of contract registration."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegisteredContract, CashBalance> mmContractBalance = new MMBusinessAssociationEnd<RegisteredContract, CashBalance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractBalance";
			definition = "Contract balance on date of contract registration.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashBalance.mmRelatedRegisteredContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashBalance.mmObject();
		}

		@Override
		public CashBalance getValue(RegisteredContract obj) {
			return obj.getContractBalance();
		}

		@Override
		public void setValue(RegisteredContract obj, CashBalance value) {
			obj.setContractBalance(value);
		}
	};
	protected RegulatoryReportingRole reportingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedReportingParty
	 * RegulatoryReportingRole.mmRelatedReportingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which must register the contract for regulatory reporting reasons."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegisteredContract, RegulatoryReportingRole> mmReportingParty = new MMBusinessAssociationEnd<RegisteredContract, RegulatoryReportingRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingParty";
			definition = "Party which must register the contract for regulatory reporting reasons.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegulatoryReportingRole.mmRelatedReportingParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
		}

		@Override
		public RegulatoryReportingRole getValue(RegisteredContract obj) {
			return obj.getReportingParty();
		}

		@Override
		public void setValue(RegisteredContract obj, RegulatoryReportingRole value) {
			obj.setReportingParty(value);
		}
	};
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RegisteredContract, Max35Text> mmIdentification = new MMBusinessAttribute<RegisteredContract, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(RegisteredContract obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(RegisteredContract obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected ISODate deliveryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the date for the delivery of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RegisteredContract, ISODate> mmDeliveryDate = new MMBusinessAttribute<RegisteredContract, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryDate";
			definition = "Provides the date for the delivery of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(RegisteredContract obj) {
			return obj.getDeliveryDate();
		}

		@Override
		public void setValue(RegisteredContract obj, ISODate value) {
			obj.setDeliveryDate(value);
		}
	};
	protected RegulatoryReportingRole registrationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedRegistrationAgent
	 * RegulatoryReportingRole.mmRelatedRegistrationAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent which is in charge of the registration of the contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegisteredContract, RegulatoryReportingRole> mmRegistrationAgent = new MMBusinessAssociationEnd<RegisteredContract, RegulatoryReportingRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationAgent";
			definition = "Agent which is in charge of the registration of the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegulatoryReportingRole.mmRelatedRegistrationAgent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
		}

		@Override
		public RegulatoryReportingRole getValue(RegisteredContract obj) {
			return obj.getRegistrationAgent();
		}

		@Override
		public void setValue(RegisteredContract obj, RegulatoryReportingRole value) {
			obj.setRegistrationAgent(value);
		}
	};
	protected RegulatoryReportingRole receivingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedReceivingParty
	 * RegulatoryReportingRole.mmRelatedReceivingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which receives support information about the registered contract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegisteredContract, RegulatoryReportingRole> mmReceivingParty = new MMBusinessAssociationEnd<RegisteredContract, RegulatoryReportingRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivingParty";
			definition = "Party which receives support information about the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegulatoryReportingRole.mmRelatedReceivingParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
		}

		@Override
		public RegulatoryReportingRole getValue(RegisteredContract obj) {
			return obj.getReceivingParty();
		}

		@Override
		public void setValue(RegisteredContract obj, RegulatoryReportingRole value) {
			obj.setReceivingParty(value);
		}
	};
	protected PriorityCode priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Priority requested for the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RegisteredContract, PriorityCode> mmPriority = new MMBusinessAttribute<RegisteredContract, PriorityCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Priority requested for the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}

		@Override
		public PriorityCode getValue(RegisteredContract obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(RegisteredContract obj, PriorityCode value) {
			obj.setPriority(value);
		}
	};
	protected ISODate registrationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the date for the registration of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RegisteredContract, ISODate> mmRegistrationDate = new MMBusinessAttribute<RegisteredContract, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDate";
			definition = "Provides the date for the registration of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(RegisteredContract obj) {
			return obj.getRegistrationDate();
		}

		@Override
		public void setValue(RegisteredContract obj, ISODate value) {
			obj.setRegistrationDate(value);
		}
	};
	protected StatusReason closureReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRelatedClosureReason
	 * StatusReason.mmRelatedClosureReason}</li>
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
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason of closure of the contract. "</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegisteredContract, StatusReason> mmClosureReason = new MMBusinessAssociationEnd<RegisteredContract, StatusReason>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosureReason";
			definition = "Reason of closure of the contract. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> StatusReason.mmRelatedClosureReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StatusReason.mmObject();
		}

		@Override
		public StatusReason getValue(RegisteredContract obj) {
			return obj.getClosureReason();
		}

		@Override
		public void setValue(RegisteredContract obj, StatusReason value) {
			obj.setClosureReason(value);
		}
	};
	protected ISODate closureDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of closure of the contract. "</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RegisteredContract, ISODate> mmClosureDate = new MMBusinessAttribute<RegisteredContract, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosureDate";
			definition = "Date of closure of the contract. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(RegisteredContract obj) {
			return obj.getClosureDate();
		}

		@Override
		public void setValue(RegisteredContract obj, ISODate value) {
			obj.setClosureDate(value);
		}
	};
	protected PaymentTerms paymentScheduleType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedPaymentScheduleType
	 * PaymentTerms.mmRelatedPaymentScheduleType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentTerms
	 * PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentScheduleType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the payment schedule provided in the contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegisteredContract, PaymentTerms> mmPaymentScheduleType = new MMBusinessAssociationEnd<RegisteredContract, PaymentTerms>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentScheduleType";
			definition = "Type of the payment schedule provided in the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentTerms.mmRelatedPaymentScheduleType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentTerms.mmObject();
		}

		@Override
		public PaymentTerms getValue(RegisteredContract obj) {
			return obj.getPaymentScheduleType();
		}

		@Override
		public void setValue(RegisteredContract obj, PaymentTerms value) {
			obj.setPaymentScheduleType(value);
		}
	};
	protected ISODate submissionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the date for the submission of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RegisteredContract, ISODate> mmSubmissionDate = new MMBusinessAttribute<RegisteredContract, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubmissionDate";
			definition = "Provides the date for the submission of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(RegisteredContract obj) {
			return obj.getSubmissionDate();
		}

		@Override
		public void setValue(RegisteredContract obj, ISODate value) {
			obj.setSubmissionDate(value);
		}
	};
	protected RegulatoryReportingRole sendingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole#mmRelatedSendingParty
	 * RegulatoryReportingRole.mmRelatedSendingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
	 * RegulatoryReportingRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which sends support information about the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegisteredContract, RegulatoryReportingRole> mmSendingParty = new MMBusinessAssociationEnd<RegisteredContract, RegulatoryReportingRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendingParty";
			definition = "Party which sends support information about the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegulatoryReportingRole.mmRelatedSendingParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
		}

		@Override
		public RegulatoryReportingRole getValue(RegisteredContract obj) {
			return obj.getSendingParty();
		}

		@Override
		public void setValue(RegisteredContract obj, RegulatoryReportingRole value) {
			obj.setSendingParty(value);
		}
	};
	protected CommunicationMethodCode deliveryMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the communication method for the delivery of the registered contract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RegisteredContract, CommunicationMethodCode> mmDeliveryMethod = new MMBusinessAttribute<RegisteredContract, CommunicationMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryMethod";
			definition = "Provides the communication method for the delivery of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommunicationMethodCode.mmObject();
		}

		@Override
		public CommunicationMethodCode getValue(RegisteredContract obj) {
			return obj.getDeliveryMethod();
		}

		@Override
		public void setValue(RegisteredContract obj, CommunicationMethodCode value) {
			obj.setDeliveryMethod(value);
		}
	};
	protected CommunicationMethodCode submissionMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the communication method for the submission of the registered contract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RegisteredContract, CommunicationMethodCode> mmSubmissionMethod = new MMBusinessAttribute<RegisteredContract, CommunicationMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubmissionMethod";
			definition = "Provides the communication method for the submission of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommunicationMethodCode.mmObject();
		}

		@Override
		public CommunicationMethodCode getValue(RegisteredContract obj) {
			return obj.getSubmissionMethod();
		}

		@Override
		public void setValue(RegisteredContract obj, CommunicationMethodCode value) {
			obj.setSubmissionMethod(value);
		}
	};
	protected Payment relatedPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmContractRegistration
	 * Payment.mmContractRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the payment related of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegisteredContract, Payment> mmRelatedPayment = new MMBusinessAssociationEnd<RegisteredContract, Payment>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Provides the payment related of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Payment.mmContractRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public Payment getValue(RegisteredContract obj) {
			return obj.getRelatedPayment();
		}

		@Override
		public void setValue(RegisteredContract obj, Payment value) {
			obj.setRelatedPayment(value);
		}
	};
	protected Document attachment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmRelatedContract
	 * Document.mmRelatedContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents provided as attachments to the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegisteredContract, com.tools20022.repository.entity.Document> mmAttachment = new MMBusinessAssociationEnd<RegisteredContract, com.tools20022.repository.entity.Document>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmRelatedContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Document getValue(RegisteredContract obj) {
			return obj.getAttachment();
		}

		@Override
		public void setValue(RegisteredContract obj, com.tools20022.repository.entity.Document value) {
			obj.setAttachment(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegisteredContract";
				definition = "Contract registered for regulatory purpose by a registration agent for the journaling of payments made against the contract.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmRelatedCertificate, com.tools20022.repository.entity.Document.mmRelatedContract, Payment.mmContractRegistration, StatusReason.mmRelatedClosureReason,
						CashBalance.mmRelatedRegisteredContract, PaymentTerms.mmRelatedPaymentScheduleType, RegulatoryReportingRole.mmRelatedReportingParty, RegulatoryReportingRole.mmRelatedRegistrationAgent,
						RegulatoryReportingRole.mmRelatedReceivingParty, RegulatoryReportingRole.mmRelatedSendingParty);
				superType_lazy = () -> Contract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegisteredContract.mmCertificate, com.tools20022.repository.entity.RegisteredContract.mmContractBalance,
						com.tools20022.repository.entity.RegisteredContract.mmReportingParty, com.tools20022.repository.entity.RegisteredContract.mmIdentification, com.tools20022.repository.entity.RegisteredContract.mmDeliveryDate,
						com.tools20022.repository.entity.RegisteredContract.mmRegistrationAgent, com.tools20022.repository.entity.RegisteredContract.mmReceivingParty, com.tools20022.repository.entity.RegisteredContract.mmPriority,
						com.tools20022.repository.entity.RegisteredContract.mmRegistrationDate, com.tools20022.repository.entity.RegisteredContract.mmClosureReason, com.tools20022.repository.entity.RegisteredContract.mmClosureDate,
						com.tools20022.repository.entity.RegisteredContract.mmPaymentScheduleType, com.tools20022.repository.entity.RegisteredContract.mmSubmissionDate, com.tools20022.repository.entity.RegisteredContract.mmSendingParty,
						com.tools20022.repository.entity.RegisteredContract.mmDeliveryMethod, com.tools20022.repository.entity.RegisteredContract.mmSubmissionMethod, com.tools20022.repository.entity.RegisteredContract.mmRelatedPayment,
						com.tools20022.repository.entity.RegisteredContract.mmAttachment);
			}

			@Override
			public Class<?> getInstanceClass() {
				return RegisteredContract.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification getCertificate() {
		return certificate;
	}

	public RegisteredContract setCertificate(GenericIdentification certificate) {
		this.certificate = Objects.requireNonNull(certificate);
		return this;
	}

	public CashBalance getContractBalance() {
		return contractBalance;
	}

	public RegisteredContract setContractBalance(CashBalance contractBalance) {
		this.contractBalance = Objects.requireNonNull(contractBalance);
		return this;
	}

	public RegulatoryReportingRole getReportingParty() {
		return reportingParty;
	}

	public RegisteredContract setReportingParty(RegulatoryReportingRole reportingParty) {
		this.reportingParty = Objects.requireNonNull(reportingParty);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public RegisteredContract setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ISODate getDeliveryDate() {
		return deliveryDate;
	}

	public RegisteredContract setDeliveryDate(ISODate deliveryDate) {
		this.deliveryDate = Objects.requireNonNull(deliveryDate);
		return this;
	}

	public RegulatoryReportingRole getRegistrationAgent() {
		return registrationAgent;
	}

	public RegisteredContract setRegistrationAgent(RegulatoryReportingRole registrationAgent) {
		this.registrationAgent = Objects.requireNonNull(registrationAgent);
		return this;
	}

	public RegulatoryReportingRole getReceivingParty() {
		return receivingParty;
	}

	public RegisteredContract setReceivingParty(RegulatoryReportingRole receivingParty) {
		this.receivingParty = Objects.requireNonNull(receivingParty);
		return this;
	}

	public PriorityCode getPriority() {
		return priority;
	}

	public RegisteredContract setPriority(PriorityCode priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public ISODate getRegistrationDate() {
		return registrationDate;
	}

	public RegisteredContract setRegistrationDate(ISODate registrationDate) {
		this.registrationDate = Objects.requireNonNull(registrationDate);
		return this;
	}

	public StatusReason getClosureReason() {
		return closureReason;
	}

	public RegisteredContract setClosureReason(StatusReason closureReason) {
		this.closureReason = Objects.requireNonNull(closureReason);
		return this;
	}

	public ISODate getClosureDate() {
		return closureDate;
	}

	public RegisteredContract setClosureDate(ISODate closureDate) {
		this.closureDate = Objects.requireNonNull(closureDate);
		return this;
	}

	public PaymentTerms getPaymentScheduleType() {
		return paymentScheduleType;
	}

	public RegisteredContract setPaymentScheduleType(PaymentTerms paymentScheduleType) {
		this.paymentScheduleType = Objects.requireNonNull(paymentScheduleType);
		return this;
	}

	public ISODate getSubmissionDate() {
		return submissionDate;
	}

	public RegisteredContract setSubmissionDate(ISODate submissionDate) {
		this.submissionDate = Objects.requireNonNull(submissionDate);
		return this;
	}

	public RegulatoryReportingRole getSendingParty() {
		return sendingParty;
	}

	public RegisteredContract setSendingParty(RegulatoryReportingRole sendingParty) {
		this.sendingParty = Objects.requireNonNull(sendingParty);
		return this;
	}

	public CommunicationMethodCode getDeliveryMethod() {
		return deliveryMethod;
	}

	public RegisteredContract setDeliveryMethod(CommunicationMethodCode deliveryMethod) {
		this.deliveryMethod = Objects.requireNonNull(deliveryMethod);
		return this;
	}

	public CommunicationMethodCode getSubmissionMethod() {
		return submissionMethod;
	}

	public RegisteredContract setSubmissionMethod(CommunicationMethodCode submissionMethod) {
		this.submissionMethod = Objects.requireNonNull(submissionMethod);
		return this;
	}

	public Payment getRelatedPayment() {
		return relatedPayment;
	}

	public RegisteredContract setRelatedPayment(Payment relatedPayment) {
		this.relatedPayment = Objects.requireNonNull(relatedPayment);
		return this;
	}

	public Document getAttachment() {
		return attachment;
	}

	public RegisteredContract setAttachment(com.tools20022.repository.entity.Document attachment) {
		this.attachment = Objects.requireNonNull(attachment);
		return this;
	}
}