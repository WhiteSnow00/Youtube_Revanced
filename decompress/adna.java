import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.PriorityQueue;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adna
{
    public final atnb a;
    public final oco b;
    public final atnb c;
    public final ScheduledExecutorService d;
    public final PriorityQueue e;
    public final CopyOnWriteArrayList f;
    public final Map g;
    public boolean h;
    private ScheduledFuture i;
    
    public adna(final atnb a, final oco b, final ScheduledExecutorService d, final atnb c) {
        this.e = new PriorityQueue();
        this.f = new CopyOnWriteArrayList();
        this.g = (Map)new ConcurrentHashMap();
        this.h = false;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public final void a(final admy admy) {
        this.f.add(admy);
    }
    
    public final void b(final znz znz, final String s, final String s2, final String s3) {
        this.d.execute(new adat(this, new admz(znz, s, s2, this.b.c() + Math.max(0L, 50L), s3), 9));
    }
    
    public final void c() {
        this.d.execute((Runnable)new addt(this, 18));
    }
    
    public final void d(final apkk apkk) {
        apkk.getClass();
        apkj apkj;
        if ((apkj = apkk.c) == null) {
            apkj = apkj.a;
        }
        String c;
        if ((apkj.b & 0x1) != 0x0) {
            apkj apkj2;
            if ((apkj2 = apkk.c) == null) {
                apkj2 = apkj.a;
            }
            c = apkj2.c;
        }
        else {
            c = null;
        }
        final apkj c2 = apkk.c;
        apkj a;
        if (c2 == null) {
            a = apkj.a;
        }
        else {
            a = c2;
        }
        String d;
        if ((a.b & 0x2) != 0x0) {
            apkj a2;
            if ((a2 = c2) == null) {
                a2 = apkj.a;
            }
            d = a2.d;
        }
        else {
            d = null;
        }
        if (c == null && d == null) {
            throw new IllegalStateException("Cannot find frontendId or videoId in response");
        }
        for (final apkm apkm : apkk.d) {
            final int b = apkm.b;
            if ((b & 0x80) != 0x0) {
                for (final admy admy : this.f) {
                    if (apkm.f == null) {
                        final apow a3 = apow.a;
                    }
                    admy.g();
                }
            }
            else if ((b & 0x2) != 0x0) {
                for (final admy admy2 : this.f) {
                    anpn anpn;
                    if ((anpn = apkm.c) == null) {
                        anpn = anpn.a;
                    }
                    admy2.a(c, d, anpn);
                }
            }
            else if ((b & 0x20) != 0x0) {
                for (final admy admy3 : this.f) {
                    apkx apkx;
                    if ((apkx = apkm.d) == null) {
                        apkx = apkx.a;
                    }
                    admy3.d(c, d, apkx);
                }
            }
            else if ((b & 0x40) != 0x0) {
                for (final admy admy4 : this.f) {
                    aovx aovx;
                    if ((aovx = apkm.e) == null) {
                        aovx = aovx.a;
                    }
                    admy4.b(c, d, aovx);
                }
            }
            else {
                if ((b & 0x100) == 0x0) {
                    continue;
                }
                for (final admy admy5 : this.f) {
                    apja apja;
                    if ((apja = apkm.g) == null) {
                        apja = apja.a;
                    }
                    admy5.c(c, d, apja);
                }
            }
        }
        final Iterator<Object> iterator7 = ((List<Object>)apkk.e).iterator();
        boolean b2 = false;
        while (iterator7.hasNext()) {
            final apkl apkl = iterator7.next();
            if ((apkl.b & 0x2) != 0x0) {
                aowm aowm;
                if ((aowm = apkl.c) == null) {
                    aowm = aowm.a;
                }
                znz znz;
                if (!TextUtils.isEmpty((CharSequence)c)) {
                    znz = this.g.get(c);
                }
                else {
                    znz = null;
                }
                znz znz2 = znz;
                if (znz == null) {
                    znz2 = znz;
                    if (!TextUtils.isEmpty((CharSequence)d)) {
                        znz2 = this.g.get(d);
                    }
                }
                znz a4;
                if ((a4 = znz2) == null) {
                    a4 = zny.a;
                }
                this.e.add(new admz(a4, c, d, aowm.c + this.b.c(), aowm.d));
                final int c3 = aowm.c;
                b2 = true;
            }
        }
        if (!b2) {
            final Iterator iterator8 = this.f.iterator();
            while (iterator8.hasNext()) {
                ((admy)iterator8.next()).e(d);
                this.e(c, d);
            }
        }
    }
    
    public final void e(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.g.remove(s);
        }
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            this.g.remove(s2);
        }
    }
    
    public final void f(final admy admy) {
        this.f.remove(admy);
    }
    
    public final void g() {
        final ScheduledFuture i = this.i;
        if (i != null) {
            i.cancel(true);
            this.i = null;
        }
        if (!this.h) {
            if (!this.e.isEmpty()) {
                final long n = this.e.peek().d - this.b.c();
                if (n <= 0L) {
                    this.d.execute((Runnable)new addt(this, 19));
                    return;
                }
                this.i = this.d.schedule((Runnable)new addt(this, 19), n, TimeUnit.MILLISECONDS);
            }
        }
    }
}
