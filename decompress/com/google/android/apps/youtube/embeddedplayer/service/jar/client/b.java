// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k;
import android.view.SurfaceHolder;
import android.view.Surface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.n;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c;

public final class b implements Runnable
{
    public final Object a;
    private final int b;
    
    public b(final aa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public b(final s a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public b(final v a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public b(final v a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public b(final y a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public b(final c a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public b(final d a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public b(final e a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public b(final n a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.d a = ((n)this.a).a;
                if (a == null) {
                    break;
                }
                final zfm b = a.b;
                if (b != null) {
                    b.d();
                    return;
                }
                break;
            }
            case 19: {
                final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.d a2 = ((n)this.a).a;
                if (a2 != null) {
                    a2.c = null;
                    final zfm b2 = a2.b;
                    if (b2 != null) {
                        b2.f();
                    }
                }
                return;
            }
            case 18: {
                final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.d a3 = ((n)this.a).a;
                if (a3 != null) {
                    final zfm b3 = a3.b;
                    if (b3 != null) {
                        b3.d();
                    }
                }
                return;
            }
            case 17: {
                final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.b b4 = (com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.b)this.a;
                final Surface d = b4.d;
                if (d != null) {
                    d.release();
                    b4.d = null;
                    b4.a();
                }
                return;
            }
            case 16: {
                final SurfaceHolder c = ((e)this.a).c;
                if (c != null) {
                    c.setSizeFromLayout();
                }
                return;
            }
            case 15: {
                ((d)this.a).c.setVisibility(8);
                return;
            }
            case 14: {
                ((com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c)this.a).e();
                return;
            }
            case 13: {
                ((com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c)this.a).h();
                return;
            }
            case 12: {
                ((com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c)this.a).f();
                return;
            }
            case 11: {
                ((com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b)this.a).a.c();
                return;
            }
            case 10: {
                final y y = (y)this.a;
                y.a.j = false;
                y.c();
                return;
            }
            case 9: {
                final y y2 = (y)this.a;
                if (y2.a.g.c.getVisibility() == 0) {
                    aftr.l("Shutter view is visible while video is playing.");
                }
                y2.a.s.mk();
                final aa a4 = y2.a;
                a4.j = true;
                if (a4.f()) {
                    y2.a.w.g();
                }
                return;
            }
            case 8: {
                final y y3 = (y)this.a;
                y3.a.j = false;
                y3.c();
                return;
            }
            case 7: {
                ((c)this.a).e();
                return;
            }
            case 6: {
                final v v = (v)this.a;
                ((aa)v.a).x.g();
                ((aa)v.a).w.g();
                return;
            }
            case 5: {
                final aa aa = (aa)this.a;
                aa.t.m(aa.P, aa.e, aa.i);
                aa.r.i = new WeakReference(aa.e);
                final k o = aa.o;
                final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b i = aa.i;
                o.C = i;
                o.D.g = i;
                if (o.mm()) {
                    o.s.g = i;
                }
                return;
            }
            case 4: {
                final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e g = ((s)this.a).c.g;
                if (g != null) {
                    g.r = true;
                    g.m();
                }
                return;
            }
            case 3: {
                final Object a5 = this.a;
                try {
                    ((s)a5).k.g();
                }
                catch (final RemoteException ex) {
                    aftr.k("Problem dismissing fullscreen view.");
                }
            }
            case 2: {
                final s s = (s)this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.b c2 = s.c;
                final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b j = s.j;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e g2 = c2.g;
                if (g2 != null) {
                    g2.e = j;
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.e b5 = g2.b;
                    if (b5 != null) {
                        b5.g = j;
                    }
                }
                return;
            }
            case 1: {
                final v v2 = (v)this.a;
                ((aeix)v2.a).I.g();
                ((aeix)v2.a).H.g();
                return;
            }
            case 0: {
                ((c)this.a).e();
                break;
            }
        }
    }
}
