import java.util.Iterator;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import java.util.Map;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabw implements aahb
{
    public static final long a;
    private final oco b;
    private final SharedPreferences c;
    private final aacd d;
    private final atnb e;
    private final Map f;
    private final Set g;
    
    static {
        a = TimeUnit.MINUTES.toMillis(1L);
    }
    
    public aabw(final oco b, final SharedPreferences c, final aacd d, final atnb e, final Set g) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = new HashMap();
    }
    
    private static final void m(final ahcr ahcr, final aadf aadf) {
        final long k = aahc.k(aadf.g);
        final long l = aahc.l(aadf.g);
        final long o = k / 1024L;
        ahcr.copyOnWrite();
        final amxv amxv = (amxv)ahcr.instance;
        final amxv a = amxv.a;
        amxv.b |= 0x1000;
        amxv.o = o;
        final long n = l / 1024L;
        ahcr.copyOnWrite();
        final amxv amxv2 = (amxv)ahcr.instance;
        amxv2.b |= 0x800;
        amxv2.n = n;
    }
    
    @Override
    public final void a(final aadf aadf) {
    }
    
    @Override
    public final void b(final aadf aadf) {
        if (!zzc.c(aadf.f)) {
            return;
        }
        final ahcr d = zzc.d(aadf);
        d.copyOnWrite();
        final amxv amxv = (amxv)d.instance;
        final amxv a = amxv.a;
        amxv.h = 12;
        amxv.b |= 0x10;
        final boolean a2 = aaky.a;
        d.copyOnWrite();
        final amxv amxv2 = (amxv)d.instance;
        amxv2.c |= 0x40;
        amxv2.A = a2;
        d.copyOnWrite();
        final amxv amxv3 = (amxv)d.instance;
        amxv3.g = 8;
        amxv3.b |= 0x8;
        this.d.b((amxv)d.build());
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d(final aadf aadf) {
        if (!zzc.c(aadf.f)) {
            return;
        }
        final ahcr d = zzc.d(aadf);
        d.copyOnWrite();
        final amxv amxv = (amxv)d.instance;
        final amxv a = amxv.a;
        amxv.h = 5;
        amxv.b |= 0x10;
        d.copyOnWrite();
        final amxv amxv2 = (amxv)d.instance;
        amxv2.b |= 0x800000;
        amxv2.v = zzc.b(128);
        final boolean a2 = aaky.a;
        d.copyOnWrite();
        final amxv amxv3 = (amxv)d.instance;
        amxv3.c |= 0x40;
        amxv3.A = a2;
        d.copyOnWrite();
        final amxv amxv4 = (amxv)d.instance;
        amxv4.g = 9;
        amxv4.b |= 0x8;
        final aflu k = ((afkg)this.g).k();
        while (((Iterator)k).hasNext()) {
            ((aacc)((Iterator)k).next()).c();
        }
        this.d.b((amxv)d.build());
    }
    
    @Override
    public final void e(final aadf aadf) {
        if (!zzc.c(aadf.f)) {
            return;
        }
        final String t = aahc.t(aadf.f);
        if (TextUtils.isEmpty((CharSequence)t)) {
            return;
        }
        if (this.f.containsKey(t) && this.b.c() - (long)this.f.get(t) < aabw.a) {
            return;
        }
        final ahcr d = zzc.d(aadf);
        d.copyOnWrite();
        final amxv amxv = (amxv)d.instance;
        final amxv a = amxv.a;
        amxv.h = 9;
        amxv.b |= 0x10;
        this.d.b((amxv)d.build());
        this.f.put(t, this.b.c());
    }
    
    @Override
    public final void f(final aadf aadf) {
        if (!zzc.c(aadf.f)) {
            return;
        }
        if ((aadf.c & 0x200) == 0x0) {
            final ahcr d = zzc.d(aadf);
            d.copyOnWrite();
            final amxv amxv = (amxv)d.instance;
            final amxv a = amxv.a;
            amxv.h = 5;
            amxv.b |= 0x10;
            final int b = zzc.b(aadf.c);
            d.copyOnWrite();
            final amxv amxv2 = (amxv)d.instance;
            amxv2.b |= 0x800000;
            amxv2.v = b;
            final boolean a2 = aaky.a;
            d.copyOnWrite();
            final amxv amxv3 = (amxv)d.instance;
            amxv3.c |= 0x40;
            amxv3.A = a2;
            d.copyOnWrite();
            final amxv amxv4 = (amxv)d.instance;
            amxv4.g = 9;
            amxv4.b |= 0x8;
            this.d.b((amxv)d.build());
        }
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final void h(final aadf aadf) {
        if (!zzc.c(aadf.f)) {
            return;
        }
        final ahcr d = zzc.d(aadf);
        d.copyOnWrite();
        final amxv amxv = (amxv)d.instance;
        final amxv a = amxv.a;
        amxv.g = 2;
        amxv.b |= 0x8;
        d.copyOnWrite();
        final amxv amxv2 = (amxv)d.instance;
        amxv2.b |= 0x800000;
        amxv2.v = zzc.b(64);
        final boolean a2 = aaky.a;
        d.copyOnWrite();
        final amxv amxv3 = (amxv)d.instance;
        amxv3.c |= 0x40;
        amxv3.A = a2;
        final aflu k = ((afkg)this.g).k();
        while (((Iterator)k).hasNext()) {
            ((aacc)((Iterator)k).next()).d();
        }
        this.d.b((amxv)d.build());
    }
    
    @Override
    public final void i(final aadf aadf) {
    }
    
    @Override
    public final void j(final aadf aadf) {
    }
    
    @Override
    public final void k(final aadf aadf, final amxs amxs, final aacn aacn) {
        if (aadf.b == aozk.g) {
            this.c.edit().putLong(tqf.aM("%s_offline_download_success", ((aadl)this.e.a()).d()), this.b.c()).apply();
        }
        if (!zzc.c(aadf.f)) {
            return;
        }
        final ahcr d = zzc.d(aadf);
        final boolean a = aaky.a;
        d.copyOnWrite();
        final amxv amxv = (amxv)d.instance;
        final amxv a2 = amxv.a;
        amxv.c |= 0x40;
        amxv.A = a;
        final int ordinal = aadf.b.ordinal();
        if (ordinal == 3) {
            d.copyOnWrite();
            final amxv amxv2 = (amxv)d.instance;
            amxv2.h = 2;
            amxv2.b |= 0x10;
            d.copyOnWrite();
            final amxv amxv3 = (amxv)d.instance;
            amxv3.g = 5;
            amxv3.b |= 0x8;
            if (!aahc.W(aadf.g)) {
                d.copyOnWrite();
                final amxv amxv4 = (amxv)d.instance;
                amxv4.c |= 0x80;
                amxv4.B = true;
                aahc.ah(aadf.g);
            }
            final aflu k = ((afkg)this.g).k();
            while (((Iterator)k).hasNext()) {
                ((aacc)((Iterator)k).next()).e();
            }
            this.d.b((amxv)d.build());
            return;
        }
        if (ordinal == 5) {
            d.copyOnWrite();
            final amxv amxv5 = (amxv)d.instance;
            amxv5.h = 6;
            amxv5.b |= 0x10;
            d.copyOnWrite();
            final amxv amxv6 = (amxv)d.instance;
            amxv6.i = amxs.H;
            amxv6.b |= 0x20;
            d.copyOnWrite();
            final amxv amxv7 = (amxv)d.instance;
            amxv7.g = 7;
            amxv7.b |= 0x8;
            m(d, aadf);
            final aflu i = ((afkg)this.g).k();
            while (((Iterator)i).hasNext()) {
                ((aacc)((Iterator)i).next()).b();
            }
            this.d.b((amxv)d.build());
            return;
        }
        if (ordinal != 6) {
            return;
        }
        d.copyOnWrite();
        final amxv amxv8 = (amxv)d.instance;
        amxv8.h = 4;
        amxv8.b |= 0x10;
        d.copyOnWrite();
        final amxv amxv9 = (amxv)d.instance;
        amxv9.g = 6;
        amxv9.b |= 0x8;
        m(d, aadf);
        final aflu j = ((afkg)this.g).k();
        while (((Iterator)j).hasNext()) {
            ((aacc)((Iterator)j).next()).a();
        }
        this.d.b((amxv)d.build());
    }
    
    @Override
    public final void l(final aadf aadf) {
    }
}
