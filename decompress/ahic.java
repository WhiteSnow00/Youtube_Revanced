// 
// Decompiled by Procyon v0.6.0
// 

public final class ahic implements vfu
{
    public static final vfv a;
    private final ahhz b;
    
    static {
        a = new ahia();
    }
    
    public ahic(final ahhz b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new ahib(((ahbh)this.b).toBuilder());
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
        return o instanceof ahic && ((ahbh)this.b).equals((Object)((ahic)o).b);
    }
    
    public Boolean getShouldRequireViewerAck() {
        return this.b.d;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return ahic.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AADCGuidelinesStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
