import android.view.View$OnLayoutChangeListener;
import android.support.v7.widget.RecyclerView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itq extends abho
{
    public int a;
    private final int h;
    private itp i;
    
    public itq(final Context context, final wyw wyw, final abhq abhq, final abhm abhm, final vai vai) {
        super(context, wyw, abhq, abhm, vai.f(45358198L));
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131169352);
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
        recyclerView.addOnLayoutChangeListener((View$OnLayoutChangeListener)(this.i = new itp(this)));
    }
}
