import java.util.NoSuchElementException;
import android.support.v4.app.Fragment$SavedState;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntry;
import j$.util.OptionalInt;
import android.os.Bundle;
import java.util.concurrent.Callable;
import java.util.ArrayDeque;
import j$.util.Optional;
import java.util.Map;
import java.util.Deque;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntryStack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class guw
{
    public static final int f = 0;
    private static final String g;
    private static final String h;
    private static final String i;
    public ReelWatchBackstack$BackstackEntryStack a;
    public final Deque b;
    public final atjz c;
    public final ashc d;
    public final arwh e;
    private final bu j;
    private final afev k;
    private final atke l;
    private final oby m;
    private final vaf n;
    
    static {
        g = String.valueOf(guw.class.getName()).concat("$ARG_BACKSTACK_POSITION");
        h = String.valueOf(guw.class.getName()).concat("$ARG_TRIGGERED_ACTION");
        i = guw.class.getCanonicalName();
    }
    
    public guw(final vaf n, final arwh e, final bu j, final msr msr, final Map map, final atke l, final oby m, final asid asid, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final atjz bc = ((atjz)atjm.aW((Object)Optional.empty())).bc();
        this.c = bc;
        this.n = n;
        this.e = e;
        this.j = j;
        this.k = afev.k(map);
        this.a = new ReelWatchBackstack$BackstackEntryStack();
        final ArrayDeque b = new ArrayDeque();
        this.b = b;
        this.l = l;
        this.m = m;
        final cgi savedStateRegistry = ((qt)j).getSavedStateRegistry();
        final String i = guw.i;
        savedStateRegistry.c(i, (cgh)new cb(this, 4));
        ansd ansd;
        if ((ansd = n.b().A) == null) {
            ansd = ansd.a;
        }
        ashc d;
        if (ansd.b) {
            d = ((asht)bc).aq((asjr)new gdc(this, 4)).as((asjs)fma.i).h().e();
        }
        else {
            d = ashc.B();
        }
        (this.d = d).getClass();
        msr.Q((Callable)new gqw(d, 3));
        msr.Q((Callable)new daa(this, n, asid, 3));
        final Bundle a = ((qt)j).getSavedStateRegistry().a(i);
        if (a != null) {
            final ReelWatchBackstack$BackstackEntryStack a2 = (ReelWatchBackstack$BackstackEntryStack)a.getParcelable("BUNDLE_STACK_KEY");
            if (a2 != null) {
                this.a = a2;
                b.clear();
                if (!this.a.f()) {
                    this.k(this.a.d());
                }
            }
        }
    }
    
    public static Optional c(final Bundle bundle) {
        if (bundle == null) {
            return Optional.empty();
        }
        return gux.a(bundle.getInt(guw.h, -1));
    }
    
    public static OptionalInt d(final Bundle bundle) {
        if (bundle == null) {
            return OptionalInt.empty();
        }
        final String g = guw.g;
        if (!bundle.containsKey(g)) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(bundle.getInt(g));
    }
    
    private final br i(final ReelWatchBackstack$BackstackEntry reelWatchBackstack$BackstackEntry, final gux gux, final int n) {
        final aiqj a = reelWatchBackstack$BackstackEntry.a;
        final Bundle b = reelWatchBackstack$BackstackEntry.b;
        if (!b.containsKey("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY")) {
            b.putLong("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", this.m.c());
        }
        if (!b.containsKey("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY")) {
            b.putString("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY", "warm");
        }
        b.putInt(guw.g, n);
        b.putInt(guw.h, gux.ordinal());
        final Object a2 = vcz.a(a);
        a2.getClass();
        final guz guz = (guz)this.k.get(a2.getClass());
        guz.getClass();
        final br a3 = guz.a(a, b);
        if (a3 instanceof guy) {
            final guy guy = (guy)a3;
        }
        a3.ai(reelWatchBackstack$BackstackEntry.c);
        if (a3 instanceof gva) {
            ((gva)a3).o(reelWatchBackstack$BackstackEntry.d);
        }
        return a3;
    }
    
    private final void j(final br br) {
        final Optional map = Optional.ofNullable((Object)br).filter((Predicate)new fqn((Class)guy.class, 10)).map((Function)new fnr((Class)guy.class, 20));
        map.ifPresent((Consumer)gyr.b);
        this.c.tu((Object)map);
    }
    
    private final void k(final ReelWatchBackstack$BackstackEntry reelWatchBackstack$BackstackEntry) {
        reelWatchBackstack$BackstackEntry.a.getClass();
        reelWatchBackstack$BackstackEntry.b.getClass();
        if (!this.g()) {
            final aiqj a = reelWatchBackstack$BackstackEntry.a;
            final aiqj b = this.b();
            final Object a2 = vcz.a(a);
            a2.getClass();
            final Object a3 = vcz.a(b);
            a3.getClass();
            if (a2.equals(a3)) {
                return;
            }
        }
        this.a.e(reelWatchBackstack$BackstackEntry);
        if (this.b.peekLast() instanceof guy) {
            this.b.peekLast().d();
        }
        br br;
        if (this.b.size() == 1) {
            this.f(this.b.peekFirst(), this.a.a() - 2);
            br = this.b.removeFirst();
        }
        else {
            br = null;
        }
        final br i = this.i(reelWatchBackstack$BackstackEntry, gux.a, this.a.a() - 1);
        this.b.addLast(i);
        final ct j = this.j.getSupportFragmentManager().i();
        j.q(2131431087, i);
        j.d();
        if (br != null) {
            final ct k = this.j.getSupportFragmentManager().i();
            k.n(br);
            k.a();
        }
        this.j(i);
    }
    
    public final br a() {
        return this.b.peekLast();
    }
    
    public final aiqj b() {
        final ReelWatchBackstack$BackstackEntry c = this.a.c();
        if (c == null) {
            return null;
        }
        return c.a;
    }
    
    public final void e(final aiqj aiqj, final Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        this.k(ReelWatchBackstack$BackstackEntry.a(aiqj, bundle2, (Fragment$SavedState)null, (Object)null));
    }
    
    public final void f(final br br, final int n) {
        final ReelWatchBackstack$BackstackEntry b = this.a.b(n);
        final Fragment$SavedState c = this.j.getSupportFragmentManager().c(br);
        Object n2;
        if (br instanceof gva) {
            n2 = ((gva)br).n();
        }
        else {
            n2 = null;
        }
        final Bundle b2 = b.b;
        b2.remove("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY");
        b2.remove("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY");
        b2.remove("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.USE_CLIENT_TRIGGERED_GET_PLAYER_INITIAL_KEY");
        final ReelWatchBackstack$BackstackEntry a = ReelWatchBackstack$BackstackEntry.a(b.a, b2, c, n2);
        final ReelWatchBackstack$BackstackEntryStack a2 = this.a;
        a2.a.remove(n);
        a2.a.add(n, a);
    }
    
    public final boolean g() {
        return this.a.f();
    }
    
    public final boolean h() {
        if (this.a.f()) {
            ansd ansd;
            if ((ansd = this.n.b().A) == null) {
                ansd = ansd.a;
            }
            if (ansd.b) {
                return false;
            }
            throw new NoSuchElementException();
        }
        else {
            if (this.b.peekLast() instanceof guy && !this.b.peekLast().m()) {
                return false;
            }
            this.a.d();
            final br br = this.b.removeLast();
            if (!this.g()) {
                final ReelWatchBackstack$BackstackEntry d = this.a.d();
                final ahbb ahbb = (ahbb)((ahbh)d.a).toBuilder();
                ahbb.d((ahaq)amqf.b);
                final aiqj f = ((wyv)this.l.a()).pF().f((aiqj)((ahaz)ahbb).build());
                final ahaz builder = ((ahbh)((ahbc)f).rx((ahaq)amqf.b)).toBuilder();
                builder.copyOnWrite();
                final amqg amqg = (amqg)builder.instance;
                amqg.b |= 0x2;
                amqg.d = 22156;
                final amqg amqg2 = (amqg)builder.build();
                final ahbb ahbb2 = (ahbb)((ahbh)f).toBuilder();
                ahbb2.e((ahaq)amqf.b, (Object)amqg2);
                final aiqj aiqj = (aiqj)((ahaz)ahbb2).build();
                final Bundle b = d.b;
                b.putByteArray(gut.a, ((agzk)aiqj).toByteArray());
                this.a.e(ReelWatchBackstack$BackstackEntry.a(aiqj, b, d.c, d.d));
                if (this.b.isEmpty()) {
                    final br i = this.i(this.a.c(), gux.b, this.a.a() - 1);
                    this.b.addLast(i);
                    final ct j = this.j.getSupportFragmentManager().i();
                    j.q(2131431087, i);
                    j.d();
                }
                final ct k = this.j.getSupportFragmentManager().i();
                k.n(br);
                k.a();
                this.j(this.b.peekLast());
                return true;
            }
            this.j.finish();
            return false;
        }
    }
}
