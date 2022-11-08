import android.content.ServiceConnection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeax extends aeau
{
    final /* synthetic */ aeau a;
    final /* synthetic */ aebd b;
    
    public aeax(final aebd b, final nmo nmo, final aeau a, final byte[] array) {
        this.b = b;
        this.a = a;
        super(nmo, (byte[])null);
    }
    
    public final void a() {
        final aebd b = this.b;
        final aeau a = this.a;
        if (b.k == null && !b.e) {
            b.b.add(a);
            b.j = (ServiceConnection)new uao(b, 3);
            b.e = true;
            if (!b.a.bindService(b.f, b.j, 1)) {
                b.e = false;
                final Iterator iterator = b.b.iterator();
                while (iterator.hasNext()) {
                    ((aeau)iterator.next()).b((Exception)new aebe());
                }
                b.b.clear();
            }
            return;
        }
        if (b.e) {
            b.b.add(a);
            return;
        }
        a.run();
    }
}
