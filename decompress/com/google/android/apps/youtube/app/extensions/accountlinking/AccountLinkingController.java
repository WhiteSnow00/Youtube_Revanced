// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.accountlinking;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.ref.WeakReference;

public class AccountLinkingController implements tfh
{
    public final vbq a;
    public asic b;
    public WeakReference c;
    public final atir d;
    private final jdt e;
    private asic f;
    private asic g;
    
    public AccountLinkingController(final vbq a, final jdt e) {
        this.c = new WeakReference(null);
        this.a = a;
        this.e = e;
        this.d = atir.e();
    }
    
    public final void j() {
        final adof adof = (adof)this.c.get();
        if (adof != null) {
            adof.a((ahhe)null);
        }
        final asic b = this.b;
        if (b != null) {
            asjg.b((AtomicReference)b);
            this.b = null;
        }
        this.d.tr((Object)new sin(Optional.empty()));
    }
    
    public final void k(final boolean c) {
        final adof adof = (adof)this.c.get();
        final abtt q = this.e.o().q();
        Optional optional;
        if (q == null) {
            trn.b("failed to get presence menu data: no current playback");
            optional = Optional.empty();
        }
        else {
            final PlayerResponseModel d = q.d();
            if (d == null) {
                trn.b("failed to get presence menu data: no player response in current playback");
                optional = Optional.empty();
            }
            else {
                final ahhb b = d.b();
                if (b != null && (b.b & 0x8) != 0x0) {
                    ahhc ahhc;
                    if ((ahhc = b.e) == null) {
                        ahhc = ahhc.a;
                    }
                    optional = Optional.of((Object)ahhc);
                }
                else {
                    trn.b("failed to get presence menu data: no AL config in player response");
                    optional = Optional.empty();
                }
            }
        }
        final sin sin = new sin(optional);
        boolean a;
        final boolean b2 = a = false;
        if (c) {
            a = b2;
            if (adof != null) {
                a = b2;
                if (((Optional)sin.b).isPresent()) {
                    a = true;
                }
            }
        }
        sin.a = a;
        this.d.tr((Object)sin);
        if (adof == null) {
            return;
        }
        if (((Optional)sin.b).isPresent()) {
            final agza builder = ((agzi)ahhe.a).createBuilder();
            final agza builder2 = ((agzi)ahhd.a).createBuilder();
            builder2.copyOnWrite();
            final ahhd ahhd = (ahhd)builder2.instance;
            ahhd.b |= 0x1;
            ahhd.c = c;
            builder.copyOnWrite();
            final ahhe ahhe = (ahhe)builder.instance;
            final ahhd ahhd2 = (ahhd)builder2.build();
            ahhd2.getClass();
            final agzy b3 = ahhe.b;
            if (!b3.c()) {
                ahhe.b = agzi.mutableCopy(b3);
            }
            ahhe.b.add(ahhd2);
            adof.a((ahhe)builder.build());
            return;
        }
        adof.a((ahhe)null);
    }
    
    public final void oS(final aum aum) {
        this.f = this.e.w().am((asix)new gly(this, 10), (asix)gpa.e);
        this.g = this.e.H().am((asix)new gly(this, 11), (asix)gpa.e);
    }
    
    public final void oW(final aum aum) {
        athh.f((AtomicReference)this.f);
        athh.f((AtomicReference)this.g);
        this.j();
    }
}
