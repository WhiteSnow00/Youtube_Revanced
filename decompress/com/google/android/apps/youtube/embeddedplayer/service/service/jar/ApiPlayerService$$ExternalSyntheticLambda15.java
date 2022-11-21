// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.apps.youtube.embeddedplayer.service.permissions.a;

public final class ApiPlayerService$$ExternalSyntheticLambda15 implements Runnable
{
    public final ApiPlayerService a;
    public final String b;
    
    public ApiPlayerService$$ExternalSyntheticLambda15(final ApiPlayerService a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final ApiPlayerService a = this.a;
        final String b = this.b;
        final lpe a2 = a.a;
        final mba v = a2.V;
        final a a3 = com.google.android.apps.youtube.embeddedplayer.service.permissions.a.a;
        final ajpd p = jzq.p((vbo)v.c);
        ListenableFuture listenableFuture;
        if (p != null && p.d) {
            listenableFuture = afvh.f((ListenableFuture)afxb.m(((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a)v.b).a()), (afvq)new ilh(a3, 19), (Executor)v.a);
        }
        else {
            listenableFuture = afxe.a;
        }
        tfx.i(listenableFuture, (tfw)new jno(a2, b, 7));
    }
}
