// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.view.KeyEvent;

public final class ApiPlayerService$$ExternalSyntheticLambda9 implements Runnable
{
    public final ApiPlayerService a;
    public final int b;
    public final KeyEvent c;
    
    public ApiPlayerService$$ExternalSyntheticLambda9(final ApiPlayerService a, final int b, final KeyEvent c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        this.a.a.L(this.b, this.c);
    }
}
