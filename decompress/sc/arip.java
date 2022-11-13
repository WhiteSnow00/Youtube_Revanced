// 
// Decompiled by Procyon v0.6.0
// 

abstract class arip implements ariy
{
    public arip() {
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ariy ariy = (ariy)o;
            return this.a() == ariy.a() && this.b() == ariy.b();
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
