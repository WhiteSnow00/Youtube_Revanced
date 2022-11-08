import java.util.Collection;
import java.util.ArrayList;
import io.grpc.Status$Code;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.net.InetSocketAddress;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxq implements arze
{
    public final String a;
    public ascj b;
    public final Object c;
    public final Set d;
    public final Executor e;
    public final int f;
    public final asfk g;
    public boolean h;
    public Status i;
    public boolean j;
    public final aubp k;
    private final arta l;
    private final InetSocketAddress m;
    private final String n;
    private final arrg o;
    private boolean p;
    private boolean q;
    
    public arxq(final aubp k, final InetSocketAddress m, final String n, final String s, final arrg arrg, final Executor e, final int f, final asfk g, final byte[] array, final byte[] array2) {
        this.c = new Object();
        this.d = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
        m.getClass();
        this.m = m;
        this.l = arta.a((Class)this.getClass(), m.toString());
        this.n = n;
        this.a = asap.j(s);
        this.f = f;
        this.e = e;
        this.k = k;
        this.g = g;
        final auls b = arrg.b();
        b.b(asal.a, (Object)arvc.c);
        b.b(asal.b, (Object)arrg);
        this.o = b.a();
    }
    
    public final void a(final arxo arxo, final Status status) {
        synchronized (this.c) {
            if (this.d.remove(arxo)) {
                final Status$Code code = status.getCode();
                final Status$Code b = Status$Code.b;
                boolean b2 = true;
                if (code != b) {
                    b2 = (status.getCode() == Status$Code.e && b2);
                }
                ((arxu)arxo.o).f(status, b2, new arug());
                monitorexit(this.c);
                this.b();
            }
        }
    }
    
    final void b() {
        synchronized (this.c) {
            if (this.h && !this.q && this.d.size() == 0) {
                this.q = true;
                monitorexit(this.c);
                this.b.d();
            }
        }
    }
    
    public final arta c() {
        return this.l;
    }
    
    public final Runnable d(final ascj b) {
        this.b = b;
        synchronized (this.c) {
            this.j = true;
            monitorexit(this.c);
            return (Runnable)new arax(this, 13);
        }
    }
    
    public final void j(final Status i) {
        synchronized (this.c) {
            if (this.h) {
                return;
            }
            monitorexit(this.c);
            Object o = this.c;
            synchronized (this.c) {
                if (this.p) {
                    return;
                }
                this.p = true;
                monitorexit(this.c);
                this.b.c(i);
                o = this.c;
                synchronized (this.c) {
                    this.h = true;
                    this.i = i;
                    monitorexit(this.c);
                    this.b();
                }
            }
        }
    }
    
    public final void k(final Status status) {
        this.j(status);
        final Object c = this.c;
        monitorenter(c);
        try {
            final ArrayList list = new ArrayList(this.d);
            monitorexit(c);
            for (int i = 0; i < list.size(); ++i) {
                ((arxr)list.get(i)).c(status);
            }
            this.b();
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    public final arrg n() {
        return this.o;
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final String string2 = this.m.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("(");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }
}
