import android.text.TextUtils;
import java.util.function.Function;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abku implements abkw, abkp
{
    public final abkz a;
    public final abko b;
    public final ablw c;
    public final abrj d;
    public final aujg e;
    private final abko f;
    private final Executor g;
    private final abkl h;
    private final acid i;
    private final arwh j;
    private final msr k;
    
    public abku(final msr k, final abkz a, final abko b, final aujg e, final ablw c, final abko f, final acid i, final abkl h, final arwh j, final abrj d, final Executor g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
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
        final abkl h = this.h;
        if (h.m()) {
            h.h(playbackStartDescriptor.r());
            this.h.g(playbackStartDescriptor.q());
        }
    }
    
    public final Pair a(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final abjt abjt, final boolean b) {
        aeea x;
        if (this.d.m(playbackStartDescriptor) && !this.a.i(playbackStartDescriptor)) {
            final afaq b2 = aeun.b((afaq)new abkq(this, playbackStartDescriptor, s, abjt, b, 0));
            final acid i = this.i;
            asht asht;
            if (this.d.n() && s != null) {
                asht = (asht)this.f.a(s, b2, aezp.j((Object)abjt.b));
            }
            else {
                asht = (asht)b2.a();
            }
            final zrh zrh = new zrh(this, 20);
            final abkr abkr = new abkr(this, 1);
            Object o;
            if (!((abrj)i.d).l()) {
                o = vdh.aY(asht.aT((asid)i.a).K((asjs)aada.k).Z((asjr)aaxs.u).l(WatchNextResponseModel.class).aD());
            }
            else {
                o = ((aezf)abkr).apply(ablp.a(playbackStartDescriptor, abjt));
            }
            x = new aeea(vdh.aY(asht.aT(atgt.b).K((asjs)aada.l).Z((asjr)aaxs.u).l(PlayerResponseModel.class).aD().M((asjr)new abln(i, playbackStartDescriptor, (ListenableFuture)o, abjt, s, (aezf)zrh, (byte[])null, (byte[])null))), aezp.j(o));
        }
        else {
            x = acid.x(playbackStartDescriptor, abjt, this.j, s, (aezf)new abkt(this, s, (Function)new gjs(this, abjt, 10), abjt, 1), (aezf)new abkr(this, 0), b, this.g);
        }
        final ListenableFuture ae = x.aE();
        ListenableFuture m;
        if (x.aD().h()) {
            m = (ListenableFuture)x.aD().c();
        }
        else {
            m = this.e.M(playbackStartDescriptor, abjt);
        }
        return Pair.create((Object)ae, (Object)m);
    }
    
    public final ListenableFuture b(final String s, final String s2, final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt, final boolean b) {
        return acid.x(playbackStartDescriptor, abjt, this.j, s2, (aezf)new abks(this, abjt, 0), (aezf)new abkr(this, 2), b, this.g).aE();
    }
    
    public final ListenableFuture c(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final int n, final abjt abjt) {
        final abkz a = this.a;
        if (a.i != null && !TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k()) && playbackStartDescriptor.x() != null) {
            a.f(((vkk)a.e.b(playbackStartDescriptor.k(), playbackStartDescriptor.x(), playbackStartDescriptor.h(), playbackStartDescriptor.i(), playbackStartDescriptor.a(), n, a.g, (String)null, (xan)null, playbackStartDescriptor.g, false)).b());
        }
        return this.a.c(playbackStartDescriptor, s, n, (vjf)null, true, abjt);
    }
    
    public final ListenableFuture d(final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt) {
        return this.e.M(playbackStartDescriptor, abjt);
    }
    
    public final ListenableFuture e(final PlaybackStartDescriptor playbackStartDescriptor, final abjy abjy, final xan xan) {
        return null;
    }
    
    public final ListenableFuture f(final PlaybackStartDescriptor playbackStartDescriptor, final ancs ancs, final xan xan) {
        return this.a.e(playbackStartDescriptor, ancs, xan);
    }
    
    public final asht g(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final abjt abjt) {
        if (this.d.m(playbackStartDescriptor) && !this.a.i(playbackStartDescriptor)) {
            final afaq b = aeun.b((afaq)new zos(this, playbackStartDescriptor, s, abjt, 6));
            asht asht;
            if (this.d.n() && s != null) {
                asht = (asht)this.f.a(s, b, aezp.j((Object)abjt.b));
            }
            else {
                asht = (asht)b.a();
            }
            return asht;
        }
        final aeea x = acid.x(playbackStartDescriptor, abjt, this.j, s, (aezf)new abkt(this, s, (Function)new gjs(this, abjt, 11), abjt, 0), (aezf)new abkr(this, 3), true, this.g);
        return asht.ad(vdh.aZ(x.aE()).J((asjr)aaxs.q).k(), vdh.aZ((ListenableFuture)x.aD().d((afaq)new wyz(this, playbackStartDescriptor, abjt, 7))).J((asjr)aaxs.p).k()).k();
    }
    
    public final void h(final PlaybackStartDescriptor playbackStartDescriptor, String b, final Executor executor, final abjt abjt) {
        this.i(playbackStartDescriptor);
        if (this.d.h()) {
            b = playbackStartDescriptor.B(this.k);
            this.b.b(b, aeun.b((afaq)new zos(this, playbackStartDescriptor, b, abjt, 5)), aezp.j((Object)abjt.b), executor);
            return;
        }
        this.a.h(playbackStartDescriptor, b, executor, abjt);
    }
    
    public final void k(final PlaybackStartDescriptor playbackStartDescriptor, String b, final Executor executor, final abjt abjt) {
        this.i(playbackStartDescriptor);
        if (this.d.m(playbackStartDescriptor)) {
            if (this.d.n()) {
                b = playbackStartDescriptor.B(this.k);
                this.f.b(b, aeun.b((afaq)new zos(this, playbackStartDescriptor, b, abjt, 4)), aezp.j((Object)abjt.b), executor);
            }
            return;
        }
        this.h(playbackStartDescriptor, b, executor, abjt);
    }
}
