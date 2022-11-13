import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardr extends enz implements ardt
{
    public ardr(final IBinder binder) {
        super(binder, "com.google.vr.vrcore.library.api.IGvrLayout");
    }
    
    public final boolean enableAsyncReprojection(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        final Parcel qx = this.qX(9, qw);
        final boolean k = eob.k(qx);
        qx.recycle();
        return k;
    }
    
    public final boolean enableCardboardTriggerEmulation(final ardz ardz) {
        throw null;
    }
    
    public final long getNativeGvrContext() {
        final Parcel qx = this.qX(2, this.qW());
        final long long1 = qx.readLong();
        qx.recycle();
        return long1;
    }
    
    public final ardz getRootView() {
        final Parcel qx = this.qX(3, this.qW());
        final IBinder strongBinder = qx.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
            if (queryLocalInterface instanceof ardz) {
                o = queryLocalInterface;
            }
            else {
                o = new ardx(strongBinder);
            }
        }
        qx.recycle();
        return (ardz)o;
    }
    
    public final ardw getUiLayout() {
        final Parcel qx = this.qX(4, this.qW());
        final ardw interface1 = ardv.asInterface(qx.readStrongBinder());
        qx.recycle();
        return interface1;
    }
    
    public final void onBackPressed() {
        throw null;
    }
    
    public final void onPause() {
        this.qY(5, this.qW());
    }
    
    public final void onResume() {
        this.qY(6, this.qW());
    }
    
    public final boolean setOnDonNotNeededListener(final ardz ardz) {
        throw null;
    }
    
    public final void setPresentationView(final ardz ardz) {
        final Parcel qw = this.qW();
        eob.j(qw, (IInterface)ardz);
        this.qY(8, qw);
    }
    
    public final void setReentryIntent(final ardz ardz) {
        throw null;
    }
    
    public final void setStereoModeEnabled(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(11, qw);
    }
    
    public final void shutdown() {
        this.qY(7, this.qW());
    }
}
