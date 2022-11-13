import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import j$.util.stream.IntStream$_CC;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbj implements abbg, abps, tgg
{
    public final abpq a;
    public final abbh b;
    
    public abbj(final abpq a, final abbh b) {
        this.a = a;
        b.getClass();
        this.b = b;
        ((isq)b).b.a((abbg)this);
    }
    
    public final void a(final ypj ypj) {
        final abbh b = this.b;
        final boolean i = ypj.i();
        final isq isq = (isq)b;
        if (isq.d != i) {
            isq.d = i;
            isq.c.a("menu_item_audio_track", i);
            final ist f = isq.f;
            if (f != null) {
                ((acry)f).g(i);
            }
        }
        if (ypj.i()) {
            final FormatStreamModel e = ypj.e();
            final vhh[] k = ypj.k();
            String q;
            if (e != null) {
                q = e.q();
            }
            else {
                q = null;
            }
            IntStream$_CC.range(0, k.length).filter((IntPredicate)new abbi(k, q)).findFirst().ifPresent((IntConsumer)new rkv(this, k, 2));
        }
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().m).j(aale.s(abpu.bM(), 4096L)).j(aale.q(1)).an(new abav(this, 8), abba.c) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            this.a((ypj)o);
            array = null;
        }
        else {
            array = new Class[] { ypj.class };
        }
        return array;
    }
}
