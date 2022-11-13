import java.util.function.Consumer;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaxj implements aaxl
{
    private static final afev c;
    public final aawy a;
    public aaxg b;
    
    static {
        c = afev.p(abkb.a, aaxu.a, abkb.b, aaxu.b, abkb.d, aaxu.c, abkb.e, aaxu.d);
    }
    
    public aaxj(final aawy a) {
        this.a = a;
    }
    
    @Override
    public final aaye a(final aani aani) {
        final aaxu aaxu = (aaxu)aaxj.c.get(aani.c());
        if (aaxu == null) {
            final aaxg b = this.b;
            if (b == null) {
                return aaye.a;
            }
            return b.b();
        }
        else {
            final aiqj d = aani.d();
            final aaxg b2 = this.b;
            Optional optional = null;
            Label_0201: {
                if (b2 != null) {
                    if (adkp.ae((Object)b2.c(), (Object)d)) {
                        if (aaxu != aaxu.a) {
                            if (this.b.a().a(aaxu) && (aaxu == aaxu.c || aaxu == aaxu.d)) {
                                optional = Optional.of((Object)new aaxd((xag)this.b.b().a().orElse((Object)null), aani.b(), d, 1));
                                break Label_0201;
                            }
                            optional = this.b.d(aani);
                            break Label_0201;
                        }
                    }
                }
                final aaxg b3 = this.b;
                aaxd e;
                if (b3 == null) {
                    e = new aaxd(null, (aiqj)null, d, 2);
                }
                else {
                    e = b3.e(d);
                }
                optional = Optional.of((Object)e);
            }
            if (optional.isPresent()) {
                final aaxf aaxf = (aaxf)optional.get();
                if (aaxu.a(aaxf.b())) {
                    aaxg b4;
                    Optional d2;
                    for (b4 = aaxf.a(this.a); aaxu != b4.a(); b4 = ((aaxf)d2.get()).a(this.a)) {
                        d2 = b4.d(aani);
                        if (!d2.isPresent()) {
                            break;
                        }
                    }
                    this.b = b4;
                }
            }
            final aaxg b5 = this.b;
            if (b5 == null) {
                return aaye.a;
            }
            return b5.b();
        }
    }
    
    @Override
    public final void b() {
        final aaxg b = this.b;
        if (b != null) {
            b.b().a().ifPresent((Consumer)new aaxy(this, 1));
        }
    }
}
