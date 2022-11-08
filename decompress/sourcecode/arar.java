import com.google.vr.vrcore.base.api.ParcelableProtoLite;
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

public final class arar extends eny implements aras
{
    public arar(final IBinder binder) {
        super(binder, "com.google.vr.vrcore.common.api.IDaydreamManager");
    }
    
    public final int a(final ComponentName componentName, final HeadTrackingState headTrackingState) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)componentName);
        final Parcel qr = this.qR(3, qq);
        final int int1 = qr.readInt();
        if (qr.readInt() != 0) {
            ((ParcelableProtoLite)headTrackingState).b(qr);
        }
        qr.recycle();
        return int1;
    }
    
    public final int b(final ComponentName componentName, int int1, final PendingIntent pendingIntent, final HeadTrackingState headTrackingState) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)componentName);
        qq.writeInt(int1);
        eoa.h(qq, (Parcelable)pendingIntent);
        final Parcel qr = this.qR(13, qq);
        int1 = qr.readInt();
        if (qr.readInt() != 0) {
            ((ParcelableProtoLite)headTrackingState).b(qr);
        }
        qr.recycle();
        return int1;
    }
    
    public final int g(final Bundle bundle, final HeadTrackingState headTrackingState) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)bundle);
        final Parcel qr = this.qR(16, qq);
        final int int1 = qr.readInt();
        if (qr.readInt() != 0) {
            ((ParcelableProtoLite)headTrackingState).b(qr);
        }
        qr.recycle();
        return int1;
    }
    
    public final void h() {
        this.qT(14, this.qQ());
    }
    
    public final void i(final PendingIntent pendingIntent) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)pendingIntent);
        this.qT(5, qq);
    }
    
    public final void j() {
        this.qT(6, this.qQ());
    }
    
    public final boolean k(final PendingIntent pendingIntent) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)pendingIntent);
        final Parcel qr = this.qR(10, qq);
        final boolean k = eoa.k(qr);
        qr.recycle();
        return k;
    }
    
    public final boolean l(final Bundle bundle) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)bundle);
        final Parcel qr = this.qR(17, qq);
        final boolean k = eoa.k(qr);
        qr.recycle();
        return k;
    }
    
    public final boolean m() {
        final Parcel qr = this.qR(8, this.qQ());
        final boolean k = eoa.k(qr);
        qr.recycle();
        return k;
    }
    
    public final boolean n(final arau arau) {
        final Parcel qq = this.qQ();
        eoa.j(qq, (IInterface)arau);
        final Parcel qr = this.qR(9, qq);
        final boolean k = eoa.k(qr);
        qr.recycle();
        return k;
    }
    
    public final void o(final PendingIntent pendingIntent, final ComponentName componentName) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)pendingIntent);
        eoa.h(qq, (Parcelable)componentName);
        final Parcel qr = this.qR(7, qq);
        eoa.k(qr);
        qr.recycle();
    }
    
    public final void p(final ComponentName componentName, final araq araq) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)componentName);
        eoa.j(qq, (IInterface)araq);
        final Parcel qr = this.qR(1, qq);
        eoa.k(qr);
        qr.recycle();
    }
    
    public final void q(final ComponentName componentName) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)componentName);
        final Parcel qr = this.qR(2, qq);
        eoa.k(qr);
        qr.recycle();
    }
}
