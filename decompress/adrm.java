import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Callable;
import j$.time.temporal.Temporal;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adrm
{
    static final Duration a;
    public static final int g = 0;
    public final oco b;
    public final ScheduledExecutorService c;
    public final admj d;
    public final adnd e;
    public final adgg f;
    private final adqd h;
    private final arzb i;
    
    static {
        a = Duration.ofHours(10L);
    }
    
    public adrm(final oco b, final ScheduledExecutorService c, final arzb i, final admj d, final adgg f, final adnd e, final adqd h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = c;
        this.i = i;
        this.d = d;
        this.f = f;
        this.e = e;
        this.h = h;
    }
    
    final adrp a(final Iterable iterable, final adrh adrh) {
        final String a = iterable.iterator().next().a;
        final adrf c = iterable.iterator().next().c;
        return new adrp(a, this, c, afvh.f(afxr.r(iterable), (afvq)new vdx(this, a, adrh, c, 6), (Executor)afwd.a));
    }
    
    public final adrp b(final Iterable iterable, final String s, final adrh adrh, final adrf adrf) {
        if (agpx.aq(iterable, aafv.r)) {
            final HashSet set = new HashSet();
            final afag a = afag.a;
            final Iterator iterator = iterable.iterator();
            afbh k = a;
            while (iterator.hasNext()) {
                final adro adro = (adro)iterator.next();
                if (!adro.a()) {
                    set.addAll(adro.b);
                    final afbh c = adro.c;
                    if (!c.h()) {
                        continue;
                    }
                    if (k.h()) {
                        final Duration duration = (Duration)k.c();
                        final Duration duration2 = (Duration)c.c();
                        Duration duration3 = duration;
                        if (((Comparable<Duration>)duration).compareTo(duration2) > 0) {
                            duration3 = duration2;
                        }
                        k = afbh.k(duration3);
                    }
                    else {
                        k = c;
                    }
                }
            }
            final asdz b = adro.b(s);
            b.f(afhk.p(set));
            b.e(k);
            final adro d = b.d();
            adrh.g();
            d.toString();
            return new adrp(s, this, adrf, afxr.l(d));
        }
        adrh.g();
        return this.c(s, adrf, adrh);
    }
    
    final adrp c(final String s, final adrf adrf, final adrh adrh) {
        return new adrp(s, this, adrf, aenn.a((aenm)new adri(this, s, adrh, adrf, 0), TimeUnit.HOURS, this.c));
    }
    
    public final String d(final String s, final adrh adrh, final adrf adrf, final adrl adrl) {
        this.c.execute(new adrj(this, adrl, s, adrh, adrf));
        return "Executing UploadTask ".concat(adrh.g());
    }
    
    public final void e(final String s, final adog adog, final adrh adrh, final adrf adrf, final adrl adrl) {
        if (adog == null) {
            adrl.a.Q((Object)adro.b(s).d());
            return;
        }
        final int y = adme.y(adog.c);
        if (y != 0) {
            if (y == 3) {
                final Duration between = Duration.between((Temporal)Instant.ofEpochMilli(this.b.c()), (Temporal)Instant.ofEpochMilli(adog.f));
                if (between.compareTo(Duration.ZERO) <= 0) {
                    this.c.execute((Runnable)new ashm(this, s, adrh, adrf, adrl, 1));
                    return;
                }
                apkz apkz;
                if ((apkz = this.i.f().h) == null) {
                    apkz = apkz.a;
                }
                long n;
                if ((n = apkz.r) == 0L) {
                    n = adrm.a.toMillis();
                }
                if (between.toMillis() <= n) {
                    between.getSeconds();
                    adrl.c(this.c.schedule((Callable<Object>)new iiq(this, s, adrh, adrf, adrl, 6), between.toMillis(), TimeUnit.MILLISECONDS));
                    return;
                }
                between.getSeconds();
                final asdz b = adro.b(s);
                b.e(afbh.k(between));
                adrl.a.Q((Object)b.d());
                return;
            }
        }
        adrl.a.Q((Object)adro.b(s).d());
    }
    
    public final void f(final String s, final admm admm, final adrh adrh, final adrf adrf, final adrl adrl, final long n, final boolean b) {
        if (adrf.a()) {
            try {
                final adoj b2 = this.d.b(s);
                if (b2 != null && b2.w) {
                    if (!b2.x) {
                        return;
                    }
                }
            }
            catch (final admk admk) {
                this.f.D("Missing job while evaluating interruption, completing with exception.", (Throwable)admk);
                tut.c("UploadTaskController", "Missing job while evaluating interruption, completing with exception.");
                adrl.a.R((Throwable)admk);
                return;
            }
        }
        try {
            final adne a = this.d.a(s, admm);
            this.h.a(a);
            final adoj a2 = a.a;
            final adoj b3 = a.b;
            String s2;
            if (a2 != null) {
                s2 = a2.e;
            }
            else if (b3 != null) {
                s2 = b3.e;
            }
            else {
                s2 = "";
            }
            adog b4;
            if (b3 == null) {
                b4 = null;
            }
            else {
                b4 = adrh.b(b3);
                String.valueOf(b4);
            }
            adog adog = b4;
            if (!b) {
                final int n2 = 1;
                if ((adog = b4) == null) {
                    final ahcr builder = adog.a.createBuilder();
                    builder.copyOnWrite();
                    final adog adog2 = (adog)builder.instance;
                    adog2.c = 1;
                    adog2.b |= 0x1;
                    adog = (adog)builder.build();
                }
                final adnd e = this.e;
                final apki j = adrh.j;
                int y;
                if ((y = adme.y(adog.c)) == 0) {
                    y = 1;
                }
                apkh apkh;
                if ((apkh = apkh.b(adog.d)) == null) {
                    apkh = apkh.a;
                }
                final ahcr builder2 = apjs.a.createBuilder();
                final apjq a3 = e.a(s);
                builder2.copyOnWrite();
                final apjs apjs = (apjs)builder2.instance;
                a3.getClass();
                apjs.c = a3;
                apjs.b |= 0x1;
                builder2.copyOnWrite();
                final apjs apjs2 = (apjs)builder2.instance;
                apjs2.d = j.S;
                apjs2.b |= 0x2;
                int n3;
                if (--y != 1) {
                    if (y != 2) {
                        if (y != 3) {
                            n3 = n2;
                        }
                        else {
                            n3 = 4;
                        }
                    }
                    else {
                        n3 = 3;
                    }
                }
                else {
                    n3 = 2;
                }
                builder2.copyOnWrite();
                final apjs apjs3 = (apjs)builder2.instance;
                apjs3.e = n3 - 1;
                apjs3.b |= 0x4;
                builder2.copyOnWrite();
                final apjs apjs4 = (apjs)builder2.instance;
                apjs4.f = apkh.aD;
                apjs4.b |= 0x8;
                final apjs apjs5 = (apjs)builder2.build();
                final akps d = akpu.d();
                ((ahcr)d).copyOnWrite();
                akpu.ap((akpu)d.instance, apjs5);
                e.b(s2, (akpu)((ahcr)d).build());
                adrh.r(this.b.c() - n, b3);
            }
            this.e(s, adog, adrh, adrf, adrl);
        }
        catch (final admk admk2) {
            adrl.a.R((Throwable)admk2);
        }
    }
}
