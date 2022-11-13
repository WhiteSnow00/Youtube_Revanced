import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aapf implements abps, tgg
{
    public final Executor a;
    public final ziw b;
    public final zmf c;
    public final zpk d;
    public aans e;
    public final aahc f;
    
    public aapf(final Executor a, final aahc f, final ziw b, final zpk d, final zmf c, final byte[] array) {
        this.a = a;
        this.f = f;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public final void a(final aans e) {
        if (e.c().e()) {
            this.e = e;
            return;
        }
        this.e = null;
    }
    
    @Override
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 16L)).j(aale.q(1)).an((asjm)new aaoe(this, 17), (asjm)aaof.f) };
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
