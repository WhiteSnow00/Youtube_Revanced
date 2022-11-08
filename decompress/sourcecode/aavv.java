import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavv implements aavq
{
    private static final afcw b;
    public final aave a;
    private aavt c;
    
    static {
        b = afcw.p((Object)abij.a, (Object)aavy.a, (Object)abij.b, (Object)aavy.b, (Object)abij.d, (Object)aavy.c, (Object)abij.e, (Object)aavy.d);
    }
    
    public aavv(final aave a) {
        this.a = a;
    }
    
    public final aawi a(final aalo aalo) {
        final aavy aavy = (aavy)aavv.b.get((Object)aalo.c());
        if (aavy != null) {
            final aioe d = aalo.d();
            final aavt c = this.c;
            Object c2 = null;
            Label_0143: {
                if (c != null) {
                    if (aeda.v(c.c(), d)) {
                        if (aavy != aavy.a) {
                            if (this.c.b().a(aavy) && (aavy == aavy.c || aavy == aavy.d)) {
                                c2 = new aavs(this, d);
                                break Label_0143;
                            }
                            c2 = this.c;
                            break Label_0143;
                        }
                    }
                }
                final aavt c3 = this.c;
                if (c3 == null) {
                    c2 = new aavu(this, d, false);
                }
                else {
                    c2 = c3.a(d);
                }
            }
            if (((aavt)c2).b() == aavy.a) {
                ((aavt)c2).e();
            }
            if (aavy.a(((aavt)c2).b())) {
                while (aavy != ((aavt)c2).b()) {
                    final Optional d2 = ((aavt)c2).d(aalo);
                    if (!d2.isPresent()) {
                        break;
                    }
                    c2 = d2.get();
                    ((aavt)c2).e();
                }
                this.c = (aavt)c2;
            }
        }
        return aawi.a;
    }
    
    public final void b() {
        this.a.m((aioe)null);
    }
}
