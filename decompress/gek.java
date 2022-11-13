// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gek implements gez
{
    public int a;
    protected gel b;
    public wjg c;
    
    public void j(final gel gel) {
        final gel b = this.b;
        if (b != null && b.b == gel.b) {
            this.k();
        }
    }
    
    public final void k() {
        final wjg c = this.c;
        if (c != null) {
            c.b();
            this.c = null;
            this.b = null;
        }
    }
    
    protected abstract boolean l(final gel p0, final int p1);
    
    public final boolean m(final gel b, final int a, final wjg c) {
        if (!this.l(b, a)) {
            this.c = c;
            this.a = a;
            this.b = b;
            return false;
        }
        return true;
    }
}
