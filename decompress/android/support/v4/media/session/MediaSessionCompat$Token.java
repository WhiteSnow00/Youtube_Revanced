// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaSessionCompat$Token implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Object a;
    public final Object b;
    public dr c;
    public ckr d;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(11);
    }
    
    public MediaSessionCompat$Token(final Object b, final dr c) {
        this.a = new Object();
        this.b = b;
        this.c = c;
        this.d = null;
    }
    
    public final dr a() {
        synchronized (this.a) {
            return this.c;
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(Object b) {
        if (this == b) {
            return true;
        }
        if (!(b instanceof MediaSessionCompat$Token)) {
            return false;
        }
        final MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token)b;
        b = this.b;
        if (b == null) {
            return mediaSessionCompat$Token.b == null;
        }
        final Object b2 = mediaSessionCompat$Token.b;
        return b2 != null && b.equals(b2);
    }
    
    @Override
    public final int hashCode() {
        final Object b = this.b;
        if (b == null) {
            return 0;
        }
        return b.hashCode();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.b, n);
    }
}
