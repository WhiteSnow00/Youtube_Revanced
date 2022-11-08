// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.phenotype;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Configuration extends AbstractSafeParcelable implements Comparable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final Flag[] b;
    public final String[] c;
    public final Map d;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(14);
    }
    
    public Configuration(int i, final Flag[] b, final String[] c) {
        this.a = i;
        this.b = b;
        this.d = new TreeMap();
        int length;
        Flag flag;
        for (length = b.length, i = 0; i < length; ++i) {
            flag = b[i];
            this.d.put(flag.a, flag);
        }
        if ((this.c = c) != null) {
            Arrays.sort(c);
        }
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof Configuration) {
            final Configuration configuration = (Configuration)o;
            if (this.a == configuration.a && nmr.q((Object)this.d, (Object)configuration.d) && Arrays.equals(this.c, configuration.c)) {
                return true;
            }
        }
        return false;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            sb.append(", ");
        }
        sb.append("), (");
        final String[] c = this.c;
        if (c != null) {
            for (int length = c.length, i = 0; i < length; ++i) {
                sb.append(c[i]);
                sb.append(", ");
            }
        }
        else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.af(parcel, 3, (Parcelable[])this.b, n);
        kgk.ad(parcel, 4, this.c);
        kgk.J(parcel, i);
    }
}
