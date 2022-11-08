import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class arq implements Runnable
{
    private final List a;
    private final int b;
    
    public arq(final Collection collection, final int b) {
        aff.l((Object)collection, (Object)"initCallbacks cannot be null");
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
                ((apk)this.a.get(j)).d();
            }
        }
        else {
            while (i < size) {
                ((apk)this.a.get(i)).c();
                ++i;
            }
        }
    }
}
