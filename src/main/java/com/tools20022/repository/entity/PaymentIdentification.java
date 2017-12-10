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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a payment
 * transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentIdentification"
 * src="doc-files/PaymentIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
 * PaymentIdentification.mmExecutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
 * PaymentIdentification.mmEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmInstructionIdentification
 * PaymentIdentification.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
 * PaymentIdentification.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmClearingSystemReference
 * PaymentIdentification.mmClearingSystemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmCreditorReference
 * PaymentIdentification.mmCreditorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
 * PaymentIdentification.mmPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
 * Payment.mmPaymentRelatedIdentifications}</li>
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
 * "PaymentIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a payment transaction."
 * </li>
 * </ul>
 */
public class PaymentIdentification extends TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text executionIdentification;
	/**
	 * Unique and unambiguous identifier for a payment execution, as assigned by
	 * the clearing agent or the initiating party.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExecutionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutionIdentification";
			definition = "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getExecutionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text endToEndIdentification;
	/**
	 * Unique and unambiguous identifier for a payment as assigned by the
	 * originator. The payment transaction reference is used for reconciliation
	 * or to link tasks relating to the payment.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEndToEndIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getEndToEndIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text instructionIdentification;
	/**
	 * Unique identification assigned by an instructing party for an instructed
	 * party to unambiguously identify the instruction.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstructionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getInstructionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text transactionIdentification;
	/**
	 * Unique identification assigned by the first instructing agent to
	 * unambiguously identify the transaction and passed on, unchanged,
	 * throughout the entire interbank chain.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text clearingSystemReference;
	/**
	 * Unique and unambiguous identifier for a payment instruction, as assigned
	 * by the clearing system.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClearingSystemReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getClearingSystemReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text creditorReference;
	/**
	 * Unique and unambiguous reference assigned by the creditor to refer to the
	 * payment obligation.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditorReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditorReference";
			definition = "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentIdentification.class.getMethod("getCreditorReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Payment payment;
	/**
	 * Payment for which identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
	 * Payment.mmPaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which identifications are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which identifications are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentRelatedIdentifications;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentIdentification";
				definition = "Specifies the different identifications associated with a payment transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmPaymentRelatedIdentifications);
				superType_lazy = () -> TradeIdentification.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentIdentification.mmExecutionIdentification, com.tools20022.repository.entity.PaymentIdentification.mmEndToEndIdentification,
						com.tools20022.repository.entity.PaymentIdentification.mmInstructionIdentification, com.tools20022.repository.entity.PaymentIdentification.mmTransactionIdentification,
						com.tools20022.repository.entity.PaymentIdentification.mmClearingSystemReference, com.tools20022.repository.entity.PaymentIdentification.mmCreditorReference,
						com.tools20022.repository.entity.PaymentIdentification.mmPayment);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getExecutionIdentification() {
		return executionIdentification;
	}

	public void setExecutionIdentification(Max35Text executionIdentification) {
		this.executionIdentification = executionIdentification;
	}

	public Max35Text getEndToEndIdentification() {
		return endToEndIdentification;
	}

	public void setEndToEndIdentification(Max35Text endToEndIdentification) {
		this.endToEndIdentification = endToEndIdentification;
	}

	public Max35Text getInstructionIdentification() {
		return instructionIdentification;
	}

	public void setInstructionIdentification(Max35Text instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public Max35Text getClearingSystemReference() {
		return clearingSystemReference;
	}

	public void setClearingSystemReference(Max35Text clearingSystemReference) {
		this.clearingSystemReference = clearingSystemReference;
	}

	public Max35Text getCreditorReference() {
		return creditorReference;
	}

	public void setCreditorReference(Max35Text creditorReference) {
		this.creditorReference = creditorReference;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
	}
}