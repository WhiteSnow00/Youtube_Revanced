// 
// Decompiled by Procyon v0.6.0
// 

public final class aucw implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;
    
    public aucw(final auea d, final int c, final long b, final int a, final int e) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aucw(final aueb d, final int a, final long b, final int c, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        if (this.e != 0) {
            ((auea)this.d).onRttObservation(this.c, this.b, this.a);
            return;
        }
        ((aueb)this.d).onThroughputObservation(this.a, this.b, this.c);
    }
}
