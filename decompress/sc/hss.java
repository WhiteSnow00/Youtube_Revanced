import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import android.widget.Toast;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.ProtoWrapper;
import android.opengl.EGLContext;
import java.util.List;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import android.app.NotificationManager;
import android.util.Log;
import android.os.Binder;
import android.os.ConditionVariable;
import com.google.protos.youtube.api.innertube.LiveChatAction$CloseLiveChatActionPanelAction;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayerErrorMessageRendererWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b;
import com.google.android.apps.youtube.app.mdx.tvsignin.MdxTvFoundForSignInListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hss implements Runnable
{
    public final boolean a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public hss(final aagk c, final aabi b, final boolean a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hss(final aagm c, final aabi b, final boolean a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hss(final abiq b, final boolean a, final apvt c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hss(final adld b, final String c, final boolean a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hss(final Context b, final String c, final boolean a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hss(final Context b, final boolean a, final nns c, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hss(final asck c, final asan b, final boolean a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hss(final MdxTvFoundForSignInListener b, final xrg c, final boolean a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hss(final b c, final PlayerErrorMessageRendererWrapper b, final boolean a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hss(final b b, final String c, final boolean a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hss(final OfflineTransferService c, final aabi b, final boolean a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hss(final hic b, final RecordingInfo c, final boolean a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hss(final hst b, final boolean a, final String c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hss(final jvj b, final String c, final boolean a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hss(final rdi b, final rew c, final boolean a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hss(final vzr b, final LiveChatAction$CloseLiveChatActionPanelAction c, final boolean a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hss(final wie b, final boolean a, final xhb c, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hss(final wws c, final boolean a, final xhb b, final int d, final byte[] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hss(final xib c, final boolean a, final whb b, final int d, final byte[] array, final byte[] array2) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hss(final xon c, final boolean a, final ConditionVariable b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        switch (this.d) {
            default: {
                ((asck)this.c).i.c(this.b, this.a);
                return;
            }
            case 19: {
                final Object b = this.b;
                final boolean a = this.a;
                final Object c = this.c;
                try {
                    if (Binder.getCallingUid() != ((Context)b).getApplicationInfo().uid) {
                        final String packageName = ((Context)b).getPackageName();
                        final StringBuilder sb = new StringBuilder("error configuring notification delegate for package ");
                        sb.append(packageName);
                        Log.e("FirebaseMessaging", sb.toString());
                        return;
                    }
                    final SharedPreferences$Editor edit = agpc.n((Context)b).edit();
                    edit.putBoolean("proxy_notification_initialized", true);
                    edit.apply();
                    final NotificationManager notificationManager = (NotificationManager)((Context)b).getSystemService((Class)NotificationManager.class);
                    if (a) {
                        notificationManager.setNotificationDelegate("com.mgoogle.android.gms");
                    }
                    else if ("com.mgoogle.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate((String)null);
                    }
                }
                finally {
                    ((nns)c).d((Object)null);
                }
            }
            case 18: {
                final Object b2 = this.b;
                final Object c2 = this.c;
                final boolean a2 = this.a;
                final Iterator iterator = ((adld)b2).a.iterator();
                while (iterator.hasNext()) {
                    ((adle)iterator.next()).k((String)c2, a2);
                }
                return;
            }
            case 17: {
                final Object b3 = this.b;
                final boolean a3 = this.a;
                final Object c3 = this.c;
                final abiq abiq = (abiq)b3;
                abiq.g = null;
                if (a3) {
                    final ojg l = abiq.l;
                    final Object b4 = l.b;
                    if (b4 != null) {
                        ((acwb)l.a).l((acwd)b4);
                    }
                }
                final apvt apvt = (apvt)c3;
                aiqj aiqj;
                if ((aiqj = apvt.n) == null) {
                    aiqj = aiqj.a;
                }
                if (((ahbc)aiqj).ry((ahaq)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
                    aiqj aiqj2;
                    if ((aiqj2 = apvt.n) == null) {
                        aiqj2 = aiqj.a;
                    }
                    abiq.e.b((List)((CommandExecutorCommandOuterClass$CommandExecutorCommand)((ahbc)aiqj2).rx((ahaq)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b);
                }
                abiq.b(apvr.e, apvt);
                if (!a3) {
                    abiq.i(apvt);
                }
                abiq.h(apvt);
                return;
            }
            case 16: {
                ((OfflineTransferService)this.c).q((aabi)this.b, this.a);
                return;
            }
            case 15: {
                ((aagm)this.c).n((aabi)this.b, this.a);
                return;
            }
            case 14: {
                ((aagk)this.c).a.g((aabi)this.b, this.a);
                return;
            }
            case 13: {
                final Object c4 = this.c;
                final boolean a4 = this.a;
                final Object b5 = this.b;
                ((xon)c4).a.x.am(a4);
                ((ConditionVariable)b5).open();
                return;
            }
            case 12: {
                final Object c5 = this.c;
                final boolean a5 = this.a;
                final Object b6 = this.b;
                final wws wws = (wws)c5;
                int n;
                if (wws.o) {
                    wws.n = a5;
                    n = 1;
                }
                else {
                    final boolean e = wws.h.e(a5);
                    final boolean d = wws.h.d();
                    wws.n = d;
                    final wvo k = wws.k;
                    n = (e ? 1 : 0);
                    if (k != null) {
                        k.a(d);
                        n = (e ? 1 : 0);
                    }
                }
                ((xhb)b6).b(n ^ 0x1, wws.n);
                return;
            }
            case 11: {
                final Object b7 = this.b;
                final boolean a6 = this.a;
                final Object c6 = this.c;
                final wie wie = (wie)b7;
                if (wie.v == 0) {
                    wie.B(2, (xhb)c6);
                    return;
                }
                if (!wie.q && a6) {
                    wie.B(3, (xhb)c6);
                    return;
                }
                wie.g = a6;
                wie.x();
                wie.B(0, (xhb)c6);
                return;
            }
            case 10: {
                final Object c7 = this.c;
                final boolean a7 = this.a;
                final Object b8 = this.b;
                final whc whc = (whc)((xib)c7).a;
                if (whc.b == null) {
                    if (a7) {
                        whc.b = new wgp((EGLContext)null, 1);
                    }
                    else {
                        whc.b = new wgp((EGLContext)null, 0);
                    }
                }
                if (b8 != null) {
                    ((whb)b8).a();
                }
                return;
            }
            case 9: {
                ((vzr)this.b).a(((LiveChatAction$CloseLiveChatActionPanelAction)this.c).c, this.a);
                return;
            }
            case 8: {
                ((vzr)this.b).a(((LiveChatAction$CloseLiveChatActionPanelAction)this.c).c, this.a);
                return;
            }
            case 7: {
                ((rdi)this.b).sm((rew)this.c, this.a);
                ((rew)this.c).d();
                return;
            }
            case 6: {
                ((b)this.c).a.y((anew)((ProtoWrapper)this.b).a, this.a);
                return;
            }
            case 5: {
                ((b)this.b).a.oG((String)this.c, this.a);
                return;
            }
            case 4: {
                final Object b9 = this.b;
                final Object c8 = this.c;
                final boolean a8 = this.a;
                final jvj jvj = (jvj)b9;
                jvj.a.c.d((Object)new gli());
                final glk d2 = jvj.a.d((String)c8, (String)null);
                if (d2 != null && a8) {
                    final jvl a9 = jvj.a;
                    jvl.k(a9.g, d2);
                    jvl.k(a9.h, d2);
                    jvl.k(a9.i, d2);
                    a9.f.remove((Object)d2);
                    tpe.x(jvj.a.a, 2132017845, 1);
                }
                return;
            }
            case 3: {
                Toast.makeText((Context)this.b, (CharSequence)this.c, (int)(this.a ? 1 : 0)).show();
                return;
            }
            case 2: {
                final Object b10 = this.b;
                final Object c9 = this.c;
                final boolean a10 = this.a;
                final MdxTvFoundForSignInListener mdxTvFoundForSignInListener = (MdxTvFoundForSignInListener)b10;
                if (((gbc)mdxTvFoundForSignInListener.b.a()).c() != null) {
                    return;
                }
                final Object a11 = ((hzn)mdxTvFoundForSignInListener.a.a()).a;
                final Object a12 = ((hzn)mdxTvFoundForSignInListener.a.a()).a;
                final ListenableFuture a13 = ((qqr)mdxTvFoundForSignInListener.c.a()).a();
                afwm.L(new ListenableFuture[] { (ListenableFuture)a11, (ListenableFuture)a12, a13 }).j((Callable)new ibp(mdxTvFoundForSignInListener, (xrg)c9, (ListenableFuture)a11, (ListenableFuture)a12, a13, a10, 0), mdxTvFoundForSignInListener.e);
                return;
            }
            case 1: {
                ((hic)this.b).aN((RecordingInfo)this.c, this.a);
                return;
            }
            case 0: {
                final Object b11 = this.b;
                final boolean a14 = this.a;
                final Object c10 = this.c;
                if (!a14) {
                    ((hst)b11).a.j();
                }
                final hst hst = (hst)b11;
                hst.a.b((String)c10);
                if (a14) {
                    tpe.x((Context)hst.a.a, 2132019468, 1);
                }
                hst.a.i();
            }
        }
    }
}
