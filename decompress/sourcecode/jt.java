import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.ActionMenuPresenter$SavedState;
import android.os.Parcelable;
import android.view.ViewParent;
import android.view.MenuItem;
import java.util.ArrayList;
import android.content.res.Resources;
import android.view.View$MeasureSpec;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jt extends ic
{
    public jr h;
    public Drawable i;
    public boolean j;
    public int k;
    public js l;
    public jp m;
    public int n;
    public mqs o;
    final fv p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;
    private final SparseBooleanArray v;
    private qpt w;
    
    public jt(final Context context) {
        super(context);
        this.v = new SparseBooleanArray();
        this.p = new fv(this, 2);
    }
    
    public final View b(final io io, final View view, final ViewGroup viewGroup) {
        View actionView = io.getActionView();
        int visibility = 0;
        if (actionView == null || io.m()) {
            ja ja;
            if (view instanceof ja) {
                ja = (ja)view;
            }
            else {
                ja = (ja)super.d.inflate(2131623938, viewGroup, false);
            }
            ja.f(io);
            final ActionMenuView b = (ActionMenuView)this.f;
            final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)ja;
            actionMenuItemView.b = (il)b;
            if (this.w == null) {
                this.w = new qpt(this);
            }
            actionMenuItemView.c = this.w;
            actionView = (View)ja;
        }
        if (io.p) {
            visibility = 8;
        }
        actionView.setVisibility(visibility);
        final ActionMenuView actionMenuView = (ActionMenuView)viewGroup;
        final ViewGroup$LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof jw)) {
            actionView.setLayoutParams((ViewGroup$LayoutParams)ActionMenuView.l(layoutParams));
        }
        return actionView;
    }
    
    public final void c(final Context b, final im c) {
        LayoutInflater.from(super.b = b);
        super.c = c;
        final Resources resources = b.getResources();
        if (!this.r) {
            this.q = true;
        }
        this.s = b.getResources().getDisplayMetrics().widthPixels / 2;
        this.k = fm.e(b);
        int s = this.s;
        if (this.q) {
            if (this.h == null) {
                final jr h = new jr(this, this.a);
                this.h = h;
                if (this.j) {
                    ((AppCompatImageView)h).setImageDrawable(this.i);
                    this.i = null;
                    this.j = false;
                }
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                this.h.measure(measureSpec, measureSpec);
            }
            s -= this.h.getMeasuredWidth();
        }
        else {
            this.h = null;
        }
        this.t = s;
        final float density = resources.getDisplayMetrics().density;
    }
    
    public final void d(final im im, final boolean b) {
        this.p();
        final iy e = super.e;
        if (e != null) {
            e.a(im, b);
        }
    }
    
    public final boolean f() {
        final im c = this.c;
        ArrayList f;
        int size;
        if (c != null) {
            f = c.f();
            size = f.size();
        }
        else {
            f = null;
            size = 0;
        }
        int k = this.k;
        final int t = this.t;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final ViewGroup viewGroup = (ViewGroup)this.f;
        int i = 0;
        boolean b = false;
        int n = 0;
        int n2 = 0;
        while (i < size) {
            final io io = f.get(i);
            if (io.r()) {
                ++n;
            }
            else if (io.q()) {
                ++n2;
            }
            else {
                b = true;
            }
            int n3 = k;
            if (this.u) {
                n3 = k;
                if (io.p) {
                    n3 = 0;
                }
            }
            ++i;
            k = n3;
        }
        int n4 = k;
        if (this.q && (b || n2 + n > (n4 = k))) {
            n4 = k - 1;
        }
        int n5 = n4 - n;
        final SparseBooleanArray v = this.v;
        v.clear();
        int j = 0;
        int n6 = 0;
        int n7 = t;
        while (j < size) {
            final io io2 = f.get(j);
            int n8 = 0;
            Label_0579: {
                int n9;
                if (io2.r()) {
                    final View b2 = this.b(io2, (View)null, viewGroup);
                    b2.measure(measureSpec, measureSpec);
                    final int measuredWidth = b2.getMeasuredWidth();
                    n8 = n7 - measuredWidth;
                    if ((n9 = n6) == 0) {
                        n9 = measuredWidth;
                    }
                    final int b3 = io2.b;
                    if (b3 != 0) {
                        v.put(b3, true);
                    }
                    io2.k(true);
                }
                else {
                    if (!io2.q()) {
                        io2.k(false);
                        n8 = n7;
                        break Label_0579;
                    }
                    final int b4 = io2.b;
                    final boolean value = v.get(b4);
                    final boolean b5 = (n5 > 0 || value) && n7 > 0;
                    n8 = n7;
                    n9 = n6;
                    boolean b6 = b5;
                    if (b5) {
                        final View b7 = this.b(io2, (View)null, viewGroup);
                        b7.measure(measureSpec, measureSpec);
                        final int measuredWidth2 = b7.getMeasuredWidth();
                        n8 = n7 - measuredWidth2;
                        if ((n9 = n6) == 0) {
                            n9 = measuredWidth2;
                        }
                        b6 = (n8 + n9 > 0);
                    }
                    int n10;
                    if (b6 && b4 != 0) {
                        v.put(b4, true);
                        n10 = n5;
                    }
                    else {
                        n10 = n5;
                        if (value) {
                            v.put(b4, false);
                            int n11 = 0;
                            while (true) {
                                n10 = n5;
                                if (n11 >= j) {
                                    break;
                                }
                                final io io3 = f.get(n11);
                                int n12 = n5;
                                if (io3.b == b4) {
                                    n12 = n5;
                                    if (io3.o()) {
                                        n12 = n5 + 1;
                                    }
                                    io3.k(false);
                                }
                                ++n11;
                                n5 = n12;
                            }
                        }
                    }
                    n5 = n10;
                    if (b6) {
                        n5 = n10 - 1;
                    }
                    io2.k(b6);
                }
                n6 = n9;
            }
            ++j;
            n7 = n8;
        }
        return true;
    }
    
    public final boolean g(jg c) {
        final boolean hasVisibleItems = ((im)c).hasVisibleItems();
        final boolean b = false;
        if (!hasVisibleItems) {
            return false;
        }
        jg jg = c;
        while (true) {
            final im k = jg.k;
            if (k == this.c) {
                break;
            }
            jg = (jg)k;
        }
        final io l = jg.l;
        final ViewGroup viewGroup = (ViewGroup)this.f;
        final View view = null;
        View child;
        if (viewGroup == null) {
            child = view;
        }
        else {
            final int childCount = viewGroup.getChildCount();
            int n = 0;
            while (true) {
                child = view;
                if (n >= childCount) {
                    break;
                }
                child = viewGroup.getChildAt(n);
                if (child instanceof ja && ((ja)child).a() == l) {
                    break;
                }
                ++n;
            }
        }
        if (child == null) {
            return false;
        }
        this.n = c.l.a;
        final int size = ((im)c).size();
        int n2 = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n2 >= size) {
                break;
            }
            final MenuItem item = ((im)c).getItem(n2);
            if (item.isVisible() && item.getIcon() != null) {
                b2 = true;
                break;
            }
            ++n2;
        }
        (this.m = new jp(this, this.b, c, child)).d(b2);
        this.m.f();
        final iy e = super.e;
        if (e != null) {
            if (c == null) {
                c = (jg)super.c;
            }
            e.b((im)c);
        }
        return true;
    }
    
    public final void j() {
        final ViewGroup viewGroup = (ViewGroup)super.f;
        final ArrayList list = null;
        final int n = 0;
        if (viewGroup != null) {
            final im c = super.c;
            int i;
            if (c != null) {
                c.k();
                final ArrayList f = super.c.f();
                final int size = f.size();
                int n2 = 0;
                int n3 = 0;
                while (true) {
                    i = n3;
                    if (n2 >= size) {
                        break;
                    }
                    final io io = f.get(n2);
                    int n4 = n3;
                    if (io.o()) {
                        final View child = viewGroup.getChildAt(n3);
                        io a;
                        if (child instanceof ja) {
                            a = ((ja)child).a();
                        }
                        else {
                            a = null;
                        }
                        final View b = this.b(io, child, viewGroup);
                        if (io != a) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != child) {
                            final ViewGroup viewGroup2 = (ViewGroup)b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup)super.f).addView(b, n3);
                        }
                        n4 = n3 + 1;
                    }
                    ++n2;
                    n3 = n4;
                }
            }
            else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.h) {
                    ++i;
                }
                else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View)this.f).requestLayout();
        final im c2 = this.c;
        if (c2 != null) {
            c2.k();
            final ArrayList d = c2.d;
            for (int size2 = d.size(), j = 0; j < size2; ++j) {
                final akw o = d.get(j).o;
            }
        }
        final im c3 = this.c;
        ArrayList e = list;
        if (c3 != null) {
            e = c3.e();
        }
        Label_0532: {
            if (this.q && e != null) {
                final int size3 = e.size();
                int n5;
                if (size3 == 1) {
                    n5 = ((((io)e.get(0)).p ^ true) ? 1 : 0);
                }
                else {
                    n5 = n;
                    if (size3 > 0) {
                        n5 = 1;
                    }
                }
                if (n5 != 0) {
                    if (this.h == null) {
                        this.h = new jr(this, this.a);
                    }
                    final ViewGroup viewGroup3 = (ViewGroup)this.h.getParent();
                    if (viewGroup3 != this.f) {
                        if (viewGroup3 != null) {
                            viewGroup3.removeView((View)this.h);
                        }
                        final ActionMenuView actionMenuView = (ActionMenuView)this.f;
                        final jr h = this.h;
                        final jw k = ActionMenuView.k();
                        k.a = true;
                        actionMenuView.addView((View)h, (ViewGroup$LayoutParams)k);
                    }
                    break Label_0532;
                }
            }
            final jr h2 = this.h;
            if (h2 != null) {
                final ViewParent parent = h2.getParent();
                final jb f2 = this.f;
                if (parent == f2) {
                    ((ViewGroup)f2).removeView((View)this.h);
                }
            }
        }
        ((ActionMenuView)this.f).b = this.q;
    }
    
    public final void k(final ActionMenuView f) {
        this.f = (jb)f;
        f.a = this.c;
    }
    
    public final Parcelable kC() {
        final ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.a = this.n;
        return (Parcelable)actionMenuPresenter$SavedState;
    }
    
    public final boolean l() {
        final mqs o = this.o;
        if (o != null) {
            final jb f = this.f;
            if (f != null) {
                ((View)f).removeCallbacks((Runnable)o);
                this.o = null;
                return true;
            }
        }
        final js l = this.l;
        if (l != null) {
            l.b();
            return true;
        }
        return false;
    }
    
    public final boolean m() {
        final js l = this.l;
        return l != null && l.h();
    }
    
    public final void n(final Parcelable parcelable) {
        if (!(parcelable instanceof ActionMenuPresenter$SavedState)) {
            return;
        }
        final int a = ((ActionMenuPresenter$SavedState)parcelable).a;
        if (a > 0) {
            final MenuItem item = this.c.findItem(a);
            if (item != null) {
                this.g((jg)item.getSubMenu());
            }
        }
    }
    
    public final boolean o() {
        if (this.q && !this.m()) {
            final im c = this.c;
            if (c != null && this.f != null && this.o == null && !c.e().isEmpty()) {
                this.o = new mqs(this, new js(this, this.b, this.c, (View)this.h), 1);
                ((View)this.f).post((Runnable)this.o);
                return true;
            }
        }
        return false;
    }
    
    public final void p() {
        this.l();
        this.s();
    }
    
    public final void q() {
        this.u = true;
    }
    
    public final void r() {
        this.q = true;
        this.r = true;
    }
    
    public final void s() {
        final jp m = this.m;
        if (m != null) {
            m.b();
        }
    }
}
