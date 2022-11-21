// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final int a;
    private final MediaDescriptionCompat b;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(5);
    }
    
    public MediaBrowserCompat$MediaItem(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MediaItem{mFlags=");
        sb.append(this.a);
        sb.append(", mDescription=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, n);
    }
}
