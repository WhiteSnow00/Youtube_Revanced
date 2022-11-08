// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlz
{
    public final vdo a;
    public final ajma b;
    
    public ajlz(final ajma b, final vdo a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajlz && ((agzi)this.b).equals(((ajlz)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("EmojiCategoryModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
