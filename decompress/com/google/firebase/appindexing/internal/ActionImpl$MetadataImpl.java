// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ActionImpl$MetadataImpl extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final boolean f;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(16);
    }
    
    public ActionImpl$MetadataImpl(final int a, final boolean b, final String c, final String d, final byte[] e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public ActionImpl$MetadataImpl(final String d) {
        this.a = 0;
        this.b = false;
        this.c = null;
        this.d = d;
        this.e = null;
        this.f = false;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb.append(this.a);
        sb.append("' } { uploadable: '");
        sb.append(this.b);
        sb.append("' } ");
        if (this.c != null) {
            sb.append("{ completionToken: '");
            sb.append(this.c);
            sb.append("' } ");
        }
        if (this.d != null) {
            sb.append("{ accountName: '");
            sb.append(this.d);
            sb.append("' } ");
        }
        if (this.e != null) {
            sb.append("{ ssbContext: [ ");
            for (final byte b : this.e) {
                sb.append("0x");
                sb.append(Integer.toHexString(b));
                sb.append(" ");
            }
            sb.append("] } ");
        }
        sb.append("{ contextOnly: '");
        sb.append(this.f);
        sb.append("' } }");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.O(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.ag(parcel, 4, this.d);
        khl.W(parcel, 5, this.e);
        khl.O(parcel, 6, this.f);
        khl.N(parcel, m);
    }
}
