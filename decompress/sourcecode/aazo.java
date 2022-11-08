import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import j$.util.stream.IntStream$_CC;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aazo implements aazl, abnq, tec
{
    public final abno a;
    public final aazm b;
    
    public aazo(final abno a, final aazm b) {
        this.a = a;
        b.getClass();
        this.b = b;
        ((irs)b).b.a((aazl)this);
    }
    
    public final void a(final ynk ynk) {
        final aazm b = this.b;
        final boolean i = ynk.i();
        final irs irs = (irs)b;
        if (irs.d != i) {
            irs.d = i;
            irs.c.a("menu_item_audio_track", i);
            final irv f = irs.f;
            if (f != null) {
                ((acpu)f).g(i);
            }
        }
        if (ynk.i()) {
            final FormatStreamModel e = ynk.e();
            final vfh[] k = ynk.k();
            String q;
            if (e != null) {
                q = e.q();
            }
            else {
                q = null;
            }
            IntStream$_CC.range(0, k.length).filter((IntPredicate)new aazn(k, q)).findFirst().ifPresent((IntConsumer)new ris(this, k, 2));
        }
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().m).j(aajj.t(abns.bN(), 4096L)).j(aajj.r(1)).am((asix)new aazd(this, 3), (asix)aaze.c) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            this.a((ynk)o);
            array = null;
        }
        else {
            array = new Class[] { ynk.class };
        }
        return array;
    }
}
