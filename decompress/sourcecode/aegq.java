import com.google.apps.tiktok.account.AutoValue_AccountId;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import com.google.protobuf.MessageLite;
import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import com.google.apps.tiktok.tracing.contrib.androidx.TracedDefaultLifecycleObserver;
import com.google.apps.tiktok.account.api.controller.AccountControllerImpl$AccountControllerLifecycleObserver;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.apps.tiktok.account.api.controller.KeepStateCallbacksHandler;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegq extends aegi
{
    public static final afik a;
    public final aegp b;
    public final ActivityAccountState c;
    public final aekg d;
    public final KeepStateCallbacksHandler e;
    public final aehe f;
    public final boolean g;
    public final boolean h;
    public final ExtensionRegistryLite i;
    public final aekh j;
    public aehu k;
    public aegr l;
    public boolean m;
    public boolean n;
    public ListenableFuture o;
    public final aeoe p;
    public final zhb q;
    private final boolean r;
    private final boolean s;
    private final auip t;
    
    static {
        a = afik.m("com/google/apps/tiktok/account/api/controller/AccountControllerImpl");
    }
    
    public aegq(final aeoe p15, final aegp b, final ActivityAccountState c, final aekg d, final auip t, final KeepStateCallbacksHandler e, final zhb q, final aehe f, final ExtensionRegistryLite i, final aexq aexq, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.j = new aegk(this);
        this.p = p15;
        this.b = b;
        this.c = c;
        this.d = d;
        this.t = t;
        this.e = e;
        this.q = q;
        this.f = f;
        this.i = i;
        boolean b2 = false;
        final Boolean value = false;
        this.g = value;
        this.h = (boolean)aexq.e(value);
        this.r = value;
        this.s = value;
        final Object b3 = c.b;
        if (b3 == null || b3 == this) {
            b2 = true;
        }
        agot.D(b2);
        c.b = this;
        p15.getLifecycle().b((aul)TracedDefaultLifecycleObserver.g((atz)new AccountControllerImpl$AccountControllerLifecycleObserver(this)));
        p15.getSavedStateRegistry().c("tiktok_account_controller_saved_instance_state", (cgg)new aegj(this, b));
    }
    
    public static final void r(final aegr aegr) {
        final int b = aegr.b;
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        final boolean b2 = false;
        agot.D((b & 0x20) != 0x0);
        agot.D(aegr.h > 0);
        int f;
        if ((f = aeda.F(aegr.e)) == 0) {
            f = 1;
        }
        if (--f == 1 || f == 2) {
            agot.D((aegr.b & 0x2) != 0x0 ^ true);
            agot.D(aegr.f.size() > 0);
            agot.D((aegr.b & 0x8) != 0x0 ^ true);
            agot.D(aegr.i ^ true);
            int n4 = n3;
            if ((aegr.b & 0x40) != 0x0) {
                n4 = 1;
            }
            agot.D((boolean)((n4 ^ 0x1) != 0x0));
            return;
        }
        if (f == 3) {
            agot.D((aegr.b & 0x2) != 0x0);
            agot.D(aegr.f.size() == 0);
            agot.D((aegr.b & 0x8) != 0x0);
            agot.D(aegr.i ^ true);
            int n5 = n2;
            if ((aegr.b & 0x40) != 0x0) {
                n5 = 1;
            }
            agot.D((boolean)((n5 ^ 0x1) != 0x0));
            return;
        }
        if (f == 4) {
            agot.D((aegr.b & 0x2) != 0x0);
            agot.D(aegr.f.size() == 0);
            agot.D((aegr.b & 0x8) != 0x0 ^ true);
            agot.D(aegr.i ^ true);
            int n6 = n;
            if ((aegr.b & 0x40) != 0x0) {
                n6 = 1;
            }
            agot.D((boolean)((n6 ^ 0x1) != 0x0));
            return;
        }
        if (f == 5) {
            agot.D((aegr.b & 0x2) != 0x0 ^ true);
            agot.D(aegr.f.size() > 0);
            agot.D((aegr.b & 0x8) != 0x0 ^ true);
            agot.D(aegr.i);
            boolean b3 = b2;
            if ((aegr.b & 0x40) != 0x0) {
                b3 = true;
            }
            agot.D(b3);
            return;
        }
        throw new IllegalArgumentException("AccountControllerOperation.type is of value UNKNOWN - the proto might be skewed during the parcel/unparcel process.");
    }
    
    public final void a() {
        this.j();
        this.i();
        this.m(this.k.c, this.e(), 0);
    }
    
    public final void b(final afcr afcr) {
        this.q(afcr, 0);
    }
    
    public final void c(final aeho aeho) {
        this.j();
        final auip t = this.t;
        ((ArrayList)t.c).add(aeho);
        Collections.shuffle((List<?>)t.c, (Random)t.a);
    }
    
    public final void d(final aehu k) {
        this.j();
        agot.E(this.k == null, (Object)"Config can be set once, in the constructor only.");
        this.k = k;
    }
    
    public final ListenableFuture e() {
        return this.f(this.k.c);
    }
    
    public final ListenableFuture f(final afcr afcr) {
        final aehl a = aehl.a(this.b.a());
        this.n = false;
        final zhb q = this.q;
        final ListenableFuture aj = q.aj(a, (List)afcr);
        return afrp.f(aj, aesm.d((afry)new qox(q, this.b.a(), aj, 10, (byte[])null, (byte[])null, (byte[])null, (byte[])null)), (Executor)afsl.a);
    }
    
    public final ListenableFuture g() {
        return this.h(0);
    }
    
    public final ListenableFuture h(final int n) {
        if (!this.n) {
            return afva.m((Object)null);
        }
        this.n = false;
        final aere o = aesw.o("Revalidate Account");
        try {
            final int g = this.c.g();
            if (g == -1) {
                final ListenableFuture m = afva.m((Object)null);
                o.close();
                return m;
            }
            final AccountId b = AccountId.b(g);
            final ListenableFuture al = this.q.al(b, this.b.a());
            final aewp a = aewp.a;
            o.a(al);
            this.t(5, b, (aexq)a, (aexq)a, false, (aexq)a, al, n);
            o.close();
            return al;
        }
        finally {
            try {
                o.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                afqg.o(t, t2);
            }
        }
    }
    
    public final void i() {
        agot.E(this.k.b, (Object)"Activity not configured for account selection.");
    }
    
    public final void j() {
        agot.E(this.g ^ true, (Object)"Attempted to use the account controller when accounts are disabled");
    }
    
    public final void k() {
        if (this.s) {
            qcj.w();
            agot.E((qcj.w() && aels.a) ^ true, (Object)"AccountController methods cannot be invoked from the SubscriptionCallbacks or LocalSubscriptionCallbacks, see b/216297191 for more details");
        }
    }
    
    public final void l() {
        this.m = false;
        if (!this.c.i()) {
            this.n = false;
        }
    }
    
    public final void m(afcr s, final ListenableFuture listenableFuture, final int n) {
        this.k();
        if (!listenableFuture.isDone()) {
            this.c.m();
            final aexq k = aexq.k(s);
            final aewp a = aewp.a;
            this.t(2, null, k, (aexq)a, false, (aexq)a, listenableFuture, n);
            return;
        }
        this.c.k();
        final aexq i = aexq.k(s);
        final aewp a2 = aewp.a;
        s = (afcr)this.s(2, null, i, (aexq)a2, false, (aexq)a2, n);
        try {
            this.j.b(aeda.as((MessageLite)s), afva.u((Future)listenableFuture));
        }
        catch (final ExecutionException ex) {
            this.j.a(aeda.as((MessageLite)s), ex.getCause());
        }
    }
    
    public final void n() {
        if (this.m) {
            return;
        }
        this.e.g();
        this.g();
    }
    
    public final void o(final afcr afcr, final int n) {
        afcr.getClass();
        agot.D(afcr.isEmpty() ^ true);
        for (int c = ((afgh)afcr).c, i = 0; i < c; ++i) {
            final Class clazz = ((List<Class>)afcr).get(i);
            agot.z(aehk.class.isAssignableFrom(clazz), "selector %s is not an interactive selector", (Object)clazz);
        }
        final ListenableFuture aj = this.q.aj(aehl.a(this.b.a()), (List)afcr);
        final aexq k = aexq.k(afcr);
        final aewp a = aewp.a;
        this.t(3, null, k, (aexq)a, false, (aexq)a, aj, n);
    }
    
    public final void p(final AccountId accountId, final boolean b, final int n) {
        this.k();
        final aere o = aesw.o("Switch Account");
        try {
            this.n = false;
            ListenableFuture listenableFuture;
            if (b) {
                final zhb q = this.q;
                listenableFuture = afrp.f(((ahbd)q.a).u(accountId), aesm.d((afry)new qox(q, accountId, this.b.a(), 9, (byte[])null, (byte[])null, (byte[])null, (byte[])null)), (Executor)afsl.a);
            }
            else {
                listenableFuture = this.q.al(accountId, this.b.a());
            }
            if (!listenableFuture.isDone() && ((AutoValue_AccountId)accountId).a != this.c.g()) {
                this.c.m();
            }
            final aewp a = aewp.a;
            final aexq k = aexq.k(b);
            final aewp a2 = aewp.a;
            o.a(listenableFuture);
            this.t(4, accountId, (aexq)a, k, false, (aexq)a2, listenableFuture, n);
            o.close();
        }
        finally {
            try {
                o.close();
            }
            finally {
                final Throwable t;
                afqg.o((Throwable)accountId, t);
            }
        }
    }
    
    public final void q(final afcr afcr, final int n) {
        afcr.getClass();
        agot.D(afcr.isEmpty() ^ true);
        final aere o = aesw.o("Switch Account With Custom Selectors");
        try {
            this.m(afcr, this.f(afcr), n);
            o.close();
        }
        finally {
            try {
                o.close();
            }
            finally {
                final Throwable t;
                afqg.o((Throwable)afcr, t);
            }
        }
    }
    
    public final aegr s(int i, final AccountId accountId, final aexq aexq, final aexq aexq2, final boolean j, final aexq aexq3, final int n) {
        if (this.r) {
            qcj.s();
        }
        int c = this.l.c;
        final int n2 = 0;
        if (c == Integer.MAX_VALUE) {
            c = 0;
        }
        else {
            ++c;
        }
        final agza builder = ((agzi)aegr.a).createBuilder();
        builder.copyOnWrite();
        final aegr aegr = (aegr)builder.instance;
        aegr.b |= 0x1;
        aegr.c = c;
        if (accountId != null) {
            final int a = ((AutoValue_AccountId)accountId).a;
            builder.copyOnWrite();
            final aegr aegr2 = (aegr)builder.instance;
            aegr2.b |= 0x2;
            aegr2.d = a;
        }
        builder.copyOnWrite();
        final aegr aegr3 = (aegr)builder.instance;
        aegr3.e = i - 1;
        aegr3.b |= 0x4;
        if (aexq.h()) {
            final afcr afcr = (afcr)aexq.c();
            agot.D(afcr.isEmpty() ^ true);
            final ArrayList list = new ArrayList<String>(afcr.size());
            int size;
            for (size = ((List)afcr).size(), i = n2; i < size; ++i) {
                list.add(((Class)((List)afcr).get(i)).getName());
            }
            builder.copyOnWrite();
            final aegr aegr4 = (aegr)builder.instance;
            final agzy f = aegr4.f;
            if (!f.c()) {
                aegr4.f = agzi.mutableCopy(f);
            }
            agxl.addAll((Iterable)list, (List)aegr4.f);
        }
        if (aexq2.h()) {
            final boolean booleanValue = (boolean)aexq2.c();
            builder.copyOnWrite();
            final aegr aegr5 = (aegr)builder.instance;
            aegr5.b |= 0x8;
            aegr5.g = booleanValue;
        }
        builder.copyOnWrite();
        final aegr aegr6 = (aegr)builder.instance;
        aegr6.b |= 0x20;
        aegr6.i = j;
        if (aexq3.h()) {
            i = this.e.a.a(aexq3.c());
            builder.copyOnWrite();
            final aegr aegr7 = (aegr)builder.instance;
            aegr7.b |= 0x40;
            aegr7.j = i;
        }
        builder.copyOnWrite();
        final aegr aegr8 = (aegr)builder.instance;
        aegr8.b |= 0x10;
        aegr8.h = n + 1;
        r(this.l = (aegr)builder.build());
        return this.l;
    }
    
    public final void t(final int n, final AccountId accountId, final aexq aexq, final aexq aexq2, final boolean b, final aexq aexq3, final ListenableFuture listenableFuture, final int n2) {
        final aegr s = this.s(n, accountId, aexq, aexq2, b, aexq3, n2);
        this.m = true;
        try {
            this.d.h(new adcr(listenableFuture), new aeby((Object)aeda.as((MessageLite)s)), this.j);
        }
        catch (final IllegalStateException ex) {
            throw new IllegalStateException("Cannot switch account before Activity resumes.", ex);
        }
    }
    
    public final void u(final AccountId accountId) {
        this.p(accountId, false, 0);
    }
}
