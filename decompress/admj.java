import java.util.Iterator;
import android.app.Notification;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Binder;
import java.util.concurrent.CopyOnWriteArrayList;
import android.app.NotificationManager;
import android.content.ComponentName;
import com.google.android.libraries.youtube.upload.service.UploadsBootReceiver;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.youtube.upload.service.UploadService;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admj implements adle, admb, adon, adpo
{
    boolean a;
    boolean b;
    public final Context c;
    public final Executor d;
    public final adku e;
    public final adpp f;
    public final adml g;
    public final adoo h;
    public int i;
    int j;
    final ttt k;
    public final Object l;
    String m;
    public final HashMap n;
    final Set o;
    final Set p;
    public final adet q;
    private final oby r;
    private final adld s;
    private final adma t;
    private final adlw u;
    private final tem v;
    
    public admj(final Context c, final oby r, final Executor d, final adku e, final adet q, final adpp f, final adld s, final adml g, final adma t, final adlw u, final adoo h, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = false;
        this.b = false;
        this.j = 0;
        this.l = new Object();
        this.c = c;
        this.r = r;
        this.d = d;
        this.e = e;
        this.q = q;
        this.f = f;
        this.s = s;
        this.g = g;
        this.t = t;
        this.u = u;
        this.h = h;
        this.n = new HashMap();
        this.o = new HashSet();
        this.p = new HashSet();
        this.v = new admh(UploadService.class);
        this.k = new admg(g);
    }
    
    private final void G(final String s) {
        synchronized (this.l) {
            final admi admi = this.n.get(s);
            if (admi != null) {
                admi.c = true;
                this.o.add(s);
            }
        }
    }
    
    public final void A() {
        if (!this.b) {
            this.s.p(this);
            ((adlr)this.t).b(this);
            ((adlr)this.u).b(this);
            this.f.a((adpo)this);
            this.h.a.addIfAbsent(this);
            this.b = true;
            this.F();
        }
    }
    
    final void B(final Uri data) {
        final Intent intent = new Intent(this.c, (Class)UploadService.class);
        Label_0042: {
            if (data == null) {
                break Label_0042;
            }
            while (true) {
                try {
                    this.c.getContentResolver().takePersistableUriPermission(data, 1);
                    intent.setData(data);
                    intent.setFlags(1);
                    tpe.al(this.c, intent);
                }
                catch (final SecurityException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void C(final Uri uri) {
        tbi.f();
        this.B(uri);
        this.d.execute(new adme(this, 1));
    }
    
    public final void D() {
        final admn admn = (admn)this.v.a();
        if (admn != null) {
            final UploadService uploadService = (UploadService)admn.a;
            uploadService.a = false;
            if (uploadService.getApplicationInfo().targetSdkVersion >= 24) {
                uploadService.stopForeground(2);
            }
            else {
                uploadService.stopForeground(false);
            }
            uploadService.stopSelf();
            final tem v = this.v;
            final Context c = this.c;
            Object o = v.b;
            synchronized (o) {
                v.e.getSimpleName();
                if (v.c) {
                    v.c = false;
                    final Binder d = v.d;
                    if (d != null) {
                        final admn admn2 = (admn)d;
                    }
                    c.unbindService(v.f);
                    v.a.close();
                    v.d = null;
                }
                monitorexit(o);
                if (this.a) {
                    o = this.c;
                    ((Context)o).getPackageManager().setComponentEnabledSetting(new ComponentName((Context)o, (Class)UploadsBootReceiver.class), 2, 1);
                    this.a = false;
                }
            }
        }
        final NotificationManager notificationManager = (NotificationManager)this.c.getSystemService("notification");
        if (this.p.isEmpty()) {
            notificationManager.cancel(5);
        }
        else {
            this.F();
            final afq afq = (afq)this.k.a();
            this.g.a(afq, this.j);
            notificationManager.notify(5, afq.a());
        }
        if (this.b) {
            this.s.q(this);
            ((adlr)this.t).d(this);
            ((adlr)this.u).d(this);
            ((CopyOnWriteArrayList)this.f.i).remove(this);
            this.h.a.remove(this);
            this.b = false;
        }
    }
    
    public final void E() {
        this.d.execute(new admf(this));
    }
    
    public final void F() {
        synchronized (this.l) {
            int j;
            if (this.u.i()) {
                j = 1;
            }
            else if (this.u.h()) {
                j = 2;
            }
            else {
                j = 0;
            }
            this.j = j;
        }
    }
    
    @Override
    public final void a(final String s, final boolean b, final boolean b2) {
    }
    
    @Override
    public final void b(final String s, final long g, final long f) {
        final Object l = this.l;
        monitorenter(l);
        Label_0017: {
            if (s != null) {
                break Label_0017;
            }
            try {
                monitorexit(l);
                return;
                final admi admi;
                Label_0037: {
                    admi.g = g;
                }
                admi.f = f;
                monitorexit(l);
                this.E();
                return;
                admi = this.n.get(s);
                iftrue(Label_0037:)(admi != null);
            }
            finally {
                monitorexit(l);
            }
        }
    }
    
    @Override
    public final void c(final String s, final admz admz) {
        this.E();
    }
    
    @Override
    public final void d(final String s, final annh annh) {
    }
    
    @Override
    public final void e(final String s, final double h) {
        final Object l = this.l;
        monitorenter(l);
        Label_0017: {
            if (s != null) {
                break Label_0017;
            }
            try {
                monitorexit(l);
                return;
                final admi admi = this.n.get(s);
                iftrue(Label_0037:)(admi != null);
                return;
                Label_0037: {
                    admi.h = h;
                }
                monitorexit(l);
                this.E();
            }
            finally {
                monitorexit(l);
            }
        }
    }
    
    @Override
    public final void f(final String s, final long e, final long f, final double n) {
        if (s == null) {
            return;
        }
        synchronized (this.l) {
            final admi admi = this.n.get(s);
            if (admi == null) {
                return;
            }
            admi.e = e;
            admi.f = f;
            monitorexit(this.l);
            this.E();
        }
    }
    
    @Override
    public final void g(final String s, final adms adms) {
        this.E();
    }
    
    @Override
    public final void h(final admv admv) {
    }
    
    @Override
    public final void i(final String s, final admv admv) {
        this.E();
    }
    
    @Override
    public final void j(final String s) {
        this.G(s);
        this.E();
    }
    
    @Override
    public final void k(final String s, final boolean b) {
    }
    
    @Override
    public final void l(final String s, final apil apil) {
        this.E();
    }
    
    @Override
    public final void m(final String s, final String s2) {
        this.E();
    }
    
    @Override
    public final void n(final String s, final admu admu) {
        if (admu != admu.a) {
            this.G(s);
        }
        this.E();
    }
    
    @Override
    public final void o(final String s, final int n) {
        this.E();
    }
    
    public final void p(final String s) {
        this.G(s);
        this.E();
    }
    
    public final void q(final String s, final admv admv) {
        if (!this.h.b(admv)) {
            this.G(s);
            this.E();
        }
    }
    
    public final void r(final String s) {
        this.G(s);
        this.E();
    }
    
    public final void s(final String s) {
        synchronized (this.l) {
            this.G(s);
            this.p.add(s);
            monitorexit(this.l);
            this.E();
        }
    }
    
    public final void t() {
        this.F();
        this.E();
    }
    
    @Override
    public final void tl(final admc admc) {
        this.d.execute(new adme(this, 0));
    }
    
    public final void u(admm admm) {
        final String a = admm.a;
        final Bitmap b = admm.b;
        final byte[] c = admm.c;
        if (this.n.get(a) != null) {
            return;
        }
        admm = (admm)new admi(a);
        ((admi)admm).b = this.r.c();
        ((admi)admm).i = c;
        if (b != null) {
            final Resources resources = this.c.getResources();
            final int n = (int)resources.getDimension(17104902);
            final int n2 = (int)resources.getDimension(17104901);
            try {
                ((admi)admm).d = ThumbnailUtils.extractThumbnail(b, n2, n);
            }
            catch (final IllegalArgumentException ex) {
                ttr.i("Extracting thumbnail failed", (Throwable)ex);
                ((admi)admm).d = null;
            }
        }
        this.n.put(((admi)admm).a, admm);
        this.p.remove(((admi)admm).a);
        if (this.m == null) {
            this.m = ((admi)admm).a;
        }
    }
    
    public final void v(final String s) {
        this.B(null);
        teu.j(aftq.f(afwm.r((afty)new adef(this, s, 10), this.d), (aftz)new xow(this, s, 10), this.d), this.d, (tes)new wyh(this, 17));
    }
    
    public final void w() {
        Object b;
        if ((b = this.v.a()) == null) {
            final tem v = this.v;
            final Context c = this.c;
            tbi.e();
            synchronized (v.b) {
                v.e.getSimpleName();
                if (!v.c) {
                    v.c = true;
                    final Intent intent = new Intent(c, v.e);
                    if (!c.bindService(intent, v.f, 1)) {
                        final String string = intent.toString();
                        final StringBuilder sb = new StringBuilder("Could not bind to ");
                        sb.append(string);
                        throw new RuntimeException(sb.toString());
                    }
                }
                monitorexit(v.b);
                tbi.e();
                v.a.block();
                b = v.b;
                synchronized (v.b) {
                    final Binder d = v.d;
                    monitorexit(v.b);
                    b = d;
                }
            }
        }
        final Notification a = ((afq)this.k.a()).a();
        final UploadService uploadService = (UploadService)((admn)b).a;
        if (!uploadService.a) {
            uploadService.a = true;
            uploadService.startForeground(5, a);
        }
        if (!this.a) {
            final Context c2 = this.c;
            c2.getPackageManager().setComponentEnabledSetting(new ComponentName(c2, (Class)UploadsBootReceiver.class), 1, 1);
            this.a = true;
        }
    }
    
    public final void x(final String s) {
        this.G(s);
        this.E();
    }
    
    public final void y(String m) {
        final admi admi = this.n.remove(m);
        final String i = this.m;
        if (i != null && i.equals(m) && admi != null) {
            synchronized (this.l) {
                final long b = admi.b;
                final Iterator iterator = this.n.keySet().iterator();
                long n = Long.MAX_VALUE;
                m = null;
                while (iterator.hasNext()) {
                    final String s = (String)iterator.next();
                    final admi admi2 = this.n.get(s);
                    if (!admi2.c) {
                        final long b2 = admi2.b;
                        if (b2 <= b || b2 >= n) {
                            continue;
                        }
                        m = s;
                        n = b2;
                    }
                }
                monitorexit(this.l);
                this.m = m;
            }
        }
    }
    
    @Deprecated
    public final void z(final admm admm) {
        this.B(null);
        this.d.execute((Runnable)new adfy(this, admm, 14));
    }
}
