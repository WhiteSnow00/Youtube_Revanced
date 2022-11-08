// 
// Decompiled by Procyon v0.6.0
// 

abstract class arga implements argj
{
    public arga() {
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final argj argj = (argj)o;
            return this.a() == argj.a() && this.b() == argj.b();
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final int a = this.a();
        final long b = this.b();
        final StringBuilder sb = new StringBuilder(35);
        sb.append("P(");
        sb.append(a);
        sb.append("|");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
