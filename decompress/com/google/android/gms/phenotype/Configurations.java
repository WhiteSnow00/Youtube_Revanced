// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.phenotype;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Iterator;
import android.util.Base64;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Configurations extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final byte[] b;
    public final String c;
    public final Configuration[] d;
    public final Map e;
    public final boolean f;
    public final long g;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(15);
    }
    
    public Configurations(final String a, final String c, final Configuration[] d, final boolean f, final byte[] b, final long g) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.f = f;
        this.b = b;
        this.g = g;
        this.e = new TreeMap();
        for (final Configuration configuration : d) {
            this.e.put(configuration.a, configuration);
        }
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof Configurations) {
            final Configurations configurations = (Configurations)o;
            if (nmr.q((Object)this.a, (Object)configurations.a) && nmr.q((Object)this.c, (Object)configurations.c) && this.e.equals(configurations.e) && this.f == configurations.f && Arrays.equals(this.b, configurations.b) && this.g == configurations.g) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.c, this.e, this.f, this.b, this.g });
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        final Iterator iterator = this.e.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        final byte[] b = this.b;
        String encodeToString;
        if (b == null) {
            encodeToString = "null";
        }
        else {
            encodeToString = Base64.encodeToString(b, 3);
        }
        sb.append(encodeToString);
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.c);
        kgk.af(parcel, 4, (Parcelable[])this.d, n);
        kgk.K(parcel, 5, this.f);
        kgk.S(parcel, 6, this.b);
        kgk.P(parcel, 7, this.g);
        kgk.J(parcel, i);
    }
}
