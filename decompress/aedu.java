import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aedu extends aeeo
{
    final aedr a;
    final aeeb b;
    final aedw c;
    final noj d;
    
    public aedu(final aedw c, final noj noj, final aedr a, final aeeb b, final noj d, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        super(noj, null);
    }
    
    @Override
    protected final void a() {
        try {
            final aedw c = this.c;
            final aeed aeed = (aeed)c.a.k;
            final aedr a = this.a;
            final String b = c.b;
            final Bundle bundle = new Bundle();
            bundle.putString("sessionToken", a.a);
            bundle.putString("callerPackage", b);
            bundle.putString("appId", a.b);
            final aeee aeee = new aeee(this.c, this.b);
            final Parcel qv = aeed.qV();
            eoe.h(qv, (Parcelable)bundle);
            eoe.j(qv, (IInterface)aeee);
            aeed.qY(2, qv);
        }
        catch (final RemoteException ex) {
            aedw.c.i((Throwable)ex, "dismiss overlay display from: %s", this.c.b);
            this.d.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
