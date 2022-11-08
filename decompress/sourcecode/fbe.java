// 
// Decompiled by Procyon v0.6.0
// 

public final class fbe
{
    public final String a;
    final Class b;
    private int c;
    
    public fbe(final String s, final Class b) {
        this.a = aexs.e(s);
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fbe)) {
            return false;
        }
        final fbe fbe = (fbe)o;
        return this.a.equals(fbe.a) && this.b.equals(fbe.b);
    }
    
    @Override
    public final int hashCode() {
        int c;
        if ((c = this.c) == 0) {
            c = (this.a.hashCode() + 527) * 31 + this.b.hashCode();
            this.c = c;
        }
        return c;
    }
}
