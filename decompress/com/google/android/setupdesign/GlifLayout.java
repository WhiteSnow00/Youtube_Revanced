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

public class GlifLayout extends aeer
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
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, aefr.g, n, 0);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(4, false);
        this.g = (this.f() && boolean1);
        ((TemplateLayout)this).l(aefy.class, (aefj)new aefy((TemplateLayout)this, set, n));
        ((TemplateLayout)this).l(aefx.class, (aefj)new aefx((TemplateLayout)this, set, n));
        ((TemplateLayout)this).l(aefz.class, (aefj)new aefz((TemplateLayout)this, set, n));
        ((TemplateLayout)this).l(aegc.class, (aefj)new aegc((TemplateLayout)this));
        ((TemplateLayout)this).l(aegd.class, (aefj)new aegd((TemplateLayout)this, set, n));
        ((TemplateLayout)this).l(aegb.class, (aefj)new aegb(this));
        ((TemplateLayout)this).l(aege.class, (aefj)new aege());
        final View h = ((TemplateLayout)this).h(2131431877);
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
            final ProgressBar a = ((aegd)((TemplateLayout)this).j(aegd.class)).a();
            if (a != null) {
                a.setIndeterminateTintList(colorStateList);
                a.setProgressBackgroundTintList(colorStateList);
            }
        }
        if (this.m() && !this.g()) {
            n = aefe.f(this.getContext()).c(this.getContext(), aefc.K);
            this.getRootView().setBackgroundColor(n);
        }
        final View h2 = ((TemplateLayout)this).h(2131431856);
        if (h2 != null) {
            if (this.f()) {
                aefb.m(h2);
            }
            if (!(this instanceof aefp)) {
                final Context context = h2.getContext();
                final boolean l = aefe.f(context).l(aefc.at);
                if (this.f() && l) {
                    n = (int)aefe.f(context).a(context, aefc.at);
                    if (n != h2.getPaddingTop()) {
                        h2.setPadding(h2.getPaddingStart(), n, h2.getPaddingEnd(), h2.getPaddingBottom());
                    }
                }
            }
        }
        final int n2 = n = this.getResources().getDimensionPixelSize(2131169968);
        if (this.f()) {
            n = n2;
            if (aefe.f(this.getContext()).l(aefc.N)) {
                n = (int)aefe.f(this.getContext()).a(this.getContext(), aefc.N);
            }
        }
        final View h3 = ((TemplateLayout)this).h(2131431854);
        if (h3 != null) {
            int dimensionPixelSize;
            if (this.f() && aefe.f(this.getContext()).l(aefc.M)) {
                dimensionPixelSize = (int)aefe.f(this.getContext()).a(this.getContext(), aefc.M);
            }
            else {
                final TypedArray obtainStyledAttributes2 = this.getContext().obtainStyledAttributes(new int[] { 2130970479 });
                dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
                obtainStyledAttributes2.recycle();
            }
            h3.setPadding(h3.getPaddingStart(), h3.getPaddingTop(), n / 2 - dimensionPixelSize, h3.getPaddingBottom());
        }
        final View h4 = ((TemplateLayout)this).h(2131431853);
        if (h4 != null) {
            int dimensionPixelSize2;
            if (this.f() && aefe.f(this.getContext()).l(aefc.L)) {
                dimensionPixelSize2 = (int)aefe.f(this.getContext()).a(this.getContext(), aefc.L);
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
            final ViewStub viewStub = (ViewStub)((TemplateLayout)this).h(2131431868);
            viewStub.setLayoutResource(n);
            viewStub.inflate();
        }
        obtainStyledAttributes.recycle();
    }
    
    private final void o() {
        if (((TemplateLayout)this).h(2131431833) != null) {
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
                o = new aefo(n);
            }
            else {
                o = new ColorDrawable(n);
            }
            ((aefk)((TemplateLayout)this).j(aefk.class)).a((Drawable)o);
        }
    }
    
    protected View b(final LayoutInflater layoutInflater, final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 2131625560;
        }
        return ((TemplateLayout)this).i(layoutInflater, 2132083790, n2);
    }
    
    protected ViewGroup c(final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 2131431856;
        }
        return super.c(n2);
    }
    
    public final boolean m() {
        final boolean g = this.g;
        boolean b = true;
        if (!g) {
            if (this.f()) {
                if (!aefe.n(this.getContext())) {
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
        final aefz aefz = (aefz)((TemplateLayout)this).j(aefz.class);
        if (aefb.l((View)aefz.a)) {
            final ImageView b = aefz.b();
            final FrameLayout a = aefz.a();
            if (b != null) {
                if (a != null) {
                    final Context context = b.getContext();
                    final int j = aefb.j(context);
                    if (j != 0 && b.getLayoutParams() instanceof FrameLayout$LayoutParams) {
                        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)b.getLayoutParams();
                        layoutParams.gravity = j;
                        b.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                    }
                    int n = 0;
                    Label_0240: {
                        if (aefe.f(context).l(aefc.V)) {
                            b.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new edj(b, 7));
                            final ViewGroup$LayoutParams layoutParams2 = b.getLayoutParams();
                            layoutParams2.height = (int)aefe.f(context).a(context, aefc.V);
                            layoutParams2.width = -2;
                            b.setScaleType(ImageView$ScaleType.FIT_CENTER);
                            final Drawable drawable = b.getDrawable();
                            if (drawable != null) {
                                final int intrinsicWidth = drawable.getIntrinsicWidth();
                                final int intrinsicHeight = drawable.getIntrinsicHeight();
                                if (intrinsicWidth > intrinsicHeight + intrinsicHeight) {
                                    final int height = (int)context.getResources().getDimension(2131169992);
                                    if (layoutParams2.height > height) {
                                        n = layoutParams2.height - height;
                                        layoutParams2.height = height;
                                        break Label_0240;
                                    }
                                }
                            }
                        }
                        n = 0;
                    }
                    final ViewGroup$LayoutParams layoutParams3 = a.getLayoutParams();
                    if (aefe.f(context).l(aefc.U) && layoutParams3 instanceof ViewGroup$MarginLayoutParams) {
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams3;
                        viewGroup$MarginLayoutParams.setMargins(viewGroup$MarginLayoutParams.leftMargin, (int)aefe.f(context).a(context, aefc.U) + n, viewGroup$MarginLayoutParams.rightMargin, viewGroup$MarginLayoutParams.bottomMargin);
                    }
                }
            }
        }
        final aefy aefy = (aefy)((TemplateLayout)this).j(aefy.class);
        final TextView textView = (TextView)aefy.a.h(2131431834);
        if (aefb.l((View)aefy.a)) {
            final View h = aefy.a.h(2131431859);
            aefb.m(h);
            if (textView != null) {
                afse.s(textView, new aekh(aefc.O, null, aefc.P, aefc.Q, null, aefc.R, aefc.S, aefb.j(textView.getContext())));
            }
            final ViewGroup viewGroup = (ViewGroup)h;
            if (viewGroup != null) {
                final Context context2 = viewGroup.getContext();
                viewGroup.setBackgroundColor(aefe.f(context2).c(context2, aefc.W));
                if (aefe.f(context2).l(aefc.X)) {
                    final ViewGroup$LayoutParams layoutParams4 = viewGroup.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup$MarginLayoutParams) {
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams2 = (ViewGroup$MarginLayoutParams)layoutParams4;
                        viewGroup$MarginLayoutParams2.setMargins(viewGroup$MarginLayoutParams2.leftMargin, viewGroup$MarginLayoutParams2.topMargin, viewGroup$MarginLayoutParams2.rightMargin, (int)aefe.f(context2).a(context2, aefc.X));
                        viewGroup.setLayoutParams(layoutParams4);
                    }
                }
            }
        }
        aefy.c();
        if (aefy.b) {
            aefy.b(textView);
        }
        final aefx aefx = (aefx)((TemplateLayout)this).j(aefx.class);
        final TextView textView2 = (TextView)aefx.a.h(2131431869);
        if (textView2 != null && aefb.l((View)aefx.a)) {
            afse.s(textView2, new aekh(aefc.ae, aefc.af, aefc.ad, aefc.ag, aefc.ah, aefc.ai, aefc.aj, aefb.j(textView2.getContext())));
        }
        final aegd aegd = (aegd)((TemplateLayout)this).j(aegd.class);
        final ProgressBar a2 = aegd.a();
        if (aegd.b) {
            if (a2 != null) {
                if (((GlifLayout)aegd.a).m()) {
                    final Context context3 = a2.getContext();
                    final ViewGroup$LayoutParams layoutParams5 = a2.getLayoutParams();
                    if (layoutParams5 instanceof ViewGroup$MarginLayoutParams) {
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams3 = (ViewGroup$MarginLayoutParams)layoutParams5;
                        int topMargin = viewGroup$MarginLayoutParams3.topMargin;
                        if (aefe.f(context3).l(aefc.bp)) {
                            topMargin = (int)aefe.f(context3).b(context3, aefc.bp, context3.getResources().getDimension(2131170026));
                        }
                        int bottomMargin = viewGroup$MarginLayoutParams3.bottomMargin;
                        if (aefe.f(context3).l(aefc.bq)) {
                            bottomMargin = (int)aefe.f(context3).b(context3, aefc.bq, context3.getResources().getDimension(2131170024));
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
                        final int n2 = (int)context4.getResources().getDimension(2131170026);
                        final int n3 = (int)context4.getResources().getDimension(2131170024);
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams4 = (ViewGroup$MarginLayoutParams)layoutParams6;
                        viewGroup$MarginLayoutParams4.setMargins(viewGroup$MarginLayoutParams4.leftMargin, n2, viewGroup$MarginLayoutParams4.rightMargin, n3);
                    }
                }
            }
        }
        final aegc aegc = (aegc)((TemplateLayout)this).j(aegc.class);
        if (aefb.l((View)aegc.a)) {
            final ImageView imageView = (ImageView)aegc.a.h(2131431836);
            final TextView textView3 = (TextView)aegc.a.h(2131431837);
            final LinearLayout linearLayout = (LinearLayout)aegc.a.h(2131431864);
            aefb.m(aegc.a.h(2131431859));
            if (imageView != null) {
                if (textView3 != null) {
                    final Context context5 = imageView.getContext();
                    final ViewGroup$LayoutParams layoutParams7 = imageView.getLayoutParams();
                    if (layoutParams7 instanceof ViewGroup$MarginLayoutParams) {
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams5 = (ViewGroup$MarginLayoutParams)layoutParams7;
                        viewGroup$MarginLayoutParams5.setMargins(viewGroup$MarginLayoutParams5.leftMargin, viewGroup$MarginLayoutParams5.topMargin, (int)aefe.f(context5).a(context5, aefc.am), viewGroup$MarginLayoutParams5.bottomMargin);
                    }
                    imageView.setMaxHeight((int)aefe.f(context5).b(context5, aefc.an, context5.getResources().getDimension(2131169867)));
                    textView3.setTextSize(0, (float)(int)aefe.f(context5).b(context5, aefc.ak, context5.getResources().getDimension(2131169868)));
                    final Typeface create = Typeface.create(aefe.f(context5).h(context5, aefc.al), 0);
                    if (create != null) {
                        textView3.setTypeface(create);
                    }
                    linearLayout.setGravity(aefb.j(linearLayout.getContext()));
                }
            }
        }
        final TextView textView4 = (TextView)((TemplateLayout)this).h(2131431858);
        if (textView4 != null) {
            if (this.g) {
                afse.s(textView4, new aekh(aefc.ae, aefc.af, aefc.ad, aefc.ag, aefc.ah, null, null, aefb.j(textView4.getContext())));
                return;
            }
            if (this.f()) {
                final aekh aekh = new aekh(null, null, null, null, null, null, null, aefb.j(textView4.getContext()));
                afse.t(textView4, aekh);
                textView4.setGravity(aekh.a);
            }
        }
    }
}
