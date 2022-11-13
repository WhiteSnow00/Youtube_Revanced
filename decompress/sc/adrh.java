import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Supplier;
import j$.util.stream.Collectors;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.concurrent.Executor;
import java.util.function.Function;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adrh implements adqn
{
    static final adqt a;
    static final ahab b;
    public static final afkk c;
    public Optional d;
    public Optional e;
    public final adrg f;
    public final adrj g;
    public final Function h;
    public final Optional i;
    public final Executor j;
    public final adrr k;
    public Optional l;
    public final Optional m;
    public Optional n;
    public Optional o;
    public Optional p;
    public Optional q;
    public Optional r;
    public adqt s;
    public adqx t;
    
    static {
        final adqs a2 = adqt.a();
        a2.b("");
        a2.c("");
        a2.a = 1;
        a = a2.a();
        b = ahab.A("{}");
        c = afkk.m("com/google/android/livesharing/internal/LiveSharingClientImpl");
    }
    
    public adrh(final Optional optional, final Optional optional2) {
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = new adrg(this);
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.q = Optional.empty();
        this.r = Optional.empty();
        this.s = adrh.a;
        this.t = adqx.b;
        Optional.empty();
        this.i = Optional.empty();
        this.k = adrt.a;
        final afvs a = adrq.a(optional);
        if (a == null) {
            throw new NullPointerException("Null internalExecutor");
        }
        final afvt b = adrq.b(optional2);
        if (b == null) {
            throw new NullPointerException("Null heartbeatExecutor");
        }
        final afvs a2 = adrq.a(optional);
        if (a2 == null) {
            throw new NullPointerException("Null coWatchingDelegateExecutor");
        }
        final afvs a3 = adrq.a(optional);
        if (a3 == null) {
            throw new NullPointerException("Null coDoingDelegateExecutor");
        }
        final afvs a4 = adrq.a(optional);
        if (a4 == null) {
            throw new NullPointerException("Null incomingIpcExecutor");
        }
        final afvs a5 = adrq.a(optional);
        if (a5 != null) {
            final adrj g = new adrj(a, b, a2, a3, a5, a4);
            this.g = g;
            this.h = new adfl(this, 3);
            this.j = afwm.g((Executor)g.a);
            return;
        }
        throw new NullPointerException("Null outgoingIpcExecutor");
    }
    
    public static void f(final Optional optional, final String s) {
        adkp.R(optional.isPresent(), (Object)s);
    }
    
    public static void h(final Optional optional) {
        f(optional, "Unexpected call to disconnectMeeting before calling connectMeeting");
    }
    
    public static void i(final Optional optional) {
        f(optional, "Expected co-watching activity to exist before calling endCoWatching.");
    }
    
    static void o(final och och) {
        afft.o((Iterable)Collection$_EL.stream((Collection)och.b).map((Function)achg.o).collect(Collectors.toCollection((Supplier)acoe.e)));
    }
    
    public final ListenableFuture a(final adqk adqk) {
        adqk.getClass();
        return afwm.r((afty)new adef(this, adqk, 11), this.j);
    }
    
    public final ListenableFuture b() {
        return afwm.r((afty)new qqz(this, 17), this.j);
    }
    
    public final ListenableFuture c() {
        return afwm.r((afty)new qqz(this, 15), this.j);
    }
    
    public final ListenableFuture d(final Context context, final Optional optional) {
        context.getApplicationContext().getClass();
        return adrd.b(sl.c((ace)new ihc((adru)this.k, context, optional, 7)), "Unexpected error when trying to query meeting.");
    }
    
    public final ListenableFuture e(final Context context, final adqu adqu) {
        adkp.R(true, (Object)"Expected 'liveSharingApplicationName' to be a non-empty string.");
        return afwm.r((afty)new phu(this, context, adqu, 9), this.j);
    }
    
    public final void g(final String s) {
        adkp.T(this.m(), "Expected meeting to be connected before calling %s.", (Object)s);
    }
    
    public final void j() {
        ((adre)this.d.get()).h();
        this.d = Optional.empty();
        this.p = Optional.empty();
    }
    
    public final void k() {
        ((adrf)this.e.get()).h();
        this.e = Optional.empty();
        this.o = Optional.empty();
    }
    
    public final void l() {
        ((afki)((afki)((afkg)adrh.c).d()).j("com/google/android/livesharing/internal/LiveSharingClientImpl", "resetDisconnectState", 713, "LiveSharingClientImpl.java")).r("Resetting client to disconnected state.");
        this.l = Optional.empty();
        this.s = adrh.a;
        this.t = adqx.b;
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.q = Optional.empty();
        this.r = Optional.empty();
    }
    
    public final boolean m() {
        return this.s.b == 2 && this.l.isPresent();
    }
    
    public final void n() {
        this.g("endCoWatching");
        i(this.e);
        adrd.d((Runnable)new adme(this, 9), "Unexpected error when trying to end co-watching.");
    }
}
