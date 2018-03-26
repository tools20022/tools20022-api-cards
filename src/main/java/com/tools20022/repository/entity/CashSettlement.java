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
import com.tools20022.repository.codeset.SettlementMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction between two financial institutions stipulating the cash transfer
 * characteristics between the two parties.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashSettlement" src="doc-files/CashSettlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
 * CashSettlement.mmInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
 * CashSettlement.mmInterbankSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmRTGS
 * CashSettlement.mmRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmCreditDateTime
 * CashSettlement.mmCreditDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedPaymentInstruction
 * CashSettlement.mmRelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementMethod
 * CashSettlement.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
 * CashSettlement.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmDebitDateTime
 * CashSettlement.mmDebitDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmPartyRole
 * CashSettlement.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedTransactionAdministrator
 * CashSettlement.mmRelatedTransactionAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmBookEntry
 * CashSettlement.mmBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedInvestigationCase
 * CashSettlement.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmReservation
 * CashSettlement.mmReservation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedSettlementInstruction
 * CashAccount.mmRelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
 * PaymentInstruction.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmSettlementInstruction
 * TransactionAdministrator.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmSettlementInstruction
 * Reservation.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmRelatedSettlementInstruction
 * BookEntry.mmRelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmSettlementInstruction
 * CashSettlementInstructionPartyRole.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmCoverCorrection
 * PaymentInvestigationCaseResolution.mmCoverCorrection}</li>
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
 * "CashSettlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties."
 * </li>
 * </ul>
 */
public class CashSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount interbankSettlementAmount;
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
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashSettlement, CurrencyAndAmount> mmInterbankSettlementAmount = new MMBusinessAttribute<CashSettlement, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CashSettlement obj) {
			return obj.getInterbankSettlementAmount();
		}

		@Override
		public void setValue(CashSettlement obj, CurrencyAndAmount value) {
			obj.setInterbankSettlementAmount(value);
		}
	};
	protected ISODateTime interbankSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashSettlement, ISODateTime> mmInterbankSettlementDate = new MMBusinessAttribute<CashSettlement, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CashSettlement obj) {
			return obj.getInterbankSettlementDate();
		}

		@Override
		public void setValue(CashSettlement obj, ISODateTime value) {
			obj.setInterbankSettlementDate(value);
		}
	};
	protected Max4AlphaNumericText rTGS;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the RTGS status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashSettlement, Max4AlphaNumericText> mmRTGS = new MMBusinessAttribute<CashSettlement, Max4AlphaNumericText>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RTGS";
			definition = "Qualifies the RTGS status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(CashSettlement obj) {
			return obj.getRTGS();
		}

		@Override
		public void setValue(CashSettlement obj, Max4AlphaNumericText value) {
			obj.setRTGS(value);
		}
	};
	protected ISODateTime creditDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the occurred settlement time(s) of the payment transaction for the credit side."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashSettlement, ISODateTime> mmCreditDateTime = new MMBusinessAttribute<CashSettlement, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the credit side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CashSettlement obj) {
			return obj.getCreditDateTime();
		}

		@Override
		public void setValue(CashSettlement obj, ISODateTime value) {
			obj.setCreditDateTime(value);
		}
	};
	protected PaymentInstruction relatedPaymentInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PaymentInstruction which is the source of the settlement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashSettlement, PaymentInstruction> mmRelatedPaymentInstruction = new MMBusinessAssociationEnd<CashSettlement, PaymentInstruction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentInstruction";
			definition = "PaymentInstruction which is the source of the settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInstruction.mmObject();
		}

		@Override
		public PaymentInstruction getValue(CashSettlement obj) {
			return obj.getRelatedPaymentInstruction();
		}

		@Override
		public void setValue(CashSettlement obj, PaymentInstruction value) {
			obj.setRelatedPaymentInstruction(value);
		}
	};
	protected SettlementMethodCode settlementMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to settle the (batch of) payment instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashSettlement, SettlementMethodCode> mmSettlementMethod = new MMBusinessAttribute<CashSettlement, SettlementMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementMethodCode.mmObject();
		}

		@Override
		public SettlementMethodCode getValue(CashSettlement obj) {
			return obj.getSettlementMethod();
		}

		@Override
		public void setValue(CashSettlement obj, SettlementMethodCode value) {
			obj.setSettlementMethod(value);
		}
	};
	protected CashAccount settlementAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedSettlementInstruction
	 * CashAccount.mmRelatedSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A specific purpose account used to post debit and credit entries as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashSettlement, Optional<CashAccount>> mmSettlementAccount = new MMBusinessAssociationEnd<CashSettlement, Optional<CashAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CashAccount.mmRelatedSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}

		@Override
		public Optional<CashAccount> getValue(CashSettlement obj) {
			return obj.getSettlementAccount();
		}

		@Override
		public void setValue(CashSettlement obj, Optional<CashAccount> value) {
			obj.setSettlementAccount(value.orElse(null));
		}
	};
	protected ISODateTime debitDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the occurred settlement time(s) of the payment transaction for the debit side."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashSettlement, ISODateTime> mmDebitDateTime = new MMBusinessAttribute<CashSettlement, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the debit side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CashSettlement obj) {
			return obj.getDebitDateTime();
		}

		@Override
		public void setValue(CashSettlement obj, ISODateTime value) {
			obj.setDebitDateTime(value);
		}
	};
	protected List<CashSettlementInstructionPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmSettlementInstruction
	 * CashSettlementInstructionPartyRole.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
	 * CashSettlementInstructionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashSettlement, List<CashSettlementInstructionPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<CashSettlement, List<CashSettlementInstructionPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow.";
			minOccurs = 0;
			opposite_lazy = () -> CashSettlementInstructionPartyRole.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
		}

		@Override
		public List<CashSettlementInstructionPartyRole> getValue(CashSettlement obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(CashSettlement obj, List<CashSettlementInstructionPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected List<TransactionAdministrator> relatedTransactionAdministrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmSettlementInstruction
	 * TransactionAdministrator.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransactionAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction administrator which manages the related settlement instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashSettlement, List<TransactionAdministrator>> mmRelatedTransactionAdministrator = new MMBusinessAssociationEnd<CashSettlement, List<TransactionAdministrator>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransactionAdministrator";
			definition = "Transaction administrator which manages the related settlement instructions.";
			minOccurs = 0;
			opposite_lazy = () -> TransactionAdministrator.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TransactionAdministrator.mmObject();
		}

		@Override
		public List<TransactionAdministrator> getValue(CashSettlement obj) {
			return obj.getRelatedTransactionAdministrator();
		}

		@Override
		public void setValue(CashSettlement obj, List<TransactionAdministrator> value) {
			obj.setRelatedTransactionAdministrator(value);
		}
	};
	protected BookEntry bookEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmRelatedSettlementInstruction
	 * BookEntry.mmRelatedSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashSettlement, Optional<BookEntry>> mmBookEntry = new MMBusinessAssociationEnd<CashSettlement, Optional<BookEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.mmRelatedSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}

		@Override
		public Optional<BookEntry> getValue(CashSettlement obj) {
			return obj.getBookEntry();
		}

		@Override
		public void setValue(CashSettlement obj, Optional<BookEntry> value) {
			obj.setBookEntry(value.orElse(null));
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmCoverCorrection
	 * PaymentInvestigationCaseResolution.mmCoverCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case resolution which is the source of the correction of a settlement instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashSettlement, Optional<PaymentInvestigationCaseResolution>> mmRelatedInvestigationCase = new MMBusinessAssociationEnd<CashSettlement, Optional<PaymentInvestigationCaseResolution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case resolution which is the source of the correction of a settlement instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentInvestigationCaseResolution.mmCoverCorrection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}

		@Override
		public Optional<PaymentInvestigationCaseResolution> getValue(CashSettlement obj) {
			return obj.getRelatedInvestigationCase();
		}

		@Override
		public void setValue(CashSettlement obj, Optional<PaymentInvestigationCaseResolution> value) {
			obj.setRelatedInvestigationCase(value.orElse(null));
		}
	};
	protected Reservation reservation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reservation#mmSettlementInstruction
	 * Reservation.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reservation
	 * Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Liquidity set aside by the payer for specific purposes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashSettlement, Optional<Reservation>> mmReservation = new MMBusinessAssociationEnd<CashSettlement, Optional<Reservation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Liquidity set aside by the payer for specific purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reservation.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
		}

		@Override
		public Optional<Reservation> getValue(CashSettlement obj) {
			return obj.getReservation();
		}

		@Override
		public void setValue(CashSettlement obj, Optional<Reservation> value) {
			obj.setReservation(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashSettlement";
				definition = "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties.";
				associationDomain_lazy = () -> Arrays.asList(CashAccount.mmRelatedSettlementInstruction, PaymentInstruction.mmSettlementInstruction, TransactionAdministrator.mmSettlementInstruction,
						com.tools20022.repository.entity.Reservation.mmSettlementInstruction, com.tools20022.repository.entity.BookEntry.mmRelatedSettlementInstruction, CashSettlementInstructionPartyRole.mmSettlementInstruction,
						PaymentInvestigationCaseResolution.mmCoverCorrection);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashSettlement.mmInterbankSettlementAmount, com.tools20022.repository.entity.CashSettlement.mmInterbankSettlementDate,
						com.tools20022.repository.entity.CashSettlement.mmRTGS, com.tools20022.repository.entity.CashSettlement.mmCreditDateTime, com.tools20022.repository.entity.CashSettlement.mmRelatedPaymentInstruction,
						com.tools20022.repository.entity.CashSettlement.mmSettlementMethod, com.tools20022.repository.entity.CashSettlement.mmSettlementAccount, com.tools20022.repository.entity.CashSettlement.mmDebitDateTime,
						com.tools20022.repository.entity.CashSettlement.mmPartyRole, com.tools20022.repository.entity.CashSettlement.mmRelatedTransactionAdministrator, com.tools20022.repository.entity.CashSettlement.mmBookEntry,
						com.tools20022.repository.entity.CashSettlement.mmRelatedInvestigationCase, com.tools20022.repository.entity.CashSettlement.mmReservation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashSettlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getInterbankSettlementAmount() {
		return interbankSettlementAmount;
	}

	public CashSettlement setInterbankSettlementAmount(CurrencyAndAmount interbankSettlementAmount) {
		this.interbankSettlementAmount = Objects.requireNonNull(interbankSettlementAmount);
		return this;
	}

	public ISODateTime getInterbankSettlementDate() {
		return interbankSettlementDate;
	}

	public CashSettlement setInterbankSettlementDate(ISODateTime interbankSettlementDate) {
		this.interbankSettlementDate = Objects.requireNonNull(interbankSettlementDate);
		return this;
	}

	public Max4AlphaNumericText getRTGS() {
		return rTGS;
	}

	public CashSettlement setRTGS(Max4AlphaNumericText rTGS) {
		this.rTGS = Objects.requireNonNull(rTGS);
		return this;
	}

	public ISODateTime getCreditDateTime() {
		return creditDateTime;
	}

	public CashSettlement setCreditDateTime(ISODateTime creditDateTime) {
		this.creditDateTime = Objects.requireNonNull(creditDateTime);
		return this;
	}

	public PaymentInstruction getRelatedPaymentInstruction() {
		return relatedPaymentInstruction;
	}

	public CashSettlement setRelatedPaymentInstruction(PaymentInstruction relatedPaymentInstruction) {
		this.relatedPaymentInstruction = Objects.requireNonNull(relatedPaymentInstruction);
		return this;
	}

	public SettlementMethodCode getSettlementMethod() {
		return settlementMethod;
	}

	public CashSettlement setSettlementMethod(SettlementMethodCode settlementMethod) {
		this.settlementMethod = Objects.requireNonNull(settlementMethod);
		return this;
	}

	public Optional<CashAccount> getSettlementAccount() {
		return settlementAccount == null ? Optional.empty() : Optional.of(settlementAccount);
	}

	public CashSettlement setSettlementAccount(CashAccount settlementAccount) {
		this.settlementAccount = settlementAccount;
		return this;
	}

	public ISODateTime getDebitDateTime() {
		return debitDateTime;
	}

	public CashSettlement setDebitDateTime(ISODateTime debitDateTime) {
		this.debitDateTime = Objects.requireNonNull(debitDateTime);
		return this;
	}

	public List<CashSettlementInstructionPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public CashSettlement setPartyRole(List<CashSettlementInstructionPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public List<TransactionAdministrator> getRelatedTransactionAdministrator() {
		return relatedTransactionAdministrator == null ? relatedTransactionAdministrator = new ArrayList<>() : relatedTransactionAdministrator;
	}

	public CashSettlement setRelatedTransactionAdministrator(List<TransactionAdministrator> relatedTransactionAdministrator) {
		this.relatedTransactionAdministrator = Objects.requireNonNull(relatedTransactionAdministrator);
		return this;
	}

	public Optional<BookEntry> getBookEntry() {
		return bookEntry == null ? Optional.empty() : Optional.of(bookEntry);
	}

	public CashSettlement setBookEntry(com.tools20022.repository.entity.BookEntry bookEntry) {
		this.bookEntry = bookEntry;
		return this;
	}

	public Optional<PaymentInvestigationCaseResolution> getRelatedInvestigationCase() {
		return relatedInvestigationCase == null ? Optional.empty() : Optional.of(relatedInvestigationCase);
	}

	public CashSettlement setRelatedInvestigationCase(PaymentInvestigationCaseResolution relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
		return this;
	}

	public Optional<Reservation> getReservation() {
		return reservation == null ? Optional.empty() : Optional.of(reservation);
	}

	public CashSettlement setReservation(com.tools20022.repository.entity.Reservation reservation) {
		this.reservation = reservation;
		return this;
	}
}