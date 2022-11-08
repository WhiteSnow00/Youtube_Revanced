import android.os.IInterface;
import java.util.Iterator;
import android.os.RemoteException;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebb extends aeau
{
    final /* synthetic */ IBinder a;
    final /* synthetic */ uao b;
    
    public aebb(final uao b, final IBinder a, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final aebd aebd = (aebd)this.b.a;
        aebd.k = (IInterface)aebd.g.a(this.a);
        final Object a = this.b.a;
        try {
            ((aebd)a).k.asBinder().linkToDeath(((aebd)a).i, 0);
        }
        catch (final RemoteException ex) {
            ((aebd)a).l.l((Throwable)ex, "linkToDeath failed", new Object[0]);
        }
        aebd.e((aebd)this.b.a);
        final Iterator iterator = ((aebd)this.b.a).b.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
        ((aebd)this.b.a).b.clear();
    }
}
