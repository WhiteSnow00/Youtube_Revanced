import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class augm implements ThreadFactory
{
    public final int a;
    
    public augm(final int a) {
        this.a = a;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        return Executors.defaultThreadFactory().newThread((Runnable)new ashw(this, runnable, 9));
    }
}
