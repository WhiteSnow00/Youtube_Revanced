// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded;

import j$.util.Optional;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application;
import android.media.AudioManager;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import android.graphics.Rect;
import java.util.BitSet;
import java.lang.ref.WeakReference;
import android.app.Application$ActivityLifecycleCallbacks;

public final class d implements Application$ActivityLifecycleCallbacks, c
{
    private final WeakReference b;
    private BitSet c;
    private Rect d;
    private int e;
    private VisibilityChangeEventData f;
    private final b g;
    private boolean h;
    
    public d(final View view, final b g) {
        this.b = new WeakReference((T)view);
        this.g = g;
    }
    
    private static int h(final DisplayMetrics displayMetrics, final int n) {
        return (int)Math.ceil(n / displayMetrics.density);
    }
    
    private static Rect i(final Rect rect, final DisplayMetrics displayMetrics) {
        return new Rect(h(displayMetrics, rect.left), h(displayMetrics, rect.top), h(displayMetrics, rect.right), h(displayMetrics, rect.bottom));
    }
    
    public final int a() {
        if (!this.h) {
            return 0;
        }
        return this.d.width() * this.d.height() - this.e;
    }
    
    public final void b() {
        if (!this.h) {
            return;
        }
        final View view = (View)this.b.get();
        if (view == null) {
            return;
        }
        (this.d = new Rect(0, 0, view.getWidth(), view.getHeight())).offset((int)view.getTranslationX(), (int)view.getTranslationY());
        this.c = new BitSet(this.d.width() * this.d.height());
        final Rect rect = new Rect();
        if (view.getLocalVisibleRect(rect)) {
            final int max = Math.max(rect.left, 0);
            int i = Math.max(rect.top, 0);
            final int min = Math.min(rect.right, this.d.width());
            final int min2 = Math.min(rect.bottom, this.d.height());
            final int width = this.d.width();
            while (i < min2) {
                final int n = i * width;
                final BitSet c = this.c;
                final int n2 = n + max;
                final int n3 = n + min;
                if (min - max - c.get(n2, n3).cardinality() > 0) {
                    this.c.set(n2, n3, true);
                }
                ++i;
            }
            this.e = rect.height() * rect.width();
            return;
        }
        this.e = 0;
    }
    
    public final void c(final Rect rect, final Rect rect2) {
        if (!this.h) {
            return;
        }
        final int max = Math.max(rect.left, rect2.left);
        final int left = rect2.left;
        final int min = Math.min(rect.right, rect2.right);
        final int left2 = rect2.left;
        int i = Math.max(rect.top, rect2.top) - rect2.top;
        final int min2 = Math.min(rect.bottom, rect2.bottom);
        final int top = rect2.top;
        final int width = this.d.width();
        while (i < min2 - top) {
            final int n = i * width;
            final BitSet c = this.c;
            final int n2 = n + (max - left);
            final int n3 = n + (min - left2);
            final int cardinality = c.get(n2, n3).cardinality();
            if (cardinality > 0) {
                this.e -= cardinality;
                this.c.set(n2, n3, false);
            }
            ++i;
        }
    }
    
    public final void d(final boolean b) {
        if (!this.h) {
            return;
        }
        final View view = (View)this.b.get();
        if (view == null) {
            return;
        }
        VisibilityChangeEventData f;
        if (b) {
            f = new VisibilityChangeEventData(0.0, 0.0, 0.0, true, new Rect(0, 0, 0, 0), new Rect(0, 0, 0, 0), new Rect(0, 0, 0, 0), new Rect(0, 0, 0, 0));
        }
        else {
            final DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            final DisplayMetrics displayMetrics2 = view.getContext().getApplicationContext().getResources().getDisplayMetrics();
            final Rect rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
            final Rect rect2 = new Rect(0, 0, displayMetrics2.widthPixels, displayMetrics2.heightPixels);
            final int width = view.getWidth();
            final int height = view.getHeight();
            final int[] array = new int[2];
            view.getLocationInWindow(array);
            final int n = array[0];
            final int n2 = array[1];
            final Rect rect3 = new Rect(n, n2, width + n, height + n2);
            final int width2 = rect2.width();
            final int height2 = rect2.height();
            final double n3 = rect3.width() * rect3.height();
            final double n4 = 0.0;
            double n6;
            if (n3 > 0.0) {
                final double n5 = this.e;
                Double.isNaN(n5);
                Double.isNaN(n3);
                n6 = n5 / n3;
            }
            else {
                n6 = 0.0;
            }
            final double n7 = width2 * height2;
            double n9;
            if (n7 > 0.0) {
                final double n8 = this.e;
                Double.isNaN(n8);
                Double.isNaN(n7);
                n9 = n8 / n7;
            }
            else {
                n9 = 0.0;
            }
            final AudioManager audioManager = (AudioManager)view.getContext().getSystemService("audio");
            double min = n4;
            if (audioManager != null) {
                final int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                if (streamMaxVolume <= 0) {
                    min = n4;
                }
                else {
                    final double n10 = audioManager.getStreamVolume(3);
                    final double n11 = streamMaxVolume;
                    Double.isNaN(n10);
                    Double.isNaN(n11);
                    min = Math.min(n10 / n11, 1.0);
                }
            }
            f = new VisibilityChangeEventData(n6, n9, min, false, i(rect3, displayMetrics), i(rect3, displayMetrics), i(rect, displayMetrics), i(rect2, displayMetrics2));
        }
        final VisibilityChangeEventData f2 = this.f;
        if ((f2 == null || !f.equals((Object)f2)) && this.g.a(f)) {
            this.f = f;
        }
    }
    
    public final void e() {
        if (!this.h) {
            return;
        }
        final View view = (View)this.b.get();
        if (view == null) {
            return;
        }
        ((Application)view.getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this);
        this.f = null;
        this.h = false;
    }
    
    public final boolean f() {
        return this.h;
    }
    
    public final void g() {
        if (this.h) {
            return;
        }
        final View view = (View)this.b.get();
        if (view == null) {
            return;
        }
        ((Application)view.getContext().getApplicationContext()).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this);
        this.h = true;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
        final View view = (View)this.b.get();
        if (view == null) {
            return;
        }
        final Optional l = lma.l(view.getContext());
        if (l.isPresent() && activity == l.get() && this.h) {
            this.d(true);
        }
    }
    
    public final void onActivityResumed(final Activity activity) {
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
