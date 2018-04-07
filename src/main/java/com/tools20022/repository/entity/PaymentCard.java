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
import com.tools20022.repository.codeset.CardAccountTypeCode;
import com.tools20022.repository.codeset.CardTypeCode;
import com.tools20022.repository.codeset.CSCManagementCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Electronic money product that provides the cardholder with a portable and
 * specialised computer device that typically contains a microprocessor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentCard" src="doc-files/PaymentCard.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmPayment
 * PaymentCard.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmType
 * PaymentCard.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmNumber
 * PaymentCard.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmStartDate
 * PaymentCard.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmExpiryDate
 * PaymentCard.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmSecurityCode
 * PaymentCard.mmSecurityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSequenceNumber
 * PaymentCard.mmSequenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmServiceCode
 * PaymentCard.mmServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmTrackValue
 * PaymentCard.mmTrackValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSecurityCodeManagement
 * PaymentCard.mmSecurityCodeManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmCardBrand
 * PaymentCard.mmCardBrand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccount
 * PaymentCard.mmRelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmProfileNumber
 * PaymentCard.mmProfileNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccountType
 * PaymentCard.mmRelatedAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCreditAvailableAmount
 * PaymentCard.mmCreditAvailableAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmLimit
 * PaymentCard.mmLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCurrencyCode
 * PaymentCard.mmCardCurrencyCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmInterest
 * PaymentCard.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCountryCode
 * PaymentCard.mmCardCountryCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmCardProgramme
 * PaymentCard.mmCardProgramme}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedPaymentCard
 * Country.mmRelatedPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedPaymentCard
 * CashAccount.mmRelatedPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
 * CardPayment.mmPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmRelatedPaymentCard
 * Limit.mmRelatedPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedPaymentCard
 * Interest.mmRelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#mmEffectiveDate
 * PlainCardData9.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#mmExpiryDate
 * PlainCardData9.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#mmTrackData
 * PlainCardData9.mmTrackData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData11#mmEffectiveDate
 * PlainCardData11.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData11#mmExpiryDate
 * PlainCardData11.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData10#mmEffectiveDate
 * PlainCardData10.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10#mmExpiryDate
 * PlainCardData10.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10#mmTrackData
 * PlainCardData10.mmTrackData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData12#mmExpiryDate
 * PlainCardData12.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData15#mmEffectiveDate
 * PlainCardData15.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#mmExpiryDate
 * PlainCardData15.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData18#mmEffectiveDate
 * PlainCardData18.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#mmExpiryDate
 * PlainCardData18.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData19#mmEffectiveDate
 * PlainCardData19.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData19#mmExpiryDate
 * PlainCardData19.mmExpiryDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TrackData1 TrackData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9 PlainCardData9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData11
 * PlainCardData11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10
 * PlainCardData10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard12 PaymentCard12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData12
 * PlainCardData12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard13 PaymentCard13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard15 PaymentCard15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard14 PaymentCard14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData17
 * PlainCardData17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15
 * PlainCardData15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard23 PaymentCard23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard22 PaymentCard22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18
 * PlainCardData18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData19
 * PlainCardData19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
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
 * "PaymentCard"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Electronic money product that provides the cardholder with a portable and specialised computer device that typically contains a microprocessor."
 * </li>
 * </ul>
 */
public class PaymentCard {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPayment payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which a payment card is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentCard, Optional<CardPayment>> mmPayment = new MMBusinessAssociationEnd<PaymentCard, Optional<CardPayment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a payment card is used.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CardPayment.mmPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardPayment.mmObject();
		}

		@Override
		public Optional<CardPayment> getValue(PaymentCard obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(PaymentCard obj, Optional<CardPayment> value) {
			obj.setPayment(value.orElse(null));
		}
	};
	protected CardTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CardTypeCode
	 * CardTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of card, eg, credit card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, CardTypeCode> mmType = new MMBusinessAttribute<PaymentCard, CardTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of card, eg, credit card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardTypeCode.mmObject();
		}

		@Override
		public CardTypeCode getValue(PaymentCard obj) {
			return obj.getType();
		}

		@Override
		public void setValue(PaymentCard obj, CardTypeCode value) {
			obj.setType(value);
		}
	};
	protected Max35Text number;
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
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData9#mmPAN
	 * PlainCardData9.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData11#mmPAN
	 * PlainCardData11.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData10#mmPAN
	 * PlainCardData10.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData12#mmPAN
	 * PlainCardData12.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData17#mmPAN
	 * PlainCardData17.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData15#mmPAN
	 * PlainCardData15.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData18#mmPAN
	 * PlainCardData18.mmPAN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData19#mmPAN
	 * PlainCardData19.mmPAN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number embossed on a card that links the card to the account owner and account servicer (sometimes called personal account number or PAN)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, Max35Text> mmNumber = new MMBusinessAttribute<PaymentCard, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PlainCardData9.mmPAN, PlainCardData11.mmPAN, PlainCardData10.mmPAN, PlainCardData12.mmPAN, PlainCardData17.mmPAN, PlainCardData15.mmPAN, PlainCardData18.mmPAN, PlainCardData19.mmPAN);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Number embossed on a card that links the card to the account owner and account servicer (sometimes called personal account number or PAN).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentCard obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(PaymentCard obj, Max35Text value) {
			obj.setNumber(value);
		}
	};
	protected ISOYearMonth startDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year and month the card is available for use."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, ISOYearMonth> mmStartDate = new MMBusinessAttribute<PaymentCard, ISOYearMonth>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Year and month the card is available for use.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		@Override
		public ISOYearMonth getValue(PaymentCard obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(PaymentCard obj, ISOYearMonth value) {
			obj.setStartDate(value);
		}
	};
	protected ISOYearMonth expiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year and month the card expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, ISOYearMonth> mmExpiryDate = new MMBusinessAttribute<PaymentCard, ISOYearMonth>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Year and month the card expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		@Override
		public ISOYearMonth getValue(PaymentCard obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(PaymentCard obj, ISOYearMonth value) {
			obj.setExpiryDate(value);
		}
	};
	protected Max35Text securityCode;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security code written on the card, sometimes called card security code (CSC)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, Max35Text> mmSecurityCode = new MMBusinessAttribute<PaymentCard, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityCode";
			definition = "Security code written on the card, sometimes called card security code (CSC).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentCard obj) {
			return obj.getSecurityCode();
		}

		@Override
		public void setValue(PaymentCard obj, Max35Text value) {
			obj.setSecurityCode(value);
		}
	};
	protected Max35Text sequenceNumber;
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
	 * {@linkplain com.tools20022.repository.msg.PlainCardData9#mmCardSequenceNumber
	 * PlainCardData9.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData11#mmCardSequenceNumber
	 * PlainCardData11.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData10#mmCardSequenceNumber
	 * PlainCardData10.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData12#mmCardSequenceNumber
	 * PlainCardData12.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15#mmCardSequenceNumber
	 * PlainCardData15.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18#mmCardSequenceNumber
	 * PlainCardData18.mmCardSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData19#mmCardSequenceNumber
	 * PlainCardData19.mmCardSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a card inside a set of cards with the same number (or PAN)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, Max35Text> mmSequenceNumber = new MMBusinessAttribute<PaymentCard, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PlainCardData9.mmCardSequenceNumber, PlainCardData11.mmCardSequenceNumber, PlainCardData10.mmCardSequenceNumber, PlainCardData12.mmCardSequenceNumber, PlainCardData15.mmCardSequenceNumber,
					PlainCardData18.mmCardSequenceNumber, PlainCardData19.mmCardSequenceNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SequenceNumber";
			definition = "Identifies a card inside a set of cards with the same number (or PAN).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentCard obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(PaymentCard obj, Max35Text value) {
			obj.setSequenceNumber(value);
		}
	};
	protected Exact3NumericText serviceCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData9#mmServiceCode
	 * PlainCardData9.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData11#mmServiceCode
	 * PlainCardData11.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData10#mmServiceCode
	 * PlainCardData10.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData15#mmServiceCode
	 * PlainCardData15.mmServiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlainCardData18#mmServiceCode
	 * PlainCardData18.mmServiceCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Services attached to the card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, Exact3NumericText> mmServiceCode = new MMBusinessAttribute<PaymentCard, Exact3NumericText>() {
		{
			derivation_lazy = () -> Arrays.asList(PlainCardData9.mmServiceCode, PlainCardData11.mmServiceCode, PlainCardData10.mmServiceCode, PlainCardData15.mmServiceCode, PlainCardData18.mmServiceCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ServiceCode";
			definition = "Services attached to the card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(PaymentCard obj) {
			return obj.getServiceCode();
		}

		@Override
		public void setValue(PaymentCard obj, Exact3NumericText value) {
			obj.setServiceCode(value);
		}
	};
	protected Max140Text trackValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TrackData1#mmTrackValue
	 * TrackData1.mmTrackValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrackValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card track content or equivalent."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, Max140Text> mmTrackValue = new MMBusinessAttribute<PaymentCard, Max140Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TrackData1.mmTrackValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TrackValue";
			definition = "Card track content or equivalent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(PaymentCard obj) {
			return obj.getTrackValue();
		}

		@Override
		public void setValue(PaymentCard obj, Max140Text value) {
			obj.setTrackValue(value);
		}
	};
	protected CSCManagementCode securityCodeManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCodeManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card Security Code management associated with the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, CSCManagementCode> mmSecurityCodeManagement = new MMBusinessAttribute<PaymentCard, CSCManagementCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityCodeManagement";
			definition = "Card Security Code management associated with the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CSCManagementCode.mmObject();
		}

		@Override
		public CSCManagementCode getValue(PaymentCard obj) {
			return obj.getSecurityCodeManagement();
		}

		@Override
		public void setValue(PaymentCard obj, CSCManagementCode value) {
			obj.setSecurityCodeManagement(value);
		}
	};
	protected Max35Text cardBrand;
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
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard28#mmCardBrand
	 * PaymentCard28.mmCardBrand}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardBrand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Brand name of the card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, Max35Text> mmCardBrand = new MMBusinessAttribute<PaymentCard, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard28.mmCardBrand);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentCard obj) {
			return obj.getCardBrand();
		}

		@Override
		public void setValue(PaymentCard obj, Max35Text value) {
			obj.setCardBrand(value);
		}
	};
	protected List<CashAccount> relatedAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedPaymentCard
	 * CashAccount.mmRelatedPaymentCard}</li>
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account linked to the card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentCard, List<CashAccount>> mmRelatedAccount = new MMBusinessAssociationEnd<PaymentCard, List<CashAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccount";
			definition = "Account linked to the card.";
			minOccurs = 0;
			opposite_lazy = () -> CashAccount.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}

		@Override
		public List<CashAccount> getValue(PaymentCard obj) {
			return obj.getRelatedAccount();
		}

		@Override
		public void setValue(PaymentCard obj, List<CashAccount> value) {
			obj.setRelatedAccount(value);
		}
	};
	protected Max5NumericText profileNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines a category of cards related the acceptance processing rules defined by the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, Max5NumericText> mmProfileNumber = new MMBusinessAttribute<PaymentCard, Max5NumericText>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProfileNumber";
			definition = "Defines a category of cards related the acceptance processing rules defined by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		@Override
		public Max5NumericText getValue(PaymentCard obj) {
			return obj.getProfileNumber();
		}

		@Override
		public void setValue(PaymentCard obj, Max5NumericText value) {
			obj.setProfileNumber(value);
		}
	};
	protected CardAccountTypeCode relatedAccountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
	 * CardAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount1#mmSelectedAccountType
	 * CardAccount1.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount2#mmSelectedAccountType
	 * CardAccount2.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#mmAccountType
	 * CardPaymentTransactionDetails32.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#mmAccountType
	 * CardPaymentTransactionDetails28.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails44#mmAccountType
	 * CardPaymentTransactionDetails44.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45#mmAccountType
	 * CardPaymentTransactionDetails45.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount14#mmSelectedAccountType
	 * CardAccount14.mmSelectedAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cardholder account used for the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, CardAccountTypeCode> mmRelatedAccountType = new MMBusinessAttribute<PaymentCard, CardAccountTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CardAccount1.mmSelectedAccountType, CardAccount2.mmSelectedAccountType, CardPaymentTransactionDetails32.mmAccountType, CardPaymentTransactionDetails28.mmAccountType,
					CardPaymentTransactionDetails44.mmAccountType, CardPaymentTransactionDetails45.mmAccountType, CardAccount14.mmSelectedAccountType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountType";
			definition = "Type of cardholder account used for the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardAccountTypeCode.mmObject();
		}

		@Override
		public CardAccountTypeCode getValue(PaymentCard obj) {
			return obj.getRelatedAccountType();
		}

		@Override
		public void setValue(PaymentCard obj, CardAccountTypeCode value) {
			obj.setRelatedAccountType(value);
		}
	};
	protected CurrencyAndAmount creditAvailableAmount;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAvailableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the credit available for this financial card."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, CurrencyAndAmount> mmCreditAvailableAmount = new MMBusinessAttribute<PaymentCard, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditAvailableAmount";
			definition = "Monetary value of the credit available for this financial card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(PaymentCard obj) {
			return obj.getCreditAvailableAmount();
		}

		@Override
		public void setValue(PaymentCard obj, CurrencyAndAmount value) {
			obj.setCreditAvailableAmount(value);
		}
	};
	protected List<Limit> limit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmRelatedPaymentCard
	 * Limit.mmRelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction14#mmLimits
	 * ATMTransaction14.mmLimits}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17#mmLimits
	 * ATMTransaction17.mmLimits}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit specified on a payment card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentCard, List<Limit>> mmLimit = new MMBusinessAssociationEnd<PaymentCard, List<Limit>>() {
		{
			derivation_lazy = () -> Arrays.asList(ATMTransaction14.mmLimits, ATMTransaction17.mmLimits);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Limit";
			definition = "Limit specified on a payment card.";
			minOccurs = 0;
			opposite_lazy = () -> Limit.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Limit.mmObject();
		}

		@Override
		public List<Limit> getValue(PaymentCard obj) {
			return obj.getLimit();
		}

		@Override
		public void setValue(PaymentCard obj, List<Limit> value) {
			obj.setLimit(value);
		}
	};
	protected CurrencyCode cardCurrencyCode;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14#mmCardCurrencyCode
	 * PaymentCard14.mmCardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard23#mmCardCurrencyCode
	 * PaymentCard23.mmCardCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency code of the card issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, CurrencyCode> mmCardCurrencyCode = new MMBusinessAttribute<PaymentCard, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard14.mmCardCurrencyCode, PaymentCard23.mmCardCurrencyCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardCurrencyCode";
			definition = "Currency code of the card issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(PaymentCard obj) {
			return obj.getCardCurrencyCode();
		}

		@Override
		public void setValue(PaymentCard obj, CurrencyCode value) {
			obj.setCardCurrencyCode(value);
		}
	};
	protected Interest interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedPaymentCard
	 * Interest.mmRelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest applied on amounts due for credit card payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentCard, Interest> mmInterest = new MMBusinessAssociationEnd<PaymentCard, Interest>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest applied on amounts due for credit card payments.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Interest.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Interest.mmObject();
		}

		@Override
		public Interest getValue(PaymentCard obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(PaymentCard obj, Interest value) {
			obj.setInterest(value);
		}
	};
	protected Country cardCountryCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedPaymentCard
	 * Country.mmRelatedPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmCardCountryCode
	 * PaymentCard12.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14#mmCardCountryCode
	 * PaymentCard14.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard23#mmCardCountryCode
	 * PaymentCard23.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard22#mmCardCountryCode
	 * PaymentCard22.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmCardCountryCode
	 * PaymentCard28.mmCardCountryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country code attached to the card by the card issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentCard, Country> mmCardCountryCode = new MMBusinessAssociationEnd<PaymentCard, Country>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard12.mmCardCountryCode, PaymentCard14.mmCardCountryCode, PaymentCard23.mmCardCountryCode, PaymentCard22.mmCardCountryCode, PaymentCard28.mmCardCountryCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardCountryCode";
			definition = "Country code attached to the card by the card issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Country.mmRelatedPaymentCard;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}

		@Override
		public Country getValue(PaymentCard obj) {
			return obj.getCardCountryCode();
		}

		@Override
		public void setValue(PaymentCard obj, Country value) {
			obj.setCardCountryCode(value);
		}
	};
	protected Max35Text cardProgramme;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmCardProductSubType
	 * PaymentCard28.mmCardProductSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction83#mmCardProgrammeProposed
	 * CardPaymentTransaction83.mmCardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction83#mmCardProgrammeApplied
	 * CardPaymentTransaction83.mmCardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction81#mmCardProgrammeProposed
	 * CardPaymentTransaction81.mmCardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction81#mmCardProgrammeApplied
	 * CardPaymentTransaction81.mmCardProgrammeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmCardProgrammeProposed
	 * CardPaymentTransaction80.mmCardProgrammeProposed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmCardProgrammeApplied
	 * CardPaymentTransaction80.mmCardProgrammeApplied}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProgramme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The card programme associated by a retailer to a cardholder among a series of payment programmes offered by the retailer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentCard, Max35Text> mmCardProgramme = new MMBusinessAttribute<PaymentCard, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCard28.mmCardProductSubType, CardPaymentTransaction83.mmCardProgrammeProposed, CardPaymentTransaction83.mmCardProgrammeApplied, CardPaymentTransaction81.mmCardProgrammeProposed,
					CardPaymentTransaction81.mmCardProgrammeApplied, CardPaymentTransaction80.mmCardProgrammeProposed, CardPaymentTransaction80.mmCardProgrammeApplied);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardProgramme";
			definition = "The card programme associated by a retailer to a cardholder among a series of payment programmes offered by the retailer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentCard obj) {
			return obj.getCardProgramme();
		}

		@Override
		public void setValue(PaymentCard obj, Max35Text value) {
			obj.setCardProgramme(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard";
				definition = "Electronic money product that provides the cardholder with a portable and specialised computer device that typically contains a microprocessor.";
				associationDomain_lazy = () -> Arrays.asList(Country.mmRelatedPaymentCard, CashAccount.mmRelatedPaymentCard, CardPayment.mmPaymentCard, Limit.mmRelatedPaymentCard, Interest.mmRelatedPaymentCard);
				derivationElement_lazy = () -> Arrays.asList(PlainCardData9.mmEffectiveDate, PlainCardData9.mmExpiryDate, PlainCardData9.mmTrackData, PlainCardData11.mmEffectiveDate, PlainCardData11.mmExpiryDate,
						PlainCardData10.mmEffectiveDate, PlainCardData10.mmExpiryDate, PlainCardData10.mmTrackData, PlainCardData12.mmExpiryDate, PlainCardData15.mmEffectiveDate, PlainCardData15.mmExpiryDate,
						PlainCardData18.mmEffectiveDate, PlainCardData18.mmExpiryDate, PlainCardData19.mmEffectiveDate, PlainCardData19.mmExpiryDate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentCard.mmPayment, com.tools20022.repository.entity.PaymentCard.mmType, com.tools20022.repository.entity.PaymentCard.mmNumber,
						com.tools20022.repository.entity.PaymentCard.mmStartDate, com.tools20022.repository.entity.PaymentCard.mmExpiryDate, com.tools20022.repository.entity.PaymentCard.mmSecurityCode,
						com.tools20022.repository.entity.PaymentCard.mmSequenceNumber, com.tools20022.repository.entity.PaymentCard.mmServiceCode, com.tools20022.repository.entity.PaymentCard.mmTrackValue,
						com.tools20022.repository.entity.PaymentCard.mmSecurityCodeManagement, com.tools20022.repository.entity.PaymentCard.mmCardBrand, com.tools20022.repository.entity.PaymentCard.mmRelatedAccount,
						com.tools20022.repository.entity.PaymentCard.mmProfileNumber, com.tools20022.repository.entity.PaymentCard.mmRelatedAccountType, com.tools20022.repository.entity.PaymentCard.mmCreditAvailableAmount,
						com.tools20022.repository.entity.PaymentCard.mmLimit, com.tools20022.repository.entity.PaymentCard.mmCardCurrencyCode, com.tools20022.repository.entity.PaymentCard.mmInterest,
						com.tools20022.repository.entity.PaymentCard.mmCardCountryCode, com.tools20022.repository.entity.PaymentCard.mmCardProgramme);
				derivationComponent_lazy = () -> Arrays.asList(TrackData1.mmObject(), PlainCardData9.mmObject(), PlainCardData11.mmObject(), PlainCardData10.mmObject(), PaymentCard12.mmObject(), PlainCardData12.mmObject(),
						PaymentCard13.mmObject(), PaymentCard15.mmObject(), PaymentCard14.mmObject(), PlainCardData17.mmObject(), PlainCardData15.mmObject(), PaymentCard23.mmObject(), PaymentCard22.mmObject(), PlainCardData18.mmObject(),
						PlainCardData19.mmObject(), PaymentCard28.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentCard.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CardPayment> getPayment() {
		return payment == null ? Optional.empty() : Optional.of(payment);
	}

	public PaymentCard setPayment(CardPayment payment) {
		this.payment = payment;
		return this;
	}

	public CardTypeCode getType() {
		return type;
	}

	public PaymentCard setType(CardTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Max35Text getNumber() {
		return number;
	}

	public PaymentCard setNumber(Max35Text number) {
		this.number = Objects.requireNonNull(number);
		return this;
	}

	public ISOYearMonth getStartDate() {
		return startDate;
	}

	public PaymentCard setStartDate(ISOYearMonth startDate) {
		this.startDate = Objects.requireNonNull(startDate);
		return this;
	}

	public ISOYearMonth getExpiryDate() {
		return expiryDate;
	}

	public PaymentCard setExpiryDate(ISOYearMonth expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public Max35Text getSecurityCode() {
		return securityCode;
	}

	public PaymentCard setSecurityCode(Max35Text securityCode) {
		this.securityCode = Objects.requireNonNull(securityCode);
		return this;
	}

	public Max35Text getSequenceNumber() {
		return sequenceNumber;
	}

	public PaymentCard setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = Objects.requireNonNull(sequenceNumber);
		return this;
	}

	public Exact3NumericText getServiceCode() {
		return serviceCode;
	}

	public PaymentCard setServiceCode(Exact3NumericText serviceCode) {
		this.serviceCode = Objects.requireNonNull(serviceCode);
		return this;
	}

	public Max140Text getTrackValue() {
		return trackValue;
	}

	public PaymentCard setTrackValue(Max140Text trackValue) {
		this.trackValue = Objects.requireNonNull(trackValue);
		return this;
	}

	public CSCManagementCode getSecurityCodeManagement() {
		return securityCodeManagement;
	}

	public PaymentCard setSecurityCodeManagement(CSCManagementCode securityCodeManagement) {
		this.securityCodeManagement = Objects.requireNonNull(securityCodeManagement);
		return this;
	}

	public Max35Text getCardBrand() {
		return cardBrand;
	}

	public PaymentCard setCardBrand(Max35Text cardBrand) {
		this.cardBrand = Objects.requireNonNull(cardBrand);
		return this;
	}

	public List<CashAccount> getRelatedAccount() {
		return relatedAccount == null ? relatedAccount = new ArrayList<>() : relatedAccount;
	}

	public PaymentCard setRelatedAccount(List<CashAccount> relatedAccount) {
		this.relatedAccount = Objects.requireNonNull(relatedAccount);
		return this;
	}

	public Max5NumericText getProfileNumber() {
		return profileNumber;
	}

	public PaymentCard setProfileNumber(Max5NumericText profileNumber) {
		this.profileNumber = Objects.requireNonNull(profileNumber);
		return this;
	}

	public CardAccountTypeCode getRelatedAccountType() {
		return relatedAccountType;
	}

	public PaymentCard setRelatedAccountType(CardAccountTypeCode relatedAccountType) {
		this.relatedAccountType = Objects.requireNonNull(relatedAccountType);
		return this;
	}

	public CurrencyAndAmount getCreditAvailableAmount() {
		return creditAvailableAmount;
	}

	public PaymentCard setCreditAvailableAmount(CurrencyAndAmount creditAvailableAmount) {
		this.creditAvailableAmount = Objects.requireNonNull(creditAvailableAmount);
		return this;
	}

	public List<Limit> getLimit() {
		return limit == null ? limit = new ArrayList<>() : limit;
	}

	public PaymentCard setLimit(List<Limit> limit) {
		this.limit = Objects.requireNonNull(limit);
		return this;
	}

	public CurrencyCode getCardCurrencyCode() {
		return cardCurrencyCode;
	}

	public PaymentCard setCardCurrencyCode(CurrencyCode cardCurrencyCode) {
		this.cardCurrencyCode = Objects.requireNonNull(cardCurrencyCode);
		return this;
	}

	public Interest getInterest() {
		return interest;
	}

	public PaymentCard setInterest(Interest interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public Country getCardCountryCode() {
		return cardCountryCode;
	}

	public PaymentCard setCardCountryCode(Country cardCountryCode) {
		this.cardCountryCode = Objects.requireNonNull(cardCountryCode);
		return this;
	}

	public Max35Text getCardProgramme() {
		return cardProgramme;
	}

	public PaymentCard setCardProgramme(Max35Text cardProgramme) {
		this.cardProgramme = Objects.requireNonNull(cardProgramme);
		return this;
	}
}