import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Supplier;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import j$.util.Optional;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igu
{
    static final long a;
    public static final int e = 0;
    public final Executor b;
    public final vai c;
    public final aacf d;
    private final oby f;
    private final aait g;
    
    static {
        TimeUnit.HOURS.toMillis(12L);
        a = TimeUnit.HOURS.toSeconds(12L);
    }
    
    public igu(final Executor b, final aacf d, final oby f, final aait g, final vai c, final byte[] array) {
        this.b = b;
        this.d = d;
        this.f = f;
        this.g = g;
        this.c = c;
    }
    
    public static final List h(final aoxc aoxc) {
        return (List)Collection$_EL.stream((Collection)aoxc.c()).flatMap((Function)ifj.e).collect(afci.a);
    }
    
    public static final boolean i(final Optional optional, final ijk ijk) {
        if (!ijk.p) {
            if (!optional.isEmpty()) {
                final aoxc h = ((ancy)optional.get()).h();
                Object o;
                if (h != null) {
                    o = h(h);
                }
                else {
                    o = afeq.q();
                }
                final Iterator iterator = ((List)o).iterator();
                aoln aoln = null;
                aoln aoln2 = null;
                while (iterator.hasNext()) {
                    final aoln aoln3 = (aoln)iterator.next();
                    final int e = aoln3.e;
                    final int bc = aqsx.bc(e);
                    if (bc != 0) {
                        if (bc == 2) {
                            aoln = aoln3;
                            continue;
                        }
                    }
                    final int bc2 = aqsx.bc(e);
                    if (bc2 != 0 && bc2 == 3) {
                        aoln2 = aoln3;
                    }
                }
                if (aoln != null && aoln2 != null && aoln.c == aoln.d) {
                    final long c = aoln2.c;
                    if (c > 0L && c < aoln2.d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static final boolean j(final ijk ijk) {
        return ijk != ijk.a && ijk != ijk.e && ijk != ijk.c && ijk != ijk.d;
    }
    
    private final boolean k(final amwb amwb) {
        final long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f.c());
        final long longValue = amwb.getExpirationTimestamp();
        amvl a;
        try {
            a = (amvl)ahbh.parseFrom((ahbh)amvl.a, amwb.getOfflineStateBytes(), ExtensionRegistryLite.getGeneratedRegistry());
        }
        catch (final ahca ahca) {
            ttr.d("Failed to get Offline State.", (Throwable)ahca);
            a = amvl.a;
        }
        final long n = a.g;
        final int cx = aqsx.cX(amwb.getOfflineFutureUnplayableInfo().d);
        boolean b = false;
        Label_0172: {
            if (cx != 0 && cx == 2) {
                long max;
                if (amwb.getOfflineFutureUnplayableInfo() != null && amwb.getOfflineFutureUnplayableInfo().c >= 0L) {
                    max = Math.max(amwb.getLastUpdatedTimestampSeconds() + amwb.getOfflineFutureUnplayableInfo().c - TimeUnit.MILLISECONDS.toSeconds(this.f.c()), 0L);
                }
                else {
                    max = 0L;
                }
                if (max == 0L) {
                    b = true;
                    break Label_0172;
                }
            }
            b = false;
        }
        final long longValue2 = amwb.getExpirationTimestamp();
        final long a2 = igu.a;
        return seconds > longValue2 || seconds < longValue - n - a2 || b;
    }
    
    private static boolean l(final akwz akwz) {
        return !aakv.o(akwz);
    }
    
    private static boolean m(final aowy aowy, final aowz aowz) {
        return aowy.d.equals((Object)aowy) && aowz.c.equals((Object)aowz);
    }
    
    private static boolean n(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final int af = aevy.aF(((aoln)iterator.next()).f);
            if (af != 0 && af == 4) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean o(final aowy aowy) {
        return aowy.f.equals((Object)aowy) || aowy.a.equals((Object)aowy);
    }
    
    public final ijk a(final boolean b, final ancy ancy, final amwb amwb, final aoxc aoxc) {
        final aowy transferState = aoxc.getTransferState();
        final aowz failureReason = aoxc.getFailureReason();
        akxi a;
        if ((a = (akxi)vlq.c(ancy.getPlayerResponseBytes().I(), (MessageLite)akxi.a)) == null) {
            a = akxi.a;
        }
        akwz akwz;
        if ((akwz = a.f) == null) {
            akwz = akwz.a;
        }
        final List h = h(aoxc);
        if (b || o(transferState) || this.g(amwb) || m(transferState, failureReason) || l(akwz) || n(h)) {
            if (l(akwz) && aakv.q(akwz)) {
                final Optional optional = Optional.of((Object)ijk.f);
                return (ijk)optional.orElseGet((Supplier)new igs(aoxc, transferState, 0));
            }
            if (l(akwz)) {
                final Optional optional = Optional.of((Object)ijk.g);
                return (ijk)optional.orElseGet((Supplier)new igs(aoxc, transferState, 0));
            }
            if (b) {
                final Optional optional = Optional.of((Object)ijk.m);
                return (ijk)optional.orElseGet((Supplier)new igs(aoxc, transferState, 0));
            }
            if (this.g(amwb)) {
                if (this.k(amwb)) {
                    final Optional optional = Optional.of((Object)ijk.i);
                    return (ijk)optional.orElseGet((Supplier)new igs(aoxc, transferState, 0));
                }
                final Optional optional = Optional.of((Object)ijk.h);
                return (ijk)optional.orElseGet((Supplier)new igs(aoxc, transferState, 0));
            }
            else {
                if (n(h)) {
                    final Optional optional = Optional.of((Object)ijk.l);
                    return (ijk)optional.orElseGet((Supplier)new igs(aoxc, transferState, 0));
                }
                if (aowy.f.equals((Object)transferState) && aowz.b.equals((Object)failureReason)) {
                    final Optional optional = Optional.of((Object)ijk.j);
                    return (ijk)optional.orElseGet((Supplier)new igs(aoxc, transferState, 0));
                }
                if (o(transferState)) {
                    final Optional optional = Optional.of((Object)ijk.n);
                    return (ijk)optional.orElseGet((Supplier)new igs(aoxc, transferState, 0));
                }
                if (m(transferState, failureReason)) {
                    final Optional optional = Optional.of((Object)ijk.k);
                    return (ijk)optional.orElseGet((Supplier)new igs(aoxc, transferState, 0));
                }
            }
        }
        final Optional optional = Optional.empty();
        return (ijk)optional.orElseGet((Supplier)new igs(aoxc, transferState, 0));
    }
    
    @Deprecated
    public final ListenableFuture b(final Optional optional, final Optional optional2) {
        if (this.g.f()) {
            if (optional.isEmpty()) {
                return afwm.m((Object)ijk.d);
            }
        }
        else if (optional.isEmpty() || optional2.isEmpty()) {
            return afwm.m((Object)ijk.d);
        }
        final aoxc h = ((ancy)optional.get()).h();
        if (h == null) {
            return afwm.m((Object)ijk.b);
        }
        if (this.g.f()) {
            if (h.getTransferState() == aowy.e) {
                return afwm.m((Object)ijk.e);
            }
            if (optional2.isEmpty()) {
                return afwm.m((Object)ijk.d);
            }
        }
        return aftq.e((ListenableFuture)afvk.m(this.d.e(vgl.i(((ancy)optional.get()).e()))), (aezf)new igt(this, optional, optional2, h, 1), this.b);
    }
    
    public final ListenableFuture c(final Optional optional, final Optional optional2, final Optional optional3) {
        if (!optional.isEmpty() && ((amam)optional.get()).getPendingApproval()) {
            return afwm.m((Object)ijk.b);
        }
        if (this.g.f()) {
            if (optional2.isEmpty()) {
                return afwm.m((Object)ijk.d);
            }
        }
        else if (optional2.isEmpty() || optional3.isEmpty()) {
            return afwm.m((Object)ijk.d);
        }
        final aoxc h = ((ancy)optional2.get()).h();
        if (h == null) {
            return afwm.m((Object)ijk.d);
        }
        if (this.g.f()) {
            if (h.getTransferState() == aowy.e) {
                return afwm.m((Object)ijk.e);
            }
            if (optional3.isEmpty()) {
                return afwm.m((Object)ijk.d);
            }
        }
        return aftq.e((ListenableFuture)afvk.m(this.d.e(vgl.i(((ancy)optional2.get()).e()))), (aezf)new igt(this, optional2, optional3, h, 0), this.b);
    }
    
    @Deprecated
    public final ListenableFuture d(final Optional optional, final Optional optional2) {
        return aftq.e((ListenableFuture)afvk.m(this.b(optional, optional2)), (aezf)huo.j, this.b);
    }
    
    @Deprecated
    public final ListenableFuture e(final Optional optional, final Optional optional2) {
        if (!optional.isEmpty() && !optional2.isEmpty()) {
            return aftq.f(aftq.e((ListenableFuture)afvk.m(this.d.d(vgl.i(((ancy)optional.get()).e()))), (aezf)huo.k, this.b), (aftz)new iih(this, optional, optional2, 1), this.b);
        }
        return afwm.m((Object)false);
    }
    
    @Deprecated
    public final ListenableFuture f(final Optional optional, final Optional optional2) {
        return aftq.e((ListenableFuture)afvk.m(this.b(optional, optional2)), (aezf)new igr(optional, 0), this.b);
    }
    
    public final boolean g(final amwb amwb) {
        return !amwb.getAction().equals((Object)amvy.b) || this.k(amwb);
    }
}
