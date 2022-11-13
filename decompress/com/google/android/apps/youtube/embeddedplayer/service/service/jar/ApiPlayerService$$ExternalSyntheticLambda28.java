// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.view.KeyEvent;

public final class ApiPlayerService$$ExternalSyntheticLambda28 implements Runnable
{
    public ApiPlayerService a;
    public int b;
    public KeyEvent c;
    
    public ApiPlayerService$$ExternalSyntheticLambda28(final ApiPlayerService a, final int b, final KeyEvent c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        this.a.a.K(this.b, this.c);
    }
}
