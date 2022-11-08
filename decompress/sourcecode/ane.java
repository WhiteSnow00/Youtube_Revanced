import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ane implements Iterator, atnq
{
    final /* synthetic */ ViewGroup a;
    private int b;
    
    public ane(final ViewGroup a) {
        this.a = a;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b < this.a.getChildCount();
    }
    
    @Override
    public final void remove() {
        this.a.removeViewAt(--this.b);
    }
}
