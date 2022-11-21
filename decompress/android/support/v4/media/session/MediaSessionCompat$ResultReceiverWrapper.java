// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.ResultReceiver;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final ResultReceiver a;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(10);
    }
    
    public MediaSessionCompat$ResultReceiverWrapper(final Parcel parcel) {
        this.a = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        this.a.writeToParcel(parcel, n);
    }
}
