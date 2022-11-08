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

public final class gug
{
    private static final String g;
    private static final String h;
    private static final String i;
    public ReelWatchBackstack$BackstackEntryStack a;
    public final Deque b;
    public final atje c;
    public final asgn d;
    public final arud e;
    private final bu j;
    private final afcw k;
    private final atjj l;
    private final oas m;
    private final uyf n;
    
    static {
        g = String.valueOf(gug.class.getName()).concat("$ARG_BACKSTACK_POSITION");
        h = String.valueOf(gug.class.getName()).concat("$ARG_TRIGGERED_ACTION");
        i = gug.class.getCanonicalName();
    }
    
    public gug(final uyf n, final arud e, final bu j, final mrm mrm, final Map map, final atjj l, final oas m, final asho asho, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final atje ax = ((atje)atir.aR((Object)Optional.empty())).aX();
        this.c = ax;
        this.n = n;
        this.e = e;
        this.j = j;
        this.k = afcw.k(map);
        this.a = new ReelWatchBackstack$BackstackEntryStack();
        final ArrayDeque b = new ArrayDeque();
        this.b = b;
        this.l = l;
        this.m = m;
        final cgh savedStateRegistry = ((qt)j).getSavedStateRegistry();
        final String i = gug.i;
        savedStateRegistry.c(i, (cgg)new cb(this, 4));
        anqa anqa;
        if ((anqa = n.b().A) == null) {
            anqa = anqa.a;
        }
        asgn d;
        if (anqa.b) {
            d = ((ashe)ax).ak((asjc)new glv(this, 3)).am((asjd)flu.i).h().e();
        }
        else {
            d = asgn.B();
        }
        (this.d = d).getClass();
        mrm.A((Callable)new guf(d, 2));
        mrm.A((Callable)new czz(this, n, asho, 3));
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
        return guh.a(bundle.getInt(gug.h, -1));
    }
    
    public static OptionalInt d(final Bundle bundle) {
        if (bundle == null) {
            return OptionalInt.empty();
        }
        final String g = gug.g;
        if (!bundle.containsKey(g)) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(bundle.getInt(g));
    }
    
    private final br i(final ReelWatchBackstack$BackstackEntry reelWatchBackstack$BackstackEntry, final guh guh, final int n) {
        final aioe a = reelWatchBackstack$BackstackEntry.a;
        final Bundle b = reelWatchBackstack$BackstackEntry.b;
        if (!b.containsKey("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY")) {
            b.putLong("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", this.m.c());
        }
        if (!b.containsKey("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY")) {
            b.putString("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY", "warm");
        }
        b.putInt(gug.g, n);
        b.putInt(gug.h, guh.ordinal());
        final Object a2 = vay.a(a);
        a2.getClass();
        final guj guj = (guj)this.k.get((Object)a2.getClass());
        guj.getClass();
        final br a3 = guj.a(a, b);
        if (a3 instanceof gui) {
            final gui gui = (gui)a3;
        }
        a3.ai(reelWatchBackstack$BackstackEntry.c);
        if (a3 instanceof guk) {
            ((guk)a3).o(reelWatchBackstack$BackstackEntry.d);
        }
        return a3;
    }
    
    private final void j(final br br) {
        final Optional map = Optional.ofNullable((Object)br).filter((Predicate)new fqe(gui.class, 10)).map((Function)new fnm(gui.class, 20));
        map.ifPresent((Consumer)gyc.b);
        this.c.tr((Object)map);
    }
    
    private final void k(final ReelWatchBackstack$BackstackEntry reelWatchBackstack$BackstackEntry) {
        reelWatchBackstack$BackstackEntry.a.getClass();
        reelWatchBackstack$BackstackEntry.b.getClass();
        if (!this.g()) {
            final aioe a = reelWatchBackstack$BackstackEntry.a;
            final aioe b = this.b();
            final Object a2 = vay.a(a);
            a2.getClass();
            final Object a3 = vay.a(b);
            a3.getClass();
            if (a2.equals(a3)) {
                return;
            }
        }
        this.a.e(reelWatchBackstack$BackstackEntry);
        if (this.b.peekLast() instanceof gui) {
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
        final br i = this.i(reelWatchBackstack$BackstackEntry, guh.a, this.a.a() - 1);
        this.b.addLast(i);
        final ct j = this.j.getSupportFragmentManager().i();
        j.q(2131431084, i);
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
    
    public final aioe b() {
        final ReelWatchBackstack$BackstackEntry c = this.a.c();
        if (c == null) {
            return null;
        }
        return c.a;
    }
    
    public final void e(final aioe aioe, final Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        this.k(ReelWatchBackstack$BackstackEntry.a(aioe, bundle2, null, null));
    }
    
    public final void f(final br br, final int n) {
        final ReelWatchBackstack$BackstackEntry b = this.a.b(n);
        final Fragment$SavedState c = this.j.getSupportFragmentManager().c(br);
        Object n2;
        if (br instanceof guk) {
            n2 = ((guk)br).n();
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
            anqa anqa;
            if ((anqa = this.n.b().A) == null) {
                anqa = anqa.a;
            }
            if (anqa.b) {
                return false;
            }
            throw new NoSuchElementException();
        }
        else {
            if (this.b.peekLast() instanceof gui && !this.b.peekLast().m()) {
                return false;
            }
            this.a.d();
            final br br = this.b.removeLast();
            if (!this.g()) {
                final ReelWatchBackstack$BackstackEntry d = this.a.d();
                final agzc agzc = (agzc)((agzi)d.a).toBuilder();
                agzc.d((agyr)amoa.b);
                final aioe f = ((wwu)this.l.a()).n().f((aioe)agzc.build());
                final agza builder = ((agzi)((agzd)f).rr((agyr)amoa.b)).toBuilder();
                builder.copyOnWrite();
                final amob amob = (amob)builder.instance;
                amob.b |= 0x2;
                amob.d = 22156;
                final amob amob2 = (amob)builder.build();
                final agzc agzc2 = (agzc)((agzi)f).toBuilder();
                agzc2.e((agyr)amoa.b, amob2);
                final aioe aioe = (aioe)agzc2.build();
                final Bundle b = d.b;
                b.putByteArray(gub.a, ((agxl)aioe).toByteArray());
                this.a.e(ReelWatchBackstack$BackstackEntry.a(aioe, b, d.c, d.d));
                if (this.b.isEmpty()) {
                    final br i = this.i(this.a.c(), guh.b, this.a.a() - 1);
                    this.b.addLast(i);
                    final ct j = this.j.getSupportFragmentManager().i();
                    j.q(2131431084, i);
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
