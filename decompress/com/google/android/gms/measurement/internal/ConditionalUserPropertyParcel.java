// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement.internal;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ConditionalUserPropertyParcel extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public UserAttributeParcel c;
    public long d;
    public boolean e;
    public String f;
    public EventParcel g;
    public long h;
    public EventParcel i;
    public long j;
    public EventParcel k;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(13);
    }
    
    public ConditionalUserPropertyParcel(final ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        khl.aP((Object)conditionalUserPropertyParcel);
        this.a = conditionalUserPropertyParcel.a;
        this.b = conditionalUserPropertyParcel.b;
        this.c = conditionalUserPropertyParcel.c;
        this.d = conditionalUserPropertyParcel.d;
        this.e = conditionalUserPropertyParcel.e;
        this.f = conditionalUserPropertyParcel.f;
        this.g = conditionalUserPropertyParcel.g;
        this.h = conditionalUserPropertyParcel.h;
        this.i = conditionalUserPropertyParcel.i;
        this.j = conditionalUserPropertyParcel.j;
        this.k = conditionalUserPropertyParcel.k;
    }
    
    public ConditionalUserPropertyParcel(final String a, final String b, final UserAttributeParcel c, final long d, final boolean e, final String f, final EventParcel g, final long h, final EventParcel i, final long j, final EventParcel k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.ag(parcel, 2, this.a);
        khl.ag(parcel, 3, this.b);
        khl.af(parcel, 4, (Parcelable)this.c, n);
        khl.T(parcel, 5, this.d);
        khl.O(parcel, 6, this.e);
        khl.ag(parcel, 7, this.f);
        khl.af(parcel, 8, (Parcelable)this.g, n);
        khl.T(parcel, 9, this.h);
        khl.af(parcel, 10, (Parcelable)this.i, n);
        khl.T(parcel, 11, this.j);
        khl.af(parcel, 12, (Parcelable)this.k, n);
        khl.N(parcel, m);
    }
}
