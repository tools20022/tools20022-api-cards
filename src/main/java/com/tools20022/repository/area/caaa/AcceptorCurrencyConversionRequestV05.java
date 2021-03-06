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

package com.tools20022.repository.area.caaa;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion;
import com.tools20022.repository.msg.AcceptorCurrencyConversionRequest5;
import com.tools20022.repository.msg.ContentInformationType16;
import com.tools20022.repository.msg.Header35;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorCurrencyConversionRequest message is sent by the card acceptor to
 * the currency conversion service provider to request if the cardholder is able
 * to pay in the currency of its card.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV05#mmHeader
 * AcceptorCurrencyConversionRequestV05.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV05#mmCurrencyConversionRequest
 * AcceptorCurrencyConversionRequestV05.mmCurrencyConversionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV05#mmSecurityTrailer
 * AcceptorCurrencyConversionRequestV05.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrCcyConvsReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion
 * AcceptortoAcquirerCardTransactionLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.016.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCurrencyConversionRequestV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorCurrencyConversionRequest message is sent by the card acceptor to the currency conversion service provider to request if the cardholder is able to pay in the currency of its card.\r\n"
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorCurrencyConversionRequestV05", propOrder = {"header", "currencyConversionRequest", "securityTrailer"})
public class AcceptorCurrencyConversionRequestV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header35 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header35
	 * Header35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency Conversion request message management information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorCurrencyConversionRequestV05, Header35> mmHeader = new MMMessageBuildingBlock<AcceptorCurrencyConversionRequestV05, Header35>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Currency Conversion request message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header35.mmObject();
		}

		@Override
		public Header35 getValue(AcceptorCurrencyConversionRequestV05 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorCurrencyConversionRequestV05 obj, Header35 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "CcyConvsReq", required = true)
	protected AcceptorCurrencyConversionRequest5 currencyConversionRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest5
	 * AcceptorCurrencyConversionRequest5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvsReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the currency conversion request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorCurrencyConversionRequestV05, AcceptorCurrencyConversionRequest5> mmCurrencyConversionRequest = new MMMessageBuildingBlock<AcceptorCurrencyConversionRequestV05, AcceptorCurrencyConversionRequest5>() {
		{
			xmlTag = "CcyConvsReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionRequest";
			definition = "Information related to the currency conversion request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorCurrencyConversionRequest5.mmObject();
		}

		@Override
		public AcceptorCurrencyConversionRequest5 getValue(AcceptorCurrencyConversionRequestV05 obj) {
			return obj.getCurrencyConversionRequest();
		}

		@Override
		public void setValue(AcceptorCurrencyConversionRequestV05 obj, AcceptorCurrencyConversionRequest5 value) {
			obj.setCurrencyConversionRequest(value);
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType16 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType16
	 * ContentInformationType16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer of the message containing a MAC."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorCurrencyConversionRequestV05, Optional<ContentInformationType16>> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorCurrencyConversionRequestV05, Optional<ContentInformationType16>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType16.mmObject();
		}

		@Override
		public Optional<ContentInformationType16> getValue(AcceptorCurrencyConversionRequestV05 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorCurrencyConversionRequestV05 obj, Optional<ContentInformationType16> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCurrencyConversionRequestV05";
				definition = "The AcceptorCurrencyConversionRequest message is sent by the card acceptor to the currency conversion service provider to request if the cardholder is able to pay in the currency of its card.\r\n";
				rootElement = "Document";
				xmlTag = "AccptrCcyConvsReq";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV05.mmHeader,
						com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV05.mmCurrencyConversionRequest, com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV05.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "016";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorCurrencyConversionRequestV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header35 getHeader() {
		return header;
	}

	public AcceptorCurrencyConversionRequestV05 setHeader(Header35 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorCurrencyConversionRequest5 getCurrencyConversionRequest() {
		return currencyConversionRequest;
	}

	public AcceptorCurrencyConversionRequestV05 setCurrencyConversionRequest(AcceptorCurrencyConversionRequest5 currencyConversionRequest) {
		this.currencyConversionRequest = Objects.requireNonNull(currencyConversionRequest);
		return this;
	}

	public Optional<ContentInformationType16> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public AcceptorCurrencyConversionRequestV05 setSecurityTrailer(ContentInformationType16 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.016.001.05")
	static public class Document {
		@XmlElement(name = "AccptrCcyConvsReq", required = true)
		public AcceptorCurrencyConversionRequestV05 messageBody;
	}
}