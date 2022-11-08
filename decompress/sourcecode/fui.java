import android.widget.CheckedTextView;
import android.widget.RadioGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fui
{
    public final Context a;
    public final RadioGroup b;
    public final CheckedTextView c;
    public qpt d;
    public qpt e;
    
    public fui(final Context a, final RadioGroup b, final CheckedTextView c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final boolean checked) {
        this.c.setChecked(checked);
        final Object a = this.d.a;
        int h;
        if (!checked) {
            h = 2;
        }
        else {
            h = 3;
        }
        ((kvb)a).h = h;
    }
}
