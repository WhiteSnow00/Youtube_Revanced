// 
// Decompiled by Procyon v0.6.0
// 

final class dic implements dia
{
    private final String a;
    
    public dic(final String a) {
        this.a = a;
    }
    
    public final String a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof dic && this.a.equals(((dic)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("StringHeaderFactory{value='");
        sb.append(a);
        sb.append("'}");
        return sb.toString();
    }
}
