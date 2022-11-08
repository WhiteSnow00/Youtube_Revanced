import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbd extends eny implements arbf
{
    public arbd(final IBinder binder) {
        super(binder, "com.google.vr.vrcore.library.api.IGvrLayout");
    }
    
    public final boolean enableAsyncReprojection(final int n) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        final Parcel qr = this.qR(9, qq);
        final boolean k = eoa.k(qr);
        qr.recycle();
        return k;
    }
    
    public final boolean enableCardboardTriggerEmulation(final arbl arbl) {
        throw null;
    }
    
    public final long getNativeGvrContext() {
        final Parcel qr = this.qR(2, this.qQ());
        final long long1 = qr.readLong();
        qr.recycle();
        return long1;
    }
    
    public final arbl getRootView() {
        final Parcel qr = this.qR(3, this.qQ());
        final IBinder strongBinder = qr.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
            if (queryLocalInterface instanceof arbl) {
                o = queryLocalInterface;
            }
            else {
                o = new arbj(strongBinder);
            }
        }
        qr.recycle();
        return (arbl)o;
    }
    
    public final arbi getUiLayout() {
        final Parcel qr = this.qR(4, this.qQ());
        final arbi interface1 = arbh.asInterface(qr.readStrongBinder());
        qr.recycle();
        return interface1;
    }
    
    public final void onBackPressed() {
        throw null;
    }
    
    public final void onPause() {
        this.qS(5, this.qQ());
    }
    
    public final void onResume() {
        this.qS(6, this.qQ());
    }
    
    public final boolean setOnDonNotNeededListener(final arbl arbl) {
        throw null;
    }
    
    public final void setPresentationView(final arbl arbl) {
        final Parcel qq = this.qQ();
        eoa.j(qq, (IInterface)arbl);
        this.qS(8, qq);
    }
    
    public final void setReentryIntent(final arbl arbl) {
        throw null;
    }
    
    public final void setStereoModeEnabled(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(11, qq);
    }
    
    public final void shutdown() {
        this.qS(7, this.qQ());
    }
}
