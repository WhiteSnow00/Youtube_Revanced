// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class VorbisComment extends androidx.media3.extractor.metadata.flac.VorbisComment
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new bvp(10);
    }
    
    public VorbisComment(final Parcel parcel) {
        super(parcel);
    }
    
    public VorbisComment(final String s, final String s2) {
        super(s, s2);
    }
}
