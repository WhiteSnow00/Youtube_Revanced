// 
// Decompiled by Procyon v0.6.0
// 

public final class aowp implements vfu
{
    public static final vfv a;
    private final aowq b;
    
    static {
        a = new aowo();
    }
    
    public aowp(final aowq b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aown(this.b.toBuilder());
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
        return o instanceof aowp && this.b.equals((Object)((aowp)o).b);
    }
    
    public Boolean getHighlighted() {
        return this.b.d;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aowp.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TranscriptSegmentEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
