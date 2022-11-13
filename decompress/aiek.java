// 
// Decompiled by Procyon v0.6.0
// 

public final class aiek implements vfu
{
    public static final vfv a;
    private final aiel b;
    
    static {
        a = new aiej();
    }
    
    public aiek(final aiel b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aiei(this.b.toBuilder());
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
        return o instanceof aiek && this.b.equals((Object)((aiek)o).b);
    }
    
    public String getCaptionPath() {
        return this.b.d;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aiek.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CaptionTrackEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
