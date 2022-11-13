import android.os.Parcelable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dau extends enz implements IInterface
{
    public dau(final IBinder binder) {
        super(binder, "com.android.vending.billing.IInAppBillingService");
    }
    
    public final int a(int int1, final String s, final String s2) {
        final Parcel qw = this.qW();
        qw.writeInt(int1);
        qw.writeString(s);
        qw.writeString(s2);
        final Parcel qx = this.qX(1, qw);
        int1 = qx.readInt();
        qx.recycle();
        return int1;
    }
    
    public final int b(int int1, final String s, final String s2, final Bundle bundle) {
        final Parcel qw = this.qW();
        qw.writeInt(int1);
        qw.writeString(s);
        qw.writeString(s2);
        eob.h(qw, (Parcelable)bundle);
        final Parcel qx = this.qX(10, qw);
        int1 = qx.readInt();
        qx.recycle();
        return int1;
    }
}
