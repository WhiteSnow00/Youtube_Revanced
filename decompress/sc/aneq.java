// 
// Decompiled by Procyon v0.6.0
// 

public final class aneq implements vfu
{
    public static final vfv a;
    private final aner b;
    
    static {
        a = new anep();
    }
    
    public aneq(final aner b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aneo(this.b.toBuilder());
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
        return o instanceof aneq && this.b.equals((Object)((aneq)o).b);
    }
    
    public anes getPlayerControlsVisibility() {
        anes anes;
        if ((anes = anes.b(this.b.e)) == null) {
            anes = anes.a;
        }
        return anes;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aneq.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("PlayerControlsVisibilityEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
