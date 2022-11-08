import android.view.View;
import android.content.res.TypedArray;
import android.widget.CompoundButton;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advr extends kk
{
    private static final int[][] a;
    private ColorStateList b;
    private boolean c;
    
    static {
        a = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
    }
    
    public advr(Context context, final AttributeSet set) {
        super(adyy.a(context, set, 2130970152, 2132085192), set);
        context = this.getContext();
        final TypedArray a = aduf.a(context, set, advs.a, 2130970152, 2132085192, new int[0]);
        if (a.hasValue(0)) {
            apf.c((CompoundButton)this, adwd.f(context, a, 0));
        }
        this.c = a.getBoolean(1, false);
        a.recycle();
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && apf.a((CompoundButton)this) == null) {
            this.c = true;
            if (this.b == null) {
                final int a = adwd.A((View)this, 2130969043);
                final int a2 = adwd.A((View)this, 2130969073);
                final int a3 = adwd.A((View)this, 2130969109);
                final int[][] a4 = advr.a;
                final int length = a4.length;
                this.b = new ColorStateList(a4, new int[] { adwd.C(a3, a, 1.0f), adwd.C(a3, a2, 0.54f), adwd.C(a3, a2, 0.38f), adwd.C(a3, a2, 0.38f) });
            }
            apf.c((CompoundButton)this, this.b);
        }
    }
}
