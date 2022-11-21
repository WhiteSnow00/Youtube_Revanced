import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class aevd
{
    int a;
    final int b;
    aevd c;
    final Map d;
    
    public aevd(final int a, final int b) {
        this.d = new HashMap(0);
        if (a <= b) {
            this.a = a;
            this.b = b;
            this.c = null;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public final String toString() {
        final int identityHashCode = System.identityHashCode(this);
        final StringBuilder sb = new StringBuilder("Node");
        sb.append(identityHashCode);
        return sb.toString();
    }
}
