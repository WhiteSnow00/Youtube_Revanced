// 
// Decompiled by Procyon v0.6.0
// 

public final class audn implements Runnable
{
    final int a;
    final long b;
    final int c;
    final Object d;
    private final int e;
    
    public audn(final auer d, final int c, final long b, final int a, final int e) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public audn(final aues d, final int a, final long b, final int c, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        if (this.e != 0) {
            ((auer)this.d).onRttObservation(this.c, this.b, this.a);
            return;
        }
        ((aues)this.d).onThroughputObservation(this.a, this.b, this.c);
    }
}
