// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfo
{
    private final ajfp a;
    
    public ajfo(final ajfp a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajfo && ((agzi)this.a).equals(((ajfo)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.a).hashCode() ^ 0xF6181;
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
