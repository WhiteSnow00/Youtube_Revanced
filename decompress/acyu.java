import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import android.text.TextUtils;
import java.util.concurrent.Semaphore;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyu implements acxu, acxz
{
    public final aczb a;
    public final Semaphore b;
    public adia c;
    public xao d;
    private final tjb e;
    private final oby f;
    
    public acyu(final tjb e, final aczb a, final oby f) {
        e.getClass();
        this.e = e;
        this.a = a;
        this.f = f;
        this.b = new Semaphore(4, true);
    }
    
    public final void a(final adia adia) {
        throw null;
    }
    
    public final xao b() {
        return this.d;
    }
    
    public final acyh c(final acys acys) {
        Label_0288: {
            if (acys.c()) {
                break Label_0288;
            }
            if (!TextUtils.isEmpty((CharSequence)null)) {
                return ((acyk)new acxx()).e();
            }
            final Semaphore b = this.b;
            try {
                b.acquire();
                final acza a = acys.a();
                a.j = this.d;
                final oby f = this.f;
                int n = 0;
                int n2;
                if (f != null) {
                    n2 = (int)f.d();
                }
                else {
                    n2 = 0;
                }
                final ListenableFuture b2 = this.e.b((tlv)a);
                b2.addListener((Runnable)new abuv(this, 15), (Executor)afum.a);
                try {
                    final acyk acyk = (acyk)((aln)b2.get()).c;
                    if (acyk == null) {
                        final String d = acys.d;
                        final StringBuilder sb = new StringBuilder("Suggest returned a null response for query: ");
                        sb.append(d);
                        acvg.m(sb.toString());
                        return null;
                    }
                    acyk.c(acvg.l((acxz)acys));
                    final oby f2 = this.f;
                    if (f2 != null) {
                        n = (int)f2.d();
                    }
                    acyk.a(this.c);
                    final acyh e = acyk.e();
                    if (e != null) {
                        e.f = acyk.b();
                        acvg.p((acxy)e);
                        e.d = n - n2;
                    }
                    if (this.a != null && acys.d.isEmpty()) {
                        this.a.e(acyk);
                    }
                    return e;
                }
                catch (final InterruptedException ex) {
                    b2.cancel(true);
                }
                return null;
            }
            catch (final InterruptedException | CancellationException | ExecutionException ex2) {
                return null;
            }
        }
    }
    
    public final boolean d(final acys acys) {
        if (!acys.c()) {
            return false;
        }
        final acza a = acys.a();
        a.j = this.d;
        a.b = true;
        final ListenableFuture b = this.e.b((tlv)a);
        try {
            if (((aln)b.get()).c == null) {
                return false;
            }
            final aczb a2 = this.a;
            if (a2 != null) {
                a2.d();
            }
            return true;
        }
        catch (final ExecutionException ex) {
            acvg.n("Suggest deletion task threw an exception", (Throwable)ex);
        }
        catch (final InterruptedException | CancellationException ex2) {
            goto Label_0080;
        }
    }
}
