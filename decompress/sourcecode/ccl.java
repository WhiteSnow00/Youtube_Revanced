import android.content.pm.PackageInfo;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.app.Activity;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.u;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import androidx.work.impl.foreground.SystemForegroundService;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccl implements Runnable
{
    final /* synthetic */ int a = a;
    final /* synthetic */ Object b = b;
    private final /* synthetic */ int c;
    
    public ccl(final SystemForegroundService b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccl(final ao b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccl(final ccm b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ccl(final emj b, final int a, final int c) {
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
            Label_1033: {
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
                        final e g = ((u)b).c.g;
                        if (g != null) {
                            g.j = a;
                            final athj t = g.t;
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
                            ((u)b3).k.j(a2);
                        }
                        catch (final RemoteException ex) {
                            afqg.r("Problem sending error to client.");
                        }
                    }
                    case 16: {
                        final Object b4 = this.b;
                        final int a3 = this.a;
                        final aefd aefd = (aefd)b4;
                        final aefj o = aefd.O;
                        if (o != null && aefd.aw()) {
                            try {
                                o.a(afqg.t(a3));
                            }
                            catch (final RemoteException ex2) {
                                throw new aeft(ex2);
                            }
                        }
                        return;
                    }
                    case 15: {
                        ((kgj)this.b).b.aa(this.a);
                        return;
                    }
                    case 14: {
                        final Object b5 = this.b;
                        final int a4 = this.a;
                        final kgj kgj = (kgj)b5;
                        final Context d = kgj.d;
                        if (d != null) {
                            if (!((Activity)d).isDestroyed()) {
                                final on h = kgj.b.h(a4);
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
                        final kan m = inlinePlaybackController.m;
                        if (m != null) {
                            m.c(a5, false);
                            final whg q = inlinePlaybackController.q;
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
                        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)((jxp)b7).g.n;
                        if (linearLayoutManager != null) {
                            final View t2 = ((nw)linearLayoutManager).T(a6);
                            if (t2 != null) {
                                t2.requestFocus();
                                t2.sendAccessibilityEvent(8);
                            }
                        }
                        return;
                    }
                    case 11: {
                        tmy.x((Context)((OfflinePrefsFragment)this.b).od(), this.a, 0);
                        return;
                    }
                    case 10: {
                        final Object b8 = this.b;
                        final int a7 = this.a;
                        final hmk hmk = (hmk)b8;
                        if (hmk.D && a7 == hmk.B && a7 != hmk.p.C(hmk.z)) {
                            hmk.j(false);
                        }
                        return;
                    }
                    case 9: {
                        final Object b9 = this.b;
                        final int a8 = this.a;
                        final tvf f = ((hfc)b9).f;
                        if (f != null) {
                            f.h(a8);
                        }
                        return;
                    }
                    case 8: {
                        ((View)this.b).setVisibility(this.a);
                        return;
                    }
                    case 7: {
                        ((gwg)((hdx)this.b).a).A(this.a);
                        return;
                    }
                    case 6: {
                        ((gwg)this.b).E(this.a);
                        return;
                    }
                    case 5: {
                        final Object b10 = this.b;
                        final int a9 = this.a;
                        erq erq;
                        while (true) {
                            erq = (erq)b10;
                            final int value = erq.d.get();
                            if (value != 0) {
                                if (a9 <= value) {
                                    return;
                                }
                                if (erq.d.compareAndSet(value, a9)) {
                                    return;
                                }
                                continue;
                            }
                            else {
                                if (erq.d.compareAndSet(0, a9)) {
                                    break;
                                }
                                continue;
                            }
                        }
                        int value2;
                        do {
                            value2 = erq.d.get();
                            erq.b(value2);
                            erq.a(value2);
                        } while (!erq.d.compareAndSet(value2, 0));
                        return;
                    }
                    case 3: {
                        break Label_1033;
                    }
                    case 2: {
                        break Label_1033;
                    }
                    case 1: {
                        break Label_1033;
                    }
                    case 4: {
                        final Object o2 = this.b;
                        final int a10 = this.a;
                        if (a10 > 0)
                        break Label_0775;
                    }
                    case 0: {
                        Label_1188: {
                            break Label_1188;
                            final int a10;
                            final long n2 = a10 * 1000;
                            try {
                                Thread.sleep(n2);
                                try {
                                    final Object o2;
                                    final PackageInfo packageInfo = ((emj)o2).a.getPackageManager().getPackageInfo(((emj)o2).a.getPackageName(), 0);
                                    final Context a11 = ((emj)o2).a;
                                    i = meo.p(a11, a11.getPackageName(), Integer.toString(packageInfo.versionCode));
                                }
                                finally {}
                                ((emj)this.b).i = (ehs)i;
                                if (this.a < 4) {
                                    if (i != null) {
                                        if ((((ehs)i).b & 0x400000) != 0x0 && !((ehs)i).s.equals("0000000000000000000000000000000000000000000000000000000000000000") && (((ehs)i).d & 0x2000000) != 0x0) {
                                            Object o2;
                                            if ((o2 = ((ehs)i).ak) == null) {
                                                o2 = ehv.a;
                                            }
                                            if ((((ehv)o2).b & 0x1) != 0x0) {
                                                o2 = ((ehs)i).ak;
                                                if ((i = o2) == null) {
                                                    i = ehv.a;
                                                }
                                                if (((ehv)i).c != -2L) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    i = this.b;
                                    ((emj)i).e(this.a + 1);
                                }
                                return;
                                Label_1139: {
                                    final Object o2;
                                    ((abyr)o2).a.ql();
                                }
                                n = 2;
                                while (true) {
                                    while (true) {
                                        break Label_1170;
                                        Label_1104:
                                        n = 1;
                                        break Label_1170;
                                        Label_1168:
                                        n = 3;
                                        break Label_1170;
                                        i = ((ccm)this.b).b.c.p;
                                        iftrue(Label_1032:)(i == null);
                                        final int a12;
                                        Block_39: {
                                            Block_38: {
                                                break Block_38;
                                                final Object o2;
                                                Label_1109:
                                                i = o2;
                                                ((abyr)i).a.c();
                                                ((abyr)i).a.qk();
                                                n = 7;
                                                break Label_1170;
                                                i = ((ao)this.b).a;
                                                a12 = this.a;
                                                o2 = ((oaq)i).a;
                                                iftrue(Label_1187:)(o2 == null);
                                                break Block_39;
                                                ((ccs)i).e(this.a);
                                                return;
                                                ((SystemForegroundService)this.b).c.cancel(this.a);
                                                return;
                                            }
                                            ((ccs)i).f(this.a);
                                            return;
                                            Label_1157:
                                            n = 6;
                                            break Label_1170;
                                            Label_1187:
                                            return;
                                            Label_1032:
                                            return;
                                            Label_1217:
                                            return;
                                            final Object o2;
                                            ((abyr)o2).a.qj(abys.l(n));
                                            return;
                                        }
                                        switch([Lcom.strobel.decompiler.ast.Label;@18ad819)(a12);
                                        Label_1163:
                                        n = 5;
                                        continue Block_40_Outer;
                                    }
                                    i = ((ccm)this.b).b.c.p;
                                    iftrue(Label_1217:)(i == null);
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
