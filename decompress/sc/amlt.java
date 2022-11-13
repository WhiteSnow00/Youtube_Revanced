import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlt implements vfu
{
    public static final vfv a;
    private final amlu b;
    
    static {
        a = new amls();
    }
    
    public amlt(final amlu b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new amlr(this.b.toBuilder());
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amlt && this.b.equals((Object)((amlt)o).b);
    }
    
    public List getSelectedVideoIds() {
        return (List)this.b.d;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return amlt.a;
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
