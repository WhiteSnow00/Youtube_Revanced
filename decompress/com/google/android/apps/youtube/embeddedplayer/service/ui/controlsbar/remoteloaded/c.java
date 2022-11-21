// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a;
import android.view.View$MeasureSpec;
import java.util.List;
import android.content.pm.PackageManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.text.TextUtils$TruncateAt;
import android.content.Intent;
import android.net.Uri;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.graphics.drawable.StateListDrawable;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.app.AlertDialog$Builder;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import android.view.animation.AnimationSet;
import android.widget.TextView;
import android.widget.ImageButton;
import android.view.animation.Animation$AnimationListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup;

public final class c extends ViewGroup implements View$OnClickListener, Animation$AnimationListener
{
    public ImageButton a;
    public ImageButton b;
    public TextView c;
    public AnimationSet d;
    public AnimationSet e;
    public VideoQuality[] f;
    public int g;
    public abcx h;
    public final oqz i;
    private ImageButton j;
    private AlertDialog$Builder k;
    
    private c(final Context context, final oqz i, final byte[] array, final byte[] array2, final byte[] array3) {
        context.getClass();
        super(context);
        this.i = i;
    }
    
    public static c a(final Context context, final oqz oqz) {
        final c animationListener = new c(context, oqz, null, null, null);
        final Context context2 = animationListener.getContext();
        final float density = animationListener.getResources().getDisplayMetrics().density;
        animationListener.a = new ImageButton(context2);
        animationListener.b = new ImageButton(context2);
        animationListener.j = new ImageButton(context2);
        animationListener.c = new TextView(context2);
        animationListener.k = new AlertDialog$Builder(context2).setTitle((CharSequence)context2.getString(2132019316)).setNegativeButton(2132017611, (DialogInterface$OnClickListener)new gyt(8));
        final StateListDrawable imageDrawable = new StateListDrawable();
        imageDrawable.addState(View.SELECTED_STATE_SET, agy.a(context2, 2131230936));
        imageDrawable.addState(View.EMPTY_STATE_SET, agy.a(context2, 2131230935));
        final StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(View.SELECTED_STATE_SET, agy.a(context2, 2131230934));
        stateListDrawable.addState(View.EMPTY_STATE_SET, agy.a(context2, 2131230933));
        animationListener.a.setImageDrawable((Drawable)imageDrawable);
        animationListener.a.setBackground((Drawable)null);
        final ImageButton a = animationListener.a;
        final int n = (int)(density * 10.0f);
        a.setPadding(n, n, 0, n);
        animationListener.a.setContentDescription(context2.getText(2132017361));
        animationListener.a.setOnClickListener((View$OnClickListener)animationListener);
        animationListener.a.setVisibility(8);
        final StateListDrawable imageDrawable2 = new StateListDrawable();
        imageDrawable2.addState(View.SELECTED_STATE_SET, agy.a(context2, 2131230932));
        imageDrawable2.addState(View.EMPTY_STATE_SET, agy.a(context2, 2131230931));
        animationListener.b.setImageDrawable((Drawable)imageDrawable2);
        animationListener.b.setBackground((Drawable)null);
        animationListener.b.setPadding(n, n, 0, n);
        animationListener.b.setContentDescription(context2.getText(2132017236));
        animationListener.b.setOnClickListener((View$OnClickListener)animationListener);
        animationListener.b.setVisibility(8);
        animationListener.j.setImageResource(2131230950);
        animationListener.j.setBackground((Drawable)null);
        animationListener.j.setPadding(n, n, n, n);
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v="));
        final PackageManager packageManager = context2.getPackageManager();
        String package1;
        if (aejr.c(packageManager)) {
            package1 = "com.google.android.youtube.tv";
        }
        else if (aejr.d(packageManager)) {
            package1 = "com.google.android.youtube.googletv";
        }
        else {
            package1 = "com.google.android.youtube";
        }
        final List queryIntentActivities = context2.getPackageManager().queryIntentActivities(intent.setPackage(package1), 65536);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            animationListener.j.setContentDescription(context2.getText(2132017327));
            animationListener.j.setOnClickListener((View$OnClickListener)animationListener);
        }
        animationListener.c.setSingleLine();
        animationListener.c.setTextSize(1, 18.0f);
        animationListener.c.setEllipsize(TextUtils$TruncateAt.END);
        animationListener.c.setTextColor(-1);
        animationListener.c.setGravity(17);
        animationListener.c.setPadding(n + n, n, n, n);
        (animationListener.d = new AnimationSet(true)).setInterpolator((Interpolator)new DecelerateInterpolator());
        animationListener.d.setDuration(200L);
        animationListener.d.addAnimation((Animation)new AlphaAnimation(0.0f, 1.0f));
        animationListener.d.addAnimation((Animation)new TranslateAnimation(1, 0.4f, 1, 0.0f, 1, 0.0f, 1, 0.0f));
        animationListener.d.setAnimationListener((Animation$AnimationListener)animationListener);
        (animationListener.e = new AnimationSet(true)).setInterpolator((Interpolator)new AccelerateInterpolator());
        animationListener.e.setDuration(200L);
        animationListener.e.addAnimation((Animation)new AlphaAnimation(1.0f, 0.0f));
        animationListener.e.addAnimation((Animation)new TranslateAnimation(1, 0.0f, 1, 0.4f, 1, 0.0f, 1, 0.0f));
        animationListener.e.setAnimationListener((Animation$AnimationListener)animationListener);
        animationListener.addView((View)animationListener.a);
        animationListener.addView((View)animationListener.b);
        animationListener.addView((View)animationListener.c);
        animationListener.addView((View)animationListener.j);
        animationListener.setBackgroundResource(2131230953);
        animationListener.setVisibility(4);
        return animationListener;
    }
    
    private static final int b(final View view, final int n, int n2) {
        final int measuredHeight = view.getMeasuredHeight();
        final int measuredWidth = view.getMeasuredWidth();
        n2 = (n2 - measuredHeight) / 2;
        view.layout(n, n2, measuredWidth + n, view.getMeasuredHeight() + n2);
        return view.getMeasuredWidth();
    }
    
    public final void onAnimationEnd(final Animation animation) {
        if (animation == this.e) {
            this.setVisibility(4);
        }
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
    }
    
    public final void onClick(final View view) {
        if (view == this.a) {
            final VideoQuality[] f = this.f;
            if (f != null) {
                final int length = f.length;
                if (length > 0) {
                    final AlertDialog$Builder k = this.k;
                    final String[] array = new String[length];
                    for (int i = 0; i < f.length; ++i) {
                        array[i] = f[i].b;
                    }
                    k.setSingleChoiceItems((CharSequence[])array, this.g, (DialogInterface$OnClickListener)new b(this, this.f)).create().show();
                    this.i.i();
                    return;
                }
            }
        }
        if (view == this.b) {
            this.h.c();
            this.i.i();
        }
    }
    
    protected final void onLayout(final boolean b, final int n, int b2, final int n2, int n3) {
        final int visibility = this.a.getVisibility();
        final int n4 = n3 - b2;
        b2 = 0;
        if (visibility != 8) {
            b2 = b((View)this.a, 0, n4);
        }
        n3 = b2;
        if (this.b.getVisibility() != 8) {
            n3 = b2 + b((View)this.b, b2, n4);
        }
        if (this.c.getVisibility() != 8) {
            b((View)this.c, n3, n4);
        }
        final ImageButton j = this.j;
        b((View)j, n2 - n - j.getMeasuredWidth(), n4);
    }
    
    protected final void onMeasure(int defaultSize, int defaultSize2) {
        defaultSize = getDefaultSize(0, defaultSize);
        defaultSize2 = getDefaultSize(0, defaultSize2);
        this.setMeasuredDimension(defaultSize, defaultSize2);
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(defaultSize2, Integer.MIN_VALUE);
        this.j.measure(View$MeasureSpec.makeMeasureSpec(defaultSize, Integer.MIN_VALUE), measureSpec);
        defaultSize2 = (defaultSize -= this.j.getMeasuredWidth());
        if (this.a.getVisibility() != 8) {
            this.a.measure(View$MeasureSpec.makeMeasureSpec(defaultSize2, Integer.MIN_VALUE), measureSpec);
            defaultSize = defaultSize2 - this.a.getMeasuredWidth();
        }
        defaultSize2 = defaultSize;
        if (this.b.getVisibility() != 8) {
            this.b.measure(View$MeasureSpec.makeMeasureSpec(defaultSize, Integer.MIN_VALUE), measureSpec);
            defaultSize2 = defaultSize - this.b.getMeasuredWidth();
        }
        if (this.c.getVisibility() != 8) {
            this.c.measure(View$MeasureSpec.makeMeasureSpec(defaultSize2, 1073741824), measureSpec);
        }
    }
    
    public final void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final oqz i = this.i;
        final Object a = i.a;
        final boolean l = visibility == 0;
        final a a2 = (a)a;
        a2.l = l;
        if (l) {
            a2.v();
            ((a)i.a).A();
        }
        else {
            a2.B();
        }
        ((a)i.a).E();
    }
}
