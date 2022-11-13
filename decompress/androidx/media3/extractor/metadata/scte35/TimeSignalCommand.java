// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class TimeSignalCommand extends SpliceCommand
{
    public static final Parcelable$Creator CREATOR;
    public final long a;
    public final long b;
    
    static {
        CREATOR = (Parcelable$Creator)new bvm(9);
    }
    
    public TimeSignalCommand(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public static long d(final bas bas, final long n) {
        final long n2 = bas.i();
        if ((0x80L & n2) != 0x0L) {
            return 0x1FFFFFFFFL & ((n2 & 0x1L) << 32 | bas.q()) + n;
        }
        return -9223372036854775807L;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
