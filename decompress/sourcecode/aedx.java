import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.os.Build$VERSION;
import android.widget.TextView;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.setupcompat.internal.TemplateLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aedx implements aedi
{
    public final TemplateLayout a;
    public boolean b;
    public float c;
    public float d;
    public int e;
    private float f;
    
    public aedx(final TemplateLayout a, final AttributeSet set, final int n) {
        this.b = false;
        this.a = a;
        final TypedArray obtainStyledAttributes = a.getContext().obtainStyledAttributes(set, aedq.a, n, 0);
        final CharSequence text = obtainStyledAttributes.getText(4);
        final ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(5);
        obtainStyledAttributes.recycle();
        this.c();
        if (text != null) {
            final TextView a2 = this.a();
            if (a2 != null) {
                if (this.b) {
                    this.b(a2);
                }
                a2.setText(text);
            }
        }
        if (colorStateList != null) {
            final TextView a3 = this.a();
            if (a3 != null) {
                a3.setTextColor(colorStateList);
            }
        }
    }
    
    public final TextView a() {
        return (TextView)this.a.h(2131431831);
    }
    
    public final void b(final TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, this.f);
        if (Build$VERSION.SDK_INT >= 28) {
            textView.setLineHeight(Math.round(this.d + this.f));
        }
        textView.setMaxLines(6);
        textView.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new jjk(this, textView, 3));
    }
    
    public final void c() {
        final Context context = this.a.getContext();
        if (!aeda.m((View)this.a)) {
            this.b = false;
            return;
        }
        if (aedd.f(context).l(aedb.Y)) {
            this.b = aedd.f(context).j(context, aedb.Y, this.b);
        }
        if (!this.b) {
            return;
        }
        if (aedd.f(context).l(aedb.Z)) {
            this.f = aedd.f(context).a(context, aedb.Z);
        }
        if (aedd.f(context).l(aedb.aa)) {
            this.c = aedd.f(context).a(context, aedb.aa);
        }
        if (aedd.f(context).l(aedb.ac)) {
            this.d = aedd.f(context).a(context, aedb.ac);
        }
        if (aedd.f(context).l(aedb.ab)) {
            this.e = aedd.f(context).q(context, aedb.ab);
        }
        if (this.e > 0) {
            final float c = this.c;
            if (c > 0.0f) {
                if (this.f >= c) {
                    return;
                }
            }
        }
        Log.w("HeaderMixin", "Invalid configs, disable auto text size.");
        this.b = false;
    }
}
