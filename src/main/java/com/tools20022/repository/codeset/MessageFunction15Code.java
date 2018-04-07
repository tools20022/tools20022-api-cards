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
import com.tools20022.repository.codeset.MessageFunction15Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#FinancialAuthorisationRequest
 * MessageFunction15Code.FinancialAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#CancellationRequest
 * MessageFunction15Code.CancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#CompletionAdvice
 * MessageFunction15Code.CompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#DiagnosticRequest
 * MessageFunction15Code.DiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#ReconciliationRequest
 * MessageFunction15Code.ReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#CancellationAdvice
 * MessageFunction15Code.CancellationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#BatchTransfer
 * MessageFunction15Code.BatchTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#FinancialReversalAdvice
 * MessageFunction15Code.FinancialReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#AuthorisationRequest
 * MessageFunction15Code.AuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#FinancialCompletionAdvice
 * MessageFunction15Code.FinancialCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#CurrencyConversionRequest
 * MessageFunction15Code.CurrencyConversionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#ReversalAdvice
 * MessageFunction15Code.ReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code#CurrencyConversionAdvice
 * MessageFunction15Code.CurrencyConversionAdvice}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FAUQ"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageFunction15Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of message supporting a service."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageFunction15Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code FinancialAuthorisationRequest = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAuthorisationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.FinancialAuthorisationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code CancellationRequest = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.CancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code CompletionAdvice = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.CompletionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code DiagnosticRequest = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.DiagnosticRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code ReconciliationRequest = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.ReconciliationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code CancellationAdvice = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.CancellationAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransfer"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code BatchTransfer = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.BatchTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code FinancialReversalAdvice = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialReversalAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.FinancialReversalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code AuthorisationRequest = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code FinancialCompletionAdvice = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCompletionAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.FinancialCompletionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code CurrencyConversionRequest = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code ReversalAdvice = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.ReversalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction15Code
	 * MessageFunction15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction15Code CurrencyConversionAdvice = new MessageFunction15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction15Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionAdvice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageFunction15Code> codesByName = new LinkedHashMap<>();

	protected MessageFunction15Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FAUQ");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunction15Code";
				definition = "Type of message supporting a service.";
				trace_lazy = () -> MessageFunctionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction15Code.FinancialAuthorisationRequest, com.tools20022.repository.codeset.MessageFunction15Code.CancellationRequest,
						com.tools20022.repository.codeset.MessageFunction15Code.CompletionAdvice, com.tools20022.repository.codeset.MessageFunction15Code.DiagnosticRequest,
						com.tools20022.repository.codeset.MessageFunction15Code.ReconciliationRequest, com.tools20022.repository.codeset.MessageFunction15Code.CancellationAdvice,
						com.tools20022.repository.codeset.MessageFunction15Code.BatchTransfer, com.tools20022.repository.codeset.MessageFunction15Code.FinancialReversalAdvice,
						com.tools20022.repository.codeset.MessageFunction15Code.AuthorisationRequest, com.tools20022.repository.codeset.MessageFunction15Code.FinancialCompletionAdvice,
						com.tools20022.repository.codeset.MessageFunction15Code.CurrencyConversionRequest, com.tools20022.repository.codeset.MessageFunction15Code.ReversalAdvice,
						com.tools20022.repository.codeset.MessageFunction15Code.CurrencyConversionAdvice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FinancialAuthorisationRequest.getCodeName().get(), FinancialAuthorisationRequest);
		codesByName.put(CancellationRequest.getCodeName().get(), CancellationRequest);
		codesByName.put(CompletionAdvice.getCodeName().get(), CompletionAdvice);
		codesByName.put(DiagnosticRequest.getCodeName().get(), DiagnosticRequest);
		codesByName.put(ReconciliationRequest.getCodeName().get(), ReconciliationRequest);
		codesByName.put(CancellationAdvice.getCodeName().get(), CancellationAdvice);
		codesByName.put(BatchTransfer.getCodeName().get(), BatchTransfer);
		codesByName.put(FinancialReversalAdvice.getCodeName().get(), FinancialReversalAdvice);
		codesByName.put(AuthorisationRequest.getCodeName().get(), AuthorisationRequest);
		codesByName.put(FinancialCompletionAdvice.getCodeName().get(), FinancialCompletionAdvice);
		codesByName.put(CurrencyConversionRequest.getCodeName().get(), CurrencyConversionRequest);
		codesByName.put(ReversalAdvice.getCodeName().get(), ReversalAdvice);
		codesByName.put(CurrencyConversionAdvice.getCodeName().get(), CurrencyConversionAdvice);
	}

	public static MessageFunction15Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageFunction15Code[] values() {
		MessageFunction15Code[] values = new MessageFunction15Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageFunction15Code> {
		@Override
		public MessageFunction15Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageFunction15Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}