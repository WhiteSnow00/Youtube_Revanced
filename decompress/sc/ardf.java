import android.os.IInterface;
import android.os.Bundle;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import android.content.ComponentName;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardf extends enz implements ardg
{
    public ardf(final IBinder binder) {
        super(binder, "com.google.vr.vrcore.common.api.IDaydreamManager");
    }
    
    public final int a(final ComponentName componentName, final HeadTrackingState headTrackingState) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)componentName);
        final Parcel qx = this.qX(3, qw);
        final int int1 = qx.readInt();
        if (qx.readInt() != 0) {
            headTrackingState.b(qx);
        }
        qx.recycle();
        return int1;
    }
    
    public final int b(final ComponentName componentName, int int1, final PendingIntent pendingIntent, final HeadTrackingState headTrackingState) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)componentName);
        qw.writeInt(int1);
        eob.h(qw, (Parcelable)pendingIntent);
        final Parcel qx = this.qX(13, qw);
        int1 = qx.readInt();
        if (qx.readInt() != 0) {
            headTrackingState.b(qx);
        }
        qx.recycle();
        return int1;
    }
    
    public final int g(final Bundle bundle, final HeadTrackingState headTrackingState) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)bundle);
        final Parcel qx = this.qX(16, qw);
        final int int1 = qx.readInt();
        if (qx.readInt() != 0) {
            headTrackingState.b(qx);
        }
        qx.recycle();
        return int1;
    }
    
    public final void h() {
        this.qZ(14, this.qW());
    }
    
    public final void i(final PendingIntent pendingIntent) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)pendingIntent);
        this.qZ(5, qw);
    }
    
    public final void j() {
        this.qZ(6, this.qW());
    }
    
    public final boolean k(final PendingIntent pendingIntent) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)pendingIntent);
        final Parcel qx = this.qX(10, qw);
        final boolean k = eob.k(qx);
        qx.recycle();
        return k;
    }
    
    public final boolean l(final Bundle bundle) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)bundle);
        final Parcel qx = this.qX(17, qw);
        final boolean k = eob.k(qx);
        qx.recycle();
        return k;
    }
    
    public final boolean m() {
        final Parcel qx = this.qX(8, this.qW());
        final boolean k = eob.k(qx);
        qx.recycle();
        return k;
    }
    
    public final boolean n(final ardi ardi) {
        final Parcel qw = this.qW();
        eob.j(qw, (IInterface)ardi);
        final Parcel qx = this.qX(9, qw);
        final boolean k = eob.k(qx);
        qx.recycle();
        return k;
    }
    
    public final void o(final PendingIntent pendingIntent, final ComponentName componentName) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)pendingIntent);
        eob.h(qw, (Parcelable)componentName);
        final Parcel qx = this.qX(7, qw);
        eob.k(qx);
        qx.recycle();
    }
    
    public final void p(final ComponentName componentName, final arde arde) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)componentName);
        eob.j(qw, (IInterface)arde);
        final Parcel qx = this.qX(1, qw);
        eob.k(qx);
        qx.recycle();
    }
    
    public final void q(final ComponentName componentName) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)componentName);
        final Parcel qx = this.qX(2, qw);
        eob.k(qx);
        qx.recycle();
    }
}
