// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjr
{
    private final ajjs a;
    
    public ajjr(final ajjs a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajjr && ((ahcz)this.a).equals(((ajjr)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("DownloadsPageFeatureVisibilityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
