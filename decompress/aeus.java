// 
// Decompiled by Procyon v0.6.0
// 

public final class aeus implements aevl
{
    public final aevl a;
    public final aevl b;
    public final aevk c;
    
    public aeus(final aevl a, final aevl b, final aevk c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void close() {
        final aevl a = this.a;
        final aevl b = this.b;
        final aevk c = this.c;
        a.close();
        if (b != null) {
            b.close();
        }
        aewp.n(c);
    }
}
