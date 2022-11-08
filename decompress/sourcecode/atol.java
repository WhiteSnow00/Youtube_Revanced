import java.util.Iterator;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atol implements atoi
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public atol(final ViewGroup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public atol(final atmp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public atol(final Iterator a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Iterator a() {
        final int b = this.b;
        if (b == 0) {
            final Object a = this.a;
            final atoj atoj = new atoj();
            atoj.a = atza.d((atmp)a, (Object)atoj, (atld)atoj);
            return atoj;
        }
        if (b != 1) {
            return (Iterator)this.a;
        }
        return new ane((ViewGroup)this.a);
    }
}
