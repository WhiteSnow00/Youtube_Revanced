// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c;
import android.os.RemoteException;
import android.os.IBinder$DeathRecipient;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.a;
import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.j;

class EmbedFragmentServiceFactoryService$1 implements Runnable
{
    final j a;
    final int b;
    final AtomicReference c;
    final ConditionVariable d;
    final EmbedFragmentServiceFactoryService e;
    
    public EmbedFragmentServiceFactoryService$1(final EmbedFragmentServiceFactoryService e, final j a, final int b, final AtomicReference c, final ConditionVariable d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        final EmbedFragmentServiceFactoryService e = this.e;
        final EmbedFragmentService embedFragmentService = new EmbedFragmentService(e.a, e.b, this.a, e.c, e.d, this.b, (byte[])null);
        embedFragmentService.s = (veh)new EmbedFragmentService$$ExternalSyntheticLambda10(embedFragmentService);
        embedFragmentService.g = new a(embedFragmentService.s, embedFragmentService.c);
        embedFragmentService.i = embedFragmentService.b.j().d(embedFragmentService.s);
        embedFragmentService.k = embedFragmentService.b.i().c(embedFragmentService.s);
        embedFragmentService.m = embedFragmentService.b.k().e(embedFragmentService.s);
        embedFragmentService.o = com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.a.b(embedFragmentService.e, embedFragmentService.a);
        embedFragmentService.h = embedFragmentService.g;
        embedFragmentService.j = (c)embedFragmentService.i;
        embedFragmentService.l = (com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c)embedFragmentService.k;
        embedFragmentService.n = (com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c)embedFragmentService.m;
        embedFragmentService.p = (d)embedFragmentService.o;
        embedFragmentService.u.a((lqd)embedFragmentService);
        try {
            final j d = embedFragmentService.d;
            if (d != null) {
                d.asBinder().linkToDeath((IBinder$DeathRecipient)embedFragmentService, 0);
            }
        }
        catch (final RemoteException ex) {
            embedFragmentService.l();
        }
        this.c.set(embedFragmentService);
        this.d.open();
    }
}
