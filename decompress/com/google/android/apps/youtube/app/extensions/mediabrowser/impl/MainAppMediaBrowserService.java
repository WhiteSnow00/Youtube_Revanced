// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.mediabrowser.impl;

import android.support.v4.media.session.MediaSessionCompat$Token;
import android.os.Bundle;
import java.util.Collections;

public class MainAppMediaBrowserService extends gtu
{
    public gtv f;
    public atjj g;
    public atjj h;
    
    public final void b(final awy awy) {
        awy.b((Object)Collections.emptyList());
    }
    
    public final baa e(final String s) {
        if (s.equals("com.android.systemui")) {
            return null;
        }
        return new baa((Bundle)null);
    }
    
    @Override
    public final void onCreate() {
        super.onCreate();
        final eg eg = (eg)this.f.e.a();
        eg.l();
        final MediaSessionCompat$Token b = eg.b();
        if (b == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (super.d == null) {
            super.d = b;
            final aws e = super.e;
            e.d.c.a((Runnable)new vs(e, b, 17));
            return;
        }
        throw new IllegalStateException("The session token has already been set");
    }
    
    public final void onDestroy() {
        ((abks)this.h.a()).b(((abns)this.g.a()).e().j);
    }
}
