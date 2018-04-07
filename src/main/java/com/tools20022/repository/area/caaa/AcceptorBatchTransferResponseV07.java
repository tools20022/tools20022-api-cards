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
import com.tools20022.repository.msg.CardPaymentBatchTransferResponse6;
import com.tools20022.repository.msg.ContentInformationType16;
import com.tools20022.repository.msg.Header25;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to
 * inform the acceptor (or its agent) of the transfer in a previous
 * AcceptorBatchTransfer of a collection of transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV07#mmHeader
 * AcceptorBatchTransferResponseV07.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV07#mmBatchTransferResponse
 * AcceptorBatchTransferResponseV07.mmBatchTransferResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV07#mmSecurityTrailer
 * AcceptorBatchTransferResponseV07.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrBtchTrfRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion
 * AcceptortoAcquirerCardTransactionLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.012.001.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorBatchTransferResponseV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to inform the acceptor (or its agent) of the transfer in a previous AcceptorBatchTransfer of a collection of transactions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorBatchTransferResponseV07", propOrder = {"header", "batchTransferResponse", "securityTrailer"})
public class AcceptorBatchTransferResponseV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header25 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header25
	 * Header25}</li>
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
	 * definition} = "Capture advice response message management information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorBatchTransferResponseV07, Header25> mmHeader = new MMMessageBuildingBlock<AcceptorBatchTransferResponseV07, Header25>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Capture advice response message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header25.mmObject();
		}

		@Override
		public Header25 getValue(AcceptorBatchTransferResponseV07 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorBatchTransferResponseV07 obj, Header25 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "BtchTrfRspn", required = true)
	protected CardPaymentBatchTransferResponse6 batchTransferResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse6
	 * CardPaymentBatchTransferResponse6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchTrfRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransferResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the previously sent set of transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorBatchTransferResponseV07, CardPaymentBatchTransferResponse6> mmBatchTransferResponse = new MMMessageBuildingBlock<AcceptorBatchTransferResponseV07, CardPaymentBatchTransferResponse6>() {
		{
			xmlTag = "BtchTrfRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransferResponse";
			definition = "Information related to the previously sent set of transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentBatchTransferResponse6.mmObject();
		}

		@Override
		public CardPaymentBatchTransferResponse6 getValue(AcceptorBatchTransferResponseV07 obj) {
			return obj.getBatchTransferResponse();
		}

		@Override
		public void setValue(AcceptorBatchTransferResponseV07 obj, CardPaymentBatchTransferResponse6 value) {
			obj.setBatchTransferResponse(value);
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
	 * definition} =
	 * "Trailer of the message containing a MAC or a digital signature."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorBatchTransferResponseV07, Optional<ContentInformationType16>> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorBatchTransferResponseV07, Optional<ContentInformationType16>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType16.mmObject();
		}

		@Override
		public Optional<ContentInformationType16> getValue(AcceptorBatchTransferResponseV07 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorBatchTransferResponseV07 obj, Optional<ContentInformationType16> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorBatchTransferResponseV07";
				definition = "The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to inform the acceptor (or its agent) of the transfer in a previous AcceptorBatchTransfer of a collection of transactions.";
				rootElement = "Document";
				xmlTag = "AccptrBtchTrfRspn";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV07.mmHeader, com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV07.mmBatchTransferResponse,
						com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV07.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "012";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorBatchTransferResponseV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header25 getHeader() {
		return header;
	}

	public AcceptorBatchTransferResponseV07 setHeader(Header25 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public CardPaymentBatchTransferResponse6 getBatchTransferResponse() {
		return batchTransferResponse;
	}

	public AcceptorBatchTransferResponseV07 setBatchTransferResponse(CardPaymentBatchTransferResponse6 batchTransferResponse) {
		this.batchTransferResponse = Objects.requireNonNull(batchTransferResponse);
		return this;
	}

	public Optional<ContentInformationType16> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public AcceptorBatchTransferResponseV07 setSecurityTrailer(ContentInformationType16 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.012.001.07")
	static public class Document {
		@XmlElement(name = "AccptrBtchTrfRspn", required = true)
		public AcceptorBatchTransferResponseV07 messageBody;
	}
}