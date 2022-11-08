// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer;

import java.util.Arrays;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class ColorInfo implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int e;
    
    static {
        CREATOR = (Parcelable$Creator)new f(16);
    }
    
    public ColorInfo(final int a, final int b, final int c, final byte[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public ColorInfo(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        byte[] byteArray;
        if (parcel.readInt() != 0) {
            byteArray = parcel.createByteArray();
        }
        else {
            byteArray = null;
        }
        this.d = byteArray;
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
                final ColorInfo colorInfo = (ColorInfo)o;
                if (this.a == colorInfo.a && this.b == colorInfo.b && this.c == colorInfo.c) {
                    if (Arrays.equals(this.d, colorInfo.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int e;
        if ((e = this.e) == 0) {
            e = (((this.a + 527) * 31 + this.b) * 31 + this.c) * 31 + Arrays.hashCode(this.d);
            this.e = e;
        }
        return e;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final boolean b2 = this.d != null;
        final StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(a);
        sb.append(", ");
        sb.append(b);
        sb.append(", ");
        sb.append(c);
        sb.append(", ");
        sb.append(b2);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.d != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        final byte[] d = this.d;
        if (d != null) {
            parcel.writeByteArray(d);
        }
    }
}
