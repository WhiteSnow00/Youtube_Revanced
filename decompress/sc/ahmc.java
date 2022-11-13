// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmc implements vfu
{
    public static final vfv a;
    public final vfp b;
    public final ahmd c;
    
    static {
        a = new ahma();
    }
    
    public ahmc(final ahmd c, final vfp b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new ahmb(((ahbh)this.c).toBuilder());
    }
    
    public final afft b() {
        final affr affr = new affr();
        final ahmd c = this.c;
        if ((c.c & 0x2) != 0x0) {
            affr.h((Object)c.e);
        }
        return affr.g();
    }
    
    public final byte[] d() {
        return ((agzk)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ahmc && ((ahbh)this.c).equals((Object)((ahmc)o).c);
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return ahmc.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.c).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("AdPlaybackDataEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
