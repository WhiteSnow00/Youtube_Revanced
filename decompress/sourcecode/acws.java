import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import android.text.TextUtils;
import java.util.concurrent.Semaphore;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acws implements acvs, acvx
{
    public final acwz a;
    public final Semaphore b;
    public adfy c;
    public wyo d;
    private final tgw e;
    private final oas f;
    
    public acws(final tgw e, final acwz a, final oas f) {
        e.getClass();
        this.e = e;
        this.a = a;
        this.f = f;
        this.b = new Semaphore(4, true);
    }
    
    public final void a(final adfy adfy) {
        throw null;
    }
    
    public final wyo b() {
        return this.d;
    }
    
    public final acwf c(final acwq acwq) {
        Label_0273: {
            if (acwq.c()) {
                break Label_0273;
            }
            if (!TextUtils.isEmpty((CharSequence)null)) {
                return new acvv().e();
            }
            final Semaphore b = this.b;
            try {
                b.acquire();
                final acwy a = acwq.a();
                a.j = this.d;
                final oas f = this.f;
                int n = 0;
                int n2;
                if (f != null) {
                    n2 = (int)f.d();
                }
                else {
                    n2 = 0;
                }
                final ListenableFuture b2 = this.e.b((tjr)a);
                b2.addListener((Runnable)new abxb(this, 13), (Executor)afsl.a);
                try {
                    final acwi acwi = (acwi)((alm)b2.get()).c;
                    if (acwi == null) {
                        final String d = acwq.d;
                        final StringBuilder sb = new StringBuilder("Suggest returned a null response for query: ");
                        sb.append(d);
                        adbp.j(sb.toString());
                        return null;
                    }
                    acwi.c(adbp.i((acvx)acwq));
                    final oas f2 = this.f;
                    if (f2 != null) {
                        n = (int)f2.d();
                    }
                    acwi.a(this.c);
                    final acwf e = acwi.e();
                    if (e != null) {
                        e.f = acwi.b();
                        adbp.m((acvw)e);
                        e.d = n - n2;
                    }
                    if (this.a != null && acwq.d.isEmpty()) {
                        this.a.e(acwi);
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
    
    public final boolean d(final acwq acwq) {
        if (!acwq.c()) {
            return false;
        }
        final acwy a = acwq.a();
        a.j = this.d;
        a.b = true;
        final ListenableFuture b = this.e.b((tjr)a);
        try {
            if (((alm)b.get()).c == null) {
                return false;
            }
            final acwz a2 = this.a;
            if (a2 != null) {
                a2.d();
            }
            return true;
        }
        catch (final ExecutionException ex) {
            adbp.k("Suggest deletion task threw an exception", ex);
        }
        catch (final InterruptedException | CancellationException ex2) {
            goto Label_0080;
        }
    }
}
