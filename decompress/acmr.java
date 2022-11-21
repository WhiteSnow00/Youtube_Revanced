import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class acmr extends thc implements acla
{
    private final acks a;
    
    public acmr() {
        super((List)new ArrayList(), new mtf((byte[])null, (char[])null), (byte[])null, (byte[])null, (byte[])null);
        this.a = new acks();
    }
    
    public final int a() {
        return this.size();
    }
    
    public final void add(final int n, final Object o) {
        tcl.l();
        super.add(n, o);
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        tcl.l();
        return super.addAll(n, collection);
    }
    
    public long b(final int n) {
        return n;
    }
    
    public final Object c(final int n) {
        return this.get(n);
    }
    
    public final void clear() {
        tcl.l();
        super.clear();
    }
    
    public final void g(final ackz ackz) {
        super.c.F((tgz)ackz);
        final Iterator iterator = super.b.iterator();
        while (iterator.hasNext()) {
            accu.c(iterator.next());
        }
    }
    
    public final void h(final int n, final int n2) {
        tcl.l();
        super.h(n, n2);
    }
    
    public final void i(final int n, final int n2) {
        tcl.l();
        tqf.X(n, this.size() - 1);
        tqf.X(n + n2, this.size());
        for (int i = 0; i < n2; ++i) {
            super.b.remove(n);
        }
        super.c.C(n, n2);
    }
    
    public final void k(final Collection collection) {
        collection.addAll(super.b);
    }
    
    public final void l() {
        super.c.G();
    }
    
    public final void m(final afbk afbk) {
        tcl.l();
        afbk.getClass();
        int size = super.b.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            size = n;
            if (!afbk.a(super.b.get(n))) {
                continue;
            }
            super.b.remove(n);
            super.c.D(n);
            size = n;
        }
    }
    
    public final void n(final int n, final Object o) {
        tcl.l();
        adme.K(n < this.size());
        o.getClass();
        super.b.set(n, o);
        super.c.A(n, 1);
    }
    
    public final void nf(final acma acma) {
        this.a.b(acma);
    }
    
    public final void o(final Object o, final Object o2) {
        tcl.l();
        o.getClass();
        o2.getClass();
        final int index = super.b.indexOf(o);
        if (index >= 0) {
            this.n(index, o2);
        }
    }
    
    public final void ok(final aclz aclz, final int n) {
        this.a.a(aclz, (acla)this, n);
    }
    
    public final void p(final Collection collection) {
        tcl.l();
        super.b.clear();
        super.b.addAll(collection);
        this.l();
    }
    
    public /* bridge */ void qO(final ackz ackz) {
        super.j((tgz)ackz);
    }
    
    public final Object remove(final int n) {
        tcl.l();
        return super.remove(n);
    }
}
