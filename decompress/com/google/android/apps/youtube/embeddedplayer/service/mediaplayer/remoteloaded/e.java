// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

import java.util.List;
import android.view.SurfaceHolder;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g;
import java.util.Iterator;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.h;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b;

public final class e implements Runnable
{
    public final int a;
    public final Object b;
    private final int c;
    
    public e(final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final b b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final h b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final mje b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final mma b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final mnv b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final msi b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final rdi b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final rzv b, final int a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final tnz b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final ugq b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final whu b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final wie b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        int i = 0;
        switch (c) {
            default: {
                final Object b = this.b;
                final int a = this.a;
                final wie wie = (wie)b;
                final adtj a2 = wie.A;
                if (a2 != null) {
                    a2.a(a);
                    wie.A = null;
                    return;
                }
                break;
            }
            case 19: {
                final Object b2 = this.b;
                final int a3 = this.a;
                final whv m = ((wie)b2).m;
                if (m != null) {
                    m.a(a3);
                }
                return;
            }
            case 18: {
                ((whu)this.b).b(new int[] { this.a });
                return;
            }
            case 17: {
                final Object b3 = this.b;
                final int a4 = this.a;
                final ugq ugq = (ugq)b3;
                if (!tpe.bQ(ugq.d)) {
                    return;
                }
                ugq.e.setAlpha(1.0f);
                ugq.e.setVisibility(0);
                ugq.d(ugq.c);
                tpe.aG((View)ugq.e, (atke)new qav(19), tpe.an(new tut[] { tpe.aE(-1, -2), tpe.aB(a4 - ugq.e.getMeasuredHeight()) }), (Class)FrameLayout$LayoutParams.class);
                return;
            }
            case 16: {
                ((tnz)this.b).e(this.a, -1);
                return;
            }
            case 15: {
                final Object b4 = this.b;
                final int a5 = this.a;
                final rzv rzv = (rzv)b4;
                final zme c2 = ((zmf)rzv.d).c();
                final afeq y = ((rmk)rzv.a).y();
                int n;
                if ("youtube-direct".equals(rky.a(c2))) {
                    final afih afih = (afih)y;
                    final int c3 = afih.c;
                    boolean b5 = false;
                    while (i < c3) {
                        b5 |= c2.b().equals(((List<aejz>)y).get(i).c);
                        ++i;
                    }
                    if (b5) {
                        n = 13;
                    }
                    else if (((List)y).isEmpty()) {
                        n = 10;
                    }
                    else if (afih.c == 1) {
                        n = 11;
                    }
                    else {
                        n = 12;
                    }
                }
                else if ("youtube-delegated".equals(rky.a(c2))) {
                    n = 14;
                }
                else if ("youtube-incognito".equals(rky.a(c2))) {
                    n = 15;
                }
                else {
                    n = 16;
                }
                rzv.h(a5, 3, n);
                return;
            }
            case 14: {
                final rdi rdi = (rdi)this.b;
                if (rdi.i != null) {
                    rdi.l(this.a);
                }
                return;
            }
            case 13: {
                ((msi)this.b).k(this.a);
                return;
            }
            case 12: {
                ((mnv)this.b).o.U(this.a);
                return;
            }
            case 11: {
                ((mma)this.b).stopSelf(this.a);
                return;
            }
            case 10: {
                final Object b6 = this.b;
                final int a6 = this.a;
                if (a6 == 0) {
                    final mjf a7 = ((mje)b6).a;
                    a7.s = 2;
                    a7.c = true;
                    a7.d = true;
                    synchronized (a7.r) {
                        final Iterator iterator = ((mje)b6).a.r.iterator();
                        while (iterator.hasNext()) {
                            ((jgk)iterator.next()).P();
                        }
                        return;
                    }
                }
                final mje mje = (mje)b6;
                final mjf a8 = mje.a;
                a8.s = 1;
                synchronized (a8.r) {
                    final Iterator iterator2 = ((mje)b6).a.r.iterator();
                    while (iterator2.hasNext()) {
                        ((jgk)iterator2.next()).Q(a6);
                    }
                    monitorexit(a8.r);
                    mje.a.i();
                }
            }
            case 9: {
                final Object b7 = this.b;
                final int a9 = this.a;
                final mjf a10 = ((mje)b7).a;
                a10.s = 3;
                synchronized (a10.r) {
                    final Iterator iterator3 = ((mje)b7).a.r.iterator();
                    while (iterator3.hasNext()) {
                        ((jgk)iterator3.next()).R(a9);
                    }
                }
            }
            case 8: {
                final Object b8 = this.b;
                final int a11 = this.a;
                final mje mje2 = (mje)b8;
                final mjf a12 = mje2.a;
                a12.l = -1;
                a12.m = -1;
                a12.h = null;
                a12.i = null;
                a12.j = 0.0;
                a12.n();
                a12.k = false;
                a12.n = null;
                final mjf a13 = mje2.a;
                a13.s = 1;
                synchronized (a13.r) {
                    final Iterator iterator4 = ((mje)b8).a.r.iterator();
                    while (iterator4.hasNext()) {
                        ((jgk)iterator4.next()).S(a11);
                    }
                    monitorexit(a13.r);
                    mje2.a.i();
                    final mjf a14 = mje2.a;
                    a14.o((moc)a14.b);
                }
            }
            case 7: {
                ((mje)this.b).a.v.U(this.a);
                return;
            }
            case 6: {
                ((h)this.b).a.g(this.a);
                return;
            }
            case 5: {
                ((com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e)this.b).c(this.a);
                return;
            }
            case 4: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b)this.b).a.p(this.a);
                return;
            }
            case 3: {
                final Object b9 = this.b;
                final int a15 = this.a;
                final abis b10 = abis.b;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e e = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)b9;
                e.c(b10);
                e.c.x(a15);
                e.j = false;
                return;
            }
            case 2: {
                final Object b11 = this.b;
                final int a16 = this.a;
                final g a17 = ((b)b11).a;
                if (a17 != null) {
                    a17.o(a16);
                }
                return;
            }
            case 1: {
                final Object b12 = this.b;
                final int a18 = this.a;
                final SurfaceHolder c4 = ((com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e)b12).c;
                if (c4 != null) {
                    c4.setType(a18);
                }
                return;
            }
            case 0: {
                final Object b13 = this.b;
                final int a19 = this.a;
                final SurfaceHolder c5 = ((com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e)b13).c;
                if (c5 != null) {
                    c5.setFormat(a19);
                    break;
                }
                break;
            }
        }
    }
}
