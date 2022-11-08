import java.util.concurrent.Executor;
import com.google.protobuf.MessageLite;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adeh
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    
    public adeh(final adgw a, final atjj b, final atjj c, final atjj d, final atjj e, final atjj f, final atjj g, final atjj h, final atjj i, final atjj j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public adeh(final atjj g, final atjj d, final atjj h, final atjj j, final atjj f, final atjj b, final atjj c, final atjj i, final atjj e, final atjj a) {
        g.getClass();
        this.g = g;
        this.d = d;
        this.h = h;
        j.getClass();
        this.j = j;
        this.f = f;
        this.b = b;
        this.c = c;
        this.i = i;
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
    }
    
    public adeh(final tdz a, final vjh g, final adcr e, final zki d, final abke f, final Set j, final vuu i, final arud c, final ykd h, final abpj b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        a.getClass();
        this.a = a;
        g.getClass();
        this.g = g;
        f.getClass();
        this.f = f;
        j.getClass();
        this.j = j;
        i.getClass();
        this.i = i;
        this.c = c;
        this.h = h;
        this.e = e;
        this.d = d;
        this.b = b;
    }
    
    public final adgo a() {
        return (adgo)((atjj)this.c).a();
    }
    
    public final adgq b() {
        return (adgq)((atjj)this.d).a();
    }
    
    public final adgu c() {
        return (adgu)((atjj)this.f).a();
    }
    
    public final adgw d() {
        return (adgw)((atjj)this.b).a();
    }
    
    public final ashe e(PlaybackStartDescriptor playbackStartDescriptor, final String n, abib b, final boolean b2) {
        final vhf f = vhf.f((arud)this.c, playbackStartDescriptor.f(), n, playbackStartDescriptor.c(), b.h, playbackStartDescriptor.y());
        if (f != null) {
            f.d.set(ahfv.d);
            if (!TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
                f.c(playbackStartDescriptor.k());
            }
            else if (!TextUtils.isEmpty((CharSequence)playbackStartDescriptor.i())) {
                f.i = true;
            }
        }
        final Object e = this.e;
        final zkh c = ((zki)this.d).c();
        e.getClass();
        c.getClass();
        final abkb abkb = new abkb((adcr)e, c, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((vii)abkb).k(playbackStartDescriptor.x());
        final abkg c2 = ((abke)this.f).c(playbackStartDescriptor, -1, (Set)this.j, b.b, n);
        c2.O = true;
        abkb.a = aexq.k(c2);
        if (!((abpj)this.b).l()) {
            abkb.b = aexq.k(((vuu)this.i).a(playbackStartDescriptor.k(), playbackStartDescriptor.i(), playbackStartDescriptor.a(), playbackStartDescriptor.g(), playbackStartDescriptor.x(), (thc)new abjz((tdz)this.a, b.b)));
        }
        final Object g = this.g;
        final akxz a = akxz.a;
        final znh a2 = znh.a;
        final abgh e2 = abgh.e;
        final zds g2 = zds.g;
        final afdu t = afdu.t((Object)new abjw(1), (Object)new abjw(0));
        final vjh vjh = (vjh)g;
        final arzw b3 = vjm.b(vjh.c);
        b3.b = new tqd(vjh, 20);
        final vji c3 = vjh.c((vjn)abkb, (MessageLite)a, (znj)a2, (tad)e2, (tac)g2, (Set)t, b3.i());
        if (b2) {
            c3.B();
        }
        final String k = playbackStartDescriptor.k();
        b = (abib)b.b;
        ((tdz)this.a).d((Object)new aale());
        if (b != null) {
            ((wyn)b).c("sw_s");
            final agza builder = ((agzi)alkg.a).createBuilder();
            if (n != null) {
                builder.copyOnWrite();
                final alkg alkg = (alkg)builder.instance;
                alkg.b |= 0x1000;
                alkg.n = n;
            }
            final String i = tsx.i(k);
            builder.copyOnWrite();
            final alkg alkg2 = (alkg)builder.instance;
            alkg2.b |= 0x4000000;
            alkg2.w = i;
            ((wyn)b).a((alkg)builder.build());
        }
        final Object h = this.h;
        ashe ashe;
        if (h != null && f != null) {
            final ykb ykb = (ykb)h;
            final zar b4 = ykb.b((wyn)b);
            b4.Z();
            playbackStartDescriptor = (PlaybackStartDescriptor)new yle(ykb.d, f.b, ykb.h, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            ykb.g.d(ynv.e(ykb.d, f.b), f.b);
            Label_0830: {
                if (f.i || !TextUtils.isEmpty((CharSequence)f.h)) {
                    try {
                        playbackStartDescriptor = (PlaybackStartDescriptor)ykb.c.a(f, (yle)playbackStartDescriptor, ykb.i.bi(ylh.i(((ykb)h).f, ((ykb)h).e, ((ykb)h).b)), b4, c3).a();
                    }
                    catch (final ylf ylf) {
                        final int a3 = ylf.a;
                        final int n2 = a3 - 1;
                        if (a3 == 0) {
                            throw null;
                        }
                        if (n2 != 0) {
                            if (n2 == 1) {
                                ((yle)playbackStartDescriptor).d("unavailable.keyexpired", (Exception)ylf);
                            }
                        }
                        else {
                            ((yle)playbackStartDescriptor).d("unavailable.hotconfig", (Exception)ylf);
                        }
                        playbackStartDescriptor = (PlaybackStartDescriptor)ashe.I((Throwable)ylf);
                    }
                    break Label_0830;
                }
                playbackStartDescriptor = (PlaybackStartDescriptor)ashe.I((Throwable)new IllegalArgumentException("Onesie requests must have a non-null videoId."));
            }
            ashe = atbo.c((ashh)((ashe)playbackStartDescriptor).F((asix)new abhi(this, 5, null)).F((asix)new abhi((wyn)b, 6))).e(0);
        }
        else {
            ashe = ashe.I((Throwable)new UnsupportedOperationException("requestStreamingWatch only available through onesie."));
        }
        return ashe;
    }
    
    public final abja f(final Executor executor) {
        final avt avt = (avt)((atjj)this.g).a();
        avt.getClass();
        final abjf abjf = (abjf)((atjj)this.d).a();
        abjf.getClass();
        final abiw abiw = (abiw)((atjj)this.h).a();
        abiw.getClass();
        final auip auip = (auip)((atjj)this.j).a();
        auip.getClass();
        final adeh adeh = (adeh)((atjj)this.f).a();
        adeh.getClass();
        final abiw abiw2 = (abiw)((atjj)this.b).a();
        abiw2.getClass();
        final abpn abpn = (abpn)((atjj)this.c).a();
        abpn.getClass();
        final abit abit = (abit)((atjj)this.i).a();
        abit.getClass();
        final arud arud = (arud)((atjj)this.e).a();
        arud.getClass();
        final abpj abpj = (abpj)((atjj)this.a).a();
        abpj.getClass();
        executor.getClass();
        return new abja(avt, abjf, abiw, auip, adeh, abiw2, abpn, abit, arud, abpj, executor, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
