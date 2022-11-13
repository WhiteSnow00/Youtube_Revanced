// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class EventParcel extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final EventParams b;
    public final String c;
    public final long d;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(15);
    }
    
    public EventParcel(final EventParcel eventParcel, final long d) {
        khl.aP((Object)eventParcel);
        this.a = eventParcel.a;
        this.b = eventParcel.b;
        this.c = eventParcel.c;
        this.d = d;
    }
    
    public EventParcel(final String a, final EventParams b, final String c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final String toString() {
        final String c = this.c;
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("origin=");
        sb.append(c);
        sb.append(",name=");
        sb.append(a);
        sb.append(",params=");
        sb.append(value);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        nbu.a(this, parcel, n);
    }
}
