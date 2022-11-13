// 
// Decompiled by Procyon v0.6.0
// 

public final class aowl implements vfu
{
    public static final vfv a;
    private final aowm b;
    
    static {
        a = new aowk();
    }
    
    public aowl(final aowm b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aowj(this.b.toBuilder());
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
        return o instanceof aowl && this.b.equals((Object)((aowl)o).b);
    }
    
    public aowa getSearchState() {
        aowa aowa;
        if ((aowa = aowa.b(this.b.d)) == null) {
            aowa = aowa.a;
        }
        return aowa;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aowl.a;
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
