// 
// Decompiled by Procyon v0.6.0
// 

final class asac implements Runnable
{
    final asad a;
    final Runnable b;
    final asae c;
    
    public asac(final asae c, final asad a, final Runnable b) {
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
