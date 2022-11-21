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

public final class adsx implements adse
{
    static final adsk a;
    public static final ahbt b;
    public static final afma c;
    public Optional d;
    public Optional e;
    public final adsw f;
    public final adsz g;
    public final Function h;
    public final Optional i;
    public final Executor j;
    public final adti k;
    public Optional l;
    public final Optional m;
    public Optional n;
    public Optional o;
    public Optional p;
    public Optional q;
    public Optional r;
    public adsk s;
    public adso t;
    
    static {
        final adsj a2 = adsk.a();
        a2.b("");
        a2.c("");
        a2.a = 1;
        a = a2.a();
        b = ahbt.A("{}");
        c = afma.m("com/google/android/livesharing/internal/LiveSharingClientImpl");
    }
    
    public adsx(final Optional optional, final Optional optional2) {
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = new adsw(this);
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.q = Optional.empty();
        this.r = Optional.empty();
        this.s = adsx.a;
        this.t = adso.b;
        Optional.empty();
        this.i = Optional.empty();
        this.k = adtk.a;
        final afxj a = adth.a(optional);
        if (a == null) {
            throw new NullPointerException("Null internalExecutor");
        }
        final afxk b = adth.b(optional2);
        if (b == null) {
            throw new NullPointerException("Null heartbeatExecutor");
        }
        final afxj a2 = adth.a(optional);
        if (a2 == null) {
            throw new NullPointerException("Null coWatchingDelegateExecutor");
        }
        final afxj a3 = adth.a(optional);
        if (a3 == null) {
            throw new NullPointerException("Null coDoingDelegateExecutor");
        }
        final afxj a4 = adth.a(optional);
        if (a4 == null) {
            throw new NullPointerException("Null incomingIpcExecutor");
        }
        final afxj a5 = adth.a(optional);
        if (a5 != null) {
            final adsz g = new adsz(a, b, a2, a3, a5, a4);
            this.g = g;
            this.h = (Function)new adgy(this, 4);
            this.j = afxr.f(g.a);
            return;
        }
        throw new NullPointerException("Null outgoingIpcExecutor");
    }
    
    public static void f(final Optional optional, final String s) {
        adme.U(optional.isPresent(), s);
    }
    
    public static void h(final Optional optional) {
        f(optional, "Unexpected call to disconnectMeeting before calling connectMeeting");
    }
    
    public static void i(final Optional optional) {
        f(optional, "Expected co-watching activity to exist before calling endCoWatching.");
    }
    
    public static void o(final ocx ocx) {
        afhk.o((Iterable)Collection$_EL.stream((Collection)ocx.b).map((Function)adtc.b).collect(Collectors.toCollection((Supplier)achh.g)));
    }
    
    @Override
    public final ListenableFuture a(final adsb adsb) {
        adsb.getClass();
        return afxr.q((afvp)new adfs(this, adsb, 11), this.j);
    }
    
    @Override
    public final ListenableFuture b() {
        return afxr.q((afvp)new qrs(this, 17), this.j);
    }
    
    @Override
    public final ListenableFuture c() {
        return afxr.q((afvp)new qrs(this, 15), this.j);
    }
    
    @Override
    public final ListenableFuture d(final Context context, final Optional optional) {
        context.getApplicationContext().getClass();
        return adst.b(sl.h((acf)new ihl((adtl)this.k, context, optional, 7)), "Unexpected error when trying to query meeting.");
    }
    
    @Override
    public final ListenableFuture e(final Context context, final adsl adsl) {
        adme.U(true, "Expected 'liveSharingApplicationName' to be a non-empty string.");
        return afxr.q((afvp)new pim(this, context, adsl, 9), this.j);
    }
    
    public final void g(final String s) {
        adme.W(this.m(), "Expected meeting to be connected before calling %s.", s);
    }
    
    public final void j() {
        ((adsu)this.d.get()).h();
        this.d = Optional.empty();
        this.p = Optional.empty();
    }
    
    public final void k() {
        ((adsv)this.e.get()).h();
        this.e = Optional.empty();
        this.o = Optional.empty();
    }
    
    public final void l() {
        ((afly)((afly)((aflw)adsx.c).d()).j("com/google/android/livesharing/internal/LiveSharingClientImpl", "resetDisconnectState", 713, "LiveSharingClientImpl.java")).r("Resetting client to disconnected state.");
        this.l = Optional.empty();
        this.s = adsx.a;
        this.t = adso.b;
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
        adst.d(new adps(this, 8), "Unexpected error when trying to end co-watching.");
    }
}
