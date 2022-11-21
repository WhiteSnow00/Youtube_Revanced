// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.view.SurfaceHolder;
import android.os.RemoteException;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Process;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b;

public final class q implements Runnable
{
    public final int a;
    public final int b;
    public final Object c;
    private final int d;
    
    public q(final int a, final int b, final Runnable c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public q(final s c, final int a, final int b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public q(final b c, final int a, final int b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public q(final e c, final int a, final int b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public q(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.e c, final int a, final int b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public q(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b c, final int a, final int b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public q(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.e c, final int a, final int b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public q(final kqm c, final int a, final int b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final Object c;
        switch (this.d) {
            default: {
                final int a = this.a;
                final int b = this.b;
                c = this.c;
                if (a <= 0 || a > 10) {
                    final StringBuilder sb = new StringBuilder("Invalid java priority: ");
                    sb.append(a);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (oel.a[a - 1] != b) {
                    Process.setThreadPriority(b);
                    break;
                }
                break;
            }
            case 6: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.e)this.c).a.c(this.a, this.b);
                return;
            }
            case 5: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b)this.c).a.h(this.a, this.b);
                return;
            }
            case 4: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.e)this.c).a.e(this.a, this.b);
                return;
            }
            case 3: {
                final Object c2 = this.c;
                final int a2 = this.a;
                final int b2 = this.b;
                final SurfaceHolder c3 = ((e)c2).c;
                if (c3 != null) {
                    c3.setFixedSize(a2, b2);
                }
                return;
            }
            case 2: {
                ((b)this.c).a.a(this.a, this.b);
                return;
            }
            case 1: {
                final Object c4 = this.c;
                final int a3 = this.a;
                final int b3 = this.b;
                final GradientDrawable background = new GradientDrawable();
                background.setColors(new int[] { a3, b3 });
                ((kqm)c4).g.setBackground((Drawable)background);
                return;
            }
            case 0: {
                final Object c5 = this.c;
                final int a4 = this.a;
                final int b4 = this.b;
                try {
                    ((s)c5).k.h(a4, b4);
                    return;
                }
                catch (final RemoteException ex) {
                    aftr.k("Problem sending ad event to client.");
                    return;
                }
                break;
            }
        }
        ((Runnable)c).run();
    }
}
