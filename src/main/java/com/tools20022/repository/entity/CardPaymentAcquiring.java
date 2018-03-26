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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment processes initiated by a payment card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPaymentAcquiring" src="doc-files/CardPaymentAcquiring.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
 * CardPaymentAcquiring.mmPointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
 * CardPaymentAcquiring.mmCardPaymentService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
 * CardPaymentAcquiring.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionDateTime
 * CardPaymentAcquiring.mmTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmICCRelatedData
 * CardPaymentAcquiring.mmICCRelatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmRelatedCardPayment
 * CardPaymentAcquiring.mmRelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPresent
 * CardPaymentAcquiring.mmCardPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardholderPresent
 * CardPaymentAcquiring.mmCardholderPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmOnLineContext
 * CardPaymentAcquiring.mmOnLineContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmAttendanceContext
 * CardPaymentAcquiring.mmAttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionEnvironment
 * CardPaymentAcquiring.mmTransactionEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionChannel
 * CardPaymentAcquiring.mmTransactionChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmAttendantMessageCapable
 * CardPaymentAcquiring.mmAttendantMessageCapable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmAttendantLanguage
 * CardPaymentAcquiring.mmAttendantLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardDataEntryMode
 * CardPaymentAcquiring.mmCardDataEntryMode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmFallbackIndicator
 * CardPaymentAcquiring.mmFallbackIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTMSTrigger
 * CardPaymentAcquiring.mmTMSTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmInitiatorTransactionIdentifier
 * CardPaymentAcquiring.mmInitiatorTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmReversal
 * CardPaymentAcquiring.mmReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmInterchangeData
 * CardPaymentAcquiring.mmInterchangeData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmUnattendedLevelCategory
 * CardPaymentAcquiring.mmUnattendedLevelCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
 * CardPaymentAcquiring.mmValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCompletionRequired
 * CardPaymentAcquiring.mmCompletionRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmActionType
 * CardPaymentAcquiring.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmActionMessage
 * CardPaymentAcquiring.mmActionMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCaptureIndicator
 * CardPaymentAcquiring.mmCaptureIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmRecipientTransactionIdentification
 * CardPaymentAcquiring.mmRecipientTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmLocation
 * CardPaymentAcquiring.mmLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCountry
 * CardPaymentAcquiring.mmCountry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedCardPayment
 * Country.mmRelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
 * CardPayment.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardPaymentAcquiring
 * PointOfInteraction.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmCardPaymentAcquiring
 * TerminalManagementSystem.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCardPayment
 * CardPaymentValidation.mmCardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult8#mmAction
 * AuthorisationResult8.mmAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext3#mmTransactionContext
 * CardTransactionContext3.mmTransactionContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext1#mmTransactionContext
 * CardTransactionContext1.mmTransactionContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext1#mmSaleContext
 * CardTransactionContext1.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmReconciliation
 * CardTransaction6.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext25#mmPaymentContext
 * CardPaymentContext25.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext25#mmSaleContext
 * CardPaymentContext25.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext24#mmPaymentContext
 * CardPaymentContext24.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext24#mmSaleContext
 * CardPaymentContext24.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext20#mmPaymentContext
 * CardPaymentContext20.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext20#mmSaleContext
 * CardPaymentContext20.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext21#mmPaymentContext
 * CardPaymentContext21.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext21#mmSaleContext
 * CardPaymentContext21.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext22#mmPaymentContext
 * CardPaymentContext22.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext22#mmSaleContext
 * CardPaymentContext22.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext23#mmPaymentContext
 * CardPaymentContext23.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext23#mmSaleContext
 * CardPaymentContext23.mmSaleContext}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifier1
 * TransactionIdentifier1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SaleContext1 SaleContext1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage2 ActionMessage2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action4 Action4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage4 ActionMessage4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage3 ActionMessage3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionContext3
 * CardTransactionContext3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifier2
 * TransactionIdentifier2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionContext1
 * CardTransactionContext1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction3
 * CardTransaction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionContext4
 * CardTransactionContext4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionContext2
 * CardTransactionContext2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage5 ActionMessage5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action7 Action7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext22
 * PaymentContext22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext25
 * CardPaymentContext25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext24
 * CardPaymentContext24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext24
 * PaymentContext24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext20
 * CardPaymentContext20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext20
 * PaymentContext20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action8 Action8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext25
 * PaymentContext25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext21
 * CardPaymentContext21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext21
 * PaymentContext21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext22
 * CardPaymentContext22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext23
 * CardPaymentContext23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext23
 * PaymentContext23}</li>
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
 * "CardPaymentAcquiring"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment processes initiated by a payment card."</li>
 * </ul>
 */
public class CardPaymentAcquiring {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PointOfInteraction pointOfInteraction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardPaymentAcquiring
	 * PointOfInteraction.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43#mmPOIIdentification
	 * CardPaymentEnvironment43.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2#mmMessageDestination
	 * ActionMessage2.mmMessageDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38#mmPOIIdentification
	 * CardPaymentEnvironment38.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage3#mmDestination
	 * ActionMessage3.mmDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#mmPOI
	 * CardPaymentEnvironment61.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#mmPOIIdentification
	 * CardPaymentEnvironment64.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmPOI
	 * CardPaymentEnvironment60.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment65#mmPOIIdentification
	 * CardPaymentEnvironment65.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmPOIIdentification
	 * CardPaymentEnvironment67.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66#mmPOIIdentification
	 * CardPaymentEnvironment66.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmPOI
	 * CardPaymentEnvironment62.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63#mmPOI
	 * CardPaymentEnvironment63.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment58#mmPOI
	 * CardPaymentEnvironment58.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59#mmPOI
	 * CardPaymentEnvironment59.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#mmPOI
	 * CardPaymentEnvironment57.mmPOI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointOfInteraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the Point of Interaction through which the payment by card was initiated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CardPaymentAcquiring, Optional<PointOfInteraction>> mmPointOfInteraction = new MMBusinessAssociationEnd<CardPaymentAcquiring, Optional<PointOfInteraction>>() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentEnvironment43.mmPOIIdentification, ActionMessage2.mmMessageDestination, CardPaymentEnvironment38.mmPOIIdentification, ActionMessage3.mmDestination,
					CardPaymentEnvironment61.mmPOI, CardPaymentEnvironment64.mmPOIIdentification, CardPaymentEnvironment60.mmPOI, CardPaymentEnvironment65.mmPOIIdentification, CardPaymentEnvironment67.mmPOIIdentification,
					CardPaymentEnvironment66.mmPOIIdentification, CardPaymentEnvironment62.mmPOI, CardPaymentEnvironment63.mmPOI, CardPaymentEnvironment58.mmPOI, CardPaymentEnvironment59.mmPOI, CardPaymentEnvironment57.mmPOI);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PointOfInteraction";
			definition = "Describes the Point of Interaction through which the payment by card was initiated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PointOfInteraction.mmCardPaymentAcquiring;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PointOfInteraction.mmObject();
		}

		@Override
		public Optional<PointOfInteraction> getValue(CardPaymentAcquiring obj) {
			return obj.getPointOfInteraction();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, Optional<PointOfInteraction> value) {
			obj.setPointOfInteraction(value.orElse(null));
		}
	};
	protected CardPaymentServiceTypeCode cardPaymentService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionType
	 * CardTransaction4.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionType
	 * CardTransaction8.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionType
	 * CardTransaction5.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAdditionalService
	 * CardTransaction5.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmServiceAttribute
	 * CardTransaction5.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionType
	 * CardTransaction15.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAdditionalService
	 * CardTransaction15.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmServiceAttribute
	 * CardTransaction15.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmTransactionType
	 * CardTransaction7.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmTransactionType
	 * CardTransaction6.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#mmTransactionType
	 * CardPaymentTransaction52.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#mmAdditionalService
	 * CardPaymentTransaction52.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#mmServiceAttribute
	 * CardPaymentTransaction52.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmTransactionType
	 * CardPaymentTransaction71.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmAdditionalService
	 * CardPaymentTransaction71.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmServiceAttribute
	 * CardPaymentTransaction71.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmTransactionType
	 * CardPaymentTransaction70.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmAdditionalService
	 * CardPaymentTransaction70.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmServiceAttribute
	 * CardPaymentTransaction70.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmTransactionType
	 * CardPaymentTransaction72.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmAdditionalService
	 * CardPaymentTransaction72.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmServiceAttribute
	 * CardPaymentTransaction72.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmTransactionType
	 * CardPaymentTransaction76.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmAdditionalService
	 * CardPaymentTransaction76.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmServiceAttribute
	 * CardPaymentTransaction76.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#mmTransactionType
	 * CommonData6.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#mmAdditionalService
	 * CommonData6.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#mmServiceAttribute
	 * CommonData6.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmTransactionType
	 * CardPaymentTransaction69.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmAdditionalService
	 * CardPaymentTransaction69.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmServiceAttribute
	 * CardPaymentTransaction69.mmServiceAttribute}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of service provided by the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, CardPaymentServiceTypeCode> mmCardPaymentService = new MMBusinessAttribute<CardPaymentAcquiring, CardPaymentServiceTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransaction4.mmTransactionType, CardTransaction8.mmTransactionType, CardTransaction5.mmTransactionType, CardTransaction5.mmAdditionalService, CardTransaction5.mmServiceAttribute,
					CardTransaction15.mmTransactionType, CardTransaction15.mmAdditionalService, CardTransaction15.mmServiceAttribute, CardTransaction7.mmTransactionType, CardTransaction6.mmTransactionType,
					CardPaymentTransaction52.mmTransactionType, CardPaymentTransaction52.mmAdditionalService, CardPaymentTransaction52.mmServiceAttribute, CardPaymentTransaction71.mmTransactionType,
					CardPaymentTransaction71.mmAdditionalService, CardPaymentTransaction71.mmServiceAttribute, CardPaymentTransaction70.mmTransactionType, CardPaymentTransaction70.mmAdditionalService,
					CardPaymentTransaction70.mmServiceAttribute, CardPaymentTransaction72.mmTransactionType, CardPaymentTransaction72.mmAdditionalService, CardPaymentTransaction72.mmServiceAttribute,
					CardPaymentTransaction76.mmTransactionType, CardPaymentTransaction76.mmAdditionalService, CardPaymentTransaction76.mmServiceAttribute, CommonData6.mmTransactionType, CommonData6.mmAdditionalService,
					CommonData6.mmServiceAttribute, CardPaymentTransaction69.mmTransactionType, CardPaymentTransaction69.mmAdditionalService, CardPaymentTransaction69.mmServiceAttribute);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentService";
			definition = "Type of service provided by the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceTypeCode.mmObject();
		}

		@Override
		public CardPaymentServiceTypeCode getValue(CardPaymentAcquiring obj) {
			return obj.getCardPaymentService();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, CardPaymentServiceTypeCode value) {
			obj.setCardPaymentService(value);
		}
	};
	protected Max35Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier1#mmTransactionReference
	 * TransactionIdentifier1.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmInitiatorTransactionIdentification
	 * CardTransaction4.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmInitiatorTransactionIdentification
	 * CardTransaction8.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionLifeCycleIdentification
	 * CardTransaction8.mmTransactionLifeCycleIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAcceptorTransactionIdentification
	 * CardTransaction5.mmAcceptorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmInitiatorTransactionIdentification
	 * CardTransaction5.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction3#mmInitiatorTransactionIdentification
	 * CardTransaction3.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction3#mmInitiatorIdentification
	 * CardTransaction3.mmInitiatorIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAcceptorTransactionIdentification
	 * CardTransaction15.mmAcceptorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmInitiatorTransactionIdentification
	 * CardTransaction15.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmAcceptorTransactionIdentification
	 * CardTransaction7.mmAcceptorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmInitiatorTransactionIdentification
	 * CardTransaction7.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#mmTransactionIdentification
	 * CardPaymentTransaction52.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#mmTransactionIdentification
	 * CardPaymentTransaction57.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmTransactionIdentification
	 * ATMTransaction13.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmTransactionIdentification
	 * ATMTransaction16.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmTransactionIdentification
	 * ATMTransaction19.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmTransactionIdentification
	 * ATMTransaction15.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmTransactionIdentification
	 * ATMTransaction24.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmTransactionIdentification
	 * ATMTransaction23.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmTransactionIdentification
	 * CardPaymentTransaction71.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmTransactionIdentification
	 * CardPaymentTransaction75.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmTransactionIdentification
	 * CardPaymentTransaction74.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmTransactionIdentification
	 * CardPaymentTransaction70.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73#mmTransactionIdentification
	 * CardPaymentTransaction73.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmTransactionIdentification
	 * CardPaymentTransaction72.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmTransactionIdentification
	 * CardPaymentTransaction76.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmTransactionIdentification
	 * CardPaymentTransaction69.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction69.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#mmTransactionIdentification
	 * CardPaymentTransaction77.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#mmTransactionIdentification
	 * CardPaymentTransaction78.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, Max35Text> mmTransactionIdentification = new MMBusinessAttribute<CardPaymentAcquiring, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionIdentifier1.mmTransactionReference, CardTransaction4.mmInitiatorTransactionIdentification, CardTransaction8.mmInitiatorTransactionIdentification,
					CardTransaction8.mmTransactionLifeCycleIdentification, CardTransaction5.mmAcceptorTransactionIdentification, CardTransaction5.mmInitiatorTransactionIdentification, CardTransaction3.mmInitiatorTransactionIdentification,
					CardTransaction3.mmInitiatorIdentification, CardTransaction15.mmAcceptorTransactionIdentification, CardTransaction15.mmInitiatorTransactionIdentification, CardTransaction7.mmAcceptorTransactionIdentification,
					CardTransaction7.mmInitiatorTransactionIdentification, CardPaymentTransaction52.mmTransactionIdentification, CardPaymentTransaction57.mmTransactionIdentification, ATMTransaction13.mmTransactionIdentification,
					ATMTransaction16.mmTransactionIdentification, ATMTransaction19.mmTransactionIdentification, ATMTransaction15.mmTransactionIdentification, ATMTransaction24.mmTransactionIdentification,
					ATMTransaction23.mmTransactionIdentification, CardPaymentTransaction71.mmTransactionIdentification, CardPaymentTransaction75.mmTransactionIdentification, CardPaymentTransaction74.mmTransactionIdentification,
					CardPaymentTransaction70.mmTransactionIdentification, CardPaymentTransaction73.mmTransactionIdentification, CardPaymentTransaction72.mmTransactionIdentification, CardPaymentTransaction76.mmTransactionIdentification,
					CardPaymentTransaction69.mmTransactionIdentification, CardPaymentTransaction69.mmInitiatorTransactionIdentification, CardPaymentTransaction77.mmTransactionIdentification,
					CardPaymentTransaction78.mmTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CardPaymentAcquiring obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	protected ISODateTime transactionDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier1#mmTransactionDateTime
	 * TransactionIdentifier1.mmTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmAcceptorTransactionDateTime
	 * CardTransaction4.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmAcceptorTransactionDateTime
	 * CardTransaction8.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAcceptorTransactionDateTime
	 * CardTransaction5.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction3#mmAcceptorTransactionDateTime
	 * CardTransaction3.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAcceptorTransactionDateTime
	 * CardTransaction15.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmAcceptorTransactionDateTime
	 * CardTransaction7.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmAcceptorTransactionDateTime
	 * CardTransaction6.mmAcceptorTransactionDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local date and time of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, ISODateTime> mmTransactionDateTime = new MMBusinessAttribute<CardPaymentAcquiring, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionIdentifier1.mmTransactionDateTime, CardTransaction4.mmAcceptorTransactionDateTime, CardTransaction8.mmAcceptorTransactionDateTime, CardTransaction5.mmAcceptorTransactionDateTime,
					CardTransaction3.mmAcceptorTransactionDateTime, CardTransaction15.mmAcceptorTransactionDateTime, CardTransaction7.mmAcceptorTransactionDateTime, CardTransaction6.mmAcceptorTransactionDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionDateTime";
			definition = "Local date and time of the transaction assigned by the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CardPaymentAcquiring obj) {
			return obj.getTransactionDateTime();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, ISODateTime value) {
			obj.setTransactionDateTime(value);
		}
	};
	protected Max10000Binary iCCRelatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#mmICCRelatedData
	 * CardPaymentTransactionDetails32.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#mmICCRelatedData
	 * CardPaymentTransactionDetails28.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount14#mmICCRelatedData
	 * DetailedAmount14.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails34#mmICCRelatedData
	 * CardPaymentTransactionDetails34.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmICCRelatedData
	 * CardPaymentTransactionDetails39.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmICCRelatedData
	 * CardPaymentTransactionDetails38.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmICCRelatedData
	 * CardPaymentTransactionDetails41.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmICCRelatedData
	 * CardPaymentTransactionDetails37.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#mmICCRelatedData
	 * CardPaymentTransactionDetails40.mmICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to the interface of an integrated circuit card application."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, Max10000Binary> mmICCRelatedData = new MMBusinessAttribute<CardPaymentAcquiring, Max10000Binary>() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionDetails32.mmICCRelatedData, CardPaymentTransactionDetails28.mmICCRelatedData, DetailedAmount14.mmICCRelatedData, CardPaymentTransactionDetails34.mmICCRelatedData,
					CardPaymentTransactionDetails39.mmICCRelatedData, CardPaymentTransactionDetails38.mmICCRelatedData, CardPaymentTransactionDetails41.mmICCRelatedData, CardPaymentTransactionDetails37.mmICCRelatedData,
					CardPaymentTransactionDetails40.mmICCRelatedData);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to the interface of an integrated circuit card application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Max10000Binary getValue(CardPaymentAcquiring obj) {
			return obj.getICCRelatedData();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, Max10000Binary value) {
			obj.setICCRelatedData(value);
		}
	};
	protected CardPayment relatedCardPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAdvice2#mmTransaction
	 * ATMCompletionAdvice2.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2#mmTransaction
	 * ATMCompletionAcknowledgement2.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment which is at the origin of the acquiring process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CardPaymentAcquiring, Optional<CardPayment>> mmRelatedCardPayment = new MMBusinessAssociationEnd<CardPaymentAcquiring, Optional<CardPayment>>() {
		{
			derivation_lazy = () -> Arrays.asList(ATMCompletionAdvice2.mmTransaction, ATMCompletionAcknowledgement2.mmTransaction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Card payment which is at the origin of the acquiring process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardPayment.mmObject();
		}

		@Override
		public Optional<CardPayment> getValue(CardPaymentAcquiring obj) {
			return obj.getRelatedCardPayment();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, Optional<CardPayment> value) {
			obj.setRelatedCardPayment(value.orElse(null));
		}
	};
	protected TrueFalseIndicator cardPresent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmCardPresent
	 * CardTransactionContext2.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmCardPresent
	 * PaymentContext22.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmCardPresent
	 * PaymentContext24.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmCardPresent
	 * PaymentContext20.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmCardPresent
	 * PaymentContext25.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmCardPresent
	 * PaymentContext21.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmCardPresent
	 * PaymentContext23.mmCardPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated by a card physically present or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator> mmCardPresent = new MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransactionContext2.mmCardPresent, PaymentContext22.mmCardPresent, PaymentContext24.mmCardPresent, PaymentContext20.mmCardPresent, PaymentContext25.mmCardPresent,
					PaymentContext21.mmCardPresent, PaymentContext23.mmCardPresent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPresent";
			definition = "Indicates whether the transaction has been initiated by a card physically present or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentAcquiring obj) {
			return obj.getCardPresent();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, TrueFalseIndicator value) {
			obj.setCardPresent(value);
		}
	};
	protected TrueFalseIndicator cardholderPresent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmCardholderPresent
	 * CardTransactionContext2.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmCardholderPresent
	 * PaymentContext22.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmCardholderPresent
	 * PaymentContext24.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmCardholderPresent
	 * PaymentContext20.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmCardholderPresent
	 * PaymentContext25.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmCardholderPresent
	 * PaymentContext21.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmCardholderPresent
	 * PaymentContext23.mmCardholderPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated in presence of the cardholder or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator> mmCardholderPresent = new MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransactionContext2.mmCardholderPresent, PaymentContext22.mmCardholderPresent, PaymentContext24.mmCardholderPresent, PaymentContext20.mmCardholderPresent,
					PaymentContext25.mmCardholderPresent, PaymentContext21.mmCardholderPresent, PaymentContext23.mmCardholderPresent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderPresent";
			definition = "Indicates whether the transaction has been initiated in presence of the cardholder or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentAcquiring obj) {
			return obj.getCardholderPresent();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, TrueFalseIndicator value) {
			obj.setCardholderPresent(value);
		}
	};
	protected TrueFalseIndicator onLineContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmOnLineContext
	 * PaymentContext24.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmOnLineContext
	 * PaymentContext21.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmOnLineContext
	 * PaymentContext23.mmOnLineContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On-line or off-line context of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator> mmOnLineContext = new MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext24.mmOnLineContext, PaymentContext21.mmOnLineContext, PaymentContext23.mmOnLineContext);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLineContext";
			definition = "On-line or off-line context of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentAcquiring obj) {
			return obj.getOnLineContext();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, TrueFalseIndicator value) {
			obj.setOnLineContext(value);
		}
	};
	protected AttendanceContextCode attendanceContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmAttendanceContext
	 * CardTransactionContext2.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmAttendanceContext
	 * PaymentContext22.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmAttendanceContext
	 * PaymentContext24.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmAttendanceContext
	 * PaymentContext20.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmAttendanceContext
	 * PaymentContext25.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmAttendanceContext
	 * PaymentContext21.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent6#mmAttendanceContext
	 * StatusReportContent6.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmAttendanceContext
	 * PaymentContext23.mmAttendanceContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human attendance at the POI location during the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, AttendanceContextCode> mmAttendanceContext = new MMBusinessAttribute<CardPaymentAcquiring, AttendanceContextCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransactionContext2.mmAttendanceContext, PaymentContext22.mmAttendanceContext, PaymentContext24.mmAttendanceContext, PaymentContext20.mmAttendanceContext,
					PaymentContext25.mmAttendanceContext, PaymentContext21.mmAttendanceContext, StatusReportContent6.mmAttendanceContext, PaymentContext23.mmAttendanceContext);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI location during the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AttendanceContextCode.mmObject();
		}

		@Override
		public AttendanceContextCode getValue(CardPaymentAcquiring obj) {
			return obj.getAttendanceContext();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, AttendanceContextCode value) {
			obj.setAttendanceContext(value);
		}
	};
	protected TransactionEnvironmentCode transactionEnvironment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmTransactionEnvironment
	 * CardTransactionContext2.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmTransactionEnvironment
	 * PaymentContext22.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmTransactionEnvironment
	 * PaymentContext24.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmTransactionEnvironment
	 * PaymentContext20.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmTransactionEnvironment
	 * PaymentContext25.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmTransactionEnvironment
	 * PaymentContext21.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmTransactionEnvironment
	 * PaymentContext23.mmTransactionEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionEnvironment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the environment of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, TransactionEnvironmentCode> mmTransactionEnvironment = new MMBusinessAttribute<CardPaymentAcquiring, TransactionEnvironmentCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransactionContext2.mmTransactionEnvironment, PaymentContext22.mmTransactionEnvironment, PaymentContext24.mmTransactionEnvironment, PaymentContext20.mmTransactionEnvironment,
					PaymentContext25.mmTransactionEnvironment, PaymentContext21.mmTransactionEnvironment, PaymentContext23.mmTransactionEnvironment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionEnvironment";
			definition = "Indicates the environment of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionEnvironmentCode.mmObject();
		}

		@Override
		public TransactionEnvironmentCode getValue(CardPaymentAcquiring obj) {
			return obj.getTransactionEnvironment();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, TransactionEnvironmentCode value) {
			obj.setTransactionEnvironment(value);
		}
	};
	protected TransactionChannelCode transactionChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmTransactionChannel
	 * CardTransactionContext2.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmTransactionChannel
	 * PaymentContext22.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmTransactionChannel
	 * PaymentContext24.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmTransactionChannel
	 * PaymentContext20.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmTransactionChannel
	 * PaymentContext25.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmTransactionChannel
	 * PaymentContext21.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmTransactionChannel
	 * PaymentContext23.mmTransactionChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the type of the communication channels used by the cardholder to the acceptor system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, TransactionChannelCode> mmTransactionChannel = new MMBusinessAttribute<CardPaymentAcquiring, TransactionChannelCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransactionContext2.mmTransactionChannel, PaymentContext22.mmTransactionChannel, PaymentContext24.mmTransactionChannel, PaymentContext20.mmTransactionChannel,
					PaymentContext25.mmTransactionChannel, PaymentContext21.mmTransactionChannel, PaymentContext23.mmTransactionChannel);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionChannel";
			definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionChannelCode.mmObject();
		}

		@Override
		public TransactionChannelCode getValue(CardPaymentAcquiring obj) {
			return obj.getTransactionChannel();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, TransactionChannelCode value) {
			obj.setTransactionChannel(value);
		}
	};
	protected TrueFalseIndicator attendantMessageCapable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmAttendantMessageCapable
	 * PaymentContext22.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmAttendantMessageCapable
	 * PaymentContext24.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmAttendantMessageCapable
	 * PaymentContext20.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmAttendantMessageCapable
	 * PaymentContext25.mmAttendantMessageCapable}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantMessageCapable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a message can be sent or not on an attendant display (attendant display present or not)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator> mmAttendantMessageCapable = new MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext22.mmAttendantMessageCapable, PaymentContext24.mmAttendantMessageCapable, PaymentContext20.mmAttendantMessageCapable, PaymentContext25.mmAttendantMessageCapable);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AttendantMessageCapable";
			definition = "Indicates whether a message can be sent or not on an attendant display (attendant display present or not).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentAcquiring obj) {
			return obj.getAttendantMessageCapable();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, TrueFalseIndicator value) {
			obj.setAttendantMessageCapable(value);
		}
	};
	protected ISO2ALanguageCode attendantLanguage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmAttendantLanguage
	 * PaymentContext22.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmAttendantLanguage
	 * PaymentContext24.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmAttendantLanguage
	 * PaymentContext20.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmAttendantLanguage
	 * PaymentContext25.mmAttendantLanguage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language used to display messages to the attendant."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, ISO2ALanguageCode> mmAttendantLanguage = new MMBusinessAttribute<CardPaymentAcquiring, ISO2ALanguageCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext22.mmAttendantLanguage, PaymentContext24.mmAttendantLanguage, PaymentContext20.mmAttendantLanguage, PaymentContext25.mmAttendantLanguage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AttendantLanguage";
			definition = "Language used to display messages to the attendant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}

		@Override
		public ISO2ALanguageCode getValue(CardPaymentAcquiring obj) {
			return obj.getAttendantLanguage();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, ISO2ALanguageCode value) {
			obj.setAttendantLanguage(value);
		}
	};
	protected CardDataReadingCode cardDataEntryMode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmCardDataEntryMode
	 * CardTransactionContext2.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmCardDataEntryMode
	 * PaymentContext22.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmCardDataEntryMode
	 * PaymentContext24.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmCardDataEntryMode
	 * PaymentContext20.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmCardDataEntryMode
	 * PaymentContext25.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmCardDataEntryMode
	 * PaymentContext21.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmCardDataEntryMode
	 * PaymentContext23.mmCardDataEntryMode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDataEntryMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry mode of the card data."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, CardDataReadingCode> mmCardDataEntryMode = new MMBusinessAttribute<CardPaymentAcquiring, CardDataReadingCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransactionContext2.mmCardDataEntryMode, PaymentContext22.mmCardDataEntryMode, PaymentContext24.mmCardDataEntryMode, PaymentContext20.mmCardDataEntryMode,
					PaymentContext25.mmCardDataEntryMode, PaymentContext21.mmCardDataEntryMode, PaymentContext23.mmCardDataEntryMode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardDataEntryMode";
			definition = "Entry mode of the card data.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardDataReadingCode.mmObject();
		}

		@Override
		public CardDataReadingCode getValue(CardPaymentAcquiring obj) {
			return obj.getCardDataEntryMode();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, CardDataReadingCode value) {
			obj.setCardDataEntryMode(value);
		}
	};
	protected TrueFalseIndicator fallbackIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicator of a transaction fallback."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator> mmFallbackIndicator = new MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FallbackIndicator";
			definition = "Indicator of a transaction fallback.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentAcquiring obj) {
			return obj.getFallbackIndicator();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, TrueFalseIndicator value) {
			obj.setFallbackIndicator(value);
		}
	};
	protected List<TerminalManagementSystem> tMSTrigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmCardPaymentAcquiring
	 * TerminalManagementSystem.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4#mmTMSTrigger
	 * AcceptorDiagnosticResponse4.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult12#mmTMSTrigger
	 * AuthorisationResult12.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmTMSTrigger
	 * AuthorisationResult10.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6#mmTMSTrigger
	 * AcceptorCancellationAdviceResponse6.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6#mmTMSTrigger
	 * AcceptorCompletionAdviceResponse6.mmTMSTrigger}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CardPaymentAcquiring, List<TerminalManagementSystem>> mmTMSTrigger = new MMBusinessAssociationEnd<CardPaymentAcquiring, List<TerminalManagementSystem>>() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptorDiagnosticResponse4.mmTMSTrigger, AuthorisationResult12.mmTMSTrigger, AuthorisationResult10.mmTMSTrigger, AcceptorCancellationAdviceResponse6.mmTMSTrigger,
					AcceptorCompletionAdviceResponse6.mmTMSTrigger);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TMSTrigger";
			definition = "Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal.";
			minOccurs = 0;
			opposite_lazy = () -> TerminalManagementSystem.mmCardPaymentAcquiring;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TerminalManagementSystem.mmObject();
		}

		@Override
		public List<TerminalManagementSystem> getValue(CardPaymentAcquiring obj) {
			return obj.getTMSTrigger();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, List<TerminalManagementSystem> value) {
			obj.setTMSTrigger(value);
		}
	};
	protected Max35Text initiatorTransactionIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmInitiatorTransactionIdentification
	 * CardTransaction10.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmInitiatorTransactionIdentification
	 * CardTransaction9.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmInitiatorTransactionIdentification
	 * CardTransaction6.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction52.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction71.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction70.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction76.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatorTransactionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the initiating party for the recipient party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, Max35Text> mmInitiatorTransactionIdentifier = new MMBusinessAttribute<CardPaymentAcquiring, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransaction10.mmInitiatorTransactionIdentification, CardTransaction9.mmInitiatorTransactionIdentification, CardTransaction6.mmInitiatorTransactionIdentification,
					CardPaymentTransaction52.mmInitiatorTransactionIdentification, CardPaymentTransaction71.mmInitiatorTransactionIdentification, CardPaymentTransaction70.mmInitiatorTransactionIdentification,
					CardPaymentTransaction76.mmInitiatorTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitiatorTransactionIdentifier";
			definition = "Identification of the transaction assigned by the initiating party for the recipient party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CardPaymentAcquiring obj) {
			return obj.getInitiatorTransactionIdentifier();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, Max35Text value) {
			obj.setInitiatorTransactionIdentifier(value);
		}
	};
	protected TrueFalseIndicator reversal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmReversal
	 * CardPaymentTransaction75.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmReversal
	 * CardPaymentTransaction70.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmReversal
	 * CardPaymentTransaction69.mmReversal}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notify that a previous transaction has to be reversed if this original transaction has been approved by the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator> mmReversal = new MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransaction75.mmReversal, CardPaymentTransaction70.mmReversal, CardPaymentTransaction69.mmReversal);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reversal";
			definition = "Notify that a previous transaction has to be reversed if this original transaction has been approved by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentAcquiring obj) {
			return obj.getReversal();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, TrueFalseIndicator value) {
			obj.setReversal(value);
		}
	};
	protected Max35Text interchangeData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#mmInterchangeData
	 * CardPaymentTransaction57.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmInterchangeData
	 * CardPaymentTransaction75.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmInterchangeData
	 * CardPaymentTransaction70.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmInterchangeData
	 * CardPaymentTransaction69.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#mmInterchangeData
	 * CardPaymentTransaction77.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#mmInterchangeData
	 * CardPaymentTransaction78.mmInterchangeData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterchangeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interchange information related to the card scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, Max35Text> mmInterchangeData = new MMBusinessAttribute<CardPaymentAcquiring, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransaction57.mmInterchangeData, CardPaymentTransaction75.mmInterchangeData, CardPaymentTransaction70.mmInterchangeData, CardPaymentTransaction69.mmInterchangeData,
					CardPaymentTransaction77.mmInterchangeData, CardPaymentTransaction78.mmInterchangeData);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterchangeData";
			definition = "Interchange information related to the card scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CardPaymentAcquiring obj) {
			return obj.getInterchangeData();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, Max35Text value) {
			obj.setInterchangeData(value);
		}
	};
	protected Max35NumericText unattendedLevelCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmUnattendedLevelCategory
	 * CardTransactionDetail1.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails39.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails38.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails41.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails37.mmUnattendedLevelCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnattendedLevelCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction category level on an unattended POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, Max35NumericText> mmUnattendedLevelCategory = new MMBusinessAttribute<CardPaymentAcquiring, Max35NumericText>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransactionDetail1.mmUnattendedLevelCategory, CardPaymentTransactionDetails39.mmUnattendedLevelCategory, CardPaymentTransactionDetails38.mmUnattendedLevelCategory,
					CardPaymentTransactionDetails41.mmUnattendedLevelCategory, CardPaymentTransactionDetails37.mmUnattendedLevelCategory);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnattendedLevelCategory";
			definition = "Transaction category level on an unattended POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		@Override
		public Max35NumericText getValue(CardPaymentAcquiring obj) {
			return obj.getUnattendedLevelCategory();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, Max35NumericText value) {
			obj.setUnattendedLevelCategory(value);
		}
	};
	protected List<CardPaymentValidation> validation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCardPayment
	 * CardPaymentValidation.mmCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAuthorisationResult
	 * CardTransaction5.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAuthorisationResult
	 * CardTransaction15.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction14#mmAuthorisationResult
	 * ATMTransaction14.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmAuthorisationResult
	 * ATMTransaction17.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction20#mmAuthorisationResult
	 * ATMTransaction20.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmAuthorisationResult
	 * CardPaymentTransaction75.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmAuthorisationResult
	 * CardPaymentTransaction67.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmAuthorisationResult
	 * CardPaymentTransaction70.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction68#mmAuthorisationResult
	 * CardPaymentTransaction68.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmAuthorisationResult
	 * CardPaymentTransaction69.mmAuthorisationResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Validation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Results and parameters of the card payment verification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CardPaymentAcquiring, List<CardPaymentValidation>> mmValidation = new MMBusinessAssociationEnd<CardPaymentAcquiring, List<CardPaymentValidation>>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransaction5.mmAuthorisationResult, CardTransaction15.mmAuthorisationResult, ATMTransaction14.mmAuthorisationResult, ATMTransaction17.mmAuthorisationResult,
					ATMTransaction20.mmAuthorisationResult, CardPaymentTransaction75.mmAuthorisationResult, CardPaymentTransaction67.mmAuthorisationResult, CardPaymentTransaction70.mmAuthorisationResult,
					CardPaymentTransaction68.mmAuthorisationResult, CardPaymentTransaction69.mmAuthorisationResult);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Validation";
			definition = "Results and parameters of the card payment verification.";
			minOccurs = 0;
			opposite_lazy = () -> CardPaymentValidation.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardPaymentValidation.mmObject();
		}

		@Override
		public List<CardPaymentValidation> getValue(CardPaymentAcquiring obj) {
			return obj.getValidation();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, List<CardPaymentValidation> value) {
			obj.setValidation(value);
		}
	};
	protected TrueFalseIndicator completionRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmCompletionRequired
	 * AuthorisationResult10.mmCompletionRequired}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the acquirer requires a further exchange after the completion of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator> mmCompletionRequired = new MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(AuthorisationResult10.mmCompletionRequired);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompletionRequired";
			definition = "Indicates whether the acquirer requires a further exchange after the completion of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentAcquiring obj) {
			return obj.getCompletionRequired();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, TrueFalseIndicator value) {
			obj.setCompletionRequired(value);
		}
	};
	protected ActionTypeCode actionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Action4#mmActionType
	 * Action4.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action7#mmActionType
	 * Action7.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action8#mmActionType
	 * Action8.mmActionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of action to be performed by the POI (Point Of Interaction) system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, ActionTypeCode> mmActionType = new MMBusinessAttribute<CardPaymentAcquiring, ActionTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Action4.mmActionType, Action7.mmActionType, Action8.mmActionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionType";
			definition = "Type of action to be performed by the POI (Point Of Interaction) system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActionTypeCode.mmObject();
		}

		@Override
		public ActionTypeCode getValue(CardPaymentAcquiring obj) {
			return obj.getActionType();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, ActionTypeCode value) {
			obj.setActionType(value);
		}
	};
	protected Max256Text actionMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2#mmMessageContent
	 * ActionMessage2.mmMessageContent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action4#mmMessageToPresent
	 * Action4.mmMessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage4#mmMessage
	 * ActionMessage4.mmMessage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage3#mmContent
	 * ActionMessage3.mmContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage5#mmMessageContent
	 * ActionMessage5.mmMessageContent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action7#mmMessageToPresent
	 * Action7.mmMessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action8#mmMessageToPresent
	 * Action8.mmMessageToPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message to be displayed or printed to the cardholder or the cashier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, Max256Text> mmActionMessage = new MMBusinessAttribute<CardPaymentAcquiring, Max256Text>() {
		{
			derivation_lazy = () -> Arrays.asList(ActionMessage2.mmMessageContent, Action4.mmMessageToPresent, ActionMessage4.mmMessage, ActionMessage3.mmContent, ActionMessage5.mmMessageContent, Action7.mmMessageToPresent,
					Action8.mmMessageToPresent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionMessage";
			definition = "Message to be displayed or printed to the cardholder or the cashier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Max256Text getValue(CardPaymentAcquiring obj) {
			return obj.getActionMessage();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, Max256Text value) {
			obj.setActionMessage(value);
		}
	};
	protected TrueFalseIndicator captureIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the transaction is captured or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator> mmCaptureIndicator = new MMBusinessAttribute<CardPaymentAcquiring, TrueFalseIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CaptureIndicator";
			definition = "Indicates whether the transaction is captured or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentAcquiring obj) {
			return obj.getCaptureIndicator();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, TrueFalseIndicator value) {
			obj.setCaptureIndicator(value);
		}
	};
	protected Max35Text recipientTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the recipient party for the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, Max35Text> mmRecipientTransactionIdentification = new MMBusinessAttribute<CardPaymentAcquiring, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecipientTransactionIdentification";
			definition = "Identification of the transaction assigned by the recipient party for the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CardPaymentAcquiring obj) {
			return obj.getRecipientTransactionIdentification();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, Max35Text value) {
			obj.setRecipientTransactionIdentification(value);
		}
	};
	protected LocationCategoryCode location;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmLocationCategory
	 * CardTransactionContext2.mmLocationCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location category of the place where the merchant actually performed the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentAcquiring, LocationCategoryCode> mmLocation = new MMBusinessAttribute<CardPaymentAcquiring, LocationCategoryCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransactionContext2.mmLocationCategory);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location category of the place where the merchant actually performed the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LocationCategoryCode.mmObject();
		}

		@Override
		public LocationCategoryCode getValue(CardPaymentAcquiring obj) {
			return obj.getLocation();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, LocationCategoryCode value) {
			obj.setLocation(value);
		}
	};
	protected Country country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedCardPayment
	 * Country.mmRelatedCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the merchant where the transaction took place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CardPaymentAcquiring, Optional<Country>> mmCountry = new MMBusinessAssociationEnd<CardPaymentAcquiring, Optional<Country>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the merchant where the transaction took place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Country.mmRelatedCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}

		@Override
		public Optional<Country> getValue(CardPaymentAcquiring obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(CardPaymentAcquiring obj, Optional<Country> value) {
			obj.setCountry(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentAcquiring";
				definition = "Payment processes initiated by a payment card.";
				associationDomain_lazy = () -> Arrays.asList(Country.mmRelatedCardPayment, CardPayment.mmCardPaymentAcquiring, PointOfInteraction.mmCardPaymentAcquiring, TerminalManagementSystem.mmCardPaymentAcquiring,
						CardPaymentValidation.mmCardPayment);
				derivationElement_lazy = () -> Arrays.asList(AuthorisationResult8.mmAction, CardTransactionContext3.mmTransactionContext, CardTransactionContext1.mmTransactionContext, CardTransactionContext1.mmSaleContext,
						CardTransaction6.mmReconciliation, CardPaymentContext25.mmPaymentContext, CardPaymentContext25.mmSaleContext, CardPaymentContext24.mmPaymentContext, CardPaymentContext24.mmSaleContext,
						CardPaymentContext20.mmPaymentContext, CardPaymentContext20.mmSaleContext, CardPaymentContext21.mmPaymentContext, CardPaymentContext21.mmSaleContext, CardPaymentContext22.mmPaymentContext,
						CardPaymentContext22.mmSaleContext, CardPaymentContext23.mmPaymentContext, CardPaymentContext23.mmSaleContext);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentAcquiring.mmPointOfInteraction, com.tools20022.repository.entity.CardPaymentAcquiring.mmCardPaymentService,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmTransactionIdentification, com.tools20022.repository.entity.CardPaymentAcquiring.mmTransactionDateTime,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmICCRelatedData, com.tools20022.repository.entity.CardPaymentAcquiring.mmRelatedCardPayment,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmCardPresent, com.tools20022.repository.entity.CardPaymentAcquiring.mmCardholderPresent, com.tools20022.repository.entity.CardPaymentAcquiring.mmOnLineContext,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmAttendanceContext, com.tools20022.repository.entity.CardPaymentAcquiring.mmTransactionEnvironment,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmTransactionChannel, com.tools20022.repository.entity.CardPaymentAcquiring.mmAttendantMessageCapable,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmAttendantLanguage, com.tools20022.repository.entity.CardPaymentAcquiring.mmCardDataEntryMode,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmFallbackIndicator, com.tools20022.repository.entity.CardPaymentAcquiring.mmTMSTrigger,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmInitiatorTransactionIdentifier, com.tools20022.repository.entity.CardPaymentAcquiring.mmReversal,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmInterchangeData, com.tools20022.repository.entity.CardPaymentAcquiring.mmUnattendedLevelCategory,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmValidation, com.tools20022.repository.entity.CardPaymentAcquiring.mmCompletionRequired, com.tools20022.repository.entity.CardPaymentAcquiring.mmActionType,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmActionMessage, com.tools20022.repository.entity.CardPaymentAcquiring.mmCaptureIndicator,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmRecipientTransactionIdentification, com.tools20022.repository.entity.CardPaymentAcquiring.mmLocation,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmCountry);
				derivationComponent_lazy = () -> Arrays.asList(TransactionIdentifier1.mmObject(), SaleContext1.mmObject(), ActionMessage2.mmObject(), Action4.mmObject(), ActionMessage4.mmObject(), ActionMessage3.mmObject(),
						CardTransactionContext3.mmObject(), TransactionIdentifier2.mmObject(), CardTransactionContext1.mmObject(), CardTransaction3.mmObject(), CardTransactionContext4.mmObject(), CardTransactionContext2.mmObject(),
						SaleContext2.mmObject(), ActionMessage5.mmObject(), Action7.mmObject(), PaymentContext22.mmObject(), CardPaymentContext25.mmObject(), CardPaymentContext24.mmObject(), PaymentContext24.mmObject(),
						CardPaymentContext20.mmObject(), PaymentContext20.mmObject(), Action8.mmObject(), PaymentContext25.mmObject(), CardPaymentContext21.mmObject(), PaymentContext21.mmObject(), CardPaymentContext22.mmObject(),
						CardPaymentContext23.mmObject(), PaymentContext23.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardPaymentAcquiring.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PointOfInteraction> getPointOfInteraction() {
		return pointOfInteraction == null ? Optional.empty() : Optional.of(pointOfInteraction);
	}

	public CardPaymentAcquiring setPointOfInteraction(PointOfInteraction pointOfInteraction) {
		this.pointOfInteraction = pointOfInteraction;
		return this;
	}

	public CardPaymentServiceTypeCode getCardPaymentService() {
		return cardPaymentService;
	}

	public CardPaymentAcquiring setCardPaymentService(CardPaymentServiceTypeCode cardPaymentService) {
		this.cardPaymentService = Objects.requireNonNull(cardPaymentService);
		return this;
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public CardPaymentAcquiring setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public ISODateTime getTransactionDateTime() {
		return transactionDateTime;
	}

	public CardPaymentAcquiring setTransactionDateTime(ISODateTime transactionDateTime) {
		this.transactionDateTime = Objects.requireNonNull(transactionDateTime);
		return this;
	}

	public Max10000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public CardPaymentAcquiring setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = Objects.requireNonNull(iCCRelatedData);
		return this;
	}

	public Optional<CardPayment> getRelatedCardPayment() {
		return relatedCardPayment == null ? Optional.empty() : Optional.of(relatedCardPayment);
	}

	public CardPaymentAcquiring setRelatedCardPayment(CardPayment relatedCardPayment) {
		this.relatedCardPayment = relatedCardPayment;
		return this;
	}

	public TrueFalseIndicator getCardPresent() {
		return cardPresent;
	}

	public CardPaymentAcquiring setCardPresent(TrueFalseIndicator cardPresent) {
		this.cardPresent = Objects.requireNonNull(cardPresent);
		return this;
	}

	public TrueFalseIndicator getCardholderPresent() {
		return cardholderPresent;
	}

	public CardPaymentAcquiring setCardholderPresent(TrueFalseIndicator cardholderPresent) {
		this.cardholderPresent = Objects.requireNonNull(cardholderPresent);
		return this;
	}

	public TrueFalseIndicator getOnLineContext() {
		return onLineContext;
	}

	public CardPaymentAcquiring setOnLineContext(TrueFalseIndicator onLineContext) {
		this.onLineContext = Objects.requireNonNull(onLineContext);
		return this;
	}

	public AttendanceContextCode getAttendanceContext() {
		return attendanceContext;
	}

	public CardPaymentAcquiring setAttendanceContext(AttendanceContextCode attendanceContext) {
		this.attendanceContext = Objects.requireNonNull(attendanceContext);
		return this;
	}

	public TransactionEnvironmentCode getTransactionEnvironment() {
		return transactionEnvironment;
	}

	public CardPaymentAcquiring setTransactionEnvironment(TransactionEnvironmentCode transactionEnvironment) {
		this.transactionEnvironment = Objects.requireNonNull(transactionEnvironment);
		return this;
	}

	public TransactionChannelCode getTransactionChannel() {
		return transactionChannel;
	}

	public CardPaymentAcquiring setTransactionChannel(TransactionChannelCode transactionChannel) {
		this.transactionChannel = Objects.requireNonNull(transactionChannel);
		return this;
	}

	public TrueFalseIndicator getAttendantMessageCapable() {
		return attendantMessageCapable;
	}

	public CardPaymentAcquiring setAttendantMessageCapable(TrueFalseIndicator attendantMessageCapable) {
		this.attendantMessageCapable = Objects.requireNonNull(attendantMessageCapable);
		return this;
	}

	public ISO2ALanguageCode getAttendantLanguage() {
		return attendantLanguage;
	}

	public CardPaymentAcquiring setAttendantLanguage(ISO2ALanguageCode attendantLanguage) {
		this.attendantLanguage = Objects.requireNonNull(attendantLanguage);
		return this;
	}

	public CardDataReadingCode getCardDataEntryMode() {
		return cardDataEntryMode;
	}

	public CardPaymentAcquiring setCardDataEntryMode(CardDataReadingCode cardDataEntryMode) {
		this.cardDataEntryMode = Objects.requireNonNull(cardDataEntryMode);
		return this;
	}

	public TrueFalseIndicator getFallbackIndicator() {
		return fallbackIndicator;
	}

	public CardPaymentAcquiring setFallbackIndicator(TrueFalseIndicator fallbackIndicator) {
		this.fallbackIndicator = Objects.requireNonNull(fallbackIndicator);
		return this;
	}

	public List<TerminalManagementSystem> getTMSTrigger() {
		return tMSTrigger == null ? tMSTrigger = new ArrayList<>() : tMSTrigger;
	}

	public CardPaymentAcquiring setTMSTrigger(List<TerminalManagementSystem> tMSTrigger) {
		this.tMSTrigger = Objects.requireNonNull(tMSTrigger);
		return this;
	}

	public Max35Text getInitiatorTransactionIdentifier() {
		return initiatorTransactionIdentifier;
	}

	public CardPaymentAcquiring setInitiatorTransactionIdentifier(Max35Text initiatorTransactionIdentifier) {
		this.initiatorTransactionIdentifier = Objects.requireNonNull(initiatorTransactionIdentifier);
		return this;
	}

	public TrueFalseIndicator getReversal() {
		return reversal;
	}

	public CardPaymentAcquiring setReversal(TrueFalseIndicator reversal) {
		this.reversal = Objects.requireNonNull(reversal);
		return this;
	}

	public Max35Text getInterchangeData() {
		return interchangeData;
	}

	public CardPaymentAcquiring setInterchangeData(Max35Text interchangeData) {
		this.interchangeData = Objects.requireNonNull(interchangeData);
		return this;
	}

	public Max35NumericText getUnattendedLevelCategory() {
		return unattendedLevelCategory;
	}

	public CardPaymentAcquiring setUnattendedLevelCategory(Max35NumericText unattendedLevelCategory) {
		this.unattendedLevelCategory = Objects.requireNonNull(unattendedLevelCategory);
		return this;
	}

	public List<CardPaymentValidation> getValidation() {
		return validation == null ? validation = new ArrayList<>() : validation;
	}

	public CardPaymentAcquiring setValidation(List<CardPaymentValidation> validation) {
		this.validation = Objects.requireNonNull(validation);
		return this;
	}

	public TrueFalseIndicator getCompletionRequired() {
		return completionRequired;
	}

	public CardPaymentAcquiring setCompletionRequired(TrueFalseIndicator completionRequired) {
		this.completionRequired = Objects.requireNonNull(completionRequired);
		return this;
	}

	public ActionTypeCode getActionType() {
		return actionType;
	}

	public CardPaymentAcquiring setActionType(ActionTypeCode actionType) {
		this.actionType = Objects.requireNonNull(actionType);
		return this;
	}

	public Max256Text getActionMessage() {
		return actionMessage;
	}

	public CardPaymentAcquiring setActionMessage(Max256Text actionMessage) {
		this.actionMessage = Objects.requireNonNull(actionMessage);
		return this;
	}

	public TrueFalseIndicator getCaptureIndicator() {
		return captureIndicator;
	}

	public CardPaymentAcquiring setCaptureIndicator(TrueFalseIndicator captureIndicator) {
		this.captureIndicator = Objects.requireNonNull(captureIndicator);
		return this;
	}

	public Max35Text getRecipientTransactionIdentification() {
		return recipientTransactionIdentification;
	}

	public CardPaymentAcquiring setRecipientTransactionIdentification(Max35Text recipientTransactionIdentification) {
		this.recipientTransactionIdentification = Objects.requireNonNull(recipientTransactionIdentification);
		return this;
	}

	public LocationCategoryCode getLocation() {
		return location;
	}

	public CardPaymentAcquiring setLocation(LocationCategoryCode location) {
		this.location = Objects.requireNonNull(location);
		return this;
	}

	public Optional<Country> getCountry() {
		return country == null ? Optional.empty() : Optional.of(country);
	}

	public CardPaymentAcquiring setCountry(Country country) {
		this.country = country;
		return this;
	}
}