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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV06;
import com.tools20022.repository.area.caaa.AcceptorBatchTransferV06;
import com.tools20022.repository.area.cain.KeyExchangeInitiation;
import com.tools20022.repository.area.cain.KeyExchangeResponse;
import com.tools20022.repository.area.catm.*;
import com.tools20022.repository.codeset.ContentType2Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AuthenticatedData4;
import com.tools20022.repository.msg.DigestedData4;
import com.tools20022.repository.msg.EnvelopedData4;
import com.tools20022.repository.msg.SignedData4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General cryptographic message syntax (CMS) containing protected data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmContentType
 * ContentInformationType12.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmEnvelopedData
 * ContentInformationType12.mmEnvelopedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmAuthenticatedData
 * ContentInformationType12.mmAuthenticatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmSignedData
 * ContentInformationType12.mmSignedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmDigestedData
 * ContentInformationType12.mmDigestedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.KeyExchangeResponse#mmSecurityTrailer
 * KeyExchangeResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.KeyExchangeInitiation#mmSecurityTrailer
 * KeyExchangeInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV02#mmSecurityTrailer
 * MaintenanceDelegationResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV06#mmSecurityTrailer
 * StatusReportV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV06#mmSecurityTrailer
 * AcceptorConfigurationUpdateV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03#mmSecurityTrailer
 * MaintenanceDelegationRequestV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV06#mmSecurityTrailer
 * ManagementPlanReplacementV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV06#mmSecurityTrailer
 * AcceptorBatchTransferResponseV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV06#mmSecurityTrailer
 * AcceptorBatchTransferV06.mmSecurityTrailer}</li>
 * </ul>
 * </li>
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
 * "ContentInformationType12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing protected data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType13
 * ContentInformationType13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType14
 * ContentInformationType14}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContentInformationType12", propOrder = {"contentType", "envelopedData", "authenticatedData", "signedData", "digestedData"})
public class ContentInformationType12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CnttTp", required = true)
	protected ContentType2Code contentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code
	 * ContentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of data protection."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType13#mmContentType
	 * ContentInformationType13.mmContentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType14#mmContentType
	 * ContentInformationType14.mmContentType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContentInformationType12, ContentType2Code> mmContentType = new MMMessageAttribute<ContentInformationType12, ContentType2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType13.mmContentType, ContentInformationType14.mmContentType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType2Code.mmObject();
		}

		@Override
		public ContentType2Code getValue(ContentInformationType12 obj) {
			return obj.getContentType();
		}

		@Override
		public void setValue(ContentInformationType12 obj, ContentType2Code value) {
			obj.setContentType(value);
		}
	};
	@XmlElement(name = "EnvlpdData")
	protected EnvelopedData4 envelopedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EnvelopedData4
	 * EnvelopedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EnvlpdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvelopedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protection by encryption, with a session key."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContentInformationType12, Optional<EnvelopedData4>> mmEnvelopedData = new MMMessageAssociationEnd<ContentInformationType12, Optional<EnvelopedData4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "EnvlpdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedData";
			definition = "Data protection by encryption, with a session key.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EnvelopedData4.mmObject();
		}

		@Override
		public Optional<EnvelopedData4> getValue(ContentInformationType12 obj) {
			return obj.getEnvelopedData();
		}

		@Override
		public void setValue(ContentInformationType12 obj, Optional<EnvelopedData4> value) {
			obj.setEnvelopedData(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthntcdData")
	protected AuthenticatedData4 authenticatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protection by a message authentication code (MAC)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType13#mmAuthenticatedData
	 * ContentInformationType13.mmAuthenticatedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContentInformationType12, Optional<AuthenticatedData4>> mmAuthenticatedData = new MMMessageAssociationEnd<ContentInformationType12, Optional<AuthenticatedData4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType13.mmAuthenticatedData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AuthenticatedData4.mmObject();
		}

		@Override
		public Optional<AuthenticatedData4> getValue(ContentInformationType12 obj) {
			return obj.getAuthenticatedData();
		}

		@Override
		public void setValue(ContentInformationType12 obj, Optional<AuthenticatedData4> value) {
			obj.setAuthenticatedData(value.orElse(null));
		}
	};
	@XmlElement(name = "SgndData")
	protected SignedData4 signedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedData4
	 * SignedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgndData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protected by a digital signatures."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType13#mmSignedData
	 * ContentInformationType13.mmSignedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType14#mmSignedData
	 * ContentInformationType14.mmSignedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContentInformationType12, Optional<SignedData4>> mmSignedData = new MMMessageAssociationEnd<ContentInformationType12, Optional<SignedData4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "SgndData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedData";
			definition = "Data protected by a digital signatures.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType13.mmSignedData, ContentInformationType14.mmSignedData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedData4.mmObject();
		}

		@Override
		public Optional<SignedData4> getValue(ContentInformationType12 obj) {
			return obj.getSignedData();
		}

		@Override
		public void setValue(ContentInformationType12 obj, Optional<SignedData4> value) {
			obj.setSignedData(value.orElse(null));
		}
	};
	@XmlElement(name = "DgstdData")
	protected DigestedData4 digestedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DigestedData4
	 * DigestedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgstdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigestedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protected by a digest."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContentInformationType12, Optional<DigestedData4>> mmDigestedData = new MMMessageAssociationEnd<ContentInformationType12, Optional<DigestedData4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "DgstdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestedData";
			definition = "Data protected by a digest.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DigestedData4.mmObject();
		}

		@Override
		public Optional<DigestedData4> getValue(ContentInformationType12 obj) {
			return obj.getDigestedData();
		}

		@Override
		public void setValue(ContentInformationType12 obj, Optional<DigestedData4> value) {
			obj.setDigestedData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType12.mmContentType, com.tools20022.repository.msg.ContentInformationType12.mmEnvelopedData,
						com.tools20022.repository.msg.ContentInformationType12.mmAuthenticatedData, com.tools20022.repository.msg.ContentInformationType12.mmSignedData, com.tools20022.repository.msg.ContentInformationType12.mmDigestedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(KeyExchangeResponse.mmSecurityTrailer, KeyExchangeInitiation.mmSecurityTrailer, MaintenanceDelegationResponseV02.mmSecurityTrailer, StatusReportV06.mmSecurityTrailer,
						AcceptorConfigurationUpdateV06.mmSecurityTrailer, MaintenanceDelegationRequestV03.mmSecurityTrailer, ManagementPlanReplacementV06.mmSecurityTrailer, AcceptorBatchTransferResponseV06.mmSecurityTrailer,
						AcceptorBatchTransferV06.mmSecurityTrailer);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType12";
				definition = "General cryptographic message syntax (CMS) containing protected data.";
				nextVersions_lazy = () -> Arrays.asList(ContentInformationType13.mmObject(), ContentInformationType14.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ContentType2Code getContentType() {
		return contentType;
	}

	public ContentInformationType12 setContentType(ContentType2Code contentType) {
		this.contentType = Objects.requireNonNull(contentType);
		return this;
	}

	public Optional<EnvelopedData4> getEnvelopedData() {
		return envelopedData == null ? Optional.empty() : Optional.of(envelopedData);
	}

	public ContentInformationType12 setEnvelopedData(EnvelopedData4 envelopedData) {
		this.envelopedData = envelopedData;
		return this;
	}

	public Optional<AuthenticatedData4> getAuthenticatedData() {
		return authenticatedData == null ? Optional.empty() : Optional.of(authenticatedData);
	}

	public ContentInformationType12 setAuthenticatedData(AuthenticatedData4 authenticatedData) {
		this.authenticatedData = authenticatedData;
		return this;
	}

	public Optional<SignedData4> getSignedData() {
		return signedData == null ? Optional.empty() : Optional.of(signedData);
	}

	public ContentInformationType12 setSignedData(SignedData4 signedData) {
		this.signedData = signedData;
		return this;
	}

	public Optional<DigestedData4> getDigestedData() {
		return digestedData == null ? Optional.empty() : Optional.of(digestedData);
	}

	public ContentInformationType12 setDigestedData(DigestedData4 digestedData) {
		this.digestedData = digestedData;
		return this;
	}
}