import java.util.Arrays;
import android.util.DisplayMetrics;
import android.graphics.PorterDuff$Mode;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.util.AttributeSet;
import android.content.res.Resources$NotFoundException;
import android.util.TypedValue;
import android.content.res.TypedArray;
import java.lang.ref.WeakReference;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.Context;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lc
{
    public int a;
    public Typeface b;
    public boolean c;
    public ajk d;
    private final TextView e;
    private final ll f;
    private int g;
    private ajk h;
    private ajk i;
    private ajk j;
    private ajk k;
    private ajk l;
    private ajk m;
    
    public lc(final TextView e) {
        this.a = 0;
        this.g = -1;
        this.e = e;
        this.f = new ll(e);
    }
    
    public static final void r(final TextView textView, final InputConnection inputConnection, final EditorInfo editorInfo) {
        if (Build$VERSION.SDK_INT < 30 && inputConnection != null) {
            final CharSequence text = textView.getText();
            if (Build$VERSION.SDK_INT < 30) {
                aff.k((Object)text);
                if (Build$VERSION.SDK_INT >= 30) {
                    afv.b(editorInfo, text);
                    return;
                }
                int n;
                if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                    n = editorInfo.initialSelEnd;
                }
                else {
                    n = editorInfo.initialSelStart;
                }
                int n2;
                if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                    n2 = editorInfo.initialSelStart;
                }
                else {
                    n2 = editorInfo.initialSelEnd;
                }
                final int length = text.length();
                if (n < 0 || n2 > length) {
                    afw.b(editorInfo, null, 0, 0);
                    return;
                }
                final int n3 = editorInfo.inputType & 0xFFF;
                if (n3 == 129 || n3 == 225 || n3 == 18) {
                    afw.b(editorInfo, null, 0, 0);
                    return;
                }
                if (length > 2048) {
                    final int n4 = n2 - n;
                    int n5;
                    if (n4 > 1024) {
                        n5 = 0;
                    }
                    else {
                        n5 = n4;
                    }
                    final int n6 = 2048 - n5;
                    final int length2 = text.length();
                    final double n7 = n6;
                    Double.isNaN(n7);
                    final int min = Math.min(length2 - n2, n6 - Math.min(n, (int)(n7 * 0.8)));
                    final int min2 = Math.min(n, n6 - min);
                    final int n8 = n - min2;
                    int n9 = min2;
                    int n10 = n8;
                    if (afw.c(text, n8, 0)) {
                        n10 = n8 + 1;
                        n9 = min2 - 1;
                    }
                    int n11 = min;
                    if (afw.c(text, n2 + min - 1, 1)) {
                        n11 = min - 1;
                    }
                    final int n12 = n9 + n5;
                    CharSequence charSequence;
                    if (n5 != n4) {
                        charSequence = TextUtils.concat(new CharSequence[] { text.subSequence(n10, n10 + n9), text.subSequence(n2, n11 + n2) });
                    }
                    else {
                        charSequence = text.subSequence(n10, n12 + n11 + n10);
                    }
                    afw.b(editorInfo, charSequence, n9, n12);
                    return;
                }
                afw.b(editorInfo, text, n, n2);
            }
            else {
                afv.b(editorInfo, text);
            }
        }
    }
    
    private static ajk s(final Context context, final kf kf, final int n) {
        final ColorStateList a = kf.a(context, n);
        if (a != null) {
            final ajk ajk = new ajk();
            ajk.c = true;
            ajk.d = a;
            return ajk;
        }
        return null;
    }
    
    private final void t(final Drawable drawable, final ajk ajk) {
        if (drawable != null && ajk != null) {
            or.h(drawable, ajk, this.e.getDrawableState());
        }
    }
    
    private final void u(final Context context, final cdn cdn) {
        final int[] a = gl.a;
        this.a = cdn.f(2, this.a);
        if (Build$VERSION.SDK_INT >= 28 && (this.g = cdn.f(11, -1)) != -1) {
            this.a &= 0x2;
        }
        int n = 10;
        final boolean q = cdn.q(10);
        final boolean b = false;
        if (!q && !cdn.q(12)) {
            if (cdn.q(1)) {
                this.c = false;
                final int f = cdn.f(1, 1);
                if (f != 1) {
                    if (f == 2) {
                        this.b = Typeface.SERIF;
                        return;
                    }
                    if (f == 3) {
                        this.b = Typeface.MONOSPACE;
                    }
                }
                else {
                    this.b = Typeface.SANS_SERIF;
                }
            }
            return;
        }
        final Typeface typeface = null;
        this.b = null;
        if (cdn.q(12)) {
            n = 12;
        }
        final int g = this.g;
        final int a2 = this.a;
        if (!context.isRestricted()) {
            final kx kx = new kx(this, g, a2, new WeakReference((T)this.e));
            try {
                final int a3 = this.a;
                final int resourceId = ((TypedArray)cdn.a).getResourceId(n, 0);
                Typeface e;
                if (resourceId == 0) {
                    e = typeface;
                }
                else {
                    if (cdn.c == null) {
                        cdn.c = new TypedValue();
                    }
                    e = ahu.e((Context)cdn.b, resourceId, (TypedValue)cdn.c, a3, (ahr)kx);
                }
                if (e != null) {
                    if (Build$VERSION.SDK_INT >= 28 && this.g != -1) {
                        this.b = lb.a(Typeface.create(e, 0), this.g, (this.a & 0x2) != 0x0);
                    }
                    else {
                        this.b = e;
                    }
                }
                this.c = (this.b == null);
            }
            catch (final UnsupportedOperationException | Resources$NotFoundException ex) {}
        }
        if (this.b == null) {
            final String n2 = cdn.n(n);
            if (n2 != null) {
                if (Build$VERSION.SDK_INT >= 28 && this.g != -1) {
                    final Typeface create = Typeface.create(n2, 0);
                    final int g2 = this.g;
                    boolean b2 = b;
                    if ((this.a & 0x2) != 0x0) {
                        b2 = true;
                    }
                    this.b = lb.a(create, g2, b2);
                    return;
                }
                this.b = Typeface.create(n2, this.a);
            }
        }
    }
    
    public final int a() {
        return this.f.a();
    }
    
    public final int b() {
        return this.f.b();
    }
    
    public final int c() {
        return this.f.c();
    }
    
    public final int d() {
        return this.f.a;
    }
    
    public final void e() {
        if (this.h != null || this.i != null || this.j != null || this.k != null) {
            final Drawable[] compoundDrawables = this.e.getCompoundDrawables();
            this.t(compoundDrawables[0], this.h);
            this.t(compoundDrawables[1], this.i);
            this.t(compoundDrawables[2], this.j);
            this.t(compoundDrawables[3], this.k);
        }
        if (this.l == null && this.m == null) {
            return;
        }
        final Drawable[] c = ky.c(this.e);
        this.t(c[0], this.l);
        this.t(c[2], this.m);
    }
    
    public final void f() {
        this.f.e();
    }
    
    public final void g(final AttributeSet set, int i) {
        final Context context = this.e.getContext();
        final kf d = kf.d();
        final cdn w = cdn.w(context, set, gl.h, i, 0);
        final TextView e = this.e;
        ana.M((View)e, e.getContext(), gl.h, set, (TypedArray)w.a, i, 0);
        final int j = w.i(0, -1);
        if (w.q(3)) {
            this.h = s(context, d, w.i(3, 0));
        }
        if (w.q(1)) {
            this.i = s(context, d, w.i(1, 0));
        }
        if (w.q(4)) {
            this.j = s(context, d, w.i(4, 0));
        }
        if (w.q(2)) {
            this.k = s(context, d, w.i(2, 0));
        }
        if (w.q(5)) {
            this.l = s(context, d, w.i(5, 0));
        }
        if (w.q(6)) {
            this.m = s(context, d, w.i(6, 0));
        }
        w.o();
        final boolean b = this.e.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean p2;
        boolean b2;
        String n3;
        String n4;
        if (j != -1) {
            final cdn u = cdn.u(context, j, gl.x);
            if (!b && u.q(14)) {
                p2 = u.p(14, false);
                b2 = true;
            }
            else {
                p2 = false;
                b2 = false;
            }
            this.u(context, u);
            String n;
            if (u.q(15)) {
                n = u.n(15);
            }
            else {
                n = null;
            }
            String n2;
            if (u.q(13)) {
                n2 = u.n(13);
            }
            else {
                n2 = null;
            }
            u.o();
            n3 = n;
            n4 = n2;
        }
        else {
            p2 = false;
            b2 = false;
            n3 = null;
            n4 = null;
        }
        final cdn w2 = cdn.w(context, set, gl.x, i, 0);
        boolean p3 = p2;
        boolean b3 = b2;
        if (!b) {
            p3 = p2;
            b3 = b2;
            if (w2.q(14)) {
                p3 = w2.p(14, false);
                b3 = true;
            }
        }
        if (w2.q(15)) {
            n3 = w2.n(15);
        }
        if (w2.q(13)) {
            n4 = w2.n(13);
        }
        if (Build$VERSION.SDK_INT >= 28 && w2.q(0) && w2.e(0, -1) == 0) {
            this.e.setTextSize(0, 0.0f);
        }
        this.u(context, w2);
        w2.o();
        if (!b && b3) {
            this.i(p3);
        }
        final Typeface b4 = this.b;
        if (b4 != null) {
            if (this.g == -1) {
                this.e.setTypeface(b4, this.a);
            }
            else {
                this.e.setTypeface(b4);
            }
        }
        if (n4 != null) {
            la.d(this.e, n4);
        }
        if (n3 != null) {
            kz.b(this.e, kz.a(n3));
        }
        final ll f = this.f;
        final TypedArray obtainStyledAttributes = f.i.obtainStyledAttributes(set, gl.i, i, 0);
        final TextView h = f.h;
        ana.M((View)h, h.getContext(), gl.i, set, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            f.a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension;
        if (obtainStyledAttributes.hasValue(4)) {
            dimension = obtainStyledAttributes.getDimension(4, -1.0f);
        }
        else {
            dimension = -1.0f;
        }
        float n5;
        if (obtainStyledAttributes.hasValue(2)) {
            n5 = obtainStyledAttributes.getDimension(2, -1.0f);
        }
        else {
            n5 = -1.0f;
        }
        float dimension2;
        if (obtainStyledAttributes.hasValue(1)) {
            dimension2 = obtainStyledAttributes.getDimension(1, -1.0f);
        }
        else {
            dimension2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3)) {
            i = obtainStyledAttributes.getResourceId(3, 0);
            if (i > 0) {
                final TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(i);
                final int length = obtainTypedArray.length();
                final int[] array = new int[length];
                if (length > 0) {
                    for (i = 0; i < length; ++i) {
                        array[i] = obtainTypedArray.getDimensionPixelSize(i, -1);
                    }
                    f.f = ll.l(array);
                    f.j();
                }
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (f.k()) {
            if (f.a == 1) {
                if (!f.g) {
                    final DisplayMetrics displayMetrics = f.i.getResources().getDisplayMetrics();
                    if (n5 == -1.0f) {
                        n5 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    float applyDimension = dimension2;
                    if (dimension2 == -1.0f) {
                        applyDimension = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    float n6 = dimension;
                    if (dimension == -1.0f) {
                        n6 = 1.0f;
                    }
                    f.g(n5, applyDimension, n6);
                }
                f.i();
            }
        }
        else {
            f.a = 0;
        }
        if (qb.b) {
            final ll f2 = this.f;
            if (f2.a != 0) {
                final int[] f3 = f2.f;
                if (f3.length > 0) {
                    if (la.a(this.e) != -1.0f) {
                        la.b(this.e, this.f.b(), this.f.a(), this.f.c(), 0);
                    }
                    else {
                        la.c(this.e, f3, 0);
                    }
                }
            }
        }
        final cdn v = cdn.v(context, set, gl.i);
        i = v.i(8, -1);
        Drawable c;
        if (i != -1) {
            c = d.c(context, i);
        }
        else {
            c = null;
        }
        i = v.i(13, -1);
        Drawable c2;
        if (i != -1) {
            c2 = d.c(context, i);
        }
        else {
            c2 = null;
        }
        i = v.i(9, -1);
        Drawable c3;
        if (i != -1) {
            c3 = d.c(context, i);
        }
        else {
            c3 = null;
        }
        i = v.i(6, -1);
        Drawable c4;
        if (i != -1) {
            c4 = d.c(context, i);
        }
        else {
            c4 = null;
        }
        i = v.i(10, -1);
        Drawable c5;
        if (i != -1) {
            c5 = d.c(context, i);
        }
        else {
            c5 = null;
        }
        i = v.i(7, -1);
        Drawable c6;
        if (i != -1) {
            c6 = d.c(context, i);
        }
        else {
            c6 = null;
        }
        if (c5 == null && c6 == null) {
            if (c != null || c2 != null || c3 != null || c4 != null) {
                final Drawable[] c7 = ky.c(this.e);
                final Drawable drawable = c7[0];
                if (drawable == null && c7[2] == null) {
                    final Drawable[] compoundDrawables = this.e.getCompoundDrawables();
                    final TextView e2 = this.e;
                    Drawable drawable2;
                    if ((drawable2 = c) == null) {
                        drawable2 = compoundDrawables[0];
                    }
                    Drawable drawable3;
                    if ((drawable3 = c2) == null) {
                        drawable3 = compoundDrawables[1];
                    }
                    Drawable drawable4;
                    if ((drawable4 = c3) == null) {
                        drawable4 = compoundDrawables[2];
                    }
                    Drawable drawable5;
                    if ((drawable5 = c4) == null) {
                        drawable5 = compoundDrawables[3];
                    }
                    e2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
                }
                else {
                    final TextView e3 = this.e;
                    if (c2 == null) {
                        c2 = c7[1];
                    }
                    final Drawable drawable6 = c7[2];
                    if (c4 == null) {
                        c4 = c7[3];
                    }
                    ky.a(e3, drawable, c2, drawable6, c4);
                }
            }
        }
        else {
            final Drawable[] c8 = ky.c(this.e);
            final TextView e4 = this.e;
            if (c5 == null) {
                c5 = c8[0];
            }
            Drawable drawable7 = c2;
            if (c2 == null) {
                drawable7 = c8[1];
            }
            if (c6 == null) {
                c6 = c8[2];
            }
            Drawable drawable8 = c4;
            if (c4 == null) {
                drawable8 = c8[3];
            }
            ky.a(e4, c5, drawable7, c6, drawable8);
        }
        if (v.q(11)) {
            apt.f(this.e, v.j(11));
        }
        if (v.q(12)) {
            apt.g(this.e, mb.a(v.f(12, -1), (PorterDuff$Mode)null));
        }
        final int e5 = v.e(15, -1);
        i = v.e(18, -1);
        final int e6 = v.e(19, -1);
        v.o();
        if (e5 != -1) {
            api.f(this.e, e5);
        }
        if (i != -1) {
            api.g(this.e, i);
        }
        if (e6 != -1) {
            api.h(this.e, e6);
        }
    }
    
    public final void h(final Context context, final int n) {
        final cdn u = cdn.u(context, n, gl.x);
        if (u.q(14)) {
            this.i(u.p(14, false));
        }
        if (u.q(0) && u.e(0, -1) == 0) {
            this.e.setTextSize(0, 0.0f);
        }
        this.u(context, u);
        if (u.q(13)) {
            final String n2 = u.n(13);
            if (n2 != null) {
                la.d(this.e, n2);
            }
        }
        u.o();
        final Typeface b = this.b;
        if (b != null) {
            this.e.setTypeface(b, this.a);
        }
    }
    
    public final void i(final boolean allCaps) {
        this.e.setAllCaps(allCaps);
    }
    
    public final void j(final int n, final int n2, final int n3, final int n4) {
        final ll f = this.f;
        if (f.k()) {
            final DisplayMetrics displayMetrics = f.i.getResources().getDisplayMetrics();
            f.g(TypedValue.applyDimension(n4, (float)n, displayMetrics), TypedValue.applyDimension(n4, (float)n2, displayMetrics), TypedValue.applyDimension(n4, (float)n3, displayMetrics));
            if (f.i()) {
                f.e();
            }
        }
    }
    
    public final void k(final int[] array, final int n) {
        final ll f = this.f;
        if (f.k()) {
            final int length = array.length;
            int n2 = 0;
            if (length > 0) {
                final int[] array2 = new int[length];
                int[] copy;
                if (n == 0) {
                    copy = Arrays.copyOf(array, length);
                }
                else {
                    final DisplayMetrics displayMetrics = f.i.getResources().getDisplayMetrics();
                    while (true) {
                        copy = array2;
                        if (n2 >= length) {
                            break;
                        }
                        array2[n2] = Math.round(TypedValue.applyDimension(n, (float)array[n2], displayMetrics));
                        ++n2;
                    }
                }
                f.f = ll.l(copy);
                if (!f.j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: ".concat(String.valueOf(Arrays.toString(array))));
                }
            }
            else {
                f.g = false;
            }
            if (f.i()) {
                f.e();
            }
        }
    }
    
    public final void l(final int n) {
        final ll f = this.f;
        if (f.k()) {
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("Unknown auto-size text type: ");
                    sb.append(n);
                    throw new IllegalArgumentException(sb.toString());
                }
                final DisplayMetrics displayMetrics = f.i.getResources().getDisplayMetrics();
                f.g(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (f.i()) {
                    f.e();
                }
            }
            else {
                f.a = 0;
                f.d = -1.0f;
                f.e = -1.0f;
                f.c = -1.0f;
                f.f = new int[0];
                f.b = false;
            }
        }
    }
    
    public final void m() {
        final ajk d = this.d;
        this.h = d;
        this.i = d;
        this.j = d;
        this.k = d;
        this.l = d;
        this.m = d;
    }
    
    public final void n(final int n, final float n2) {
        if (!qb.b && !this.o()) {
            this.f.f(n, n2);
        }
    }
    
    public final boolean o() {
        return this.f.h();
    }
    
    public final int[] p() {
        return this.f.f;
    }
    
    public final void q() {
        if (!qb.b) {
            this.f();
        }
    }
}
