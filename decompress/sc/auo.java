import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public class auo extends aui
{
    public ru a;
    public auh b;
    private final WeakReference c;
    private int d;
    private boolean e;
    private boolean f;
    private final ArrayList g;
    
    public auo(final aun aun) {
        this.a = new ru();
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = new ArrayList();
        this.c = new WeakReference((T)aun);
        this.b = auh.b;
    }
    
    public static auh d(final auh auh, final auh auh2) {
        if (auh2 != null && auh2.compareTo((Enum)auh) < 0) {
            return auh2;
        }
        return auh;
    }
    
    public static final void g(final String s) {
        if (rs.b().c()) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Method ");
        sb.append(s);
        sb.append(" must be called on the main thread");
        throw new IllegalStateException(sb.toString());
    }
    
    private final auh h(final aum aum) {
        final ru a = this.a;
        final boolean d = a.d((Object)aum);
        auh auh = null;
        rx d2;
        if (d) {
            d2 = a.a.get(aum).d;
        }
        else {
            d2 = null;
        }
        Object b;
        if (d2 != null) {
            b = ((bki)d2.b).b;
        }
        else {
            b = null;
        }
        if (!this.g.isEmpty()) {
            final ArrayList g = this.g;
            auh = (auh)g.get(g.size() - 1);
        }
        return d(d(this.b, (auh)b), auh);
    }
    
    private final void i(final auh b) {
        final auh b2 = this.b;
        if (b2 == b) {
            return;
        }
        if (b2 == auh.b && b == auh.a) {
            final StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(this.b);
            sb.append(" in component ");
            sb.append(this.c.get());
            throw new IllegalStateException(sb.toString());
        }
        this.b = b;
        if (!this.e && this.d == 0) {
            this.e = true;
            this.l();
            this.e = false;
            if (this.b == auh.a) {
                this.a = new ru();
            }
            return;
        }
        this.f = true;
    }
    
    private final void j() {
        final ArrayList g = this.g;
        g.remove(g.size() - 1);
    }
    
    private final void k(final auh auh) {
        this.g.add(auh);
    }
    
    private final void l() {
        final aun aun = (aun)this.c.get();
        if (aun != null) {
            bki bki2 = null;
            Label_0477: {
                bki bki = null;
                Label_0263: {
                    while (true) {
                        final ru a = this.a;
                        if (((sb)a).e == 0) {
                            break;
                        }
                        final Object b = ((bki)((sb)a).b.b).b;
                        final Object b2 = ((bki)((sb)a).c.b).b;
                        if (b == b2 && this.b == b2) {
                            break;
                        }
                        this.f = false;
                        if (this.b.compareTo((Enum)b) < 0) {
                            final ru a2 = this.a;
                            final rw rw = new rw(((sb)a2).c, ((sb)a2).b);
                            ((sb)a2).d.put(rw, false);
                            while (((Iterator)rw).hasNext() && !this.f) {
                                final Map.Entry<K, bki> entry = (Map.Entry<K, bki>)((Iterator)rw).next();
                                bki = entry.getValue();
                                while (((auh)bki.b).compareTo((Enum)this.b) > 0 && !this.f && this.a.d((Object)entry.getKey())) {
                                    final aug a3 = aug.a((auh)bki.b);
                                    if (a3 == null) {
                                        break Label_0263;
                                    }
                                    this.k(a3.d());
                                    bki.c(aun, a3);
                                    this.j();
                                }
                            }
                        }
                        final rx c = ((sb)this.a).c;
                        if (this.f || c == null || this.b.compareTo((Enum)((bki)c.b).b) <= 0) {
                            continue;
                        }
                        final ry f = ((sb)this.a).f();
                        while (((Iterator)f).hasNext() && !this.f) {
                            final rx rx = (rx)f.a();
                            bki2 = (bki)rx.b;
                            while (((auh)bki2.b).compareTo((Enum)this.b) < 0 && !this.f && this.a.d((Object)rx.a)) {
                                this.k((auh)bki2.b);
                                final aug b3 = aug.b((auh)bki2.b);
                                if (b3 == null) {
                                    break Label_0477;
                                }
                                bki2.c(aun, b3);
                                this.j();
                            }
                        }
                    }
                    this.f = false;
                    return;
                }
                final StringBuilder sb = new StringBuilder("no event down from ");
                final Object b4 = bki.b;
                sb.append(b4);
                throw new IllegalStateException("no event down from ".concat(String.valueOf(b4)));
            }
            final StringBuilder sb2 = new StringBuilder("no event up from ");
            final Object b5 = bki2.b;
            sb2.append(b5);
            throw new IllegalStateException("no event up from ".concat(String.valueOf(b5)));
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }
    
    public final auh a() {
        return this.b;
    }
    
    public final void b(final aum aum) {
        g("addObserver");
        auh auh;
        if (this.b == auh.a) {
            auh = auh.a;
        }
        else {
            auh = auh.b;
        }
        final bki bki = new bki(aum, auh);
        if (((sb)this.a).b((Object)aum, (Object)bki) != null) {
            return;
        }
        final aun aun = (aun)this.c.get();
        if (aun == null) {
            return;
        }
        final boolean b = this.d != 0 || this.e;
        auh auh2 = this.h(aum);
        ++this.d;
        while (((auh)bki.b).compareTo((Enum)auh2) < 0 && this.a.d((Object)aum)) {
            this.k((auh)bki.b);
            final aug b2 = aug.b((auh)bki.b);
            if (b2 == null) {
                final StringBuilder sb = new StringBuilder("no event up from ");
                final Object b3 = bki.b;
                sb.append(b3);
                throw new IllegalStateException("no event up from ".concat(String.valueOf(b3)));
            }
            bki.c(aun, b2);
            this.j();
            auh2 = this.h(aum);
        }
        if (!b) {
            this.l();
        }
        --this.d;
    }
    
    public final void c(final aum aum) {
        g("removeObserver");
        ((sb)this.a).c((Object)aum);
    }
    
    public void e(final aug aug) {
        g("handleLifecycleEvent");
        this.i(aug.d());
    }
    
    public final void f(final auh auh) {
        g("setCurrentState");
        this.i(auh);
    }
}
