import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ody implements ThreadFactory
{
    public final HashSet a;
    private final ThreadFactory b;
    
    public ody(final ThreadFactory b) {
        this.a = new HashSet();
        this.b = b;
    }
    
    public final ArrayList a() {
        synchronized (this) {
            return new ArrayList(this.a);
        }
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.b.newThread((Runnable)new nlt(this, runnable, 18));
        synchronized (this) {
            this.a.add(thread);
            return thread;
        }
    }
}
