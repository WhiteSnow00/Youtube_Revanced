import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.text.TextUtils;
import android.os.Parcel;
import android.support.v4.media.session.ParcelableVolumeInfo;
import java.util.List;
import android.support.v4.media.MediaMetadataCompat;
import android.os.IBinder;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.os.IInterface;
import java.lang.ref.WeakReference;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public class dn extends Binder implements do
{
    private final WeakReference a;
    
    public dn(final du du) {
        this.attachInterface((IInterface)this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference((T)du);
    }
    
    public final void a(final PlaybackStateCompat playbackStateCompat) {
        final du du = (du)this.a.get();
        if (du != null) {
            du.d(2, (Object)playbackStateCompat, (Bundle)null);
        }
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public void b(final Bundle bundle) {
        final du du = (du)this.a.get();
        if (du != null) {
            du.d(7, (Object)bundle, (Bundle)null);
        }
    }
    
    public void c(final MediaMetadataCompat mediaMetadataCompat) {
        final du du = (du)this.a.get();
        if (du != null) {
            du.d(3, (Object)mediaMetadataCompat, (Bundle)null);
        }
    }
    
    public void d(final List list) {
        final du du = (du)this.a.get();
        if (du != null) {
            du.d(5, (Object)list, (Bundle)null);
        }
    }
    
    public void e(final CharSequence charSequence) {
        final du du = (du)this.a.get();
        if (du != null) {
            du.d(6, (Object)charSequence, (Bundle)null);
        }
    }
    
    public void f() {
        final du du = (du)this.a.get();
        if (du != null) {
            du.d(8, (Object)null, (Bundle)null);
        }
    }
    
    public void g(final ParcelableVolumeInfo parcelableVolumeInfo) {
        final du du = (du)this.a.get();
        if (du != null) {
            ef ef;
            if (parcelableVolumeInfo != null) {
                ef = new ef(parcelableVolumeInfo.b);
            }
            else {
                ef = null;
            }
            du.d(4, (Object)ef, (Bundle)null);
        }
    }
    
    public final boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n > 0 && n <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (n != 1598968902) {
            switch (n) {
                default: {
                    return super.onTransact(n, parcel, parcel2, n2);
                }
                case 13: {
                    final du du = (du)this.a.get();
                    if (du != null) {
                        du.d(13, (Object)null, (Bundle)null);
                        break;
                    }
                    break;
                }
                case 12: {
                    n = parcel.readInt();
                    final du du2 = (du)this.a.get();
                    if (du2 != null) {
                        du2.d(12, (Object)n, (Bundle)null);
                        break;
                    }
                    break;
                }
                case 11: {
                    final boolean b = parcel.readInt() != 0;
                    final du du3 = (du)this.a.get();
                    if (du3 != null) {
                        du3.d(11, (Object)b, (Bundle)null);
                        break;
                    }
                    break;
                }
                case 10: {
                    parcel.readInt();
                    break;
                }
                case 9: {
                    n = parcel.readInt();
                    final du du4 = (du)this.a.get();
                    if (du4 != null) {
                        du4.d(9, (Object)n, (Bundle)null);
                        break;
                    }
                    break;
                }
                case 8: {
                    this.g((ParcelableVolumeInfo)dk.c(parcel, ParcelableVolumeInfo.CREATOR));
                    break;
                }
                case 7: {
                    this.b((Bundle)dk.c(parcel, Bundle.CREATOR));
                    break;
                }
                case 6: {
                    this.e((CharSequence)dk.c(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    break;
                }
                case 5: {
                    this.d(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                    break;
                }
                case 4: {
                    this.c((MediaMetadataCompat)dk.c(parcel, MediaMetadataCompat.CREATOR));
                    break;
                }
                case 3: {
                    this.a((PlaybackStateCompat)dk.c(parcel, PlaybackStateCompat.CREATOR));
                    break;
                }
                case 2: {
                    this.f();
                    break;
                }
                case 1: {
                    final String string = parcel.readString();
                    final Bundle bundle = (Bundle)dk.c(parcel, Bundle.CREATOR);
                    final du du5 = (du)this.a.get();
                    if (du5 != null) {
                        du5.d(1, (Object)string, bundle);
                        break;
                    }
                    break;
                }
            }
            return true;
        }
        parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
        return true;
    }
}
