import java.util.List;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drv extends AbstractList
{
    final List a;
    
    public drv(final drg drg, final dpt... array) {
        final dqa c = ((dpv)drg.m).c();
        if (drg.m.j((Class)drl.class).isEmpty()) {
            this.a = (List)new argl(drg.n().a, c);
            return;
        }
        this.a = (List)new argn(drg.n().a, c, array);
    }
    
    @Override
    public final /* bridge */ Object get(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
