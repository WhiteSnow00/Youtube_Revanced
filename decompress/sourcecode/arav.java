import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arav extends eny implements araw
{
    public arav(final IBinder binder) {
        super(binder, "com.google.vr.vrcore.common.api.IVrCoreSdkService");
    }
    
    public final aras a() {
        final Parcel qr = this.qR(2, this.qQ());
        final IBinder strongBinder = qr.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IDaydreamManager");
            if (queryLocalInterface instanceof aras) {
                o = queryLocalInterface;
            }
            else {
                o = new arar(strongBinder);
            }
        }
        qr.recycle();
        return (aras)o;
    }
    
    public final arbq b() {
        final Parcel qr = this.qR(4, this.qQ());
        final IBinder strongBinder = qr.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
            if (queryLocalInterface instanceof arbq) {
                o = queryLocalInterface;
            }
            else {
                o = new arbp(strongBinder);
            }
        }
        qr.recycle();
        return (arbq)o;
    }
    
    public final boolean g() {
        final Parcel qq = this.qQ();
        qq.writeInt(25);
        final Parcel qr = this.qR(1, qq);
        final boolean k = eoa.k(qr);
        qr.recycle();
        return k;
    }
}
