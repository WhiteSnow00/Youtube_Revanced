// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livechat.ui.view;

import android.view.View;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public class LiveChatBannerContainerLayout extends RelativeLayout
{
    public boolean a;
    public aepj b;
    private final tnz c;
    private boolean d;
    private boolean e;
    private float f;
    private float g;
    
    public LiveChatBannerContainerLayout(final Context context) {
        this(context, null);
    }
    
    public LiveChatBannerContainerLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public LiveChatBannerContainerLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = true;
        this.f = 0.0f;
        this.g = 0.0f;
        this.c = new tnz(context);
    }
    
    private final void a(final MotionEvent motionEvent) {
        this.c.e(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c.h(motionEvent);
            this.f = motionEvent.getRawY();
            this.g = motionEvent.getRawY();
            this.d = false;
            this.e = false;
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.d = false;
                    this.c.g();
                }
            }
            else {
                final float n = motionEvent.getRawY() - this.g;
                if (!this.d && Math.abs(n) >= 6.0f) {
                    this.d = true;
                }
                if (n < 0.0f) {
                    this.animate().translationY(this.getTranslationY() + n).setDuration(0L);
                    this.g = motionEvent.getRawY();
                }
                final int height = this.getHeight();
                final float f = this.f;
                final float rawY = motionEvent.getRawY();
                if (this.d && f - rawY >= height * 0.2f) {
                    this.e = true;
                }
            }
            return;
        }
        Label_0257: {
            if (this.b != null) {
                final int height2 = this.getHeight();
                final float f2 = this.f;
                final float rawY2 = motionEvent.getRawY();
                if ((this.d && this.c.j(motionEvent, 1) == 2) || f2 - rawY2 >= height2 * 0.5f) {
                    final Context context = this.getContext();
                    tqt.c(context, (View)this, (CharSequence)context.getString(2132018359));
                    ((wcs)this.b.a).e();
                    break Label_0257;
                }
            }
            this.animate().translationY(0.0f).setDuration(100L);
        }
        this.c.g();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (!this.a) {
            return false;
        }
        this.a(motionEvent);
        return this.e;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.a) {
            return true;
        }
        this.a(motionEvent);
        return true;
    }
}
