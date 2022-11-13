// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.appindexing.internal;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Set;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Thing extends AbstractSafeParcelable implements ReflectedParcelable, agip
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final Bundle b;
    public final Thing$Metadata c;
    public final String d;
    public final String e;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(18);
    }
    
    public Thing(final int a, final Bundle b, final Thing$Metadata c, final String d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final ClassLoader classLoader = this.getClass().getClassLoader();
        aefb.K((Object)classLoader);
        b.setClassLoader(classLoader);
    }
    
    public Thing(final Bundle b, final Thing$Metadata c, final String d, final String e) {
        this.a = 10;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static int a(final Bundle bundle) {
        final ArrayList list = new ArrayList(bundle.keySet());
        Collections.sort((List<Comparable>)list);
        final ArrayList list2 = new ArrayList();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Object value = bundle.get((String)list.get(i));
            if (value instanceof boolean[]) {
                list2.add(Arrays.hashCode((boolean[])value));
            }
            else if (value instanceof long[]) {
                list2.add(Arrays.hashCode((long[])value));
            }
            else if (value instanceof double[]) {
                list2.add(Arrays.hashCode((double[])value));
            }
            else if (value instanceof byte[]) {
                list2.add(Arrays.hashCode((byte[])value));
            }
            else if (value instanceof Object[]) {
                list2.add(Arrays.hashCode((Object[])value));
            }
            else {
                list2.add(Arrays.hashCode(new Object[] { value }));
            }
        }
        return Arrays.hashCode(list2.toArray());
    }
    
    public static void b(final Bundle bundle, final StringBuilder sb) {
        try {
            final Set keySet = bundle.keySet();
            final String[] array = keySet.toArray(new String[keySet.size()]);
            Arrays.sort(array, (Comparator<? super String>)zks.o);
            for (final String s : array) {
                sb.append("{ key: '");
                sb.append(s);
                sb.append("' value: ");
                final Object value = bundle.get(s);
                if (value == null) {
                    sb.append("<null>");
                }
                else if (value.getClass().isArray()) {
                    sb.append("[ ");
                    for (int j = 0; j < Array.getLength(value); ++j) {
                        sb.append("'");
                        sb.append(Array.get(value, j));
                        sb.append("' ");
                    }
                    sb.append("]");
                }
                else {
                    sb.append(value.toString());
                }
                sb.append(" } ");
            }
        }
        catch (final RuntimeException ex) {
            sb.append("<error>");
        }
    }
    
    public static boolean c(final Bundle bundle, final Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (final String s : bundle.keySet()) {
            final Object value = bundle.get(s);
            final Object value2 = bundle2.get(s);
            if (value instanceof Bundle && value2 instanceof Bundle && !c((Bundle)value, (Bundle)value2)) {
                return false;
            }
            Object o = value2;
            if (value == null) {
                if (value2 != null || !bundle2.containsKey(s)) {
                    return false;
                }
                o = null;
            }
            if (value instanceof boolean[]) {
                if (!(o instanceof boolean[]) || !Arrays.equals((boolean[])value, (boolean[])o)) {
                    return false;
                }
                continue;
            }
            else if (value instanceof long[]) {
                if (!(o instanceof long[]) || !Arrays.equals((long[])value, (long[])o)) {
                    return false;
                }
                continue;
            }
            else if (value instanceof double[]) {
                if (!(o instanceof double[]) || !Arrays.equals((double[])value, (double[])o)) {
                    return false;
                }
                continue;
            }
            else if (value instanceof byte[]) {
                if (!(o instanceof byte[]) || !Arrays.equals((byte[])value, (byte[])o)) {
                    return false;
                }
                continue;
            }
            else {
                if (value instanceof Object[] && (!(o instanceof Object[]) || !Arrays.equals((Object[])value, (Object[])o))) {
                    return false;
                }
                continue;
            }
        }
        return true;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Thing)) {
            return false;
        }
        final Thing thing = (Thing)o;
        return khl.be(this.a, thing.a) && khl.be(this.d, thing.d) && khl.be(this.e, thing.e) && khl.be(this.c, thing.c) && c(this.b, thing.b);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.d, this.e, this.c.hashCode(), a(this.b) });
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        String e;
        if (this.e.equals("Thing")) {
            e = "Indexable";
        }
        else {
            e = this.e;
        }
        sb.append(e);
        sb.append(" { { id: ");
        if (this.d == null) {
            sb.append("<null>");
        }
        else {
            sb.append("'");
            sb.append(this.d);
            sb.append("'");
        }
        sb.append(" } Properties { ");
        b(this.b, sb);
        sb.append("} Metadata { ");
        sb.append(this.c.toString());
        sb.append(" } }");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.V(parcel, 1, this.b);
        khl.af(parcel, 2, (Parcelable)this.c, n);
        khl.ag(parcel, 3, this.d);
        khl.ag(parcel, 4, this.e);
        khl.S(parcel, 1000, this.a);
        khl.N(parcel, m);
    }
}
