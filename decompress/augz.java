import org.chromium.net.InlineExecutionProhibitedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class augz implements Runnable
{
    public Thread a;
    public InlineExecutionProhibitedException b;
    private final Runnable c;
    
    public augz(final Runnable c, final Thread a) {
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (Thread.currentThread() == this.a) {
            this.b = new InlineExecutionProhibitedException();
            return;
        }
        this.c.run();
    }
}
