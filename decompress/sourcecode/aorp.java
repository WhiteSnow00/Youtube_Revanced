// 
// Decompiled by Procyon v0.6.0
// 

public final class aorp
{
    private final aorl a;
    
    public aorp(final aorl a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aorp && this.a.equals(((aorp)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("ThumbnailModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
