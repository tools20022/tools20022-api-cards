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
import com.tools20022.repository.codeset.MessageFunction14Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of message supporting a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#AuthorisationRequest
 * MessageFunction14Code.AuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#AuthorisationResponse
 * MessageFunction14Code.AuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CancellationAdvice
 * MessageFunction14Code.CancellationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CancellationAdviceResponse
 * MessageFunction14Code.CancellationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CancellationRequest
 * MessageFunction14Code.CancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CancellationResponse
 * MessageFunction14Code.CancellationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CompletionAdvice
 * MessageFunction14Code.CompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CompletionAdviceResponse
 * MessageFunction14Code.CompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CurrencyConversionAdvice
 * MessageFunction14Code.CurrencyConversionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CurrencyConversionAdviceResponse
 * MessageFunction14Code.CurrencyConversionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CurrencyConversionRequest
 * MessageFunction14Code.CurrencyConversionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CurrencyConversionResponse
 * MessageFunction14Code.CurrencyConversionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#DiagnosticRequest
 * MessageFunction14Code.DiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#DiagnosticResponse
 * MessageFunction14Code.DiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#FinancialAuthorisationRequest
 * MessageFunction14Code.FinancialAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#FinancialAuthorisationResponse
 * MessageFunction14Code.FinancialAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#FinancialCompletionAdvice
 * MessageFunction14Code.FinancialCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#FinancialCompletionAdviceResponse
 * MessageFunction14Code.FinancialCompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#FinancialReversalAdvice
 * MessageFunction14Code.FinancialReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#FinancialReversalAdviceResponse
 * MessageFunction14Code.FinancialReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#ReconciliationRequest
 * MessageFunction14Code.ReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#ReconciliationResponse
 * MessageFunction14Code.ReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#ReversalAdvice
 * MessageFunction14Code.ReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#ReversalAdviceResponse
 * MessageFunction14Code.ReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CardDebitAdvice
 * MessageFunction14Code.CardDebitAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CardDebitAdviceResponse
 * MessageFunction14Code.CardDebitAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CardDebitRequest
 * MessageFunction14Code.CardDebitRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code#CardDebitResponse
 * MessageFunction14Code.CardDebitResponse}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
 * MessageFunctionCode}</li>
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
 * "MessageFunction14Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of message supporting a service."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageFunction14Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code AuthorisationRequest = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code AuthorisationResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CancellationAdvice = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CancellationAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CancellationAdviceResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CancellationAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CancellationRequest = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CancellationResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CancellationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CompletionAdvice = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CompletionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CompletionAdviceResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CompletionAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CurrencyConversionAdvice = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CurrencyConversionAdviceResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CurrencyConversionRequest = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CurrencyConversionResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code DiagnosticRequest = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.DiagnosticRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code DiagnosticResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.DiagnosticResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code FinancialAuthorisationRequest = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAuthorisationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.FinancialAuthorisationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code FinancialAuthorisationResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAuthorisationResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.FinancialAuthorisationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code FinancialCompletionAdvice = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCompletionAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.FinancialCompletionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code FinancialCompletionAdviceResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCompletionAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.FinancialCompletionAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code FinancialReversalAdvice = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialReversalAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.FinancialReversalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code FinancialReversalAdviceResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialReversalAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.FinancialReversalAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code ReconciliationRequest = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.ReconciliationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code ReconciliationResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.ReconciliationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code ReversalAdvice = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.ReversalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code ReversalAdviceResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.ReversalAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDebitAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CardDebitAdvice = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDebitAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CardDebitAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDebitAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CardDebitAdviceResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDebitAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CardDebitAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDebitRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CardDebitRequest = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDebitRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CardDebitRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction14Code
	 * MessageFunction14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDebitResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction14Code CardDebitResponse = new MessageFunction14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDebitResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction14Code.mmObject();
			codeName = MessageFunctionCode.CardDebitResponse.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageFunction14Code> codesByName = new LinkedHashMap<>();

	protected MessageFunction14Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunction14Code";
				definition = "Type of message supporting a service.";
				trace_lazy = () -> MessageFunctionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction14Code.AuthorisationRequest, com.tools20022.repository.codeset.MessageFunction14Code.AuthorisationResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.CancellationAdvice, com.tools20022.repository.codeset.MessageFunction14Code.CancellationAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.CancellationRequest, com.tools20022.repository.codeset.MessageFunction14Code.CancellationResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.CompletionAdvice, com.tools20022.repository.codeset.MessageFunction14Code.CompletionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.CurrencyConversionAdvice, com.tools20022.repository.codeset.MessageFunction14Code.CurrencyConversionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.CurrencyConversionRequest, com.tools20022.repository.codeset.MessageFunction14Code.CurrencyConversionResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.DiagnosticRequest, com.tools20022.repository.codeset.MessageFunction14Code.DiagnosticResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.FinancialAuthorisationRequest, com.tools20022.repository.codeset.MessageFunction14Code.FinancialAuthorisationResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.FinancialCompletionAdvice, com.tools20022.repository.codeset.MessageFunction14Code.FinancialCompletionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.FinancialReversalAdvice, com.tools20022.repository.codeset.MessageFunction14Code.FinancialReversalAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.ReconciliationRequest, com.tools20022.repository.codeset.MessageFunction14Code.ReconciliationResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.ReversalAdvice, com.tools20022.repository.codeset.MessageFunction14Code.ReversalAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.CardDebitAdvice, com.tools20022.repository.codeset.MessageFunction14Code.CardDebitAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction14Code.CardDebitRequest, com.tools20022.repository.codeset.MessageFunction14Code.CardDebitResponse);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AuthorisationRequest.getCodeName().get(), AuthorisationRequest);
		codesByName.put(AuthorisationResponse.getCodeName().get(), AuthorisationResponse);
		codesByName.put(CancellationAdvice.getCodeName().get(), CancellationAdvice);
		codesByName.put(CancellationAdviceResponse.getCodeName().get(), CancellationAdviceResponse);
		codesByName.put(CancellationRequest.getCodeName().get(), CancellationRequest);
		codesByName.put(CancellationResponse.getCodeName().get(), CancellationResponse);
		codesByName.put(CompletionAdvice.getCodeName().get(), CompletionAdvice);
		codesByName.put(CompletionAdviceResponse.getCodeName().get(), CompletionAdviceResponse);
		codesByName.put(CurrencyConversionAdvice.getCodeName().get(), CurrencyConversionAdvice);
		codesByName.put(CurrencyConversionAdviceResponse.getCodeName().get(), CurrencyConversionAdviceResponse);
		codesByName.put(CurrencyConversionRequest.getCodeName().get(), CurrencyConversionRequest);
		codesByName.put(CurrencyConversionResponse.getCodeName().get(), CurrencyConversionResponse);
		codesByName.put(DiagnosticRequest.getCodeName().get(), DiagnosticRequest);
		codesByName.put(DiagnosticResponse.getCodeName().get(), DiagnosticResponse);
		codesByName.put(FinancialAuthorisationRequest.getCodeName().get(), FinancialAuthorisationRequest);
		codesByName.put(FinancialAuthorisationResponse.getCodeName().get(), FinancialAuthorisationResponse);
		codesByName.put(FinancialCompletionAdvice.getCodeName().get(), FinancialCompletionAdvice);
		codesByName.put(FinancialCompletionAdviceResponse.getCodeName().get(), FinancialCompletionAdviceResponse);
		codesByName.put(FinancialReversalAdvice.getCodeName().get(), FinancialReversalAdvice);
		codesByName.put(FinancialReversalAdviceResponse.getCodeName().get(), FinancialReversalAdviceResponse);
		codesByName.put(ReconciliationRequest.getCodeName().get(), ReconciliationRequest);
		codesByName.put(ReconciliationResponse.getCodeName().get(), ReconciliationResponse);
		codesByName.put(ReversalAdvice.getCodeName().get(), ReversalAdvice);
		codesByName.put(ReversalAdviceResponse.getCodeName().get(), ReversalAdviceResponse);
		codesByName.put(CardDebitAdvice.getCodeName().get(), CardDebitAdvice);
		codesByName.put(CardDebitAdviceResponse.getCodeName().get(), CardDebitAdviceResponse);
		codesByName.put(CardDebitRequest.getCodeName().get(), CardDebitRequest);
		codesByName.put(CardDebitResponse.getCodeName().get(), CardDebitResponse);
	}

	public static MessageFunction14Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageFunction14Code[] values() {
		MessageFunction14Code[] values = new MessageFunction14Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageFunction14Code> {
		@Override
		public MessageFunction14Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageFunction14Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}