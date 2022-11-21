import java.util.Iterator;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsd implements atsa
{
    final Object a;
    private final int b;
    
    public atsd(final ViewGroup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public atsd(final atqh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public atsd(final Iterator a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Iterator a() {
        final int b = this.b;
        if (b == 0) {
            final Object a = this.a;
            final atsb atsb = new atsb();
            atsb.a = audj.c((atqh)a, atsb, atsb);
            return atsb;
        }
        if (b != 1) {
            return (Iterator)this.a;
        }
        return (Iterator)new ang((ViewGroup)this.a);
    }
}
