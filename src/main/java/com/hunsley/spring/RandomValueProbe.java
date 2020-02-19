package com.hunsley.spring;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.stereotype.Component;

@Component
public class RandomValueProbe implements MeterBinder {

  @Override
  public void bindTo(MeterRegistry meterRegistry) {
    Gauge.builder(
        "random_gauge", this, RandomValueProbe::value)
        .description("A random double value")
        .baseUnit("Random")
        .register(meterRegistry);
  }

  private double value() {
     return Math.random();
  }
}
