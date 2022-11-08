import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class asbp implements Executor
{
    private final ascu a;
    private Executor b;
    
    public asbp(final ascu a) {
        this.a = a;
    }
    
    final Executor a() {
        synchronized (this) {
            if (this.b == null) {
                final Object a = this.a.a();
                a.getClass();
                this.b = (Executor)a;
            }
            return this.b;
        }
    }
    
    final void b() {
        synchronized (this) {
            final Executor b = this.b;
            if (b != null) {
                this.a.b(b);
                this.b = null;
            }
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a().execute(runnable);
    }
}
