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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TypeTransactionTotalsCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Reconciliation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Totals performed during the reconciliation period, for a certain type of
 * transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ReconciliationTransaction"
 * src="doc-files/ReconciliationTransaction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Reconciliation
 * Reconciliation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmReconciliationIdentification
 * ReconciliationTransaction.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCurrency
 * ReconciliationTransaction.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmTransactionType
 * ReconciliationTransaction.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmTotalNumber
 * ReconciliationTransaction.mmTotalNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCumulativeAmount
 * ReconciliationTransaction.mmCumulativeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmClosePeriod
 * ReconciliationTransaction.mmClosePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCardPaymentTotal
 * ReconciliationTransaction.mmCardPaymentTotal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmReconciliation
 * CardPayment.mmReconciliation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6#mmTransaction
 * AcceptorReconciliationRequest6.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction10
 * CardTransaction10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction9
 * CardTransaction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReconciliation4
 * TransactionReconciliation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6
 * AcceptorReconciliationRequest6}</li>
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
 * "ReconciliationTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Totals performed during the reconciliation period, for a certain type of transaction."
 * </li>
 * </ul>
 */
public class ReconciliationTransaction extends Reconciliation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text reconciliationIdentification;
	/**
	 * Unique identification of the reconciliation period between the acceptor
	 * and the acquirer. This identification might be linked to the
	 * identification of the settlement for further verification by the
	 * merchant.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier2#mmReconciliationIdentification
	 * TransactionIdentifier2.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#mmReconciliationIdentification
	 * CardPaymentTransaction57.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4#mmReconciliationIdentification
	 * TransactionReconciliation4.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmReconciliationIdentification
	 * ATMTransaction13.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmReconciliationIdentification
	 * ATMTransaction16.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmReconciliationIdentification
	 * ATMTransaction19.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmReconciliationIdentification
	 * ATMTransaction15.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmReconciliationIdentification
	 * ATMTransaction24.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmReconciliationIdentification
	 * ATMTransaction23.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmReconciliationIdentification
	 * CardPaymentTransaction71.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmReconciliationIdentification
	 * CardPaymentTransaction75.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmReconciliationIdentification
	 * CardPaymentTransaction74.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmReconciliationIdentification
	 * CardPaymentTransaction70.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmReconciliationIdentification
	 * CardPaymentTransaction76.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#mmReconciliationIdentification
	 * CommonData6.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmReconciliationIdentification
	 * CardPaymentTransaction69.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#mmReconciliationIdentification
	 * CardPaymentTransaction77.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#mmReconciliationIdentification
	 * CardPaymentTransaction78.mmReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReconciliationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionIdentifier2.mmReconciliationIdentification, CardPaymentTransaction57.mmReconciliationIdentification, TransactionReconciliation4.mmReconciliationIdentification,
					ATMTransaction13.mmReconciliationIdentification, ATMTransaction16.mmReconciliationIdentification, ATMTransaction19.mmReconciliationIdentification, ATMTransaction15.mmReconciliationIdentification,
					ATMTransaction24.mmReconciliationIdentification, ATMTransaction23.mmReconciliationIdentification, CardPaymentTransaction71.mmReconciliationIdentification, CardPaymentTransaction75.mmReconciliationIdentification,
					CardPaymentTransaction74.mmReconciliationIdentification, CardPaymentTransaction70.mmReconciliationIdentification, CardPaymentTransaction76.mmReconciliationIdentification, CommonData6.mmReconciliationIdentification,
					CardPaymentTransaction69.mmReconciliationIdentification, CardPaymentTransaction77.mmReconciliationIdentification, CardPaymentTransaction78.mmReconciliationIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getReconciliationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode currency;
	/**
	 * Currency associated with thecumulative amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7#mmCurrency
	 * TransactionTotals7.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with thecumulative amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionTotals7.mmCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency associated with thecumulative amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TypeTransactionTotalsCode transactionType;
	/**
	 * Identification of the type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode
	 * TypeTransactionTotalsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals7#mmType
	 * TransactionTotals7.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionTotals7.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionType";
			definition = "Identification of the type of transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeTransactionTotalsCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getTransactionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text totalNumber;
	/**
	 * Total number of transactions during a reconciliation period.
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
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of transactions during a reconciliation period."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalNumber";
			definition = "Total number of transactions during a reconciliation period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getTotalNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ImpliedCurrencyAndAmount cumulativeAmount;
	/**
	 * Total amount of a collection of transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7#mmCumulativeAmount
	 * TransactionTotals7.mmCumulativeAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumulativeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of a collection of transactions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCumulativeAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionTotals7.mmCumulativeAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumulativeAmount";
			definition = "Total amount of a collection of transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getCumulativeAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator closePeriod;
	/**
	 * Indicates if the exchange requires a closure of the reconciliation
	 * period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the exchange requires a closure of the reconciliation period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClosePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosePeriod";
			definition = "Indicates if the exchange requires a closure of the reconciliation period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getClosePeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CardPayment> cardPaymentTotal;
	/**
	 * Specifies the card payments which are part of the transaction
	 * reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmReconciliation
	 * CardPayment.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6#mmEnvironment
	 * AcceptorReconciliationRequest6.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentTotal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the card payments which are part of the transaction reconciliation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCardPaymentTotal = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptorReconciliationRequest6.mmEnvironment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentTotal";
			definition = "Specifies the card payments which are part of the transaction reconciliation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.mmReconciliation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReconciliationTransaction";
				definition = "Totals performed during the reconciliation period, for a certain type of transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.mmReconciliation);
				derivationElement_lazy = () -> Arrays.asList(AcceptorReconciliationRequest6.mmTransaction);
				superType_lazy = () -> Reconciliation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReconciliationTransaction.mmReconciliationIdentification, com.tools20022.repository.entity.ReconciliationTransaction.mmCurrency,
						com.tools20022.repository.entity.ReconciliationTransaction.mmTransactionType, com.tools20022.repository.entity.ReconciliationTransaction.mmTotalNumber,
						com.tools20022.repository.entity.ReconciliationTransaction.mmCumulativeAmount, com.tools20022.repository.entity.ReconciliationTransaction.mmClosePeriod,
						com.tools20022.repository.entity.ReconciliationTransaction.mmCardPaymentTotal);
				derivationComponent_lazy = () -> Arrays.asList(CardTransaction10.mmObject(), CardTransaction9.mmObject(), TransactionReconciliation4.mmObject(), AcceptorReconciliationRequest6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReconciliationTransaction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public void setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public TypeTransactionTotalsCode getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TypeTransactionTotalsCode transactionType) {
		this.transactionType = transactionType;
	}

	public Max35Text getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(Max35Text totalNumber) {
		this.totalNumber = totalNumber;
	}

	public ImpliedCurrencyAndAmount getCumulativeAmount() {
		return cumulativeAmount;
	}

	public void setCumulativeAmount(ImpliedCurrencyAndAmount cumulativeAmount) {
		this.cumulativeAmount = cumulativeAmount;
	}

	public TrueFalseIndicator getClosePeriod() {
		return closePeriod;
	}

	public void setClosePeriod(TrueFalseIndicator closePeriod) {
		this.closePeriod = closePeriod;
	}

	public List<CardPayment> getCardPaymentTotal() {
		return cardPaymentTotal;
	}

	public void setCardPaymentTotal(List<com.tools20022.repository.entity.CardPayment> cardPaymentTotal) {
		this.cardPaymentTotal = cardPaymentTotal;
	}
}