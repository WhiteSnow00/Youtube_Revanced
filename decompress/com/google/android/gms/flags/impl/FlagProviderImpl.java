// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.flags.impl;

import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.Callable;
import android.content.SharedPreferences;

public class FlagProviderImpl extends mwy
{
    private boolean a;
    private SharedPreferences b;
    
    public FlagProviderImpl() {
        this.a = false;
    }
    
    public boolean getBooleanFlagValue(final String s, final boolean b, final int n) {
        if (!this.a) {
            return b;
        }
        final SharedPreferences b2 = this.b;
        final Boolean value = b;
        Boolean b3;
        try {
            b3 = (Boolean)meo.q((Callable)new mxa(b2, s, value, 0));
        }
        catch (final Exception ex) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: ".concat(String.valueOf(ex.getMessage())));
            b3 = value;
        }
        return b3;
    }
    
    public int getIntFlagValue(final String s, final int n, final int n2) {
        if (!this.a) {
            return n;
        }
        final SharedPreferences b = this.b;
        final Integer value = n;
        Integer n3;
        try {
            n3 = (Integer)meo.q((Callable)new mxa(b, s, value, 2));
        }
        catch (final Exception ex) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: ".concat(String.valueOf(ex.getMessage())));
            n3 = value;
        }
        return n3;
    }
    
    public long getLongFlagValue(final String s, final long n, final int n2) {
        if (!this.a) {
            return n;
        }
        final SharedPreferences b = this.b;
        final Long value = n;
        Long n3;
        try {
            n3 = (Long)meo.q((Callable)new mxa(b, s, value, 3));
        }
        catch (final Exception ex) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: ".concat(String.valueOf(ex.getMessage())));
            n3 = value;
        }
        return n3;
    }
    
    public String getStringFlagValue(String s, final String s2, final int n) {
        if (!this.a) {
            return s2;
        }
        final SharedPreferences b = this.b;
        try {
            s = (String)meo.q((Callable)new mxa(b, s, s2, 4));
        }
        catch (final Exception ex) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: ".concat(String.valueOf(ex.getMessage())));
            s = s2;
        }
        return s;
    }
    
    public void init(final mvn mvn) {
        final Context context = (Context)mvm.b(mvn);
        if (this.a) {
            return;
        }
        try {
            final Context packageContext = context.createPackageContext("com.mgoogle.android.gms", 0);
            synchronized (SharedPreferences.class) {
                if (mxb.a == null) {
                    mxb.a = (SharedPreferences)meo.q((Callable)new cty(packageContext, 5));
                }
                final SharedPreferences a = mxb.a;
                monitorexit(SharedPreferences.class);
                this.b = a;
                this.a = true;
            }
        }
        catch (final Exception ex) {
            Log.w("FlagProviderImpl", "Could not retrieve sdk flags, continuing with defaults: ".concat(String.valueOf(ex.getMessage())));
        }
        catch (final PackageManager$NameNotFoundException ex2) {
            goto Label_0096;
        }
    }
}
