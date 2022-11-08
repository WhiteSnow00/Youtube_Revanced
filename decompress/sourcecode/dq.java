import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.view.KeyEvent;
import java.util.List;
import android.net.Uri;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Parcelable;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.os.Parcel;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.os.IInterface;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dq extends Binder implements dr
{
    final /* synthetic */ eb a;
    
    public dq() {
        this.attachInterface((IInterface)this, "android.support.v4.media.session.IMediaSession");
    }
    
    public dq(final eb a) {
        this.a = a;
        this.attachInterface((IInterface)this, "android.support.v4.media.session.IMediaSession");
    }
    
    public final PlaybackStateCompat a() {
        final eb a = this.a;
        final PlaybackStateCompat f = a.f;
        final MediaMetadataCompat g = a.g;
        PlaybackStateCompat a2 = f;
        if (f != null) {
            final long b = f.b;
            final long n = -1L;
            if (b == -1L) {
                a2 = f;
            }
            else {
                final int a3 = f.a;
                if (a3 != 3 && a3 != 4) {
                    a2 = f;
                    if (a3 != 5) {
                        return a2;
                    }
                }
                final long h = f.h;
                a2 = f;
                if (h > 0L) {
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    final long n2 = (long)(f.d * (elapsedRealtime - h)) + f.b;
                    long a4 = n;
                    if (g != null) {
                        a4 = n;
                        if (g.b.containsKey("android.media.metadata.DURATION")) {
                            a4 = g.a("android.media.metadata.DURATION");
                        }
                    }
                    if (a4 < 0L || n2 <= a4) {
                        if (n2 < 0L) {
                            a4 = 0L;
                        }
                        else {
                            a4 = n2;
                        }
                    }
                    final ej ej = new ej(f);
                    ej.c(f.a, a4, f.d, elapsedRealtime);
                    a2 = ej.a();
                }
            }
        }
        return a2;
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final void b(final do do1) {
        if (this.a.d) {
            return;
        }
        this.a.e.register((IInterface)do1, (Object)new axd("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (this.a.c) {
            monitorexit(this.a.c);
        }
    }
    
    public final void c(final do do1) {
        this.a.e.unregister((IInterface)do1);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (this.a.c) {
            monitorexit(this.a.c);
        }
    }
    
    public final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n > 0 && n <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (n != 1598968902) {
            final do do1 = null;
            final do do2 = null;
            switch (n) {
                default: {
                    return super.onTransact(n, parcel, parcel2, n2);
                }
                case 51: {
                    final RatingCompat ratingCompat = (RatingCompat)dl.l(parcel, RatingCompat.CREATOR);
                    final Bundle bundle = (Bundle)dl.l(parcel, Bundle.CREATOR);
                    throw new AssertionError();
                }
                case 50: {
                    parcel2.writeNoException();
                    dl.m(parcel2, (Parcelable)null);
                    break;
                }
                case 49: {
                    parcel.readFloat();
                    throw new AssertionError();
                }
                case 48: {
                    parcel.readInt();
                    throw new AssertionError();
                }
                case 47: {
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    break;
                }
                case 46: {
                    parcel.readInt();
                    throw new AssertionError();
                }
                case 45: {
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    break;
                }
                case 44: {
                    parcel.readInt();
                    throw new AssertionError();
                }
                case 43: {
                    final MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat)dl.l(parcel, MediaDescriptionCompat.CREATOR);
                    throw new AssertionError();
                }
                case 42: {
                    final MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat)dl.l(parcel, MediaDescriptionCompat.CREATOR);
                    parcel.readInt();
                    throw new AssertionError();
                }
                case 41: {
                    final MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat)dl.l(parcel, MediaDescriptionCompat.CREATOR);
                    throw new AssertionError();
                }
                case 40: {
                    parcel.readInt();
                    parcel2.writeNoException();
                    break;
                }
                case 39: {
                    parcel.readInt();
                    throw new AssertionError();
                }
                case 38: {
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    break;
                }
                case 37: {
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    break;
                }
                case 36: {
                    final Uri uri = (Uri)dl.l(parcel, Uri.CREATOR);
                    final Bundle bundle2 = (Bundle)dl.l(parcel, Bundle.CREATOR);
                    throw new AssertionError();
                }
                case 35: {
                    parcel.readString();
                    final Bundle bundle3 = (Bundle)dl.l(parcel, Bundle.CREATOR);
                    throw new AssertionError();
                }
                case 34: {
                    parcel.readString();
                    final Bundle bundle4 = (Bundle)dl.l(parcel, Bundle.CREATOR);
                    throw new AssertionError();
                }
                case 33: {
                    throw new AssertionError();
                }
                case 32: {
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    break;
                }
                case 31: {
                    throw new AssertionError();
                }
                case 30: {
                    throw new AssertionError();
                }
                case 29: {
                    parcel2.writeNoException();
                    parcel2.writeTypedList((List)null);
                    break;
                }
                case 28: {
                    final PlaybackStateCompat a = this.a();
                    parcel2.writeNoException();
                    dl.m(parcel2, (Parcelable)a);
                    break;
                }
                case 27: {
                    throw new AssertionError();
                }
                case 26: {
                    parcel.readString();
                    final Bundle bundle5 = (Bundle)dl.l(parcel, Bundle.CREATOR);
                    throw new AssertionError();
                }
                case 25: {
                    final RatingCompat ratingCompat2 = (RatingCompat)dl.l(parcel, RatingCompat.CREATOR);
                    throw new AssertionError();
                }
                case 24: {
                    parcel.readLong();
                    throw new AssertionError();
                }
                case 23: {
                    throw new AssertionError();
                }
                case 22: {
                    throw new AssertionError();
                }
                case 21: {
                    throw new AssertionError();
                }
                case 20: {
                    throw new AssertionError();
                }
                case 19: {
                    throw new AssertionError();
                }
                case 18: {
                    throw new AssertionError();
                }
                case 17: {
                    parcel.readLong();
                    throw new AssertionError();
                }
                case 16: {
                    final Uri uri2 = (Uri)dl.l(parcel, Uri.CREATOR);
                    final Bundle bundle6 = (Bundle)dl.l(parcel, Bundle.CREATOR);
                    throw new AssertionError();
                }
                case 15: {
                    parcel.readString();
                    final Bundle bundle7 = (Bundle)dl.l(parcel, Bundle.CREATOR);
                    throw new AssertionError();
                }
                case 14: {
                    parcel.readString();
                    final Bundle bundle8 = (Bundle)dl.l(parcel, Bundle.CREATOR);
                    throw new AssertionError();
                }
                case 13: {
                    throw new AssertionError();
                }
                case 12: {
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readString();
                    throw new AssertionError();
                }
                case 11: {
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readString();
                    throw new AssertionError();
                }
                case 10: {
                    throw new AssertionError();
                }
                case 9: {
                    throw new AssertionError();
                }
                case 8: {
                    throw new AssertionError();
                }
                case 7: {
                    throw new AssertionError();
                }
                case 6: {
                    throw new AssertionError();
                }
                case 5: {
                    throw new AssertionError();
                }
                case 4: {
                    final IBinder strongBinder = parcel.readStrongBinder();
                    Object o;
                    if (strongBinder == null) {
                        o = do2;
                    }
                    else {
                        final IInterface queryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (queryLocalInterface != null && queryLocalInterface instanceof do) {
                            o = queryLocalInterface;
                        }
                        else {
                            o = new dm(strongBinder);
                        }
                    }
                    this.c((do)o);
                    parcel2.writeNoException();
                    break;
                }
                case 3: {
                    final IBinder strongBinder2 = parcel.readStrongBinder();
                    Object o2;
                    if (strongBinder2 == null) {
                        o2 = do1;
                    }
                    else {
                        final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (queryLocalInterface2 != null && queryLocalInterface2 instanceof do) {
                            o2 = queryLocalInterface2;
                        }
                        else {
                            o2 = new dm(strongBinder2);
                        }
                    }
                    this.b((do)o2);
                    parcel2.writeNoException();
                    break;
                }
                case 2: {
                    final KeyEvent keyEvent = (KeyEvent)dl.l(parcel, KeyEvent.CREATOR);
                    throw new AssertionError();
                }
                case 1: {
                    parcel.readString();
                    final Bundle bundle9 = (Bundle)dl.l(parcel, Bundle.CREATOR);
                    final MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = (MediaSessionCompat$ResultReceiverWrapper)dl.l(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR);
                    throw new AssertionError();
                }
            }
            return true;
        }
        parcel2.writeString("android.support.v4.media.session.IMediaSession");
        return true;
    }
}
