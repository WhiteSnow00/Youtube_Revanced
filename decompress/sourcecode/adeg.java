import java.util.logging.LogRecord;
import java.util.logging.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adeg extends Handler
{
    final /* synthetic */ adeh a;
    
    public adeg(final adeh a) {
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
        ((aeim)((atjj)this.a.h).a()).o(Thread.currentThread(), logRecord.getThrown());
    }
}
