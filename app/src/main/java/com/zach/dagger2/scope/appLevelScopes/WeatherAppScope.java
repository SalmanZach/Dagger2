package com.zach.dagger2.scope.appLevelScopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Zach on 1/1/2018.
 */
@Scope
@Retention(RetentionPolicy.CLASS)
public @interface WeatherAppScope {
}
