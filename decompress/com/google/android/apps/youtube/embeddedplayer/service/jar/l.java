// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

import android.app.ActionBar;
import android.view.Window;
import android.app.Activity;

public final class l implements a
{
    public final Object a;
    private final int b;
    
    public l(final Activity a, final int b) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public l(final Window a, final int b) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public final int a() {
        if (this.b != 0) {
            return System.identityHashCode(this.a);
        }
        return System.identityHashCode(this.a);
    }
    
    public final int b() {
        if (this.b != 0) {
            return ((Activity)this.a).getRequestedOrientation();
        }
        throw null;
    }
    
    public final ActionBar c() {
        if (this.b != 0) {
            return ((Activity)this.a).getActionBar();
        }
        return null;
    }
    
    public final Window d() {
        if (this.b != 0) {
            return ((Activity)this.a).getWindow();
        }
        return (Window)this.a;
    }
    
    public final boolean e() {
        return this.b != 0 && ((Activity)this.a).isFinishing();
    }
    
    public final boolean f() {
        return this.b != 0 && ((Activity)this.a).isInMultiWindowMode();
    }
}
