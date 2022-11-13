// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.appindexing.internal;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ActionImpl extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ActionImpl$MetadataImpl e;
    public final String f;
    public final Bundle g;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(13);
    }
    
    public ActionImpl(final String a, final String b, final String c, final String d, final ActionImpl$MetadataImpl e, final String f, final Bundle g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        if (g != null) {
            this.g = g;
        }
        else {
            this.g = Bundle.EMPTY;
        }
        final ClassLoader classLoader = this.getClass().getClassLoader();
        aefb.K((Object)classLoader);
        this.g.setClassLoader(classLoader);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ActionImpl { { actionType: '");
        sb.append(this.a);
        sb.append("' } { objectName: '");
        sb.append(this.b);
        sb.append("' } { objectUrl: '");
        sb.append(this.c);
        sb.append("' } ");
        if (this.d != null) {
            sb.append("{ objectSameAs: '");
            sb.append(this.d);
            sb.append("' } ");
        }
        if (this.e != null) {
            sb.append("{ metadata: '");
            sb.append(this.e.toString());
            sb.append("' } ");
        }
        if (this.f != null) {
            sb.append("{ actionStatus: '");
            sb.append(this.f);
            sb.append("' } ");
        }
        if (!this.g.isEmpty()) {
            sb.append("{ ");
            sb.append(this.g);
            sb.append(" } ");
        }
        sb.append("}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.ag(parcel, 4, this.d);
        khl.af(parcel, 5, (Parcelable)this.e, n);
        khl.ag(parcel, 6, this.f);
        khl.V(parcel, 7, this.g);
        khl.N(parcel, m);
    }
}
