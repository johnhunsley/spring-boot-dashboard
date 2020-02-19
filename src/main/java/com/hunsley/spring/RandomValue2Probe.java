package com.hunsley.spring;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.stereotype.Component;

@Component
public class RandomValue2Probe implements MeterBinder {

  @Override
  public void bindTo(MeterRegistry meterRegistry) {
    Gauge.builder(
        "random_gauge_2", this, RandomValue2Probe::value)
        .description("Another random double value")
        .baseUnit("Random2")
        .register(meterRegistry);
  }

  private double value() {
    return Math.random();
  }
}
