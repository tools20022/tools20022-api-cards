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
import com.tools20022.repository.codeset.CardPaymentServiceType9Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Service provided by the card payment transaction, in addition to the main
 * service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#Aggregation
 * CardPaymentServiceType9Code.mmAggregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#DCC
 * CardPaymentServiceType9Code.mmDCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#Gratuity
 * CardPaymentServiceType9Code.mmGratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#Loyalty
 * CardPaymentServiceType9Code.mmLoyalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#NoShow
 * CardPaymentServiceType9Code.mmNoShow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#PurchaseCorporate
 * CardPaymentServiceType9Code.mmPurchaseCorporate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#RecurringPayment
 * CardPaymentServiceType9Code.mmRecurringPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#SolicitedAvailableFunds
 * CardPaymentServiceType9Code.mmSolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#VoiceAuthorisation
 * CardPaymentServiceType9Code.mmVoiceAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#IssuerInstalment
 * CardPaymentServiceType9Code.mmIssuerInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#AcceptorInstalment
 * CardPaymentServiceType9Code.mmAcceptorInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#CashBack
 * CardPaymentServiceType9Code.mmCashBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#Instant
 * CardPaymentServiceType9Code.mmInstant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#NonRefundable
 * CardPaymentServiceType9Code.mmNonRefundable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
 * CardPaymentServiceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AGGR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceType9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Service provided by the card payment transaction, in addition to the main service."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceType9Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aggregation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code Aggregation = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aggregation";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Aggregation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DCC"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code DCC = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DCC";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.DCC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code Gratuity = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gratuity";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Gratuity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loyalty"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code Loyalty = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loyalty";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Loyalty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoShow"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code NoShow = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoShow";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.NoShow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseCorporate"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code PurchaseCorporate = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseCorporate";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PurchaseCorporate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code RecurringPayment = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.RecurringPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedAvailableFunds"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code SolicitedAvailableFunds = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitedAvailableFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.SolicitedAvailableFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoiceAuthorisation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code VoiceAuthorisation = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoiceAuthorisation";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.VoiceAuthorisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInstalment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code IssuerInstalment = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInstalment";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.IssuerInstalment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorInstalment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code AcceptorInstalment = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorInstalment";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.AcceptorInstalment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBack"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code CashBack = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBack";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instant"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code Instant = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instant";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Instant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonRefundable"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code NonRefundable = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonRefundable";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.NonRefundable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceType9Code> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceType9Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AGGR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType9Code";
				definition = "Service provided by the card payment transaction, in addition to the main service.";
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.Aggregation, com.tools20022.repository.codeset.CardPaymentServiceType9Code.DCC,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.Gratuity, com.tools20022.repository.codeset.CardPaymentServiceType9Code.Loyalty, com.tools20022.repository.codeset.CardPaymentServiceType9Code.NoShow,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.PurchaseCorporate, com.tools20022.repository.codeset.CardPaymentServiceType9Code.RecurringPayment,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.SolicitedAvailableFunds, com.tools20022.repository.codeset.CardPaymentServiceType9Code.VoiceAuthorisation,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.IssuerInstalment, com.tools20022.repository.codeset.CardPaymentServiceType9Code.AcceptorInstalment,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.CashBack, com.tools20022.repository.codeset.CardPaymentServiceType9Code.Instant,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.NonRefundable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Aggregation.getCodeName().get(), Aggregation);
		codesByName.put(DCC.getCodeName().get(), DCC);
		codesByName.put(Gratuity.getCodeName().get(), Gratuity);
		codesByName.put(Loyalty.getCodeName().get(), Loyalty);
		codesByName.put(NoShow.getCodeName().get(), NoShow);
		codesByName.put(PurchaseCorporate.getCodeName().get(), PurchaseCorporate);
		codesByName.put(RecurringPayment.getCodeName().get(), RecurringPayment);
		codesByName.put(SolicitedAvailableFunds.getCodeName().get(), SolicitedAvailableFunds);
		codesByName.put(VoiceAuthorisation.getCodeName().get(), VoiceAuthorisation);
		codesByName.put(IssuerInstalment.getCodeName().get(), IssuerInstalment);
		codesByName.put(AcceptorInstalment.getCodeName().get(), AcceptorInstalment);
		codesByName.put(CashBack.getCodeName().get(), CashBack);
		codesByName.put(Instant.getCodeName().get(), Instant);
		codesByName.put(NonRefundable.getCodeName().get(), NonRefundable);
	}

	public static CardPaymentServiceType9Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceType9Code[] values() {
		CardPaymentServiceType9Code[] values = new CardPaymentServiceType9Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceType9Code> {
		@Override
		public CardPaymentServiceType9Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceType9Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}