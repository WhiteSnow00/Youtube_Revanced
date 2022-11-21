// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.o;
import com.google.android.apps.youtube.embeddedplayer.service.model.e;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.s;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData;
import java.lang.ref.WeakReference;

final class h
{
    public static final h a;
    final WeakReference b;
    PlaybackEventData c;
    boolean d;
    
    static {
        a = new h(null);
    }
    
    public h(final s s) {
        this.d = false;
        this.b = new WeakReference((T)s);
    }
    
    public final void a() {
        synchronized (this) {
            final e g = PlaybackEventData.g();
            g.d(5);
            final PlaybackEventData c = this.c;
            String f;
            if (c != null) {
                f = c.f();
            }
            else {
                f = null;
            }
            g.a = f;
            g.e(Long.MIN_VALUE);
            g.c(0L);
            final PlaybackEventData c2 = this.c;
            float a;
            if (c2 != null) {
                a = c2.a();
            }
            else {
                a = 1.0f;
            }
            g.b(a);
            this.b(g.a());
        }
    }
    
    public final void b(final PlaybackEventData c) {
        synchronized (this) {
            if (c.equals(this.c)) {
                return;
            }
            final s s = (s)this.b.get();
            if (s == null) {
                return;
            }
            if (this.d && c.b() == 1) {
                return;
            }
            if (c.b() == 1) {
                this.d = true;
            }
            else if (c.b() == 5) {
                this.d = false;
            }
            s.d.post((Runnable)new gtw(s, c.c(), 6));
            s.d.post((Runnable)new o(s, c.b(), c.f(), c.e(), 0));
            this.c = c;
        }
    }
    
    public final boolean c(final s s) {
        synchronized (this) {
            return aexq.c(this.b.get(), s);
        }
    }
}
