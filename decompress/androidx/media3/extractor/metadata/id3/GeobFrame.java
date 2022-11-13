// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class GeobFrame extends Id3Frame
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final byte[] d;
    
    static {
        CREATOR = (Parcelable$Creator)new app(17);
    }
    
    public GeobFrame(final Parcel parcel) {
        super("GEOB");
        final String string = parcel.readString();
        final int a = bax.a;
        this.a = string;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = (byte[])bax.L((Object)parcel.createByteArray());
    }
    
    public GeobFrame(final String a, final String b, final String c, final byte[] d) {
        super("GEOB");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final GeobFrame geobFrame = (GeobFrame)o;
                if (bax.aa((Object)this.a, (Object)geobFrame.a) && bax.aa((Object)this.b, (Object)geobFrame.b) && bax.aa((Object)this.c, (Object)geobFrame.c) && Arrays.equals(this.d, geobFrame.d)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (((hashCode2 + 527) * 31 + hashCode3) * 31 + hashCode) * 31 + Arrays.hashCode(this.d);
    }
    
    public final String toString() {
        final String f = this.f;
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(": mimeType=");
        sb.append(a);
        sb.append(", filename=");
        sb.append(b);
        sb.append(", description=");
        sb.append(c);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }
}
