// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.CancellationException;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.Collection;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import java.util.ArrayList;
import java.util.List;

public final class o implements asjm
{
    public final boolean a;
    public final Object b;
    private final int c;
    
    public o(final ablu b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public o(final String b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public o(final List b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int c = this.c;
        if (c == 0) {
            ((t)o).m(kzr.j(2, (String)null, (String)this.b, new ArrayList(), t.a(this.a), 0, 0));
            return;
        }
        if (c == 1) {
            ((t)o).m(SimplePlaybackDescriptor.c((String)this.b, t.a(this.a)));
            return;
        }
        if (c == 2) {
            final Object b = this.b;
            final boolean a = this.a;
            final t t = (t)o;
            new ArrayList();
            t.m(kzr.j(3, (String)null, (String)null, new ArrayList((Collection<? extends E>)b), com.google.android.apps.youtube.embeddedplayer.service.jar.client.t.a(a), 0, 0));
            return;
        }
        if (c == 3) {
            final Object b2 = this.b;
            final boolean a2 = this.a;
            final WatchNextResponseModel j = (WatchNextResponseModel)o;
            final ablu ablu = (ablu)b2;
            ablu.j = j;
            ablu.e(a2);
            return;
        }
        if (c == 4) {
            final Object b3 = this.b;
            final boolean a3 = this.a;
            final Throwable t2 = (Throwable)o;
            if (t2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
                ttr.d("Problem fetching WatchNext response", t2);
                ((ablu)b3).k = t2;
            }
            else {
                final ablu ablu2 = (ablu)b3;
                if (ablu2.o.j() && (t2 instanceof CancellationException || t2.getCause() instanceof CancellationException)) {
                    ttr.d("WatchNext response cancelled", t2);
                    ablu2.f(false);
                }
                else {
                    ttr.d("Problem fetching WatchNext response", t2);
                    ablu2.k = t2;
                }
            }
            ((ablu)b3).e(a3);
            return;
        }
        if (c != 5) {
            final Object b4 = this.b;
            final boolean a4 = this.a;
            final Throwable t3 = (Throwable)o;
            final ablu ablu3 = (ablu)b4;
            if (ablu3.o.j() && (t3 instanceof CancellationException || t3.getCause() instanceof CancellationException)) {
                ttr.d("Player response cancelled", t3);
                ablu3.f(false);
            }
            else if (t3 instanceof TimeoutException) {
                ttr.d("Problem fetching player response", t3);
                ablu3.m = t3;
            }
            else if (t3 instanceof InterruptedException) {
                ttr.d("Problem fetching player response", t3);
                ablu3.m = t3;
            }
            else if (t3 instanceof IllegalStateException) {
                if (ablu3.o.e()) {
                    ttr.d("Deferred player response still not completed", t3);
                    ablu3.m = t3;
                }
            }
            else {
                ttr.d("Problem fetching player response", t3);
                ablu3.m = t3;
            }
            if (!a4) {
                ablu3.a();
            }
            return;
        }
        final Object b5 = this.b;
        final boolean a5 = this.a;
        final PlayerResponseModel l = (PlayerResponseModel)o;
        final ablu ablu4 = (ablu)b5;
        ablu4.l = l;
        ablu4.i = false;
        if (!a5) {
            ablu4.a();
        }
    }
}
