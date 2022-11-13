import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class afjj extends afdo
{
    final Map.Entry a;
    final afjk b;
    
    public afjj(final afjk b, final Map.Entry a) {
        this.b = b;
        this.a = a;
    }
    
    protected final Object a() {
        return this.a;
    }
    
    protected final Map.Entry b() {
        return this.a;
    }
    
    public final /* bridge */ Object getValue() {
        return afnd.h((Collection)this.a.getValue(), this.b.a.g);
    }
}
