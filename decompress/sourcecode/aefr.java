import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aefr extends enz implements aefs
{
    public aefr() {
        super("com.google.android.youtube.player.internal.IYouTubeService");
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final aefo aefo = null;
        final aeex aeex = null;
        switch (n) {
            default: {
                return false;
            }
            case 7: {
                this.h();
                break;
            }
            case 6: {
                final String string = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.g(string);
                break;
            }
            case 5: {
                final IBinder strongBinder = parcel.readStrongBinder();
                aeex aeex2;
                if (strongBinder == null) {
                    aeex2 = aeex;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IAuthenticationEventListener");
                    if (queryLocalInterface instanceof aeex) {
                        aeex2 = (aeex)queryLocalInterface;
                    }
                    else {
                        aeex2 = new aeex(strongBinder);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.k(aeex2);
                break;
            }
            case 4: {
                final IBinder e = this.e();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(e);
                break;
            }
            case 3: {
                eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.i();
                parcel2.writeNoException();
                break;
            }
            case 2: {
                final IBinder strongBinder2 = parcel.readStrongBinder();
                aefo aefo2;
                if (strongBinder2 == null) {
                    aefo2 = aefo;
                }
                else {
                    final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                    if (queryLocalInterface2 instanceof aefo) {
                        aefo2 = (aefo)queryLocalInterface2;
                    }
                    else {
                        aefo2 = new aefo(strongBinder2);
                    }
                }
                this.enforceNoDataAvail(parcel);
                final aefq j = this.j(aefo2);
                parcel2.writeNoException();
                eoa.j(parcel2, (IInterface)j);
                break;
            }
            case 1: {
                final IBinder d = this.d();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(d);
                break;
            }
        }
        return true;
    }
}
