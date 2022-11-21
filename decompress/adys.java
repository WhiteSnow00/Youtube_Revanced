import android.graphics.Rect;
import android.graphics.Canvas;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adys extends adyw
{
    public static final int c = 0;
    private static final arj j;
    public final adyx a;
    public float b;
    private final arm k;
    private final arl l;
    private boolean m;
    
    static {
        j = (arj)new adyr();
    }
    
    public adys(final Context context, final adyj adyj, final adyx a) {
        super(context, adyj);
        this.m = false;
        this.a = a;
        a.b = this;
        final arm arm = new arm();
        (this.k = arm).c();
        arm.e(50.0f);
        final arl l = new arl((Object)this, adys.j);
        this.l = l;
        l.n = arm;
        this.e(1.0f);
    }
    
    public final void a(final float b) {
        this.b = b;
        this.invalidateSelf();
    }
    
    public final boolean b(final boolean b, final boolean b2, final boolean b3) {
        final boolean b4 = super.b(b, b2, b3);
        final float z = adfe.z(this.d.getContentResolver());
        if (z == 0.0f) {
            this.m = true;
        }
        else {
            this.m = false;
            this.k.e(50.0f / z);
        }
        return b4;
    }
    
    public final void draw(final Canvas canvas) {
        final Rect rect = new Rect();
        if (!this.getBounds().isEmpty() && this.isVisible()) {
            if (canvas.getClipBounds(rect)) {
                canvas.save();
                this.a.f(canvas, this.getBounds(), this.c());
                this.a.e(canvas, this.h);
                this.a.d(canvas, this.h, 0.0f, this.b, adfe.K(this.e.c[0], super.i));
                canvas.restore();
            }
        }
    }
    
    public final int getIntrinsicHeight() {
        return this.a.a();
    }
    
    public final int getIntrinsicWidth() {
        return this.a.b();
    }
    
    public final /* bridge */ int getOpacity() {
        return -3;
    }
    
    public final void jumpToCurrentState() {
        this.l.j();
        this.a(this.getLevel() / 10000.0f);
    }
    
    protected final boolean onLevelChange(final int n) {
        if (this.m) {
            this.l.j();
            this.a(n / 10000.0f);
        }
        else {
            ((ari)this.l).g(this.b * 10000.0f);
            this.l.h((float)n);
        }
        return true;
    }
}
