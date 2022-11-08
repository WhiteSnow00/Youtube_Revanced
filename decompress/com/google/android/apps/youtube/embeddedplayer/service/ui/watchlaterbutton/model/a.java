// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model;

import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.AutoValue_SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;

public final class a
{
    public String a;
    public String b;
    private int c;
    private agyc d;
    private byte e;
    
    public final WatchLaterButtonData a() {
        if (this.e == 1 && this.d != null) {
            return (WatchLaterButtonData)new AutoValue_WatchLaterButtonData(this.c, this.a, this.b, this.d);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" state");
        }
        if (this.d == null) {
            sb.append(" trackingParams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final int c) {
        this.c = c;
        this.e = 1;
    }
    
    public final void c(final agyc d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null trackingParams");
    }
    
    public final SubscribeButtonData d() {
        if (this.e == 1 && this.d != null) {
            return (SubscribeButtonData)new AutoValue_SubscribeButtonData(this.c, this.a, this.b, this.d);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" state");
        }
        if (this.d == null) {
            sb.append(" trackingParams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void e(final int c) {
        this.c = c;
        this.e = 1;
    }
    
    public final void f(final agyc d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null trackingParams");
    }
}
