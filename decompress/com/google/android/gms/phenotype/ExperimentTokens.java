// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.phenotype;

import android.os.Parcel;
import java.util.Arrays;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ExperimentTokens extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final byte[] b;
    public final byte[][] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final int[] g;
    public final byte[][] h;
    public final int[] i;
    public final byte[][] j;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(17);
    }
    
    public ExperimentTokens(final String a, final byte[] b, final byte[][] c, final byte[][] d, final byte[][] e, final byte[][] f, final int[] g, final byte[][] h, final int[] i, final byte[][] j) {
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
    }
    
    private static List a(final int[] array) {
        if (array == null) {
            return Collections.emptyList();
        }
        final int length = array.length;
        final ArrayList list = new ArrayList(length);
        for (int i = 0; i < length; ++i) {
            list.add((Object)array[i]);
        }
        Collections.sort((List<Comparable>)list);
        return list;
    }
    
    private static List b(final byte[][] array) {
        if (array == null) {
            return Collections.emptyList();
        }
        final int length = array.length;
        final ArrayList list = new ArrayList(length);
        for (final byte[] array2 : array) {
            kgk.aL((Object)array2);
            list.add((Object)Base64.encodeToString(array2, 3));
        }
        Collections.sort((List<Comparable>)list);
        return list;
    }
    
    private static List c(final int[] array) {
        if (array == null) {
            return Collections.emptyList();
        }
        final ArrayList list = new ArrayList(array.length >> 1);
        for (int i = 0; i < array.length; i += 2) {
            list.add(new GenericDimension(array[i], array[i + 1]));
        }
        Collections.sort((List<Comparable>)list);
        return list;
    }
    
    private static void d(final StringBuilder sb, final String s, final byte[][] array) {
        sb.append(s);
        sb.append("=");
        if (array == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        final int length = array.length;
        int n = 1;
        for (int i = 0; i < length; ++i, n = 0) {
            final byte[] array2 = array[i];
            if (n == 0) {
                sb.append(", ");
            }
            sb.append("'");
            kgk.aL((Object)array2);
            sb.append(Base64.encodeToString(array2, 3));
            sb.append("'");
        }
        sb.append(")");
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof ExperimentTokens) {
            final ExperimentTokens experimentTokens = (ExperimentTokens)o;
            if (nmr.q((Object)this.a, (Object)experimentTokens.a) && Arrays.equals(this.b, experimentTokens.b) && nmr.q((Object)b(this.c), (Object)b(experimentTokens.c)) && nmr.q((Object)b(this.d), (Object)b(experimentTokens.d)) && nmr.q((Object)b(this.e), (Object)b(experimentTokens.e)) && nmr.q((Object)b(this.f), (Object)b(experimentTokens.f)) && nmr.q((Object)a(this.g), (Object)a(experimentTokens.g)) && nmr.q((Object)b(this.h), (Object)b(experimentTokens.h)) && nmr.q((Object)c(this.i), (Object)c(experimentTokens.i)) && nmr.q((Object)b(this.j), (Object)b(experimentTokens.j))) {
                return true;
            }
        }
        return false;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        final String a = this.a;
        String string;
        if (a == null) {
            string = "null";
        }
        else {
            final StringBuilder sb2 = new StringBuilder("'");
            sb2.append(a);
            sb2.append("'");
            string = sb2.toString();
        }
        sb.append(string);
        final byte[] b = this.b;
        sb.append(", direct==");
        if (b == null) {
            sb.append("null");
        }
        else {
            sb.append("'");
            sb.append(Base64.encodeToString(b, 3));
            sb.append("'");
        }
        sb.append(", ");
        d(sb, "GAIA=", this.c);
        sb.append(", ");
        d(sb, "PSEUDO=", this.d);
        sb.append(", ");
        d(sb, "ALWAYS=", this.e);
        sb.append(", ");
        d(sb, "OTHER=", this.f);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.g));
        sb.append(", ");
        d(sb, "directs=", this.h);
        sb.append(", genDims=");
        sb.append(Arrays.toString(c(this.i).toArray()));
        sb.append(", ");
        d(sb, "external=", this.j);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.S(parcel, 3, this.b);
        kgk.T(parcel, 4, this.c);
        kgk.T(parcel, 5, this.d);
        kgk.T(parcel, 6, this.e);
        kgk.T(parcel, 7, this.f);
        kgk.V(parcel, 8, this.g);
        kgk.T(parcel, 9, this.h);
        kgk.V(parcel, 10, this.i);
        kgk.T(parcel, 11, this.j);
        kgk.J(parcel, i);
    }
}
