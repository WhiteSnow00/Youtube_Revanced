// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class ApicFrame extends Id3Frame
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final int c;
    public final byte[] d;
    
    static {
        CREATOR = (Parcelable$Creator)new apq(12);
    }
    
    public ApicFrame(final Parcel parcel) {
        super("APIC");
        final String string = parcel.readString();
        final int a = baz.a;
        this.a = string;
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = (byte[])baz.L(parcel.createByteArray());
    }
    
    public ApicFrame(final String a, final String b, final int c, final byte[] d) {
        super("APIC");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void b(final ayx ayx) {
        ayx.b(this.d, this.c);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final ApicFrame apicFrame = (ApicFrame)o;
                if (this.c == apicFrame.c && baz.aa(this.a, apicFrame.a) && baz.aa(this.b, apicFrame.b) && Arrays.equals(this.d, apicFrame.d)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int c = this.c;
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
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (((c + 527) * 31 + hashCode2) * 31 + hashCode) * 31 + Arrays.hashCode(this.d);
    }
    
    public final String toString() {
        final String f = this.f;
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(": mimeType=");
        sb.append(a);
        sb.append(", description=");
        sb.append(b);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeByteArray(this.d);
    }
}
