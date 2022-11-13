import java.util.logging.LogRecord;
import java.util.logging.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgi extends Handler
{
    final adgj a;
    
    public adgi(final adgj a) {
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
        ((aekp)this.a.g.a()).o(Thread.currentThread(), logRecord.getThrown());
    }
}
