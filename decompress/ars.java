import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ars implements Runnable
{
    private final List a;
    private final int b;
    
    public ars(final Collection collection, final int b) {
        afc.k(collection, "initCallbacks cannot be null");
        this.a = new ArrayList(collection);
        this.b = b;
    }
    
    @Override
    public final void run() {
        final int size = this.a.size();
        final int b = this.b;
        int i = 0;
        final int n = 0;
        if (b != 1) {
            for (int j = n; j < size; ++j) {
                ((apl)this.a.get(j)).f();
            }
        }
        else {
            while (i < size) {
                ((apl)this.a.get(i)).e();
                ++i;
            }
        }
    }
}
