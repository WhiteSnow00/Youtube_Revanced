import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aape implements abps, tgg
{
    private anda a;
    private abwa b;
    private final adet c;
    
    public aape(final adet c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = null;
        this.b = (abwa)abwg.a;
        this.c = c;
    }
    
    public final void a(final aans aans) {
        if (aans.c().h()) {
            return;
        }
        final PlayerResponseModel b = aans.b();
        final abwa abwa = null;
        anda a;
        if (b != null && aans.b().m() != null) {
            if ((a = aans.b().m().c.h) == null) {
                a = anda.a;
            }
        }
        else {
            a = null;
        }
        abwa e;
        if (aans.d() == null) {
            e = abwa;
        }
        else {
            e = aans.d().e();
        }
        Object a2 = e;
        if (e == null) {
            a2 = abwg.a;
        }
        if (adkp.ae((Object)this.a, (Object)a) && adkp.ae((Object)this.b, a2)) {
            return;
        }
        this.a = a;
        this.b.l((Class)aapd.class);
        this.b = (abwa)a2;
        final anda a3 = this.a;
        if (a3 != null) {
            final float b2 = a3.b;
            if (b2 != 0.0f) {
                ((abwa)a2).e((abvy)new aapd((long)(b2 * 1000.0f), ((aajn)this.c.a).c()));
            }
        }
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 8L)).j(aale.q(1)).an((asjm)new aaoe(this, 16), (asjm)aaof.e) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            this.a((aans)o);
            array = null;
        }
        else {
            array = new Class[] { aans.class };
        }
        return array;
    }
}
