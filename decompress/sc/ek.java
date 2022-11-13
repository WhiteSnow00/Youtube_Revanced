import android.os.Parcelable;
import android.os.Parcel;
import android.os.Bundle;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ek implements em
{
    private final IBinder a;
    
    public ek(final IBinder a) {
        this.a = a;
    }
    
    public final void a(final int n, final Bundle bundle) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
            obtain.writeInt(n);
            if (bundle != null) {
                obtain.writeInt(1);
                ((Parcelable)bundle).writeToParcel(obtain, 0);
            }
            else {
                obtain.writeInt(0);
            }
            this.a.transact(1, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
}
