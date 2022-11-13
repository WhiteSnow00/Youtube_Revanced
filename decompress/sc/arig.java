import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class arig extends asij implements View$OnClickListener
{
    private final View a;
    private final ashy b;
    
    public arig(final View a, final ashy b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        this.a.setOnClickListener((View$OnClickListener)null);
    }
    
    public final void onClick(final View view) {
        if (!this.tA()) {
            this.b.tu(arif.a);
        }
    }
}
