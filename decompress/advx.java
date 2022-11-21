import com.google.android.material.checkbox.MaterialCheckBox$SavedState;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.Rect;
import android.text.TextUtils;
import android.graphics.Canvas;
import java.util.Iterator;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.os.Build$VERSION;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.widget.CompoundButton;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.Resources;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashSet;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advx extends kc
{
    private static final int e = 2132085199;
    private static final int[] f;
    private static final int[] g;
    private static final int[][] h;
    private static final int i;
    ColorStateList b;
    final ColorStateList c;
    public int[] d;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private final PorterDuff$Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private CompoundButton$OnCheckedChangeListener w;
    private final cke x;
    private final cjy y;
    
    static {
        f = new int[] { 2130970338 };
        g = new int[] { 2130970337 };
        h = new int[][] { { 16842910, 2130970337 }, { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
        i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }
    
    public advx(final Context context, final AttributeSet set) {
        final int e = advx.e;
        super(aecs.a(context, set, 2130968952, e), set);
        new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.x = cke.a(this.getContext(), 2131232316);
        this.y = new advv(this);
        final Context context2 = this.getContext();
        this.p = api.a((CompoundButton)this);
        ColorStateList b = this.b;
        if (b == null) {
            if (super.getButtonTintList() != null) {
                b = super.getButtonTintList();
            }
            else {
                b = null;
            }
        }
        this.b = b;
        final ke a = super.a;
        if (a != null) {
            a.b = true;
            a.a();
        }
        final cdr d = adxy.d(context2, set, advy.a, 2130968952, e, new int[0]);
        this.q = d.k(2);
        if (this.p != null && adxy.c(context2)) {
            final int i = d.i(0, 0);
            final int j = d.i(1, 0);
            if (i == advx.i && j == 0) {
                super.setButtonDrawable((Drawable)null);
                this.p = fc.b(context2, 2131232315);
                this.r = true;
                if (this.q == null) {
                    this.q = fc.b(context2, 2131232317);
                }
            }
        }
        this.c = adzw.s(context2, d, 3);
        this.s = adfe.C(d.f(4, -1), PorterDuff$Mode.SRC_IN);
        this.l = d.p(10, false);
        this.m = d.p(6, true);
        this.n = d.p(9, false);
        this.o = d.m(8);
        if (d.q(7)) {
            this.a(d.f(7, 0));
        }
        d.o();
        this.b();
    }
    
    private final void b() {
        this.p = adfe.G(this.p, this.b, aph.b((CompoundButton)this));
        this.q = adfe.G(this.q, this.c, this.s);
        if (this.r) {
            final cke x = this.x;
            if (x != null) {
                final cjy y = this.y;
                if (y != null) {
                    final Drawable e = x.e;
                    if (e != null) {
                        ckd.c(e, y.a());
                    }
                    final ArrayList c = x.c;
                    if (c != null) {
                        c.remove(y);
                        if (x.c.size() == 0) {
                            final Animator$AnimatorListener b = x.b;
                            if (b != null) {
                                x.a.c.removeListener(b);
                                x.b = null;
                            }
                        }
                    }
                }
                this.x.b(this.y);
            }
            final Drawable p = this.p;
            if (p instanceof AnimatedStateListDrawable) {
                final cke x2 = this.x;
                if (x2 != null) {
                    ((AnimatedStateListDrawable)p).addTransition(2131428181, 2131432219, (Drawable)x2, false);
                    ((AnimatedStateListDrawable)this.p).addTransition(2131429357, 2131432219, (Drawable)this.x, false);
                }
            }
        }
        final Drawable p2 = this.p;
        if (p2 != null) {
            final ColorStateList b2 = this.b;
            if (b2 != null) {
                air.g(p2, b2);
            }
        }
        final Drawable q = this.q;
        if (q != null) {
            final ColorStateList c2 = this.c;
            if (c2 != null) {
                air.g(q, c2);
            }
        }
        final Drawable p3 = this.p;
        final Drawable q2 = this.q;
        LayerDrawable buttonDrawable;
        if (p3 == null) {
            buttonDrawable = (LayerDrawable)q2;
        }
        else {
            buttonDrawable = (LayerDrawable)p3;
            if (q2 != null) {
                buttonDrawable = new LayerDrawable(new Drawable[] { p3, q2 });
                int n;
                int n2;
                if (q2.getIntrinsicWidth() != -1 && q2.getIntrinsicHeight() != -1) {
                    if (q2.getIntrinsicWidth() <= p3.getIntrinsicWidth() && q2.getIntrinsicHeight() <= p3.getIntrinsicHeight()) {
                        n = q2.getIntrinsicWidth();
                        n2 = q2.getIntrinsicHeight();
                    }
                    else {
                        final float n3 = (float)q2.getIntrinsicWidth();
                        final float n4 = (float)q2.getIntrinsicHeight();
                        final float n5 = (float)p3.getIntrinsicWidth();
                        final float n6 = (float)p3.getIntrinsicHeight();
                        final float n7 = n3 / n4;
                        if (n7 >= n5 / n6) {
                            n = p3.getIntrinsicWidth();
                            n2 = (int)(n / n7);
                        }
                        else {
                            n2 = p3.getIntrinsicHeight();
                            n = (int)(n7 * n2);
                        }
                    }
                }
                else {
                    n = p3.getIntrinsicWidth();
                    n2 = p3.getIntrinsicHeight();
                }
                buttonDrawable.setLayerSize(1, n, n2);
                buttonDrawable.setLayerGravity(1, 17);
            }
        }
        super.setButtonDrawable((Drawable)buttonDrawable);
        this.refreshDrawableState();
    }
    
    private final void c() {
        if (Build$VERSION.SDK_INT >= 30 && this.v == null) {
            final int t = this.t;
            String stateDescription;
            if (t == 1) {
                stateDescription = this.getResources().getString(2132018707);
            }
            else if (t == 0) {
                stateDescription = this.getResources().getString(2132018709);
            }
            else {
                stateDescription = this.getResources().getString(2132018708);
            }
            super.setStateDescription((CharSequence)stateDescription);
        }
    }
    
    public final void a(final int t) {
        if (this.t != t) {
            this.t = t;
            super.setChecked(t == 1);
            this.refreshDrawableState();
            this.c();
            if (this.u) {
                return;
            }
            this.u = true;
            final LinkedHashSet j = this.j;
            if (j != null) {
                final Iterator iterator = j.iterator();
                while (iterator.hasNext()) {
                    ((advw)iterator.next()).a();
                }
            }
            if (this.t != 2) {
                final CompoundButton$OnCheckedChangeListener w = this.w;
                if (w != null) {
                    w.onCheckedChanged((CompoundButton)this, this.isChecked());
                }
            }
            final AutofillManager autofillManager = (AutofillManager)this.getContext().getSystemService((Class)AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged((View)this);
            }
            this.u = false;
        }
    }
    
    public final Drawable getButtonDrawable() {
        return this.p;
    }
    
    public final ColorStateList getButtonTintList() {
        return this.b;
    }
    
    public final boolean isChecked() {
        return this.t == 1;
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            if (this.k == null) {
                final int[][] h = advx.h;
                final int length = h.length;
                final int l = adfe.L((View)this, 2130969041);
                final int i = adfe.L((View)this, 2130969045);
                final int j = adfe.L((View)this, 2130969107);
                final int k = adfe.L((View)this, 2130969071);
                this.k = new ColorStateList(h, new int[] { adfe.N(j, i, 1.0f), adfe.N(j, l, 1.0f), adfe.N(j, k, 0.54f), adfe.N(j, k, 0.38f), adfe.N(j, k, 0.38f) });
            }
            aph.c((CompoundButton)this, this.k);
        }
    }
    
    protected final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 2);
        if (this.t == 2) {
            mergeDrawableStates(onCreateDrawableState, advx.f);
        }
        if (this.n) {
            mergeDrawableStates(onCreateDrawableState, advx.g);
        }
        this.d = adfe.J(onCreateDrawableState);
        return onCreateDrawableState;
    }
    
    protected final void onDraw(final Canvas canvas) {
        if (this.m && TextUtils.isEmpty(this.getText())) {
            final Drawable a = api.a((CompoundButton)this);
            if (a != null) {
                final boolean d = adfe.D((View)this);
                int n = 1;
                if (d) {
                    n = -1;
                }
                final int width = this.getWidth();
                final int intrinsicWidth = a.getIntrinsicWidth();
                final int save = canvas.save();
                final int n2 = (width - intrinsicWidth) / 2 * n;
                canvas.translate((float)n2, 0.0f);
                super.onDraw(canvas);
                canvas.restoreToCount(save);
                if (this.getBackground() != null) {
                    final Rect bounds = a.getBounds();
                    air.e(this.getBackground(), bounds.left + n2, bounds.top, bounds.right + n2, bounds.bottom);
                }
                return;
            }
        }
        super.onDraw(canvas);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo == null) {
            return;
        }
        if (this.n) {
            final String value = String.valueOf(accessibilityNodeInfo.getText());
            final String value2 = String.valueOf(this.o);
            final StringBuilder sb = new StringBuilder();
            sb.append(value);
            sb.append(", ");
            sb.append(value2);
            accessibilityNodeInfo.setText((CharSequence)sb.toString());
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof MaterialCheckBox$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final MaterialCheckBox$SavedState materialCheckBox$SavedState = (MaterialCheckBox$SavedState)parcelable;
        super.onRestoreInstanceState(materialCheckBox$SavedState.getSuperState());
        this.a(materialCheckBox$SavedState.a);
    }
    
    public final Parcelable onSaveInstanceState() {
        final MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.a = this.t;
        return (Parcelable)materialCheckBox$SavedState;
    }
    
    public final void setButtonDrawable(final int n) {
        this.setButtonDrawable(fc.b(this.getContext(), n));
    }
    
    public final void setButtonDrawable(final Drawable p) {
        this.p = p;
        this.r = false;
        this.b();
    }
    
    public final void setButtonTintList(final ColorStateList b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        this.b();
    }
    
    public final void setButtonTintMode(final PorterDuff$Mode a) {
        final ke a2 = super.a;
        if (a2 != null) {
            a2.a = a;
            a2.c = true;
            a2.a();
        }
        this.b();
    }
    
    public final void setChecked(final boolean b) {
        this.a(b ? 1 : 0);
    }
    
    public final void setOnCheckedChangeListener(final CompoundButton$OnCheckedChangeListener w) {
        this.w = w;
    }
    
    public final void setStateDescription(final CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            this.c();
            return;
        }
        super.setStateDescription(charSequence);
    }
    
    public final void toggle() {
        this.a((this.isChecked() ^ true) ? 1 : 0);
    }
}
