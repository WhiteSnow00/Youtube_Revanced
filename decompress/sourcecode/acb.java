import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acb
{
    public Object a;
    public acf b;
    public acg c;
    private boolean d;
    
    public acb() {
        this.c = new acg();
    }
    
    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
    
    public final void a(final Runnable runnable, final Executor executor) {
        final acg c = this.c;
        if (c != null) {
            ((ListenableFuture)c).addListener(runnable, executor);
        }
    }
    
    public final void b() {
        this.d = true;
        final acf b = this.b;
        if (b != null && b.b.cancel(true)) {
            this.e();
        }
    }
    
    public final void c(final Object o) {
        this.d = true;
        final acf b = this.b;
        if (b != null && b.b.e(o)) {
            this.e();
        }
    }
    
    public final void d(final Throwable t) {
        this.d = true;
        final acf b = this.b;
        if (b != null && b.a(t)) {
            this.e();
        }
    }
    
    @Override
    protected final void finalize() {
        final acf b = this.b;
        if (b != null && !b.isDone()) {
            final StringBuilder sb = new StringBuilder("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            final Object a = this.a;
            sb.append(a);
            b.a(new acc("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(a))));
        }
        if (!this.d) {
            final acg c = this.c;
            if (c != null) {
                ((aca)c).e((Object)null);
            }
        }
    }
}
