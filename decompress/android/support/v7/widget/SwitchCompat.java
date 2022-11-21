// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.text.InputFilter;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Region$Op;
import android.view.ActionMode$Callback;
import android.text.TextUtils;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable$Callback;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.PorterDuff$Mode;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.text.Layout;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.view.VelocityTracker;
import android.util.Property;
import android.widget.CompoundButton;

public class SwitchCompat extends CompoundButton
{
    private static final Property f;
    private static final int[] g;
    private float A;
    private VelocityTracker B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private boolean K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    private final ld Q;
    private kh R;
    private final Rect S;
    public Drawable a;
    public ColorStateList b;
    public boolean c;
    public float d;
    ObjectAnimator e;
    private ColorStateList h;
    private PorterDuff$Mode i;
    private boolean j;
    private boolean k;
    private Drawable l;
    private PorterDuff$Mode m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private CharSequence s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private boolean w;
    private int x;
    private int y;
    private float z;
    
    static {
        f = (Property)new pl((Class)Float.class);
        g = new int[] { 16842912 };
    }
    
    public SwitchCompat(final Context context) {
        this(context, null);
    }
    
    public SwitchCompat(final Context context, final AttributeSet set) {
        this(context, set, 2130970508);
    }
    
    public SwitchCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = false;
        this.b = null;
        this.m = null;
        this.c = false;
        this.n = false;
        this.B = VelocityTracker.obtain();
        boolean fakeBoldText = true;
        this.K = true;
        this.S = new Rect();
        pn.d((View)this, this.getContext());
        final TextPaint l = new TextPaint(1);
        this.L = l;
        l.density = this.getResources().getDisplayMetrics().density;
        final cdr w = cdr.w(context, set, gm.w, n, 0);
        anc.M((View)this, context, gm.w, set, (TypedArray)w.a, n, 0);
        final Drawable k = w.k(2);
        this.a = k;
        if (k != null) {
            k.setCallback((Drawable$Callback)this);
        }
        final Drawable i = w.k(11);
        if ((this.l = i) != null) {
            i.setCallback((Drawable$Callback)this);
        }
        this.f(w.m(0));
        this.e(w.m(1));
        this.w = w.p(3, true);
        this.o = w.e(8, 0);
        this.p = w.e(5, 0);
        this.q = w.e(6, 0);
        this.r = w.p(4, false);
        final ColorStateList j = w.j(9);
        if (j != null) {
            this.h = j;
            this.j = true;
        }
        final PorterDuff$Mode a = mc.a(w.f(10, -1), (PorterDuff$Mode)null);
        if (this.i != a) {
            this.i = a;
            this.k = true;
        }
        final boolean m = this.j;
        if (m || this.k) {
            final Drawable a2 = this.a;
            if (a2 != null && (m || this.k)) {
                final Drawable mutate = a2.mutate();
                this.a = mutate;
                if (this.j) {
                    air.g(mutate, this.h);
                }
                if (this.k) {
                    air.h(this.a, this.i);
                }
                if (this.a.isStateful()) {
                    this.a.setState(this.getDrawableState());
                }
            }
        }
        final ColorStateList j2 = w.j(12);
        if (j2 != null) {
            this.b = j2;
            this.c = true;
        }
        final PorterDuff$Mode a3 = mc.a(w.f(13, -1), (PorterDuff$Mode)null);
        if (this.m != a3) {
            this.m = a3;
            this.n = true;
        }
        if (this.c || this.n) {
            this.a();
        }
        final int i2 = w.i(7, 0);
        if (i2 != 0) {
            final cdr u = cdr.u(context, i2, gm.x);
            final ColorStateList j3 = u.j(3);
            if (j3 != null) {
                this.M = j3;
            }
            else {
                this.M = this.getTextColors();
            }
            final int e = u.e(0, 0);
            if (e != 0) {
                final float textSize = l.getTextSize();
                final float textSize2 = (float)e;
                if (textSize2 != textSize) {
                    l.setTextSize(textSize2);
                    this.requestLayout();
                }
            }
            final int f = u.f(1, -1);
            final int f2 = u.f(2, -1);
            Typeface typeface;
            if (f != 1) {
                if (f != 2) {
                    if (f != 3) {
                        typeface = null;
                    }
                    else {
                        typeface = Typeface.MONOSPACE;
                    }
                }
                else {
                    typeface = Typeface.SERIF;
                }
            }
            else {
                typeface = Typeface.SANS_SERIF;
            }
            float textSkewX = 0.0f;
            if (f2 > 0) {
                Typeface typeface2;
                if (typeface == null) {
                    typeface2 = Typeface.defaultFromStyle(f2);
                }
                else {
                    typeface2 = Typeface.create(typeface, f2);
                }
                this.d(typeface2);
                int style;
                if (typeface2 != null) {
                    style = typeface2.getStyle();
                }
                else {
                    style = 0;
                }
                final int n2 = ~style & f2;
                if (0x1 != (n2 & 0x1)) {
                    fakeBoldText = false;
                }
                l.setFakeBoldText(fakeBoldText);
                if ((n2 & 0x2) != 0x0) {
                    textSkewX = -0.25f;
                }
                l.setTextSkewX(textSkewX);
            }
            else {
                l.setFakeBoldText(false);
                l.setTextSkewX(0.0f);
                this.d(typeface);
            }
            if (u.p(14, false)) {
                this.P = (TransformationMethod)new gt(this.getContext());
            }
            else {
                this.P = null;
            }
            this.f(this.s);
            this.e(this.u);
            u.o();
        }
        (this.Q = new ld((TextView)this)).g(set, n);
        w.o();
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.y = value.getScaledTouchSlop();
        this.C = value.getScaledMinimumFlingVelocity();
        this.j().a(set, n);
        this.refreshDrawableState();
        this.setChecked(this.isChecked());
    }
    
    private final int h() {
        float d;
        if (qc.b((View)this)) {
            d = 1.0f - this.d;
        }
        else {
            d = this.d;
        }
        return (int)(d * this.i() + 0.5f);
    }
    
    private final int i() {
        final Drawable l = this.l;
        if (l != null) {
            final Rect s = this.S;
            l.getPadding(s);
            final Drawable a = this.a;
            Rect rect;
            if (a != null) {
                rect = mc.b(a);
            }
            else {
                rect = mc.a;
            }
            return this.D - this.F - s.left - s.right - rect.left - rect.right;
        }
        return 0;
    }
    
    private final kh j() {
        if (this.R == null) {
            this.R = new kh((TextView)this);
        }
        return this.R;
    }
    
    private final Layout k(final CharSequence charSequence) {
        final TextPaint l = this.L;
        int n;
        if (charSequence != null) {
            n = (int)Math.ceil(Layout.getDesiredWidth(charSequence, l));
        }
        else {
            n = 0;
        }
        return (Layout)new StaticLayout(charSequence, l, n, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }
    
    private final CharSequence l(final CharSequence charSequence) {
        final kh j = this.j();
        final TransformationMethod p = this.P;
        final Object b = j.b;
        asx.e();
        CharSequence transformation = charSequence;
        if (p != null) {
            transformation = p.getTransformation(charSequence, (View)this);
        }
        return transformation;
    }
    
    private final void m() {
        if (!this.R.c()) {
            return;
        }
        final asp a = asp.a;
    }
    
    private final boolean n() {
        return this.d > 0.5f;
    }
    
    public final void a() {
        final Drawable l = this.l;
        if (l != null && (this.c || this.n)) {
            final Drawable mutate = l.mutate();
            this.l = mutate;
            if (this.c) {
                air.g(mutate, this.b);
            }
            if (this.n) {
                air.h(this.l, this.m);
            }
            if (this.l.isStateful()) {
                this.l.setState(this.getDrawableState());
            }
        }
    }
    
    public final void b() {
        if (Build$VERSION.SDK_INT >= 30) {
            CharSequence charSequence;
            if ((charSequence = this.u) == null) {
                charSequence = this.getResources().getString(2132017175);
            }
            anc.ac((View)this, charSequence);
        }
    }
    
    public final void c() {
        if (Build$VERSION.SDK_INT >= 30) {
            CharSequence charSequence;
            if ((charSequence = this.s) == null) {
                charSequence = this.getResources().getString(2132017176);
            }
            anc.ac((View)this, charSequence);
        }
    }
    
    public final void d(final Typeface typeface) {
        if ((this.L.getTypeface() != null && !this.L.getTypeface().equals((Object)typeface)) || (this.L.getTypeface() == null && typeface != null)) {
            this.L.setTypeface(typeface);
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public final void draw(final Canvas canvas) {
        final Rect s = this.S;
        int g = this.G;
        final int h = this.H;
        int i = this.I;
        final int j = this.J;
        final int n = this.h() + g;
        final Drawable a = this.a;
        Rect rect;
        if (a != null) {
            rect = mc.b(a);
        }
        else {
            rect = mc.a;
        }
        final Drawable l = this.l;
        int n2 = n;
        if (l != null) {
            l.getPadding(s);
            final int n3 = n + s.left;
            int n5 = 0;
            int n6 = 0;
            int n9 = 0;
            Label_0259: {
                int n7;
                if (rect != null) {
                    int n4 = g;
                    if (rect.left > s.left) {
                        n4 = g + (rect.left - s.left);
                    }
                    if (rect.top > s.top) {
                        n5 = rect.top - s.top + h;
                    }
                    else {
                        n5 = h;
                    }
                    n6 = i;
                    if (rect.right > s.right) {
                        n6 = i - (rect.right - s.right);
                    }
                    g = n4;
                    i = n6;
                    n7 = n5;
                    if (rect.bottom > s.bottom) {
                        final int n8 = j - (rect.bottom - s.bottom);
                        g = n4;
                        n9 = n8;
                        break Label_0259;
                    }
                }
                else {
                    n7 = h;
                }
                n9 = j;
                n5 = n7;
                n6 = i;
            }
            this.l.setBounds(g, n5, n6, n9);
            n2 = n3;
        }
        final Drawable a2 = this.a;
        if (a2 != null) {
            a2.getPadding(s);
            final int n10 = n2 - s.left;
            final int n11 = n2 + this.F + s.right;
            this.a.setBounds(n10, h, n11, j);
            final Drawable background = this.getBackground();
            if (background != null) {
                air.e(background, n10, h, n11, j);
            }
        }
        super.draw(canvas);
    }
    
    public final void drawableHotspotChanged(final float n, final float n2) {
        super.drawableHotspotChanged(n, n2);
        final Drawable a = this.a;
        if (a != null) {
            air.d(a, n, n2);
        }
        final Drawable l = this.l;
        if (l != null) {
            air.d(l, n, n2);
        }
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable a = this.a;
        int setState;
        final int n = setState = 0;
        if (a != null) {
            setState = n;
            if (a.isStateful()) {
                setState = (a.setState(drawableState) ? 1 : 0);
            }
        }
        final Drawable l = this.l;
        int n2 = setState;
        if (l != null) {
            n2 = setState;
            if (l.isStateful()) {
                n2 = (setState | (l.setState(drawableState) ? 1 : 0));
            }
        }
        if (n2 != 0) {
            this.invalidate();
        }
    }
    
    public final void e(final CharSequence u) {
        this.u = u;
        this.v = this.l(u);
        this.O = null;
        if (this.w) {
            this.m();
        }
    }
    
    public final void f(final CharSequence s) {
        this.s = s;
        this.t = this.l(s);
        this.N = null;
        if (this.w) {
            this.m();
        }
    }
    
    public final void g(final float d) {
        this.d = d;
        this.invalidate();
    }
    
    public final int getCompoundPaddingLeft() {
        if (!qc.b((View)this)) {
            return super.getCompoundPaddingLeft();
        }
        int n = super.getCompoundPaddingLeft() + this.D;
        if (!TextUtils.isEmpty(this.getText())) {
            n += this.q;
        }
        return n;
    }
    
    public final int getCompoundPaddingRight() {
        if (qc.b((View)this)) {
            return super.getCompoundPaddingRight();
        }
        int n = super.getCompoundPaddingRight() + this.D;
        if (!TextUtils.isEmpty(this.getText())) {
            n += this.q;
        }
        return n;
    }
    
    public final ActionMode$Callback getCustomSelectionActionModeCallback() {
        return apj.b(super.getCustomSelectionActionModeCallback());
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable a = this.a;
        if (a != null) {
            a.jumpToCurrentState();
        }
        final Drawable l = this.l;
        if (l != null) {
            l.jumpToCurrentState();
        }
        final ObjectAnimator e = this.e;
        if (e != null && e.isStarted()) {
            this.e.end();
            this.e = null;
        }
    }
    
    protected final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        if (this.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, SwitchCompat.g);
        }
        return onCreateDrawableState;
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Rect s = this.S;
        final Drawable l = this.l;
        if (l != null) {
            l.getPadding(s);
        }
        else {
            s.setEmpty();
        }
        final int h = this.H;
        final int j = this.J;
        final int top = s.top;
        final int bottom = s.bottom;
        final Drawable a = this.a;
        if (l != null) {
            if (this.r && a != null) {
                final Rect b = mc.b(a);
                a.copyBounds(s);
                s.left += b.left;
                s.right -= b.right;
                final int save = canvas.save();
                canvas.clipRect(s, Region$Op.DIFFERENCE);
                l.draw(canvas);
                canvas.restoreToCount(save);
            }
            else {
                l.draw(canvas);
            }
        }
        final int save2 = canvas.save();
        if (a != null) {
            a.draw(canvas);
        }
        Layout layout;
        if (this.n()) {
            layout = this.N;
        }
        else {
            layout = this.O;
        }
        if (layout != null) {
            final int[] drawableState = this.getDrawableState();
            final ColorStateList m = this.M;
            if (m != null) {
                this.L.setColor(m.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            int width;
            if (a != null) {
                final Rect bounds = a.getBounds();
                width = bounds.left + bounds.right;
            }
            else {
                width = this.getWidth();
            }
            canvas.translate((float)(width / 2 - layout.getWidth() / 2), (float)((h + top + (j - bottom)) / 2 - layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"android.widget.Switch");
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.widget.Switch");
        if (Build$VERSION.SDK_INT < 30) {
            CharSequence text;
            if (this.isChecked()) {
                text = this.s;
            }
            else {
                text = this.u;
            }
            if (!TextUtils.isEmpty(text)) {
                final CharSequence text2 = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text2)) {
                    accessibilityNodeInfo.setText(text);
                    return;
                }
                final StringBuilder text3 = new StringBuilder();
                text3.append(text2);
                text3.append(' ');
                text3.append(text);
                accessibilityNodeInfo.setText((CharSequence)text3);
            }
        }
    }
    
    protected final void onLayout(final boolean b, int h, int max, int i, int j) {
        super.onLayout(b, h, max, i, j);
        final Drawable a = this.a;
        max = 0;
        if (a != null) {
            final Rect s = this.S;
            final Drawable l = this.l;
            if (l != null) {
                l.getPadding(s);
            }
            else {
                s.setEmpty();
            }
            final Rect b2 = mc.b(this.a);
            h = Math.max(0, b2.left - s.left);
            max = Math.max(0, b2.right - s.right);
        }
        else {
            h = 0;
        }
        if (qc.b((View)this)) {
            i = this.getPaddingLeft() + h;
            h = this.D + i - h - max;
            max = i;
            i = h;
        }
        else {
            i = this.getWidth() - this.getPaddingRight() - max;
            max += i - this.D + h;
        }
        h = (this.getGravity() & 0x70);
        Label_0264: {
            if (h != 16) {
                if (h == 80) {
                    j = this.getHeight() - this.getPaddingBottom();
                    h = j - this.E;
                    break Label_0264;
                }
                h = this.getPaddingTop();
                j = this.E;
            }
            else {
                h = this.getPaddingTop();
                final int height = this.getHeight();
                final int paddingBottom = this.getPaddingBottom();
                j = this.E;
                h = (h + height - paddingBottom) / 2 - j / 2;
            }
            j += h;
        }
        this.G = max;
        this.H = h;
        this.J = j;
        this.I = i;
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (this.w) {
            if (this.N == null) {
                this.N = this.k(this.t);
            }
            if (this.O == null) {
                this.O = this.k(this.v);
            }
        }
        final Rect s = this.S;
        final Drawable a = this.a;
        final int n3 = 0;
        int n4;
        int intrinsicHeight;
        if (a != null) {
            a.getPadding(s);
            n4 = this.a.getIntrinsicWidth() - s.left - s.right;
            intrinsicHeight = this.a.getIntrinsicHeight();
        }
        else {
            n4 = 0;
            intrinsicHeight = 0;
        }
        int n5;
        if (this.w) {
            final int max = Math.max(this.N.getWidth(), this.O.getWidth());
            final int o = this.o;
            n5 = max + (o + o);
        }
        else {
            n5 = 0;
        }
        this.F = Math.max(n5, n4);
        final Drawable l = this.l;
        int intrinsicHeight2;
        if (l != null) {
            l.getPadding(s);
            intrinsicHeight2 = this.l.getIntrinsicHeight();
        }
        else {
            s.setEmpty();
            intrinsicHeight2 = n3;
        }
        final int left = s.left;
        final int right = s.right;
        final Drawable a2 = this.a;
        int max2 = right;
        int max3 = left;
        if (a2 != null) {
            final Rect b = mc.b(a2);
            max3 = Math.max(left, b.left);
            max2 = Math.max(right, b.right);
        }
        int d;
        if (this.K) {
            final int p2 = this.p;
            final int f = this.F;
            d = Math.max(p2, f + f + max3 + max2);
        }
        else {
            d = this.p;
        }
        final int max4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.D = d;
        this.E = max4;
        super.onMeasure(n, n2);
        if (this.getMeasuredHeight() < max4) {
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), max4);
        }
    }
    
    public final void onPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence;
        if (this.isChecked()) {
            charSequence = this.s;
        }
        else {
            charSequence = this.u;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        this.B.addMovement(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            final float n = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
                else {
                    final int x = this.x;
                    if (x != 1) {
                        if (x != 2) {
                            return super.onTouchEvent(motionEvent);
                        }
                        final float x2 = motionEvent.getX();
                        final int i = this.i();
                        final float n2 = x2 - this.z;
                        float n3;
                        if (i != 0) {
                            n3 = n2 / i;
                        }
                        else if (n2 > 0.0f) {
                            n3 = 1.0f;
                        }
                        else {
                            n3 = -1.0f;
                        }
                        float n4 = n3;
                        if (qc.b((View)this)) {
                            n4 = -n3;
                        }
                        final float d = this.d;
                        float n5 = n4 + d;
                        if (n5 < 0.0f) {
                            n5 = n;
                        }
                        else if (n5 > 1.0f) {
                            n5 = 1.0f;
                        }
                        if (n5 != d) {
                            this.z = x2;
                            this.g(n5);
                        }
                        return true;
                    }
                    else {
                        final float x3 = motionEvent.getX();
                        final float y = motionEvent.getY();
                        if (Math.abs(x3 - this.z) > this.y || Math.abs(y - this.A) > this.y) {
                            this.x = 2;
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                            this.z = x3;
                            this.A = y;
                            return true;
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            if (this.x == 2) {
                this.x = 0;
                final boolean b = motionEvent.getAction() == 1 && this.isEnabled();
                final boolean checked = this.isChecked();
                boolean n6;
                if (b) {
                    this.B.computeCurrentVelocity(1000);
                    final float xVelocity = this.B.getXVelocity();
                    if (Math.abs(xVelocity) > this.C) {
                        n6 = (qc.b((View)this) ? (xVelocity < 0.0f) : (xVelocity > 0.0f));
                    }
                    else {
                        n6 = this.n();
                    }
                }
                else {
                    n6 = checked;
                }
                if (n6 != checked) {
                    this.playSoundEffect(0);
                }
                this.setChecked(n6);
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.x = 0;
            this.B.clear();
        }
        else {
            final float x4 = motionEvent.getX();
            final float y2 = motionEvent.getY();
            if (this.isEnabled()) {
                if (this.a != null) {
                    final int h = this.h();
                    this.a.getPadding(this.S);
                    final int h2 = this.H;
                    final int y3 = this.y;
                    final int n7 = this.G + h - y3;
                    final int f = this.F;
                    final int left = this.S.left;
                    final int right = this.S.right;
                    final int y4 = this.y;
                    final int j = this.J;
                    if (x4 > n7 && x4 < f + n7 + left + right + y4 && y2 > h2 - y3 && y2 < j + y4) {
                        this.x = 1;
                        this.z = x4;
                        this.A = y2;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.j();
        asx.e();
    }
    
    public final void setChecked(final boolean checked) {
        super.setChecked(checked);
        final boolean checked2 = this.isChecked();
        if (checked2) {
            this.c();
        }
        else {
            this.b();
        }
        final IBinder windowToken = this.getWindowToken();
        float n = 0.0f;
        final float n2 = 0.0f;
        if (windowToken != null && anc.ao((View)this)) {
            float n3;
            if (!checked2) {
                n3 = n2;
            }
            else {
                n3 = 1.0f;
            }
            (this.e = ObjectAnimator.ofFloat((Object)this, SwitchCompat.f, new float[] { n3 })).setDuration(250L);
            pm.a(this.e, true);
            this.e.start();
            return;
        }
        final ObjectAnimator e = this.e;
        if (e != null) {
            e.cancel();
        }
        if (checked2) {
            n = 1.0f;
        }
        this.g(n);
    }
    
    public final void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(apj.c((TextView)this, actionMode$Callback));
    }
    
    public final void setFilters(final InputFilter[] filters) {
        this.j();
        asx.e();
        super.setFilters(filters);
    }
    
    public final void toggle() {
        this.setChecked(this.isChecked() ^ true);
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.l;
    }
}
