// 
// Decompiled by Procyon v0.6.0
// 

final class gfy extends ggv
{
    private final int a;
    private final int b;
    
    public gfy(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int a() {
        return this.b;
    }
    
    @Override
    public int b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ggv) {
            final ggv ggv = (ggv)o;
            if (this.a == ggv.b() && this.b == ggv.a()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public String toString() {
        final int a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("ActivePaneChangedEvent{previousPane=");
        sb.append(a);
        sb.append(", navigationType=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
