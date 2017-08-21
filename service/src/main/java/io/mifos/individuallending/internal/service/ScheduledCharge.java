/*
 * Copyright 2017 The Mifos Initiative.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.individuallending.internal.service;

import io.mifos.portfolio.api.v1.domain.ChargeDefinition;

import javax.annotation.Nonnull;
import java.util.Optional;

/**
 * @author Myrle Krantz
 */
public class ScheduledCharge {
  private final ScheduledAction scheduledAction;
  private final ChargeDefinition chargeDefinition;
  @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
  private final Optional<ChargeRange> chargeRange;

  ScheduledCharge(
      @Nonnull final ScheduledAction scheduledAction,
      @Nonnull final ChargeDefinition chargeDefinition,
      @SuppressWarnings("OptionalUsedAsFieldOrParameterType") @Nonnull final Optional<ChargeRange> chargeRange) {
    this.scheduledAction = scheduledAction;
    this.chargeDefinition = chargeDefinition;
    this.chargeRange = chargeRange;
  }

  ScheduledAction getScheduledAction() {
    return scheduledAction;
  }

  ChargeDefinition getChargeDefinition() {
    return chargeDefinition;
  }

  Optional<ChargeRange> getChargeRange() {
    return chargeRange;
  }

  @Override
  public String toString() {
    return "ScheduledCharge{" +
        "scheduledAction=" + scheduledAction +
        ", chargeDefinition=" + chargeDefinition +
        ", chargeRange=" + chargeRange +
        '}';
  }
}
