import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aefb extends enz implements aefc
{
    public aefb() {
        super("com.google.android.youtube.player.internal.IEmbedFragmentFactory");
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return false;
                }
                this.c();
                parcel2.writeNoException();
            }
            else {
                final IBinder strongBinder = parcel.readStrongBinder();
                this.enforceNoDataAvail(parcel);
                final aefa b = this.b(strongBinder);
                parcel2.writeNoException();
                eoa.j(parcel2, (IInterface)b);
            }
        }
        else {
            final IBinder strongBinder2 = parcel.readStrongBinder();
            this.enforceNoDataAvail(parcel);
            final aefa a = this.a(strongBinder2);
            parcel2.writeNoException();
            eoa.j(parcel2, (IInterface)a);
        }
        return true;
    }
}
