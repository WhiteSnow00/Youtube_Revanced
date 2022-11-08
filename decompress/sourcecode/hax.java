import android.view.MotionEvent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hax implements gzw
{
    public static final aqvr a;
    public ViewGroup b;
    public aqxf c;
    public View d;
    public airb e;
    public ahdw f;
    public View g;
    public int h;
    public int i;
    public final aceo j;
    public final atid k;
    public final aftr l;
    private AnimatorSet m;
    private boolean n;
    private final tvk o;
    
    static {
        a = aqvr.b;
    }
    
    public hax(final aftr l, final aceo j) {
        this.k = atid.aD();
        this.o = (tvk)new udj(this, 1);
        this.l = l;
        this.j = j;
    }
    
    public static Rect b(final View view) {
        final Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
    
    static ahdw c(final Rect rect, final Rect rect2) {
        final float n = rect2.height() / (float)Math.min(rect.width(), rect.height());
        final float exactCenterY = rect2.exactCenterY();
        final float exactCenterY2 = rect.exactCenterY();
        final int height = rect.height();
        final Matrix matrix = new Matrix();
        matrix.setTranslate(0.0f, (exactCenterY - exactCenterY2) / height);
        matrix.preScale(n, n, 0.5f, 0.5f);
        final float[] array = new float[9];
        matrix.getValues(array);
        final agza builder = ((agzi)ahdw.a).createBuilder();
        builder.copyOnWrite();
        ahdw.a((ahdw)builder.instance);
        builder.copyOnWrite();
        ahdw.b((ahdw)builder.instance);
        builder.copyOnWrite();
        final ahdw ahdw = (ahdw)builder.instance;
        ahdw.f = 1;
        ahdw.b |= 0x4;
        for (int i = 0; i < 9; ++i) {
            builder.ay(array[i]);
        }
        return (ahdw)builder.build();
    }
    
    private final void d(final boolean b) {
        long n;
        if (!b) {
            n = 70L;
        }
        else {
            n = 150L;
        }
        this.m = uji.G(this.o, b, this.m, n);
    }
    
    public final void a(final airb airb) {
        this.k.tr((Object)aexq.j(airb));
    }
    
    public final boolean onTouch(View d, final MotionEvent motionEvent) {
        if (d == this.d) {
            final int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return false;
                    }
                }
                else {
                    if (!this.n) {
                        return true;
                    }
                    this.d(false);
                    this.n = false;
                    d = this.d;
                    if (d != null) {
                        d.performClick();
                        return true;
                    }
                    return true;
                }
            }
            if (!this.n) {
                this.d(true);
                this.n = true;
            }
            return true;
        }
        return false;
    }
}
