// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.playerviewmodemonitor;

import java.util.HashMap;
import java.util.function.Function;
import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.pip.observer.PipPlayerObserver;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import java.util.Map;

public class DefaultPlayerViewModeMonitor implements thj, fjv, aawq, gew, fns
{
    public volatile fkr a;
    private final fnt b;
    private final atjz c;
    private final atjz d;
    private final atjz e;
    private final asiq f;
    private final Map g;
    private final asht h;
    private final asht i;
    private final InlinePlaybackLifecycleController j;
    private final aawr k;
    
    public DefaultPlayerViewModeMonitor(final PipPlayerObserver pipPlayerObserver, final lag lag, final ldg ldg, final fnt b, final InlinePlaybackLifecycleController j, final aawr k, final Optional optional) {
        this.b = b;
        this.j = j;
        this.k = k;
        final asiq f = new asiq();
        this.f = f;
        final Boolean value = false;
        final atjz bc = ((atjz)atjm.aW((Object)value)).bc();
        this.c = bc;
        final atjz bc2 = ((atjz)atjm.aW((Object)value)).bc();
        this.d = bc2;
        final atjz bc3 = ((atjz)atjm.aW((Object)b.b)).bc();
        this.e = bc3;
        final asht asht = (asht)optional.map((Function)far.k).orElse((Object)asht.X(value));
        final asht ai = lag.a.ai();
        final asht a = pipPlayerObserver.a;
        final atjz b2 = ldg.b;
        final lga b3 = lga.b;
        askk.b((Object)asht, "source7 is null");
        final asht aw = asht.o(new ashw[] { a, ai, (ashw)bc, (ashw)bc2, (ashw)bc3, (ashw)b2, asht }, askj.g((asjq)b3), ashi.a).ao(fkr.a).A().G((asjm)new fqz(this, 0)).al().aU().aW(0, (asjm)new fqz(f, 2));
        this.h = aw;
        this.g = new HashMap();
        this.a = fkr.a;
        this.i = aw.aQ();
    }
    
    public static fkr p(final int n, final fkr fkr) {
        Optional optional;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        optional = Optional.empty();
                    }
                    else {
                        optional = Optional.of((Object)fkr.i);
                    }
                }
                else {
                    optional = Optional.of((Object)fkr.f);
                }
            }
            else {
                optional = Optional.of((Object)fkr.h);
            }
        }
        else {
            optional = Optional.of((Object)fkr.g);
        }
        if (optional.isPresent()) {
            return (fkr)optional.get();
        }
        return fkr;
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final fkr j() {
        return this.a;
    }
    
    public final asht k() {
        return this.h;
    }
    
    public final void l(final fju fju) {
        if (this.g.containsKey(fju)) {
            return;
        }
        this.g.put(fju, this.i.aH((asjm)new fqz(fju, 1)));
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void m(final atke atke) {
        fal.c((fjv)this, atke);
    }
    
    public final void mM(final aun aun) {
        this.b.a.remove(this);
        this.j.t((gew)this);
        this.k.g(this);
        this.f.b();
    }
    
    public final void mq(final aun aun) {
        this.b.d((fns)this);
        this.j.o((gew)this);
        this.k.b(this);
    }
    
    public final void my(final aun aun) {
    }
    
    public final void n(final fju fju) {
        final asir asir = this.g.remove(fju);
        if (asir != null) {
            asir.dispose();
        }
    }
    
    public final void o(final fnq fnq) {
        this.e.tu((Object)fnq);
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.g((thj)this);
    }
    
    public final void oW() {
        tfg.f((thj)this);
    }
    
    public final void oX(final aun aun) {
    }
    
    public final void q(final gel gel, final int n, final int n2) {
        this.c.tu((Object)(n2 != 0));
    }
    
    public final void r(final boolean b) {
        this.d.tu((Object)b);
    }
}
