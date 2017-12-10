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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PointOfInteractionComponent7;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * The status of an instruction, advice or request.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Status" src="doc-files/Status.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusReason
 * Status.mmStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
 * Status.mmStatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmValidityTime
 * Status.mmValidityTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusDescription
 * Status.mmStatusDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
 * Status.mmInstructionProcessingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmPartyRole
 * Status.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
 * Status.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmCancellationProcessingStatus
 * Status.mmCancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
 * Status.mmTransactionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmModificationProcessingStatus
 * Status.mmModificationProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmStatus
 * DateTimePeriod.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
 * StatusReason.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#mmStatus
 * InvestigationPartyRole.mmStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LimitStatus LimitStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus
 * SecuritiesStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingStatus
 * UndertakingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandateStatus MandateStatus}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
 * TreasuryTradeSettlementStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPaymentStatus
 * CardPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestigationCaseStatus
 * InvestigationCaseStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralStatus
 * CollateralStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
 * InvoiceFinancingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BaselineStatus
 * BaselineStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuoteStatus QuoteStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceStatus InvoiceStatus}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
 * PointOfInteractionComponent7}</li>
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
 * "Status"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "The status of an instruction, advice or request."</li>
 * </ul>
 */
public class Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.StatusReason> statusReason;
	/**
	 * Specifies the reasons for the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
	 * StatusReason.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StatusReason
	 * StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reasons for the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStatusReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusReason";
			definition = "Specifies the reasons for the status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
		}
	};
	protected ISODateTime statusDateTime;
	/**
	 * Date and time at which the status was assigned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatusDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusDateTime";
			definition = "Date and time at which the status was assigned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getStatusDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod validityTime;
	/**
	 * Period of time during which the status is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmStatus
	 * DateTimePeriod.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of time during which the status is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValidityTime = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityTime";
			definition = "Period of time during which the status is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Max350Text statusDescription;
	/**
	 * Specifies the state or the condition.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the state or the condition."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatusDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusDescription";
			definition = "Specifies the state or the condition.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getStatusDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StatusCode instructionProcessingStatus;
	/**
	 * Status of the processing of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.StatusCode
	 * StatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the processing of an instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstructionProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Status of the processing of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getInstructionProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestigationPartyRole partyRole;
	/**
	 * Role played by a party in the context of assigning a status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#mmStatus
	 * InvestigationPartyRole.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole
	 * InvestigationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of assigning a status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of assigning a status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.mmObject();
		}
	};
	protected SecuritiesSettlementStatusCode settlementStatus;
	/**
	 * Status of settlement of a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode
	 * SecuritiesSettlementStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementStatus";
			definition = "Status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getSettlementStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CancellationProcessingStatusCode cancellationProcessingStatus;
	/**
	 * Specifies the status of a cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a cancellation request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCancellationProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Specifies the status of a cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getCancellationProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InstructionProcessingStatusCode transactionProcessingStatus;
	/**
	 * Status of processing of a transaction at account servicer level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of processing of a transaction at account servicer level."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionProcessingStatus";
			definition = "Status of processing of a transaction at account servicer level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getTransactionProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ModificationProcessingStatusCode modificationProcessingStatus;
	/**
	 * Provides the status of a modification request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
	 * ModificationProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of a modification request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmModificationProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides the status of a modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ModificationProcessingStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Status.class.getMethod("getModificationProcessingStatus", new Class[]{});
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
				name = "Status";
				definition = "The status of an instruction, advice or request.";
				associationDomain_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.DateTimePeriod.mmStatus, com.tools20022.repository.entity.StatusReason.mmStatus, com.tools20022.repository.entity.InvestigationPartyRole.mmStatus);
				subType_lazy = () -> Arrays.asList(AccountStatus.mmObject(), PaymentStatus.mmObject(), SystemStatus.mmObject(), LimitStatus.mmObject(), SecuritiesTradeStatus.mmObject(), CorporateActionStatus.mmObject(),
						SecuritiesStatus.mmObject(), UndertakingStatus.mmObject(), MandateStatus.mmObject(), TreasuryTradeSettlementStatus.mmObject(), CardPaymentStatus.mmObject(), SecuritiesOrderStatus.mmObject(),
						InvestigationCaseStatus.mmObject(), MeetingStatus.mmObject(), CollateralStatus.mmObject(), InvoiceFinancingStatus.mmObject(), BaselineStatus.mmObject(), QuoteStatus.mmObject(), InvoiceStatus.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Status.mmStatusReason, com.tools20022.repository.entity.Status.mmStatusDateTime, com.tools20022.repository.entity.Status.mmValidityTime,
						com.tools20022.repository.entity.Status.mmStatusDescription, com.tools20022.repository.entity.Status.mmInstructionProcessingStatus, com.tools20022.repository.entity.Status.mmPartyRole,
						com.tools20022.repository.entity.Status.mmSettlementStatus, com.tools20022.repository.entity.Status.mmCancellationProcessingStatus, com.tools20022.repository.entity.Status.mmTransactionProcessingStatus,
						com.tools20022.repository.entity.Status.mmModificationProcessingStatus);
				derivationComponent_lazy = () -> Arrays.asList(PointOfInteractionComponent7.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Status.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<StatusReason> getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(List<com.tools20022.repository.entity.StatusReason> statusReason) {
		this.statusReason = statusReason;
	}

	public ISODateTime getStatusDateTime() {
		return statusDateTime;
	}

	public void setStatusDateTime(ISODateTime statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	public DateTimePeriod getValidityTime() {
		return validityTime;
	}

	public void setValidityTime(com.tools20022.repository.entity.DateTimePeriod validityTime) {
		this.validityTime = validityTime;
	}

	public Max350Text getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(Max350Text statusDescription) {
		this.statusDescription = statusDescription;
	}

	public StatusCode getInstructionProcessingStatus() {
		return instructionProcessingStatus;
	}

	public void setInstructionProcessingStatus(StatusCode instructionProcessingStatus) {
		this.instructionProcessingStatus = instructionProcessingStatus;
	}

	public InvestigationPartyRole getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(com.tools20022.repository.entity.InvestigationPartyRole partyRole) {
		this.partyRole = partyRole;
	}

	public SecuritiesSettlementStatusCode getSettlementStatus() {
		return settlementStatus;
	}

	public void setSettlementStatus(SecuritiesSettlementStatusCode settlementStatus) {
		this.settlementStatus = settlementStatus;
	}

	public CancellationProcessingStatusCode getCancellationProcessingStatus() {
		return cancellationProcessingStatus;
	}

	public void setCancellationProcessingStatus(CancellationProcessingStatusCode cancellationProcessingStatus) {
		this.cancellationProcessingStatus = cancellationProcessingStatus;
	}

	public InstructionProcessingStatusCode getTransactionProcessingStatus() {
		return transactionProcessingStatus;
	}

	public void setTransactionProcessingStatus(InstructionProcessingStatusCode transactionProcessingStatus) {
		this.transactionProcessingStatus = transactionProcessingStatus;
	}

	public ModificationProcessingStatusCode getModificationProcessingStatus() {
		return modificationProcessingStatus;
	}

	public void setModificationProcessingStatus(ModificationProcessingStatusCode modificationProcessingStatus) {
		this.modificationProcessingStatus = modificationProcessingStatus;
	}
}