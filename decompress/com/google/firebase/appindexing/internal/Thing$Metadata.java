// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Thing$Metadata extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final boolean a;
    public final int b;
    public final String c;
    public final Bundle d;
    public final Bundle e;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(15);
    }
    
    public Thing$Metadata(final boolean a, final int b, final String c, final Bundle bundle, final Bundle bundle2) {
        this.a = a;
        this.b = b;
        this.c = c;
        Bundle d = bundle;
        if (bundle == null) {
            d = new Bundle();
        }
        this.d = d;
        Bundle e;
        if ((e = bundle2) == null) {
            e = new Bundle();
        }
        this.e = e;
        final ClassLoader classLoader = this.getClass().getClassLoader();
        aefb.K((Object)classLoader);
        e.setClassLoader(classLoader);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Thing$Metadata)) {
            return false;
        }
        final Thing$Metadata thing$Metadata = (Thing$Metadata)o;
        return khl.be(this.a, thing$Metadata.a) && khl.be(this.b, thing$Metadata.b) && khl.be(this.c, thing$Metadata.c) && Thing.c(this.d, thing$Metadata.d) && Thing.c(this.e, thing$Metadata.e);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, Thing.a(this.d), Thing.a(this.e) });
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("worksOffline: ");
        sb.append(this.a);
        sb.append(", score: ");
        sb.append(this.b);
        if (!this.c.isEmpty()) {
            sb.append(", accountEmail: ");
            sb.append(this.c);
        }
        if (!this.d.isEmpty()) {
            sb.append(", Properties { ");
            Thing.b(this.d, sb);
            sb.append("}");
        }
        if (!this.e.isEmpty()) {
            sb.append(", embeddingProperties { ");
            Thing.b(this.e, sb);
            sb.append("}");
        }
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.O(parcel, 1, this.a);
        khl.S(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.V(parcel, 4, this.d);
        khl.V(parcel, 5, this.e);
        khl.N(parcel, m);
    }
}
