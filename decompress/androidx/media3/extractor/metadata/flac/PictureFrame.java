// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.flac;

import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.media3.common.Metadata$Entry;

public final class PictureFrame implements Metadata$Entry
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;
    
    static {
        CREATOR = (Parcelable$Creator)new apo(8);
    }
    
    public PictureFrame(final int a, final String b, final String c, final int d, final int e, final int f, final int g, final byte[] h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public PictureFrame(final Parcel parcel) {
        this.a = parcel.readInt();
        final String string = parcel.readString();
        final int a = baw.a;
        this.b = string;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = (byte[])baw.L(parcel.createByteArray());
    }
    
    public static PictureFrame d(final bar bar) {
        final int d = bar.d();
        final String x = bar.x(bar.d(), aexb.a);
        final String w = bar.w(bar.d());
        final int d2 = bar.d();
        final int d3 = bar.d();
        final int d4 = bar.d();
        final int d5 = bar.d();
        final int d6 = bar.d();
        final byte[] array = new byte[d6];
        bar.B(array, 0, d6);
        return new PictureFrame(d, x, w, d2, d3, d4, d5, array);
    }
    
    public final void b(final ayv ayv) {
        ayv.b(this.h, this.a);
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
                final PictureFrame pictureFrame = (PictureFrame)o;
                if (this.a == pictureFrame.a && this.b.equals(pictureFrame.b) && this.c.equals(pictureFrame.c) && this.d == pictureFrame.d && this.e == pictureFrame.e && this.f == pictureFrame.f && this.g == pictureFrame.g && Arrays.equals(this.h, pictureFrame.h)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((((this.a + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + Arrays.hashCode(this.h);
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder("Picture: mimeType=");
        sb.append(b);
        sb.append(", description=");
        sb.append(c);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeByteArray(this.h);
    }
}
