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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that manages the account on behalf of the account owner, that is
 * manages the registration and booking of entries on the account, calculates
 * balances on the account and provides information about the account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountServicerRole" src="doc-files/AccountServicerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
 * AccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount1#mmServicer
 * CardAccount1.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#mmServicer
 * CardAccount2.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#mmServicer
 * CardAccount10.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount9#mmServicer
 * CardAccount9.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8#mmServicer
 * CardAccount8.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount11#mmServicer
 * CardAccount11.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount13#mmServicer
 * CardAccount13.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7#mmServicer
 * CardAccount7.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount12#mmServicer
 * CardAccount12.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount14#mmServicer
 * CardAccount14.mmServicer}</li>
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
 * "AccountServicerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
 * </li>
 * </ul>
 */
public class AccountServicerRole extends AccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountServicerRole";
				definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
				derivationElement_lazy = () -> Arrays.asList(CardAccount1.mmServicer, CardAccount2.mmServicer, CardAccount10.mmServicer, CardAccount9.mmServicer, CardAccount8.mmServicer, CardAccount11.mmServicer, CardAccount13.mmServicer,
						CardAccount7.mmServicer, CardAccount12.mmServicer, CardAccount14.mmServicer);
				superType_lazy = () -> AccountPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountServicerRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}