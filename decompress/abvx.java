import j$.util.Optional;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abvx implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final atnb d;
    private final atnb e;
    private final atnb f;
    private final int g;
    
    public abvx(final atnb a, final atnb b, final atnb c, final atnb d, final atnb e, final atnb f, final int g) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public abvx(final atnb b, final atnb e, final atnb c, final atnb d, final atnb a, final atnb f, final int g, final byte[] array) {
        this.g = g;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.f = f;
    }
    
    public abvx(final atnb e, final atnb b, final atnb a, final atnb c, final atnb d, final atnb f, final int g, final char[] array) {
        this.g = g;
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.f = f;
    }
    
    public abvx(final atnb a, final atnb c, final atnb d, final atnb e, final atnb f, final atnb b, final int g, final float[] array) {
        this.g = g;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = b;
    }
    
    public abvx(final atnb f, final atnb b, final atnb a, final atnb e, final atnb d, final atnb c, final int g, final int[] array) {
        this.g = g;
        this.f = f;
        this.b = b;
        this.a = a;
        this.e = e;
        this.d = d;
        this.c = c;
    }
    
    public abvx(final atnb c, final atnb b, final atnb a, final atnb d, final atnb e, final atnb f, final int g, final short[] array) {
        this.g = g;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public abvx(final atnb c, final atnb e, final atnb d, final atnb b, final atnb f, final atnb a, final int g, final boolean[] array) {
        this.g = g;
        this.c = c;
        this.e = e;
        this.d = d;
        this.b = b;
        this.f = f;
        this.a = a;
    }
    
    public abvx(final atnb c, final atnb d, final atnb f, final atnb a, final atnb b, final atnb e, final int g, final byte[][] array) {
        this.g = g;
        this.c = c;
        this.d = d;
        this.f = f;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public static abvx b(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6) {
        return new abvx(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, 0);
    }
    
    public static abwj c(final Context context, final Handler handler, final atnb atnb, final abvv abvv, final atnb atnb2, final atnb atnb3, final abwk abwk) {
        return new abwj(context, handler, atnb, abvv, atnb2, atnb3, abwk);
    }
    
    public static adil d(final atnb atnb, final atnb atnb2, final atnb atnb3, final oco oco, final atnb atnb4) {
        return new adil(atnb, atnb2, atnb3, oco, atnb4);
    }
    
    public static abvx e(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6) {
        return new abvx(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, 1, (byte[])null);
    }
    
    public static abvx f(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6) {
        return new abvx(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, 2, (char[])null);
    }
    
    public static abvx g(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6) {
        return new abvx(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, 3, (short[])null);
    }
    
    public static abvx h(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6) {
        return new abvx(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, 4, (int[])null);
    }
    
    public static abvx i(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6) {
        return new abvx(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, 5, (boolean[])null);
    }
    
    public static abvx j(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6) {
        return new abvx(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, 6, (float[])null);
    }
    
    public static abvx k(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6) {
        return new abvx(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, 7, (byte[][])null);
    }
    
    public static abtd l(final zoa zoa, final adhh adhh, final absz absz, final vbo vbo, final oco oco, final atnb atnb) {
        return new abtd(zoa, adhh, absz, vbo, oco, atnb, null, null, null);
    }
    
    public static acae m(final adfa adfa, final Executor executor, final atnb atnb, final atnb atnb2, final wza wza, final absv absv) {
        return new acae(adfa, executor, atnb, atnb2, wza, absv, (byte[])null, (byte[])null, (byte[])null);
    }
    
    @Override
    public final Object a() {
        switch (this.g) {
            default: {
                final atnb c = this.c;
                final atnb d = this.d;
                final atnb f = this.f;
                final oco oco = (oco)this.a.a();
                final atnb b = this.b;
                final tov tov = (tov)this.e.a();
                return d(c, d, f, oco, b);
            }
            case 6: {
                return new acjd((Context)((aron)this.a).a, this.c, this.d, this.e, this.f, (afbh)((aron)this.b).a);
            }
            case 5: {
                return new aciy((Context)((aron)this.c).a, (Executor)this.e.a(), this.d, this.b, this.f, (Optional)((aron)this.a).a);
            }
            case 4: {
                return m(((aalr)this.f).c(), (Executor)this.b.a(), this.a, this.e, (wza)this.d.a(), (absv)this.c.a());
            }
            case 3: {
                return new agmq((thg)this.c.a(), ((aror)this.b).c(), (auna)this.a.a(), (auna)this.d.a(), (auna)this.e.a(), (auna)this.f.a());
            }
            case 2: {
                return c((Context)((aron)this.e).a, (Handler)this.b.a(), this.a, (abvv)this.c.a(), this.d, this.f, (abwk)abrh.k());
            }
            case 1: {
                return l((zoa)this.b.a(), (adhh)this.e.a(), ((abta)this.c).b(), (vbo)this.d.a(), (oco)this.a.a(), this.f);
            }
            case 0: {
                return new abvw((Context)((aron)this.a).a, this.b, this.c, (absv)this.d.a(), (Executor)this.e.a(), (Executor)this.f.a(), null);
            }
        }
    }
}
