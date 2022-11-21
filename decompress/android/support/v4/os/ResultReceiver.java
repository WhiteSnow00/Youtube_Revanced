// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.os;

import android.os.RemoteException;
import android.os.Bundle;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ResultReceiver implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    em a;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(15);
    }
    
    public ResultReceiver(final Parcel parcel) {
        final IBinder strongBinder = parcel.readStrongBinder();
        Object a;
        if (strongBinder == null) {
            a = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && queryLocalInterface instanceof em) {
                a = queryLocalInterface;
            }
            else {
                a = new ek(strongBinder);
            }
        }
        this.a = (em)a;
    }
    
    public void a() {
    }
    
    public final void b(final int n, final Bundle bundle) {
        final em a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.a(n, bundle);
        }
        catch (final RemoteException ex) {}
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        synchronized (this) {
            if (this.a == null) {
                this.a = (em)new el(this);
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}
