// 
// Decompiled by Procyon v0.6.0
// 

public final class aolt implements vfu
{
    public static final vfv a;
    private final aolu b;
    
    static {
        a = new aols();
    }
    
    public aolt(final aolu b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aolr(this.b.toBuilder());
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
        return o instanceof aolt && this.b.equals((Object)((aolt)o).b);
    }
    
    public aluv getConnectionState() {
        aluv aluv;
        if ((aluv = aluv.b(this.b.d)) == null) {
            aluv = aluv.a;
        }
        return aluv;
    }
    
    public Boolean getHidden() {
        return this.b.e;
    }
    
    public Boolean getMuted() {
        return this.b.f;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aolt.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("StreamStatusDataEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
