import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaxq implements aaxl
{
    private static final afev b;
    public final aawy a;
    private aaxo c;
    
    static {
        b = afev.p(abkb.a, aaxu.a, abkb.b, aaxu.b, abkb.d, aaxu.c, abkb.e, aaxu.d);
    }
    
    public aaxq(final aawy a) {
        this.a = a;
    }
    
    public final aaye a(final aani aani) {
        final aaxu aaxu = (aaxu)aaxq.b.get(aani.c());
        if (aaxu != null) {
            final aiqj d = aani.d();
            final aaxo c = this.c;
            Object c2 = null;
            Label_0143: {
                if (c != null) {
                    if (adkp.ae(c.c(), d)) {
                        if (aaxu != aaxu.a) {
                            if (this.c.b().a(aaxu) && (aaxu == aaxu.c || aaxu == aaxu.d)) {
                                c2 = new aaxn(this, d);
                                break Label_0143;
                            }
                            c2 = this.c;
                            break Label_0143;
                        }
                    }
                }
                final aaxo c3 = this.c;
                if (c3 == null) {
                    c2 = new aaxp(this, d, false);
                }
                else {
                    c2 = c3.a(d);
                }
            }
            if (((aaxo)c2).b() == aaxu.a) {
                ((aaxo)c2).e();
            }
            if (aaxu.a(((aaxo)c2).b())) {
                while (aaxu != ((aaxo)c2).b()) {
                    final Optional d2 = ((aaxo)c2).d(aani);
                    if (!d2.isPresent()) {
                        break;
                    }
                    c2 = d2.get();
                    ((aaxo)c2).e();
                }
                this.c = (aaxo)c2;
            }
        }
        return aaye.a;
    }
    
    public final void b() {
        this.a.m(null);
    }
}
