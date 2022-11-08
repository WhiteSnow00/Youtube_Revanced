import java.util.function.Function;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abja implements abjc, abix
{
    public final abjf a;
    public final abiw b;
    public final adeh c;
    public final abpj d;
    public final auip e;
    private final abiw f;
    private final Executor g;
    private final abit h;
    private final abpn i;
    private final arud j;
    private final avt k;
    
    public abja(final avt k, final abjf a, final abiw b, final auip e, final adeh c, final abiw f, final abpn i, final abit h, final arud j, final abpj d, final Executor g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        k.getClass();
        this.k = k;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        f.getClass();
        this.f = f;
        i.getClass();
        this.i = i;
        h.getClass();
        this.h = h;
        j.getClass();
        this.j = j;
        this.g = g;
        d.getClass();
        this.d = d;
    }
    
    private final void i(final PlaybackStartDescriptor playbackStartDescriptor) {
        final abit h = this.h;
        if (h.m()) {
            h.h(playbackStartDescriptor.r());
            this.h.g(playbackStartDescriptor.q());
        }
    }
    
    public final Pair a(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final abib abib, final boolean b) {
        PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
        aeby j = null;
        abib abib2 = null;
        Label_0614: {
            Label_0535: {
                if (this.d.m(playbackStartDescriptor2)) {
                    final abjf a = this.a;
                    if (a.i != null) {
                        if (!TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k()) && playbackStartDescriptor.x() != null && a.i.get((Object)((vii)a.e.b(playbackStartDescriptor.k(), playbackStartDescriptor.x(), playbackStartDescriptor.h(), playbackStartDescriptor.i(), playbackStartDescriptor.a(), -1, a.g, (String)null, (wyn)null, playbackStartDescriptor2.g, false)).b()) != null) {
                            break Label_0535;
                        }
                    }
                    final aeyr b2 = aesm.b((aeyr)new abiz(this, playbackStartDescriptor, s, abib, b, 0));
                    final abpn i = this.i;
                    ashe ashe;
                    if (this.d.n() && s != null) {
                        ashe = (ashe)this.f.a(s, b2, aexq.j((Object)abib.b));
                    }
                    else {
                        ashe = (ashe)b2.a();
                    }
                    final zqp zqp = new zqp(this, 18);
                    final zqp zqp2 = new zqp(this, 19);
                    yyg c;
                    if (s != null) {
                        c = ((yyh)i.g).c(s);
                    }
                    else {
                        c = null;
                    }
                    Object o;
                    if (!((abpj)i.d).l()) {
                        final ashp ax = ashe.aa((asho)i.e).J((asjd)aawc.e).ax();
                        final via via = (via)((atjj)((aeby)i.a).a).a();
                        via.getClass();
                        o = i.b(ax, (asjc)new abkm(via), (aexg)zqp2, (Object)abjr.a(playbackStartDescriptor2, abib), c, "swwnf");
                    }
                    else {
                        o = ((aexg)zqp2).apply((Object)abjr.a(playbackStartDescriptor2, abib));
                    }
                    final ashp ax2 = ashe.aa(atgb.b).J((asjd)aawc.f).ax();
                    final Object b3 = i.b;
                    final long d = ((oas)i.h).d();
                    final aamd aamd = (aamd)b3;
                    final vhm vhm = (vhm)((atjj)aamd.a).a();
                    vhm.getClass();
                    final Set set = (Set)((atjj)aamd.b).a();
                    set.getClass();
                    final abki abki = new abki(vhm, set, d);
                    Object o2;
                    if (TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
                        o2 = new abjp(i, (ListenableFuture)o, playbackStartDescriptor, abib, s, (aexg)zqp, null);
                    }
                    else {
                        o2 = zqp;
                    }
                    final aeby aeby = new aeby(i.b(ax2, (asjc)abki, (aexg)o2, (Object)abjq.a(playbackStartDescriptor, abib, s, b), c, "swpf"), aexq.j(o));
                    playbackStartDescriptor2 = playbackStartDescriptor;
                    j = aeby;
                    abib2 = abib;
                    break Label_0614;
                }
            }
            final gjk gjk = new gjk(this, abib, 10);
            final arud k = this.j;
            final abyq abyq = new abyq(this, s, (Function)gjk, abib, 1);
            final zqp zqp3 = new zqp(this, 20);
            final Executor g = this.g;
            abib2 = abib;
            j = abpn.j(playbackStartDescriptor, abib, k, s, (aexg)abyq, (aexg)zqp3, b, g);
        }
        final ListenableFuture ay = j.ay();
        ListenableFuture m;
        if (j.ax().h()) {
            m = (ListenableFuture)j.ax().c();
        }
        else {
            m = this.e.M(playbackStartDescriptor2, abib2);
        }
        return Pair.create((Object)ay, (Object)m);
    }
    
    public final ListenableFuture b(final String s, final String s2, final PlaybackStartDescriptor playbackStartDescriptor, final abib abib, final boolean b) {
        return abpn.j(playbackStartDescriptor, abib, this.j, s2, (aexg)new abiy(this, abib, 0), (aexg)new zqp(this, 17), b, this.g).ay();
    }
    
    public final ListenableFuture c(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final int n, final abib abib) {
        final abjf a = this.a;
        if (a.i != null && !TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k()) && playbackStartDescriptor.x() != null) {
            a.f(((vii)a.e.b(playbackStartDescriptor.k(), playbackStartDescriptor.x(), playbackStartDescriptor.h(), playbackStartDescriptor.i(), playbackStartDescriptor.a(), n, a.g, (String)null, (wyn)null, playbackStartDescriptor.g, false)).b());
        }
        return this.a.c(playbackStartDescriptor, s, n, (vhf)null, true, abib);
    }
    
    public final ListenableFuture d(final PlaybackStartDescriptor playbackStartDescriptor, final abib abib) {
        return this.e.M(playbackStartDescriptor, abib);
    }
    
    public final ListenableFuture e(final PlaybackStartDescriptor playbackStartDescriptor, final abig abig, final wyn wyn) {
        return null;
    }
    
    public final ListenableFuture f(final PlaybackStartDescriptor playbackStartDescriptor, final anao anao, final wyn wyn) {
        return this.a.e(playbackStartDescriptor, anao, wyn);
    }
    
    public final void g(final PlaybackStartDescriptor playbackStartDescriptor, String b, final Executor executor, final abib abib) {
        this.i(playbackStartDescriptor);
        if (this.d.h()) {
            b = playbackStartDescriptor.B(this.k);
            this.b.b(b, aesm.b((aeyr)new zmw(this, playbackStartDescriptor, b, abib, 5)), aexq.j((Object)abib.b), executor);
            return;
        }
        this.a.h(playbackStartDescriptor, b, executor, abib);
    }
    
    public final void h(final PlaybackStartDescriptor playbackStartDescriptor, String b, final Executor executor, final abib abib) {
        this.i(playbackStartDescriptor);
        if (this.d.m(playbackStartDescriptor)) {
            if (this.d.n()) {
                b = playbackStartDescriptor.B(this.k);
                this.f.b(b, aesm.b((aeyr)new zmw(this, playbackStartDescriptor, b, abib, 4)), aexq.j((Object)abib.b), executor);
            }
            return;
        }
        this.g(playbackStartDescriptor, b, executor, abib);
    }
}
