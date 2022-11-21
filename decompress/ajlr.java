// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlr
{
    private final ajlw a;
    
    public ajlr(final ajlw a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajlr && this.a.equals(((ajlr)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("DrmErrorInfoModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
