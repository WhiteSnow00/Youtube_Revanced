import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import android.os.Bundle;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;
import android.text.TextUtils;
import java.util.function.Function;
import java.util.function.Predicate;
import j$.util.Optional;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hoq implements ViewTreeObserver$OnGlobalLayoutListener
{
    final how a;
    
    public hoq(final how a) {
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        if (this.a.bA()) {
            this.a.ai.c("r_fge");
        }
        final how a = this.a;
        if (a.au()) {
            a.aq.A();
            a.aq.I(true);
            final abpq aq = a.aq;
            final zdi d = a.bf.d;
            a.od().getClass();
            final abjh a2 = abjh.a;
            final zdk c = a.c;
            final abjh a3 = abjh.a;
            aq.x(d, new abjg((zdk)a2, c, (zdk)a3, (zdk)a3));
            a.aq.O(1.0f);
            if (a.bk != null) {
                final aiqj aiqj = (aiqj)Optional.ofNullable((Object)((br)a).m).filter((Predicate)hoi.d).map((Function)hon.g).orElse((Object)a.bk.b);
                a.cd.a = acqb.d(aiqj);
                final PlaybackStartDescriptor bk = a.bk;
                final amqg i = hko.I(aiqj);
                int d2;
                if (i == null) {
                    d2 = -1;
                }
                else {
                    d2 = i.d;
                }
                a.bk = hko.G(bk, d2);
                if (!TextUtils.isEmpty((CharSequence)a.bi)) {
                    final PlaybackStartDescriptor bk2 = a.bk;
                    final String bi = a.bi;
                    final aiqj b = bk2.b;
                    PlaybackStartDescriptor a4 = bk2;
                    if (b != null) {
                        final ahaz k = hko.K(b);
                        k.copyOnWrite();
                        final amqg amqg = (amqg)k.instance;
                        final amqg a5 = amqg.a;
                        bi.getClass();
                        amqg.b |= 0x20;
                        amqg.f = bi;
                        final abjp e = bk2.e();
                        final ahbb ahbb = (ahbb)((ahbh)b).toBuilder();
                        ahbb.e((ahaq)amqf.b, (Object)k.build());
                        e.a = (aiqj)((ahaz)ahbb).build();
                        e.f = bk2.r();
                        e.e = bk2.q();
                        a4 = e.a();
                        a4.n(bk2);
                    }
                    a.bk = a4;
                }
                final PlaybackStartDescriptor bk3 = a.bk;
                a.bB = bk3.b;
                a.ai.f(bk3.k());
                if (a.d.q()) {
                    final Bundle bh = a.bh;
                    if (bh != null) {
                        final hnw b2 = a.d.b;
                        b2.i = bh.getBoolean("ReelSequenceController.IS_INITIALIZED_KEY");
                        b2.e = (ReelSequenceController$PendingContinuation)bh.getParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY");
                        b2.f = (ReelSequenceController$PendingContinuation)bh.getParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY");
                        b2.h = bh.getBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY");
                    }
                    else {
                        final hnw b3 = a.d.b;
                        final PlaybackStartDescriptor bk4 = a.bk;
                        final ReelWatchEndpointOuterClass$ReelWatchEndpoint n = hko.n(bk4);
                        if (!b3.i) {
                            final int ca = aqsx.ca(n.n);
                            if (ca != 0 && ca == 3 && (n.b & 0x2000) != 0x0) {
                                b3.i = true;
                                final hsx m = b3.m.m();
                                m.b = n.o;
                                if (bk4 != null && (boolean)b3.j.l(45374179L).aM()) {
                                    ((vkk)m).k(bk4.x());
                                }
                                b3.d(b3.f, m, 2, 1);
                            }
                        }
                    }
                }
            }
            a.d.j(false);
            if (a.bh == null && a.bE.compareAndSet(false, true)) {
                a.ba.d();
            }
        }
        this.a.bf.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
}
