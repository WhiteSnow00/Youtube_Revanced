import android.os.Parcel;
import java.util.concurrent.TimeoutException;
import android.os.RemoteException;
import android.os.Parcelable;
import java.util.concurrent.RejectedExecutionException;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegr
{
    private static aegr a;
    private static final long b;
    private static final aefs f;
    private final Context c;
    private final ExecutorService d;
    private final long e;
    
    static {
        f = new aefs("SetupCompatServiceInvoker");
        b = TimeUnit.SECONDS.toMillis(10L);
    }
    
    private aegr(final Context c) {
        this.c = c;
        this.d = (ExecutorService)aegl.a.b;
        this.e = aegr.b;
    }
    
    public static aegr a(final Context context) {
        synchronized (aegr.class) {
            if (aegr.a == null) {
                aegr.a = new aegr(context.getApplicationContext());
            }
            return aegr.a;
        }
    }
    
    public final void b(final String s, final Bundle bundle) {
        try {
            this.d.execute(new aegq(this, s, bundle, 2));
        }
        catch (final RejectedExecutionException ex) {
            aegr.f.e(String.format("Screen %s bind back fail.", s), ex);
        }
    }
    
    public final void c(final String s, final Bundle ex) {
        try {
            final aegh a = aegt.a(this.c, this.e, TimeUnit.MILLISECONDS);
            if (a != null) {
                final Parcel qv = a.qV();
                qv.writeString(s);
                eoe.h(qv, (Parcelable)ex);
                a.qY(1, qv);
                return;
            }
            aegr.f.f("BindBack failed since service reference is null. Are the permissions valid?");
            return;
        }
        catch (final RemoteException ex) {}
        catch (final TimeoutException ex) {}
        catch (final InterruptedException ex2) {}
        aegr.f.e(String.format("Exception occurred while %s trying bind back to SetupWizard.", s), (Throwable)ex);
    }
    
    public final void d(final int n, final Bundle bundle) {
        aegh a = null;
        try {
            a = aegt.a(this.c, this.e, TimeUnit.MILLISECONDS);
            if (a != null) {
                final Bundle empty = Bundle.EMPTY;
                final Parcel qv = a.qV();
                qv.writeInt(n);
                eoe.h(qv, (Parcelable)bundle);
                eoe.h(qv, (Parcelable)empty);
                a.qY(2, qv);
                return;
            }
            aegr.f.f("logMetric failed since service reference is null. Are the permissions valid?");
            return;
        }
        catch (final IllegalStateException a) {}
        catch (final RemoteException a) {}
        catch (final TimeoutException a) {}
        catch (final InterruptedException ex) {}
        aegr.f.e(String.format("Exception occurred while trying to log metric = [%s]", bundle), (Throwable)a);
    }
    
    public final void e(final String s, final Bundle ex) {
        try {
            final aegh a = aegt.a(this.c, this.e, TimeUnit.MILLISECONDS);
            if (a != null) {
                final Parcel qv = a.qV();
                eoe.h(qv, (Parcelable)ex);
                a.qY(3, qv);
                return;
            }
            aegr.f.f("Report focusChange failed since service reference is null. Are the permission valid?");
            return;
        }
        catch (final UnsupportedOperationException ex) {}
        catch (final RemoteException ex) {}
        catch (final TimeoutException ex) {}
        catch (final InterruptedException ex2) {}
        aegr.f.e(String.format("Exception occurred while %s trying report windowFocusChange to SetupWizard.", s), ex);
    }
    
    public final void f(final int n, final Bundle bundle) {
        try {
            this.d.execute((Runnable)new wud(this, n, bundle, 9));
        }
        catch (final RejectedExecutionException ex) {
            aegr.f.e(String.format("Metric of type %d dropped since queue is full.", n), ex);
        }
    }
    
    public final void g(final String s, final Bundle bundle) {
        try {
            this.d.execute(new aegq(this, s, bundle, 0));
        }
        catch (final RejectedExecutionException ex) {
            aegr.f.e(String.format("Screen %s report focus changed failed.", s), ex);
        }
    }
}
