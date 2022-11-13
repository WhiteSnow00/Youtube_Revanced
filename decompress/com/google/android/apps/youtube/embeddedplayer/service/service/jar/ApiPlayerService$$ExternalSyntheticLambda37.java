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
    public ApiPlayerService a;
    public EmbedsPrewarmData b;
    
    public ApiPlayerService$$ExternalSyntheticLambda37(final ApiPlayerService a, final EmbedsPrewarmData b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final ApiPlayerService a = this.a;
        final EmbedsPrewarmData b = this.b;
        final lor a2 = a.a;
        final a q = a2.Q;
        final aegw b2 = a2.b;
        final String a3 = ((loi)a2.a).c.a;
        final ajnf a4 = mft.A(q.j);
        final boolean b3 = true;
        final boolean b4 = a4 != null && a4.g;
        if (((List)q.f.b).contains(a3) && b4) {
            final int a5 = b.a();
            final abjp e = mft.q(b.b(), 0L).e();
            final boolean b5 = a5 != 2;
            e.d = b5;
            e.f = b5;
            final PlaybackStartDescriptor a6 = e.a();
            final ajne x = mft.x(q.h);
            if (x != null && x.b) {
                teu.i(q.e.a(), (tet)new joq(q, 13));
            }
            q.d.a = b2.a(b.b());
            q.c.b(a6.B(q.l), b.a() == 1 && b3);
            final ajnf a7 = mft.A(q.j);
            long n;
            if (a7 != null && (a7.b & 0x10000) != 0x0) {
                n = a7.h;
            }
            else {
                n = com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.a.a.toMillis();
            }
            final aqua a8 = abjy.a();
            a8.e(n);
            a8.d();
            a8.f(com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.a.b);
            final abjy c = a8.c();
            final acid k = q.k;
            if (((abrj)k.a).g()) {
                sl.c((ace)new ihc(k, a6, c, 4, (byte[])null, (byte[])null, (byte[])null));
                return;
            }
            sl.c((ace)new ihc(k, a6, c, 5, (byte[])null, (byte[])null, (byte[])null));
        }
    }
}
