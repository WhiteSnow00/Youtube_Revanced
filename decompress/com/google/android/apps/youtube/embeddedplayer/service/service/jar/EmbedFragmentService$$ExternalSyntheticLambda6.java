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

public final class EmbedFragmentService$$ExternalSyntheticLambda6 implements tet
{
    public EmbedFragmentService a;
    
    public EmbedFragmentService$$ExternalSyntheticLambda6(final EmbedFragmentService a) {
        this.a = a;
    }
    
    public final void a(Object a) {
        final EmbedFragmentService a2 = this.a;
        final aknl aknl = (aknl)a;
        final int v = EmbedFragmentService.v;
        a2.f.f(Tick.k);
        if (aknl != null) {
            final j d = a2.d;
            if (d != null) {
                try {
                    ajnl ajnl;
                    if ((ajnl = aknl.g) == null) {
                        ajnl = ajnl.a;
                    }
                    d.b(new PermissionsWrapper(ajnl));
                }
                catch (final RemoteException ex) {
                    a2.l();
                }
            }
            akwz akwz;
            if ((aknl.b & 0x20) != 0x0) {
                if ((akwz = aknl.f) == null) {
                    akwz = akwz.a;
                }
            }
            else {
                final ahaz builder = akwz.a.createBuilder();
                builder.copyOnWrite();
                final akwz akwz2 = (akwz)builder.instance;
                akwz2.c = 0;
                akwz2.b |= 0x1;
                akwz = (akwz)builder.build();
            }
            a2.q(akwz);
            ajnc ajnc;
            if ((ajnc = aknl.d) == null) {
                ajnc = ajnc.a;
            }
            if (ajnc.b == 131195200) {
                a2.e.d(a2.q, aknl);
                ajnc ajnc2;
                if ((ajnc2 = aknl.d) == null) {
                    ajnc2 = ajnc.a;
                }
                if (ajnc2.b == 131195200) {
                    a = ajnc2.c;
                }
                else {
                    a = ajnd.a;
                }
                if (((ajnd)a).c == 6) {
                    final int intValue = (int)((ajnd)a).d;
                    final j d2 = a2.d;
                    if (d2 != null) {
                        try {
                            d2.n(intValue);
                        }
                        catch (final RemoteException ex2) {}
                    }
                }
                if ((((ajnd)a).b & 0x4) != 0x0) {
                    aotp aotp;
                    if ((aotp = ((ajnd)a).e) == null) {
                        aotp = aotp.a;
                    }
                    a2.v(aotp);
                }
                if ((((ajnd)a).b & 0x80) != 0x0) {
                    anuv anuv;
                    if ((anuv = ((ajnd)a).f) == null) {
                        anuv = anuv.a;
                    }
                    final ajni ajni = (ajni)((ahbc)anuv).rx((ahaq)ajnj.a);
                    a2.g.a(ajni, (b)a2);
                    anuv anuv2;
                    if ((anuv2 = ajni.e) == null) {
                        anuv2 = anuv.a;
                    }
                    anuv anuv3;
                    if ((anuv3 = ((ajnh)((ahbc)anuv2).rx((ahaq)ajnj.c)).c) == null) {
                        anuv3 = anuv.a;
                    }
                    a2.i.b((aome)((ahbc)anuv3).rx((ahaq)SubscribeButtonRendererOuterClass.subscribeButtonRenderer), (e)a2, a2.k, (com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b)a2);
                }
                if ((((ajnd)a).b & 0x200) != 0x0) {
                    final a m = a2.m;
                    anuv anuv4;
                    if ((anuv4 = ((ajnd)a).h) == null) {
                        anuv4 = anuv.a;
                    }
                    m.b((aicz)((ahbc)anuv4).rx((ahaq)ButtonRendererOuterClass.buttonRenderer), (com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b)a2);
                }
                if ((((ajnd)a).b & 0x100) != 0x0) {
                    anuv anuv5;
                    if ((anuv5 = ((ajnd)a).g) == null) {
                        anuv5 = anuv.a;
                    }
                    a2.r(anuv5, a2.t, a2.g.b.toString());
                }
            }
        }
    }
}
