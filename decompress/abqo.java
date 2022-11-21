import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import com.google.android.libraries.youtube.player.audiofocus.PlaybackAudioManager$RestorableState;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqo implements abqq
{
    private final abqv a;
    private final abri b;
    
    public abqo(final abqv a, final abri b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final abpx abpx) {
        final agnt i = this.b.i(abpx);
        if (i != null) {
            final PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor)i.c;
            if (playbackStartDescriptor.a.m) {
                final Object a = this.a.u.a;
                if (a != null && ((abwn)a).ag(abll.j) && TextUtils.equals((CharSequence)playbackStartDescriptor.k(), (CharSequence)((abwn)a).v())) {
                    this.a.F();
                    return;
                }
            }
            this.a.t.o((PlaybackStartDescriptor)i.c, (abla)i.b, i.a);
        }
    }
    
    public final boolean b() {
        return this.a.l.e != null;
    }
    
    public final int c(final abpx abpx) {
        return this.b.f(abpx);
    }
    
    public final void d(final PlaybackStartDescriptor playbackStartDescriptor) {
        this.e(playbackStartDescriptor, abla.a);
    }
    
    public final void e(final PlaybackStartDescriptor n, final abla abla) {
        final abri b = this.b;
        final abqv a = this.a;
        a.getClass();
        if (b.c(a, (afax)new ablz(a, 4), n, abla)) {
            return;
        }
        if (this.b.e()) {
            this.b.b();
            final adzx t = this.a.t;
            tcl.l();
            final Object a2 = ((abqv)t.a).u.a;
            if (a2 != null) {
                ((abwn)a2).J();
            }
            ((abqv)t.a).n.b();
            ((abqv)t.a).m.e();
            ((abqv)t.a).n.e();
            ((abqv)t.a).m.m();
            ((abqv)t.a).u.s();
            ((abqv)t.a).al(12);
        }
        this.b.g(n);
        final abpq a3 = this.b.a();
        if (a3 != null) {
            a3.c();
            a3.g();
            final adzx t2 = this.a.t;
            tcl.l();
            n.getClass();
            ((abqv)t2.a).b.d((Object)new aaol());
            if (abla != null) {
                final xbt b2 = abla.b;
                if (b2 != null) {
                    b2.c("pl_i");
                }
            }
            final aamk e = ((abqv)t2.a).e;
            if (e.b.h) {
                e.i = 3;
            }
            e.e();
            if (!e.i()) {
                ((abod)e.f.a()).b(false);
            }
            final abqv abqv = (abqv)t2.a;
            abqv.j.a(abqv.f);
            ((abqv)t2.a).w(abla);
            ((abqv)t2.a).z();
            final abmo m = ((abqv)t2.a).m;
            m.n = n;
            m.q = n.a.s;
            m.l = ((abme)m.a.a()).a(n);
            ((abqv)t2.a).m.f();
            if (n.t()) {
                ((abqv)t2.a).b.f((Object)abjz.a);
            }
            ((abqv)t2.a).p.h(n.r());
            ((abqv)t2.a).p.g(n.q());
            ((abqv)t2.a).p.i(n.i());
            ((abqv)t2.a).o.e(n, abla);
            ((abqv)t2.a).d.a();
            return;
        }
        znh.b(zng.b, znf.j, "Initializing a PlaybackSequencer in loaderNavigator, but it does not exist");
    }
    
    public final void f(final PlaybackServiceState playbackServiceState) {
        this.g(playbackServiceState, abla.a);
    }
    
    public final void g(final PlaybackServiceState playbackServiceState, final abla abla) {
        final adzx t = this.a.t;
        tcl.l();
        ((abqv)t.a).b.d((Object)new aaom());
        if (abla != null) {
            final xbt b = abla.b;
            if (b != null) {
                b.c("pl_r");
            }
        }
        ((abqv)t.a).H();
        final PlaybackAudioManager$RestorableState e = playbackServiceState.e;
        if (e != null) {
            ((abqv)t.a).h.i = e;
        }
        final PlaybackModalityState b2 = playbackServiceState.b;
        if (b2 != null) {
            final abkq f = ((abqv)t.a).f;
            f.e = b2.a;
            f.f = b2.b;
            f.i = b2.c;
            f.j = b2.d;
            f.g = b2.i;
            f.l = b2.f;
            f.m = b2.g;
            f.o = b2.h;
            f.q = b2.j;
            f.r = b2.k;
        }
        this.b.b();
        this.b.h(playbackServiceState);
        final abpq a = this.b.a();
        if (a != null && playbackServiceState.d != null) {
            a.c();
            final OmegaSequencerState omegaSequencerState = (OmegaSequencerState)playbackServiceState.d;
            final DirectorSavedState c = playbackServiceState.c;
            if (omegaSequencerState != null && ((c == null && omegaSequencerState.e != null) || (c != null && omegaSequencerState.a != null))) {
                a.g();
            }
            final adzx t2 = this.a.t;
            final OmegaSequencerState omegaSequencerState2 = (OmegaSequencerState)playbackServiceState.d;
            final DirectorSavedState c2 = playbackServiceState.c;
            final abmo m = ((abqv)t2.a).m;
            omegaSequencerState2.getClass();
            m.o = omegaSequencerState2.a;
            m.p = omegaSequencerState2.b;
            m.m = omegaSequencerState2.d;
            m.n = omegaSequencerState2.e;
            m.q = omegaSequencerState2.f;
            m.l = ((abme)m.a.a()).a(omegaSequencerState2.e);
            ((abqv)t2.a).m.f();
            tcl.l();
            final abqv abqv = (abqv)t2.a;
            abqv.j.a(abqv.f);
            ((abqv)t2.a).w(abla);
            ((abqv)t2.a).z();
            if (c2 == null) {
                final abqv abqv2 = (abqv)t2.a;
                abqv2.o.e(abqv2.m.n, abla);
            }
            else {
                final PlayerResponseModel b3 = ((abqv)t2.a).m.b();
                if (b3 == null) {
                    return;
                }
                ((abqv)t2.a).u.t(c2, abla);
                if (((abqv)t2.a).m.k.b(abli.e)) {
                    ((abqv)t2.a).q.g();
                    final abmo i = ((abqv)t2.a).m;
                    final xbt b4 = abla.b;
                    String u = null;
                    i.h(b3, null, b4);
                    if (((vbs)((abqv)t2.a).r.g).f(45362434L)) {
                        final WatchNextResponseModel a2 = ((abqv)t2.a).m.a();
                        if (a2 != null) {
                            final abqv abqv3 = (abqv)t2.a;
                            final Object a3 = abqv3.u.a;
                            final abmo j = abqv3.m;
                            if (a3 != null) {
                                u = ((abwn)a3).u();
                            }
                            j.i(a2, u);
                        }
                        else {
                            tut.b("LoadingFromState in VIDEO_WATCH_LOADED stage, but no WatchNextResponse.");
                        }
                    }
                }
                else {
                    ((abqv)t2.a).o.e(c2.d, abla);
                }
            }
            ((abqv)t2.a).d.a();
            ((abqv)t2.a).E();
            return;
        }
        final adzx t3 = this.a.t;
        ((abqv)t3.a).b.d((Object)new aaoj());
        ((abqv)t3.a).E();
    }
    
    public final void h(final able able, final abla abla) {
        final abpq a = this.b.a();
        final aqwt a2 = ablf.a();
        a2.f(able);
        final ablf c = a2.c();
        if (a != null) {
            final abqv a3 = this.a;
            final abpx c2 = abpx.c;
            final abpo abpo = (abpo)a;
            PlaybackStartDescriptor b;
            if (abpo.j(c2)) {
                abpo.b = abpo.a.a(abpx.c);
                b = abpo.b;
            }
            else {
                b = null;
            }
            a3.D(c, b, abla, (abgg)null);
        }
    }
    
    public final void i(final ablf ablf, final PlaybackStartDescriptor playbackStartDescriptor, final abla abla, final abgg abgg) {
        if (this.b.e()) {
            this.a.D(ablf, playbackStartDescriptor, abla, abgg);
        }
    }
    
    public final void j(final int n) {
        final abpq a = this.b.a();
        if (a != null) {
            final abpy a2 = ((abpo)a).a;
            if (a2 instanceof abpv) {
                ((abpv)a2).o(n);
            }
        }
    }
    
    public final void k(final boolean b) {
        final abpq a = this.b.a();
        if (a == null) {
            return;
        }
        final abpy a2 = ((abpo)a).a;
        if (a2 instanceof abpz) {
            ((abpz)a2).pB(b);
        }
    }
    
    public final boolean l(final abpx abpx) {
        return this.b.d(abpx);
    }
    
    public final boolean m() {
        final abpq a = this.b.a();
        if (a != null) {
            a.f();
            this.a.af();
            return true;
        }
        return false;
    }
    
    public final void n(final PlaybackStartDescriptor playbackStartDescriptor, final abla abla, final PlayerResponseModel playerResponseModel) {
        if (this.b.e()) {
            this.a.l.c(playbackStartDescriptor, abla, playerResponseModel);
        }
    }
    
    public final void o() {
        final abpq a = this.b.a();
        if (a != null) {
            a.f();
            final abqv a2 = this.a;
            tcl.l();
            final Object a3 = a2.u.a;
            if (a3 != null && ((abwn)a3).ah(abll.g)) {
                tcl.l();
                final Object a4 = a2.u.a;
                if (a4 != null) {
                    final acav s = ((abwn)a4).s();
                    if (s.c() != null) {
                        final PlaybackStartDescriptor n = a2.m.n;
                        if (n != null) {
                            final abkw e = n.e();
                            e.l = s.o().e;
                            final PlaybackStartDescriptor a5 = e.a();
                            a2.u.u(a5, abla.a().a());
                            a2.n.a(s.c(), a5, (abrx)new abqr(), null);
                            return;
                        }
                    }
                }
                a2.af();
                return;
            }
            a2.af();
        }
    }
}
