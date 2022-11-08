// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;

public final class AutoValue_ValidationResult extends ValidationResult
{
    private final boolean a;
    private final boolean b;
    private final Intent c;
    
    public AutoValue_ValidationResult(final boolean a, final boolean b, final Intent c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Intent a() {
        return this.c;
    }
    
    public final boolean b() {
        return this.b;
    }
    
    public final boolean c() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ValidationResult) {
            final ValidationResult validationResult = (ValidationResult)o;
            if (this.a == validationResult.c() && this.b == validationResult.b()) {
                final Intent c = this.c;
                if (c == null) {
                    if (validationResult.a() != null) {
                        return false;
                    }
                }
                else if (!c.equals(validationResult.a())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.b) {
            n = 1231;
        }
        final Intent c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return ((n2 ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("ValidationResult{isValid=");
        sb.append(a);
        sb.append(", clearState=");
        sb.append(b);
        sb.append(", getIntentToMeet=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
