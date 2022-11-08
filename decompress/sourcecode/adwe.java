import android.graphics.drawable.Drawable;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwe extends Drawable$ConstantState
{
    public adwk a;
    public adsk b;
    public ColorFilter c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public ColorStateList g;
    public PorterDuff$Mode h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public int m;
    public float n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public Paint$Style v;
    
    public adwe(final adwe adwe) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff$Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint$Style.FILL_AND_STROKE;
        this.a = adwe.a;
        this.b = adwe.b;
        this.l = adwe.l;
        this.c = adwe.c;
        this.d = adwe.d;
        this.e = adwe.e;
        this.h = adwe.h;
        this.g = adwe.g;
        this.m = adwe.m;
        this.j = adwe.j;
        this.s = adwe.s;
        this.q = adwe.q;
        final boolean u = adwe.u;
        this.u = false;
        this.k = adwe.k;
        this.n = adwe.n;
        this.o = adwe.o;
        final float p = adwe.p;
        this.p = 0.0f;
        this.r = adwe.r;
        this.t = adwe.t;
        final ColorStateList f = adwe.f;
        this.f = null;
        this.v = adwe.v;
        final Rect i = adwe.i;
        if (i != null) {
            this.i = new Rect(i);
        }
    }
    
    public adwe(final adwk a) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff$Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint$Style.FILL_AND_STROKE;
        this.a = a;
        this.b = null;
    }
    
    public final int getChangingConfigurations() {
        return 0;
    }
    
    public final Drawable newDrawable() {
        final adwf adwf = new adwf(this);
        adwf.e = true;
        return (Drawable)adwf;
    }
}
