import android.view.View$OnLayoutChangeListener;
import android.support.v7.widget.RecyclerView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isr extends abft
{
    public int a;
    private final int h;
    private isq i;
    
    public isr(final Context context, final wwv wwv, final abfv abfv, final abfr abfr, final uyi uyi) {
        super(context, wwv, abfv, abfr, uyi.f(45358198L));
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131169353);
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131165401);
        this.h = dimensionPixelSize2;
        this.a = dimensionPixelSize2 - dimensionPixelSize;
    }
    
    protected final int a() {
        return this.h + super.f;
    }
    
    protected final int b() {
        return this.a + super.f;
    }
    
    protected final void c(final RecyclerView recyclerView) {
        recyclerView.s = true;
        recyclerView.addOnLayoutChangeListener((View$OnLayoutChangeListener)(this.i = new isq(this)));
    }
}
