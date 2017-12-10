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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ExternalCardTransactionCategoryCode;
import com.tools20022.repository.codeset.TypeOfAmountCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Payment through an electronic money product.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPayment" src="doc-files/CardPayment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
 * CardPayment.mmPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
 * CardPayment.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
 * CardPayment.mmDetailedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmAmountQualifier
 * CardPayment.mmAmountQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
 * CardPayment.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCardPartyRole
 * CardPayment.mmPaymentCardPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentStatus
 * CardPayment.mmCardPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmountLabel
 * CardPayment.mmDetailedAmountLabel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmReconciliation
 * CardPayment.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmTransactionCategory
 * CardPayment.mmTransactionCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCashBackAmount
 * CardPayment.mmCashBackAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmGratuity
 * CardPayment.mmGratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDebitCreditDirection
 * CardPayment.mmDebitCreditDirection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmATMTotal
 * CardPayment.mmATMTotal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmCardPayment
 * Product.mmCardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmPayment
 * PaymentCard.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#mmCardPayment
 * CardPaymentPartyRole.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmRelatedCardPayment
 * CardPaymentAcquiring.mmRelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCardPaymentTotal
 * ReconciliationTransaction.mmCardPaymentTotal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmCardPayment
 * CardPaymentStatus.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmRelatedCardPayment
 * ATMTotal.mmRelatedCardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4#mmEnvironment
 * AcceptorDiagnosticResponse4.mmEnvironment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12#mmFees
 * DetailedAmount12.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12#mmDonation
 * DetailedAmount12.mmDonation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionDetails
 * CardTransaction4.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionDetails
 * CardTransaction8.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionDetails
 * CardTransaction5.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionDetails
 * CardTransaction15.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmTransactionDetails
 * CardTransaction7.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmTransactionDetails
 * CardTransaction6.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmCashBack
 * DetailedAmount15.mmCashBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmGratuity
 * DetailedAmount15.mmGratuity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmFees
 * DetailedAmount15.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmRebate
 * DetailedAmount15.mmRebate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount15#mmValueAddedTax
 * DetailedAmount15.mmValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#mmTransactionDetails
 * CardPaymentTransaction57.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmIndividualPayment
 * AggregationTransaction2.mmIndividualPayment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16#mmFees
 * DetailedAmount16.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16#mmDonation
 * DetailedAmount16.mmDonation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount17#mmFees
 * DetailedAmount17.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount17#mmDonation
 * DetailedAmount17.mmDonation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4#mmEnvironment
 * AcceptorCurrencyConversionResponse4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4#mmTransaction
 * AcceptorCurrencyConversionResponse4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest6#mmEnvironment
 * AcceptorCancellationRequest6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest6#mmTransaction
 * AcceptorCancellationRequest6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest6#mmEnvironment
 * AcceptorDiagnosticRequest6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6#mmEnvironment
 * AcceptorCancellationAdviceResponse6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest4#mmEnvironment
 * AcceptorCurrencyConversionRequest4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest4#mmTransaction
 * AcceptorCurrencyConversionRequest4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse6#mmEnvironment
 * AcceptorCancellationResponse6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse6#mmTransaction
 * AcceptorCancellationResponse6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse6#mmTransactionResponse
 * AcceptorCancellationResponse6.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6#mmEnvironment
 * AcceptorAuthorisationRequest6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6#mmTransaction
 * AcceptorAuthorisationRequest6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#mmEnvironment
 * AcceptorCancellationAdvice6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#mmTransaction
 * AcceptorCancellationAdvice6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice6#mmEnvironment
 * AcceptorCompletionAdvice6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice6#mmTransaction
 * AcceptorCompletionAdvice6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6#mmEnvironment
 * AcceptorCompletionAdviceResponse6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#mmEnvironment
 * AcceptorAuthorisationResponse6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#mmTransaction
 * AcceptorAuthorisationResponse6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#mmTransactionResponse
 * AcceptorAuthorisationResponse6.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmOriginalTransaction
 * CardPaymentTransaction71.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmTransactionDetails
 * CardPaymentTransaction71.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19#mmEnvironment
 * CardPaymentDataSetTransaction19.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19#mmTransaction
 * CardPaymentDataSetTransaction19.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmOriginalTransaction
 * CardPaymentTransaction75.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmTransactionDetails
 * CardPaymentTransaction75.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmOriginalTransaction
 * CardPaymentTransaction74.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmTransactionDetails
 * CardPaymentTransaction74.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21#mmEnvironment
 * CardPaymentDataSetTransaction21.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21#mmTransaction
 * CardPaymentDataSetTransaction21.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21#mmTransactionResponse
 * CardPaymentDataSetTransaction21.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmOriginalTransaction
 * CardPaymentTransaction70.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmTransactionDetails
 * CardPaymentTransaction70.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#mmEnvironment
 * CardPaymentDataSetTransaction20.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#mmTransaction
 * CardPaymentDataSetTransaction20.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmOriginalTransaction
 * CardPaymentTransaction72.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmTransactionDetails
 * CardPaymentTransaction72.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmOriginalTransaction
 * CardPaymentTransaction76.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmTransactionDetails
 * CardPaymentTransaction76.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#mmEnvironment
 * CardPaymentDataSetTransaction18.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#mmTransaction
 * CardPaymentDataSetTransaction18.mmTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData6#mmEnvironment
 * CommonData6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmOriginalTransaction
 * CardPaymentTransaction69.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmTransactionDetails
 * CardPaymentTransaction69.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1#mmEnvironment
 * AcceptorCurrencyConversionAdvice1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1#mmTransaction
 * AcceptorCurrencyConversionAdvice1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#mmTransactionDetails
 * CardPaymentTransaction77.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#mmTransactionDetails
 * CardPaymentTransaction78.mmTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount4
 * DetailedAmount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection41
 * AmountAndDirection41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4
 * AcceptorDiagnosticResponse4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43
 * CardPaymentEnvironment43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38
 * CardPaymentEnvironment38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndCurrency1
 * AmountAndCurrency1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12
 * DetailedAmount12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8
 * ATMTransaction8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount13
 * DetailedAmount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount11
 * DetailedAmount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount10
 * DetailedAmount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount9
 * DetailedAmount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction4
 * CardTransaction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionAmount2
 * CardTransactionAmount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount8
 * DetailedAmount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionAmount1
 * CardTransactionAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction8
 * CardTransaction8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction5
 * CardTransaction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction15
 * CardTransaction15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction7
 * CardTransaction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail5
 * CardTransactionDetail5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail2
 * CardTransactionDetail2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail1
 * CardTransactionDetail1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction6
 * CardTransaction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail4
 * CardTransactionDetail4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail6
 * CardTransactionDetail6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionAmount5
 * CardTransactionAmount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionAmount3
 * CardTransactionAmount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionAmount4
 * CardTransactionAmount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail3
 * CardTransactionDetail3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32
 * CardPaymentTransactionDetails32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15
 * DetailedAmount15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction52
 * CardPaymentTransaction52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult3
 * CardPaymentTransactionResult3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28
 * CardPaymentTransactionDetails28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction57
 * CardPaymentTransaction57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount14
 * DetailedAmount14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails35
 * CardPaymentTransactionDetails35}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails34
 * CardPaymentTransactionDetails34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction18
 * ATMTransaction18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction14
 * ATMTransaction14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17
 * ATMTransaction17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction20
 * ATMTransaction20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount18
 * DetailedAmount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction13
 * ATMTransaction13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction16
 * ATMTransaction16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction19
 * ATMTransaction19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16
 * DetailedAmount16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction15
 * ATMTransaction15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction21
 * ATMTransaction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction24
 * ATMTransaction24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount17
 * DetailedAmount17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction23
 * ATMTransaction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction29
 * ATMTransaction29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4
 * AcceptorCurrencyConversionResponse4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest6
 * AcceptorCancellationRequest6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest6
 * AcceptorDiagnosticRequest6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6
 * AcceptorCancellationAdviceResponse6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest4
 * AcceptorCurrencyConversionRequest4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse6
 * AcceptorCancellationResponse6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6
 * AcceptorAuthorisationRequest6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6
 * AcceptorCancellationAdvice6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice6
 * AcceptorCompletionAdvice6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6
 * AcceptorCompletionAdviceResponse6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6
 * AcceptorAuthorisationResponse6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction71
 * CardPaymentTransaction71}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39
 * CardPaymentTransactionDetails39}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19
 * CardPaymentDataSetTransaction19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction75
 * CardPaymentTransaction75}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61
 * CardPaymentEnvironment61}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38
 * CardPaymentTransactionDetails38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64
 * CardPaymentEnvironment64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60
 * CardPaymentEnvironment60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment65
 * CardPaymentEnvironment65}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41
 * CardPaymentTransactionDetails41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67
 * CardPaymentEnvironment67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66
 * CardPaymentEnvironment66}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction74
 * CardPaymentTransaction74}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21
 * CardPaymentDataSetTransaction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction67
 * CardPaymentTransaction67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction70
 * CardPaymentTransaction70}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction73
 * CardPaymentTransaction73}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20
 * CardPaymentDataSetTransaction20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
 * CardPaymentEnvironment62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63
 * CardPaymentEnvironment63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction72
 * CardPaymentTransaction72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
 * CardPaymentTransaction76}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction68
 * CardPaymentTransaction68}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18
 * CardPaymentDataSetTransaction18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment58
 * CardPaymentEnvironment58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59
 * CardPaymentEnvironment59}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37
 * CardPaymentTransactionDetails37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData6 CommonData6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57
 * CardPaymentEnvironment57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction69
 * CardPaymentTransaction69}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40
 * CardPaymentTransactionDetails40}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1
 * AcceptorCurrencyConversionAdvice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction77
 * CardPaymentTransaction77}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction78
 * CardPaymentTransaction78}</li>
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
 * "CardPayment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment through an electronic money product."</li>
 * </ul>
 */
public class CardPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentCard paymentCard;
	/**
	 * Specifies the card which is used in a payment by card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmPayment
	 * PaymentCard.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#mmCard
	 * CardPaymentEnvironment61.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmCard
	 * CardPaymentEnvironment60.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66#mmCard
	 * CardPaymentEnvironment66.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmCard
	 * CardPaymentEnvironment62.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63#mmCard
	 * CardPaymentEnvironment63.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59#mmCard
	 * CardPaymentEnvironment59.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#mmCard
	 * CardPaymentEnvironment57.mmCard}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the card which is used in a payment by card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentCard = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentEnvironment61.mmCard, CardPaymentEnvironment60.mmCard, CardPaymentEnvironment66.mmCard, CardPaymentEnvironment62.mmCard, CardPaymentEnvironment63.mmCard,
					CardPaymentEnvironment59.mmCard, CardPaymentEnvironment57.mmCard);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCard";
			definition = "Specifies the card which is used in a payment by card.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Product> product;
	/**
	 * Product purchased with the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmCardPayment
	 * Product.mmCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmSaleItem
	 * CardPaymentTransactionDetails39.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmSaleItem
	 * CardPaymentTransactionDetails38.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmSaleItem
	 * CardPaymentTransactionDetails41.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmSaleItem
	 * CardPaymentTransactionDetails37.mmSaleItem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product purchased with the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmSaleItem, CardPaymentTransactionDetails38.mmSaleItem, CardPaymentTransactionDetails41.mmSaleItem, CardPaymentTransactionDetails37.mmSaleItem);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount detailedAmount;
	/**
	 * Detailed amount value.
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount2#mmDetailedAmount
	 * CardTransactionAmount2.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#mmCardholderBillingTransactionAmount
	 * CardTransactionAmount1.mmCardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#mmDetailedAmount
	 * CardTransactionAmount1.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#mmAdditionalAmounts
	 * CardTransactionDetail5.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmAdditionalAmounts
	 * CardTransactionDetail2.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmAdditionalAmounts
	 * CardTransactionDetail1.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmTransactionFees
	 * CardTransactionDetail4.mmTransactionFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmAdditionalAmounts
	 * CardTransactionDetail4.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail6#mmAdditionalAmounts
	 * CardTransactionDetail6.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5#mmCardholderBillingTransactionAmount
	 * CardTransactionAmount5.mmCardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5#mmReconciliationTransactionAmount
	 * CardTransactionAmount5.mmReconciliationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmCardholderBillingTransactionAmount
	 * CardTransactionAmount3.mmCardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmReconciliationTransactionAmount
	 * CardTransactionAmount3.mmReconciliationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmDetailedAmount
	 * CardTransactionAmount3.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount4#mmCardholderBillingTransactionAmount
	 * CardTransactionAmount4.mmCardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount4#mmReconciliationTransactionAmount
	 * CardTransactionAmount4.mmReconciliationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount4#mmDetailedAmount
	 * CardTransactionAmount4.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmAdditionalAmounts
	 * CardTransactionDetail3.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#mmDetailedAmount
	 * CardPaymentTransactionDetails32.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#mmDetailedAmount
	 * CardPaymentTransactionDetails28.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmDetailedAmount
	 * CardPaymentTransactionDetails39.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmDetailedAmount
	 * CardPaymentTransactionDetails38.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmDetailedAmount
	 * CardPaymentTransactionDetails41.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmDetailedAmount
	 * CardPaymentTransactionDetails37.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#mmDetailedAmount
	 * CardPaymentTransactionDetails40.mmDetailedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed amount value."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDetailedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransactionAmount2.mmDetailedAmount, CardTransactionAmount1.mmCardholderBillingTransactionAmount, CardTransactionAmount1.mmDetailedAmount, CardTransactionDetail5.mmAdditionalAmounts,
					CardTransactionDetail2.mmAdditionalAmounts, CardTransactionDetail1.mmAdditionalAmounts, CardTransactionDetail4.mmTransactionFees, CardTransactionDetail4.mmAdditionalAmounts, CardTransactionDetail6.mmAdditionalAmounts,
					CardTransactionAmount5.mmCardholderBillingTransactionAmount, CardTransactionAmount5.mmReconciliationTransactionAmount, CardTransactionAmount3.mmCardholderBillingTransactionAmount,
					CardTransactionAmount3.mmReconciliationTransactionAmount, CardTransactionAmount3.mmDetailedAmount, CardTransactionAmount4.mmCardholderBillingTransactionAmount, CardTransactionAmount4.mmReconciliationTransactionAmount,
					CardTransactionAmount4.mmDetailedAmount, CardTransactionDetail3.mmAdditionalAmounts, CardPaymentTransactionDetails32.mmDetailedAmount, CardPaymentTransactionDetails28.mmDetailedAmount,
					CardPaymentTransactionDetails39.mmDetailedAmount, CardPaymentTransactionDetails38.mmDetailedAmount, CardPaymentTransactionDetails41.mmDetailedAmount, CardPaymentTransactionDetails37.mmDetailedAmount,
					CardPaymentTransactionDetails40.mmDetailedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DetailedAmount";
			definition = "Detailed amount value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getDetailedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TypeOfAmountCode amountQualifier;
	/**
	 * Identification of the type of amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount11#mmType
	 * DetailedAmount11.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount11#mmAdditionalType
	 * DetailedAmount11.mmAdditionalType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount10#mmType
	 * DetailedAmount10.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount9#mmType
	 * DetailedAmount9.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#mmAmountQualifier
	 * CardTransactionAmount1.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmAmountQualifier
	 * CardTransactionAmount3.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmAmountQualifier
	 * CardPaymentTransactionDetails39.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmAmountQualifier
	 * CardPaymentTransactionDetails38.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmAmountQualifier
	 * CardPaymentTransactionDetails41.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmAmountQualifier
	 * CardPaymentTransactionDetails37.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#mmAmountQualifier
	 * CardPaymentTransactionDetails40.mmAmountQualifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountQualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmountQualifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DetailedAmount11.mmType, DetailedAmount11.mmAdditionalType, DetailedAmount10.mmType, DetailedAmount9.mmType, CardTransactionAmount1.mmAmountQualifier,
					CardTransactionAmount3.mmAmountQualifier, CardPaymentTransactionDetails39.mmAmountQualifier, CardPaymentTransactionDetails38.mmAmountQualifier, CardPaymentTransactionDetails41.mmAmountQualifier,
					CardPaymentTransactionDetails37.mmAmountQualifier, CardPaymentTransactionDetails40.mmAmountQualifier);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountQualifier";
			definition = "Identification of the type of amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfAmountCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getAmountQualifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CardPaymentAcquiring> cardPaymentAcquiring;
	/**
	 * Parameters of the process of acquiring a card payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmRelatedCardPayment
	 * CardPaymentAcquiring.mmRelatedCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmReconciliation
	 * CardTransaction10.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmReconciliation
	 * CardTransaction4.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmReconciliation
	 * CardTransaction9.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmReconciliation
	 * CardTransaction5.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmOriginalTransaction
	 * CardTransaction5.mmOriginalTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmReconciliation
	 * CardTransaction15.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmOriginalTransaction
	 * CardTransaction15.mmOriginalTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmOriginalTransaction
	 * CardTransaction7.mmOriginalTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4#mmReconciliationTransactionIdentification
	 * TransactionReconciliation4.mmReconciliationTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction18#mmTransactionIdentification
	 * ATMTransaction18.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction14#mmTransactionIdentification
	 * ATMTransaction14.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmTransactionIdentification
	 * ATMTransaction17.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction20#mmTransactionIdentification
	 * ATMTransaction20.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmTransactionIdentification
	 * ATMTransaction21.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction29#mmTransactionIdentification
	 * ATMTransaction29.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest6#mmContext
	 * AcceptorCancellationRequest6.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6#mmContext
	 * AcceptorAuthorisationRequest6.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#mmContext
	 * AcceptorCancellationAdvice6.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice6#mmContext
	 * AcceptorCompletionAdvice6.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19#mmContext
	 * CardPaymentDataSetTransaction19.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#mmContext
	 * CardPaymentDataSetTransaction20.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#mmContext
	 * CardPaymentDataSetTransaction18.mmContext}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData6#mmContext
	 * CommonData6.mmContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentAcquiring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters of the process of acquiring a card payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCardPaymentAcquiring = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransaction10.mmReconciliation, CardTransaction4.mmReconciliation, CardTransaction9.mmReconciliation, CardTransaction5.mmReconciliation, CardTransaction5.mmOriginalTransaction,
					CardTransaction15.mmReconciliation, CardTransaction15.mmOriginalTransaction, CardTransaction7.mmOriginalTransaction, TransactionReconciliation4.mmReconciliationTransactionIdentification,
					ATMTransaction18.mmTransactionIdentification, ATMTransaction14.mmTransactionIdentification, ATMTransaction17.mmTransactionIdentification, ATMTransaction20.mmTransactionIdentification,
					ATMTransaction21.mmTransactionIdentification, ATMTransaction29.mmTransactionIdentification, AcceptorCancellationRequest6.mmContext, AcceptorAuthorisationRequest6.mmContext, AcceptorCancellationAdvice6.mmContext,
					AcceptorCompletionAdvice6.mmContext, CardPaymentDataSetTransaction19.mmContext, CardPaymentDataSetTransaction20.mmContext, CardPaymentDataSetTransaction18.mmContext, CommonData6.mmContext);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Parameters of the process of acquiring a card payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmRelatedCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CardPaymentPartyRole> paymentCardPartyRole;
	/**
	 * Specifies each role played by a party in the process of a payment by
	 * card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#mmCardPayment
	 * CardPaymentPartyRole.mmCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
	 * CardPaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCardPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role played by a party in the process of a payment by card."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentCardPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCardPartyRole";
			definition = "Specifies each role played by a party in the process of a payment by card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentPartyRole.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CardPaymentStatus> cardPaymentStatus;
	/**
	 * Status of the payment by card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmCardPayment
	 * CardPaymentStatus.mmCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmTransactionStatus
	 * ATMTransaction17.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction20#mmTransactionStatus
	 * ATMTransaction20.mmTransactionStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the payment by card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCardPaymentStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ATMTransaction17.mmTransactionStatus, ATMTransaction20.mmTransactionStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentStatus";
			definition = "Status of the payment by card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
		}
	};
	protected Max35Text detailedAmountLabel;
	/**
	 * Short description of the amount.
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
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedAmountLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short description of the amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDetailedAmountLabel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DetailedAmountLabel";
			definition = "Short description of the amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getDetailedAmountLabel", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ReconciliationTransaction reconciliation;
	/**
	 * Total of a certain type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCardPaymentTotal
	 * ReconciliationTransaction.mmCardPaymentTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmReconciliation
	 * CardTransaction8.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmReconciliation
	 * CardTransaction7.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4#mmTransaction
	 * AcceptorReconciliationResponse4.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total of a certain type of transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReconciliation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransaction8.mmReconciliation, CardTransaction7.mmReconciliation, AcceptorReconciliationResponse4.mmTransaction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Total of a certain type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmCardPaymentTotal;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
		}
	};
	protected ExternalCardTransactionCategoryCode transactionCategory;
	/**
	 * Specifies the category to which the card transaction belongs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalCardTransactionCategoryCode
	 * ExternalCardTransactionCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the category to which the card transaction belongs."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionCategory = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionCategory";
			definition = "Specifies the category to which the card transaction belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalCardTransactionCategoryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getTransactionCategory", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount cashBackAmount;
	/**
	 * Amount added to the total price of the transaction and received in cash
	 * by the customer.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBackAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount added to the total price of the transaction and received in cash by the customer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCashBackAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashBackAmount";
			definition = "Amount added to the total price of the transaction and received in cash by the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getCashBackAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount gratuity;
	/**
	 * Amount tendered for a service performed.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount tendered for a service performed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGratuity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Amount tendered for a service performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getGratuity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DebitCreditCode debitCreditDirection;
	/**
	 * Specifies the direction of a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCreditDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the direction of a payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDebitCreditDirection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCreditDirection";
			definition = "Specifies the direction of a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getDebitCreditDirection", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ATMTotal> aTMTotal;
	/**
	 * Current totals of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmRelatedCardPayment
	 * ATMTotal.mmRelatedCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ATMTotal ATMTotal}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmATMTotals
	 * ATMTransaction17.mmATMTotals}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTotal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current totals of the ATM."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmATMTotal = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ATMTransaction17.mmATMTotals);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ATMTotal";
			definition = "Current totals of the ATM.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmRelatedCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPayment";
				definition = "Payment through an electronic money product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.mmCardPayment, com.tools20022.repository.entity.PaymentCard.mmPayment,
						com.tools20022.repository.entity.CardPaymentPartyRole.mmCardPayment, com.tools20022.repository.entity.CardPaymentAcquiring.mmRelatedCardPayment,
						com.tools20022.repository.entity.ReconciliationTransaction.mmCardPaymentTotal, com.tools20022.repository.entity.CardPaymentStatus.mmCardPayment, com.tools20022.repository.entity.ATMTotal.mmRelatedCardPayment);
				derivationElement_lazy = () -> Arrays.asList(AcceptorDiagnosticResponse4.mmEnvironment, DetailedAmount12.mmFees, DetailedAmount12.mmDonation, CardTransaction4.mmTransactionDetails, CardTransaction8.mmTransactionDetails,
						CardTransaction5.mmTransactionDetails, CardTransaction15.mmTransactionDetails, CardTransaction7.mmTransactionDetails, CardTransaction6.mmTransactionDetails, DetailedAmount15.mmCashBack, DetailedAmount15.mmGratuity,
						DetailedAmount15.mmFees, DetailedAmount15.mmRebate, DetailedAmount15.mmValueAddedTax, CardPaymentTransaction57.mmTransactionDetails, AggregationTransaction2.mmIndividualPayment, DetailedAmount16.mmFees,
						DetailedAmount16.mmDonation, DetailedAmount17.mmFees, DetailedAmount17.mmDonation, AcceptorCurrencyConversionResponse4.mmEnvironment, AcceptorCurrencyConversionResponse4.mmTransaction,
						AcceptorCancellationRequest6.mmEnvironment, AcceptorCancellationRequest6.mmTransaction, AcceptorDiagnosticRequest6.mmEnvironment, AcceptorCancellationAdviceResponse6.mmEnvironment,
						AcceptorCurrencyConversionRequest4.mmEnvironment, AcceptorCurrencyConversionRequest4.mmTransaction, AcceptorCancellationResponse6.mmEnvironment, AcceptorCancellationResponse6.mmTransaction,
						AcceptorCancellationResponse6.mmTransactionResponse, AcceptorAuthorisationRequest6.mmEnvironment, AcceptorAuthorisationRequest6.mmTransaction, AcceptorCancellationAdvice6.mmEnvironment,
						AcceptorCancellationAdvice6.mmTransaction, AcceptorCompletionAdvice6.mmEnvironment, AcceptorCompletionAdvice6.mmTransaction, AcceptorCompletionAdviceResponse6.mmEnvironment,
						AcceptorAuthorisationResponse6.mmEnvironment, AcceptorAuthorisationResponse6.mmTransaction, AcceptorAuthorisationResponse6.mmTransactionResponse, CardPaymentTransaction71.mmOriginalTransaction,
						CardPaymentTransaction71.mmTransactionDetails, CardPaymentDataSetTransaction19.mmEnvironment, CardPaymentDataSetTransaction19.mmTransaction, CardPaymentTransaction75.mmOriginalTransaction,
						CardPaymentTransaction75.mmTransactionDetails, CardPaymentTransaction74.mmOriginalTransaction, CardPaymentTransaction74.mmTransactionDetails, CardPaymentDataSetTransaction21.mmEnvironment,
						CardPaymentDataSetTransaction21.mmTransaction, CardPaymentDataSetTransaction21.mmTransactionResponse, CardPaymentTransaction70.mmOriginalTransaction, CardPaymentTransaction70.mmTransactionDetails,
						CardPaymentDataSetTransaction20.mmEnvironment, CardPaymentDataSetTransaction20.mmTransaction, CardPaymentTransaction72.mmOriginalTransaction, CardPaymentTransaction72.mmTransactionDetails,
						CardPaymentTransaction76.mmOriginalTransaction, CardPaymentTransaction76.mmTransactionDetails, CardPaymentDataSetTransaction18.mmEnvironment, CardPaymentDataSetTransaction18.mmTransaction, CommonData6.mmEnvironment,
						CardPaymentTransaction69.mmOriginalTransaction, CardPaymentTransaction69.mmTransactionDetails, AcceptorCurrencyConversionAdvice1.mmEnvironment, AcceptorCurrencyConversionAdvice1.mmTransaction,
						CardPaymentTransaction77.mmTransactionDetails, CardPaymentTransaction78.mmTransactionDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.mmPaymentCard, com.tools20022.repository.entity.CardPayment.mmProduct, com.tools20022.repository.entity.CardPayment.mmDetailedAmount,
						com.tools20022.repository.entity.CardPayment.mmAmountQualifier, com.tools20022.repository.entity.CardPayment.mmCardPaymentAcquiring, com.tools20022.repository.entity.CardPayment.mmPaymentCardPartyRole,
						com.tools20022.repository.entity.CardPayment.mmCardPaymentStatus, com.tools20022.repository.entity.CardPayment.mmDetailedAmountLabel, com.tools20022.repository.entity.CardPayment.mmReconciliation,
						com.tools20022.repository.entity.CardPayment.mmTransactionCategory, com.tools20022.repository.entity.CardPayment.mmCashBackAmount, com.tools20022.repository.entity.CardPayment.mmGratuity,
						com.tools20022.repository.entity.CardPayment.mmDebitCreditDirection, com.tools20022.repository.entity.CardPayment.mmATMTotal);
				derivationComponent_lazy = () -> Arrays.asList(DetailedAmount4.mmObject(), AmountAndDirection41.mmObject(), AcceptorDiagnosticResponse4.mmObject(), CardPaymentEnvironment43.mmObject(), CardPaymentEnvironment38.mmObject(),
						AmountAndCurrency1.mmObject(), DetailedAmount12.mmObject(), ATMTransaction8.mmObject(), DetailedAmount13.mmObject(), DetailedAmount11.mmObject(), DetailedAmount10.mmObject(), DetailedAmount9.mmObject(),
						CardTransaction4.mmObject(), CardTransactionAmount2.mmObject(), DetailedAmount8.mmObject(), CardTransactionAmount1.mmObject(), CardTransaction8.mmObject(), CardTransaction5.mmObject(), CardTransaction15.mmObject(),
						CardTransaction7.mmObject(), CardTransactionDetail5.mmObject(), CardTransactionDetail2.mmObject(), CardTransactionDetail1.mmObject(), CardTransaction6.mmObject(), CardTransactionDetail4.mmObject(),
						CardTransactionDetail6.mmObject(), CardTransactionAmount5.mmObject(), CardTransactionAmount3.mmObject(), CardTransactionAmount4.mmObject(), CardTransactionDetail3.mmObject(),
						CardPaymentTransactionDetails32.mmObject(), DetailedAmount15.mmObject(), CardPaymentTransaction52.mmObject(), CardPaymentTransactionResult3.mmObject(), CardPaymentTransactionDetails28.mmObject(),
						CardPaymentTransaction57.mmObject(), DetailedAmount14.mmObject(), CardPaymentTransactionDetails35.mmObject(), CardPaymentTransactionDetails34.mmObject(), ATMTransaction18.mmObject(), ATMTransaction14.mmObject(),
						ATMTransaction17.mmObject(), ATMTransaction20.mmObject(), DetailedAmount18.mmObject(), ATMTransaction13.mmObject(), ATMTransaction16.mmObject(), ATMTransaction19.mmObject(), DetailedAmount16.mmObject(),
						ATMTransaction15.mmObject(), ATMTransaction21.mmObject(), ATMTransaction24.mmObject(), DetailedAmount17.mmObject(), ATMTransaction23.mmObject(), ATMTransaction29.mmObject(),
						AcceptorCurrencyConversionResponse4.mmObject(), AcceptorCancellationRequest6.mmObject(), AcceptorDiagnosticRequest6.mmObject(), AcceptorCancellationAdviceResponse6.mmObject(),
						AcceptorCurrencyConversionRequest4.mmObject(), AcceptorCancellationResponse6.mmObject(), AcceptorAuthorisationRequest6.mmObject(), AcceptorCancellationAdvice6.mmObject(), AcceptorCompletionAdvice6.mmObject(),
						AcceptorCompletionAdviceResponse6.mmObject(), AcceptorAuthorisationResponse6.mmObject(), CardPaymentTransaction71.mmObject(), CardPaymentTransactionDetails39.mmObject(), CardPaymentDataSetTransaction19.mmObject(),
						CardPaymentTransaction75.mmObject(), CardPaymentEnvironment61.mmObject(), CardPaymentTransactionDetails38.mmObject(), CardPaymentEnvironment64.mmObject(), CardPaymentEnvironment60.mmObject(),
						CardPaymentEnvironment65.mmObject(), CardPaymentTransactionDetails41.mmObject(), CardPaymentEnvironment67.mmObject(), CardPaymentEnvironment66.mmObject(), CardPaymentTransaction74.mmObject(),
						CardPaymentDataSetTransaction21.mmObject(), CardPaymentTransaction67.mmObject(), CardPaymentTransaction70.mmObject(), CardPaymentTransaction73.mmObject(), CardPaymentDataSetTransaction20.mmObject(),
						CardPaymentEnvironment62.mmObject(), CardPaymentEnvironment63.mmObject(), CardPaymentTransaction72.mmObject(), CardPaymentTransaction76.mmObject(), CardPaymentTransaction68.mmObject(),
						CardPaymentDataSetTransaction18.mmObject(), CardPaymentEnvironment58.mmObject(), CardPaymentEnvironment59.mmObject(), CardPaymentTransactionDetails37.mmObject(), CommonData6.mmObject(),
						CardPaymentEnvironment57.mmObject(), CardPaymentTransaction69.mmObject(), CardPaymentTransactionDetails40.mmObject(), AcceptorCurrencyConversionAdvice1.mmObject(), CardPaymentTransaction77.mmObject(),
						CardPaymentTransaction78.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardPayment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentCard getPaymentCard() {
		return paymentCard;
	}

	public void setPaymentCard(com.tools20022.repository.entity.PaymentCard paymentCard) {
		this.paymentCard = paymentCard;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<com.tools20022.repository.entity.Product> product) {
		this.product = product;
	}

	public ImpliedCurrencyAndAmount getDetailedAmount() {
		return detailedAmount;
	}

	public void setDetailedAmount(ImpliedCurrencyAndAmount detailedAmount) {
		this.detailedAmount = detailedAmount;
	}

	public TypeOfAmountCode getAmountQualifier() {
		return amountQualifier;
	}

	public void setAmountQualifier(TypeOfAmountCode amountQualifier) {
		this.amountQualifier = amountQualifier;
	}

	public List<CardPaymentAcquiring> getCardPaymentAcquiring() {
		return cardPaymentAcquiring;
	}

	public void setCardPaymentAcquiring(List<com.tools20022.repository.entity.CardPaymentAcquiring> cardPaymentAcquiring) {
		this.cardPaymentAcquiring = cardPaymentAcquiring;
	}

	public List<CardPaymentPartyRole> getPaymentCardPartyRole() {
		return paymentCardPartyRole;
	}

	public void setPaymentCardPartyRole(List<com.tools20022.repository.entity.CardPaymentPartyRole> paymentCardPartyRole) {
		this.paymentCardPartyRole = paymentCardPartyRole;
	}

	public List<CardPaymentStatus> getCardPaymentStatus() {
		return cardPaymentStatus;
	}

	public void setCardPaymentStatus(List<com.tools20022.repository.entity.CardPaymentStatus> cardPaymentStatus) {
		this.cardPaymentStatus = cardPaymentStatus;
	}

	public Max35Text getDetailedAmountLabel() {
		return detailedAmountLabel;
	}

	public void setDetailedAmountLabel(Max35Text detailedAmountLabel) {
		this.detailedAmountLabel = detailedAmountLabel;
	}

	public ReconciliationTransaction getReconciliation() {
		return reconciliation;
	}

	public void setReconciliation(com.tools20022.repository.entity.ReconciliationTransaction reconciliation) {
		this.reconciliation = reconciliation;
	}

	public ExternalCardTransactionCategoryCode getTransactionCategory() {
		return transactionCategory;
	}

	public void setTransactionCategory(ExternalCardTransactionCategoryCode transactionCategory) {
		this.transactionCategory = transactionCategory;
	}

	public CurrencyAndAmount getCashBackAmount() {
		return cashBackAmount;
	}

	public void setCashBackAmount(CurrencyAndAmount cashBackAmount) {
		this.cashBackAmount = cashBackAmount;
	}

	public CurrencyAndAmount getGratuity() {
		return gratuity;
	}

	public void setGratuity(CurrencyAndAmount gratuity) {
		this.gratuity = gratuity;
	}

	public DebitCreditCode getDebitCreditDirection() {
		return debitCreditDirection;
	}

	public void setDebitCreditDirection(DebitCreditCode debitCreditDirection) {
		this.debitCreditDirection = debitCreditDirection;
	}

	public List<ATMTotal> getATMTotal() {
		return aTMTotal;
	}

	public void setATMTotal(List<com.tools20022.repository.entity.ATMTotal> aTMTotal) {
		this.aTMTotal = aTMTotal;
	}
}