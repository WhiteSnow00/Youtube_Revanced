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

public final class adll
{
    public final atke a;
    public final oby b;
    public final atke c;
    public final ScheduledExecutorService d;
    public final PriorityQueue e;
    public final CopyOnWriteArrayList f;
    public final Map g;
    public boolean h;
    private ScheduledFuture i;
    
    public adll(final atke a, final oby b, final ScheduledExecutorService d, final atke c) {
        this.e = new PriorityQueue();
        this.f = new CopyOnWriteArrayList();
        this.g = (Map)new ConcurrentHashMap();
        this.h = false;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public final void a(final adlj adlj) {
        this.f.add(adlj);
    }
    
    public final void b(final zme zme, final String s, final String s2, final String s3) {
        this.d.execute((Runnable)new adfy(this, new adlk(zme, s, s2, this.b.c() + Math.max(0L, 50L), s3), 7));
    }
    
    public final void c() {
        this.d.execute((Runnable)new adap(this, 18));
    }
    
    public final void d(final aphy aphy) {
        aphy.getClass();
        aphx aphx;
        if ((aphx = aphy.c) == null) {
            aphx = aphx.a;
        }
        String c;
        if ((aphx.b & 0x1) != 0x0) {
            aphx aphx2;
            if ((aphx2 = aphy.c) == null) {
                aphx2 = aphx.a;
            }
            c = aphx2.c;
        }
        else {
            c = null;
        }
        final aphx c2 = aphy.c;
        aphx a;
        if (c2 == null) {
            a = aphx.a;
        }
        else {
            a = c2;
        }
        String d;
        if ((a.b & 0x2) != 0x0) {
            aphx a2;
            if ((a2 = c2) == null) {
                a2 = aphx.a;
            }
            d = a2.d;
        }
        else {
            d = null;
        }
        if (c == null && d == null) {
            throw new IllegalStateException("Cannot find frontendId or videoId in response");
        }
        for (final apia apia : aphy.d) {
            final int b = apia.b;
            if ((b & 0x80) != 0x0) {
                for (final adlj adlj : this.f) {
                    if (apia.f == null) {
                        final apmk a3 = apmk.a;
                    }
                    adlj.g();
                }
            }
            else if ((b & 0x2) != 0x0) {
                for (final adlj adlj2 : this.f) {
                    annh annh;
                    if ((annh = apia.c) == null) {
                        annh = annh.a;
                    }
                    adlj2.a(c, d, annh);
                }
            }
            else if ((b & 0x20) != 0x0) {
                for (final adlj adlj3 : this.f) {
                    apil apil;
                    if ((apil = apia.d) == null) {
                        apil = apil.a;
                    }
                    adlj3.d(c, d, apil);
                }
            }
            else if ((b & 0x40) != 0x0) {
                for (final adlj adlj4 : this.f) {
                    aotl aotl;
                    if ((aotl = apia.e) == null) {
                        aotl = aotl.a;
                    }
                    adlj4.b(c, d, aotl);
                }
            }
            else {
                if ((b & 0x100) == 0x0) {
                    continue;
                }
                for (final adlj adlj5 : this.f) {
                    apgo apgo;
                    if ((apgo = apia.g) == null) {
                        apgo = apgo.a;
                    }
                    adlj5.c(c, d, apgo);
                }
            }
        }
        final Iterator<Object> iterator7 = ((List<Object>)aphy.e).iterator();
        boolean b2 = false;
        while (iterator7.hasNext()) {
            final aphz aphz = iterator7.next();
            if ((aphz.b & 0x2) != 0x0) {
                aoua aoua;
                if ((aoua = aphz.c) == null) {
                    aoua = aoua.a;
                }
                zme zme;
                if (!TextUtils.isEmpty((CharSequence)c)) {
                    zme = this.g.get(c);
                }
                else {
                    zme = null;
                }
                zme zme2 = zme;
                if (zme == null) {
                    zme2 = zme;
                    if (!TextUtils.isEmpty((CharSequence)d)) {
                        zme2 = this.g.get(d);
                    }
                }
                zme a4;
                if ((a4 = zme2) == null) {
                    a4 = zmd.a;
                }
                this.e.add(new adlk(a4, c, d, aoua.c + this.b.c(), aoua.d));
                final int c3 = aoua.c;
                b2 = true;
            }
        }
        if (!b2) {
            final Iterator iterator8 = this.f.iterator();
            while (iterator8.hasNext()) {
                ((adlj)iterator8.next()).e(d);
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
    
    public final void f(final adlj adlj) {
        this.f.remove(adlj);
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
                    this.d.execute((Runnable)new adap(this, 19));
                    return;
                }
                this.i = this.d.schedule((Runnable)new adap(this, 19), n, TimeUnit.MILLISECONDS);
            }
        }
    }
}
