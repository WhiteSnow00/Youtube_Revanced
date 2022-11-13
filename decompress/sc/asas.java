import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class asas extends asap
{
    final asaw a;
    
    public asas(final asax asax, final asaw a) {
        this.a = a;
        super(asax.a);
    }
    
    public final void a() {
        final asaw a = this.a;
        final ArrayList b = new ArrayList();
        while (true) {
            monitorenter(a);
            try {
                if (a.b.isEmpty()) {
                    a.b = null;
                    a.a = true;
                    monitorexit(a);
                    return;
                }
                final List b2 = a.b;
                a.b = b;
                monitorexit(a);
                final Iterator iterator = b2.iterator();
                while (iterator.hasNext()) {
                    ((Runnable)iterator.next()).run();
                }
                b2.clear();
            }
            finally {
                monitorexit(a);
                while (true) {}
            }
        }
    }
}
