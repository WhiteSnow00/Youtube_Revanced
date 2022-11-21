import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aedv extends aeeo
{
    final aeec a;
    final int b;
    final aeeb c;
    final aedw d;
    final noj e;
    
    public aedv(final aedw d, final noj noj, final aeec a, final int b, final aeeb c, final noj e, final byte[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        super(noj, null);
    }
    
    @Override
    protected final void a() {
        try {
            final aedw d = this.d;
            final aeed aeed = (aeed)d.a.k;
            final aeec a = this.a;
            final String b = d.b;
            final int b2 = this.b;
            final Bundle bundle = new Bundle();
            bundle.putString("sessionToken", a.a);
            bundle.putInt("displayMode", b2);
            bundle.putString("callerPackage", b);
            bundle.putString("appId", a.b);
            final aeee aeee = new aeee(this.d, this.c);
            final Parcel qv = aeed.qV();
            eoe.h(qv, (Parcelable)bundle);
            eoe.j(qv, (IInterface)aeee);
            aeed.qY(3, qv);
        }
        catch (final RemoteException ex) {
            aedw.c.i((Throwable)ex, "switchDisplayMode overlay display to %d from: %s", this.b, this.d.b);
            this.e.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
