// 
// Decompiled by Procyon v0.6.0
// 

public final class anbf implements vhc
{
    public static final vhd a;
    private final anbg b;
    
    static {
        a = new anbe();
    }
    
    public anbf(final anbg b) {
        this.b = b;
    }
    
    public static anbd c(final anbg anbg) {
        return new anbd(((ahcz)anbg).toBuilder());
    }
    
    public final /* bridge */ vgs a() {
        return new anbd(((ahcz)this.b).toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof anbf && ((ahcz)this.b).equals(((anbf)o).b);
    }
    
    public anbh getState() {
        anbh anbh;
        if ((anbh = anbh.b(this.b.d)) == null) {
            anbh = anbh.a;
        }
        return anbh;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return anbf.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ParticipantJoinStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
