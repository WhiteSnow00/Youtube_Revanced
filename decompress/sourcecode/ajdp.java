// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdp
{
    private final ajdq a;
    
    public ajdp(final ajdq a) {
        this.a = a;
    }
    
    public static final afdu a() {
        return new afds().g();
    }
    
    public static aglk b(final ajdq ajdq) {
        return new aglk(ajdq.toBuilder());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajdp && this.a.equals(((ajdp)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
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
