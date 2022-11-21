// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhs
{
    private final ajht a;
    
    public ajhs(final ajht a) {
        this.a = a;
    }
    
    public static final afhk a() {
        return new afhi().g();
    }
    
    public static agpd b(final ajht ajht) {
        return new agpd(((ahcz)ajht).toBuilder());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajhs && ((ahcz)this.a).equals(((ajhs)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("DownloadFormatModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
