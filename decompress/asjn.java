import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asjn implements aryn
{
    final aryl a;
    final aryo b;
    private final int c;
    
    public asjn(final ashb b, final aryl a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public asjn(final asjr b, final aryl a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final arxf a) {
        final int c = this.c;
        boolean b = true;
        if (c == 0) {
            final aryo b2 = this.b;
            final aryl a2 = this.a;
            final asjr asjr = (asjr)b2;
            final Map d = asjr.d;
            final ascd ascd = (ascd)a2;
            ascd.i.n.c();
            adme.U(ascd.g, "not started");
            final List e = ascd.e;
            if (e.size() != 1) {
                b = false;
            }
            adme.W(b, "%s does not have exactly one group", e);
            if (d.get(asjr.d((arxm)e.get(0))) == a2) {
                final arxe a3 = a.a;
                if (a3 == arxe.c || a3 == arxe.d) {
                    asjr.c.c();
                }
                if (a.a == arxe.d) {
                    a2.c();
                }
                final auoz g = asjr.g(a2);
                if (!((arxf)g.a).a.equals(arxe.c) || (!a.a.equals(arxe.a) && !a.a.equals(arxe.d))) {
                    g.a = a;
                    asjr.f();
                }
            }
            return;
        }
        final aryo b3 = this.b;
        final aryl a4 = this.a;
        final arxe a5 = a.a;
        if (a5 == arxe.e) {
            return;
        }
        if (a5 == arxe.c || a5 == arxe.d) {
            ((ashb)b3).b.c();
        }
        final int ordinal = a5.ordinal();
        arym arym;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("Unsupported state:".concat(a5.toString()));
                    }
                    arym = new asha((ashb)b3, a4);
                }
                else {
                    arym = new asgy(aryi.b(a.b));
                }
            }
            else {
                arym = new asgy(aryi.c(a4));
            }
        }
        else {
            arym = new asgy(aryi.a);
        }
        ((ashb)b3).b.d(a5, arym);
    }
}
