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
import com.tools20022.repository.codeset.AuthenticationMethod5Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#OnLinePIN
 * AuthenticationMethod5Code.mmOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#PaperSignature
 * AuthenticationMethod5Code.mmPaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#Password
 * AuthenticationMethod5Code.mmPassword}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#SecureCertificate
 * AuthenticationMethod5Code.mmSecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#SecuredChannel
 * AuthenticationMethod5Code.mmSecuredChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#SecureNoCertificate
 * AuthenticationMethod5Code.mmSecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#SignatureCapture
 * AuthenticationMethod5Code.mmSignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#BillingAddressVerification
 * AuthenticationMethod5Code.mmBillingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#Biometry
 * AuthenticationMethod5Code.mmBiometry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#CardholderIdentificationData
 * AuthenticationMethod5Code.mmCardholderIdentificationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#CryptogramVerification
 * AuthenticationMethod5Code.mmCryptogramVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#CSCVerification
 * AuthenticationMethod5Code.mmCSCVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#PassiveAuthentication
 * AuthenticationMethod5Code.mmPassiveAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#SecureElectronicCommerce
 * AuthenticationMethod5Code.mmSecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#ShippingAddressVerification
 * AuthenticationMethod5Code.mmShippingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#PaymentToken
 * AuthenticationMethod5Code.mmPaymentToken}</li>
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
 * "AuthenticationMethod5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Methods used to authenticate a person or a card."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationMethod5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code OnLinePIN = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.OnLinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperSignature"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code PaperSignature = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperSignature";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.PaperSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code Password = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Password";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.Password.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code SecureCertificate = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.SecureCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code SecuredChannel = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredChannel";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.SecuredChannel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureNoCertificate"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code SecureNoCertificate = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureNoCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.SecureNoCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureCapture"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code SignatureCapture = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureCapture";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.SignatureCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingAddressVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code BillingAddressVerification = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddressVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.BillingAddressVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Biometry"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code Biometry = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Biometry";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.Biometry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderIdentificationData"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code CardholderIdentificationData = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentificationData";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.CardholderIdentificationData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CryptogramVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code CryptogramVerification = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CryptogramVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.CryptogramVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code CSCVerification = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.CSCVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassiveAuthentication"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code PassiveAuthentication = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassiveAuthentication";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.PassiveAuthentication.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code SecureElectronicCommerce = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.SecureElectronicCommerce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddressVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code ShippingAddressVerification = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddressVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.ShippingAddressVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentToken"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod5Code PaymentToken = new AuthenticationMethod5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod5Code.mmObject();
			codeName = AuthenticationMethodCode.PaymentToken.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AuthenticationMethod5Code> codesByName = new LinkedHashMap<>();

	protected AuthenticationMethod5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ADDB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethod5Code";
				definition = "Methods used to authenticate a person or a card.";
				trace_lazy = () -> AuthenticationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod5Code.OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethod5Code.PaperSignature,
						com.tools20022.repository.codeset.AuthenticationMethod5Code.Password, com.tools20022.repository.codeset.AuthenticationMethod5Code.SecureCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod5Code.SecuredChannel, com.tools20022.repository.codeset.AuthenticationMethod5Code.SecureNoCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod5Code.SignatureCapture, com.tools20022.repository.codeset.AuthenticationMethod5Code.BillingAddressVerification,
						com.tools20022.repository.codeset.AuthenticationMethod5Code.Biometry, com.tools20022.repository.codeset.AuthenticationMethod5Code.CardholderIdentificationData,
						com.tools20022.repository.codeset.AuthenticationMethod5Code.CryptogramVerification, com.tools20022.repository.codeset.AuthenticationMethod5Code.CSCVerification,
						com.tools20022.repository.codeset.AuthenticationMethod5Code.PassiveAuthentication, com.tools20022.repository.codeset.AuthenticationMethod5Code.SecureElectronicCommerce,
						com.tools20022.repository.codeset.AuthenticationMethod5Code.ShippingAddressVerification, com.tools20022.repository.codeset.AuthenticationMethod5Code.PaymentToken);
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
		codesByName.put(PaymentToken.getCodeName().get(), PaymentToken);
	}

	public static AuthenticationMethod5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationMethod5Code[] values() {
		AuthenticationMethod5Code[] values = new AuthenticationMethod5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationMethod5Code> {
		@Override
		public AuthenticationMethod5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationMethod5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}