import java.util.Iterator;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public class aarc extends aasb implements Iterable
{
    private final LinkedList a;
    private final String b;
    private aarz c;
    public boolean d;
    
    public aarc() {
        this.b = this.getClass().getSimpleName();
        this.a = new LinkedList();
        this.d = false;
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }
    
    @Override
    public void k(final float n, final float n2, final float n3) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aarz)iterator.next()).k(n, n2, n3);
        }
    }
    
    public final void m(final aarz aarz) {
        this.n(this.a.size(), aarz);
    }
    
    public final void n(final int n, final aarz aarz) {
        if (this.a.contains(aarz)) {
            final String b = this.b;
            final String simpleName = aarz.getClass().getSimpleName();
            final StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(" NOT adding child - already has been added ");
            sb.append(simpleName);
            ttr.l(sb.toString());
            return;
        }
        aarz.getClass().getSimpleName();
        this.a.add(n, aarz);
        aarz.u(this);
    }
    
    @Override
    public void o(final fon fon) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aarz)iterator.next()).o(fon);
        }
    }
    
    @Override
    public void p(final fon fon) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aarz)iterator.next()).p(fon);
        }
    }
    
    @Override
    public boolean q(final fon fon) {
        if (this.v()) {
            return false;
        }
        for (final aarz aarz : this.a) {
            if (!aarz.v() && aarz.q(fon)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void r(final agkz agkz) {
        if (!this.v()) {
            for (final aarz aarz : this.a) {
                if (!aarz.v()) {
                    aarz.r(agkz);
                }
            }
        }
    }
    
    @Override
    public void rQ() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aarz)iterator.next()).rQ();
        }
    }
    
    @Override
    public void rR(final boolean b, final fon fon) {
        final aarz c = this.c;
        final aarz aarz = null;
        if (c != null) {
            c.rR(false, fon);
            this.c = null;
        }
        if (b) {
            final Iterator iterator = this.a.iterator();
            aarz c2;
            do {
                c2 = aarz;
                if (!iterator.hasNext()) {
                    break;
                }
                c2 = (aarz)iterator.next();
            } while (c2.v() || !c2.q(fon));
            if ((this.c = c2) != null) {
                c2.rR(true, fon);
            }
        }
    }
    
    protected final boolean s() {
        return this.c != null;
    }
}
