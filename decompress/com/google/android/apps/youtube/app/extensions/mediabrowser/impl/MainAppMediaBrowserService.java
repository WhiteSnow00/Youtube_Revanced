// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.mediabrowser.impl;

import android.support.v4.media.session.MediaSessionCompat$Token;
import android.os.Bundle;
import java.util.Collections;

public class MainAppMediaBrowserService extends gud
{
    public gue f;
    public atke g;
    public atke h;
    
    public final void b(final awz awz) {
        awz.b((Object)Collections.emptyList());
    }
    
    public final bab e(final String s) {
        if (s.equals("com.android.systemui")) {
            return null;
        }
        return new bab((Bundle)null);
    }
    
    public final void onCreate() {
        super.onCreate();
        final eg eg = (eg)this.f.e.a();
        eg.l();
        final MediaSessionCompat$Token b = eg.b();
        if (b == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (((axd)this).d == null) {
            ((axd)this).d = b;
            final awt e = ((axd)this).e;
            e.d.c.a((Runnable)new vs(e, b, 17));
            return;
        }
        throw new IllegalStateException("The session token has already been set");
    }
    
    public final void onDestroy() {
        ((abms)this.h.a()).b(((abpu)this.g.a()).e().i);
    }
}
