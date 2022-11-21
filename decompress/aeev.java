import android.os.IInterface;
import java.util.Iterator;
import android.os.RemoteException;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeev extends aeeo
{
    final IBinder a;
    final udw b;
    
    public aeev(final udw b, final IBinder a, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final aeex aeex = (aeex)this.b.a;
        aeex.k = (IInterface)aeex.g.a(this.a);
        final Object a = this.b.a;
        try {
            ((aeex)a).k.asBinder().linkToDeath(((aeex)a).i, 0);
        }
        catch (final RemoteException ex) {
            ((aeex)a).l.i((Throwable)ex, "linkToDeath failed", new Object[0]);
        }
        aeex.e((aeex)this.b.a);
        final Iterator iterator = ((aeex)this.b.a).b.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
        ((aeex)this.b.a).b.clear();
    }
}
