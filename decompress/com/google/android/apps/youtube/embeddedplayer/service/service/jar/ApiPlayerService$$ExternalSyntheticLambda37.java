// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import java.util.List;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;

public final class ApiPlayerService$$ExternalSyntheticLambda37 implements Runnable
{
    public final ApiPlayerService a;
    public final EmbedsPrewarmData b;
    
    public ApiPlayerService$$ExternalSyntheticLambda37(final ApiPlayerService a, final EmbedsPrewarmData b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final ApiPlayerService a = this.a;
        final EmbedsPrewarmData b = this.b;
        final lpe a2 = a.a;
        final a q = a2.Q;
        final aeip b2 = a2.b;
        final String a3 = ((lov)a2.a).c.a;
        final ajpe x = jzq.x(q.j);
        final boolean b3 = true;
        final boolean b4 = x != null && x.g;
        if (((List)q.f.b).contains(a3) && b4) {
            final int a4 = b.a();
            final abkw e = lma.t(b.b(), 0L).e();
            final boolean b5 = a4 != 2;
            e.d = b5;
            e.f = b5;
            final PlaybackStartDescriptor a5 = e.a();
            final ajpd p = jzq.p(q.h);
            if (p != null && p.b) {
                tfx.i(q.e.a(), (tfw)new jqo(q, 9));
            }
            q.d.a = b2.a(b.b());
            q.c.b(a5.B(q.l), b.a() == 1 && b3);
            final ajpe x2 = jzq.x(q.j);
            long n;
            if (x2 != null && (x2.b & 0x10000) != 0x0) {
                n = x2.h;
            }
            else {
                n = com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.a.a.toMillis();
            }
            final aqwt a6 = ablf.a();
            a6.e(n);
            a6.d();
            a6.f(com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.a.b);
            final ablf c = a6.c();
            final acjq k = q.k;
            if (((absv)k.a).g()) {
                sl.h((acf)new ihl(k, a5, c, 4, (byte[])null, (byte[])null, (byte[])null));
                return;
            }
            sl.h((acf)new ihl(k, a5, c, 5, (byte[])null, (byte[])null, (byte[])null));
        }
    }
}
