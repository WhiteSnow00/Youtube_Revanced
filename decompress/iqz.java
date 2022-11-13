// 
// Decompiled by Procyon v0.6.0
// 

public final class iqz
{
    public final ahyi a;
    
    public iqz() {
    }
    
    public iqz(final ahyi a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null backgroundPromoStyleType");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof iqz && this.a.equals((Object)((iqz)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("ManualDownloadsZeroStateData{backgroundPromoStyleType=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
