// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import java.util.List;

public final class ApiPlayerService$$ExternalSyntheticLambda31 implements Runnable
{
    public final ApiPlayerService a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    
    public ApiPlayerService$$ExternalSyntheticLambda31(final ApiPlayerService a, final List b, final int c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void run() {
        this.a.a.h(this.b, this.c, this.d, this.e);
    }
}
