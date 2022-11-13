import java.util.Iterator;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gma implements Iterable
{
    public final ViewGroup a;
    
    public gma(final ViewGroup a) {
        this.a = a;
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new ekc(this.a, 3);
    }
}
