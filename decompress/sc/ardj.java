import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardj extends enz implements ardk
{
    public ardj(final IBinder binder) {
        super(binder, "com.google.vr.vrcore.common.api.IVrCoreSdkService");
    }
    
    public final ardg a() {
        final Parcel qx = this.qX(2, this.qW());
        final IBinder strongBinder = qx.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IDaydreamManager");
            if (queryLocalInterface instanceof ardg) {
                o = queryLocalInterface;
            }
            else {
                o = new ardf(strongBinder);
            }
        }
        qx.recycle();
        return (ardg)o;
    }
    
    public final aree b() {
        final Parcel qx = this.qX(4, this.qW());
        final IBinder strongBinder = qx.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
            if (queryLocalInterface instanceof aree) {
                o = queryLocalInterface;
            }
            else {
                o = new ared(strongBinder);
            }
        }
        qx.recycle();
        return (aree)o;
    }
    
    public final boolean g() {
        final Parcel qw = this.qW();
        qw.writeInt(25);
        final Parcel qx = this.qX(1, qw);
        final boolean k = eob.k(qx);
        qx.recycle();
        return k;
    }
}
