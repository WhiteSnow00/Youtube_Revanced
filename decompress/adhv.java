import java.util.logging.LogRecord;
import java.util.logging.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhv extends Handler
{
    final adhw a;
    
    public adhv(final adhw a) {
        this.a = a;
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final void flush() {
    }
    
    @Override
    public final void publish(final LogRecord logRecord) {
        ((aheu)this.a.g.a()).w(Thread.currentThread(), logRecord.getThrown());
    }
}
