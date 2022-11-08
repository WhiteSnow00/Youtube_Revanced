// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.media3.common.Metadata$Entry;

public final class IcyHeaders implements Metadata$Entry
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    
    static {
        CREATOR = (Parcelable$Creator)new apo(10);
    }
    
    public IcyHeaders(final int a, final String b, final String c, final String d, final boolean e, final int f) {
        boolean b2 = true;
        if (f != -1) {
            b2 = (f > 0 && b2);
        }
        dk.f(b2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public IcyHeaders(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = baw.ai(parcel);
        this.f = parcel.readInt();
    }
    
    public final void b(final ayv ayv) {
        final String c = this.c;
        if (c != null) {
            ayv.t = c;
        }
        final String b = this.b;
        if (b != null) {
            ayv.s = b;
        }
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
                final IcyHeaders icyHeaders = (IcyHeaders)o;
                if (this.a == icyHeaders.a && baw.aa(this.b, icyHeaders.b) && baw.aa(this.c, icyHeaders.c) && baw.aa(this.d, icyHeaders.d) && this.e == icyHeaders.e && this.f == icyHeaders.f) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final String b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String c = this.c;
        int hashCode3;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return (((((a + 527) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31 + (this.e ? 1 : 0)) * 31 + this.f;
    }
    
    @Override
    public final String toString() {
        final String c = this.c;
        final String b = this.b;
        final int a = this.a;
        final int f = this.f;
        final StringBuilder sb = new StringBuilder("IcyHeaders: name=\"");
        sb.append(c);
        sb.append("\", genre=\"");
        sb.append(b);
        sb.append("\", bitrate=");
        sb.append(a);
        sb.append(", metadataInterval=");
        sb.append(f);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        baw.Z(parcel, this.e);
        parcel.writeInt(this.f);
    }
}
