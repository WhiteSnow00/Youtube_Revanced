import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jtt implements fjm
{
    public final toa a;
    public final Rect b;
    public View c;
    public kra d;
    public tnv e;
    private final arhr f;
    private final arhr g;
    private ViewGroup h;
    
    public jtt(final toa a, final arhr f, final arhr g) {
        this.a = a;
        this.f = f;
        this.g = g;
        this.b = new Rect();
        a.c().al((asix)new jou(this, 11));
    }
    
    public final Rect a() {
        return this.b;
    }
    
    public final tnv b() {
        return this.e;
    }
    
    public final void c(final Rect rect) {
        final kra d = this.d;
        if (d != null) {
            d.i(rect.left, rect.top, rect.right, rect.bottom);
        }
        final View view = (View)this.g.a();
        ViewGroup h;
        if (!((hdv)this.f.a()).k()) {
            if (this.h == null) {
                final View c = this.c;
                if (c != null) {
                    this.h = (ViewGroup)c.findViewById(2131432452);
                }
            }
            h = this.h;
        }
        else {
            h = null;
        }
        tmy.aF((View)agot.P((Object)h, (Object)view), tmy.aB(rect.top), (Class)ViewGroup$MarginLayoutParams.class);
        tmy.aF(view, tmy.an(new tsp[] { tmy.au(rect.left), tmy.aA(rect.right), tmy.aq(rect.bottom) }), (Class)ViewGroup$MarginLayoutParams.class);
    }
}
