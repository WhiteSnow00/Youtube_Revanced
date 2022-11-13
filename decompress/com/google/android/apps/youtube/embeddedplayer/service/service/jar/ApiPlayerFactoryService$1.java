// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.g;

class ApiPlayerFactoryService$1 implements Runnable
{
    final g a;
    final c b;
    final f c;
    final l d;
    final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c e;
    final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c f;
    final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c g;
    final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c h;
    final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f i;
    final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c j;
    final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c k;
    final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c l;
    final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c m;
    final com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c n;
    final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f o;
    final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f p;
    final boolean q;
    final AtomicReference r;
    final ConditionVariable s;
    final ApiPlayerFactoryService t;
    
    public ApiPlayerFactoryService$1(final ApiPlayerFactoryService t, final g a, final c b, final f c, final l d, final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c e, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c f, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c g, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c h, final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f i, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c j, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c k, final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c l, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c m, final com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c n, final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f o, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f p20, final boolean q, final AtomicReference r, final ConditionVariable s) {
        this.t = t;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p20;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public final void run() {
        final ApiPlayerFactoryService t = this.t;
        this.r.set(new ApiPlayerService(t.a, t.b, t.d, t.c, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (byte[])null));
        this.s.open();
    }
}
