import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccr
{
    final cch a;
    final List b;
    public cci c;
    private final ccf d;
    
    public ccr(final cch a) {
        this.b = new ArrayList();
        this.a = a;
        this.d = a.f;
    }
    
    public final ComponentName a() {
        return this.d.a;
    }
    
    final ccs b(final String s) {
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            if (((ccs)this.b.get(i)).b.equals(s)) {
                return (ccs)this.b.get(i);
            }
        }
        return null;
    }
    
    public final String c() {
        return this.d.a();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MediaRouter.RouteProviderInfo{ packageName=");
        sb.append(this.c());
        sb.append(" }");
        return sb.toString();
    }
}
