// 
// Decompiled by Procyon v0.6.0
// 

public final class aazp implements Runnable
{
    public final aazt a;
    public final boolean b;
    public final long c;
    
    public aazp(final aazt a, final boolean b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final aazt a = this.a;
        final boolean b = this.b;
        final long c = this.c;
        if (b) {
            a.d.Z(c);
        }
        a.d.C();
    }
}
