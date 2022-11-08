// 
// Decompiled by Procyon v0.6.0
// 

final class arvm implements Runnable
{
    final /* synthetic */ arvn a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ arvo c;
    
    public arvm(final arvo c, final arvn a, final Runnable b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.c.execute(this.a);
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
