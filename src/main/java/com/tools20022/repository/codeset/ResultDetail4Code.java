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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ResultDetail4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Detail of the response to an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#AccountNotFound
 * ResultDetail4Code.mmAccountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#AcquirerNotSupported
 * ResultDetail4Code.mmAcquirerNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#AMLValidation
 * ResultDetail4Code.mmAMLValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#AmountNotFound
 * ResultDetail4Code.mmAmountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#AuthenticationFailed
 * ResultDetail4Code.mmAuthenticationFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#BankNotFound
 * ResultDetail4Code.mmBankNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#CardError
 * ResultDetail4Code.mmCardError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#CardVerificationFailed
 * ResultDetail4Code.mmCardVerificationFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#ClosedAccount
 * ResultDetail4Code.mmClosedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#CutoverInProcess
 * ResultDetail4Code.mmCutoverInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#DatabaseError
 * ResultDetail4Code.mmDatabaseError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#DisputedFees
 * ResultDetail4Code.mmDisputedFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#ExceededTransactionLifeCycle
 * ResultDetail4Code.mmExceededTransactionLifeCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#DepositAmountLimit
 * ResultDetail4Code.mmDepositAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#DepositNumberLimit
 * ResultDetail4Code.mmDepositNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#ExpiredCard
 * ResultDetail4Code.mmExpiredCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#FallbackDeclined
 * ResultDetail4Code.mmFallbackDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#FormatError
 * ResultDetail4Code.mmFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InProgress
 * ResultDetail4Code.mmInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InsufficientFunds
 * ResultDetail4Code.mmInsufficientFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidAcceptor
 * ResultDetail4Code.mmInvalidAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidAmount
 * ResultDetail4Code.mmInvalidAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidAddress
 * ResultDetail4Code.mmInvalidAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidBranch
 * ResultDetail4Code.mmInvalidBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidCardholderIdentification
 * ResultDetail4Code.mmInvalidCardholderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidCardNumber
 * ResultDetail4Code.mmInvalidCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidCertificate
 * ResultDetail4Code.mmInvalidCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidOriginalAmount
 * ResultDetail4Code.mmInvalidOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidPIN
 * ResultDetail4Code.mmInvalidPIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidToken
 * ResultDetail4Code.mmInvalidToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidSignature
 * ResultDetail4Code.mmInvalidSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidTokenIdentification
 * ResultDetail4Code.mmInvalidTokenIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidTransaction
 * ResultDetail4Code.mmInvalidTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidTransactionDateTime
 * ResultDetail4Code.mmInvalidTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#IssuerInoperative
 * ResultDetail4Code.mmIssuerInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#IssuerNotFound
 * ResultDetail4Code.mmIssuerNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#IssuerSignedOff
 * ResultDetail4Code.mmIssuerSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#IssuerTimeOut
 * ResultDetail4Code.mmIssuerTimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#IssuerUnavailable
 * ResultDetail4Code.mmIssuerUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#KeyStorageSaturation
 * ResultDetail4Code.mmKeyStorageSaturation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#LiabilityAccepted
 * ResultDetail4Code.mmLiabilityAccepted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail4Code#LostCard
 * ResultDetail4Code.mmLostCard}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail4Code#MACError
 * ResultDetail4Code.mmMACError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#MACKeyError
 * ResultDetail4Code.mmMACKeyError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#MissingICCData
 * ResultDetail4Code.mmMissingICCData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NewPINInvalid
 * ResultDetail4Code.mmNewPINInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NoCardRecord
 * ResultDetail4Code.mmNoCardRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NoLiabilityAccepted
 * ResultDetail4Code.mmNoLiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NotAbleToValidatePIN
 * ResultDetail4Code.mmNotAbleToValidatePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NotPermittedToAcceptor
 * ResultDetail4Code.mmNotPermittedToAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OffLineProcess
 * ResultDetail4Code.mmOffLineProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OffLineProcessAfterReferral
 * ResultDetail4Code.mmOffLineProcessAfterReferral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NotPermittedToCardholder
 * ResultDetail4Code.mmNotPermittedToCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OriginalDoesNotMatch
 * ResultDetail4Code.mmOriginalDoesNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OtherError
 * ResultDetail4Code.mmOtherError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OutOfBalance
 * ResultDetail4Code.mmOutOfBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OutOfSequence
 * ResultDetail4Code.mmOutOfSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#PINChangeRequired
 * ResultDetail4Code.mmPINChangeRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#PINDataRequired
 * ResultDetail4Code.mmPINDataRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#PINSecurityError
 * ResultDetail4Code.mmPINSecurityError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#PINTriesExceeded
 * ResultDetail4Code.mmPINTriesExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#PINEncryptionError
 * ResultDetail4Code.mmPINEncryptionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#QueueMaximumExceeded
 * ResultDetail4Code.mmQueueMaximumExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#RecurringDataError
 * ResultDetail4Code.mmRecurringDataError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#RestrictedCard
 * ResultDetail4Code.mmRestrictedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SecurityViolation
 * ResultDetail4Code.mmSecurityViolation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#ServiceNotEnabled
 * ResultDetail4Code.mmServiceNotEnabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SoftwareOrHardwareError
 * ResultDetail4Code.mmSoftwareOrHardwareError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SpecialConditions
 * ResultDetail4Code.mmSpecialConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#StolenCard
 * ResultDetail4Code.mmStolenCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SurchargeNotPermitted
 * ResultDetail4Code.mmSurchargeNotPermitted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SuspectedCounterfeitCard
 * ResultDetail4Code.mmSuspectedCounterfeitCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SuspectedFraud
 * ResultDetail4Code.mmSuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SystemInoperative
 * ResultDetail4Code.mmSystemInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SystemMalfunction
 * ResultDetail4Code.mmSystemMalfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#TerminalNotConfigured
 * ResultDetail4Code.mmTerminalNotConfigured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#ToAccountError
 * ResultDetail4Code.mmToAccountError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#TotalsNotAvailable
 * ResultDetail4Code.mmTotalsNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#TransactionDidNotComplete
 * ResultDetail4Code.mmTransactionDidNotComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#TransactionDuplicate
 * ResultDetail4Code.mmTransactionDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnableToFindOriginal
 * ResultDetail4Code.mmUnableToFindOriginal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnableToGoOnLine
 * ResultDetail4Code.mmUnableToGoOnLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnableToProcessOffLine
 * ResultDetail4Code.mmUnableToProcessOffLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnacceptableCurrency
 * ResultDetail4Code.mmUnacceptableCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnavailablecommunicationKey
 * ResultDetail4Code.mmUnavailablecommunicationKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UneffectiveCard
 * ResultDetail4Code.mmUneffectiveCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnsupportedService
 * ResultDetail4Code.mmUnsupportedService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#VendorFormatError
 * ResultDetail4Code.mmVendorFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#VendorNotFound
 * ResultDetail4Code.mmVendorNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#WithdrawalAmountLimit
 * ResultDetail4Code.mmWithdrawalAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#WithdrawalNumberLimit
 * ResultDetail4Code.mmWithdrawalNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#WrongCard
 * ResultDetail4Code.mmWrongCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidMediaType
 * ResultDetail4Code.mmInvalidMediaType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidService
 * ResultDetail4Code.mmInvalidService}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
 * ResultDetailCode}</li>
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
 * "ResultDetail4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Detail of the response to an ATM."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResultDetail4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountNotFound"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code AccountNotFound = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.AccountNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerNotSupported"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code AcquirerNotSupported = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerNotSupported";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.AcquirerNotSupported.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AMLValidation"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code AMLValidation = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AMLValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.AMLValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountNotFound"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code AmountNotFound = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.AmountNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationFailed"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code AuthenticationFailed = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationFailed";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.AuthenticationFailed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankNotFound"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code BankNotFound = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.BankNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code CardError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.CardError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerificationFailed"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code CardVerificationFailed = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerificationFailed";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.CardVerificationFailed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccount"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code ClosedAccount = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.ClosedAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutoverInProcess"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code CutoverInProcess = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutoverInProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.CutoverInProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatabaseError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code DatabaseError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatabaseError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.DatabaseError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputedFees"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code DisputedFees = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputedFees";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.DisputedFees.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceededTransactionLifeCycle"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code ExceededTransactionLifeCycle = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceededTransactionLifeCycle";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.ExceededTransactionLifeCycle.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAmountLimit"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code DepositAmountLimit = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAmountLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.DepositAmountLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositNumberLimit"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code DepositNumberLimit = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositNumberLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.DepositNumberLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiredCard"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code ExpiredCard = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiredCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.ExpiredCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackDeclined"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code FallbackDeclined = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackDeclined";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.FallbackDeclined.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code FormatError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.FormatError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InProgress"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InProgress = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InProgress";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InProgress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InsufficientFunds = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InsufficientFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAcceptor"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidAcceptor = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAcceptor";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidAcceptor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAmount"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidAmount = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAddress"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidAddress = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBranch"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidBranch = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBranch";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidBranch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardholderIdentification"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidCardholderIdentification = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardholderIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidCardholderIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardNumber"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidCardNumber = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidCardNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCertificate"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidCertificate = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOriginalAmount"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidOriginalAmount = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOriginalAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidOriginalAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPIN"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidPIN = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPIN";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidPIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidToken"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidToken = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidToken";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidToken.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSignature"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidSignature = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSignature";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTokenIdentification"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidTokenIdentification = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTokenIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidTokenIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransaction"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidTransaction = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransactionDateTime"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidTransactionDateTime = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransactionDateTime";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidTransactionDateTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInoperative"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code IssuerInoperative = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInoperative";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.IssuerInoperative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerNotFound"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code IssuerNotFound = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.IssuerNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerSignedOff"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code IssuerSignedOff = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerSignedOff";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.IssuerSignedOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerTimeOut"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code IssuerTimeOut = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerTimeOut";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.IssuerTimeOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerUnavailable"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code IssuerUnavailable = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerUnavailable";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.IssuerUnavailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyStorageSaturation"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code KeyStorageSaturation = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyStorageSaturation";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.KeyStorageSaturation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiabilityAccepted"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code LiabilityAccepted = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiabilityAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.LiabilityAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCard"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code LostCard = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.LostCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code MACError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.MACError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACKeyError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code MACKeyError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACKeyError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.MACKeyError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingICCData"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code MissingICCData = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingICCData";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.MissingICCData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPINInvalid"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code NewPINInvalid = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPINInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.NewPINInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCardRecord"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code NoCardRecord = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCardRecord";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.NoCardRecord.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoLiabilityAccepted"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code NoLiabilityAccepted = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoLiabilityAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.NoLiabilityAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAbleToValidatePIN"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code NotAbleToValidatePIN = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAbleToValidatePIN";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.NotAbleToValidatePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToAcceptor"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code NotPermittedToAcceptor = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToAcceptor";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.NotPermittedToAcceptor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcess"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code OffLineProcess = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.OffLineProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcessAfterReferral"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code OffLineProcessAfterReferral = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcessAfterReferral";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.OffLineProcessAfterReferral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToCardholder"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code NotPermittedToCardholder = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToCardholder";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.NotPermittedToCardholder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDoesNotMatch"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code OriginalDoesNotMatch = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDoesNotMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.OriginalDoesNotMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code OtherError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.OtherError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfBalance"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code OutOfBalance = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.OutOfBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfSequence"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code OutOfSequence = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfSequence";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.OutOfSequence.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChangeRequired"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code PINChangeRequired = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChangeRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.PINChangeRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINDataRequired"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code PINDataRequired = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINDataRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.PINDataRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINSecurityError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code PINSecurityError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINSecurityError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.PINSecurityError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINTriesExceeded"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code PINTriesExceeded = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINTriesExceeded";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.PINTriesExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEncryptionError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code PINEncryptionError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINEncryptionError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.PINEncryptionError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueueMaximumExceeded"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code QueueMaximumExceeded = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueMaximumExceeded";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.QueueMaximumExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringDataError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code RecurringDataError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringDataError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.RecurringDataError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedCard"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code RestrictedCard = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.RestrictedCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityViolation"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code SecurityViolation = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityViolation";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.SecurityViolation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceNotEnabled"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code ServiceNotEnabled = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceNotEnabled";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.ServiceNotEnabled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareOrHardwareError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code SoftwareOrHardwareError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareOrHardwareError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.SoftwareOrHardwareError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConditions"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code SpecialConditions = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConditions";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.SpecialConditions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StolenCard"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code StolenCard = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StolenCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.StolenCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurchargeNotPermitted"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code SurchargeNotPermitted = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurchargeNotPermitted";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.SurchargeNotPermitted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedCounterfeitCard"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code SuspectedCounterfeitCard = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedCounterfeitCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.SuspectedCounterfeitCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code SuspectedFraud = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.SuspectedFraud.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemInoperative"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code SystemInoperative = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemInoperative";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.SystemInoperative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMalfunction"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code SystemMalfunction = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMalfunction";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.SystemMalfunction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalNotConfigured"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code TerminalNotConfigured = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalNotConfigured";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.TerminalNotConfigured.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAccountError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code ToAccountError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAccountError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.ToAccountError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsNotAvailable"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code TotalsNotAvailable = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsNotAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.TotalsNotAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDidNotComplete"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code TransactionDidNotComplete = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDidNotComplete";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.TransactionDidNotComplete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDuplicate"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code TransactionDuplicate = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDuplicate";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.TransactionDuplicate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToFindOriginal"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code UnableToFindOriginal = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToFindOriginal";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.UnableToFindOriginal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToGoOnLine"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code UnableToGoOnLine = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToGoOnLine";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.UnableToGoOnLine.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToProcessOffLine"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code UnableToProcessOffLine = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToProcessOffLine";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.UnableToProcessOffLine.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptableCurrency"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code UnacceptableCurrency = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptableCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.UnacceptableCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailablecommunicationKey"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code UnavailablecommunicationKey = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailablecommunicationKey";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.UnavailablecommunicationKey.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UneffectiveCard"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code UneffectiveCard = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UneffectiveCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.UneffectiveCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsupportedService"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code UnsupportedService = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsupportedService";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.UnsupportedService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorFormatError"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code VendorFormatError = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorFormatError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.VendorFormatError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorNotFound"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code VendorNotFound = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.VendorNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAmountLimit"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code WithdrawalAmountLimit = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAmountLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.WithdrawalAmountLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalNumberLimit"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code WithdrawalNumberLimit = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalNumberLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.WithdrawalNumberLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCard"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code WrongCard = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.WrongCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMediaType"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidMediaType = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMediaType";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidMediaType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidService"</li>
	 * </ul>
	 */
	public static final ResultDetail4Code InvalidService = new ResultDetail4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidService";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail4Code.mmObject();
			codeName = ResultDetailCode.InvalidService.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ResultDetail4Code> codesByName = new LinkedHashMap<>();

	protected ResultDetail4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResultDetail4Code";
				definition = "Detail of the response to an ATM.";
				trace_lazy = () -> ResultDetailCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResultDetail4Code.AccountNotFound, com.tools20022.repository.codeset.ResultDetail4Code.AcquirerNotSupported,
						com.tools20022.repository.codeset.ResultDetail4Code.AMLValidation, com.tools20022.repository.codeset.ResultDetail4Code.AmountNotFound, com.tools20022.repository.codeset.ResultDetail4Code.AuthenticationFailed,
						com.tools20022.repository.codeset.ResultDetail4Code.BankNotFound, com.tools20022.repository.codeset.ResultDetail4Code.CardError, com.tools20022.repository.codeset.ResultDetail4Code.CardVerificationFailed,
						com.tools20022.repository.codeset.ResultDetail4Code.ClosedAccount, com.tools20022.repository.codeset.ResultDetail4Code.CutoverInProcess, com.tools20022.repository.codeset.ResultDetail4Code.DatabaseError,
						com.tools20022.repository.codeset.ResultDetail4Code.DisputedFees, com.tools20022.repository.codeset.ResultDetail4Code.ExceededTransactionLifeCycle,
						com.tools20022.repository.codeset.ResultDetail4Code.DepositAmountLimit, com.tools20022.repository.codeset.ResultDetail4Code.DepositNumberLimit, com.tools20022.repository.codeset.ResultDetail4Code.ExpiredCard,
						com.tools20022.repository.codeset.ResultDetail4Code.FallbackDeclined, com.tools20022.repository.codeset.ResultDetail4Code.FormatError, com.tools20022.repository.codeset.ResultDetail4Code.InProgress,
						com.tools20022.repository.codeset.ResultDetail4Code.InsufficientFunds, com.tools20022.repository.codeset.ResultDetail4Code.InvalidAcceptor, com.tools20022.repository.codeset.ResultDetail4Code.InvalidAmount,
						com.tools20022.repository.codeset.ResultDetail4Code.InvalidAddress, com.tools20022.repository.codeset.ResultDetail4Code.InvalidBranch,
						com.tools20022.repository.codeset.ResultDetail4Code.InvalidCardholderIdentification, com.tools20022.repository.codeset.ResultDetail4Code.InvalidCardNumber,
						com.tools20022.repository.codeset.ResultDetail4Code.InvalidCertificate, com.tools20022.repository.codeset.ResultDetail4Code.InvalidOriginalAmount, com.tools20022.repository.codeset.ResultDetail4Code.InvalidPIN,
						com.tools20022.repository.codeset.ResultDetail4Code.InvalidToken, com.tools20022.repository.codeset.ResultDetail4Code.InvalidSignature, com.tools20022.repository.codeset.ResultDetail4Code.InvalidTokenIdentification,
						com.tools20022.repository.codeset.ResultDetail4Code.InvalidTransaction, com.tools20022.repository.codeset.ResultDetail4Code.InvalidTransactionDateTime,
						com.tools20022.repository.codeset.ResultDetail4Code.IssuerInoperative, com.tools20022.repository.codeset.ResultDetail4Code.IssuerNotFound, com.tools20022.repository.codeset.ResultDetail4Code.IssuerSignedOff,
						com.tools20022.repository.codeset.ResultDetail4Code.IssuerTimeOut, com.tools20022.repository.codeset.ResultDetail4Code.IssuerUnavailable, com.tools20022.repository.codeset.ResultDetail4Code.KeyStorageSaturation,
						com.tools20022.repository.codeset.ResultDetail4Code.LiabilityAccepted, com.tools20022.repository.codeset.ResultDetail4Code.LostCard, com.tools20022.repository.codeset.ResultDetail4Code.MACError,
						com.tools20022.repository.codeset.ResultDetail4Code.MACKeyError, com.tools20022.repository.codeset.ResultDetail4Code.MissingICCData, com.tools20022.repository.codeset.ResultDetail4Code.NewPINInvalid,
						com.tools20022.repository.codeset.ResultDetail4Code.NoCardRecord, com.tools20022.repository.codeset.ResultDetail4Code.NoLiabilityAccepted, com.tools20022.repository.codeset.ResultDetail4Code.NotAbleToValidatePIN,
						com.tools20022.repository.codeset.ResultDetail4Code.NotPermittedToAcceptor, com.tools20022.repository.codeset.ResultDetail4Code.OffLineProcess,
						com.tools20022.repository.codeset.ResultDetail4Code.OffLineProcessAfterReferral, com.tools20022.repository.codeset.ResultDetail4Code.NotPermittedToCardholder,
						com.tools20022.repository.codeset.ResultDetail4Code.OriginalDoesNotMatch, com.tools20022.repository.codeset.ResultDetail4Code.OtherError, com.tools20022.repository.codeset.ResultDetail4Code.OutOfBalance,
						com.tools20022.repository.codeset.ResultDetail4Code.OutOfSequence, com.tools20022.repository.codeset.ResultDetail4Code.PINChangeRequired, com.tools20022.repository.codeset.ResultDetail4Code.PINDataRequired,
						com.tools20022.repository.codeset.ResultDetail4Code.PINSecurityError, com.tools20022.repository.codeset.ResultDetail4Code.PINTriesExceeded, com.tools20022.repository.codeset.ResultDetail4Code.PINEncryptionError,
						com.tools20022.repository.codeset.ResultDetail4Code.QueueMaximumExceeded, com.tools20022.repository.codeset.ResultDetail4Code.RecurringDataError, com.tools20022.repository.codeset.ResultDetail4Code.RestrictedCard,
						com.tools20022.repository.codeset.ResultDetail4Code.SecurityViolation, com.tools20022.repository.codeset.ResultDetail4Code.ServiceNotEnabled,
						com.tools20022.repository.codeset.ResultDetail4Code.SoftwareOrHardwareError, com.tools20022.repository.codeset.ResultDetail4Code.SpecialConditions, com.tools20022.repository.codeset.ResultDetail4Code.StolenCard,
						com.tools20022.repository.codeset.ResultDetail4Code.SurchargeNotPermitted, com.tools20022.repository.codeset.ResultDetail4Code.SuspectedCounterfeitCard,
						com.tools20022.repository.codeset.ResultDetail4Code.SuspectedFraud, com.tools20022.repository.codeset.ResultDetail4Code.SystemInoperative, com.tools20022.repository.codeset.ResultDetail4Code.SystemMalfunction,
						com.tools20022.repository.codeset.ResultDetail4Code.TerminalNotConfigured, com.tools20022.repository.codeset.ResultDetail4Code.ToAccountError, com.tools20022.repository.codeset.ResultDetail4Code.TotalsNotAvailable,
						com.tools20022.repository.codeset.ResultDetail4Code.TransactionDidNotComplete, com.tools20022.repository.codeset.ResultDetail4Code.TransactionDuplicate,
						com.tools20022.repository.codeset.ResultDetail4Code.UnableToFindOriginal, com.tools20022.repository.codeset.ResultDetail4Code.UnableToGoOnLine,
						com.tools20022.repository.codeset.ResultDetail4Code.UnableToProcessOffLine, com.tools20022.repository.codeset.ResultDetail4Code.UnacceptableCurrency,
						com.tools20022.repository.codeset.ResultDetail4Code.UnavailablecommunicationKey, com.tools20022.repository.codeset.ResultDetail4Code.UneffectiveCard,
						com.tools20022.repository.codeset.ResultDetail4Code.UnsupportedService, com.tools20022.repository.codeset.ResultDetail4Code.VendorFormatError, com.tools20022.repository.codeset.ResultDetail4Code.VendorNotFound,
						com.tools20022.repository.codeset.ResultDetail4Code.WithdrawalAmountLimit, com.tools20022.repository.codeset.ResultDetail4Code.WithdrawalNumberLimit, com.tools20022.repository.codeset.ResultDetail4Code.WrongCard,
						com.tools20022.repository.codeset.ResultDetail4Code.InvalidMediaType, com.tools20022.repository.codeset.ResultDetail4Code.InvalidService);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountNotFound.getCodeName().get(), AccountNotFound);
		codesByName.put(AcquirerNotSupported.getCodeName().get(), AcquirerNotSupported);
		codesByName.put(AMLValidation.getCodeName().get(), AMLValidation);
		codesByName.put(AmountNotFound.getCodeName().get(), AmountNotFound);
		codesByName.put(AuthenticationFailed.getCodeName().get(), AuthenticationFailed);
		codesByName.put(BankNotFound.getCodeName().get(), BankNotFound);
		codesByName.put(CardError.getCodeName().get(), CardError);
		codesByName.put(CardVerificationFailed.getCodeName().get(), CardVerificationFailed);
		codesByName.put(ClosedAccount.getCodeName().get(), ClosedAccount);
		codesByName.put(CutoverInProcess.getCodeName().get(), CutoverInProcess);
		codesByName.put(DatabaseError.getCodeName().get(), DatabaseError);
		codesByName.put(DisputedFees.getCodeName().get(), DisputedFees);
		codesByName.put(ExceededTransactionLifeCycle.getCodeName().get(), ExceededTransactionLifeCycle);
		codesByName.put(DepositAmountLimit.getCodeName().get(), DepositAmountLimit);
		codesByName.put(DepositNumberLimit.getCodeName().get(), DepositNumberLimit);
		codesByName.put(ExpiredCard.getCodeName().get(), ExpiredCard);
		codesByName.put(FallbackDeclined.getCodeName().get(), FallbackDeclined);
		codesByName.put(FormatError.getCodeName().get(), FormatError);
		codesByName.put(InProgress.getCodeName().get(), InProgress);
		codesByName.put(InsufficientFunds.getCodeName().get(), InsufficientFunds);
		codesByName.put(InvalidAcceptor.getCodeName().get(), InvalidAcceptor);
		codesByName.put(InvalidAmount.getCodeName().get(), InvalidAmount);
		codesByName.put(InvalidAddress.getCodeName().get(), InvalidAddress);
		codesByName.put(InvalidBranch.getCodeName().get(), InvalidBranch);
		codesByName.put(InvalidCardholderIdentification.getCodeName().get(), InvalidCardholderIdentification);
		codesByName.put(InvalidCardNumber.getCodeName().get(), InvalidCardNumber);
		codesByName.put(InvalidCertificate.getCodeName().get(), InvalidCertificate);
		codesByName.put(InvalidOriginalAmount.getCodeName().get(), InvalidOriginalAmount);
		codesByName.put(InvalidPIN.getCodeName().get(), InvalidPIN);
		codesByName.put(InvalidToken.getCodeName().get(), InvalidToken);
		codesByName.put(InvalidSignature.getCodeName().get(), InvalidSignature);
		codesByName.put(InvalidTokenIdentification.getCodeName().get(), InvalidTokenIdentification);
		codesByName.put(InvalidTransaction.getCodeName().get(), InvalidTransaction);
		codesByName.put(InvalidTransactionDateTime.getCodeName().get(), InvalidTransactionDateTime);
		codesByName.put(IssuerInoperative.getCodeName().get(), IssuerInoperative);
		codesByName.put(IssuerNotFound.getCodeName().get(), IssuerNotFound);
		codesByName.put(IssuerSignedOff.getCodeName().get(), IssuerSignedOff);
		codesByName.put(IssuerTimeOut.getCodeName().get(), IssuerTimeOut);
		codesByName.put(IssuerUnavailable.getCodeName().get(), IssuerUnavailable);
		codesByName.put(KeyStorageSaturation.getCodeName().get(), KeyStorageSaturation);
		codesByName.put(LiabilityAccepted.getCodeName().get(), LiabilityAccepted);
		codesByName.put(LostCard.getCodeName().get(), LostCard);
		codesByName.put(MACError.getCodeName().get(), MACError);
		codesByName.put(MACKeyError.getCodeName().get(), MACKeyError);
		codesByName.put(MissingICCData.getCodeName().get(), MissingICCData);
		codesByName.put(NewPINInvalid.getCodeName().get(), NewPINInvalid);
		codesByName.put(NoCardRecord.getCodeName().get(), NoCardRecord);
		codesByName.put(NoLiabilityAccepted.getCodeName().get(), NoLiabilityAccepted);
		codesByName.put(NotAbleToValidatePIN.getCodeName().get(), NotAbleToValidatePIN);
		codesByName.put(NotPermittedToAcceptor.getCodeName().get(), NotPermittedToAcceptor);
		codesByName.put(OffLineProcess.getCodeName().get(), OffLineProcess);
		codesByName.put(OffLineProcessAfterReferral.getCodeName().get(), OffLineProcessAfterReferral);
		codesByName.put(NotPermittedToCardholder.getCodeName().get(), NotPermittedToCardholder);
		codesByName.put(OriginalDoesNotMatch.getCodeName().get(), OriginalDoesNotMatch);
		codesByName.put(OtherError.getCodeName().get(), OtherError);
		codesByName.put(OutOfBalance.getCodeName().get(), OutOfBalance);
		codesByName.put(OutOfSequence.getCodeName().get(), OutOfSequence);
		codesByName.put(PINChangeRequired.getCodeName().get(), PINChangeRequired);
		codesByName.put(PINDataRequired.getCodeName().get(), PINDataRequired);
		codesByName.put(PINSecurityError.getCodeName().get(), PINSecurityError);
		codesByName.put(PINTriesExceeded.getCodeName().get(), PINTriesExceeded);
		codesByName.put(PINEncryptionError.getCodeName().get(), PINEncryptionError);
		codesByName.put(QueueMaximumExceeded.getCodeName().get(), QueueMaximumExceeded);
		codesByName.put(RecurringDataError.getCodeName().get(), RecurringDataError);
		codesByName.put(RestrictedCard.getCodeName().get(), RestrictedCard);
		codesByName.put(SecurityViolation.getCodeName().get(), SecurityViolation);
		codesByName.put(ServiceNotEnabled.getCodeName().get(), ServiceNotEnabled);
		codesByName.put(SoftwareOrHardwareError.getCodeName().get(), SoftwareOrHardwareError);
		codesByName.put(SpecialConditions.getCodeName().get(), SpecialConditions);
		codesByName.put(StolenCard.getCodeName().get(), StolenCard);
		codesByName.put(SurchargeNotPermitted.getCodeName().get(), SurchargeNotPermitted);
		codesByName.put(SuspectedCounterfeitCard.getCodeName().get(), SuspectedCounterfeitCard);
		codesByName.put(SuspectedFraud.getCodeName().get(), SuspectedFraud);
		codesByName.put(SystemInoperative.getCodeName().get(), SystemInoperative);
		codesByName.put(SystemMalfunction.getCodeName().get(), SystemMalfunction);
		codesByName.put(TerminalNotConfigured.getCodeName().get(), TerminalNotConfigured);
		codesByName.put(ToAccountError.getCodeName().get(), ToAccountError);
		codesByName.put(TotalsNotAvailable.getCodeName().get(), TotalsNotAvailable);
		codesByName.put(TransactionDidNotComplete.getCodeName().get(), TransactionDidNotComplete);
		codesByName.put(TransactionDuplicate.getCodeName().get(), TransactionDuplicate);
		codesByName.put(UnableToFindOriginal.getCodeName().get(), UnableToFindOriginal);
		codesByName.put(UnableToGoOnLine.getCodeName().get(), UnableToGoOnLine);
		codesByName.put(UnableToProcessOffLine.getCodeName().get(), UnableToProcessOffLine);
		codesByName.put(UnacceptableCurrency.getCodeName().get(), UnacceptableCurrency);
		codesByName.put(UnavailablecommunicationKey.getCodeName().get(), UnavailablecommunicationKey);
		codesByName.put(UneffectiveCard.getCodeName().get(), UneffectiveCard);
		codesByName.put(UnsupportedService.getCodeName().get(), UnsupportedService);
		codesByName.put(VendorFormatError.getCodeName().get(), VendorFormatError);
		codesByName.put(VendorNotFound.getCodeName().get(), VendorNotFound);
		codesByName.put(WithdrawalAmountLimit.getCodeName().get(), WithdrawalAmountLimit);
		codesByName.put(WithdrawalNumberLimit.getCodeName().get(), WithdrawalNumberLimit);
		codesByName.put(WrongCard.getCodeName().get(), WrongCard);
		codesByName.put(InvalidMediaType.getCodeName().get(), InvalidMediaType);
		codesByName.put(InvalidService.getCodeName().get(), InvalidService);
	}

	public static ResultDetail4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResultDetail4Code[] values() {
		ResultDetail4Code[] values = new ResultDetail4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResultDetail4Code> {
		@Override
		public ResultDetail4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResultDetail4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}