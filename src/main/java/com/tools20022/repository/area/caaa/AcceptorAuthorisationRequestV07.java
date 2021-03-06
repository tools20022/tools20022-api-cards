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
import com.tools20022.repository.msg.AcceptorAuthorisationRequest7;
import com.tools20022.repository.msg.ContentInformationType16;
import com.tools20022.repository.msg.Header35;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorAuthorisationRequest message is sent by an acceptor (or its
 * agent) to the acquirer (or its agent), to check with the issuer (or its
 * agent) that the account associated to the card has the resources to fund the
 * payment. This checking will include validation of the card data and any
 * additional transaction data provided.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07#mmHeader
 * AcceptorAuthorisationRequestV07.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07#mmAuthorisationRequest
 * AcceptorAuthorisationRequestV07.mmAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07#mmSecurityTrailer
 * AcceptorAuthorisationRequestV07.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrAuthstnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion
 * AcceptortoAcquirerCardTransactionLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.001.001.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorAuthorisationRequestV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorAuthorisationRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent), to check with the issuer (or its agent) that the account associated to the card has the resources to fund the payment. This checking will include validation of the card data and any additional transaction data provided."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorAuthorisationRequestV07", propOrder = {"header", "authorisationRequest", "securityTrailer"})
public class AcceptorAuthorisationRequestV07 {

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
	 * definition} = "Authorisation request message management information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorAuthorisationRequestV07, Header35> mmHeader = new MMMessageBuildingBlock<AcceptorAuthorisationRequestV07, Header35>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Authorisation request message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header35.mmObject();
		}

		@Override
		public Header35 getValue(AcceptorAuthorisationRequestV07 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorAuthorisationRequestV07 obj, Header35 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "AuthstnReq", required = true)
	protected AcceptorAuthorisationRequest7 authorisationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest7
	 * AcceptorAuthorisationRequest7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the authorisation request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorAuthorisationRequestV07, AcceptorAuthorisationRequest7> mmAuthorisationRequest = new MMMessageBuildingBlock<AcceptorAuthorisationRequestV07, AcceptorAuthorisationRequest7>() {
		{
			xmlTag = "AuthstnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			definition = "Information related to the authorisation request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorAuthorisationRequest7.mmObject();
		}

		@Override
		public AcceptorAuthorisationRequest7 getValue(AcceptorAuthorisationRequestV07 obj) {
			return obj.getAuthorisationRequest();
		}

		@Override
		public void setValue(AcceptorAuthorisationRequestV07 obj, AcceptorAuthorisationRequest7 value) {
			obj.setAuthorisationRequest(value);
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
	public static final MMMessageBuildingBlock<AcceptorAuthorisationRequestV07, Optional<ContentInformationType16>> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorAuthorisationRequestV07, Optional<ContentInformationType16>>() {
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
		public Optional<ContentInformationType16> getValue(AcceptorAuthorisationRequestV07 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorAuthorisationRequestV07 obj, Optional<ContentInformationType16> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorAuthorisationRequestV07";
				definition = "The AcceptorAuthorisationRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent), to check with the issuer (or its agent) that the account associated to the card has the resources to fund the payment. This checking will include validation of the card data and any additional transaction data provided.";
				rootElement = "Document";
				xmlTag = "AccptrAuthstnReq";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07.mmHeader, com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07.mmAuthorisationRequest,
						com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "001";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorAuthorisationRequestV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header35 getHeader() {
		return header;
	}

	public AcceptorAuthorisationRequestV07 setHeader(Header35 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorAuthorisationRequest7 getAuthorisationRequest() {
		return authorisationRequest;
	}

	public AcceptorAuthorisationRequestV07 setAuthorisationRequest(AcceptorAuthorisationRequest7 authorisationRequest) {
		this.authorisationRequest = Objects.requireNonNull(authorisationRequest);
		return this;
	}

	public Optional<ContentInformationType16> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public AcceptorAuthorisationRequestV07 setSecurityTrailer(ContentInformationType16 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.001.001.07")
	static public class Document {
		@XmlElement(name = "AccptrAuthstnReq", required = true)
		public AcceptorAuthorisationRequestV07 messageBody;
	}
}