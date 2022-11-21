import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvj implements vhc
{
    public static final vhd a;
    private final apvl b;
    
    static {
        a = new apvi();
    }
    
    public apvj(final apvl b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new apvh(this.b.toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof apvj && this.b.equals(((apvj)o).b);
    }
    
    public Map getSuggestedActionDismissalStateMapMap() {
        return Collections.unmodifiableMap((Map<?, ?>)this.b.e);
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return apvj.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("WatchSuggestedActionEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
