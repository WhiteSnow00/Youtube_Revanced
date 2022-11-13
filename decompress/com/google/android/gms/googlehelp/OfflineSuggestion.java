// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OfflineSuggestion extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final String a;
    final String b;
    final String c;
    final String d;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(15);
    }
    
    public OfflineSuggestion(final String a, final String b, final String d, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 2, this.a);
        khl.ag(parcel, 3, this.b);
        khl.ag(parcel, 4, this.c);
        khl.ag(parcel, 5, this.d);
        khl.N(parcel, m);
    }
}
