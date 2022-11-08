// 
// Decompiled by Procyon v0.6.0
// 

public final class ipy
{
    public final ahwk a;
    
    public ipy() {
    }
    
    public ipy(final ahwk a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null backgroundPromoStyleType");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof ipy && this.a.equals((Object)((ipy)o).a));
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
