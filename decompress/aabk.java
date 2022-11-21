import java.util.function.Consumer;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabk implements afax
{
    public final AtomicBoolean a;
    final znz b;
    final aabl c;
    
    public aabk(final aabl c, final znz b) {
        this.c = c;
        this.a = new AtomicBoolean(false);
        this.b = b;
    }
    
    @Override
    public final /* bridge */ Object apply(final Object o) {
        final afhk afhk = (afhk)o;
        final HashMap hashMap = new HashMap();
        Collection$_EL.stream((Collection)afhk).filter((Predicate)xas.n).map((Function)zzl.e).forEach((Consumer)new xca((Map)hashMap, 18));
        if (!this.a.get() && !hashMap.isEmpty()) {
            synchronized (this.c) {
                if (this.c.c.c().equals(this.b)) {
                    this.c.f.clear();
                    this.c.f.putAll(hashMap);
                }
            }
        }
        return true;
    }
}
