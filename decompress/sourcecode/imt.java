import java.util.function.Function;
import java.util.function.Predicate;
import j$.util.Optional;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imt extends aafu
{
    public final imy a;
    private final aagp g;
    private final imh h;
    private final uyi i;
    private final qbo j;
    
    public imt(final Activity activity, final zki zki, final zzu zzu, final zkw zkw, final tny tny, final thh thh, final aacf aacf, final aagu aagu, final aagp g, final aagn aagn, final toi toi, final qbo j, final acga acga, final yzf yzf, final aaha aaha, final imh h, final uyi i, final imy a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(activity, zki, zzu, zkw, tny, thh, aacf, aagu, g, aagn, toi, acga, yzf, aaha, (aagc)a, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.j = j;
        this.g = g;
        this.h = h;
        this.i = i;
        this.a = a;
    }
    
    public final int a() {
        return 306;
    }
    
    public final void b(final String s, final aagg aagg) {
        if (!this.i.ay()) {
            super.b(s, aagg);
            return;
        }
        if (aagg.a) {
            tsx.n(s);
            this.g.d((aagw)new aafs(this, s, 1));
            return;
        }
        tsx.n(s);
        this.a.b(s);
        this.e(2132019922);
    }
    
    public final void c(final String s, final aagg aagg) {
        super.c(s, aagg);
        if (!aagg.a) {
            this.j.P(2132018823);
        }
    }
    
    protected final void d(final String s, final amva amva, final wwv wwv, final amqx amqx) {
        byte[] array;
        if ((amva.b & 0x80) != 0x0) {
            array = amva.i.I();
        }
        else {
            array = uyp.b;
        }
        this.h.k(amqx);
        if (this.h.m(amva, amqx)) {
            this.g.f(amva, wwv, (aagz)new aafp(this, amva, wwv, s, array, 1), s);
            return;
        }
        amuv amuv;
        if (this.i.ap()) {
            amuv = (amuv)Optional.ofNullable((Object)amqx).filter((Predicate)ifl.e).map((Function)iem.p).orElse((Object)this.h.v(amuv.a));
            feq.k(Optional.ofNullable((Object)amqx), amuv, amva, wwv, Optional.empty(), Optional.of((Object)s));
        }
        else {
            if (amqx != null && (amqx.b & 0x1) != 0x0) {
                if ((amuv = amuv.b(amqx.c)) == null) {
                    amuv = amuv.a;
                }
            }
            else {
                amuv = this.h.u();
            }
            final zzf a = zzf.a;
            amqw amqw;
            if (amqx != null && (amqx.b & 0x2) != 0x0) {
                if ((amqw = amqw.b(amqx.d)) == null) {
                    amqw = amqw.a;
                }
            }
            else {
                amqw = null;
            }
            aaiw.t(amva, wwv, (String)null, s, amuv, true, a, amqw);
        }
        this.l(s, amuv, zzf.a, array);
    }
    
    public final void e(final int n) {
        final qbo j = this.j;
        ((actx)j.d).n(j.M(n).b());
    }
}
