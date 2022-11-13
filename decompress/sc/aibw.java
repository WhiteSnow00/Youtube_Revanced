// 
// Decompiled by Procyon v0.6.0
// 

public final class aibw implements vfu
{
    public static final vfv a;
    private final aibx b;
    
    static {
        a = new aibu();
    }
    
    public aibw(final aibx b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aibv(((ahbh)this.b).toBuilder());
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
        return o instanceof aibw && ((ahbh)this.b).equals((Object)((aibw)o).b);
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aibw.a;
    }
    
    public Boolean getValue() {
        return this.b.d;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("BooleanEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
