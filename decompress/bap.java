// 
// Decompiled by Procyon v0.6.0
// 

public final class bap
{
    public final Object a;
    public boolean b;
    public boolean c;
    public slt d;
    
    public bap(final Object a) {
        this.a = a;
        this.d = new slt((char[])null, (byte[])null);
    }
    
    public final void a(final bao bao) {
        this.c = true;
        if (this.b) {
            bao.a(this.a, this.d.n());
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((bap)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
