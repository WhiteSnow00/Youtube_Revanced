// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class SpliceNullCommand extends SpliceCommand
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new bvp(7);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
    }
}
