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

package com.tools20022.repository.area.catm;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TerminalManagementLatestVersion;
import com.tools20022.repository.msg.ContentInformationType18;
import com.tools20022.repository.msg.Header29;
import com.tools20022.repository.msg.MaintenanceDelegationRequest4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * A terminal manager requests to the master terminal manager the delegation of
 * maintenance functions or maintenance operation on the terminal estate managed
 * by the master terminal manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV04#mmHeader
 * MaintenanceDelegationRequestV04.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV04#mmMaintenanceDelegationRequest
 * MaintenanceDelegationRequestV04.mmMaintenanceDelegationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV04#mmSecurityTrailer
 * MaintenanceDelegationRequestV04.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MntncDlgtnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TerminalManagementLatestVersion
 * TerminalManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catm.005.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MaintenanceDelegationRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A terminal manager requests to the master terminal manager the delegation of maintenance functions or maintenance operation on the terminal estate managed by the master terminal manager."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegationRequestV04", propOrder = {"header", "maintenanceDelegationRequest", "securityTrailer"})
public class MaintenanceDelegationRequestV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr")
	protected Header29 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header29
	 * Header29}</li>
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
	 * definition} = "Information related to the protocol management."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MaintenanceDelegationRequestV04, Optional<Header29>> mmHeader = new MMMessageBuildingBlock<MaintenanceDelegationRequestV04, Optional<Header29>>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Header29.mmObject();
		}

		@Override
		public Optional<Header29> getValue(MaintenanceDelegationRequestV04 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(MaintenanceDelegationRequestV04 obj, Optional<Header29> value) {
			obj.setHeader(value.orElse(null));
		}
	};
	@XmlElement(name = "MntncDlgtnReq", required = true)
	protected MaintenanceDelegationRequest4 maintenanceDelegationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest4
	 * MaintenanceDelegationRequest4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntncDlgtnReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaintenanceDelegationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the request of maintenance delegations."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MaintenanceDelegationRequestV04, MaintenanceDelegationRequest4> mmMaintenanceDelegationRequest = new MMMessageBuildingBlock<MaintenanceDelegationRequestV04, MaintenanceDelegationRequest4>() {
		{
			xmlTag = "MntncDlgtnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceDelegationRequest";
			definition = "Information related to the request of maintenance delegations.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MaintenanceDelegationRequest4.mmObject();
		}

		@Override
		public MaintenanceDelegationRequest4 getValue(MaintenanceDelegationRequestV04 obj) {
			return obj.getMaintenanceDelegationRequest();
		}

		@Override
		public void setValue(MaintenanceDelegationRequestV04 obj, MaintenanceDelegationRequest4 value) {
			obj.setMaintenanceDelegationRequest(value);
		}
	};
	@XmlElement(name = "SctyTrlr", required = true)
	protected ContentInformationType18 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType18
	 * ContentInformationType18}</li>
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
	public static final MMMessageBuildingBlock<MaintenanceDelegationRequestV04, ContentInformationType18> mmSecurityTrailer = new MMMessageBuildingBlock<MaintenanceDelegationRequestV04, ContentInformationType18>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType18.mmObject();
		}

		@Override
		public ContentInformationType18 getValue(MaintenanceDelegationRequestV04 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(MaintenanceDelegationRequestV04 obj, ContentInformationType18 value) {
			obj.setSecurityTrailer(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegationRequestV04";
				definition = "A terminal manager requests to the master terminal manager the delegation of maintenance functions or maintenance operation on the terminal estate managed by the master terminal manager.";
				rootElement = "Document";
				xmlTag = "MntncDlgtnReq";
				businessArea_lazy = () -> TerminalManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.MaintenanceDelegationRequestV04.mmHeader,
						com.tools20022.repository.area.catm.MaintenanceDelegationRequestV04.mmMaintenanceDelegationRequest, com.tools20022.repository.area.catm.MaintenanceDelegationRequestV04.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "005";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MaintenanceDelegationRequestV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Header29> getHeader() {
		return header == null ? Optional.empty() : Optional.of(header);
	}

	public MaintenanceDelegationRequestV04 setHeader(Header29 header) {
		this.header = header;
		return this;
	}

	public MaintenanceDelegationRequest4 getMaintenanceDelegationRequest() {
		return maintenanceDelegationRequest;
	}

	public MaintenanceDelegationRequestV04 setMaintenanceDelegationRequest(MaintenanceDelegationRequest4 maintenanceDelegationRequest) {
		this.maintenanceDelegationRequest = Objects.requireNonNull(maintenanceDelegationRequest);
		return this;
	}

	public ContentInformationType18 getSecurityTrailer() {
		return securityTrailer;
	}

	public MaintenanceDelegationRequestV04 setSecurityTrailer(ContentInformationType18 securityTrailer) {
		this.securityTrailer = Objects.requireNonNull(securityTrailer);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.005.001.04")
	static public class Document {
		@XmlElement(name = "MntncDlgtnReq", required = true)
		public MaintenanceDelegationRequestV04 messageBody;
	}
}