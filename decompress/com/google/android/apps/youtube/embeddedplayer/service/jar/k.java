// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

import android.app.ActionBar;
import android.view.Window;
import android.app.Activity;

public final class k implements a
{
    public final Object a;
    private final int b;
    
    public k(final Activity a, final int b) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public k(final Window a, final int b) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final int a() {
        if (this.b != 0) {
            return System.identityHashCode(this.a);
        }
        return System.identityHashCode(this.a);
    }
    
    @Override
    public final int b() {
        if (this.b != 0) {
            return ((Activity)this.a).getRequestedOrientation();
        }
        throw null;
    }
    
    @Override
    public final ActionBar c() {
        if (this.b != 0) {
            return ((Activity)this.a).getActionBar();
        }
        return null;
    }
    
    @Override
    public final Window d() {
        if (this.b != 0) {
            return ((Activity)this.a).getWindow();
        }
        return (Window)this.a;
    }
    
    @Override
    public final boolean e() {
        return this.b != 0 && ((Activity)this.a).isFinishing();
    }
    
    @Override
    public final boolean f() {
        return this.b != 0 && ((Activity)this.a).isInMultiWindowMode();
    }
}
