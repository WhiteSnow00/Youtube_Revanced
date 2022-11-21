import java.util.logging.Level;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwf
{
    private static final Logger c;
    public boolean a;
    public agop b;
    
    static {
        c = Logger.getLogger(afwf.class.getName());
    }
    
    public static void a(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger c = afwf.c;
            final Level severe = Level.SEVERE;
            final String string = runnable.toString();
            final String string2 = executor.toString();
            final StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(string);
            sb.append(" with executor ");
            sb.append(string2);
            c.logp(severe, "com.google.common.util.concurrent.ExecutionList", "executeListener", sb.toString(), ex);
        }
    }
}
