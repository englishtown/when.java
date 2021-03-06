package com.englishtown.promises.guice;

import com.englishtown.promises.*;
import com.englishtown.promises.impl.*;
import com.google.inject.AbstractModule;

import javax.inject.Singleton;
import java.util.concurrent.Executor;

/**
 * Guice when.java binder
 */
public class WhenBinder extends AbstractModule {
    /**
     * Configures a {@link com.google.inject.Binder} via the exposed methods.
     */
    @Override
    protected void configure() {

        bind(Executor.class).to(AsyncExecutor.class).in(Singleton.class);
        bind(Scheduler.class).to(DefaultScheduler.class).in(Singleton.class);
        bind(Environment.class).to(DefaultEnvironment.class).in(Singleton.class);
        bind(Context.class).to(NOPContext.class).in(Singleton.class);
        bind(Reporter.class).to(NOPReporter.class).in(Singleton.class);
        bind(When.class).to(DefaultWhen.class).in(Singleton.class);

    }
}
