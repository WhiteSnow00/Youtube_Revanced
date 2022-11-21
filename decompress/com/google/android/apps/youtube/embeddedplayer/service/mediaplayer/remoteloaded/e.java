// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

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
    
    public e(final mjs b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final mmo b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final mok b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final msw b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final rei b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final saw b, final int a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final toz b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final uht b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final wjc b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public e(final wjm b, final int a, final int c) {
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
                final wjm wjm = (wjm)b;
                final adva a2 = wjm.A;
                if (a2 != null) {
                    a2.a(a);
                    wjm.A = null;
                    return;
                }
                break;
            }
            case 19: {
                final Object b2 = this.b;
                final int a3 = this.a;
                final wjd m = ((wjm)b2).m;
                if (m != null) {
                    m.a(a3);
                }
                return;
            }
            case 18: {
                ((wjc)this.b).b(new int[] { this.a });
                return;
            }
            case 17: {
                final Object b3 = this.b;
                final int a4 = this.a;
                final uht uht = (uht)b3;
                if (!tqf.bQ(uht.d)) {
                    return;
                }
                uht.e.setAlpha(1.0f);
                uht.e.setVisibility(0);
                uht.d(uht.c);
                tqf.aG((View)uht.e, (atnb)new qbm(19), tqf.an(new tvv[] { tqf.aE(-1, -2), tqf.aB(a4 - uht.e.getMeasuredHeight()) }), (Class)FrameLayout$LayoutParams.class);
                return;
            }
            case 16: {
                ((toz)this.b).e(this.a, -1);
                return;
            }
            case 15: {
                final Object b4 = this.b;
                final int a5 = this.a;
                final saw saw = (saw)b4;
                final znz c2 = ((zoa)saw.d).c();
                final afgh y = ((rnk)saw.a).y();
                int n;
                if ("youtube-direct".equals(rmc.b(c2))) {
                    final afjx afjx = (afjx)y;
                    final int c3 = afjx.c;
                    boolean b5 = false;
                    while (i < c3) {
                        b5 |= c2.b().equals(y.get(i).c);
                        ++i;
                    }
                    if (b5) {
                        n = 13;
                    }
                    else if (y.isEmpty()) {
                        n = 10;
                    }
                    else if (afjx.c == 1) {
                        n = 11;
                    }
                    else {
                        n = 12;
                    }
                }
                else if ("youtube-delegated".equals(rmc.b(c2))) {
                    n = 14;
                }
                else if ("youtube-incognito".equals(rmc.b(c2))) {
                    n = 15;
                }
                else {
                    n = 16;
                }
                saw.h(a5, 3, n);
                return;
            }
            case 14: {
                final rei rei = (rei)this.b;
                if (rei.i != null) {
                    rei.l(this.a);
                }
                return;
            }
            case 13: {
                ((msw)this.b).k(this.a);
                return;
            }
            case 12: {
                ((mok)this.b).o.l(this.a);
                return;
            }
            case 11: {
                ((mmo)this.b).stopSelf(this.a);
                return;
            }
            case 10: {
                final Object b6 = this.b;
                final int a6 = this.a;
                if (a6 == 0) {
                    final mjt a7 = ((mjs)b6).a;
                    a7.s = 2;
                    a7.c = true;
                    a7.d = true;
                    synchronized (a7.r) {
                        final Iterator iterator = ((mjs)b6).a.r.iterator();
                        while (iterator.hasNext()) {
                            ((mgh)iterator.next()).g();
                        }
                        return;
                    }
                }
                final mjs mjs = (mjs)b6;
                final mjt a8 = mjs.a;
                a8.s = 1;
                synchronized (a8.r) {
                    final Iterator iterator2 = ((mjs)b6).a.r.iterator();
                    while (iterator2.hasNext()) {
                        ((mgh)iterator2.next()).h(a6);
                    }
                    monitorexit(a8.r);
                    mjs.a.i();
                }
            }
            case 9: {
                final Object b7 = this.b;
                final int a9 = this.a;
                final mjt a10 = ((mjs)b7).a;
                a10.s = 3;
                synchronized (a10.r) {
                    final Iterator iterator3 = ((mjs)b7).a.r.iterator();
                    while (iterator3.hasNext()) {
                        ((mgh)iterator3.next()).i(a9);
                    }
                }
            }
            case 8: {
                final Object b8 = this.b;
                final int a11 = this.a;
                final mjs mjs2 = (mjs)b8;
                final mjt a12 = mjs2.a;
                a12.l = -1;
                a12.m = -1;
                a12.h = null;
                a12.i = null;
                a12.j = 0.0;
                a12.n();
                a12.k = false;
                a12.n = null;
                final mjt a13 = mjs2.a;
                a13.s = 1;
                synchronized (a13.r) {
                    final Iterator iterator4 = ((mjs)b8).a.r.iterator();
                    while (iterator4.hasNext()) {
                        ((mgh)iterator4.next()).j(a11);
                    }
                    monitorexit(a13.r);
                    mjs2.a.i();
                    final mjt a14 = mjs2.a;
                    a14.o((mor)a14.b);
                }
            }
            case 7: {
                ((mjs)this.b).a.v.l(this.a);
                return;
            }
            case 6: {
                ((h)this.b).a.d(this.a);
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
                final abjz b10 = abjz.b;
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
