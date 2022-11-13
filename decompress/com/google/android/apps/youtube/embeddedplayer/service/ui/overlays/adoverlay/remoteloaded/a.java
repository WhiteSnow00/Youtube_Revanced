// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g;
import java.util.Iterator;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder$Callback;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.h;

public final class a implements Runnable
{
    public final int a;
    public final int b;
    public final int c;
    public final eoa d;
    private final int e;
    
    public a(final h d, final int a, final int b, final int c, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public a(final b d, final int a, final int b, final int c, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        if (this.e != 0) {
            final eoa d = this.d;
            final int a = this.a;
            final int b = this.b;
            final int c = this.c;
            final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.b a2 = ((h)d).a;
            final Iterator iterator = a2.a.iterator();
            while (iterator.hasNext()) {
                ((SurfaceHolder$Callback)iterator.next()).surfaceChanged((SurfaceHolder)a2, a, b, c);
            }
            return;
        }
        final eoa d2 = this.d;
        final int a3 = this.a;
        final int b2 = this.b;
        final int c2 = this.c;
        final g a4 = ((b)d2).a;
        if (a4 != null) {
            a4.n(a3, b2, c2);
        }
    }
}
