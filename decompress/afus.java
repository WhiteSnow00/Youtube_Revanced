import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class afus
{
    static final afus a;
    final Runnable b;
    final Executor c;
    afus next;
    
    static {
        a = new afus();
    }
    
    public afus() {
        this.b = null;
        this.c = null;
    }
    
    public afus(final Runnable b, final Executor c) {
        this.b = b;
        this.c = c;
    }
}
