// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class MlltFrame extends Id3Frame
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int[] e;
    
    static {
        CREATOR = (Parcelable$Creator)new apq(19);
    }
    
    public MlltFrame(final int a, final int b, final int c, final int[] d, final int[] e) {
        super("MLLT");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public MlltFrame(final Parcel parcel) {
        super("MLLT");
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = (int[])baz.L(parcel.createIntArray());
        this.e = (int[])baz.L(parcel.createIntArray());
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final MlltFrame mlltFrame = (MlltFrame)o;
                if (this.a == mlltFrame.a && this.b == mlltFrame.b && this.c == mlltFrame.c && Arrays.equals(this.d, mlltFrame.d) && Arrays.equals(this.e, mlltFrame.e)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return ((((this.a + 527) * 31 + this.b) * 31 + this.c) * 31 + Arrays.hashCode(this.d)) * 31 + Arrays.hashCode(this.e);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
    }
}
