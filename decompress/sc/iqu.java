// 
// Decompiled by Procyon v0.6.0
// 

final class iqu
{
    public final boolean a;
    
    public iqu() {
    }
    
    public iqu(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof iqu && this.a == ((iqu)o).a);
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return n ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final StringBuilder sb = new StringBuilder("DownloadsSectionHeaderData{hideFilter=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
