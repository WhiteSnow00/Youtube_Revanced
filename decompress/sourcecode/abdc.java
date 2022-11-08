import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Map;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public class abdc implements vhy
{
    protected final tdz a;
    protected final atjj b;
    protected final atjj c;
    private final Executor d;
    private final atjj e;
    private final atjj f;
    private final WillAutonavInformer g;
    private final aexq h;
    private final Map i;
    private final abni j;
    private final abob k;
    private final wym l;
    private final uyf m;
    private final abpj n;
    
    public abdc(final tdz a, final Executor d, final atjj e, final atjj b, final atjj c, final atjj f, final WillAutonavInformer g, final uyf m, final aexq h, final Map i, final abni j, final abob k, final wym l, final abpj n, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        b.getClass();
        this.b = b;
        this.c = c;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        this.m = m;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.n = n;
    }
    
    protected afds b(final aioe aioe, final anbh anbh) {
        final afds i = afdu.i();
        if (anbh.d != 0) {
            final abda abda = new abda((abno)this.b.a(), (abns)this.c.a(), anbh);
            abda.f.f(abda.lX(abda.e));
            if (abda.d.X() && abda.d.p() != null) {
                abda.c(abda.d.p());
            }
            i.h((Object)abda);
        }
        if (aeby.aC(anbh)) {
            if (abek.q(((abns)this.c.a()).p().a())) {
                final abdm abdm = new abdm(aioe, this.g, (abns)this.c.a(), this.k, this.n, (byte[])null, (byte[])null);
                abdm.e.f(abdm.lX(abdm.d));
                i.h((Object)abdm);
            }
            else {
                final abcw abcw = new abcw(aioe, this.g, (abns)this.c.a());
                abcw.e.f(abcw.lX(abcw.d));
                i.h((Object)abcw);
            }
        }
        return i;
    }
}
