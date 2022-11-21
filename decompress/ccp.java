import android.content.pm.PackageInfo;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.app.Activity;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.s;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import androidx.work.impl.foreground.SystemForegroundService;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccp implements Runnable
{
    final int a;
    final Object b;
    private final int c;
    
    public ccp(final aeix b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final View b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final SystemForegroundService b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final ao b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final ccq b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final OfflinePrefsFragment b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final InlinePlaybackController b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final s b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final b b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final emn b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final erv b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final gxg b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final hez b, final int a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final hgf b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final hnn b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final jyy b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccp(final khs b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        Object i = null;
        int n = 4;
    Block_40_Outer:
        while (true) {
            Label_1123: {
                switch (c) {
                    default: {
                        ((b)this.b).a.d(this.a);
                        return;
                    }
                    case 19: {
                        ((b)this.b).a.g(this.a);
                        return;
                    }
                    case 18: {
                        final Object b = this.b;
                        final int a = this.a;
                        final e g = ((s)b).c.g;
                        if (g != null) {
                            g.j = a;
                            final atky t = g.t;
                            if (t != null) {
                                t.E(a);
                            }
                            final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.e b2 = g.b;
                            if (b2 != null) {
                                b2.k(a);
                            }
                        }
                        return;
                    }
                    case 17: {
                        final Object b3 = this.b;
                        final int a2 = this.a;
                        try {
                            ((s)b3).k.j(a2);
                        }
                        catch (final RemoteException ex) {
                            aftr.k("Problem sending error to client.");
                        }
                    }
                    case 16: {
                        final Object b4 = this.b;
                        final int a3 = this.a;
                        final aeix aeix = (aeix)b4;
                        final aejd o = aeix.O;
                        if (o != null && aeix.aw()) {
                            try {
                                o.a(aftr.m(a3));
                            }
                            catch (final RemoteException ex2) {
                                throw new aejn(ex2);
                            }
                        }
                        return;
                    }
                    case 15: {
                        ((khs)this.b).b.aa(this.a);
                        return;
                    }
                    case 14: {
                        final Object b5 = this.b;
                        final int a4 = this.a;
                        final khs khs = (khs)b5;
                        final Context d = khs.d;
                        if (d != null) {
                            if (!((Activity)d).isDestroyed()) {
                                final oo h = khs.b.h(a4);
                                if (h != null) {
                                    h.a.performClick();
                                }
                            }
                        }
                        return;
                    }
                    case 13: {
                        final Object b6 = this.b;
                        final int a5 = this.a;
                        final InlinePlaybackController inlinePlaybackController = (InlinePlaybackController)b6;
                        final kbx m = inlinePlaybackController.m;
                        if (m != null) {
                            m.c(a5, false);
                            final wko q = inlinePlaybackController.q;
                            if (q != null) {
                                q.b();
                                inlinePlaybackController.q = null;
                            }
                        }
                        return;
                    }
                    case 12: {
                        final Object b7 = this.b;
                        final int a6 = this.a;
                        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)((jyy)b7).g.n;
                        if (linearLayoutManager != null) {
                            final View t2 = linearLayoutManager.T(a6);
                            if (t2 != null) {
                                t2.requestFocus();
                                t2.sendAccessibilityEvent(8);
                            }
                        }
                        return;
                    }
                    case 11: {
                        tqf.x((Context)((OfflinePrefsFragment)this.b).oa(), this.a, 0);
                        return;
                    }
                    case 10: {
                        final Object b8 = this.b;
                        final int a7 = this.a;
                        final hnn hnn = (hnn)b8;
                        if (hnn.D && a7 == hnn.B && a7 != hnn.p.C(hnn.z)) {
                            hnn.j(false);
                        }
                        return;
                    }
                    case 9: {
                        final Object b9 = this.b;
                        final int a8 = this.a;
                        final tym g2 = ((hgf)b9).g;
                        if (g2 != null) {
                            g2.h(a8);
                        }
                        return;
                    }
                    case 8: {
                        ((View)this.b).setVisibility(this.a);
                        return;
                    }
                    case 7: {
                        ((gxg)((hez)this.b).a).B(this.a);
                        return;
                    }
                    case 6: {
                        ((gxg)this.b).F(this.a);
                        return;
                    }
                    case 5: {
                        final Object b10 = this.b;
                        final int a9 = this.a;
                        erv erv;
                        while (true) {
                            erv = (erv)b10;
                            final int value = erv.d.get();
                            if (value != 0) {
                                if (a9 <= value) {
                                    return;
                                }
                                if (erv.d.compareAndSet(value, a9)) {
                                    return;
                                }
                                continue;
                            }
                            else {
                                if (erv.d.compareAndSet(0, a9)) {
                                    break;
                                }
                                continue;
                            }
                        }
                        int value2;
                        do {
                            value2 = erv.d.get();
                            erv.b(value2);
                            erv.a(value2);
                        } while (!erv.d.compareAndSet(value2, 0));
                        return;
                    }
                    case 3: {
                        break Label_1123;
                    }
                    case 2: {
                        break Label_1123;
                    }
                    case 1: {
                        break Label_1123;
                    }
                    case 4: {
                        final Object o2 = this.b;
                        final int a10 = this.a;
                        if (a10 > 0)
                        break Label_0849;
                    }
                    case 0: {
                        Label_1283: {
                            break Label_1283;
                            final int a10;
                            final long n2 = a10 * 1000;
                            try {
                                Thread.sleep(n2);
                                try {
                                    final Object o2;
                                    final PackageInfo packageInfo = ((emn)o2).a.getPackageManager().getPackageInfo(((emn)o2).a.getPackageName(), 0);
                                    final Context a11 = ((emn)o2).a;
                                    i = ntt.T(a11, a11.getPackageName(), Integer.toString(packageInfo.versionCode));
                                }
                                finally {}
                                ((emn)this.b).i = (ehw)i;
                                if (this.a < 4) {
                                    if (i != null) {
                                        if ((((ehw)i).b & 0x400000) != 0x0 && !((ehw)i).s.equals("0000000000000000000000000000000000000000000000000000000000000000") && (((ehw)i).d & 0x4000000) != 0x0) {
                                            Object o2;
                                            if ((o2 = ((ehw)i).ak) == null) {
                                                o2 = ehz.a;
                                            }
                                            if ((((ehz)o2).b & 0x1) != 0x0) {
                                                o2 = ((ehw)i).ak;
                                                if ((i = o2) == null) {
                                                    i = ehz.a;
                                                }
                                                if (((ehz)i).c != -2L) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    i = this.b;
                                    ((emn)i).e(this.a + 1);
                                }
                                return;
                                Label_1234: {
                                    ((accd)i).a.qp();
                                }
                                n = 2;
                                while (true) {
                                Block_38_Outer:
                                    while (true) {
                                        break Label_1265;
                                        i = ((ao)this.b).a;
                                        final int a12 = this.a;
                                        i = ((ocm)i).a;
                                        iftrue(Label_1282:)(i == null);
                                        while (true) {
                                            Block_39: {
                                                break Block_39;
                                                Label_1196:
                                                n = 1;
                                                break Label_1265;
                                                ((ccw)i).f(this.a);
                                                Label_1122:
                                                return;
                                                ((ccw)i).e(this.a);
                                                return;
                                            }
                                            switch([Lcom.strobel.decompiler.ast.Label;@b94a1d)(a12);
                                            Label_1252:
                                            n = 6;
                                            ((accd)i).a.qn(acce.l(n));
                                            return;
                                            ((SystemForegroundService)this.b).c.cancel(this.a);
                                            return;
                                            i = ((ccq)this.b).b.c.p;
                                            iftrue(Label_1122:)(i == null);
                                            continue Block_40_Outer;
                                        }
                                        Label_1201:
                                        final Object o2 = i;
                                        ((accd)o2).a.c();
                                        ((accd)o2).a.qo();
                                        n = 7;
                                        continue Block_38_Outer;
                                        Label_1282:
                                        return;
                                        Label_1315:
                                        return;
                                        Label_1263:
                                        n = 3;
                                        continue Block_38_Outer;
                                        Label_1258:
                                        n = 5;
                                        continue Block_38_Outer;
                                    }
                                    i = ((ccq)this.b).b.c.p;
                                    iftrue(Label_1315:)(i == null);
                                    continue;
                                }
                            }
                            catch (final InterruptedException ex3) {
                                continue;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
    }
}
