import java.util.logging.LogRecord;
import java.util.logging.Level;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aryj
{
    static final Logger a;
    public final Object b;
    public final arta c;
    
    static {
        a = Logger.getLogger(arrm.class.getName());
    }
    
    public aryj(final arta c, final long n, final String s) {
        this.b = new Object();
        c.getClass();
        this.c = c;
        final arss arss = new arss();
        arss.a = s.concat(" created");
        arss.b = arst.b;
        arss.b(n);
        this.b(arss.a());
    }
    
    static void a(final arta arta, final Level level, final String s) {
        final Logger a = aryj.a;
        if (a.isLoggable(level)) {
            final String string = arta.toString();
            final StringBuilder sb = new StringBuilder("[");
            sb.append(string);
            sb.append("] ");
            sb.append(s);
            final LogRecord logRecord = new LogRecord(level, sb.toString());
            logRecord.setLoggerName(a.getName());
            logRecord.setSourceClassName(a.getName());
            logRecord.setSourceMethodName("log");
            a.log(logRecord);
        }
    }
    
    final void b(final arsv arsv) {
        final arst a = arst.a;
        final int ordinal = arsv.b.ordinal();
        Level level;
        if (ordinal != 2) {
            if (ordinal != 3) {
                level = Level.FINEST;
            }
            else {
                level = Level.FINE;
            }
        }
        else {
            level = Level.FINER;
        }
        synchronized (this.b) {
            monitorexit(this.b);
            a(this.c, level, arsv.a);
        }
    }
}
