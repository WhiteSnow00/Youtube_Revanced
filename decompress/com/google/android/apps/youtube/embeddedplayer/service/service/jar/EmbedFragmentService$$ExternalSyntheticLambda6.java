// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.j;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.e;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PermissionsWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;

public final class EmbedFragmentService$$ExternalSyntheticLambda6 implements tfw
{
    public final EmbedFragmentService a;
    
    public EmbedFragmentService$$ExternalSyntheticLambda6(final EmbedFragmentService a) {
        this.a = a;
    }
    
    public final void a(Object a) {
        final EmbedFragmentService a2 = this.a;
        final akpm akpm = (akpm)a;
        a2.f.f(Tick.k);
        if (akpm != null) {
            final j d = a2.d;
            if (d != null) {
                try {
                    ajpk ajpk;
                    if ((ajpk = akpm.g) == null) {
                        ajpk = ajpk.a;
                    }
                    d.b(new PermissionsWrapper(ajpk));
                }
                catch (final RemoteException ex) {
                    a2.l();
                }
            }
            akyz akyz;
            if ((akpm.b & 0x20) != 0x0) {
                if ((akyz = akpm.f) == null) {
                    akyz = akyz.a;
                }
            }
            else {
                final ahcr builder = akyz.a.createBuilder();
                builder.copyOnWrite();
                final akyz akyz2 = (akyz)builder.instance;
                akyz2.c = 0;
                akyz2.b |= 0x1;
                akyz = (akyz)builder.build();
            }
            a2.q(akyz);
            ajpb ajpb;
            if ((ajpb = akpm.d) == null) {
                ajpb = ajpb.a;
            }
            if (ajpb.b == 131195200) {
                a2.e.d(a2.q, akpm);
                ajpb ajpb2;
                if ((ajpb2 = akpm.d) == null) {
                    ajpb2 = ajpb.a;
                }
                if (ajpb2.b == 131195200) {
                    a = ajpb2.c;
                }
                else {
                    a = ajpc.a;
                }
                if (((ajpc)a).c == 6) {
                    final int intValue = (int)((ajpc)a).d;
                    final j d2 = a2.d;
                    if (d2 != null) {
                        try {
                            d2.n(intValue);
                        }
                        catch (final RemoteException ex2) {}
                    }
                }
                if ((((ajpc)a).b & 0x4) != 0x0) {
                    aowb aowb;
                    if ((aowb = ((ajpc)a).e) == null) {
                        aowb = aowb.a;
                    }
                    a2.v(aowb);
                }
                if ((((ajpc)a).b & 0x80) != 0x0) {
                    anxb anxb;
                    if ((anxb = ((ajpc)a).f) == null) {
                        anxb = anxb.a;
                    }
                    final ajph ajph = (ajph)((ahcu)anxb).rx((ahci)ajpi.a);
                    a2.g.a(ajph, (b)a2);
                    anxb anxb2;
                    if ((anxb2 = ajph.e) == null) {
                        anxb2 = anxb.a;
                    }
                    anxb anxb3;
                    if ((anxb3 = ((ajpg)((ahcu)anxb2).rx((ahci)ajpi.c)).c) == null) {
                        anxb3 = anxb.a;
                    }
                    a2.i.b((aooo)((ahcu)anxb3).rx((ahci)SubscribeButtonRendererOuterClass.subscribeButtonRenderer), (e)a2, a2.k, (com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b)a2);
                }
                if ((((ajpc)a).b & 0x200) != 0x0) {
                    final a m = a2.m;
                    anxb anxb4;
                    if ((anxb4 = ((ajpc)a).h) == null) {
                        anxb4 = anxb.a;
                    }
                    m.b((aies)((ahcu)anxb4).rx((ahci)ButtonRendererOuterClass.buttonRenderer), (com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b)a2);
                }
                if ((((ajpc)a).b & 0x100) != 0x0) {
                    anxb anxb5;
                    if ((anxb5 = ((ajpc)a).g) == null) {
                        anxb5 = anxb.a;
                    }
                    a2.r(anxb5, a2.t, a2.g.b.toString());
                }
            }
        }
    }
}
