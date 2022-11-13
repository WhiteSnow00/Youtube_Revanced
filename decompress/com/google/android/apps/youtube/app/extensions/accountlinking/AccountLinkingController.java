// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.accountlinking;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.ref.WeakReference;

public class AccountLinkingController implements thl
{
    public final vdr a;
    public asir b;
    public WeakReference c;
    public final atjm d;
    private final jet e;
    private asir f;
    private asir g;
    
    public AccountLinkingController(final vdr a, final jet e) {
        this.c = new WeakReference(null);
        this.a = a;
        this.e = e;
        this.d = atjm.e();
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void j() {
        final adqh adqh = (adqh)this.c.get();
        if (adqh != null) {
            adqh.a((ahjc)null);
        }
        final asir b = this.b;
        if (b != null) {
            asjv.b((AtomicReference)b);
            this.b = null;
        }
        this.d.tu((Object)new skt(Optional.empty()));
    }
    
    public final void k(final boolean c) {
        final adqh adqh = (adqh)this.c.get();
        final abvx q = this.e.n().q();
        Optional optional;
        if (q == null) {
            ttr.b("failed to get presence menu data: no current playback");
            optional = Optional.empty();
        }
        else {
            final PlayerResponseModel d = q.d();
            if (d == null) {
                ttr.b("failed to get presence menu data: no player response in current playback");
                optional = Optional.empty();
            }
            else {
                final ahiz b = d.b();
                if (b != null && (b.b & 0x8) != 0x0) {
                    ahja ahja;
                    if ((ahja = b.e) == null) {
                        ahja = ahja.a;
                    }
                    optional = Optional.of((Object)ahja);
                }
                else {
                    ttr.b("failed to get presence menu data: no AL config in player response");
                    optional = Optional.empty();
                }
            }
        }
        final skt skt = new skt(optional);
        boolean a;
        final boolean b2 = a = false;
        if (c) {
            a = b2;
            if (adqh != null) {
                a = b2;
                if (((Optional)skt.b).isPresent()) {
                    a = true;
                }
            }
        }
        skt.a = a;
        this.d.tu((Object)skt);
        if (adqh == null) {
            return;
        }
        if (((Optional)skt.b).isPresent()) {
            final ahaz builder = ((ahbh)ahjc.a).createBuilder();
            final ahaz builder2 = ((ahbh)ahjb.a).createBuilder();
            builder2.copyOnWrite();
            final ahjb ahjb = (ahjb)builder2.instance;
            ahjb.b |= 0x1;
            ahjb.c = c;
            builder.copyOnWrite();
            final ahjc ahjc = (ahjc)builder.instance;
            final ahjb ahjb2 = (ahjb)builder2.build();
            ahjb2.getClass();
            final ahbx b3 = ahjc.b;
            if (!b3.c()) {
                ahjc.b = ahbh.mutableCopy(b3);
            }
            ahjc.b.add((Object)ahjb2);
            adqh.a((ahjc)builder.build());
            return;
        }
        adqh.a((ahjc)null);
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
        this.f = this.e.v().an((asjm)new gmf(this, 11), (asjm)gpg.e);
        this.g = this.e.G().an((asjm)new gmf(this, 12), (asjm)gpg.e);
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        athz.f((AtomicReference)this.f);
        athz.f((AtomicReference)this.g);
        this.j();
    }
}
