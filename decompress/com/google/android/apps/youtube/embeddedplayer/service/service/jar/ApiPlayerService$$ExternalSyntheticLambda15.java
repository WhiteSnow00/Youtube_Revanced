// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.apps.youtube.embeddedplayer.service.permissions.a;

public final class ApiPlayerService$$ExternalSyntheticLambda15 implements Runnable
{
    public ApiPlayerService a;
    public String b;
    
    public ApiPlayerService$$ExternalSyntheticLambda15(final ApiPlayerService a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final ApiPlayerService a = this.a;
        final String b = this.b;
        final lor a2 = a.a;
        final mam v = a2.V;
        final a a3 = com.google.android.apps.youtube.embeddedplayer.service.permissions.a.a;
        final ajne x = mft.x((vaf)v.c);
        ListenableFuture listenableFuture;
        if (x != null && x.d) {
            listenableFuture = aftq.f((ListenableFuture)afvk.m(((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a)v.b).a()), (aftz)new ila(a3, 19), (Executor)v.a);
        }
        else {
            listenableFuture = afvn.a;
        }
        teu.i(listenableFuture, (tet)new jnd(a2, b, 7));
    }
}
