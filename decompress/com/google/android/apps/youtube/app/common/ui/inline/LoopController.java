// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.inline;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.concurrent.atomic.AtomicReference;

public class LoopController implements thl, gew
{
    public final atke a;
    public aipg b;
    public boolean c;
    private final atke d;
    private asir e;
    
    public LoopController(final atke a, final atke d, final InlinePlaybackLifecycleController inlinePlaybackLifecycleController) {
        this.a = a;
        this.d = d;
        inlinePlaybackLifecycleController.o((gew)this);
    }
    
    private final void j() {
        if (this.b == null) {
            return;
        }
        this.c = false;
        ((aazo)this.a.a()).a();
        this.b = null;
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        this.e = ((jet)this.d.a()).H((aezf)fng.q, (aezf)fng.r).j(aale.q(1)).an((asjm)new gao(this, 11), (asjm)fua.l);
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        athz.f((AtomicReference)this.e);
        this.j();
    }
    
    public final void q(final gel gel, int dh, final int n) {
        if (n == 0) {
            this.j();
            return;
        }
        if (n == 1) {
            final aiqj c = gel.b.c();
            aipg b;
            final aipg aipg = b = null;
            if (c != null) {
                if (!((ahbc)c).ry((ahaq)WatchEndpointOuterClass.watchEndpoint)) {
                    b = aipg;
                }
                else {
                    final apsk apsk = (apsk)((ahbc)c).rx((ahaq)WatchEndpointOuterClass.watchEndpoint);
                    apsa apsa;
                    if ((apsa = apsk.v) == null) {
                        apsa = apsa.a;
                    }
                    aipg aipg2;
                    if ((aipg2 = apsa.b) == null) {
                        aipg2 = aipg.a;
                    }
                    dh = aqsx.dH(aipg2.c);
                    if (dh == 0) {
                        b = aipg;
                    }
                    else if (dh != 3) {
                        b = aipg;
                    }
                    else {
                        apsa apsa2;
                        if ((apsa2 = apsk.v) == null) {
                            apsa2 = apsa.a;
                        }
                        if ((b = apsa2.b) == null) {
                            b = aipg.a;
                        }
                    }
                }
            }
            this.b = b;
        }
    }
}
