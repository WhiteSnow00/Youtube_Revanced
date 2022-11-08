// 
// Decompiled by Procyon v0.6.0
// 

package com.youtube.android.libraries.elements;

import io.grpc.Status;

public class StatusOr
{
    public final boolean hasValue;
    public final Status status;
    public final Object value;
    
    private StatusOr(final Status status, final Object value, final boolean hasValue) {
        this.status = status;
        this.value = value;
        this.hasValue = hasValue;
    }
    
    public static StatusOr fromStatus(final Status status) {
        if (!status.f()) {
            return new StatusOr(status, null, false);
        }
        throw new IllegalArgumentException("StatusOr with status OK must have a value. Please use fromValue(T value) instead.");
    }
    
    public static StatusOr fromValue(final Object o) {
        return new StatusOr(Status.OK, o, true);
    }
    
    public final Object a(final sc sc) {
        final Object value = this.value;
        if (value != null) {
            return value;
        }
        throw (RuntimeException)sc.a((Object)this.status.d());
    }
}
