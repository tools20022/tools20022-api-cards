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

package com.tools20022.repository;

import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.other.SignatureEnvelope;
import com.tools20022.repository.other.SupplementaryDataEnvelope1;
import java.util.List;

class ListBuilderForGeneratedRepository_02 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) ATMCommand13.mmObject());
		list.add((T) KeyChoiceValue2.mmObject());
		list.add((T) TRRelatedData2.mmObject());
		list.add((T) ATMSecurityDevice2.mmObject());
		list.add((T) SecurityParameters10.mmObject());
		list.add((T) ATMSecurityContext5.mmObject());
		list.add((T) CryptographicKey11.mmObject());
		list.add((T) AcceptorCancellationResponse7.mmObject());
		list.add((T) ContentInformationType16.mmObject());
		list.add((T) Header35.mmObject());
		list.add((T) Header36.mmObject());
		list.add((T) AcceptorCancellationAdvice7.mmObject());
		list.add((T) AcceptorConfiguration7.mmObject());
		list.add((T) ContentInformationType18.mmObject());
		list.add((T) CardPaymentBatchTransferResponse6.mmObject());
		list.add((T) AcceptorCancellationAdviceResponse7.mmObject());
		list.add((T) AcceptorDiagnosticResponse5.mmObject());
		list.add((T) AcceptorCurrencyConversionRequest5.mmObject());
		list.add((T) AcceptorCompletionAdvice7.mmObject());
		list.add((T) StatusReport7.mmObject());
		list.add((T) CardPaymentBatchTransfer6.mmObject());
		list.add((T) AcceptorDiagnosticRequest7.mmObject());
		list.add((T) AcceptorCurrencyConversionResponse5.mmObject());
		list.add((T) AcceptorAuthorisationRequest7.mmObject());
		list.add((T) ManagementPlan7.mmObject());
		list.add((T) AcceptorAuthorisationResponse7.mmObject());
		list.add((T) AcceptorCurrencyConversionAdvice2.mmObject());
		list.add((T) AcceptorReconciliationRequest7.mmObject());
		list.add((T) AcceptorReconciliationResponse5.mmObject());
		list.add((T) MaintenanceDelegationResponse3.mmObject());
		list.add((T) AcceptorCompletionAdviceResponse7.mmObject());
		list.add((T) MaintenanceDelegationRequest4.mmObject());
		list.add((T) PhysicalInterfaceParameter1.mmObject());
		list.add((T) CardPaymentInvoice3.mmObject());
		list.add((T) InvoiceHeader3.mmObject());
		list.add((T) TradeDelivery3.mmObject());
		list.add((T) LineItem17.mmObject());
		list.add((T) TradeAgreement16.mmObject());
		list.add((T) OnLinePIN6.mmObject());
		list.add((T) ContentInformationType17.mmObject());
		list.add((T) TriggerInformation1.mmObject());
		list.add((T) AlgorithmIdentification19.mmObject());
		list.add((T) Parameter10.mmObject());
		list.add((T) CardPaymentDataSetTransaction6Choice.mmObject());
		list.add((T) CardPaymentDataSetTransaction22.mmObject());
		list.add((T) CardPaymentDataSetTransaction25.mmObject());
		list.add((T) CardPaymentDataSetTransaction24.mmObject());
		list.add((T) CardPaymentDataSetTransaction23.mmObject());
		list.add((T) CommonData7.mmObject());
		list.add((T) CardPaymentEnvironment70.mmObject());
		list.add((T) CardPaymentEnvironment71.mmObject());
		list.add((T) Creditor3.mmObject());
		list.add((T) DigestedData5.mmObject());
		list.add((T) AlgorithmIdentification21.mmObject());
		list.add((T) CardPaymentTransaction84.mmObject());
		list.add((T) CardPaymentEnvironment69.mmObject());
		list.add((T) MaintenanceDelegation6.mmObject());
		list.add((T) PointOfInteractionComponent8.mmObject());
		list.add((T) PointOfInteractionComponentCharacteristics4.mmObject());
		list.add((T) AmountAndDirection93.mmObject());
		list.add((T) AlgorithmIdentification23.mmObject());
		list.add((T) Parameter12.mmObject());
		list.add((T) CardPaymentTransactionDetails44.mmObject());
		list.add((T) CardPaymentTransaction79.mmObject());
		list.add((T) ClockSynchronisation2.mmObject());
		list.add((T) LineItemAllowanceCharge3.mmObject());
		list.add((T) Quantity16.mmObject());
		list.add((T) TradeProduct3.mmObject());
		list.add((T) TradeParty4.mmObject());
		list.add((T) AcquirerHostConfiguration5.mmObject());
		list.add((T) TerminalManagementDataSet25.mmObject());
		list.add((T) ContentInformationType19.mmObject());
		list.add((T) DataSetIdentification7.mmObject());
		list.add((T) CryptographicKey13.mmObject());
		list.add((T) CardPaymentEnvironment68.mmObject());
		list.add((T) PaymentCard28.mmObject());
		list.add((T) ProductCharacteristics4.mmObject());
		list.add((T) ErrorAction4.mmObject());
		list.add((T) AlgorithmIdentification24.mmObject());
		list.add((T) AccountIdentification39Choice.mmObject());
		list.add((T) Consignment5.mmObject());
		list.add((T) MandateRelatedInformation13.mmObject());
		list.add((T) CardPaymentTransaction83.mmObject());
		list.add((T) CardPaymentContext26.mmObject());
		list.add((T) SignedData5.mmObject());
		list.add((T) EnvelopedData5.mmObject());
		list.add((T) AuthenticatedData5.mmObject());
		list.add((T) MaintenanceDelegateAction4.mmObject());
		list.add((T) TMSAction7.mmObject());
		list.add((T) Debtor3.mmObject());
		list.add((T) CashAccountIdentification7Choice.mmObject());
		list.add((T) Parameter9.mmObject());
		list.add((T) TerminalManagementDataSet26.mmObject());
		list.add((T) StatusReportContent7.mmObject());
		list.add((T) CardPaymentTransactionDetails45.mmObject());
		list.add((T) CardDirectDebit1.mmObject());
		list.add((T) CardPaymentTransaction81.mmObject());
		list.add((T) AlgorithmIdentification18.mmObject());
		list.add((T) CardPaymentDataSet21.mmObject());
		list.add((T) CardPaymentDataSet20.mmObject());
		list.add((T) CardAccount14.mmObject());
		list.add((T) TerminalManagementDataSet24.mmObject());
		list.add((T) ManagementPlanContent7.mmObject());
		list.add((T) Signer4.mmObject());
		list.add((T) CommunicationAddress9.mmObject());
		list.add((T) PostalAddress22.mmObject());
		list.add((T) KeyTransport5.mmObject());
		list.add((T) AlgorithmIdentification22.mmObject());
		list.add((T) MaintenanceDelegation7.mmObject());
		list.add((T) ApplicationParameters7.mmObject());
		list.add((T) SecurityParameters11.mmObject());
		list.add((T) PersonIdentification14.mmObject());
		list.add((T) PointOfInteraction8.mmObject());
		list.add((T) TerminalManagementDataSet23.mmObject());
		list.add((T) Organisation32.mmObject());
		list.add((T) Recipient6Choice.mmObject());
		list.add((T) Party36Choice.mmObject());
		list.add((T) CardPaymentTransaction80.mmObject());
		list.add((T) AcceptorConfigurationContent7.mmObject());
		list.add((T) TMSProtocolParameters3.mmObject());
		list.add((T) SaleToPOIProtocolParameter1.mmObject());
		list.add((T) PaymentTerminalParameters5.mmObject());
		list.add((T) HostCommunicationParameter5.mmObject());
		list.add((T) AcquirerProtocolParameters11.mmObject());
		list.add((T) Cardholder13.mmObject());
		list.add((T) CardholderAuthentication11.mmObject());
		list.add((T) PersonIdentification15.mmObject());
		list.add((T) EncryptedContent4.mmObject());
		list.add((T) AlgorithmIdentification20.mmObject());
		list.add((T) Parameter11.mmObject());
		list.add((T) TMSActionIdentification5.mmObject());
		list.add((T) UnitOfMeasure6Choice.mmObject());
		list.add((T) PartyIdentification129.mmObject());
		list.add((T) GenericInformation1.mmObject());
		list.add((T) CardPaymentDataSet19.mmObject());
		list.add((T) OriginatorInformation1.mmObject());
		list.add((T) TMSEvent6.mmObject());
		list.add((T) KEK5.mmObject());
		list.add((T) DateFormat56Choice.mmObject());
		list.add((T) Period14.mmObject());
		list.add((T) CurrencyDetails3.mmObject());
		list.add((T) CurrencyConversion14.mmObject());
		list.add((T) CurrencyConversion15.mmObject());
		list.add((T) CardPaymentTransactionDetails46.mmObject());
		list.add((T) CardPaymentTransaction85.mmObject());
		list.add((T) CurrencyConversion16.mmObject());
		list.add((T) CardPaymentTransaction86.mmObject());
		list.add((T) SupplementaryDataEnvelope1.mmObject());
		list.add((T) SignatureEnvelope.mmObject());
		list.add((T) Max35Text.mmObject());
		list.add((T) ISODateTime.mmObject());
		list.add((T) ISODate.mmObject());
		list.add((T) CountryCode.mmObject());
		list.add((T) Max70Text.mmObject());
		list.add((T) Max140Text.mmObject());
		list.add((T) Max350Text.mmObject());
		list.add((T) CurrencyCode.mmObject());
		list.add((T) ActiveCurrencyCode.mmObject());
		list.add((T) DistributionPolicyCode.mmObject());
		list.add((T) DividendPolicyCode.mmObject());
		list.add((T) FormOfSecurityCode.mmObject());
		list.add((T) YesNoIndicator.mmObject());
		list.add((T) EventFrequencyCode.mmObject());
		list.add((T) EUSavingsDirectiveCode.mmObject());
		list.add((T) FrequencyCode.mmObject());
		list.add((T) Number.mmObject());
		list.add((T) PriceMethodCode.mmObject());
		list.add((T) CurrencyAndAmount.mmObject());
		list.add((T) ActiveCurrencyAndAmount.mmObject());
		list.add((T) DecimalNumber.mmObject());
		list.add((T) AddressTypeCode.mmObject());
		list.add((T) AddressType2Code.mmObject());
		list.add((T) Max16Text.mmObject());
		list.add((T) PhoneNumber.mmObject());
		list.add((T) Max256Text.mmObject());
		list.add((T) BICFIIdentifier.mmObject());
		list.add((T) SignatureTypeCode.mmObject());
		list.add((T) ISOTime.mmObject());
		list.add((T) IBAN2007Identifier.mmObject());
		list.add((T) IBANIdentifier.mmObject());
		list.add((T) BBANIdentifier.mmObject());
		list.add((T) UPICIdentifier.mmObject());
		list.add((T) Max2048Text.mmObject());
		list.add((T) AnyBICIdentifier.mmObject());
		list.add((T) HoldingTransferableCode.mmObject());
		list.add((T) PlusOrMinusIndicator.mmObject());
		list.add((T) BusinessDayConventionCode.mmObject());
		list.add((T) CashAccountTypeCode.mmObject());
		list.add((T) ActiveOrHistoricCurrencyCode.mmObject());
		list.add((T) SecuritiesAccountPurposeTypeCode.mmObject());
		list.add((T) FundCashAccountCode.mmObject());
		list.add((T) AccountOwnershipTypeCode.mmObject());
		list.add((T) TaxExemptReasonCode.mmObject());
		list.add((T) TaxExemptReason1Code.mmObject());
		list.add((T) AccountStatusCode.mmObject());
		list.add((T) LanguageCode.mmObject());
		list.add((T) IncomePreferenceCode.mmObject());
		list.add((T) TaxWithholdingMethodCode.mmObject());
		list.add((T) RICIdentifier.mmObject());
		list.add((T) TickerIdentifier.mmObject());
		list.add((T) ConsolidatedTapeAssociationIdentifier.mmObject());
		list.add((T) EuroclearClearstreamIdentifier.mmObject());
		list.add((T) RoundingDirectionCode.mmObject());
		list.add((T) MoneyLaunderingCheckCode.mmObject());
		list.add((T) NamePrefix1Code.mmObject());
		list.add((T) GenderCode.mmObject());
		list.add((T) ResidentialStatusCode.mmObject());
		list.add((T) CertificateTypeCode.mmObject());
		list.add((T) PercentageRate.mmObject());
		list.add((T) PartyRoleCode.mmObject());
		list.add((T) CardTypeCode.mmObject());
		list.add((T) ISOYearMonth.mmObject());
		list.add((T) Max3Text.mmObject());
		list.add((T) CHIPSUniversalIdentifier.mmObject());
		list.add((T) NewZealandNCCIdentifier.mmObject());
		list.add((T) IrishNSCIdentifier.mmObject());
		list.add((T) UKDomesticSortCodeIdentifier.mmObject());
		list.add((T) CHIPSParticipantIdentifier.mmObject());
		list.add((T) SwissBCIdentifier.mmObject());
		list.add((T) FedwireRoutingNumberIdentifier.mmObject());
		list.add((T) PortugueseNCCIdentifier.mmObject());
		list.add((T) RussianCentralBankIdentificationCodeIdentifier.mmObject());
		list.add((T) ItalianDomesticIdentifier.mmObject());
		list.add((T) AustrianBankleitzahlIdentifier.mmObject());
		list.add((T) CanadianPaymentsARNIdentifier.mmObject());
		list.add((T) SwissSICIdentifier.mmObject());
		list.add((T) GermanBankleitzahlIdentifier.mmObject());
		list.add((T) SpanishDomesticInterbankingIdentifier.mmObject());
		list.add((T) SouthAfricanNCCIdentifier.mmObject());
		list.add((T) HongKongBankIdentifier.mmObject());
		list.add((T) ExtensiveBranchNetworkIdentifier.mmObject());
		list.add((T) SmallNetworkIdentifier.mmObject());
		list.add((T) SEDOLIdentifier.mmObject());
		list.add((T) CUSIPIdentifier.mmObject());
		list.add((T) QUICKIdentifier.mmObject());
		list.add((T) WertpapierIdentifier.mmObject());
		list.add((T) DutchIdentifier.mmObject());
		list.add((T) ValorenIdentifier.mmObject());
		list.add((T) SicovamIdentifier.mmObject());
		list.add((T) BelgianIdentifier.mmObject());
		list.add((T) CommunicationMethodCode.mmObject());
		list.add((T) Max4AlphaNumericText.mmObject());
		list.add((T) FundOrderTypeCode.mmObject());
		list.add((T) BlockedReasonCode.mmObject());
		list.add((T) AccountUsageTypeCode.mmObject());
		list.add((T) ProvidedCode.mmObject());
		list.add((T) ConductClassificationCode.mmObject());
		list.add((T) RiskLevelCode.mmObject());
		list.add((T) InsuranceCode.mmObject());
		list.add((T) ISATypeCode.mmObject());
		list.add((T) ISOYear.mmObject());
		list.add((T) ActiveOrHistoricCurrencyAndAmount.mmObject());
		list.add((T) AccountManagementStatusCode.mmObject());
		list.add((T) RejectedStatusReasonCode.mmObject());
		list.add((T) PaymentTypeCode.mmObject());
		list.add((T) ImpliedCurrencyAndAmount.mmObject());
		list.add((T) CashClearingSystemCode.mmObject());
		list.add((T) ExternalClearingSystemIdentification1Code.mmObject());
		list.add((T) ExternalFinancialInstitutionIdentification1Code.mmObject());
		list.add((T) Max3NumericText.mmObject());
		list.add((T) PaymentInstrumentCode.mmObject());
		list.add((T) DebitCreditCode.mmObject());
		list.add((T) PaymentInstructionStatusCode.mmObject());
		list.add((T) Max10Text.mmObject());
		list.add((T) LimitTypeCode.mmObject());
		list.add((T) FloorLimitTypeCode.mmObject());
		list.add((T) ReservationTypeCode.mmObject());
		list.add((T) BalanceTypeCode.mmObject());
		list.add((T) BalanceCounterpartyCode.mmObject());
		list.add((T) BICNonFIIdentifier.mmObject());
		list.add((T) EANGLNIdentifier.mmObject());
		list.add((T) DunsIdentifier.mmObject());
		list.add((T) ExternalOrganisationIdentification1Code.mmObject());
		list.add((T) ExternalPersonIdentification1Code.mmObject());
		list.add((T) SystemEventTypeCode.mmObject());
		list.add((T) TrueFalseIndicator.mmObject());
		list.add((T) StandingOrderTypeCode.mmObject());
		list.add((T) PaymentStatusCode.mmObject());
		list.add((T) CashPaymentStatusCode.mmObject());
		list.add((T) PriorityCode.mmObject());
		list.add((T) InstructionCode.mmObject());
		list.add((T) EntryStatusCode.mmObject());
		list.add((T) TransferTypeCode.mmObject());
		list.add((T) UKTaxGroupUnitCode.mmObject());
		list.add((T) SettlementDateCode.mmObject());
		list.add((T) ValuationTimingCode.mmObject());
		list.add((T) TypeOfPriceCode.mmObject());
		list.add((T) TaxableIncomePerShareCalculatedCode.mmObject());
		list.add((T) ChargeTypeCode.mmObject());
		list.add((T) CalculationBasisCode.mmObject());
		list.add((T) TaxTypeCode.mmObject());
		list.add((T) EUCapitalGainCode.mmObject());
		list.add((T) Max5NumericText.mmObject());
		list.add((T) EUDividendStatusCode.mmObject());
		list.add((T) BalanceStatusCode.mmObject());
		list.add((T) ProcessingTypeCode.mmObject());
		list.add((T) SystemStatusCode.mmObject());
		list.add((T) SystemClosureReasonCode.mmObject());
		list.add((T) LimitStatusCode.mmObject());
		list.add((T) SuspendedStatusReasonCode.mmObject());
		list.add((T) PendingFailingSettlementCode.mmObject());
		list.add((T) PendingSettlementStatusReasonCode.mmObject());
		list.add((T) PaymentPurposeCode.mmObject());
		list.add((T) Max20000Text.mmObject());
		list.add((T) TransferUnmatchedReasonCode.mmObject());
		list.add((T) CancelledStatusReasonV2Code.mmObject());
		list.add((T) PendingFailingReasonCode.mmObject());
		list.add((T) Max15NumericText.mmObject());
		list.add((T) TaxationBasisCode.mmObject());
		list.add((T) ChargeBearerTypeCode.mmObject());
		list.add((T) BeneficiaryCertificationCompletionCode.mmObject());
		list.add((T) CommissionTypeV2Code.mmObject());
		list.add((T) StampDutyTypeCode.mmObject());
		list.add((T) PhysicalTransferTypeCode.mmObject());
		list.add((T) AcknowledgementReasonCode.mmObject());
		list.add((T) NoReasonCode.mmObject());
		list.add((T) InstructionProcessingStatusCode.mmObject());
		list.add((T) RejectionReasonV2Code.mmObject());
		list.add((T) RepairReasonV2Code.mmObject());
		list.add((T) MatchingStatusCode.mmObject());
		list.add((T) UnmatchedReasonCode.mmObject());
		list.add((T) SecuritiesSettlementStatusCode.mmObject());
		list.add((T) DeniedReasonCode.mmObject());
		list.add((T) ModifiedStatusReasonCode.mmObject());
		list.add((T) ReceiveDeliveryCode.mmObject());
		list.add((T) DeliveryReceiptTypeCode.mmObject());
		list.add((T) DateTypeCode.mmObject());
		list.add((T) ProcessingPositionCode.mmObject());
		list.add((T) Exact3NumericText.mmObject());
		list.add((T) MICIdentifier.mmObject());
		list.add((T) MarketTypeCode.mmObject());
		list.add((T) PriceValueTypeCode.mmObject());
		list.add((T) Max3Number.mmObject());
		list.add((T) OpeningClosingCode.mmObject());
		list.add((T) ReportingCode.mmObject());
		list.add((T) TradeTransactionConditionCode.mmObject());
		list.add((T) EligibilityCode.mmObject());
		list.add((T) AffirmationStatusCode.mmObject());
		list.add((T) InterestComputationMethodCode.mmObject());
		list.add((T) SecuritiesPaymentStatusCode.mmObject());
		list.add((T) PaymentDirectionIndicator.mmObject());
		list.add((T) OptionStyleCode.mmObject());
		list.add((T) OptionDefinitionTypeCode.mmObject());
		list.add((T) BaseOneRate.mmObject());
		list.add((T) SafekeepingPlaceCode.mmObject());
		list.add((T) SecuritiesTransactionTypeV2Code.mmObject());
		list.add((T) SettlementTransactionConditionCode.mmObject());
		list.add((T) DeliveryReturnCode.mmObject());
		list.add((T) CashSystemTypeCode.mmObject());
		list.add((T) CashSettlementSystemCode.mmObject());
		list.add((T) ExposureTypeCode.mmObject());
		list.add((T) MarketClientSideCode.mmObject());
		list.add((T) RegistrationCode.mmObject());
		list.add((T) SettlingCapacityCode.mmObject());
		list.add((T) TaxLiabilityCode.mmObject());
		list.add((T) SettlementStandingInstructionDatabaseCode.mmObject());
		list.add((T) TypeOfIdentificationCode.mmObject());
		list.add((T) TransferReasonCode.mmObject());
		list.add((T) CopyDuplicateCode.mmObject());
		list.add((T) CopyDuplicate1Code.mmObject());
		list.add((T) CorporateActionCancellationReasonCode.mmObject());
		list.add((T) ProcessingStatusCode.mmObject());
		list.add((T) EventCompletenessStatusCode.mmObject());
		list.add((T) EventConfirmationStatusCode.mmObject());
		list.add((T) CorporateActionEventTypeV3Code.mmObject());
		list.add((T) CorporateActionMandatoryVoluntaryCode.mmObject());
		list.add((T) CorporateActionEventProcessingStatusCode.mmObject());
		list.add((T) ShortLongCode.mmObject());
		list.add((T) BeneficiaryCertificationTypeCode.mmObject());
		list.add((T) CorporateActionOptionCode.mmObject());
		list.add((T) FractionDispositionTypeCode.mmObject());
		list.add((T) CorporateActionChangeTypeCode.mmObject());
		list.add((T) QuantityCode.mmObject());
		list.add((T) AmountPriceTypeCode.mmObject());
		list.add((T) CorporateActionInstructionCancellationProcessingStatusCode.mmObject());
		list.add((T) RejectionReasonCode.mmObject());
		list.add((T) CorporateActionInstructionProcessingStatusCode.mmObject());
		list.add((T) AdditionalBusinessProcessCode.mmObject());
		list.add((T) OptionFeaturesCode.mmObject());
		list.add((T) DateType6Code.mmObject());
		list.add((T) DividendRateTypeCode.mmObject());
		list.add((T) RateStatusCode.mmObject());
		list.add((T) InterestRateTypeCode.mmObject());
		list.add((T) RateTypeCode.mmObject());
		list.add((T) PaymentCode.mmObject());
		list.add((T) IntermediateSecurityDistributionTypeCode.mmObject());
		list.add((T) CorporateActionReversalReasonCode.mmObject());
		list.add((T) CorporateActionEventProcessingTypeCode.mmObject());
		list.add((T) OptionAvailabilityStatusCode.mmObject());
		list.add((T) NonEligibleProceedsIndicatorCode.mmObject());
		list.add((T) OfferTypeV2Code.mmObject());
		list.add((T) CorporateActionNotificationTypeCode.mmObject());
		list.add((T) RenounceableStatusCode.mmObject());
		list.add((T) Max30Text.mmObject());
		list.add((T) DividendTypeCode.mmObject());
		list.add((T) CorporateActionFrequencyTypeCode.mmObject());
		list.add((T) ConversionTypeCode.mmObject());
		list.add((T) DistributionTypeCode.mmObject());
		list.add((T) CorporateActionEventStageCode.mmObject());
		list.add((T) ElectionMovementTypeCode.mmObject());
		list.add((T) LotteryTypeCode.mmObject());
		list.add((T) CertificationFormatTypeCode.mmObject());
		list.add((T) Max6Text.mmObject());
		list.add((T) Max105Text.mmObject());
		list.add((T) PartialSettlementCode.mmObject());
		list.add((T) SecuritiesBalanceTypeV2Code.mmObject());
		list.add((T) PriceSourceCode.mmObject());
		list.add((T) PreConfirmationCode.mmObject());
		list.add((T) LegalFrameworkCode.mmObject());
		list.add((T) BlockTradeCode.mmObject());
		list.add((T) SettlementSystemMethodCode.mmObject());
		list.add((T) AutoBorrowingCode.mmObject());
		list.add((T) MatchingProcessCode.mmObject());
		list.add((T) RepurchaseTypeCode.mmObject());
		list.add((T) GeneratedReasonCode.mmObject());
		list.add((T) TransactionActivityCode.mmObject());
		list.add((T) TransactionStatusCode.mmObject());
		list.add((T) ClearingSideCode.mmObject());
		list.add((T) ClearingAccountTypeCode.mmObject());
		list.add((T) PartyTypeCode.mmObject());
		list.add((T) TradingCapacityCode.mmObject());
		list.add((T) AllegementReasonCode.mmObject());
		list.add((T) ReplacementProcessingStatusCode.mmObject());
		list.add((T) CancellationStatusCode.mmObject());
		list.add((T) CashMarginOrderCode.mmObject());
		list.add((T) SideCode.mmObject());
		list.add((T) CustomerOrderCapacityCode.mmObject());
		list.add((T) PositionEffectCode.mmObject());
		list.add((T) Max128Text.mmObject());
		list.add((T) ClearingFeeTypeCode.mmObject());
		list.add((T) CalculationMethodCode.mmObject());
		list.add((T) PrePaymentSpeedCode.mmObject());
		list.add((T) CalculationTypeCode.mmObject());
		list.add((T) AssignmentMethodCode.mmObject());
		list.add((T) SettleStyleCode.mmObject());
		list.add((T) StandardisationCode.mmObject());
		list.add((T) OptionPartyCode.mmObject());
		list.add((T) UnitOfMeasureCode.mmObject());
		list.add((T) AppearanceCode.mmObject());
		list.add((T) LegalRestrictionsCode.mmObject());
		list.add((T) ProductTypeCode.mmObject());
		list.add((T) RatingValueIdentifier.mmObject());
		list.add((T) SecurityStatusCode.mmObject());
		list.add((T) SettlementTypeCode.mmObject());
		list.add((T) OperatorCode.mmObject());
		list.add((T) OrderQuantityTypeCode.mmObject());
		list.add((T) AllOrNoneIndicator.mmObject());
		list.add((T) StayOnSideTypeCode.mmObject());
		list.add((T) DayBookingInstructionCode.mmObject());
		list.add((T) BookingUnitCode.mmObject());
		list.add((T) BookingTypeCode.mmObject());
		list.add((T) PreAllocationMethodCode.mmObject());
		list.add((T) BusinessProcessTypeCode.mmObject());
		list.add((T) TradeTypeCode.mmObject());
		list.add((T) InterestTypeCode.mmObject());
		list.add((T) TradeRegulatoryConditionsCode.mmObject());
		list.add((T) CallInCode.mmObject());
		list.add((T) ExposureTypeV2Code.mmObject());
		list.add((T) TerminationTypeCode.mmObject());
		list.add((T) DeliveryTypeCode.mmObject());
		list.add((T) LendingTransactionMethodCode.mmObject());
		list.add((T) BorrowingReasonCode.mmObject());
		list.add((T) CollateralTypeCode.mmObject());
		list.add((T) Max4NumericText.mmObject());
		list.add((T) SecuritiesLendingTypeCode.mmObject());
		list.add((T) ReversibleCode.mmObject());
		list.add((T) Frequency3Code.mmObject());
		list.add((T) Max4Text.mmObject());
		list.add((T) Max15PlusSignedNumericText.mmObject());
		list.add((T) Max10KBinary.mmObject());
		list.add((T) ExternalBankTransactionDomainCode.mmObject());
		list.add((T) ExternalBankTransactionFamilyCode.mmObject());
		list.add((T) ExternalChannelCode.mmObject());
		list.add((T) Max500Text.mmObject());
		list.add((T) InterestCode.mmObject());
		list.add((T) RemittanceLocationMethodCode.mmObject());
		list.add((T) DocumentTypeCode.mmObject());
		list.add((T) TransactionReasonCode.mmObject());
		list.add((T) AdjustmentDirectionCode.mmObject());
		list.add((T) TaxRecordPeriodCode.mmObject());
		list.add((T) Min8Max28NumericText.mmObject());
		list.add((T) Min2Max3NumericText.mmObject());
		list.add((T) Exact1NumericText.mmObject());
		list.add((T) CSCManagementCode.mmObject());
		list.add((T) Min3Max4NumericText.mmObject());
		list.add((T) PartyType3Code.mmObject());
		list.add((T) PartyType4Code.mmObject());
		list.add((T) CardDataReadingCode.mmObject());
		list.add((T) CardDataReading1Code.mmObject());
		list.add((T) CardholderVerificationCapabilityCode.mmObject());
		list.add((T) OnLineCapabilityCode.mmObject());
		list.add((T) OnLineCapability1Code.mmObject());
		list.add((T) UserInterfaceCode.mmObject());
		list.add((T) POIComponentTypeCode.mmObject());
		list.add((T) CardPaymentServiceTypeCode.mmObject());
		list.add((T) DiscountTypeCode.mmObject());
		list.add((T) ChargeIncludedIndicator.mmObject());
		list.add((T) PaymentMethodCode.mmObject());
		list.add((T) ServiceLevelCode.mmObject());
		list.add((T) ClearingChannelCode.mmObject());
		ListBuilderForGeneratedRepository_03.addElems(list);
		return list;
	}
}