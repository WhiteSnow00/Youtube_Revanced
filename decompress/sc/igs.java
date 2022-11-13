import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.os.Bundle;
import java.util.function.Function;
import j$.util.Optional;
import java.util.Map;
import java.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igs implements Supplier
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public igs(final adrh a, final adqk b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public igs(final aoxc a, final aowy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public igs(final gol b, final aiqj a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public igs(final Map b, final Supplier a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object get() {
        final int c = this.c;
        if (c == 0) {
            final Object a = this.a;
            final Object b = this.b;
            if (!aowy.g.equals(b)) {
                final Iterator iterator = igu.h((aoxc)a).iterator();
                long n = 0L;
                long n2 = 0L;
                while (iterator.hasNext()) {
                    final aoln aoln = (aoln)iterator.next();
                    n += aoln.d;
                    n2 += aoln.c;
                }
                float n3;
                if (n > 0L) {
                    n3 = n2 / (float)n;
                }
                else {
                    n3 = 0.0f;
                }
                if (n3 != 1.0f) {
                    if (aowy.e.equals(b)) {
                        return ijk.e;
                    }
                    if (aowy.d.equals(b)) {
                        return ijk.c;
                    }
                    return ijk.d;
                }
            }
            return ijk.a;
        }
        if (c == 1) {
            return Optional.ofNullable((Object)((gol)this.b).c).map((Function)new fnr((aiqj)this.a, 19)).map((Function)gnx.j).orElse((Object)new Bundle());
        }
        if (c != 2) {
            if (c != 3) {
                final Object a2 = this.a;
                final Object b2 = this.b;
                final adrh adrh = (adrh)a2;
                adrm adrm;
                if (adrh.i.isPresent()) {
                    adrm = (adrm)adrh.i.get();
                }
                else {
                    adrm = new adrm(((adri)adrh.l.get()).a, ((adri)adrh.l.get()).b, adrh.t, (afss)afsr.a, adrh.g);
                }
                final String d = adrm.d;
                final afss f = adrm.f;
                final adry adry = new adry(d, adrm.e);
                Object o = adry.b;
                synchronized (o) {
                    adry.a = new adrw(f);
                    monitorexit(o);
                    final adrl adrl = new adrl(adrm, (adqk)b2, adry, 0);
                    final achg p = achg.p;
                    final aekp aekp = new aekp((adqk)b2, (Executor)adrm.b.c);
                    o = adsc.a;
                    final adjk adjk = new adjk(aekp, 3, (byte[])null, (byte[])null, (byte[])null);
                    final adqz adqz = new adqz(adrm, (Supplier)adrl, 5);
                    final odh c2 = adrm.c;
                    if (c2 == null) {
                        throw new NullPointerException("Null ipcManager");
                    }
                    final adqx e = adrm.e;
                    final afvt b3 = adrm.b.b;
                    adet adet;
                    if (e.c) {
                        adet = new adet((afvr)null);
                    }
                    else {
                        adet = new adet(b3.g((Runnable)new adme((Runnable)adqz, 7), e.d.toMillis(), e.d.toMillis(), TimeUnit.MILLISECONDS));
                    }
                    adrm.c.getClass();
                    final adqx e2 = adrm.e;
                    final aujg aujg = new aujg((adrz)adry, (Consumer)adjk, e2);
                    if (e2 != null) {
                        final adrn adrn = p.apply(new adro(c2, adet, (adrz)adry, aujg, e2, aekp, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                        afwm.w(afwm.q((Callable)new zup((adqk)aekp.b, 12), (Executor)aekp.a), (afva)new fkh(adrn, (adse)o, 12), (Executor)afum.a);
                        adrh.e = Optional.of((Object)adrn);
                        return adrh.e.get();
                    }
                    throw new NullPointerException("Null config");
                }
            }
            final atke atke = ((Map<K, atke>)this.b).get(((Supplier<Object>)this.a).get());
            atke.getClass();
            return atke.a();
        }
        final heo heo = ((Map<K, heo>)this.b).get(((Supplier<Object>)this.a).get());
        heo.getClass();
        return heo;
    }
}
