import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelt implements aelv
{
    public final Object a;
    public final Map b;
    private final affr c;
    
    public aelt() {
    }
    
    public aelt(final byte[] array) {
        this.a = new Object();
        this.b = new abg();
        this.c = (affr)afcc.k();
    }
    
    public final void a(final Object o, final aemq aemq) {
        qcj.s();
        final abi abi = new abi();
        final Object a = this.a;
        monitorenter(a);
        try {
            final afie k = afdu.s(o).k();
            while (((Iterator)k).hasNext()) {
                final aelu next = (aelu)((Iterator)k).next();
                final afdl n = afdo.n();
                final afdo afdo = this.b.get(next);
                if (afdo != null) {
                    n.b((Iterable)afdo);
                }
                n.g((Object)aemq);
                this.b.put(next, n.a());
                if (next instanceof aelu) {
                    final aelu aelu = next;
                    if (this.c.a((Object)aelu, 1) != 0) {
                        continue;
                    }
                    abi.add((Object)aelu);
                }
            }
            monitorexit(a);
            final Iterator iterator = abi.iterator();
            while (iterator.hasNext()) {
                ((aelu)iterator.next()).a();
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void b(final Object o, final aemq aemq) {
        qcj.s();
        final abi abi = new abi();
        final Object a = this.a;
        monitorenter(a);
        try {
            final afie k = afdu.s(o).k();
            while (((Iterator)k).hasNext()) {
                final Object next = ((Iterator)k).next();
                final afdo afdo = this.b.get(next);
                final boolean b = false;
                agot.E(afdo != null, (Object)"Failed to remove a subscription key. State is corrupted.");
                final Map b2 = this.b;
                final afdl n = afdo.n();
                n.b((Iterable)afdo);
                final int n2 = afdo.b((Object)aemq) - 1;
                final affz a2 = n.a;
                a2.getClass();
                int n4 = 0;
                Label_0218: {
                    int n3;
                    if ((n3 = n2) == 0) {
                        if (!n.c) {
                            n.a = (affz)new afga(a2);
                            n.c = true;
                            n4 = 0;
                            break Label_0218;
                        }
                        n3 = 0;
                    }
                    n4 = n3;
                    if (n.b) {
                        n.a = new affz(a2);
                        n.c = false;
                        n4 = n3;
                    }
                }
                n.b = false;
                aemq.getClass();
                if (n4 == 0) {
                    n.a.f((Object)aemq, ahbz.ah((Object)aemq));
                }
                else {
                    n.a.o((Object)aemq, n4);
                }
                b2.put(next, n.a());
                if (((afdo)this.b.get(next)).isEmpty()) {
                    this.b.remove(next);
                }
                if (next instanceof aelu) {
                    final aelu aelu = (aelu)next;
                    final int d = this.c.d((Object)aelu, 1);
                    boolean b3 = b;
                    if (d > 0) {
                        b3 = true;
                    }
                    agot.D(b3);
                    if (d != 1) {
                        continue;
                    }
                    abi.add((Object)aelu);
                }
            }
            monitorexit(a);
            final Iterator iterator = abi.iterator();
            while (iterator.hasNext()) {
                ((aelu)iterator.next()).b();
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void c(final ListenableFuture listenableFuture) {
        final afsl a = afsl.a;
        final WeakHashMap a2 = aesw.a;
        afva.w(listenableFuture, aesm.f((afsz)new tcm(this, 6)), (Executor)a);
    }
}
