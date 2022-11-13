// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.video.editablevideo;

import java.util.Iterator;
import com.google.android.libraries.video.media.VideoMetaData;
import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class EditableVideoEdits implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final boolean a;
    final long b;
    long c;
    public final long d;
    String e;
    long f;
    long g;
    boolean h;
    int i;
    long j;
    public long k;
    Uri l;
    boolean m;
    float n;
    double o;
    double p;
    double q;
    double r;
    public float s;
    public float t;
    
    static {
        CREATOR = (Parcelable$Creator)new now(18);
    }
    
    public EditableVideoEdits(final Parcel parcel) {
        final boolean b = true;
        this.h = true;
        this.j = 0L;
        this.k = Long.MAX_VALUE;
        this.a = (parcel.readByte() != 0);
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.h = (parcel.readByte() != 0);
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        this.i = parcel.readInt();
        this.e = parcel.readString();
        this.l = (Uri)parcel.readParcelable(Uri.class.getClassLoader());
        this.j = parcel.readLong();
        this.n = parcel.readFloat();
        this.d = parcel.readLong();
        this.m = (parcel.readByte() != 0 && b);
        this.o = parcel.readDouble();
        this.p = parcel.readDouble();
        this.q = parcel.readDouble();
        this.r = parcel.readDouble();
        this.s = parcel.readFloat();
        this.t = parcel.readFloat();
    }
    
    public EditableVideoEdits(final VideoMetaData videoMetaData, long g, long n, final boolean b) {
        boolean b2 = true;
        this.h = true;
        this.j = 0L;
        this.k = Long.MAX_VALUE;
        this.b = g;
        this.a(n);
        final long h = videoMetaData.h;
        final int[] j = videoMetaData.j;
        Object o;
        if (j != null) {
            o = new qyi(j);
        }
        else {
            o = new rba(videoMetaData.h());
        }
        if (((Iterator)o).hasNext()) {
            n = videoMetaData.l((int)((Iterator)o).next());
            g = 0L;
            while (((Iterator)o).hasNext()) {
                final long l = videoMetaData.l((int)((Iterator)o).next());
                g = Math.max(g, l - n);
                n = l;
            }
            g = Math.max(g, h - n);
        }
        else {
            g = 0L;
        }
        boolean a = h > this.b;
        if (b) {
            if (g > 6000000L) {
                b2 = false;
            }
            a &= b2;
        }
        this.a = a;
        this.d = g;
        this.f = 0L;
        n = this.c;
        g = h;
        if (n > 0L) {
            g = Math.min(h, n);
        }
        this.g = g;
        this.i = 0;
        this.e = null;
        this.j = 0L;
        this.n = 0.3f;
        this.l = null;
        this.s = 0.0f;
        this.t = 0.0f;
    }
    
    public final void a(final long n) {
        Label_0086: {
            if (n > 0L) {
                final long b = this.b;
                if (n < b) {
                    final StringBuilder sb = new StringBuilder("Max video duration ");
                    sb.append(n);
                    sb.append(" smaller than min video duration ");
                    sb.append(b);
                    sb.append(". Enforcing specified min video duration for both.");
                    rah.f(sb.toString());
                    this.c = this.b;
                    break Label_0086;
                }
            }
            this.c = Math.max(0L, n);
        }
        final long g = this.g;
        final long f = this.f;
        if (g - f > n) {
            this.g = f + n;
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeByte((byte)(byte)(this.a ? 1 : 0));
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeByte((byte)(byte)(this.h ? 1 : 0));
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.i);
        parcel.writeString(this.e);
        parcel.writeParcelable((Parcelable)this.l, n);
        parcel.writeLong(this.j);
        parcel.writeFloat(this.n);
        parcel.writeLong(this.d);
        parcel.writeByte((byte)(byte)(this.m ? 1 : 0));
        parcel.writeDouble(this.o);
        parcel.writeDouble(this.p);
        parcel.writeDouble(this.q);
        parcel.writeDouble(this.r);
        parcel.writeFloat(this.s);
        parcel.writeFloat(this.t);
    }
}
