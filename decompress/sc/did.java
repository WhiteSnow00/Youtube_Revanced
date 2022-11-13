// 
// Decompiled by Procyon v0.6.0
// 

final class did implements dib
{
    private final String a;
    
    public did(final String a) {
        this.a = a;
    }
    
    @Override
    public final String a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof did && this.a.equals(((did)o).a);
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
