// 
// Decompiled by Procyon v0.6.0
// 

public final class augk implements Runnable
{
    final int a;
    final long b;
    final int c;
    final Object d;
    private final int e;
    
    public augk(final auhn d, final int c, final long b, final int a, final int e) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public augk(final auho d, final int a, final long b, final int c, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        if (this.e != 0) {
            ((auhn)this.d).onRttObservation(this.c, this.b, this.a);
            return;
        }
        ((auho)this.d).onThroughputObservation(this.a, this.b, this.c);
    }
}
