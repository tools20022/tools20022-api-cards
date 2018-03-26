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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.InstructionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.StandingOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction may have to be forwarded several times to
 * complete the settlement chain.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentInstruction" src="doc-files/PaymentInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentExecution
 * PaymentExecution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmProcessingValidityTime
 * PaymentInstruction.mmProcessingValidityTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmInstructionForNextAgent
 * PaymentInstruction.mmInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
 * PaymentInstruction.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmClearingChargeAmount
 * PaymentInstruction.mmClearingChargeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmStandingOrder
 * PaymentInstruction.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmPrevious
 * PaymentInstruction.mmPrevious}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPaymentInstruction
 * DateTimePeriod.mmPaymentInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmNext
 * PaymentExecution.mmNext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedPaymentInstruction
 * CashSettlement.mmRelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmPaymentInstructionTrigger
 * StandingOrder.mmPaymentInstructionTrigger}</li>
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
 * "PaymentInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain."
 * </li>
 * </ul>
 */
public class PaymentInstruction extends PaymentExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriod processingValidityTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPaymentInstruction
	 * DateTimePeriod.mmPaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time range within which the payment instruction must be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentInstruction, DateTimePeriod> mmProcessingValidityTime = new MMBusinessAssociationEnd<PaymentInstruction, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmPaymentInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(PaymentInstruction obj) {
			return obj.getProcessingValidityTime();
		}

		@Override
		public void setValue(PaymentInstruction obj, DateTimePeriod value) {
			obj.setProcessingValidityTime(value);
		}
	};
	protected InstructionCode instructionForNextAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the next agent. \r\nUsage: The next agent may not be the creditor agent.\r\nThe instruction can relate to a level of service, can be an instruction that has to be executed by the agent, or can be information required by the next agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInstruction, InstructionCode> mmInstructionForNextAgent = new MMBusinessAttribute<PaymentInstruction, InstructionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionForNextAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the next agent. \r\nUsage: The next agent may not be the creditor agent.\r\nThe instruction can relate to a level of service, can be an instruction that has to be executed by the agent, or can be information required by the next agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}

		@Override
		public InstructionCode getValue(PaymentInstruction obj) {
			return obj.getInstructionForNextAgent();
		}

		@Override
		public void setValue(PaymentInstruction obj, InstructionCode value) {
			obj.setInstructionForNextAgent(value);
		}
	};
	protected CashSettlement settlementInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedPaymentInstruction
	 * CashSettlement.mmRelatedPaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for the cash settlement between two clearing agents."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentInstruction, CashSettlement> mmSettlementInstruction = new MMBusinessAssociationEnd<PaymentInstruction, CashSettlement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Instruction for the cash settlement between two clearing agents.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashSettlement.mmRelatedPaymentInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashSettlement.mmObject();
		}

		@Override
		public CashSettlement getValue(PaymentInstruction obj) {
			return obj.getSettlementInstruction();
		}

		@Override
		public void setValue(PaymentInstruction obj, CashSettlement value) {
			obj.setSettlementInstruction(value);
		}
	};
	protected CurrencyAndAmount clearingChargeAmount;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::OTHR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingChargeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money taken by a clearing agent as compensation for the processing of the payment instruction. This charge is paid either by the debtor or by the creditor or shared between them."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentInstruction, CurrencyAndAmount> mmClearingChargeAmount = new MMBusinessAttribute<PaymentInstruction, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::OTHR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingChargeAmount";
			definition = "Amount of money taken by a clearing agent as compensation for the processing of the payment instruction. This charge is paid either by the debtor or by the creditor or shared between them.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(PaymentInstruction obj) {
			return obj.getClearingChargeAmount();
		}

		@Override
		public void setValue(PaymentInstruction obj, CurrencyAndAmount value) {
			obj.setClearingChargeAmount(value);
		}
	};
	protected StandingOrder standingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmPaymentInstructionTrigger
	 * StandingOrder.mmPaymentInstructionTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentInstruction, com.tools20022.repository.entity.StandingOrder> mmStandingOrder = new MMBusinessAssociationEnd<PaymentInstruction, com.tools20022.repository.entity.StandingOrder>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmPaymentInstructionTrigger;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.StandingOrder getValue(PaymentInstruction obj) {
			return obj.getStandingOrder();
		}

		@Override
		public void setValue(PaymentInstruction obj, com.tools20022.repository.entity.StandingOrder value) {
			obj.setStandingOrder(value);
		}
	};
	protected List<PaymentExecution> previous;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmNext
	 * PaymentExecution.mmNext}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Previous"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a payment instruction may be preceeded by another payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentInstruction, List<PaymentExecution>> mmPrevious = new MMBusinessAssociationEnd<PaymentInstruction, List<PaymentExecution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Previous";
			definition = "Specifies that a payment instruction may be preceeded by another payment instruction.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentExecution.mmNext;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentExecution.mmObject();
		}

		@Override
		public List<PaymentExecution> getValue(PaymentInstruction obj) {
			return obj.getPrevious();
		}

		@Override
		public void setValue(PaymentInstruction obj, List<PaymentExecution> value) {
			obj.setPrevious(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction";
				definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmPaymentInstruction, PaymentExecution.mmNext, CashSettlement.mmRelatedPaymentInstruction,
						com.tools20022.repository.entity.StandingOrder.mmPaymentInstructionTrigger);
				superType_lazy = () -> PaymentExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInstruction.mmProcessingValidityTime, com.tools20022.repository.entity.PaymentInstruction.mmInstructionForNextAgent,
						com.tools20022.repository.entity.PaymentInstruction.mmSettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.mmClearingChargeAmount,
						com.tools20022.repository.entity.PaymentInstruction.mmStandingOrder, com.tools20022.repository.entity.PaymentInstruction.mmPrevious);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentInstruction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getProcessingValidityTime() {
		return processingValidityTime;
	}

	public PaymentInstruction setProcessingValidityTime(DateTimePeriod processingValidityTime) {
		this.processingValidityTime = Objects.requireNonNull(processingValidityTime);
		return this;
	}

	public InstructionCode getInstructionForNextAgent() {
		return instructionForNextAgent;
	}

	public PaymentInstruction setInstructionForNextAgent(InstructionCode instructionForNextAgent) {
		this.instructionForNextAgent = Objects.requireNonNull(instructionForNextAgent);
		return this;
	}

	public CashSettlement getSettlementInstruction() {
		return settlementInstruction;
	}

	public PaymentInstruction setSettlementInstruction(CashSettlement settlementInstruction) {
		this.settlementInstruction = Objects.requireNonNull(settlementInstruction);
		return this;
	}

	public CurrencyAndAmount getClearingChargeAmount() {
		return clearingChargeAmount;
	}

	public PaymentInstruction setClearingChargeAmount(CurrencyAndAmount clearingChargeAmount) {
		this.clearingChargeAmount = Objects.requireNonNull(clearingChargeAmount);
		return this;
	}

	public StandingOrder getStandingOrder() {
		return standingOrder;
	}

	public PaymentInstruction setStandingOrder(com.tools20022.repository.entity.StandingOrder standingOrder) {
		this.standingOrder = Objects.requireNonNull(standingOrder);
		return this;
	}

	public List<PaymentExecution> getPrevious() {
		return previous == null ? previous = new ArrayList<>() : previous;
	}

	public PaymentInstruction setPrevious(List<PaymentExecution> previous) {
		this.previous = Objects.requireNonNull(previous);
		return this;
	}
}