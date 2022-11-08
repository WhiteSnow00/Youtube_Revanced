// 
// Decompiled by Procyon v0.6.0
// 

public final class ajho
{
    private final ajht a;
    
    public ajho(final ajht a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajho && ((agzi)this.a).equals(((ajho)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.a).hashCode() ^ 0xF6181;
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
