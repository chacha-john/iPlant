package com.chachaup.iplant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/chachaup/iplant/IPlantApplication;", "Landroid/app/Application;", "()V", "database", "Lcom/chachaup/iplant/data/IPlantDatabase;", "getDatabase", "()Lcom/chachaup/iplant/data/IPlantDatabase;", "database$delegate", "Lkotlin/Lazy;", "repo", "Lcom/chachaup/iplant/data/IPlantRepository;", "getRepo", "()Lcom/chachaup/iplant/data/IPlantRepository;", "repo$delegate", "app_debug"})
public final class IPlantApplication extends android.app.Application {
    private final kotlin.Lazy database$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy repo$delegate = null;
    
    public IPlantApplication() {
        super();
    }
    
    private final com.chachaup.iplant.data.IPlantDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.chachaup.iplant.data.IPlantRepository getRepo() {
        return null;
    }
}