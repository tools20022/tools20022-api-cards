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
import com.tools20022.repository.entity.Contract;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Certificate against which all transactions in the scope of the regulatory
	 * requirements are registered.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Certificate";
			definition = "Certificate against which all transactions in the scope of the regulatory requirements are registered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmRelatedCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected CashBalance contractBalance;
	/**
	 * Contract balance on date of contract registration.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmContractBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractBalance";
			definition = "Contract balance on date of contract registration.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.mmRelatedRegisteredContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}
	};
	protected RegulatoryReportingRole reportingParty;
	/**
	 * Party which must register the contract for regulatory reporting reasons.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmReportingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingParty";
			definition = "Party which must register the contract for regulatory reporting reasons.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedReportingParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Unique and unambiguous identification of the registered contract.
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RegisteredContract.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate deliveryDate;
	/**
	 * Provides the date for the delivery of the registered contract.
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
	public static final MMBusinessAttribute mmDeliveryDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RegisteredContract.class.getMethod("getDeliveryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RegulatoryReportingRole registrationAgent;
	/**
	 * Agent which is in charge of the registration of the contract.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRegistrationAgent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationAgent";
			definition = "Agent which is in charge of the registration of the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedRegistrationAgent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmObject();
		}
	};
	protected RegulatoryReportingRole receivingParty;
	/**
	 * Party which receives support information about the registered contract.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmReceivingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceivingParty";
			definition = "Party which receives support information about the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedReceivingParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmObject();
		}
	};
	protected PriorityCode priority;
	/**
	 * Priority requested for the registered contract.
	 * <p>
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
	public static final MMBusinessAttribute mmPriority = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RegisteredContract.class.getMethod("getPriority", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate registrationDate;
	/**
	 * Provides the date for the registration of the registered contract.
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
	public static final MMBusinessAttribute mmRegistrationDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RegisteredContract.class.getMethod("getRegistrationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StatusReason closureReason;
	/**
	 * Reason of closure of the contract.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmClosureReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosureReason";
			definition = "Reason of closure of the contract. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.mmRelatedClosureReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
		}
	};
	protected ISODate closureDate;
	/**
	 * Date of closure of the contract.
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
	public static final MMBusinessAttribute mmClosureDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RegisteredContract.class.getMethod("getClosureDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentTerms paymentScheduleType;
	/**
	 * Type of the payment schedule provided in the contract.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPaymentScheduleType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentScheduleType";
			definition = "Type of the payment schedule provided in the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmRelatedPaymentScheduleType;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
		}
	};
	protected ISODate submissionDate;
	/**
	 * Provides the date for the submission of the registered contract.
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
	public static final MMBusinessAttribute mmSubmissionDate = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RegisteredContract.class.getMethod("getSubmissionDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RegulatoryReportingRole sendingParty;
	/**
	 * Party which sends support information about the registered contract.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmSendingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendingParty";
			definition = "Party which sends support information about the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedSendingParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.mmObject();
		}
	};
	protected CommunicationMethodCode deliveryMethod;
	/**
	 * Provides the communication method for the delivery of the registered
	 * contract.
	 * <p>
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
	public static final MMBusinessAttribute mmDeliveryMethod = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RegisteredContract.class.getMethod("getDeliveryMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CommunicationMethodCode submissionMethod;
	/**
	 * Provides the communication method for the submission of the registered
	 * contract.
	 * <p>
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
	public static final MMBusinessAttribute mmSubmissionMethod = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RegisteredContract.class.getMethod("getSubmissionMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Payment relatedPayment;
	/**
	 * Provides the payment related of the registered contract.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Provides the payment related of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmContractRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected Document attachment;
	/**
	 * Documents provided as attachments to the registered contract.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmAttachment = new MMBusinessAssociationEnd() {
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
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegisteredContract";
				definition = "Contract registered for regulatory purpose by a registration agent for the journaling of payments made against the contract.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmRelatedCertificate, com.tools20022.repository.entity.Document.mmRelatedContract,
						com.tools20022.repository.entity.Payment.mmContractRegistration, com.tools20022.repository.entity.StatusReason.mmRelatedClosureReason, com.tools20022.repository.entity.CashBalance.mmRelatedRegisteredContract,
						com.tools20022.repository.entity.PaymentTerms.mmRelatedPaymentScheduleType, com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedReportingParty,
						com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedRegistrationAgent, com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedReceivingParty,
						com.tools20022.repository.entity.RegulatoryReportingRole.mmRelatedSendingParty);
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

	public void setCertificate(com.tools20022.repository.entity.GenericIdentification certificate) {
		this.certificate = certificate;
	}

	public CashBalance getContractBalance() {
		return contractBalance;
	}

	public void setContractBalance(com.tools20022.repository.entity.CashBalance contractBalance) {
		this.contractBalance = contractBalance;
	}

	public RegulatoryReportingRole getReportingParty() {
		return reportingParty;
	}

	public void setReportingParty(com.tools20022.repository.entity.RegulatoryReportingRole reportingParty) {
		this.reportingParty = reportingParty;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public ISODate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(ISODate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public RegulatoryReportingRole getRegistrationAgent() {
		return registrationAgent;
	}

	public void setRegistrationAgent(com.tools20022.repository.entity.RegulatoryReportingRole registrationAgent) {
		this.registrationAgent = registrationAgent;
	}

	public RegulatoryReportingRole getReceivingParty() {
		return receivingParty;
	}

	public void setReceivingParty(com.tools20022.repository.entity.RegulatoryReportingRole receivingParty) {
		this.receivingParty = receivingParty;
	}

	public PriorityCode getPriority() {
		return priority;
	}

	public void setPriority(PriorityCode priority) {
		this.priority = priority;
	}

	public ISODate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(ISODate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public StatusReason getClosureReason() {
		return closureReason;
	}

	public void setClosureReason(com.tools20022.repository.entity.StatusReason closureReason) {
		this.closureReason = closureReason;
	}

	public ISODate getClosureDate() {
		return closureDate;
	}

	public void setClosureDate(ISODate closureDate) {
		this.closureDate = closureDate;
	}

	public PaymentTerms getPaymentScheduleType() {
		return paymentScheduleType;
	}

	public void setPaymentScheduleType(com.tools20022.repository.entity.PaymentTerms paymentScheduleType) {
		this.paymentScheduleType = paymentScheduleType;
	}

	public ISODate getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(ISODate submissionDate) {
		this.submissionDate = submissionDate;
	}

	public RegulatoryReportingRole getSendingParty() {
		return sendingParty;
	}

	public void setSendingParty(com.tools20022.repository.entity.RegulatoryReportingRole sendingParty) {
		this.sendingParty = sendingParty;
	}

	public CommunicationMethodCode getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(CommunicationMethodCode deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public CommunicationMethodCode getSubmissionMethod() {
		return submissionMethod;
	}

	public void setSubmissionMethod(CommunicationMethodCode submissionMethod) {
		this.submissionMethod = submissionMethod;
	}

	public Payment getRelatedPayment() {
		return relatedPayment;
	}

	public void setRelatedPayment(com.tools20022.repository.entity.Payment relatedPayment) {
		this.relatedPayment = relatedPayment;
	}

	public Document getAttachment() {
		return attachment;
	}

	public void setAttachment(com.tools20022.repository.entity.Document attachment) {
		this.attachment = attachment;
	}
}