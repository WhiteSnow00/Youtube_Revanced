import java.io.File;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abvz implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final atnb d;
    private final int e;
    
    public abvz(final atnb a, final atnb b, final atnb c, final atnb d, final int e) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public abvz(final atnb a, final atnb b, final atnb d, final atnb c, final int e, final byte[] array) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public abvz(final atnb a, final atnb c, final atnb b, final atnb d, final int e, final char[] array) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public abvz(final atnb d, final atnb a, final atnb b, final atnb c, final int e, final int[] array) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public abvz(final atnb c, final atnb a, final atnb d, final atnb b, final int e, final short[] array) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public abvz(final atnb d, final atnb c, final atnb a, final atnb b, final int e, final boolean[] array) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static abvz b(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4) {
        return new abvz(atnb, atnb2, atnb3, atnb4, 0);
    }
    
    public static abvz c(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4) {
        return new abvz(atnb, atnb2, atnb3, atnb4, 1);
    }
    
    public static abvz d(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4) {
        return new abvz(atnb, atnb2, atnb3, atnb4, 2, (byte[])null);
    }
    
    public static abvz e(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4) {
        return new abvz(atnb, atnb2, atnb3, atnb4, 3, (char[])null);
    }
    
    public static abvz f(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4) {
        return new abvz(atnb, atnb2, atnb3, atnb4, 4, (short[])null);
    }
    
    public static abvy g(final abvt abvt, final abnd abnd, final abvw abvw, final thg thg) {
        return new abvy(abvt, abnd, abvw, thg, null);
    }
    
    public static acaf h(final Executor executor, final atnb atnb, final absv absv, final wza wza) {
        return new acaf(executor, atnb, absv, wza, (byte[])null);
    }
    
    public static abzv i(final vmu vmu, final aefs aefs, final zoa zoa, final tkf tkf) {
        return new abzv(vmu, aefs, zoa, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    @Override
    public final Object a() {
        final int e = this.e;
        if (e == 0) {
            final abvy g = g(((aaln)this.a).c(), ((aalk)this.b).c(), (abvw)this.c.a(), (thg)this.d.a());
            g.a();
            return g;
        }
        if (e == 1) {
            return new adfa((auna)this.a.a(), ((abrc)this.b).c(), (abmo)this.c.a(), (agnl)this.d.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
        if (e == 2) {
            return i((vmu)this.a.a(), (aefs)this.b.a(), (zoa)this.d.a(), (tkf)this.c.a());
        }
        if (e == 3) {
            return h((Executor)this.a.a(), this.c, (absv)this.b.a(), (wza)this.d.a());
        }
        if (e == 4) {
            final Executor executor = (Executor)this.c.a();
            final acao acao = (acao)((aron)this.a).a;
            final oco oco = (oco)this.d.a();
            final arzb arzb = (arzb)this.b.a();
            return new acas(executor, acao, oco);
        }
        if (e != 5) {
            return new aegb(((aecx)this.d).b(), (File)this.c.a(), (aefi)this.a.a(), arol.b(this.b));
        }
        return new aefl((aefq)this.d.a(), (aefj)this.a.a(), (aefi)this.b.a(), (aefs)this.c.a());
    }
}
