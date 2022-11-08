// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded;

import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b;

public final class c extends aazp implements com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c
{
    public b a;
    public boolean b;
    private TextView d;
    private boolean e;
    
    public c(final Context context) {
        super(context);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void m() {
        this.e = false;
        this.X();
    }
    
    public final void n(final b a) {
        this.a = a;
    }
    
    public final void o(final boolean b) {
        this.b = b;
        this.e = true;
        this.Z(1);
        this.aa();
    }
    
    public final boolean oU() {
        return this.e;
    }
}
