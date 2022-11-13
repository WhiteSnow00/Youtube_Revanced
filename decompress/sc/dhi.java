import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhi implements ThreadFactory
{
    private final int a;
    
    public dhi(final int a) {
        this.a = a;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        if (this.a != 0) {
            return new Thread((Runnable)new cdj(runnable, 20), "glide-active-resources");
        }
        return new dhh(runnable);
    }
}
