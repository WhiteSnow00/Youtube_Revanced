// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaFormat implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final List f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final int n;
    public final byte[] o;
    public final ColorInfo p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final String v;
    public final long w;
    public android.media.MediaFormat x;
    private int y;
    
    static {
        CREATOR = (Parcelable$Creator)new f(16);
    }
    
    public MediaFormat(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readFloat();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.v = parcel.readString();
        this.w = parcel.readLong();
        final ArrayList f = new ArrayList();
        this.f = f;
        byte[] byteArray = null;
        parcel.readList((List)f, (ClassLoader)null);
        final int int1 = parcel.readInt();
        boolean g = true;
        if (int1 != 1) {
            g = false;
        }
        this.g = g;
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        if (parcel.readInt() != 0) {
            byteArray = parcel.createByteArray();
        }
        this.o = byteArray;
        this.n = parcel.readInt();
        this.p = (ColorInfo)parcel.readParcelable(ColorInfo.class.getClassLoader());
    }
    
    public MediaFormat(final String a, final String b, final int c, final int d, final long e, final int h, final int i, final int l, final float m, final int q, final int r, final String v, final long w, List emptyList, final boolean g, final int j, final int k, final int s, final int t, final int u, final byte[] o, final int n, final ColorInfo p23) {
        this.a = a;
        jgu.ae(b);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.h = h;
        this.i = i;
        this.l = l;
        this.m = m;
        this.q = q;
        this.r = r;
        this.v = v;
        this.w = w;
        if (emptyList == null) {
            emptyList = Collections.emptyList();
        }
        this.f = emptyList;
        this.g = g;
        this.j = j;
        this.k = k;
        this.s = s;
        this.t = t;
        this.u = u;
        this.o = o;
        this.n = n;
        this.p = p23;
    }
    
    public static MediaFormat b(final String s, final String s2, final int n, final int n2, final long n3, final int n4, final int n5, final List list, final String s3) {
        return c(s, s2, n, n2, n3, n4, n5, list, s3, -1);
    }
    
    public static MediaFormat c(final String s, final String s2, final int n, final int n2, final long n3, final int n4, final int n5, final List list, final String s3, final int n6) {
        return new MediaFormat(s, s2, n, n2, n3, -1, -1, -1, -1.0f, n4, n5, s3, Long.MAX_VALUE, list, false, -1, -1, n6, -1, -1, null, -1, null);
    }
    
    public static MediaFormat d() {
        return f(null, "application/id3", -1L);
    }
    
    public static final void e(final android.media.MediaFormat mediaFormat, final String s, final int n) {
        if (n != -1) {
            mediaFormat.setInteger(s, n);
        }
    }
    
    public static MediaFormat f(final String s, final String s2, final long n) {
        return new MediaFormat(s, s2, -1, -1, n, -1, -1, -1, -1.0f, -1, -1, null, Long.MAX_VALUE, null, false, -1, -1, -1, -1, -1, null, -1, null);
    }
    
    public static MediaFormat g(final String s, final String s2, final long n, final String s3) {
        return h(s, s2, n, s3, Long.MAX_VALUE);
    }
    
    public static MediaFormat h(final String s, final String s2, final long n, final String s3, final long n2) {
        return new MediaFormat(s, s2, -1, -1, n, -1, -1, -1, -1.0f, -1, -1, s3, n2, null, false, -1, -1, -1, -1, -1, null, -1, null);
    }
    
    public static MediaFormat i(final String s, final long n, final int n2, final int n3, final List list, final float n4) {
        return new MediaFormat(null, s, -1, -1, n, n2, n3, -1, n4, -1, -1, null, Long.MAX_VALUE, list, false, -1, -1, -1, -1, -1, null, -1, null);
    }
    
    public static MediaFormat j(final String s, final String s2, final int n, final long n2, final int n3, final int n4, final List list, final int n5, final float n6, final byte[] array, final int n7, final ColorInfo colorInfo) {
        return new MediaFormat(s, s2, -1, n, n2, n3, n4, n5, n6, -1, -1, null, Long.MAX_VALUE, list, false, -1, -1, -1, -1, -1, array, n7, colorInfo);
    }
    
    public final MediaFormat a(final int n, final int n2) {
        return new MediaFormat(this.a, this.b, this.c, this.d, this.e, this.h, this.i, this.l, this.m, this.q, this.r, this.v, this.w, this.f, this.g, this.j, this.k, this.s, n, n2, this.o, this.n, this.p);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final MediaFormat mediaFormat = (MediaFormat)o;
                if (this.g == mediaFormat.g && this.c == mediaFormat.c && this.d == mediaFormat.d && this.e == mediaFormat.e && this.h == mediaFormat.h && this.i == mediaFormat.i && this.l == mediaFormat.l && this.m == mediaFormat.m && this.j == mediaFormat.j && this.k == mediaFormat.k && this.q == mediaFormat.q && this.r == mediaFormat.r && this.s == mediaFormat.s && this.t == mediaFormat.t && this.u == mediaFormat.u && this.w == mediaFormat.w && lyc.k((Object)this.a, (Object)mediaFormat.a) && lyc.k((Object)this.v, (Object)mediaFormat.v) && lyc.k((Object)this.b, (Object)mediaFormat.b) && this.f.size() == mediaFormat.f.size() && lyc.k((Object)this.p, (Object)mediaFormat.p) && Arrays.equals(this.o, mediaFormat.o) && this.n == mediaFormat.n) {
                    for (int i = 0; i < this.f.size(); ++i) {
                        if (!Arrays.equals((byte[])this.f.get(i), (byte[])mediaFormat.f.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int y;
        if ((y = this.y) == 0) {
            final String a = this.a;
            final int n = 0;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            final String b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            final int c = this.c;
            final int d = this.d;
            final int h = this.h;
            final int i = this.i;
            final int l = this.l;
            final int floatToRawIntBits = Float.floatToRawIntBits(this.m);
            final int n2 = (int)this.e;
            int n3;
            if (!this.g) {
                n3 = 1237;
            }
            else {
                n3 = 1231;
            }
            final int j = this.j;
            final int k = this.k;
            final int q = this.q;
            final int r = this.r;
            final int s = this.s;
            final int t = this.t;
            final int u = this.u;
            final String v = this.v;
            int hashCode3;
            if (v == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = v.hashCode();
            }
            int n4 = ((((((((((((((((((hashCode + 527) * 31 + hashCode2) * 31 + c) * 31 + d) * 31 + h) * 31 + i) * 31 + l) * 31 + floatToRawIntBits) * 31 + n2) * 31 + n3) * 31 + j) * 31 + k) * 31 + q) * 31 + r) * 31 + s) * 31 + t) * 31 + u) * 31 + hashCode3) * 31 + (int)this.w;
            for (int n5 = n; n5 < this.f.size(); ++n5) {
                n4 = n4 * 31 + Arrays.hashCode((byte[])this.f.get(n5));
            }
            y = (n4 * 31 + Arrays.hashCode(this.o)) * 31 + this.n;
            this.y = y;
        }
        return y;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final int d = this.d;
        final int h = this.h;
        final int i = this.i;
        final int l = this.l;
        final float m = this.m;
        final int q = this.q;
        final int r = this.r;
        final String v = this.v;
        final long e = this.e;
        final boolean g = this.g;
        final int j = this.j;
        final int k = this.k;
        final int s = this.s;
        final int t = this.t;
        final int u = this.u;
        final StringBuilder sb = new StringBuilder("MediaFormat(");
        sb.append(a);
        sb.append(", ");
        sb.append(b);
        sb.append(", ");
        sb.append(c);
        sb.append(", ");
        sb.append(d);
        sb.append(", ");
        sb.append(h);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(l);
        sb.append(", ");
        sb.append(m);
        sb.append(", ");
        sb.append(q);
        sb.append(", ");
        sb.append(r);
        sb.append(", ");
        sb.append(v);
        sb.append(", ");
        sb.append(e);
        sb.append(", ");
        sb.append(g);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(k);
        sb.append(", ");
        sb.append(s);
        sb.append(", ");
        sb.append(t);
        sb.append(", ");
        sb.append(u);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.l);
        parcel.writeFloat(this.m);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeString(this.v);
        parcel.writeLong(this.w);
        parcel.writeList(this.f);
        parcel.writeInt((int)(this.g ? 1 : 0));
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        int n2;
        if (this.o != null) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
        final byte[] o = this.o;
        if (o != null) {
            parcel.writeByteArray(o);
        }
        parcel.writeInt(this.n);
        parcel.writeParcelable((Parcelable)this.p, n);
    }
}
