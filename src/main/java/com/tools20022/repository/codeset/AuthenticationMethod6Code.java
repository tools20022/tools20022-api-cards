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
import com.tools20022.repository.codeset.AuthenticationMethod6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Methods used to authenticate a person or a card.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#OnLinePIN
 * AuthenticationMethod6Code.mmOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#PaperSignature
 * AuthenticationMethod6Code.mmPaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#Password
 * AuthenticationMethod6Code.mmPassword}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#SecureCertificate
 * AuthenticationMethod6Code.mmSecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#SecuredChannel
 * AuthenticationMethod6Code.mmSecuredChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#SecureNoCertificate
 * AuthenticationMethod6Code.mmSecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#SignatureCapture
 * AuthenticationMethod6Code.mmSignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#BillingAddressVerification
 * AuthenticationMethod6Code.mmBillingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#Biometry
 * AuthenticationMethod6Code.mmBiometry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#CardholderIdentificationData
 * AuthenticationMethod6Code.mmCardholderIdentificationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#CryptogramVerification
 * AuthenticationMethod6Code.mmCryptogramVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#CSCVerification
 * AuthenticationMethod6Code.mmCSCVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#PassiveAuthentication
 * AuthenticationMethod6Code.mmPassiveAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#SecureElectronicCommerce
 * AuthenticationMethod6Code.mmSecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#ShippingAddressVerification
 * AuthenticationMethod6Code.mmShippingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#ManualVerification
 * AuthenticationMethod6Code.mmManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#OfflinePIN
 * AuthenticationMethod6Code.mmOfflinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#PaymentToken
 * AuthenticationMethod6Code.mmPaymentToken}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
 * AuthenticationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ADDB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationMethod6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Methods used to authenticate a person or a card."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationMethod6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code OnLinePIN = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.OnLinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperSignature"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code PaperSignature = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperSignature";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.PaperSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code Password = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Password";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.Password.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code SecureCertificate = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.SecureCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code SecuredChannel = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredChannel";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.SecuredChannel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureNoCertificate"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code SecureNoCertificate = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureNoCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.SecureNoCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureCapture"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code SignatureCapture = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureCapture";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.SignatureCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingAddressVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code BillingAddressVerification = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddressVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.BillingAddressVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Biometry"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code Biometry = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Biometry";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.Biometry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderIdentificationData"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code CardholderIdentificationData = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentificationData";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.CardholderIdentificationData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CryptogramVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code CryptogramVerification = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CryptogramVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.CryptogramVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code CSCVerification = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.CSCVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassiveAuthentication"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code PassiveAuthentication = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassiveAuthentication";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.PassiveAuthentication.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code SecureElectronicCommerce = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.SecureElectronicCommerce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddressVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code ShippingAddressVerification = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddressVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.ShippingAddressVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code ManualVerification = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.ManualVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePIN"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code OfflinePIN = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePIN";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.OfflinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentToken"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod6Code PaymentToken = new AuthenticationMethod6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod6Code.mmObject();
			codeName = AuthenticationMethodCode.PaymentToken.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AuthenticationMethod6Code> codesByName = new LinkedHashMap<>();

	protected AuthenticationMethod6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ADDB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethod6Code";
				definition = "Methods used to authenticate a person or a card.";
				trace_lazy = () -> AuthenticationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod6Code.OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethod6Code.PaperSignature,
						com.tools20022.repository.codeset.AuthenticationMethod6Code.Password, com.tools20022.repository.codeset.AuthenticationMethod6Code.SecureCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod6Code.SecuredChannel, com.tools20022.repository.codeset.AuthenticationMethod6Code.SecureNoCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod6Code.SignatureCapture, com.tools20022.repository.codeset.AuthenticationMethod6Code.BillingAddressVerification,
						com.tools20022.repository.codeset.AuthenticationMethod6Code.Biometry, com.tools20022.repository.codeset.AuthenticationMethod6Code.CardholderIdentificationData,
						com.tools20022.repository.codeset.AuthenticationMethod6Code.CryptogramVerification, com.tools20022.repository.codeset.AuthenticationMethod6Code.CSCVerification,
						com.tools20022.repository.codeset.AuthenticationMethod6Code.PassiveAuthentication, com.tools20022.repository.codeset.AuthenticationMethod6Code.SecureElectronicCommerce,
						com.tools20022.repository.codeset.AuthenticationMethod6Code.ShippingAddressVerification, com.tools20022.repository.codeset.AuthenticationMethod6Code.ManualVerification,
						com.tools20022.repository.codeset.AuthenticationMethod6Code.OfflinePIN, com.tools20022.repository.codeset.AuthenticationMethod6Code.PaymentToken);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OnLinePIN.getCodeName().get(), OnLinePIN);
		codesByName.put(PaperSignature.getCodeName().get(), PaperSignature);
		codesByName.put(Password.getCodeName().get(), Password);
		codesByName.put(SecureCertificate.getCodeName().get(), SecureCertificate);
		codesByName.put(SecuredChannel.getCodeName().get(), SecuredChannel);
		codesByName.put(SecureNoCertificate.getCodeName().get(), SecureNoCertificate);
		codesByName.put(SignatureCapture.getCodeName().get(), SignatureCapture);
		codesByName.put(BillingAddressVerification.getCodeName().get(), BillingAddressVerification);
		codesByName.put(Biometry.getCodeName().get(), Biometry);
		codesByName.put(CardholderIdentificationData.getCodeName().get(), CardholderIdentificationData);
		codesByName.put(CryptogramVerification.getCodeName().get(), CryptogramVerification);
		codesByName.put(CSCVerification.getCodeName().get(), CSCVerification);
		codesByName.put(PassiveAuthentication.getCodeName().get(), PassiveAuthentication);
		codesByName.put(SecureElectronicCommerce.getCodeName().get(), SecureElectronicCommerce);
		codesByName.put(ShippingAddressVerification.getCodeName().get(), ShippingAddressVerification);
		codesByName.put(ManualVerification.getCodeName().get(), ManualVerification);
		codesByName.put(OfflinePIN.getCodeName().get(), OfflinePIN);
		codesByName.put(PaymentToken.getCodeName().get(), PaymentToken);
	}

	public static AuthenticationMethod6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationMethod6Code[] values() {
		AuthenticationMethod6Code[] values = new AuthenticationMethod6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationMethod6Code> {
		@Override
		public AuthenticationMethod6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationMethod6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}