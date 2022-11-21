import android.os.Parcel;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeda extends aeeo
{
    final String a;
    final aedd b;
    final noj c;
    
    public aeda(final aedd b, final noj noj, final noj c, final String a, final byte[] array) {
        this.b = b;
        this.c = c;
        this.a = a;
        super(noj, null);
    }
    
    @Override
    protected final void a() {
        try {
            final aedd b = this.b;
            final aede aede = (aede)b.a.k;
            final String b2 = b.b;
            final Bundle b3 = aedd.b();
            final aedb aedb = new aedb(this.b, this.c, null);
            final Parcel qv = ((eoc)aede).qV();
            qv.writeString(b2);
            eoe.h(qv, (Parcelable)b3);
            eoe.j(qv, (IInterface)aedb);
            ((eoc)aede).qY(3, qv);
        }
        catch (final RemoteException ex) {
            aedd.d.i((Throwable)ex, "completeUpdate(%s)", this.a);
            this.c.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
