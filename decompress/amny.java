import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amny implements vhc
{
    public static final vhd a;
    private final amnz b;
    
    static {
        a = new amnx();
    }
    
    public amny(final amnz b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new amnw(this.b.toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amny && this.b.equals(((amny)o).b);
    }
    
    public List getSelectedVideoIds() {
        return (List)this.b.d;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amny.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MultiSelectVideoItemFeedSelectionStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
