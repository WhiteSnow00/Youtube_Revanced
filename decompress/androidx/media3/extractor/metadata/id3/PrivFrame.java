// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class PrivFrame extends Id3Frame
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final byte[] b;
    
    static {
        CREATOR = (Parcelable$Creator)new app(20);
    }
    
    public PrivFrame(final Parcel parcel) {
        super("PRIV");
        final String string = parcel.readString();
        final int a = bax.a;
        this.a = string;
        this.b = (byte[])bax.L((Object)parcel.createByteArray());
    }
    
    public PrivFrame(final String a, final byte[] b) {
        super("PRIV");
        this.a = a;
        this.b = b;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final PrivFrame privFrame = (PrivFrame)o;
                if (bax.aa((Object)this.a, (Object)privFrame.a) && Arrays.equals(this.b, privFrame.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (hashCode + 527) * 31 + Arrays.hashCode(this.b);
    }
    
    public final String toString() {
        final String f = this.f;
        final String a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(": owner=");
        sb.append(a);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }
}
