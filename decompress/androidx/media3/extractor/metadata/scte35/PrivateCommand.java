// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class PrivateCommand extends SpliceCommand
{
    public static final Parcelable$Creator CREATOR;
    public final long a;
    public final long b;
    public final byte[] c;
    
    static {
        CREATOR = (Parcelable$Creator)new bvm(5);
    }
    
    public PrivateCommand(final long b, final byte[] c, final long a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public PrivateCommand(final Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = (byte[])bax.L((Object)parcel.createByteArray());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }
}
