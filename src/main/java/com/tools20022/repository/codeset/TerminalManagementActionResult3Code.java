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
import com.tools20022.repository.codeset.TerminalManagementActionResult3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Final result of the processed terminal management action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#AccessDenied
 * TerminalManagementActionResult3Code.mmAccessDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#ConnectionError
 * TerminalManagementActionResult3Code.mmConnectionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#FormatError
 * TerminalManagementActionResult3Code.mmFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#InvalidContent
 * TerminalManagementActionResult3Code.mmInvalidContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#LengthError
 * TerminalManagementActionResult3Code.mmLengthError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#MemoryOverflow
 * TerminalManagementActionResult3Code.mmMemoryOverflow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#MissingFile
 * TerminalManagementActionResult3Code.mmMissingFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#NotSupported
 * TerminalManagementActionResult3Code.mmNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#SignatureError
 * TerminalManagementActionResult3Code.mmSignatureError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#Success
 * TerminalManagementActionResult3Code.mmSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#SyntaxError
 * TerminalManagementActionResult3Code.mmSyntaxError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#Timeout
 * TerminalManagementActionResult3Code.mmTimeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#UnknownData
 * TerminalManagementActionResult3Code.mmUnknownData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#UnknownKeyReference
 * TerminalManagementActionResult3Code.mmUnknownKeyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#InvalidDelegationProof
 * TerminalManagementActionResult3Code.mmInvalidDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#InvalidDelegationInManagementPlan
 * TerminalManagementActionResult3Code.mmInvalidDelegationInManagementPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#DelegationParametersReceivedUnauthorized
 * TerminalManagementActionResult3Code.
 * mmDelegationParametersReceivedUnauthorized}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
 * TerminalManagementActionResultCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACCD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementActionResult3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Final result of the processed terminal management action."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementActionResult3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccessDenied"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code AccessDenied = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccessDenied";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.AccessDenied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConnectionError"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code ConnectionError = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConnectionError";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.ConnectionError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatError"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code FormatError = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.FormatError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidContent"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code InvalidContent = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidContent";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.InvalidContent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LengthError"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code LengthError = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LengthError";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.LengthError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemoryOverflow"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code MemoryOverflow = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoryOverflow";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.MemoryOverflow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingFile"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code MissingFile = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingFile";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.MissingFile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupported"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code NotSupported = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupported";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.NotSupported.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureError"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code SignatureError = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureError";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.SignatureError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Success"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code Success = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Success";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.Success.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyntaxError"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code SyntaxError = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyntaxError";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.SyntaxError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Timeout"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code Timeout = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Timeout";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.Timeout.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownData"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code UnknownData = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownData";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.UnknownData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownKeyReference"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code UnknownKeyReference = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownKeyReference";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.UnknownKeyReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDelegationProof"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code InvalidDelegationProof = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationProof";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.InvalidDelegationProof.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDelegationInManagementPlan"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code InvalidDelegationInManagementPlan = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationInManagementPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.InvalidDelegationInManagementPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationParametersReceivedUnauthorized"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code DelegationParametersReceivedUnauthorized = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationParametersReceivedUnauthorized";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.DelegationParametersReceivedUnauthorized.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminalManagementActionResult3Code> codesByName = new LinkedHashMap<>();

	protected TerminalManagementActionResult3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionResult3Code";
				definition = "Final result of the processed terminal management action.";
				trace_lazy = () -> TerminalManagementActionResultCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionResult3Code.AccessDenied, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.ConnectionError,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.FormatError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.InvalidContent,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.LengthError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.MemoryOverflow,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.MissingFile, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.NotSupported,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.SignatureError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.Success,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.SyntaxError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.Timeout,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.UnknownData, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.UnknownKeyReference,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.InvalidDelegationProof, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.InvalidDelegationInManagementPlan,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.DelegationParametersReceivedUnauthorized);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccessDenied.getCodeName().get(), AccessDenied);
		codesByName.put(ConnectionError.getCodeName().get(), ConnectionError);
		codesByName.put(FormatError.getCodeName().get(), FormatError);
		codesByName.put(InvalidContent.getCodeName().get(), InvalidContent);
		codesByName.put(LengthError.getCodeName().get(), LengthError);
		codesByName.put(MemoryOverflow.getCodeName().get(), MemoryOverflow);
		codesByName.put(MissingFile.getCodeName().get(), MissingFile);
		codesByName.put(NotSupported.getCodeName().get(), NotSupported);
		codesByName.put(SignatureError.getCodeName().get(), SignatureError);
		codesByName.put(Success.getCodeName().get(), Success);
		codesByName.put(SyntaxError.getCodeName().get(), SyntaxError);
		codesByName.put(Timeout.getCodeName().get(), Timeout);
		codesByName.put(UnknownData.getCodeName().get(), UnknownData);
		codesByName.put(UnknownKeyReference.getCodeName().get(), UnknownKeyReference);
		codesByName.put(InvalidDelegationProof.getCodeName().get(), InvalidDelegationProof);
		codesByName.put(InvalidDelegationInManagementPlan.getCodeName().get(), InvalidDelegationInManagementPlan);
		codesByName.put(DelegationParametersReceivedUnauthorized.getCodeName().get(), DelegationParametersReceivedUnauthorized);
	}

	public static TerminalManagementActionResult3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementActionResult3Code[] values() {
		TerminalManagementActionResult3Code[] values = new TerminalManagementActionResult3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementActionResult3Code> {
		@Override
		public TerminalManagementActionResult3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementActionResult3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}