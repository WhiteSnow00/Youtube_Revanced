// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import java.util.List;

public final class ApiPlayerService$$ExternalSyntheticLambda7 implements Runnable
{
    public final ApiPlayerService a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    
    public ApiPlayerService$$ExternalSyntheticLambda7(final ApiPlayerService a, final List b, final int c, final int d, final boolean e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void run() {
        this.a.a.p(this.b, this.c, this.d, this.e, this.f);
    }
}
