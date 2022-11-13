import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audp implements ThreadFactory
{
    public final int a;
    
    public audp(final int a) {
        this.a = a;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new asfa(this, runnable, 7));
    }
}
