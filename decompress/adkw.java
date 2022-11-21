import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkw implements UncaughtExceptionHandler
{
    public String a;
    public UncaughtExceptionHandler b;
    
    public adkw() {
        this.a = null;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        this.a = Log.getStackTraceString(t).replace(String.valueOf(t.getMessage()).concat("\n"), "\n");
        final UncaughtExceptionHandler b = this.b;
        if (b != null) {
            b.uncaughtException(thread, t);
        }
    }
}
