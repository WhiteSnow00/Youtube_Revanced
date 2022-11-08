// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmc
{
    public final vdo a;
    public final ajme b;
    
    public ajmc(final ajme b, final vdo a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajmc && ((agzi)this.b).equals(((ajmc)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("EmojiMultiSelectorThumbnailGroupModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
