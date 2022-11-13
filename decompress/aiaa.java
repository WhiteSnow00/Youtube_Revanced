// 
// Decompiled by Procyon v0.6.0
// 

public final class aiaa
{
    private final aiab a;
    
    public aiaa(final aiab a) {
        this.a = a;
    }
    
    public static final afft a() {
        return new affr().g();
    }
    
    public static agnj b(final aiab aiab) {
        return new agnj(((ahbh)aiab).toBuilder());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiaa && ((ahbh)this.a).equals((Object)((aiaa)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("BadgeInfoModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
