// 
// Decompiled by Procyon v0.6.0
// 

public final class ahya implements vfu
{
    public static final vfv a;
    private final ahyb b;
    
    static {
        a = new ahxy();
    }
    
    public ahya(final ahyb b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return this.c();
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final ahxz c() {
        return new ahxz(((ahbh)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ahya && ((ahbh)this.b).equals((Object)((ahya)o).b);
    }
    
    public aiie getStatus() {
        aiie aiie;
        if ((aiie = aiie.b(this.b.d)) == null) {
            aiie = aiie.a;
        }
        return aiie;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return ahya.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AvatarRowChannelStatusEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
