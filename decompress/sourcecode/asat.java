import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asat
{
    public final Set a;
    
    public asat() {
        this.a = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
    }
    
    protected abstract void a();
    
    protected abstract void b();
    
    public final void c(final Object o, final boolean b) {
        final int size = this.a.size();
        if (b) {
            this.a.add(o);
            if (size == 0) {
                this.a();
            }
        }
        else if (this.a.remove(o) && size == 1) {
            this.b();
        }
    }
}
