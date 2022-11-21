import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.animation.Animator;
import android.content.res.TypedArray;
import java.util.Collection;
import android.animation.AnimatorSet;
import android.animation.AnimatorInflater;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.drawable.Drawable$Callback;
import java.util.ArrayList;
import android.animation.Animator$AnimatorListener;
import android.graphics.drawable.Animatable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cke extends ckf implements Animatable
{
    public final ckb a;
    public Animator$AnimatorListener b;
    public ArrayList c;
    final Drawable$Callback d;
    private final Context f;
    
    public cke() {
        this(null);
    }
    
    private cke(final Context f) {
        this.b = null;
        this.c = null;
        this.d = (Drawable$Callback)new cjz(this);
        this.f = f;
        this.a = new ckb();
    }
    
    public static cke a(final Context context, final int n) {
        final cke cke = new cke(context);
        final Drawable f = ahw.f(context.getResources(), n, context.getTheme());
        f.setCallback(cke.d);
        new ckc(f.getConstantState());
        cke.e = f;
        return cke;
    }
    
    @Override
    public final void applyTheme(final Resources$Theme resources$Theme) {
        final Drawable e = this.e;
        if (e != null) {
            air.b(e, resources$Theme);
        }
    }
    
    public final void b(final cjy cjy) {
        if (cjy == null) {
            return;
        }
        final Drawable e = this.e;
        if (e != null) {
            ckd.b(e, cjy.a());
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.c.contains(cjy)) {
            return;
        }
        this.c.add(cjy);
        if (this.b == null) {
            this.b = (Animator$AnimatorListener)new cka(this);
        }
        this.a.c.addListener(this.b);
    }
    
    public final boolean canApplyTheme() {
        final Drawable e = this.e;
        return e != null && air.i(e);
    }
    
    public final void draw(final Canvas canvas) {
        final Drawable e = this.e;
        if (e != null) {
            e.draw(canvas);
            return;
        }
        this.a.b.draw(canvas);
        if (this.a.c.isStarted()) {
            this.invalidateSelf();
        }
    }
    
    public final int getAlpha() {
        final Drawable e = this.e;
        if (e != null) {
            return aiq.a(e);
        }
        return this.a.b.getAlpha();
    }
    
    public final int getChangingConfigurations() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getChangingConfigurations();
        }
        final int changingConfigurations = super.getChangingConfigurations();
        final int a = this.a.a;
        return changingConfigurations;
    }
    
    public final ColorFilter getColorFilter() {
        final Drawable e = this.e;
        if (e != null) {
            return air.a(e);
        }
        return this.a.b.getColorFilter();
    }
    
    public final Drawable$ConstantState getConstantState() {
        final Drawable e = this.e;
        if (e != null) {
            return new ckc(e.getConstantState());
        }
        return null;
    }
    
    public final int getIntrinsicHeight() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getIntrinsicHeight();
        }
        return this.a.b.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getIntrinsicWidth();
        }
        return this.a.b.getIntrinsicWidth();
    }
    
    public final int getOpacity() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getOpacity();
        }
        return this.a.b.getOpacity();
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set) {
        this.inflate(resources, xmlPullParser, set, null);
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final Drawable e = this.e;
        if (e != null) {
            air.c(e, resources, xmlPullParser, set, resources$Theme);
            return;
        }
        for (int n = xmlPullParser.getEventType(), depth = xmlPullParser.getDepth(); n != 1 && (xmlPullParser.getDepth() >= depth + 1 || n != 3); n = xmlPullParser.next()) {
            if (n == 2) {
                final String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    final TypedArray f = vh.f(resources, resources$Theme, set, cjw.e);
                    final int resourceId = f.getResourceId(0, 0);
                    if (resourceId != 0) {
                        final ckn b = new ckn();
                        b.e = ahw.f(resources, resourceId, resources$Theme);
                        b.c = false;
                        b.setCallback(this.d);
                        final ckn b2 = this.a.b;
                        if (b2 != null) {
                            b2.setCallback((Drawable$Callback)null);
                        }
                        this.a.b = b;
                    }
                    f.recycle();
                }
                else if ("target".equals(name)) {
                    final TypedArray obtainAttributes = resources.obtainAttributes(set, cjw.f);
                    final String string = obtainAttributes.getString(0);
                    final int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        final Context f2 = this.f;
                        if (f2 == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        final Animator loadAnimator = AnimatorInflater.loadAnimator(f2, resourceId2);
                        loadAnimator.setTarget(((abp)this.a.b.b.b.l).get((Object)string));
                        final ckb a = this.a;
                        if (a.d == null) {
                            a.d = new ArrayList();
                            this.a.e = new abi();
                        }
                        this.a.d.add(loadAnimator);
                        ((abp)this.a.e).put((Object)loadAnimator, (Object)string);
                    }
                    obtainAttributes.recycle();
                }
            }
        }
        final ckb a2 = this.a;
        if (a2.c == null) {
            a2.c = new AnimatorSet();
        }
        a2.c.playTogether((Collection)a2.d);
    }
    
    public final boolean isAutoMirrored() {
        final Drawable e = this.e;
        if (e != null) {
            return aiq.e(e);
        }
        return this.a.b.isAutoMirrored();
    }
    
    public final boolean isRunning() {
        final Drawable e = this.e;
        if (e != null) {
            return ((AnimatedVectorDrawable)e).isRunning();
        }
        return this.a.c.isRunning();
    }
    
    public final boolean isStateful() {
        final Drawable e = this.e;
        if (e != null) {
            return e.isStateful();
        }
        return this.a.b.isStateful();
    }
    
    public final Drawable mutate() {
        final Drawable e = this.e;
        if (e != null) {
            e.mutate();
        }
        return this;
    }
    
    @Override
    protected final void onBoundsChange(final Rect rect) {
        final Drawable e = this.e;
        if (e != null) {
            e.setBounds(rect);
            return;
        }
        this.a.b.setBounds(rect);
    }
    
    @Override
    protected final boolean onLevelChange(final int n) {
        final Drawable e = this.e;
        if (e != null) {
            return e.setLevel(n);
        }
        return this.a.b.setLevel(n);
    }
    
    protected final boolean onStateChange(final int[] array) {
        final Drawable e = this.e;
        if (e != null) {
            return e.setState(array);
        }
        return this.a.b.setState(array);
    }
    
    public final void setAlpha(final int n) {
        final Drawable e = this.e;
        if (e != null) {
            e.setAlpha(n);
            return;
        }
        this.a.b.setAlpha(n);
    }
    
    public final void setAutoMirrored(final boolean autoMirrored) {
        final Drawable e = this.e;
        if (e != null) {
            aiq.d(e, autoMirrored);
            return;
        }
        this.a.b.setAutoMirrored(autoMirrored);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        final Drawable e = this.e;
        if (e != null) {
            e.setColorFilter(colorFilter);
            return;
        }
        this.a.b.setColorFilter(colorFilter);
    }
    
    public final void setTint(final int tint) {
        final Drawable e = this.e;
        if (e != null) {
            air.f(e, tint);
            return;
        }
        this.a.b.setTint(tint);
    }
    
    public final void setTintList(final ColorStateList tintList) {
        final Drawable e = this.e;
        if (e != null) {
            air.g(e, tintList);
            return;
        }
        this.a.b.setTintList(tintList);
    }
    
    public final void setTintMode(final PorterDuff$Mode tintMode) {
        final Drawable e = this.e;
        if (e != null) {
            air.h(e, tintMode);
            return;
        }
        this.a.b.setTintMode(tintMode);
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        final Drawable e = this.e;
        if (e != null) {
            return e.setVisible(b, b2);
        }
        this.a.b.setVisible(b, b2);
        return super.setVisible(b, b2);
    }
    
    public final void start() {
        final Drawable e = this.e;
        if (e != null) {
            ((AnimatedVectorDrawable)e).start();
            return;
        }
        if (this.a.c.isStarted()) {
            return;
        }
        this.a.c.start();
        this.invalidateSelf();
    }
    
    public final void stop() {
        final Drawable e = this.e;
        if (e != null) {
            ((AnimatedVectorDrawable)e).stop();
            return;
        }
        this.a.c.end();
    }
}
