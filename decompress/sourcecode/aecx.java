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

public final class aecx
{
    private static aecx a;
    private static final long b;
    private static final aeby f;
    private final Context c;
    private final ExecutorService d;
    private final long e;
    
    static {
        f = new aeby("SetupCompatServiceInvoker");
        b = TimeUnit.SECONDS.toMillis(10L);
    }
    
    private aecx(final Context c) {
        this.c = c;
        this.d = (ExecutorService)aecr.a.b;
        this.e = aecx.b;
    }
    
    public static aecx a(final Context context) {
        synchronized (aecx.class) {
            if (aecx.a == null) {
                aecx.a = new aecx(context.getApplicationContext());
            }
            return aecx.a;
        }
    }
    
    public final void b(final String s, final Bundle bundle) {
        try {
            this.d.execute(new aecw(this, s, bundle, 2));
        }
        catch (final RejectedExecutionException ex) {
            aecx.f.d(String.format("Screen %s bind back fail.", s), ex);
        }
    }
    
    public final void c(final String s, final Bundle ex) {
        try {
            final aecn a = aecz.a(this.c, this.e, TimeUnit.MILLISECONDS);
            if (a != null) {
                final Parcel qq = a.qQ();
                qq.writeString(s);
                eoa.h(qq, (Parcelable)ex);
                a.qT(1, qq);
                return;
            }
            aecx.f.e("BindBack failed since service reference is null. Are the permissions valid?");
            return;
        }
        catch (final RemoteException ex) {}
        catch (final TimeoutException ex) {}
        catch (final InterruptedException ex2) {}
        aecx.f.d(String.format("Exception occurred while %s trying bind back to SetupWizard.", s), (Throwable)ex);
    }
    
    public final void d(final int n, final Bundle bundle) {
        Bundle empty = null;
        try {
            final aecn a = aecz.a(this.c, this.e, TimeUnit.MILLISECONDS);
            if (a != null) {
                empty = Bundle.EMPTY;
                final Parcel qq = a.qQ();
                qq.writeInt(n);
                eoa.h(qq, (Parcelable)bundle);
                eoa.h(qq, (Parcelable)empty);
                a.qT(2, qq);
                return;
            }
            aecx.f.e("logMetric failed since service reference is null. Are the permissions valid?");
            return;
        }
        catch (final IllegalStateException empty) {}
        catch (final RemoteException empty) {}
        catch (final TimeoutException empty) {}
        catch (final InterruptedException ex) {}
        aecx.f.d(String.format("Exception occurred while trying to log metric = [%s]", bundle), (Throwable)empty);
    }
    
    public final void e(final String s, final Bundle ex) {
        try {
            final aecn a = aecz.a(this.c, this.e, TimeUnit.MILLISECONDS);
            if (a != null) {
                final Parcel qq = a.qQ();
                eoa.h(qq, (Parcelable)ex);
                a.qT(3, qq);
                return;
            }
            aecx.f.e("Report focusChange failed since service reference is null. Are the permission valid?");
            return;
        }
        catch (final UnsupportedOperationException ex) {}
        catch (final RemoteException ex) {}
        catch (final TimeoutException ex) {}
        catch (final InterruptedException ex2) {}
        aecx.f.d(String.format("Exception occurred while %s trying report windowFocusChange to SetupWizard.", s), ex);
    }
    
    public final void f(final int n, final Bundle bundle) {
        try {
            this.d.execute((Runnable)new wqx(this, n, bundle, 9));
        }
        catch (final RejectedExecutionException ex) {
            aecx.f.d(String.format("Metric of type %d dropped since queue is full.", n), ex);
        }
    }
    
    public final void g(final String s, final Bundle bundle) {
        try {
            this.d.execute(new aecw(this, s, bundle, 0));
        }
        catch (final RejectedExecutionException ex) {
            aecx.f.d(String.format("Screen %s report focus changed failed.", s), ex);
        }
    }
}
