import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsx implements vfu
{
    public static final vfv a;
    private final apsz b;
    
    static {
        a = new apsw();
    }
    
    public apsx(final apsz b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new apsv(this.b.toBuilder());
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
        return o instanceof apsx && this.b.equals((Object)((apsx)o).b);
    }
    
    public Map getSuggestedActionDismissalStateMapMap() {
        return Collections.unmodifiableMap((Map<?, ?>)this.b.e);
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return apsx.a;
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
