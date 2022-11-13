import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwg implements vfu
{
    public static final vfv a;
    private final anwh b;
    
    static {
        a = new anwf();
    }
    
    public anwg(final anwh b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return this.c();
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final anwe c() {
        return new anwe(this.b.toBuilder());
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof anwg && this.b.equals((Object)((anwg)o).b);
    }
    
    public List getPlaylistIds() {
        return (List)this.b.d;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return anwg.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("SaveToPlaylistListEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
