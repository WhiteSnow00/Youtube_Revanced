import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucy implements ThreadFactory
{
    public final /* synthetic */ int a;
    
    public aucy(final int a) {
        this.a = a;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        return Executors.defaultThreadFactory().newThread((Runnable)new atyo(this, runnable, 7));
    }
}
