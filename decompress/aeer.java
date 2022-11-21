import android.content.ServiceConnection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeer extends aeeo
{
    final aeeo a;
    final aeex b;
    
    public aeer(final aeex b, final noj noj, final aeeo a, final byte[] array) {
        this.b = b;
        this.a = a;
        super(noj, null);
    }
    
    public final void a() {
        final aeex b = this.b;
        final aeeo a = this.a;
        if (b.k == null && !b.e) {
            b.b.add(a);
            b.j = (ServiceConnection)new udw(b, 3);
            b.e = true;
            if (!b.a.bindService(b.f, b.j, 1)) {
                b.e = false;
                final Iterator iterator = b.b.iterator();
                while (iterator.hasNext()) {
                    ((aeeo)iterator.next()).b(new aeey());
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
