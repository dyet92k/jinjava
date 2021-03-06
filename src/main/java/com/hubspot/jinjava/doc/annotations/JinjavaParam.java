package com.hubspot.jinjava.doc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface JinjavaParam {
  String value();

  String type() default "String";

  String desc() default "";

  String defaultValue() default "";

  boolean required() default false;
}
