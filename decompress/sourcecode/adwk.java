import android.graphics.RectF;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwk
{
    public static final adwb a;
    public final adwb b;
    public final adwb c;
    public final adwb d;
    public final adwb e;
    final adwd f;
    final adwd g;
    final adwd h;
    final adwd i;
    public final adwd j;
    public final adwd k;
    public final adwd l;
    public final adwd m;
    
    static {
        a = (adwb)new adwh(0.5f);
    }
    
    public adwk() {
        this.j = adwd.ai();
        this.k = adwd.ai();
        this.l = adwd.ai();
        this.m = adwd.ai();
        this.b = (adwb)new advz(0.0f);
        this.c = (adwb)new advz(0.0f);
        this.d = (adwb)new advz(0.0f);
        this.e = (adwb)new advz(0.0f);
        this.f = adwd.ac();
        this.g = adwd.ac();
        this.h = adwd.ac();
        this.i = adwd.ac();
    }
    
    public adwk(final adwj adwj) {
        this.j = adwj.i;
        this.k = adwj.j;
        this.l = adwj.k;
        this.m = adwj.l;
        this.b = adwj.a;
        this.c = adwj.b;
        this.d = adwj.c;
        this.e = adwj.d;
        this.f = adwj.e;
        this.g = adwj.f;
        this.h = adwj.g;
        this.i = adwj.h;
    }
    
    public static adwj a() {
        return new adwj();
    }
    
    public static adwj b(Context obtainStyledAttributes, int int1, int int2, adwb h) {
        ContextThemeWrapper contextThemeWrapper2;
        final ContextThemeWrapper contextThemeWrapper = contextThemeWrapper2 = new ContextThemeWrapper(obtainStyledAttributes, int1);
        if (int2 != 0) {
            contextThemeWrapper2 = new ContextThemeWrapper((Context)contextThemeWrapper, int2);
        }
        obtainStyledAttributes = (Context)((Context)contextThemeWrapper2).obtainStyledAttributes(adwg.b);
        try {
            final int int3 = ((TypedArray)obtainStyledAttributes).getInt(0, 0);
            int1 = ((TypedArray)obtainStyledAttributes).getInt(3, int3);
            int2 = ((TypedArray)obtainStyledAttributes).getInt(4, int3);
            final int int4 = ((TypedArray)obtainStyledAttributes).getInt(2, int3);
            final int int5 = ((TypedArray)obtainStyledAttributes).getInt(1, int3);
            final adwb h2 = h((TypedArray)obtainStyledAttributes, 5, h);
            h = h((TypedArray)obtainStyledAttributes, 8, h2);
            final adwb h3 = h((TypedArray)obtainStyledAttributes, 9, h2);
            final adwb h4 = h((TypedArray)obtainStyledAttributes, 7, h2);
            final adwb h5 = h((TypedArray)obtainStyledAttributes, 6, h2);
            final adwj adwj = new adwj();
            adwj.i(adwd.ah(int1));
            adwj.a = h;
            adwj.j(adwd.ah(int2));
            adwj.b = h3;
            adwj.h(adwd.ah(int4));
            adwj.c = h4;
            adwj.g(adwd.ah(int5));
            adwj.d = h5;
            return adwj;
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public static adwj c(final Context context, final AttributeSet set, final int n, final int n2) {
        return d(context, set, n, n2, (adwb)new advz(0.0f));
    }
    
    public static adwj d(final Context context, final AttributeSet set, int resourceId, int resourceId2, final adwb adwb) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, adwg.a, resourceId, resourceId2);
        resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
        resourceId = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId2, resourceId, adwb);
    }
    
    private static adwb h(final TypedArray typedArray, final int n, final adwb adwb) {
        final TypedValue peekValue = typedArray.peekValue(n);
        if (peekValue == null) {
            return adwb;
        }
        if (peekValue.type == 5) {
            return (adwb)new advz((float)TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (peekValue.type == 6) {
            return (adwb)new adwh(peekValue.getFraction(1.0f, 1.0f));
        }
        return adwb;
    }
    
    public final adwj e() {
        return new adwj(this);
    }
    
    public final adwk f(final float n) {
        final adwj e = this.e();
        e.f(n);
        return e.a();
    }
    
    public final boolean g(final RectF rectF) {
        final boolean b = this.i.getClass().equals(adwd.class) && this.g.getClass().equals(adwd.class) && this.f.getClass().equals(adwd.class) && this.h.getClass().equals(adwd.class);
        final float a = this.b.a(rectF);
        final boolean b2 = this.c.a(rectF) == a && this.e.a(rectF) == a && this.d.a(rectF) == a;
        final boolean b3 = this.k instanceof adwi && this.j instanceof adwi && this.l instanceof adwi && this.m instanceof adwi;
        return b && b2 && b3;
    }
}
