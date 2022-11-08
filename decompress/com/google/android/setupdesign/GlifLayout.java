// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign;

import android.widget.FrameLayout;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ImageView$ScaleType;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.widget.ProgressBar;
import android.view.View;
import android.content.res.TypedArray;
import android.view.ViewStub;
import android.util.Log;
import com.google.android.setupdesign.view.BottomScrollView;
import android.widget.ScrollView;
import com.google.android.setupcompat.internal.TemplateLayout;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;

public class GlifLayout extends aecp
{
    private ColorStateList e;
    private boolean f;
    private boolean g;
    private ColorStateList h;
    
    public GlifLayout(final Context context) {
        this(context, 0, 0);
    }
    
    public GlifLayout(final Context context, final int n) {
        this(context, n, 0);
    }
    
    public GlifLayout(final Context context, final int n, final int n2) {
        super(context, n, n2);
        this.f = true;
        this.g = false;
        this.n(null, 2130970472);
    }
    
    public GlifLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = true;
        this.g = false;
        this.n(set, 2130970472);
    }
    
    public GlifLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f = true;
        this.g = false;
        this.n(set, n);
    }
    
    private final void n(final AttributeSet set, int n) {
        if (this.isInEditMode()) {
            return;
        }
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, aedq.g, n, 0);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(4, false);
        this.g = (this.f() && boolean1);
        this.l(aedx.class, (aedi)new aedx((TemplateLayout)this, set, n));
        this.l(aedw.class, (aedi)new aedw((TemplateLayout)this, set, n));
        this.l(aedy.class, (aedi)new aedy((TemplateLayout)this, set, n));
        this.l(aeeb.class, (aedi)new aeeb((TemplateLayout)this));
        this.l(aeec.class, (aedi)new aeec((TemplateLayout)this, set, n));
        this.l(aeea.class, (aedi)new aeea(this));
        this.l(aeed.class, (aedi)new aeed());
        final View h = this.h(2131431874);
        ScrollView scrollView;
        if (h instanceof ScrollView) {
            scrollView = (ScrollView)h;
        }
        else {
            scrollView = null;
        }
        if (scrollView != null) {
            if (scrollView instanceof BottomScrollView) {
                final BottomScrollView bottomScrollView = (BottomScrollView)scrollView;
            }
            else {
                Log.w("ScrollViewDelegate", "Cannot set non-BottomScrollView. Found=".concat(scrollView.toString()));
            }
        }
        final ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        if (colorStateList != null) {
            this.e = colorStateList;
            this.o();
            final ProgressBar a = ((aeec)this.j(aeec.class)).a();
            if (a != null) {
                a.setIndeterminateTintList(colorStateList);
                a.setProgressBackgroundTintList(colorStateList);
            }
        }
        if (this.m() && !this.g()) {
            n = aedd.f(this.getContext()).c(this.getContext(), aedb.K);
            this.getRootView().setBackgroundColor(n);
        }
        final View h2 = this.h(2131431853);
        if (h2 != null) {
            if (this.f()) {
                aeda.n(h2);
            }
            if (!(this instanceof aedo)) {
                final Context context = h2.getContext();
                final boolean l = aedd.f(context).l(aedb.at);
                if (this.f() && l) {
                    n = (int)aedd.f(context).a(context, aedb.at);
                    if (n != h2.getPaddingTop()) {
                        h2.setPadding(h2.getPaddingStart(), n, h2.getPaddingEnd(), h2.getPaddingBottom());
                    }
                }
            }
        }
        final int n2 = n = this.getResources().getDimensionPixelSize(2131169967);
        if (this.f()) {
            n = n2;
            if (aedd.f(this.getContext()).l(aedb.N)) {
                n = (int)aedd.f(this.getContext()).a(this.getContext(), aedb.N);
            }
        }
        final View h3 = this.h(2131431851);
        if (h3 != null) {
            int dimensionPixelSize;
            if (this.f() && aedd.f(this.getContext()).l(aedb.M)) {
                dimensionPixelSize = (int)aedd.f(this.getContext()).a(this.getContext(), aedb.M);
            }
            else {
                final TypedArray obtainStyledAttributes2 = this.getContext().obtainStyledAttributes(new int[] { 2130970479 });
                dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
                obtainStyledAttributes2.recycle();
            }
            h3.setPadding(h3.getPaddingStart(), h3.getPaddingTop(), n / 2 - dimensionPixelSize, h3.getPaddingBottom());
        }
        final View h4 = this.h(2131431850);
        if (h4 != null) {
            int dimensionPixelSize2;
            if (this.f() && aedd.f(this.getContext()).l(aedb.L)) {
                dimensionPixelSize2 = (int)aedd.f(this.getContext()).a(this.getContext(), aedb.L);
            }
            else {
                final TypedArray obtainStyledAttributes3 = this.getContext().obtainStyledAttributes(new int[] { 2130970480 });
                dimensionPixelSize2 = obtainStyledAttributes3.getDimensionPixelSize(0, 0);
                obtainStyledAttributes3.recycle();
            }
            if (h3 != null) {
                n = n / 2 - dimensionPixelSize2;
            }
            else {
                n = 0;
            }
            h4.setPadding(n, h4.getPaddingTop(), h4.getPaddingEnd(), h4.getPaddingBottom());
        }
        this.h = obtainStyledAttributes.getColorStateList(0);
        this.o();
        this.f = obtainStyledAttributes.getBoolean(1, true);
        this.o();
        n = obtainStyledAttributes.getResourceId(3, 0);
        if (n != 0) {
            final ViewStub viewStub = (ViewStub)this.h(2131431865);
            viewStub.setLayoutResource(n);
            viewStub.inflate();
        }
        obtainStyledAttributes.recycle();
    }
    
    private final void o() {
        if (this.h(2131431830) != null) {
            final ColorStateList h = this.h;
            int n;
            if (h != null) {
                n = h.getDefaultColor();
            }
            else {
                final ColorStateList e = this.e;
                if (e != null) {
                    n = e.getDefaultColor();
                }
                else {
                    n = 0;
                }
            }
            Object o;
            if (this.f) {
                o = new aedn(n);
            }
            else {
                o = new ColorDrawable(n);
            }
            ((aedj)this.j(aedj.class)).a((Drawable)o);
        }
    }
    
    @Override
    protected View b(final LayoutInflater layoutInflater, final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 2131625555;
        }
        return this.i(layoutInflater, 2132083790, n2);
    }
    
    @Override
    protected ViewGroup c(final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 2131431853;
        }
        return super.c(n2);
    }
    
    public final boolean m() {
        final boolean g = this.g;
        boolean b = true;
        if (!g) {
            if (this.f()) {
                if (!aedd.n(this.getContext())) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        final aedy aedy = (aedy)this.j(aedy.class);
        if (aeda.m((View)aedy.a)) {
            final ImageView b = aedy.b();
            final FrameLayout a = aedy.a();
            if (b != null) {
                if (a != null) {
                    final Context context = b.getContext();
                    final int k = aeda.k(context);
                    if (k != 0 && b.getLayoutParams() instanceof FrameLayout$LayoutParams) {
                        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)b.getLayoutParams();
                        layoutParams.gravity = k;
                        b.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                    }
                    int n = 0;
                    Label_0237: {
                        if (aedd.f(context).l(aedb.V)) {
                            b.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new edi(b, 7));
                            final ViewGroup$LayoutParams layoutParams2 = b.getLayoutParams();
                            layoutParams2.height = (int)aedd.f(context).a(context, aedb.V);
                            layoutParams2.width = -2;
                            b.setScaleType(ImageView$ScaleType.FIT_CENTER);
                            final Drawable drawable = b.getDrawable();
                            if (drawable != null) {
                                final int intrinsicWidth = drawable.getIntrinsicWidth();
                                final int intrinsicHeight = drawable.getIntrinsicHeight();
                                if (intrinsicWidth > intrinsicHeight + intrinsicHeight) {
                                    final int height = (int)context.getResources().getDimension(2131169991);
                                    if (layoutParams2.height > height) {
                                        n = layoutParams2.height - height;
                                        layoutParams2.height = height;
                                        break Label_0237;
                                    }
                                }
                            }
                        }
                        n = 0;
                    }
                    final ViewGroup$LayoutParams layoutParams3 = a.getLayoutParams();
                    if (aedd.f(context).l(aedb.U) && layoutParams3 instanceof ViewGroup$MarginLayoutParams) {
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams3;
                        viewGroup$MarginLayoutParams.setMargins(viewGroup$MarginLayoutParams.leftMargin, (int)aedd.f(context).a(context, aedb.U) + n, viewGroup$MarginLayoutParams.rightMargin, viewGroup$MarginLayoutParams.bottomMargin);
                    }
                }
            }
        }
        final aedx aedx = (aedx)this.j(aedx.class);
        final TextView textView = (TextView)aedx.a.h(2131431831);
        if (aeda.m((View)aedx.a)) {
            final View h = aedx.a.h(2131431856);
            aeda.n(h);
            if (textView != null) {
                aeda.o(textView, new aeig(aedb.O, (aedb)null, aedb.P, aedb.Q, (aedb)null, aedb.R, aedb.S, aeda.k(textView.getContext())));
            }
            final ViewGroup viewGroup = (ViewGroup)h;
            if (viewGroup != null) {
                final Context context2 = viewGroup.getContext();
                viewGroup.setBackgroundColor(aedd.f(context2).c(context2, aedb.W));
                if (aedd.f(context2).l(aedb.X)) {
                    final ViewGroup$LayoutParams layoutParams4 = viewGroup.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup$MarginLayoutParams) {
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams2 = (ViewGroup$MarginLayoutParams)layoutParams4;
                        viewGroup$MarginLayoutParams2.setMargins(viewGroup$MarginLayoutParams2.leftMargin, viewGroup$MarginLayoutParams2.topMargin, viewGroup$MarginLayoutParams2.rightMargin, (int)aedd.f(context2).a(context2, aedb.X));
                        viewGroup.setLayoutParams(layoutParams4);
                    }
                }
            }
        }
        aedx.c();
        if (aedx.b) {
            aedx.b(textView);
        }
        final aedw aedw = (aedw)this.j(aedw.class);
        final TextView textView2 = (TextView)aedw.a.h(2131431866);
        if (textView2 != null && aeda.m((View)aedw.a)) {
            aeda.o(textView2, new aeig(aedb.ae, aedb.af, aedb.ad, aedb.ag, aedb.ah, aedb.ai, aedb.aj, aeda.k(textView2.getContext())));
        }
        final aeec aeec = (aeec)this.j(aeec.class);
        final ProgressBar a2 = aeec.a();
        if (aeec.b) {
            if (a2 != null) {
                if (((GlifLayout)aeec.a).m()) {
                    final Context context3 = a2.getContext();
                    final ViewGroup$LayoutParams layoutParams5 = a2.getLayoutParams();
                    if (layoutParams5 instanceof ViewGroup$MarginLayoutParams) {
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams3 = (ViewGroup$MarginLayoutParams)layoutParams5;
                        int topMargin = viewGroup$MarginLayoutParams3.topMargin;
                        if (aedd.f(context3).l(aedb.bp)) {
                            topMargin = (int)aedd.f(context3).b(context3, aedb.bp, context3.getResources().getDimension(2131170025));
                        }
                        int bottomMargin = viewGroup$MarginLayoutParams3.bottomMargin;
                        if (aedd.f(context3).l(aedb.bq)) {
                            bottomMargin = (int)aedd.f(context3).b(context3, aedb.bq, context3.getResources().getDimension(2131170023));
                        }
                        if (topMargin != viewGroup$MarginLayoutParams3.topMargin || bottomMargin != viewGroup$MarginLayoutParams3.bottomMargin) {
                            viewGroup$MarginLayoutParams3.setMargins(viewGroup$MarginLayoutParams3.leftMargin, topMargin, viewGroup$MarginLayoutParams3.rightMargin, bottomMargin);
                        }
                    }
                }
                else {
                    final Context context4 = a2.getContext();
                    final ViewGroup$LayoutParams layoutParams6 = a2.getLayoutParams();
                    if (layoutParams6 instanceof ViewGroup$MarginLayoutParams) {
                        final float dimension = context4.getResources().getDimension(2131170025);
                        final float dimension2 = context4.getResources().getDimension(2131170023);
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams4 = (ViewGroup$MarginLayoutParams)layoutParams6;
                        viewGroup$MarginLayoutParams4.setMargins(viewGroup$MarginLayoutParams4.leftMargin, (int)dimension, viewGroup$MarginLayoutParams4.rightMargin, (int)dimension2);
                    }
                }
            }
        }
        final aeeb aeeb = (aeeb)this.j(aeeb.class);
        if (aeda.m((View)aeeb.a)) {
            final ImageView imageView = (ImageView)aeeb.a.h(2131431833);
            final TextView textView3 = (TextView)aeeb.a.h(2131431834);
            final LinearLayout linearLayout = (LinearLayout)aeeb.a.h(2131431861);
            aeda.n(aeeb.a.h(2131431856));
            if (imageView != null) {
                if (textView3 != null) {
                    final Context context5 = imageView.getContext();
                    final ViewGroup$LayoutParams layoutParams7 = imageView.getLayoutParams();
                    if (layoutParams7 instanceof ViewGroup$MarginLayoutParams) {
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams5 = (ViewGroup$MarginLayoutParams)layoutParams7;
                        viewGroup$MarginLayoutParams5.setMargins(viewGroup$MarginLayoutParams5.leftMargin, viewGroup$MarginLayoutParams5.topMargin, (int)aedd.f(context5).a(context5, aedb.am), viewGroup$MarginLayoutParams5.bottomMargin);
                    }
                    imageView.setMaxHeight((int)aedd.f(context5).b(context5, aedb.an, context5.getResources().getDimension(2131169866)));
                    textView3.setTextSize(0, (float)(int)aedd.f(context5).b(context5, aedb.ak, context5.getResources().getDimension(2131169867)));
                    final Typeface create = Typeface.create(aedd.f(context5).h(context5, aedb.al), 0);
                    if (create != null) {
                        textView3.setTypeface(create);
                    }
                    linearLayout.setGravity(aeda.k(linearLayout.getContext()));
                }
            }
        }
        final TextView textView4 = (TextView)this.h(2131431855);
        if (textView4 != null) {
            if (this.g) {
                aeda.o(textView4, new aeig(aedb.ae, aedb.af, aedb.ad, aedb.ag, aedb.ah, (aedb)null, (aedb)null, aeda.k(textView4.getContext())));
                return;
            }
            if (this.f()) {
                final aeig aeig = new aeig((aedb)null, (aedb)null, (aedb)null, (aedb)null, (aedb)null, (aedb)null, (aedb)null, aeda.k(textView4.getContext()));
                aeda.p(textView4, aeig);
                textView4.setGravity(aeig.a);
            }
        }
    }
}
