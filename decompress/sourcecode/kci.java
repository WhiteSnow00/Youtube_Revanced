import j$.util.Optional;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kci
{
    public final MessageLite a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final boolean f;
    public final Optional g;
    public final Optional h;
    public final kch i;
    
    private kci(final MessageLite a, final Optional b, final Optional c, final Optional d, final Optional e, final boolean f, final Optional g, final kch i, final Optional h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        i.getClass();
        this.i = i;
        this.h = h;
    }
    
    public static Optional a(final amzo amzo) {
        amzo.getClass();
        final int b = amzo.b;
        if (b == 117501096) {
            final amzl amzl = (amzl)amzo.c;
            amzl.getClass();
            final Optional b2 = b(amzl, kcf.h, (aexg)jth.j);
            final Optional b3 = b(amzl, kcf.b, (aexg)jth.k);
            final Optional b4 = b(amzl, kcf.a, (aexg)jth.l);
            final Optional b5 = b(amzl, kcf.c, (aexg)jth.m);
            amzk amzk;
            if ((amzk = amzl.i) == null) {
                amzk = amzk.a;
            }
            final int cg = aqql.cG(amzk.b);
            boolean b6 = true;
            if (cg != 0) {
                if (cg == 2) {
                    return Optional.of((Object)new kci((MessageLite)amzl, b2, b3, b4, b5, b6, b(amzl, kcf.d, (aexg)jth.o), (kch)kcg.b, b(amzl, (aext)ihq.t, (aexg)jth.i)));
                }
            }
            amzj amzj;
            if ((amzj = amzl.j) == null) {
                amzj = amzj.a;
            }
            if (amzj.b != 140810778) {
                amzj amzj2;
                if ((amzj2 = amzl.j) == null) {
                    amzj2 = amzj.a;
                }
                if (amzj2.b != 318370164) {
                    b6 = false;
                }
            }
            return Optional.of((Object)new kci((MessageLite)amzl, b2, b3, b4, b5, b6, b(amzl, kcf.d, (aexg)jth.o), (kch)kcg.b, b(amzl, (aext)ihq.t, (aexg)jth.i)));
        }
        if (b == 318370163) {
            final amzi amzi = (amzi)amzo.c;
            amzi.getClass();
            return Optional.of((Object)new kci((MessageLite)amzi, Optional.empty(), b(amzi, (aext)ihq.s, (aexg)jth.n), b(amzi, kcf.e, (aexg)jth.p), Optional.empty(), false, b(amzi, kcf.f, (aexg)jth.q), (kch)kcg.a, b(amzi, kcf.g, (aexg)jth.r)));
        }
        return Optional.empty();
    }
    
    private static Optional b(final Object o, final aext aext, final aexg aexg) {
        aext.getClass();
        aexg.getClass();
        Optional optional;
        if (aext.a(o)) {
            optional = Optional.of(aexg.apply(o));
        }
        else {
            optional = Optional.empty();
        }
        return optional;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof kci && this.a.equals(((kci)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("kci{");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
