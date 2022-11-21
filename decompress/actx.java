import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class actx extends advd
{
    public final View a;
    int b;
    
    public actx(final View a) {
        this.a = a;
    }
    
    @Override
    public final void a(View a, float min) {
        min = Math.min(min, 1.0f);
        a = this.a;
        final int b = this.b;
        tqf.aF(a, tqf.aq(b - (int)(b * Math.max(min, 0.0f))), (Class)ViewGroup$MarginLayoutParams.class);
    }
    
    @Override
    public final void b(final View view, final int n) {
    }
}
