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

final class hnv implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ hoa a;
    
    public hnv(final hoa a) {
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        if (this.a.bA()) {
            this.a.aj.c("r_fge");
        }
        final hoa a = this.a;
        if (a.au()) {
            a.ar.B();
            a.ar.J(true);
            final abno ar = a.ar;
            final zbp d = a.bh.d;
            a.od().getClass();
            final abho a2 = abho.a;
            final zbr c = a.c;
            final abho a3 = abho.a;
            ar.y(d, new abhn(a2, c, a3, a3));
            a.ar.P(1.0f);
            if (a.bl != null) {
                final aioe aioe = (aioe)Optional.ofNullable((Object)((br)a).m).filter((Predicate)hnm.d).map((Function)hns.g).orElse((Object)a.bl.b);
                a.cd.a = acnx.h(aioe);
                final PlaybackStartDescriptor bl = a.bl;
                final amob s = iba.S(aioe);
                int d2;
                if (s == null) {
                    d2 = -1;
                }
                else {
                    d2 = s.d;
                }
                a.bl = iba.Q(bl, d2);
                if (!TextUtils.isEmpty((CharSequence)a.bj)) {
                    final PlaybackStartDescriptor bl2 = a.bl;
                    final String bj = a.bj;
                    final aioe b = bl2.b;
                    PlaybackStartDescriptor a4 = bl2;
                    if (b != null) {
                        final agza u = iba.U(b);
                        u.copyOnWrite();
                        final amob amob = (amob)u.instance;
                        final amob a5 = amob.a;
                        bj.getClass();
                        amob.b |= 0x20;
                        amob.f = bj;
                        final abhx e = bl2.e();
                        final agzc agzc = (agzc)((agzi)b).toBuilder();
                        agzc.e((agyr)amoa.b, u.build());
                        e.a = (aioe)agzc.build();
                        e.f = bl2.r();
                        e.e = bl2.q();
                        a4 = e.a();
                        a4.n(bl2);
                    }
                    a.bl = a4;
                }
                final PlaybackStartDescriptor bl3 = a.bl;
                a.bC = bl3.b;
                a.aj.f(bl3.k());
                if (a.d.q()) {
                    final Bundle bi = a.bi;
                    if (bi != null) {
                        final hnb b2 = a.d.b;
                        b2.i = bi.getBoolean("ReelSequenceController.IS_INITIALIZED_KEY");
                        b2.e = (ReelSequenceController$PendingContinuation)bi.getParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY");
                        b2.f = (ReelSequenceController$PendingContinuation)bi.getParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY");
                        b2.h = bi.getBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY");
                    }
                    else {
                        final hnb b3 = a.d.b;
                        final PlaybackStartDescriptor bl4 = a.bl;
                        final ReelWatchEndpointOuterClass$ReelWatchEndpoint x = iba.x(bl4);
                        if (!b3.i) {
                            final int bz = aqql.bZ(x.n);
                            if (bz != 0 && bz == 3 && (x.b & 0x2000) != 0x0) {
                                b3.i = true;
                                final hsb m = b3.m.m();
                                m.b = x.o;
                                if (bl4 != null && (boolean)b3.j.l(45374179L).aG()) {
                                    ((vii)m).k(bl4.x());
                                }
                                b3.d(b3.f, m, 2, 1);
                            }
                        }
                    }
                }
            }
            a.d.j(false);
            if (a.bi == null && a.bF.compareAndSet(false, true)) {
                a.bc.d();
            }
        }
        this.a.bh.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
}
