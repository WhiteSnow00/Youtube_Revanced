// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhs
{
    private final ajhv a;
    
    public ajhs(final ajhv a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajhs && ((agzi)this.a).equals(((ajhs)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("DrmLicenseInfoModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
