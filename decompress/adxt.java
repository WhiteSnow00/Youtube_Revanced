import android.graphics.Rect;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxt implements alx
{
    final Object a;
    private final int b;
    
    public adxt(final adum a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adxt(final adxu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adxt(final aeax a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final aoc a(final View view, final aoc aoc) {
        final int b = this.b;
        final boolean b2 = true;
        if (b == 0) {
            final adxu adxu = (adxu)this.a;
            if (adxu.b == null) {
                adxu.b = new Rect();
            }
            ((adxu)this.a).b.set(aoc.b(), aoc.d(), aoc.c(), aoc.a());
            ((adxu)this.a).a(aoc);
            final Object a = this.a;
            boolean willNotDraw = b2;
            if (!aoc.b.d().equals(aic.a)) {
                willNotDraw = (((adxu)this.a).a == null && b2);
            }
            ((adxu)a).setWillNotDraw(willNotDraw);
            anc.H((View)this.a);
            return aoc.l();
        }
        if (b != 1) {
            ((aeax)this.a).n = aoc.a();
            ((aeax)this.a).o = aoc.b();
            ((aeax)this.a).p = aoc.c();
            ((aeax)this.a).j();
            return aoc;
        }
        final Object a2 = this.a;
        aoc i;
        if (!anc.ai((View)a2)) {
            i = null;
        }
        else {
            i = aoc;
        }
        final adum adum = (adum)a2;
        if (!akq.b((Object)adum.i, (Object)i)) {
            adum.i = i;
            adum.requestLayout();
        }
        return aoc.l();
    }
}
