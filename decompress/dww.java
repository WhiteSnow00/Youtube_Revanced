import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dww implements Runnable
{
    public final Throwable b;
    
    public dww() {
        final boolean a = dyp.a;
        this(false);
    }
    
    public dww(final dww dww) {
        boolean b = false;
        if (dww != null) {
            if (dww.b != null) {
                b = true;
            }
        }
        else {
            final boolean a = dyp.a;
        }
        this(b);
        final Throwable b2 = this.b;
        if (b2 != null && dww != null) {
            b2.initCause(dww.b);
        }
    }
    
    private dww(final boolean b) {
        if (b) {
            final Thread currentThread = Thread.currentThread();
            final StringBuilder sb = new StringBuilder("Runnable instantiated on thread id: ");
            sb.append(currentThread.getId());
            sb.append(", name: ");
            sb.append(currentThread.getName());
            this.b = new Throwable(sb.toString());
            return;
        }
        this.b = null;
    }
    
    public abstract void a(final dww p0);
    
    @Override
    public final void run() {
        try {
            this.a(this);
        }
        finally {
            if (this.b != null) {
                Log.w("LithoThreadTracing", "--- start debug trace");
                Log.w("LithoThreadTracing", "Thread tracing stacktrace", this.b);
                Log.w("LithoThreadTracing", "--- end debug trace");
            }
        }
    }
}
