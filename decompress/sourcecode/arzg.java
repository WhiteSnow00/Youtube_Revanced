// 
// Decompiled by Procyon v0.6.0
// 

abstract class arzg implements Runnable
{
    private final arsg a;
    
    protected arzg(final arsg a) {
        this.a = a;
    }
    
    public abstract void a();
    
    @Override
    public final void run() {
        final arsg a = this.a.a();
        try {
            this.a();
        }
        finally {
            this.a.f(a);
        }
    }
}
