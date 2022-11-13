// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class InProductHelp extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public GoogleHelp a;
    public String b;
    public String c;
    public int d;
    public String e;
    public int f;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(13);
    }
    
    public InProductHelp(final GoogleHelp a, final String b, final String c, final int d, final String e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        mvv.b(this, parcel, n);
    }
}
