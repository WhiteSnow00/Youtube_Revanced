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

public final class abpg implements abpl
{
    private final abpq a;
    private final abqb b;
    
    public abpg(final abpq a, final abqb b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final abop abop) {
        final agmc i = this.b.i(abop);
        if (i != null) {
            final PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor)i.c;
            if (playbackStartDescriptor.a.m) {
                final Object a = this.a.u.a;
                if (a != null && ((abvb)a).ag(abke.j) && TextUtils.equals((CharSequence)playbackStartDescriptor.k(), (CharSequence)((abvb)a).v())) {
                    this.a.F();
                    return;
                }
            }
            this.a.t.r((PlaybackStartDescriptor)i.c, (abjt)i.b, i.a);
        }
    }
    
    public final boolean b() {
        return this.a.l.e != null;
    }
    
    public final int c(final abop abop) {
        return this.b.f(abop);
    }
    
    public final void d(final PlaybackStartDescriptor playbackStartDescriptor) {
        this.e(playbackStartDescriptor, abjt.a);
    }
    
    public final void e(final PlaybackStartDescriptor n, final abjt abjt) {
        final abqb b = this.b;
        final abpq a = this.a;
        a.getClass();
        if (b.c(a, (aezf)new abkr(a, 5), n, abjt)) {
            return;
        }
        if (this.b.e()) {
            this.b.b();
            final afhd t = this.a.t;
            tbi.f();
            final Object a2 = ((abpq)t.a).u.a;
            if (a2 != null) {
                ((abvb)a2).J();
            }
            ((abpq)t.a).n.b();
            ((abpq)t.a).m.e();
            ((abpq)t.a).n.e();
            ((abpq)t.a).m.m();
            ((abpq)t.a).u.s();
            ((abpq)t.a).aj(12);
        }
        this.b.g(n);
        final aboj a3 = this.b.a();
        if (a3 != null) {
            a3.c();
            a3.g();
            final afhd t2 = this.a.t;
            tbi.f();
            n.getClass();
            ((abpq)t2.a).b.d((Object)new aamo());
            if (abjt != null) {
                final xan b2 = abjt.b;
                if (b2 != null) {
                    b2.c("pl_i");
                }
            }
            final aakn e = ((abpq)t2.a).e;
            if (e.b.h) {
                e.i = 3;
            }
            e.e();
            if (!e.i()) {
                ((abmw)e.f.a()).b(false);
            }
            final abpq abpq = (abpq)t2.a;
            abpq.j.a(abpq.f);
            ((abpq)t2.a).w(abjt);
            ((abpq)t2.a).z();
            final ablh m = ((abpq)t2.a).m;
            m.n = n;
            m.q = n.a.s;
            m.l = ((abkx)m.a.a()).a(n);
            ((abpq)t2.a).m.f();
            if (n.t()) {
                ((abpq)t2.a).b.f((Object)abis.a);
            }
            ((abpq)t2.a).p.h(n.r());
            ((abpq)t2.a).p.g(n.q());
            ((abpq)t2.a).p.i(n.i());
            ((abpq)t2.a).o.e(n, abjt);
            ((abpq)t2.a).d.a();
            return;
        }
        zlm.b(zll.b, zlk.j, "Initializing a PlaybackSequencer in loaderNavigator, but it does not exist");
    }
    
    public final void f(final PlaybackServiceState playbackServiceState) {
        this.g(playbackServiceState, abjt.a);
    }
    
    public final void g(final PlaybackServiceState playbackServiceState, final abjt abjt) {
        final afhd t = this.a.t;
        tbi.f();
        ((abpq)t.a).b.d((Object)new aamp());
        if (abjt != null) {
            final xan b = abjt.b;
            if (b != null) {
                b.c("pl_r");
            }
        }
        ((abpq)t.a).H();
        final PlaybackAudioManager$RestorableState e = playbackServiceState.e;
        if (e != null) {
            ((abpq)t.a).h.i = e;
        }
        final PlaybackModalityState b2 = playbackServiceState.b;
        if (b2 != null) {
            final abjj f = ((abpq)t.a).f;
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
        final aboj a = this.b.a();
        if (a != null && playbackServiceState.d != null) {
            a.c();
            final OmegaSequencerState omegaSequencerState = (OmegaSequencerState)playbackServiceState.d;
            final DirectorSavedState c = playbackServiceState.c;
            if (omegaSequencerState != null && ((c == null && omegaSequencerState.e != null) || (c != null && omegaSequencerState.a != null))) {
                a.g();
            }
            final afhd t2 = this.a.t;
            final OmegaSequencerState omegaSequencerState2 = (OmegaSequencerState)playbackServiceState.d;
            final DirectorSavedState c2 = playbackServiceState.c;
            final ablh m = ((abpq)t2.a).m;
            omegaSequencerState2.getClass();
            m.o = omegaSequencerState2.a;
            m.p = omegaSequencerState2.b;
            m.m = omegaSequencerState2.d;
            m.n = omegaSequencerState2.e;
            m.q = omegaSequencerState2.f;
            m.l = ((abkx)m.a.a()).a(omegaSequencerState2.e);
            ((abpq)t2.a).m.f();
            tbi.f();
            final abpq abpq = (abpq)t2.a;
            abpq.j.a(abpq.f);
            ((abpq)t2.a).w(abjt);
            ((abpq)t2.a).z();
            if (c2 == null) {
                final abpq abpq2 = (abpq)t2.a;
                abpq2.o.e(abpq2.m.n, abjt);
            }
            else {
                final PlayerResponseModel b3 = ((abpq)t2.a).m.b();
                if (b3 == null) {
                    return;
                }
                ((abpq)t2.a).u.t(c2, abjt);
                if (((abpq)t2.a).m.k.b(abkb.e)) {
                    ((abpq)t2.a).q.g();
                    final ablh i = ((abpq)t2.a).m;
                    final xan b4 = abjt.b;
                    String u = null;
                    i.h(b3, (PlaybackStartDescriptor)null, b4);
                    if (((vai)((abpq)t2.a).s.g).f(45362434L)) {
                        final WatchNextResponseModel a2 = ((abpq)t2.a).m.a();
                        if (a2 != null) {
                            final abpq abpq3 = (abpq)t2.a;
                            final Object a3 = abpq3.u.a;
                            final ablh j = abpq3.m;
                            if (a3 != null) {
                                u = ((abvb)a3).u();
                            }
                            j.i(a2, u);
                        }
                        else {
                            ttr.b("LoadingFromState in VIDEO_WATCH_LOADED stage, but no WatchNextResponse.");
                        }
                    }
                }
                else {
                    ((abpq)t2.a).o.e(c2.d, abjt);
                }
            }
            ((abpq)t2.a).d.a();
            ((abpq)t2.a).E();
            return;
        }
        final afhd t3 = this.a.t;
        ((abpq)t3.a).b.d((Object)new aamm());
        ((abpq)t3.a).E();
    }
    
    public final void h(final abjx abjx, final abjt abjt) {
        final aboj a = this.b.a();
        final aqua a2 = abjy.a();
        a2.f(abjx);
        final abjy c = a2.c();
        if (a != null) {
            final abpq a3 = this.a;
            final abop c2 = abop.c;
            final aboh aboh = (aboh)a;
            PlaybackStartDescriptor b;
            if (aboh.j(c2)) {
                aboh.b = aboh.a.a(abop.c);
                b = aboh.b;
            }
            else {
                b = null;
            }
            a3.D(c, b, abjt, (abfb)null);
        }
    }
    
    public final void i(final abjy abjy, final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt, final abfb abfb) {
        if (this.b.e()) {
            this.a.D(abjy, playbackStartDescriptor, abjt, abfb);
        }
    }
    
    public final void j(final int n) {
        final aboj a = this.b.a();
        if (a != null) {
            final aboq a2 = ((aboh)a).a;
            if (a2 instanceof abon) {
                ((abon)a2).o(n);
            }
        }
    }
    
    public final void k(final boolean b) {
        final aboj a = this.b.a();
        if (a == null) {
            return;
        }
        final aboq a2 = ((aboh)a).a;
        if (a2 instanceof abor) {
            ((abor)a2).pC(b);
        }
    }
    
    public final boolean l(final abop abop) {
        return this.b.d(abop);
    }
    
    public final boolean m() {
        final aboj a = this.b.a();
        if (a != null) {
            a.f();
            this.a.ad();
            return true;
        }
        return false;
    }
    
    public final void n(final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt, final PlayerResponseModel playerResponseModel) {
        if (this.b.e()) {
            this.a.l.c(playbackStartDescriptor, abjt, playerResponseModel);
        }
    }
    
    public final void o() {
        final aboj a = this.b.a();
        if (a != null) {
            a.f();
            final abpq a2 = this.a;
            tbi.f();
            final Object a3 = a2.u.a;
            if (a3 != null && ((abvb)a3).ah(abke.g)) {
                tbi.f();
                final Object a4 = a2.u.a;
                if (a4 != null) {
                    final abzl s = ((abvb)a4).s();
                    if (s.c() != null) {
                        final PlaybackStartDescriptor n = a2.m.n;
                        if (n != null) {
                            final abjp e = n.e();
                            e.l = s.o().e;
                            final PlaybackStartDescriptor a5 = e.a();
                            a2.u.u(a5, abjt.a().a());
                            a2.n.a(s.c(), a5, (abqo)new abpm(), (xan)null);
                            return;
                        }
                    }
                }
                a2.ad();
                return;
            }
            a2.ad();
        }
    }
}
