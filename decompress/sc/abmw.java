import java.util.Collection;
import android.graphics.Bitmap;
import android.text.Spanned;
import android.widget.RemoteViews;
import android.text.TextUtils;
import android.app.PendingIntent;
import android.content.Intent;
import android.text.Html;
import com.google.android.libraries.youtube.mdx.mediaroute.service.RemotePlaybackControlsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import android.os.Looper;
import java.util.Map;
import android.os.Handler;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmw implements abuk, abmp
{
    public String a;
    public volatile List b;
    public afhd c;
    public afhd d;
    private final Context e;
    private final BroadcastReceiver f;
    private final IntentFilter g;
    private final abms h;
    private final abul i;
    private final abmz j;
    private final oby k;
    private final abnc l;
    private final Handler m;
    private volatile boolean n;
    private final List o;
    private final Map p;
    private long q;
    private boolean r;
    private final abkl s;
    
    public abmw(final Context e, final abul i, final abuj abuj, final abkl s, final abms h, final abmz j, final oby k, final abnc l, final List list) {
        e.getClass();
        this.e = e;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        s.getClass();
        this.s = s;
        this.j = j;
        k.getClass();
        this.k = k;
        this.l = l;
        this.m = new Handler(Looper.getMainLooper());
        final IntentFilter g = new IntentFilter();
        (this.g = g).addAction("noop");
        g.addAction("android.intent.action.MAIN");
        g.addAction("com.google.android.libraries.youtube.player.action.controller_notification_delete");
        this.o = list;
        this.b = list;
        this.f = (BroadcastReceiver)new abmt(this, abuj, l);
        this.p = new HashMap();
        this.l(list);
    }
    
    public abmw(final Context context, final abul abul, final abuj abuj, final abkl abkl, final abms abms, final abmz abmz, final oby oby, final List list) {
        this(context, abul, abuj, abkl, abms, abmz, oby, (abnc)new abnb(), list);
    }
    
    private static void j(final IntentFilter intentFilter, final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final Iterator iterator2 = ((abmq)iterator.next()).e().iterator();
            while (iterator2.hasNext()) {
                intentFilter.addAction((String)iterator2.next());
            }
        }
    }
    
    private final void k(final boolean b) {
        monitorenter(this);
        try {
            this.l.c();
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                this.l.a((abmq)iterator.next());
            }
            final abms h = this.h;
            final abmz j = this.j;
            final String a = this.a;
            final afhd c = this.c;
            final Map p = this.p;
            final List b2 = this.b;
            final ArrayList list = new ArrayList();
            final int n = 0;
            afq afq2 = null;
            Label_0554: {
                if (c != null) {
                    final xnz h2 = ((xnt)((RemotePlaybackControlsService)c.a).i.a()).h();
                    final int a2 = h2.a;
                    afq afq = null;
                    if (a2 == 1) {
                        final String string = ((RemotePlaybackControlsService)c.a).getString(2132018477);
                        final Spanned fromHtml = Html.fromHtml(((RemotePlaybackControlsService)c.a).getString(2132019658, new Object[] { h2.b }));
                        afq = new afq((Context)c.a);
                        afq.j((CharSequence)string);
                        afq.t((CharSequence)string);
                        afq.i((CharSequence)fromHtml);
                        afq.s((CharSequence)null);
                        afq.q(((RemotePlaybackControlsService)c.a).j.d);
                        afq.k = 2;
                        tfg.o(afq);
                    }
                    afq2 = afq;
                    if (afq != null) {
                        break Label_0554;
                    }
                }
                final afq afq3 = new afq((Context)j.c);
                afq3.j(((abul)j.b).l);
                afq3.t(((abul)j.b).l);
                afq3.i(((abul)j.b).m);
                afq3.q(j.a);
                afq3.k = 2;
                afq3.l = false;
                afq3.z = 1;
                afq3.l(j.a("com.google.android.libraries.youtube.player.action.controller_notification_delete"));
                final Intent intent = (Intent)((atke)j.d).a();
                Object o;
                if (intent == null) {
                    o = aeyo.a;
                }
                else {
                    final Intent intent2 = new Intent(intent);
                    intent2.putExtra("playback_notification_click_extra", true);
                    o = aezp.j((Object)qlc.b((Context)j.c, intent2, 335544320));
                }
                if (((aezp)o).h()) {
                    afq3.g = (PendingIntent)((aezp)o).c();
                }
                final Bitmap p2 = ((abul)j.b).p;
                if (p2 != null) {
                    afq3.m(p2);
                }
                tfg.n(afq3, (Context)j.c);
                afq2 = afq3;
                if (!TextUtils.isEmpty((CharSequence)a)) {
                    afq3.s((CharSequence)Html.fromHtml(a));
                    afq2 = afq3;
                }
            }
            afq2.p(0, 0, true);
            for (final abmq abmq : b2) {
                final abmq abmq2 = p.get(abmq);
                int n2;
                int n3;
                PendingIntent pendingIntent;
                boolean b3;
                if (abmq2 != null) {
                    if (!abmq2.j()) {
                        continue;
                    }
                    n2 = abmq2.a();
                    n3 = abmq2.b();
                    pendingIntent = j.a(abmq2.d());
                    b3 = abmq2.k();
                }
                else {
                    if (!abmq.j()) {
                        continue;
                    }
                    n2 = abmq.a();
                    n3 = abmq.b();
                    pendingIntent = j.a(abmq.d());
                    b3 = abmq.k();
                }
                j.b(afq2, n2, n3, pendingIntent, (List)list, b3);
            }
            final int min = Math.min(list.size(), 3);
            final int[] a3 = new int[min];
            for (int i = n; i < min; ++i) {
                a3[i] = (int)list.get(i);
            }
            Object o2;
            if (((abmv)j.f).d()) {
                o2 = new axm();
            }
            else {
                o2 = new axn();
            }
            ((axn)o2).a = a3;
            ((axn)o2).f = ((eg)((atke)j.e).a()).b();
            afq2.r((afu)o2);
            if (((abmv)j.f).d()) {
                final RemoteViews b4 = new RemoteViews(((Context)j.c).getPackageName(), ((abmv)j.f).a());
                b4.setTextViewText(((abmv)j.f).c(), ((abul)j.b).l);
                b4.setTextViewText(((abmv)j.f).b(), ((abul)j.b).m);
                afq2.B = b4;
            }
            h.g(afq2.a(), b);
            this.q = this.k.d();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void l(List b) {
        final afeq o = afeq.o((Collection)b);
        j(this.g, (List)o);
        final List b2 = this.b;
        this.b = (List)o;
        b = this.b;
        if (b2 != null) {
            final Iterator iterator = b2.iterator();
            while (iterator.hasNext()) {
                ((abmq)iterator.next()).h((abmp)null);
            }
        }
        final Iterator iterator2 = b.iterator();
        while (iterator2.hasNext()) {
            ((abmq)iterator2.next()).h((abmp)this);
        }
    }
    
    public final void a(final boolean b) {
        monitorenter(this);
        Label_0030: {
            if (b) {
                break Label_0030;
            }
            try {
                if (!this.n || this.r) {
                    return;
                }
                final long d = this.k.d();
                if (b) {
                    this.k(true);
                    return;
                }
                if (tum.g(this.e) && this.i.b != 2) {
                    this.m.postDelayed((Runnable)new abei(this, 12), 1500L);
                    this.r = true;
                    return;
                }
                final long n = this.q + 200L;
                if (d > n) {
                    this.c();
                    return;
                }
                this.m.postDelayed((Runnable)new abei(this, 12), Math.max(0L, n - d));
                this.r = true;
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final void b(final boolean b) {
        monitorenter(this);
        try {
            this.i.a.remove(this);
            if (b) {
                this.h.a();
            }
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((abmq)iterator.next()).g();
            }
            if (this.n) {
                this.n = false;
                this.e.unregisterReceiver(this.f);
                this.l.e();
            }
            if (this.r) {
                this.m.removeCallbacks((Runnable)new abei(this, 12));
                this.r = false;
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c() {
        monitorenter(this);
        boolean k = false;
        try {
            this.r = false;
            if (this.n) {
                final afhd d = this.d;
                if (d != null) {
                    final xnt xnt = (xnt)((RemotePlaybackControlsService)d.a).i.a();
                    if (xnt.o() || xnt.f() == 0 || xnt.f() == 1) {
                        k = true;
                    }
                }
                else {
                    k = this.s.k();
                }
                this.k(k);
            }
        }
        finally {
            monitorexit(this);
        }
    }
    
    @Override
    public final void d(final int n) {
        if ((n & 0xA3) == 0x0) {
            return;
        }
        this.a(false);
    }
    
    public final void e() {
        this.f(this.o);
    }
    
    public final void f(final List list) {
        if (this.b.equals(list)) {
            return;
        }
        this.l(list);
        this.a(false);
    }
    
    @Deprecated
    public final void g(final abmq abmq, final abmq abmq2) {
        this.p.put(abmq, abmq2);
        j(this.g, (List)afeq.r((Object)abmq2));
    }
    
    public final void h() {
        synchronized (this) {
            this.i(false);
        }
    }
    
    public final void i(final boolean b) {
        synchronized (this) {
            if (!this.n) {
                this.n = true;
                this.e.registerReceiver(this.f, this.g);
            }
            this.i.c(this);
            this.a(b);
        }
    }
}
