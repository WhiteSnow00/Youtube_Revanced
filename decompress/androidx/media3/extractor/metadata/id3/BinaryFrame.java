// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class BinaryFrame extends Id3Frame
{
    public static final Parcelable$Creator CREATOR;
    public final byte[] a;
    
    static {
        CREATOR = (Parcelable$Creator)new app(13);
    }
    
    public BinaryFrame(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = bax.a;
        super(string);
        this.a = (byte[])bax.L((Object)parcel.createByteArray());
    }
    
    public BinaryFrame(final String s, final byte[] a) {
        super(s);
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final BinaryFrame binaryFrame = (BinaryFrame)o;
                if (this.f.equals(binaryFrame.f) && Arrays.equals(this.a, binaryFrame.a)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.f.hashCode() + 527) * 31 + Arrays.hashCode(this.a);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.f);
        parcel.writeByteArray(this.a);
    }
}
