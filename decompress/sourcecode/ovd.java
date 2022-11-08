import java.util.HashSet;
import java.util.Set;
import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovd extends PerformOnceCommandController
{
    public static final Set a;
    
    static {
        a = new HashSet();
    }
    
    public final void clear() {
        final Set a = ovd.a;
        synchronized (a) {
            a.clear();
        }
    }
    
    public final boolean contains(final String s) {
        final Set a = ovd.a;
        synchronized (a) {
            return a.contains(s);
        }
    }
    
    public final void insert(final String s) {
        final Set a = ovd.a;
        synchronized (a) {
            a.add(s);
        }
    }
}
