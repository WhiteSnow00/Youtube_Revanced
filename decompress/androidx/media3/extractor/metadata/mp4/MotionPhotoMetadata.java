// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.media3.common.Metadata$Entry;

public final class MotionPhotoMetadata implements Metadata$Entry
{
    public static final Parcelable$Creator CREATOR;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    
    static {
        CREATOR = (Parcelable$Creator)new bvl(3);
    }
    
    public MotionPhotoMetadata(final long a, final long b, final long c, final long d, final long e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public MotionPhotoMetadata(final Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
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
                final MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata)o;
                if (this.a == motionPhotoMetadata.a && this.b == motionPhotoMetadata.b && this.c == motionPhotoMetadata.c && this.d == motionPhotoMetadata.d && this.e == motionPhotoMetadata.e) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((afva.B(this.a) + 527) * 31 + afva.B(this.b)) * 31 + afva.B(this.c)) * 31 + afva.B(this.d)) * 31 + afva.B(this.e);
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final long e = this.e;
        final StringBuilder sb = new StringBuilder("Motion photo metadata: photoStartPosition=");
        sb.append(a);
        sb.append(", photoSize=");
        sb.append(b);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(c);
        sb.append(", videoStartPosition=");
        sb.append(d);
        sb.append(", videoSize=");
        sb.append(e);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }
}
