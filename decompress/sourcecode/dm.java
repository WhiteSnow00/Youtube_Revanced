import android.os.Parcelable;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

final class dm implements do
{
    private final IBinder a;
    
    public dm(final IBinder a) {
        this.a = a;
    }
    
    public final void a(final PlaybackStateCompat playbackStateCompat) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            ((Parcelable)playbackStateCompat).writeToParcel(obtain, 0);
            this.a.transact(3, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
}
