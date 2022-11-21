// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.service;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.i;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.h;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c;

public final class a implements c
{
    public f a;
    private final h b;
    
    public a(final Handler handler, final f a) {
        this.a = a;
        final h b = new h(handler);
        this.b = b;
        try {
            a.b(b);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void m() {
        final f a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.a();
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void n(final b a) {
        this.b.a = a;
    }
    
    @Override
    public final void o(final boolean b) {
        final f a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.g(b);
        }
        catch (final RemoteException ex) {}
    }
}
