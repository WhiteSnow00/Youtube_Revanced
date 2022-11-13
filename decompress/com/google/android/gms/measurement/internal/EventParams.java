// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.Iterator;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class EventParams extends AbstractSafeParcelable implements Iterable
{
    public static final Parcelable$Creator CREATOR;
    public final Bundle a;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(14);
    }
    
    public EventParams(final Bundle a) {
        this.a = a;
    }
    
    public final Bundle a() {
        return new Bundle(this.a);
    }
    
    public final Object b(final String s) {
        return this.a.get(s);
    }
    
    public final String c(final String s) {
        return this.a.getString(s);
    }
    
    public final Long d() {
        return this.a.getLong("value");
    }
    
    public final Iterator iterator() {
        return (Iterator)new xjm(this, 1);
    }
    
    public final String toString() {
        return this.a.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.V(parcel, 2, this.a());
        khl.N(parcel, m);
    }
}
