// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded;

import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.jar.k;
import android.app.Activity;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.app.Dialog;

public final class a extends Dialog
{
    public final ViewGroup a;
    private final View b;
    private ViewGroup c;
    private final oqz d;
    
    public a(final Context context, final oqz d, final View b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(context, 16973834);
        this.d = d;
        this.b = b;
        this.a = (ViewGroup)new FrameLayout(context);
    }
    
    public final void onBackPressed() {
        ((Activity)((k)((aeix)this.d.a).F).a).onBackPressed();
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return ((aeix)this.d.a).ay(n, keyEvent) || super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return ((aeix)this.d.a).az(n, keyEvent) || super.onKeyUp(n, keyEvent);
    }
    
    protected final void onStart() {
        super.onStart();
        (this.c = (ViewGroup)this.b.getParent()).removeView(this.b);
        this.a.addView(this.b, -1, -1);
        this.d.l();
    }
    
    protected final void onStop() {
        this.a.removeView(this.b);
        this.c.addView(this.b);
        this.d.l();
        super.onStop();
    }
}
