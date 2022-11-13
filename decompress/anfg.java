// 
// Decompiled by Procyon v0.6.0
// 

public final class anfg implements vfu
{
    public static final vfv a;
    private final anfh b;
    
    static {
        a = new anff();
    }
    
    public anfg(final anfh b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new anfe(this.b.toBuilder());
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof anfg && this.b.equals((Object)((anfg)o).b);
    }
    
    public anfi getPlayerLayoutState() {
        anfi anfi;
        if ((anfi = anfi.b(this.b.e)) == null) {
            anfi = anfi.a;
        }
        return anfi;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return anfg.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("PlayerLayoutStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
