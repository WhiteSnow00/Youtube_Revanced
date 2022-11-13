import android.os.Parcelable$Creator;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.os.ResultReceiver;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class el extends Binder implements em
{
    final ResultReceiver a;
    
    public el() {
        this.attachInterface((IInterface)this, "android.support.v4.os.IResultReceiver");
    }
    
    public el(final ResultReceiver a) {
        this.a = a;
        this.attachInterface((IInterface)this, "android.support.v4.os.IResultReceiver");
    }
    
    public final void a(final int n, final Bundle bundle) {
        this.a.a();
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        if (int1 > 0 && int1 <= 16777215) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
        }
        if (int1 == 1598968902) {
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
        if (int1 != 1) {
            return super.onTransact(int1, parcel, parcel2, n);
        }
        int1 = parcel.readInt();
        final Parcelable$Creator creator = Bundle.CREATOR;
        Object fromParcel;
        if (parcel.readInt() != 0) {
            fromParcel = creator.createFromParcel(parcel);
        }
        else {
            fromParcel = null;
        }
        this.a(int1, (Bundle)fromParcel);
        return true;
    }
}
