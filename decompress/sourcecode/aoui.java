// 
// Decompiled by Procyon v0.6.0
// 

public final class aoui implements vdt
{
    public static final vdu a;
    private final aouj b;
    
    static {
        a = new aouh();
    }
    
    public aoui(final aouj b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aoui && this.b.equals(((aoui)o).b);
    }
    
    public aotx getSearchState() {
        aotx aotx;
        if ((aotx = aotx.b(this.b.d)) == null) {
            aotx = aotx.a;
        }
        return aotx;
    }
    
    public vdu getType() {
        return aoui.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TranscriptSearchStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
