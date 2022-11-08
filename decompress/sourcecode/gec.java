// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gec implements ger
{
    public int a;
    protected ged b;
    public whg c;
    
    @Override
    public void j(final ged ged) {
        final ged b = this.b;
        if (b != null && b.b == ged.b) {
            this.k();
        }
    }
    
    public final void k() {
        final whg c = this.c;
        if (c != null) {
            c.b();
            this.c = null;
            this.b = null;
        }
    }
    
    protected abstract boolean l(final ged p0, final int p1);
    
    @Override
    public final boolean m(final ged b, final int a, final whg c) {
        if (!this.l(b, a)) {
            this.c = c;
            this.a = a;
            this.b = b;
            return false;
        }
        return true;
    }
}
