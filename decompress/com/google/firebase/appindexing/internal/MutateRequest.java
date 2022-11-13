// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.appindexing.internal;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MutateRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final Thing[] b;
    public final String[] c;
    public final String[] d;
    public final ActionImpl e;
    public final String f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(17);
    }
    
    public MutateRequest(final int n, final Thing[] b, final String[] c, final String[] d, final ActionImpl e, final String f, final String g) {
        int a = n;
        if (n != 0 && (a = n) != 1 && (a = n) != 2 && (a = n) != 3 && (a = n) != 4 && (a = n) != 6 && (a = n) != 7) {
            a = 0;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.aj(parcel, 2, (Parcelable[])this.b, n);
        khl.ah(parcel, 3, this.c);
        khl.ah(parcel, 5, this.d);
        khl.af(parcel, 6, (Parcelable)this.e, n);
        khl.ag(parcel, 7, this.f);
        khl.ag(parcel, 8, this.g);
        khl.N(parcel, m);
    }
}
