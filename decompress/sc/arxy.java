import android.os.Process;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.IBinder;
import io.grpc.Status;
import android.content.Intent;
import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxy extends arxz implements asan, arxw
{
    public final Executor a;
    public final arxu b;
    public final arxx c;
    public final AtomicInteger d;
    public asdp e;
    private final asea p;
    private int q;
    private final aryu r;
    
    public arxy(final Context context, final arxn arxn, final arxo arxo, final Executor executor, final asea asea, final asea p9, final arxu b, final arxr arxr, final artu artu) {
        final aumh b2 = artu.b();
        b2.b(asbu.a, (Object)arxd.a);
        b2.b(asbu.b, (Object)artu);
        b2.b(aruw.b, (Object)arxn.b(new ComponentName(context, (Class)context.getClass())));
        b2.b(aruw.a, (Object)arxn);
        b2.b(arxy.h, (Object)arxr);
        final artu a = b2.a();
        final String simpleName = context.getClass().getSimpleName();
        final String shortString = arxn.a().toShortString();
        final StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("->");
        sb.append(shortString);
        super(asea, a, arvf.a((Class)arxy.class, sb.toString()));
        this.q = 1001;
        this.p = p9;
        this.b = b;
        this.a = (Executor)p9.a();
        this.d = new AtomicInteger();
        this.r = new aryu();
        final Intent cloneFilter = arxn.a.cloneFilter();
        final int b3 = arxo.b;
        this.c = (arxx)new arys(executor, context, cloneFilter, (arxw)this);
    }
    
    private static asac v(final Status status, final arva[] array) {
        asfr.m(array).b();
        return (asac)new asbn(status, array, (byte[])null, (byte[])null);
    }
    
    public final void a(final IBinder binder) {
        synchronized (this) {
            final aryn b = aryn.b(binder, this.a);
            try {
                final aryq c = aryq.c();
                try {
                    c.a().writeInt(1);
                    c.a().writeStrongBinder((IBinder)super.k);
                    b.a(1, c);
                    c.close();
                }
                finally {
                    try {
                        c.close();
                    }
                    finally {
                        final Throwable t;
                        arva.e((Throwable)binder, t);
                    }
                }
            }
            catch (final RemoteException ex) {
                this.p(arxz.n(ex), true);
            }
        }
    }
    
    public final void b(final Status status) {
        synchronized (this) {
            this.p(status, true);
        }
    }
    
    public final Runnable d(final asdp e) {
        synchronized (this) {
            this.e = e;
            return new arcu(this, 12);
        }
    }
    
    protected final void e(final Parcel parcel) {
        final aryu r = this.r;
        parcel.readInt();
        r.d();
    }
    
    protected final void f(final Parcel parcel) {
        final artu m = this.m;
        final int callingUid = Binder.getCallingUid();
        final aumh c = m.c();
        c.b(arxy.g, (Object)callingUid);
        final artt a = asbu.a;
        arxd arxd;
        if (callingUid == Process.myUid()) {
            arxd = arxd.c;
        }
        else {
            arxd = arxd.b;
        }
        c.b(a, (Object)arxd);
        this.m = c.a();
        if (this.u(2)) {
            final int int1 = parcel.readInt();
            final IBinder strongBinder = parcel.readStrongBinder();
            if (int1 != 1) {
                this.p(Status.l.withDescription("Wire format version mismatch"), true);
                return;
            }
            if (strongBinder == null) {
                this.p(Status.l.withDescription("Malformed SETUP_TRANSPORT data"), true);
                return;
            }
            this.a.execute((Runnable)new agjf(this, strongBinder, 18));
        }
    }
    
    public final void g(final Status status) {
        this.e.c(status);
    }
    
    public final void h() {
        if (this.d.getAndSet(0) > 0) {
            this.e.a(false);
        }
        ((arys)this.c).c(Status.b);
        this.e.d();
    }
    
    public final void i() {
        super.i.b(super.j);
        this.p.b(this.a);
    }
    
    public final void j(final Status status) {
        synchronized (this) {
            status.getClass();
            this.p(status, false);
        }
    }
    
    public final void k(final Status status) {
        synchronized (this) {
            status.getClass();
            this.p(status, true);
        }
    }
    
    public final asac l(final arwo arwo, final arwk arwk, final artx artx, final arva[] array) {
        synchronized (this) {
            if (!this.u(3)) {
                Status status;
                if (this.s()) {
                    status = this.n;
                }
                else {
                    status = Status.k.withDescription("newStream() before transportReady()");
                }
                return v(status, array);
            }
            final int q = this.q;
            if ((this.q = q + 1) == 16777215) {
                this.q = 1001;
            }
            final asfr m = asfr.m(array);
            final aryd aryd = new aryd(this, this.m, q, asby.i(artx));
            if (this.l.putIfAbsent((Object)q, (Object)aryd) != null) {
                final Status withDescription = Status.k.withDescription("Clashing call IDs");
                this.p(withDescription, true);
                return v(withDescription, array);
            }
            if (aryd.a && this.d.getAndIncrement() == 0) {
                this.e.a(true);
            }
            final aryo aryo = new aryo((arxz)this, q, arwo, arwk, m);
            if (arwo.a.a()) {
                return new aryt(aryd, aryo);
            }
            return new aryk(aryd, aryo);
        }
    }
}
