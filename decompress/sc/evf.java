import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evf implements evc
{
    public final Object a;
    private final int b;
    
    public evf(final shd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public evf(final she a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ViewGroup a() {
        if (this.b != 0) {
            return ((she)this.a).c;
        }
        return ((shd)this.a).c;
    }
}
