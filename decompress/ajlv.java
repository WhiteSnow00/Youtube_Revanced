// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlv
{
    private final ajly a;
    
    public ajlv(final ajly a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajlv && this.a.equals(((ajlv)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
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
