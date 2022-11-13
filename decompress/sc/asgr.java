import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asgr implements arvt
{
    final arvr a;
    final arvu b;
    private final int c;
    
    public asgr(final asef b, final arvr a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public asgr(final asgv b, final arvr a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a(final arul a) {
        final int c = this.c;
        boolean b = true;
        if (c == 0) {
            final arvu b2 = this.b;
            final arvr a2 = this.a;
            final asgv asgv = (asgv)b2;
            final Map d = asgv.d;
            final arzi arzi = (arzi)a2;
            arzi.i.n.c();
            adkp.R(arzi.g, (Object)"not started");
            final List e = arzi.e;
            if (e.size() != 1) {
                b = false;
            }
            adkp.T(b, "%s does not have exactly one group", (Object)e);
            if (d.get(asgv.e((arus)e.get(0))) == a2) {
                final aruk a3 = a.a;
                if (a3 == aruk.c || a3 == aruk.d) {
                    asgv.c.c();
                }
                if (a.a == aruk.d) {
                    a2.c();
                }
                final acqb h = asgv.h(a2);
                if (!((arul)h.a).a.equals((Object)aruk.c) || (!a.a.equals((Object)aruk.a) && !a.a.equals((Object)aruk.d))) {
                    h.a = a;
                    asgv.g();
                }
            }
            return;
        }
        final arvu b3 = this.b;
        final arvr a4 = this.a;
        final aruk a5 = a.a;
        if (a5 == aruk.e) {
            return;
        }
        if (a5 == aruk.c || a5 == aruk.d) {
            ((asef)b3).b.c();
        }
        final int ordinal = a5.ordinal();
        arvs arvs;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("Unsupported state:".concat(a5.toString()));
                    }
                    arvs = new asee((asef)b3, a4);
                }
                else {
                    arvs = new asec(arvo.b(a.b));
                }
            }
            else {
                arvs = new asec(arvo.c(a4));
            }
        }
        else {
            arvs = new asec(arvo.a);
        }
        ((asef)b3).b.d(a5, arvs);
    }
}
