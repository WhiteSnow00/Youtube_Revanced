import android.os.Process;
import android.os.Binder;
import android.os.Parcel;
import android.os.IBinder;
import io.grpc.Status;
import android.content.Intent;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arwe extends arwg implements arze, arwb
{
    public final Executor a;
    public final arvz b;
    public final arwc c;
    public ascj d;
    private final ascu n;
    private final AtomicInteger o;
    private int p;
    private final arxi q;
    
    public arwe(final Context context, final arvr arvr, final arvs arvs, final Executor executor, final ascu ascu, final ascu n, final arvz b, final arvw arvw, final arrg arrg) {
        final auls b2 = arrg.b();
        b2.b(asal.a, (Object)arvc.a);
        b2.b(asal.b, (Object)arrg);
        b2.b(arsp.b, (Object)arvr.c(context));
        b2.b(arsp.a, (Object)arvr);
        b2.b(arwe.h, (Object)arvw);
        final arrg a = b2.a();
        final String simpleName = context.getClass().getSimpleName();
        final String shortString = arvr.a().toShortString();
        final StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("->");
        sb.append(shortString);
        super(ascu, a, arta.a((Class)arwe.class, sb.toString()));
        this.p = 1001;
        this.n = n;
        this.b = b;
        this.a = (Executor)n.a();
        this.o = new AtomicInteger();
        this.q = new arxi();
        final Intent cloneFilter = arvr.a.cloneFilter();
        final int b3 = arvs.b;
        this.c = (arwc)new arxf(executor, context, cloneFilter, (arwb)this);
    }
    
    private static aryt x(final Status status, final arxi[] array) {
        asfc.n(array).b();
        return (aryt)new asae(status, array, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void a(final IBinder binder) {
        synchronized (this) {
            this.o(arwz.b(binder, this.a));
        }
    }
    
    public final void b(final Status status) {
        synchronized (this) {
            this.q(status, true);
        }
    }
    
    public final Runnable d(final ascj d) {
        synchronized (this) {
            this.d = d;
            return (Runnable)new arax(this, 12);
        }
    }
    
    protected final void e(final Parcel parcel) {
        final arxi q = this.q;
        parcel.readInt();
        q.m();
    }
    
    protected final void f(final Parcel parcel) {
        final arrg k = this.k;
        final int callingUid = Binder.getCallingUid();
        final auls c = k.c();
        c.b(arwe.f, (Object)callingUid);
        final arrf a = asal.a;
        arvc arvc;
        if (callingUid == Process.myUid()) {
            arvc = arvc.c;
        }
        else {
            arvc = arvc.b;
        }
        c.b(a, (Object)arvc);
        this.k = c.a();
        if (this.w(2)) {
            final int int1 = parcel.readInt();
            final IBinder strongBinder = parcel.readStrongBinder();
            if (int1 != 1) {
                this.q(Status.l.withDescription("Wire format version mismatch"), true);
                return;
            }
            if (strongBinder == null) {
                this.q(Status.l.withDescription("Malformed SETUP_TRANSPORT data"), true);
                return;
            }
            this.a.execute((Runnable)new aghl(this, strongBinder, 16));
        }
    }
    
    public final void g(final Status status) {
        this.d.c(status);
    }
    
    public final void h() {
        if (this.o.getAndSet(0) > 0) {
            this.d.a(false);
        }
        ((arxf)this.c).c(Status.b);
        this.d.d();
    }
    
    public final void i() {
        super.i();
        this.n.b(this.a);
    }
    
    public final void j(final Status status) {
        synchronized (this) {
            status.getClass();
            this.q(status, false);
        }
    }
    
    public final void k(final Status status) {
        synchronized (this) {
            status.getClass();
            this.q(status, true);
        }
    }
    
    protected final void l(final arwr arwr) {
        if (arwr.e() && this.o.decrementAndGet() == 0) {
            this.d.a(false);
        }
        super.l(arwr);
    }
    
    public final aryt m(final aruk aruk, final arug arug, final arrk arrk, final arxi[] array) {
        synchronized (this) {
            if (!this.w(3)) {
                Status status;
                if (this.t()) {
                    status = this.l;
                }
                else {
                    status = Status.k.withDescription("newStream() before transportReady()");
                }
                return x(status, array);
            }
            final int p4 = this.p;
            if ((this.p = p4 + 1) == 16777215) {
                this.p = 1001;
            }
            final asfc n = asfc.n(array);
            final arwn arwn = new arwn((arwg)this, this.k, p4, asap.i(arrk));
            if (this.j.putIfAbsent((Object)p4, (Object)arwn) != null) {
                final Status withDescription = Status.k.withDescription("Clashing call IDs");
                this.q(withDescription, true);
                return x(withDescription, array);
            }
            if (arwn.a && this.o.getAndIncrement() == 0) {
                this.d.a(true);
            }
            final arxa arxa = new arxa((arwg)this, p4, aruk, arug, n);
            if (aruk.a.a()) {
                return (aryt)new arxg(arwn, arxa);
            }
            return (aryt)new arww(arwn, arxa);
        }
    }
}
