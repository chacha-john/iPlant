package com.chachaup.iplant.vm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007J\u0016\u0010#\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018\u00a8\u0006$"}, d2 = {"Lcom/chachaup/iplant/vm/IPlantViewModel;", "Landroidx/lifecycle/ViewModel;", "iPlantRepository", "Lcom/chachaup/iplant/data/IPlantRepository;", "(Lcom/chachaup/iplant/data/IPlantRepository;)V", "_confirmPassword", "Landroidx/lifecycle/MutableLiveData;", "", "get_confirmPassword", "()Landroidx/lifecycle/MutableLiveData;", "_confirmPassword$delegate", "Lkotlin/Lazy;", "_email", "get_email", "_email$delegate", "_fullName", "get_fullName", "_fullName$delegate", "_password", "get_password", "_password$delegate", "confirmPassword", "Landroidx/lifecycle/LiveData;", "getConfirmPassword", "()Landroidx/lifecycle/LiveData;", "email", "getEmail", "fullName", "getFullName", "password", "getPassword", "addUser", "Lkotlinx/coroutines/Job;", "name", "pass", "login", "app_debug"})
public final class IPlantViewModel extends androidx.lifecycle.ViewModel {
    private final com.chachaup.iplant.data.IPlantRepository iPlantRepository = null;
    private final kotlin.Lazy _fullName$delegate = null;
    private final kotlin.Lazy _email$delegate = null;
    private final kotlin.Lazy _password$delegate = null;
    private final kotlin.Lazy _confirmPassword$delegate = null;
    
    public IPlantViewModel(@org.jetbrains.annotations.NotNull()
    com.chachaup.iplant.data.IPlantRepository iPlantRepository) {
        super();
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> get_fullName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getFullName() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> get_email() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getEmail() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> get_password() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getPassword() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> get_confirmPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getConfirmPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass) {
        return null;
    }
}