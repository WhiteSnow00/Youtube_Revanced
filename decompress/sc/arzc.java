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

public final class arzc implements asan
{
    public final String a;
    public asdp b;
    public final Object c;
    public final Set d;
    public final Executor e;
    public final int f;
    public final asfz g;
    public boolean h;
    public Status i;
    public boolean j;
    public final auch k;
    private final arvf l;
    private final InetSocketAddress m;
    private final String n;
    private final artu o;
    private boolean p;
    private boolean q;
    
    public arzc(final auch k, final InetSocketAddress m, final String n, final String s, final artu artu, final Executor e, final int f, final asfz g, final byte[] array, final byte[] array2) {
        this.c = new Object();
        this.d = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
        m.getClass();
        this.m = m;
        this.l = arvf.a((Class)this.getClass(), m.toString());
        this.n = n;
        this.a = asby.j(s);
        this.f = f;
        this.e = e;
        this.k = k;
        this.g = g;
        final aumh b = artu.b();
        b.b(asbu.a, (Object)arxd.c);
        b.b(asbu.b, (Object)artu);
        this.o = b.a();
    }
    
    public final void a(final arza arza, final Status status) {
        synchronized (this.c) {
            if (this.d.remove(arza)) {
                final Status$Code code = status.getCode();
                final Status$Code b = Status$Code.b;
                boolean b2 = true;
                if (code != b) {
                    b2 = (status.getCode() == Status$Code.e && b2);
                }
                arza.o.f(status, b2, new arwk());
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
    
    public final arvf c() {
        return this.l;
    }
    
    public final Runnable d(final asdp b) {
        this.b = b;
        synchronized (this.c) {
            this.j = true;
            monitorexit(this.c);
            return new arcu(this, 13);
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
                ((arzd)list.get(i)).c(status);
            }
            this.b();
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    public final /* bridge */ asac l(final arwo arwo, final arwk arwk, final artx artx, final arva[] array) {
        arwo.getClass();
        final String b = arwo.b;
        final String n = this.n;
        final StringBuilder sb = new StringBuilder("https://");
        sb.append(n);
        sb.append("/".concat(b));
        return (asac)new arzb(this, sb.toString(), arwk, arwo, asfr.m(array), artx).a;
    }
    
    public final artu m() {
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
