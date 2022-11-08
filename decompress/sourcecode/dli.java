import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable$ConstantState;
import android.view.Gravity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import java.nio.ByteBuffer;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dli extends Drawable implements Animatable, dln
{
    public final dlh a;
    public boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private final int g;
    private boolean h;
    private Paint i;
    private Rect j;
    
    public dli(final dlh a) {
        this.e = true;
        this.g = -1;
        cll.h((Object)a);
        this.a = a;
    }
    
    private final Paint d() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }
    
    private final Rect e() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }
    
    private final void f() {
        cll.i(this.b ^ true, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.a.a() == 1) {
            this.invalidateSelf();
            return;
        }
        if (this.c) {
            return;
        }
        this.c = true;
        final dlo a = this.a.a;
        if (a.f) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (!a.b.contains(this)) {
            final boolean empty = a.b.isEmpty();
            a.b.add(this);
            if (empty && !a.d) {
                a.d = true;
                a.f = false;
                a.b();
            }
            this.invalidateSelf();
            return;
        }
        throw new IllegalStateException("Cannot subscribe twice in a row");
    }
    
    private final void g() {
        this.c = false;
        final dlo a = this.a.a;
        a.b.remove(this);
        if (a.b.isEmpty()) {
            a.f();
        }
    }
    
    public final Bitmap a() {
        return this.a.a.h;
    }
    
    public final ByteBuffer b() {
        return ((dcw)this.a.a.a).a.asReadOnlyBuffer();
    }
    
    public final void c() {
        Drawable$Callback drawable$Callback;
        for (drawable$Callback = this.getCallback(); drawable$Callback instanceof Drawable; drawable$Callback = ((Drawable)drawable$Callback).getCallback()) {}
        if (drawable$Callback == null) {
            this.stop();
            this.invalidateSelf();
            return;
        }
        this.invalidateSelf();
        final dlo a = this.a.a;
        final dlm e = a.e;
        int a2;
        if (e != null) {
            a2 = e.a;
        }
        else {
            a2 = -1;
        }
        if (a2 == a.a() - 1) {
            ++this.f;
        }
        if (this.g != -1 && this.f >= 0) {
            this.stop();
        }
    }
    
    public final void draw(final Canvas canvas) {
        if (this.b) {
            return;
        }
        if (this.h) {
            Gravity.apply(119, this.getIntrinsicWidth(), this.getIntrinsicHeight(), this.getBounds(), this.e());
            this.h = false;
        }
        final dlo a = this.a.a;
        final dlm e = a.e;
        Bitmap bitmap;
        if (e != null) {
            bitmap = e.b;
        }
        else {
            bitmap = a.h;
        }
        canvas.drawBitmap(bitmap, (Rect)null, this.e(), this.d());
    }
    
    public final Drawable$ConstantState getConstantState() {
        return (Drawable$ConstantState)this.a;
    }
    
    public final int getIntrinsicHeight() {
        return this.a.a.l;
    }
    
    public final int getIntrinsicWidth() {
        return this.a.a.k;
    }
    
    public final int getOpacity() {
        return -2;
    }
    
    public final boolean isRunning() {
        return this.c;
    }
    
    protected final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }
    
    public final void setAlpha(final int alpha) {
        this.d().setAlpha(alpha);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.d().setColorFilter(colorFilter);
    }
    
    public final boolean setVisible(final boolean e, final boolean b) {
        cll.i(this.b ^ true, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        if (!(this.e = e)) {
            this.g();
        }
        else if (this.d) {
            this.f();
        }
        return super.setVisible(e, b);
    }
    
    public final void start() {
        this.d = true;
        this.f = 0;
        if (this.e) {
            this.f();
        }
    }
    
    public final void stop() {
        this.d = false;
        this.g();
    }
}
