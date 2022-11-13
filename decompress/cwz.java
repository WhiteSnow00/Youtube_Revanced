import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cwz implements cwy
{
    public final List a;
    
    public cwz(final Object o) {
        this(Collections.singletonList(new czs(o)));
    }
    
    public cwz(final List a) {
        this.a = a;
    }
    
    @Override
    public final List b() {
        return this.a;
    }
    
    @Override
    public final boolean c() {
        final boolean empty = this.a.isEmpty();
        boolean b = true;
        if (!empty) {
            if (this.a.size() == 1) {
                if (!this.a.get(0).e()) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
