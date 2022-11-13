// 
// Decompiled by Procyon v0.6.0
// 

public final class aout implements vfu
{
    public static final vfv a;
    private final aouu b;
    
    static {
        a = new aous();
    }
    
    public aout(final aouu b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aour(this.b.toBuilder());
    }
    
    public final afft b() {
        final affr affr = new affr();
        this.getTimestampModel();
        affr.j((Iterable)new affr().g());
        return affr.g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aout && this.b.equals((Object)((aout)o).b);
    }
    
    public String getFormattedTime() {
        return this.b.e;
    }
    
    public aouw getTimestamp() {
        aouw aouw;
        if ((aouw = this.b.d) == null) {
            aouw = aouw.a;
        }
        return aouw;
    }
    
    public aouv getTimestampModel() {
        aouw aouw;
        if ((aouw = this.b.d) == null) {
            aouw = aouw.a;
        }
        return new aouv((aouw)aouw.toBuilder().build());
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aout.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TimestampEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
