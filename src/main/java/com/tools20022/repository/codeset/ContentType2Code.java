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
import com.tools20022.repository.codeset.ContentType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identification of the type of a Cryptographic Message Syntax (CMS) data
 * structure.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ContentType2Code#PlainData
 * ContentType2Code.mmPlainData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentType2Code#SignedData
 * ContentType2Code.mmSignedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentType2Code#EnvelopedData
 * ContentType2Code.mmEnvelopedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentType2Code#DigestedData
 * ContentType2Code.mmDigestedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentType2Code#AuthenticatedData
 * ContentType2Code.mmAuthenticatedData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode
 * ContentTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DATA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ContentType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the type of a Cryptographic Message Syntax (CMS) data structure."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ContentType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code
	 * ContentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainData"</li>
	 * </ul>
	 */
	public static final ContentType2Code PlainData = new ContentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainData";
			owner_lazy = () -> com.tools20022.repository.codeset.ContentType2Code.mmObject();
			codeName = ContentTypeCode.PlainData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code
	 * ContentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedData"</li>
	 * </ul>
	 */
	public static final ContentType2Code SignedData = new ContentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedData";
			owner_lazy = () -> com.tools20022.repository.codeset.ContentType2Code.mmObject();
			codeName = ContentTypeCode.SignedData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code
	 * ContentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvelopedData"</li>
	 * </ul>
	 */
	public static final ContentType2Code EnvelopedData = new ContentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedData";
			owner_lazy = () -> com.tools20022.repository.codeset.ContentType2Code.mmObject();
			codeName = ContentTypeCode.EnvelopedData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code
	 * ContentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigestedData"</li>
	 * </ul>
	 */
	public static final ContentType2Code DigestedData = new ContentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestedData";
			owner_lazy = () -> com.tools20022.repository.codeset.ContentType2Code.mmObject();
			codeName = ContentTypeCode.DigestedData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code
	 * ContentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticatedData"</li>
	 * </ul>
	 */
	public static final ContentType2Code AuthenticatedData = new ContentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			owner_lazy = () -> com.tools20022.repository.codeset.ContentType2Code.mmObject();
			codeName = ContentTypeCode.AuthenticatedData.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ContentType2Code> codesByName = new LinkedHashMap<>();

	protected ContentType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DATA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentType2Code";
				definition = "Identification of the type of a Cryptographic Message Syntax (CMS) data structure.";
				trace_lazy = () -> ContentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ContentType2Code.PlainData, com.tools20022.repository.codeset.ContentType2Code.SignedData, com.tools20022.repository.codeset.ContentType2Code.EnvelopedData,
						com.tools20022.repository.codeset.ContentType2Code.DigestedData, com.tools20022.repository.codeset.ContentType2Code.AuthenticatedData);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PlainData.getCodeName().get(), PlainData);
		codesByName.put(SignedData.getCodeName().get(), SignedData);
		codesByName.put(EnvelopedData.getCodeName().get(), EnvelopedData);
		codesByName.put(DigestedData.getCodeName().get(), DigestedData);
		codesByName.put(AuthenticatedData.getCodeName().get(), AuthenticatedData);
	}

	public static ContentType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ContentType2Code[] values() {
		ContentType2Code[] values = new ContentType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ContentType2Code> {
		@Override
		public ContentType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ContentType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}