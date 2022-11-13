// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.video.media;

import java.io.Serializable;
import java.util.Arrays;
import android.os.Parcel;
import java.io.IOException;
import android.net.Uri;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class VideoMetaData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Uri a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final long h;
    public final boolean i;
    public final int[] j;
    private final boolean k;
    private final int l;
    private final long[] m;
    private final Integer n;
    private final byte[] o;
    
    static {
        CREATOR = (Parcelable$Creator)new rhy(1);
    }
    
    public VideoMetaData(final Uri a, final boolean b, int i, int d, final int e, final int f, final float g, final long h, final long[] m, final int[] j, final boolean k, final boolean l, final Integer n) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = i;
        this.d = d;
        this.e = e;
        this.g = g;
        this.i = l;
        if (f != 0 && f != 90 && f != 180 && f != 270) {
            final StringBuilder sb = new StringBuilder("Video rotation unsupported: ");
            sb.append(f);
            throw new IOException(sb.toString());
        }
        this.f = f;
        this.h = h;
        this.k = k;
        this.l = 0;
        this.o = null;
        d = 1;
        adkp.H(m == null || n == null);
        if (m != null) {
            for (i = 1; i < m.length; ++i) {
                if (m[i] <= m[i - 1]) {
                    throw new IOException("Frame times are not strictly ascending");
                }
            }
            this.n = null;
            this.m = m;
        }
        else {
            if (n == null) {
                throw new IllegalStateException("No frame times from video nor frame count.");
            }
            this.n = n;
            this.m = null;
        }
        if (j != null) {
            if (j.length <= 0 || j[0] < 0) {
                throw new IOException("Could not parse sync samples from video");
            }
            for (i = d; i < j.length; ++i) {
                d = j[i];
                if (d <= j[i - 1]) {
                    throw new IOException("Sync samples are not strictly ascending");
                }
                if (d >= this.h()) {
                    throw new IOException("Sync sample is not a valid frame");
                }
            }
        }
        this.j = j;
    }
    
    public VideoMetaData(final Parcel parcel) {
        this.a = (Uri)parcel.readParcelable(Uri.class.getClassLoader());
        final int int1 = parcel.readInt();
        final boolean b = false;
        this.b = (int1 != 0);
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readFloat();
        this.h = parcel.readLong();
        final int int2 = parcel.readInt();
        final Integer n = null;
        long[] longArray;
        if (int2 != 0) {
            longArray = parcel.createLongArray();
        }
        else {
            longArray = null;
        }
        this.m = longArray;
        this.j = parcel.createIntArray();
        this.k = (parcel.readInt() == 1);
        this.l = parcel.readInt();
        byte[] byteArray;
        if (parcel.readInt() != 0) {
            byteArray = parcel.createByteArray();
        }
        else {
            byteArray = null;
        }
        this.o = byteArray;
        boolean i = b;
        if (parcel.readInt() == 1) {
            i = true;
        }
        this.i = i;
        Integer value = n;
        if (parcel.readInt() != 0) {
            value = parcel.readInt();
        }
        this.n = value;
    }
    
    private final int n(final long n) {
        final int i = this.i(n);
        if (i == -1) {
            return -1;
        }
        return this.f(i);
    }
    
    private final int o() {
        final int[] j = this.j;
        int n;
        if (j != null) {
            n = j.length;
        }
        else {
            n = this.h();
        }
        return n;
    }
    
    private final int p(int n) {
        int n2 = n;
        if (n < 0) {
            n2 = n + this.o();
        }
        final int[] j = this.j;
        n = n2;
        if (j != null) {
            n = j[n2];
        }
        return n;
    }
    
    public final float a() {
        final int f = this.f;
        float n;
        float n2;
        if (f != 0 && f != 180) {
            n = (float)this.e;
            n2 = this.g * this.d;
        }
        else {
            n = this.g * this.d;
            n2 = (float)this.e;
        }
        return n / n2;
    }
    
    public final int b(final long n, long n2, final long n3) {
        this.m.getClass();
        final boolean b = true;
        adkp.H(n2 <= n3);
        final int c = this.c(n2);
        final int e = this.e(n3 - 1L);
        if (c == -1 || e == -1 || c > e) {
            return -1;
        }
        n2 = this.l(c);
        n2 = Math.max(Math.min(n, this.l(e)), n2);
        final int c2 = this.c(n2);
        adkp.Q(c2 != -1 && c2 <= e);
        final int e2 = this.e(n2);
        adkp.Q(e2 != -1 && e2 >= c && b);
        final long[] m = this.m;
        if (m[c2] - n > n - m[e2]) {
            return e2;
        }
        return c2;
    }
    
    public final int c(final long n) {
        final long[] m = this.m;
        m.getClass();
        if (n < m[this.p(0)]) {
            return this.p(0);
        }
        final int n2 = this.n(n);
        if (n2 == -1) {
            return -1;
        }
        if (this.m[this.p(n2)] == n) {
            return this.p(n2);
        }
        if (n2 == this.o() - 1) {
            return -1;
        }
        return this.p(n2 + 1);
    }
    
    public final int d(final int n) {
        if (n < 0) {
            return -1;
        }
        if (n >= this.h()) {
            return this.p(-1);
        }
        return this.p(this.f(n));
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final int e(final long n) {
        final long[] m = this.m;
        m.getClass();
        if (n > m[this.p(-1)]) {
            return this.p(-1);
        }
        final int n2 = this.n(n);
        if (n2 == -1) {
            return -1;
        }
        return this.p(n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof VideoMetaData && qdt.o((Object)this.a, (Object)((VideoMetaData)o).a));
    }
    
    public final int f(int binarySearch) {
        final int[] j = this.j;
        if (j == null) {
            return binarySearch;
        }
        binarySearch = Arrays.binarySearch(j, binarySearch);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        binarySearch = -binarySearch - 2;
        final boolean b = true;
        adkp.Q(binarySearch >= 0);
        adkp.Q(binarySearch < this.j.length && b);
        return binarySearch;
    }
    
    public final int g(final long n) {
        final long[] m = this.m;
        m.getClass();
        if (n < 0L) {
            return 0;
        }
        if (n >= m[m.length - 1]) {
            return this.h() - 1;
        }
        return this.i(n);
    }
    
    public final int h() {
        final long[] m = this.m;
        if (m != null) {
            return m.length;
        }
        final Integer n = this.n;
        if (n != null) {
            return n;
        }
        return 0;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
    
    public final int i(final long n) {
        final long[] m = this.m;
        m.getClass();
        if (n < 0L || n > Math.max(this.h - 1L, m[m.length - 1])) {
            return -1;
        }
        final int binarySearch = Arrays.binarySearch(this.m, n);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return -binarySearch - 2;
    }
    
    public final int j() {
        final int f = this.f;
        int n;
        if (f != 0 && f != 180) {
            n = this.d;
        }
        else {
            n = this.e;
        }
        return n;
    }
    
    public final int k() {
        final int f = this.f;
        int n;
        if (f != 0 && f != 180) {
            n = this.e;
        }
        else {
            n = this.d;
        }
        return n;
    }
    
    public final long l(final int n) {
        final long[] m = this.m;
        m.getClass();
        adkp.Y(n, m.length);
        return this.m[n];
    }
    
    public final boolean m(final int n) {
        adkp.Y(n, this.h());
        final int[] j = this.j;
        return j == null || Arrays.binarySearch(j, n) >= 0;
    }
    
    @Override
    public final String toString() {
        final String name = this.getClass().getName();
        final String concat = "source=".concat(String.valueOf(String.valueOf(this.a)));
        final int c = this.c;
        final StringBuilder sb = new StringBuilder("videoTrackIndex=");
        sb.append(c);
        final String string = sb.toString();
        final int d = this.d;
        final StringBuilder sb2 = new StringBuilder("width=");
        sb2.append(d);
        final String string2 = sb2.toString();
        final int e = this.e;
        final StringBuilder sb3 = new StringBuilder("height=");
        sb3.append(e);
        final String string3 = sb3.toString();
        final float g = this.g;
        final StringBuilder sb4 = new StringBuilder("pixelAspect=");
        sb4.append(g);
        final String string4 = sb4.toString();
        final int f = this.f;
        final StringBuilder sb5 = new StringBuilder("rotationDegrees=");
        sb5.append(f);
        final String string5 = sb5.toString();
        final long h = this.h;
        final StringBuilder sb6 = new StringBuilder("durationUs=");
        sb6.append(h);
        final String string6 = sb6.toString();
        final long[] m = this.m;
        final String s = "null";
        Serializable value;
        if (m != null) {
            value = m.length;
        }
        else {
            value = "null";
        }
        final String concat2 = "frameTimesUs count=".concat(value.toString());
        final int[] j = this.j;
        Serializable value2;
        if (j != null) {
            value2 = j.length;
        }
        else {
            value2 = "null";
        }
        final String concat3 = "syncSamplesIndices count=".concat(value2.toString());
        final boolean k = this.k;
        final StringBuilder sb7 = new StringBuilder("hasBFrames=");
        sb7.append(k);
        final String string7 = sb7.toString();
        final int l = this.l;
        final StringBuilder sb8 = new StringBuilder("stereoMode=");
        sb8.append(l);
        final String string8 = sb8.toString();
        final byte[] o = this.o;
        Serializable value3 = s;
        if (o != null) {
            value3 = o.length;
        }
        final String concat4 = "projectionData count=".concat(value3.toString());
        final boolean i = this.i;
        final StringBuilder sb9 = new StringBuilder("hasMetadataTrack=");
        sb9.append(i);
        final String string9 = sb9.toString();
        final Integer n = this.n;
        new StringBuilder("numFrames=").append(n);
        return qdt.n(name, new Object[] { concat, string, string2, string3, string4, string5, string6, concat2, concat3, string7, string8, concat4, string9, "numFrames=".concat(String.valueOf(n)) });
    }
    
    public final void writeToParcel(final Parcel parcel, int n) {
        final Uri a = this.a;
        final int n2 = 0;
        parcel.writeParcelable((Parcelable)a, 0);
        parcel.writeInt((int)(this.b ? 1 : 0));
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeFloat(this.g);
        parcel.writeLong(this.h);
        if (this.m != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        final long[] m = this.m;
        if (m != null) {
            parcel.writeLongArray(m);
        }
        parcel.writeIntArray(this.j);
        parcel.writeInt((int)(this.k ? 1 : 0));
        parcel.writeInt(this.l);
        if (this.o != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        final byte[] o = this.o;
        if (o != null) {
            parcel.writeByteArray(o);
        }
        parcel.writeInt((int)(this.i ? 1 : 0));
        n = n2;
        if (this.n != null) {
            n = 1;
        }
        parcel.writeInt(n);
        final Integer n3 = this.n;
        if (n3 != null) {
            parcel.writeInt((int)n3);
        }
    }
}
