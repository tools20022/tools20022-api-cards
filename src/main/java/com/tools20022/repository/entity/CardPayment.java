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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#mmTransactionDetails
 * CardPaymentTransaction77.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#mmTransactionDetails
 * CardPaymentTransaction78.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse7#mmEnvironment
 * AcceptorCancellationResponse7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse7#mmTransaction
 * AcceptorCancellationResponse7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse7#mmTransactionResponse
 * AcceptorCancellationResponse7.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice7#mmEnvironment
 * AcceptorCancellationAdvice7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice7#mmTransaction
 * AcceptorCancellationAdvice7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse7#mmEnvironment
 * AcceptorCancellationAdviceResponse7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse5#mmEnvironment
 * AcceptorDiagnosticResponse5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest5#mmEnvironment
 * AcceptorCurrencyConversionRequest5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest5#mmTransaction
 * AcceptorCurrencyConversionRequest5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice7#mmEnvironment
 * AcceptorCompletionAdvice7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice7#mmTransaction
 * AcceptorCompletionAdvice7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest7#mmEnvironment
 * AcceptorDiagnosticRequest7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse5#mmEnvironment
 * AcceptorCurrencyConversionResponse5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse5#mmTransaction
 * AcceptorCurrencyConversionResponse5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest7#mmEnvironment
 * AcceptorAuthorisationRequest7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest7#mmTransaction
 * AcceptorAuthorisationRequest7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse7#mmEnvironment
 * AcceptorAuthorisationResponse7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse7#mmTransaction
 * AcceptorAuthorisationResponse7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse7#mmTransactionResponse
 * AcceptorAuthorisationResponse7.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice2#mmEnvironment
 * AcceptorCurrencyConversionAdvice2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice2#mmTransaction
 * AcceptorCurrencyConversionAdvice2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse7#mmEnvironment
 * AcceptorCompletionAdviceResponse7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22#mmEnvironment
 * CardPaymentDataSetTransaction22.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22#mmTransaction
 * CardPaymentDataSetTransaction22.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction25#mmEnvironment
 * CardPaymentDataSetTransaction25.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction25#mmTransaction
 * CardPaymentDataSetTransaction25.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction25#mmTransactionResponse
 * CardPaymentDataSetTransaction25.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24#mmEnvironment
 * CardPaymentDataSetTransaction24.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24#mmTransaction
 * CardPaymentDataSetTransaction24.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction23#mmEnvironment
 * CardPaymentDataSetTransaction23.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction23#mmTransaction
 * CardPaymentDataSetTransaction23.mmTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData7#mmEnvironment
 * CommonData7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction83#mmOriginalTransaction
 * CardPaymentTransaction83.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction83#mmTransactionDetails
 * CardPaymentTransaction83.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction81#mmOriginalTransaction
 * CardPaymentTransaction81.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction81#mmTransactionDetails
 * CardPaymentTransaction81.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmOriginalTransaction
 * CardPaymentTransaction80.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmTransactionDetails
 * CardPaymentTransaction80.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction85#mmOriginalTransaction
 * CardPaymentTransaction85.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction85#mmTransactionDetails
 * CardPaymentTransaction85.mmTransactionDetails}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction68
 * CardPaymentTransaction68}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction77
 * CardPaymentTransaction77}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction78
 * CardPaymentTransaction78}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse7
 * AcceptorCancellationResponse7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice7
 * AcceptorCancellationAdvice7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse7
 * AcceptorCancellationAdviceResponse7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse5
 * AcceptorDiagnosticResponse5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest5
 * AcceptorCurrencyConversionRequest5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice7
 * AcceptorCompletionAdvice7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest7
 * AcceptorDiagnosticRequest7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse5
 * AcceptorCurrencyConversionResponse5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest7
 * AcceptorAuthorisationRequest7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse7
 * AcceptorAuthorisationResponse7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice2
 * AcceptorCurrencyConversionAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse7
 * AcceptorCompletionAdviceResponse7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22
 * CardPaymentDataSetTransaction22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction25
 * CardPaymentDataSetTransaction25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24
 * CardPaymentDataSetTransaction24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction23
 * CardPaymentDataSetTransaction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData7 CommonData7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment70
 * CardPaymentEnvironment70}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment71
 * CardPaymentEnvironment71}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction84
 * CardPaymentTransaction84}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment69
 * CardPaymentEnvironment69}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection93
 * AmountAndDirection93}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails44
 * CardPaymentTransactionDetails44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction79
 * CardPaymentTransaction79}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment68
 * CardPaymentEnvironment68}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction83
 * CardPaymentTransaction83}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45
 * CardPaymentTransactionDetails45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction81
 * CardPaymentTransaction81}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction80
 * CardPaymentTransaction80}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails46
 * CardPaymentTransactionDetails46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction85
 * CardPaymentTransaction85}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction86
 * CardPaymentTransaction86}</li>
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
 * "CardPayment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment through an electronic money product."</li>
 * </ul>
 */
public class CardPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentCard paymentCard;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment68#mmCard
	 * CardPaymentEnvironment68.mmCard}</li>
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
	public static final MMBusinessAssociationEnd<CardPayment, PaymentCard> mmPaymentCard = new MMBusinessAssociationEnd<CardPayment, PaymentCard>() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentEnvironment68.mmCard);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCard";
			definition = "Specifies the card which is used in a payment by card.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentCard.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentCard.mmObject();
		}

		@Override
		public PaymentCard getValue(CardPayment obj) {
			return obj.getPaymentCard();
		}

		@Override
		public void setValue(CardPayment obj, PaymentCard value) {
			obj.setPaymentCard(value);
		}
	};
	protected List<Product> product;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails44#mmSaleItem
	 * CardPaymentTransactionDetails44.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45#mmSaleItem
	 * CardPaymentTransactionDetails45.mmSaleItem}</li>
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
	public static final MMBusinessAssociationEnd<CardPayment, List<Product>> mmProduct = new MMBusinessAssociationEnd<CardPayment, List<Product>>() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionDetails44.mmSaleItem, CardPaymentTransactionDetails45.mmSaleItem);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			minOccurs = 0;
			opposite_lazy = () -> Product.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}

		@Override
		public List<Product> getValue(CardPayment obj) {
			return obj.getProduct();
		}

		@Override
		public void setValue(CardPayment obj, List<Product> value) {
			obj.setProduct(value);
		}
	};
	protected ImpliedCurrencyAndAmount detailedAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails44#mmDetailedAmount
	 * CardPaymentTransactionDetails44.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45#mmDetailedAmount
	 * CardPaymentTransactionDetails45.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails46#mmDetailedAmount
	 * CardPaymentTransactionDetails46.mmDetailedAmount}</li>
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
	public static final MMBusinessAttribute<CardPayment, ImpliedCurrencyAndAmount> mmDetailedAmount = new MMBusinessAttribute<CardPayment, ImpliedCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransactionAmount2.mmDetailedAmount, CardTransactionAmount1.mmCardholderBillingTransactionAmount, CardTransactionAmount1.mmDetailedAmount, CardTransactionDetail5.mmAdditionalAmounts,
					CardTransactionDetail2.mmAdditionalAmounts, CardTransactionDetail1.mmAdditionalAmounts, CardTransactionDetail4.mmTransactionFees, CardTransactionDetail4.mmAdditionalAmounts, CardTransactionDetail6.mmAdditionalAmounts,
					CardTransactionAmount5.mmCardholderBillingTransactionAmount, CardTransactionAmount5.mmReconciliationTransactionAmount, CardTransactionAmount3.mmCardholderBillingTransactionAmount,
					CardTransactionAmount3.mmReconciliationTransactionAmount, CardTransactionAmount3.mmDetailedAmount, CardTransactionAmount4.mmCardholderBillingTransactionAmount, CardTransactionAmount4.mmReconciliationTransactionAmount,
					CardTransactionAmount4.mmDetailedAmount, CardTransactionDetail3.mmAdditionalAmounts, CardPaymentTransactionDetails32.mmDetailedAmount, CardPaymentTransactionDetails28.mmDetailedAmount,
					CardPaymentTransactionDetails44.mmDetailedAmount, CardPaymentTransactionDetails45.mmDetailedAmount, CardPaymentTransactionDetails46.mmDetailedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DetailedAmount";
			definition = "Detailed amount value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(CardPayment obj) {
			return obj.getDetailedAmount();
		}

		@Override
		public void setValue(CardPayment obj, ImpliedCurrencyAndAmount value) {
			obj.setDetailedAmount(value);
		}
	};
	protected TypeOfAmountCode amountQualifier;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails44#mmAmountQualifier
	 * CardPaymentTransactionDetails44.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45#mmAmountQualifier
	 * CardPaymentTransactionDetails45.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails46#mmAmountQualifier
	 * CardPaymentTransactionDetails46.mmAmountQualifier}</li>
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
	public static final MMBusinessAttribute<CardPayment, TypeOfAmountCode> mmAmountQualifier = new MMBusinessAttribute<CardPayment, TypeOfAmountCode>() {
		{
			derivation_lazy = () -> Arrays.asList(DetailedAmount11.mmType, DetailedAmount11.mmAdditionalType, DetailedAmount10.mmType, DetailedAmount9.mmType, CardTransactionAmount1.mmAmountQualifier,
					CardTransactionAmount3.mmAmountQualifier, CardPaymentTransactionDetails44.mmAmountQualifier, CardPaymentTransactionDetails45.mmAmountQualifier, CardPaymentTransactionDetails46.mmAmountQualifier);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountQualifier";
			definition = "Identification of the type of amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfAmountCode.mmObject();
		}

		@Override
		public TypeOfAmountCode getValue(CardPayment obj) {
			return obj.getAmountQualifier();
		}

		@Override
		public void setValue(CardPayment obj, TypeOfAmountCode value) {
			obj.setAmountQualifier(value);
		}
	};
	protected List<CardPaymentAcquiring> cardPaymentAcquiring;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice7#mmContext
	 * AcceptorCancellationAdvice7.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice7#mmContext
	 * AcceptorCompletionAdvice7.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest7#mmContext
	 * AcceptorAuthorisationRequest7.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22#mmContext
	 * CardPaymentDataSetTransaction22.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24#mmContext
	 * CardPaymentDataSetTransaction24.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction23#mmContext
	 * CardPaymentDataSetTransaction23.mmContext}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData7#mmContext
	 * CommonData7.mmContext}</li>
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
	public static final MMBusinessAssociationEnd<CardPayment, List<CardPaymentAcquiring>> mmCardPaymentAcquiring = new MMBusinessAssociationEnd<CardPayment, List<CardPaymentAcquiring>>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransaction10.mmReconciliation, CardTransaction4.mmReconciliation, CardTransaction9.mmReconciliation, CardTransaction5.mmReconciliation, CardTransaction5.mmOriginalTransaction,
					CardTransaction15.mmReconciliation, CardTransaction15.mmOriginalTransaction, CardTransaction7.mmOriginalTransaction, TransactionReconciliation4.mmReconciliationTransactionIdentification,
					ATMTransaction18.mmTransactionIdentification, ATMTransaction14.mmTransactionIdentification, ATMTransaction17.mmTransactionIdentification, ATMTransaction20.mmTransactionIdentification,
					ATMTransaction21.mmTransactionIdentification, ATMTransaction29.mmTransactionIdentification, AcceptorCancellationAdvice7.mmContext, AcceptorCompletionAdvice7.mmContext, AcceptorAuthorisationRequest7.mmContext,
					CardPaymentDataSetTransaction22.mmContext, CardPaymentDataSetTransaction24.mmContext, CardPaymentDataSetTransaction23.mmContext, CommonData7.mmContext);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Parameters of the process of acquiring a card payment.";
			minOccurs = 0;
			opposite_lazy = () -> CardPaymentAcquiring.mmRelatedCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardPaymentAcquiring.mmObject();
		}

		@Override
		public List<CardPaymentAcquiring> getValue(CardPayment obj) {
			return obj.getCardPaymentAcquiring();
		}

		@Override
		public void setValue(CardPayment obj, List<CardPaymentAcquiring> value) {
			obj.setCardPaymentAcquiring(value);
		}
	};
	protected List<CardPaymentPartyRole> paymentCardPartyRole;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CardPayment, List<CardPaymentPartyRole>> mmPaymentCardPartyRole = new MMBusinessAssociationEnd<CardPayment, List<CardPaymentPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCardPartyRole";
			definition = "Specifies each role played by a party in the process of a payment by card.";
			minOccurs = 0;
			opposite_lazy = () -> CardPaymentPartyRole.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardPaymentPartyRole.mmObject();
		}

		@Override
		public List<CardPaymentPartyRole> getValue(CardPayment obj) {
			return obj.getPaymentCardPartyRole();
		}

		@Override
		public void setValue(CardPayment obj, List<CardPaymentPartyRole> value) {
			obj.setPaymentCardPartyRole(value);
		}
	};
	protected List<CardPaymentStatus> cardPaymentStatus;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CardPayment, List<CardPaymentStatus>> mmCardPaymentStatus = new MMBusinessAssociationEnd<CardPayment, List<CardPaymentStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(ATMTransaction17.mmTransactionStatus, ATMTransaction20.mmTransactionStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentStatus";
			definition = "Status of the payment by card.";
			minOccurs = 0;
			opposite_lazy = () -> CardPaymentStatus.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardPaymentStatus.mmObject();
		}

		@Override
		public List<CardPaymentStatus> getValue(CardPayment obj) {
			return obj.getCardPaymentStatus();
		}

		@Override
		public void setValue(CardPayment obj, List<CardPaymentStatus> value) {
			obj.setCardPaymentStatus(value);
		}
	};
	protected Max35Text detailedAmountLabel;
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
	public static final MMBusinessAttribute<CardPayment, Max35Text> mmDetailedAmountLabel = new MMBusinessAttribute<CardPayment, Max35Text>() {
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

		@Override
		public Max35Text getValue(CardPayment obj) {
			return obj.getDetailedAmountLabel();
		}

		@Override
		public void setValue(CardPayment obj, Max35Text value) {
			obj.setDetailedAmountLabel(value);
		}
	};
	protected ReconciliationTransaction reconciliation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse5#mmTransaction
	 * AcceptorReconciliationResponse5.mmTransaction}</li>
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
	public static final MMBusinessAssociationEnd<CardPayment, Optional<ReconciliationTransaction>> mmReconciliation = new MMBusinessAssociationEnd<CardPayment, Optional<ReconciliationTransaction>>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransaction8.mmReconciliation, CardTransaction7.mmReconciliation, AcceptorReconciliationResponse5.mmTransaction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Total of a certain type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ReconciliationTransaction.mmCardPaymentTotal;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ReconciliationTransaction.mmObject();
		}

		@Override
		public Optional<ReconciliationTransaction> getValue(CardPayment obj) {
			return obj.getReconciliation();
		}

		@Override
		public void setValue(CardPayment obj, Optional<ReconciliationTransaction> value) {
			obj.setReconciliation(value.orElse(null));
		}
	};
	protected ExternalCardTransactionCategoryCode transactionCategory;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CardPayment, ExternalCardTransactionCategoryCode> mmTransactionCategory = new MMBusinessAttribute<CardPayment, ExternalCardTransactionCategoryCode>() {
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

		@Override
		public ExternalCardTransactionCategoryCode getValue(CardPayment obj) {
			return obj.getTransactionCategory();
		}

		@Override
		public void setValue(CardPayment obj, ExternalCardTransactionCategoryCode value) {
			obj.setTransactionCategory(value);
		}
	};
	protected CurrencyAndAmount cashBackAmount;
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
	public static final MMBusinessAttribute<CardPayment, CurrencyAndAmount> mmCashBackAmount = new MMBusinessAttribute<CardPayment, CurrencyAndAmount>() {
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

		@Override
		public CurrencyAndAmount getValue(CardPayment obj) {
			return obj.getCashBackAmount();
		}

		@Override
		public void setValue(CardPayment obj, CurrencyAndAmount value) {
			obj.setCashBackAmount(value);
		}
	};
	protected CurrencyAndAmount gratuity;
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
	public static final MMBusinessAttribute<CardPayment, CurrencyAndAmount> mmGratuity = new MMBusinessAttribute<CardPayment, CurrencyAndAmount>() {
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

		@Override
		public CurrencyAndAmount getValue(CardPayment obj) {
			return obj.getGratuity();
		}

		@Override
		public void setValue(CardPayment obj, CurrencyAndAmount value) {
			obj.setGratuity(value);
		}
	};
	protected DebitCreditCode debitCreditDirection;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<CardPayment, DebitCreditCode> mmDebitCreditDirection = new MMBusinessAttribute<CardPayment, DebitCreditCode>() {
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

		@Override
		public DebitCreditCode getValue(CardPayment obj) {
			return obj.getDebitCreditDirection();
		}

		@Override
		public void setValue(CardPayment obj, DebitCreditCode value) {
			obj.setDebitCreditDirection(value);
		}
	};
	protected List<ATMTotal> aTMTotal;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CardPayment, List<ATMTotal>> mmATMTotal = new MMBusinessAssociationEnd<CardPayment, List<ATMTotal>>() {
		{
			derivation_lazy = () -> Arrays.asList(ATMTransaction17.mmATMTotals);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ATMTotal";
			definition = "Current totals of the ATM.";
			minOccurs = 0;
			opposite_lazy = () -> ATMTotal.mmRelatedCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ATMTotal.mmObject();
		}

		@Override
		public List<ATMTotal> getValue(CardPayment obj) {
			return obj.getATMTotal();
		}

		@Override
		public void setValue(CardPayment obj, List<ATMTotal> value) {
			obj.setATMTotal(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPayment";
				definition = "Payment through an electronic money product.";
				associationDomain_lazy = () -> Arrays.asList(Product.mmCardPayment, PaymentCard.mmPayment, CardPaymentPartyRole.mmCardPayment, CardPaymentAcquiring.mmRelatedCardPayment, ReconciliationTransaction.mmCardPaymentTotal,
						CardPaymentStatus.mmCardPayment, ATMTotal.mmRelatedCardPayment);
				derivationElement_lazy = () -> Arrays.asList(DetailedAmount12.mmFees, DetailedAmount12.mmDonation, CardTransaction4.mmTransactionDetails, CardTransaction8.mmTransactionDetails, CardTransaction5.mmTransactionDetails,
						CardTransaction15.mmTransactionDetails, CardTransaction7.mmTransactionDetails, CardTransaction6.mmTransactionDetails, DetailedAmount15.mmCashBack, DetailedAmount15.mmGratuity, DetailedAmount15.mmFees,
						DetailedAmount15.mmRebate, DetailedAmount15.mmValueAddedTax, CardPaymentTransaction57.mmTransactionDetails, AggregationTransaction2.mmIndividualPayment, DetailedAmount16.mmFees, DetailedAmount16.mmDonation,
						DetailedAmount17.mmFees, DetailedAmount17.mmDonation, CardPaymentTransaction77.mmTransactionDetails, CardPaymentTransaction78.mmTransactionDetails, AcceptorCancellationResponse7.mmEnvironment,
						AcceptorCancellationResponse7.mmTransaction, AcceptorCancellationResponse7.mmTransactionResponse, AcceptorCancellationAdvice7.mmEnvironment, AcceptorCancellationAdvice7.mmTransaction,
						AcceptorCancellationAdviceResponse7.mmEnvironment, AcceptorDiagnosticResponse5.mmEnvironment, AcceptorCurrencyConversionRequest5.mmEnvironment, AcceptorCurrencyConversionRequest5.mmTransaction,
						AcceptorCompletionAdvice7.mmEnvironment, AcceptorCompletionAdvice7.mmTransaction, AcceptorDiagnosticRequest7.mmEnvironment, AcceptorCurrencyConversionResponse5.mmEnvironment,
						AcceptorCurrencyConversionResponse5.mmTransaction, AcceptorAuthorisationRequest7.mmEnvironment, AcceptorAuthorisationRequest7.mmTransaction, AcceptorAuthorisationResponse7.mmEnvironment,
						AcceptorAuthorisationResponse7.mmTransaction, AcceptorAuthorisationResponse7.mmTransactionResponse, AcceptorCurrencyConversionAdvice2.mmEnvironment, AcceptorCurrencyConversionAdvice2.mmTransaction,
						AcceptorCompletionAdviceResponse7.mmEnvironment, CardPaymentDataSetTransaction22.mmEnvironment, CardPaymentDataSetTransaction22.mmTransaction, CardPaymentDataSetTransaction25.mmEnvironment,
						CardPaymentDataSetTransaction25.mmTransaction, CardPaymentDataSetTransaction25.mmTransactionResponse, CardPaymentDataSetTransaction24.mmEnvironment, CardPaymentDataSetTransaction24.mmTransaction,
						CardPaymentDataSetTransaction23.mmEnvironment, CardPaymentDataSetTransaction23.mmTransaction, CommonData7.mmEnvironment, CardPaymentTransaction83.mmOriginalTransaction, CardPaymentTransaction83.mmTransactionDetails,
						CardPaymentTransaction81.mmOriginalTransaction, CardPaymentTransaction81.mmTransactionDetails, CardPaymentTransaction80.mmOriginalTransaction, CardPaymentTransaction80.mmTransactionDetails,
						CardPaymentTransaction85.mmOriginalTransaction, CardPaymentTransaction85.mmTransactionDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.mmPaymentCard, com.tools20022.repository.entity.CardPayment.mmProduct, com.tools20022.repository.entity.CardPayment.mmDetailedAmount,
						com.tools20022.repository.entity.CardPayment.mmAmountQualifier, com.tools20022.repository.entity.CardPayment.mmCardPaymentAcquiring, com.tools20022.repository.entity.CardPayment.mmPaymentCardPartyRole,
						com.tools20022.repository.entity.CardPayment.mmCardPaymentStatus, com.tools20022.repository.entity.CardPayment.mmDetailedAmountLabel, com.tools20022.repository.entity.CardPayment.mmReconciliation,
						com.tools20022.repository.entity.CardPayment.mmTransactionCategory, com.tools20022.repository.entity.CardPayment.mmCashBackAmount, com.tools20022.repository.entity.CardPayment.mmGratuity,
						com.tools20022.repository.entity.CardPayment.mmDebitCreditDirection, com.tools20022.repository.entity.CardPayment.mmATMTotal);
				derivationComponent_lazy = () -> Arrays.asList(DetailedAmount4.mmObject(), AmountAndDirection41.mmObject(), AmountAndCurrency1.mmObject(), DetailedAmount12.mmObject(), ATMTransaction8.mmObject(),
						DetailedAmount13.mmObject(), DetailedAmount11.mmObject(), DetailedAmount10.mmObject(), DetailedAmount9.mmObject(), CardTransaction4.mmObject(), CardTransactionAmount2.mmObject(), DetailedAmount8.mmObject(),
						CardTransactionAmount1.mmObject(), CardTransaction8.mmObject(), CardTransaction5.mmObject(), CardTransaction15.mmObject(), CardTransaction7.mmObject(), CardTransactionDetail5.mmObject(),
						CardTransactionDetail2.mmObject(), CardTransactionDetail1.mmObject(), CardTransaction6.mmObject(), CardTransactionDetail4.mmObject(), CardTransactionDetail6.mmObject(), CardTransactionAmount5.mmObject(),
						CardTransactionAmount3.mmObject(), CardTransactionAmount4.mmObject(), CardTransactionDetail3.mmObject(), CardPaymentTransactionDetails32.mmObject(), DetailedAmount15.mmObject(),
						CardPaymentTransactionResult3.mmObject(), CardPaymentTransactionDetails28.mmObject(), CardPaymentTransaction57.mmObject(), DetailedAmount14.mmObject(), CardPaymentTransactionDetails35.mmObject(),
						CardPaymentTransactionDetails34.mmObject(), ATMTransaction18.mmObject(), ATMTransaction14.mmObject(), ATMTransaction17.mmObject(), ATMTransaction20.mmObject(), DetailedAmount18.mmObject(),
						ATMTransaction13.mmObject(), ATMTransaction16.mmObject(), ATMTransaction19.mmObject(), DetailedAmount16.mmObject(), ATMTransaction15.mmObject(), ATMTransaction21.mmObject(), ATMTransaction24.mmObject(),
						DetailedAmount17.mmObject(), ATMTransaction23.mmObject(), ATMTransaction29.mmObject(), CardPaymentTransaction68.mmObject(), CardPaymentTransaction77.mmObject(), CardPaymentTransaction78.mmObject(),
						AcceptorCancellationResponse7.mmObject(), AcceptorCancellationAdvice7.mmObject(), AcceptorCancellationAdviceResponse7.mmObject(), AcceptorDiagnosticResponse5.mmObject(),
						AcceptorCurrencyConversionRequest5.mmObject(), AcceptorCompletionAdvice7.mmObject(), AcceptorDiagnosticRequest7.mmObject(), AcceptorCurrencyConversionResponse5.mmObject(), AcceptorAuthorisationRequest7.mmObject(),
						AcceptorAuthorisationResponse7.mmObject(), AcceptorCurrencyConversionAdvice2.mmObject(), AcceptorCompletionAdviceResponse7.mmObject(), CardPaymentDataSetTransaction22.mmObject(),
						CardPaymentDataSetTransaction25.mmObject(), CardPaymentDataSetTransaction24.mmObject(), CardPaymentDataSetTransaction23.mmObject(), CommonData7.mmObject(), CardPaymentEnvironment70.mmObject(),
						CardPaymentEnvironment71.mmObject(), CardPaymentTransaction84.mmObject(), CardPaymentEnvironment69.mmObject(), AmountAndDirection93.mmObject(), CardPaymentTransactionDetails44.mmObject(),
						CardPaymentTransaction79.mmObject(), CardPaymentEnvironment68.mmObject(), CardPaymentTransaction83.mmObject(), CardPaymentTransactionDetails45.mmObject(), CardPaymentTransaction81.mmObject(),
						CardPaymentTransaction80.mmObject(), CardPaymentTransactionDetails46.mmObject(), CardPaymentTransaction85.mmObject(), CardPaymentTransaction86.mmObject());
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

	public CardPayment setPaymentCard(PaymentCard paymentCard) {
		this.paymentCard = Objects.requireNonNull(paymentCard);
		return this;
	}

	public List<Product> getProduct() {
		return product == null ? product = new ArrayList<>() : product;
	}

	public CardPayment setProduct(List<Product> product) {
		this.product = Objects.requireNonNull(product);
		return this;
	}

	public ImpliedCurrencyAndAmount getDetailedAmount() {
		return detailedAmount;
	}

	public CardPayment setDetailedAmount(ImpliedCurrencyAndAmount detailedAmount) {
		this.detailedAmount = Objects.requireNonNull(detailedAmount);
		return this;
	}

	public TypeOfAmountCode getAmountQualifier() {
		return amountQualifier;
	}

	public CardPayment setAmountQualifier(TypeOfAmountCode amountQualifier) {
		this.amountQualifier = Objects.requireNonNull(amountQualifier);
		return this;
	}

	public List<CardPaymentAcquiring> getCardPaymentAcquiring() {
		return cardPaymentAcquiring == null ? cardPaymentAcquiring = new ArrayList<>() : cardPaymentAcquiring;
	}

	public CardPayment setCardPaymentAcquiring(List<CardPaymentAcquiring> cardPaymentAcquiring) {
		this.cardPaymentAcquiring = Objects.requireNonNull(cardPaymentAcquiring);
		return this;
	}

	public List<CardPaymentPartyRole> getPaymentCardPartyRole() {
		return paymentCardPartyRole == null ? paymentCardPartyRole = new ArrayList<>() : paymentCardPartyRole;
	}

	public CardPayment setPaymentCardPartyRole(List<CardPaymentPartyRole> paymentCardPartyRole) {
		this.paymentCardPartyRole = Objects.requireNonNull(paymentCardPartyRole);
		return this;
	}

	public List<CardPaymentStatus> getCardPaymentStatus() {
		return cardPaymentStatus == null ? cardPaymentStatus = new ArrayList<>() : cardPaymentStatus;
	}

	public CardPayment setCardPaymentStatus(List<CardPaymentStatus> cardPaymentStatus) {
		this.cardPaymentStatus = Objects.requireNonNull(cardPaymentStatus);
		return this;
	}

	public Max35Text getDetailedAmountLabel() {
		return detailedAmountLabel;
	}

	public CardPayment setDetailedAmountLabel(Max35Text detailedAmountLabel) {
		this.detailedAmountLabel = Objects.requireNonNull(detailedAmountLabel);
		return this;
	}

	public Optional<ReconciliationTransaction> getReconciliation() {
		return reconciliation == null ? Optional.empty() : Optional.of(reconciliation);
	}

	public CardPayment setReconciliation(ReconciliationTransaction reconciliation) {
		this.reconciliation = reconciliation;
		return this;
	}

	public ExternalCardTransactionCategoryCode getTransactionCategory() {
		return transactionCategory;
	}

	public CardPayment setTransactionCategory(ExternalCardTransactionCategoryCode transactionCategory) {
		this.transactionCategory = Objects.requireNonNull(transactionCategory);
		return this;
	}

	public CurrencyAndAmount getCashBackAmount() {
		return cashBackAmount;
	}

	public CardPayment setCashBackAmount(CurrencyAndAmount cashBackAmount) {
		this.cashBackAmount = Objects.requireNonNull(cashBackAmount);
		return this;
	}

	public CurrencyAndAmount getGratuity() {
		return gratuity;
	}

	public CardPayment setGratuity(CurrencyAndAmount gratuity) {
		this.gratuity = Objects.requireNonNull(gratuity);
		return this;
	}

	public DebitCreditCode getDebitCreditDirection() {
		return debitCreditDirection;
	}

	public CardPayment setDebitCreditDirection(DebitCreditCode debitCreditDirection) {
		this.debitCreditDirection = Objects.requireNonNull(debitCreditDirection);
		return this;
	}

	public List<ATMTotal> getATMTotal() {
		return aTMTotal == null ? aTMTotal = new ArrayList<>() : aTMTotal;
	}

	public CardPayment setATMTotal(List<ATMTotal> aTMTotal) {
		this.aTMTotal = Objects.requireNonNull(aTMTotal);
		return this;
	}
}