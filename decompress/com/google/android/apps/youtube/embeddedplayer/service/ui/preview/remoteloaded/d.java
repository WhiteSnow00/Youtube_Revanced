// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.view.MotionEvent;
import android.content.Context;
import android.widget.FrameLayout;

final class d extends FrameLayout
{
    final /* synthetic */ e a;
    
    public d(final e a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public final boolean onFilterTouchEventForSecurity(final MotionEvent motionEvent) {
        final sin s = this.a.s;
        final int flags = motionEvent.getFlags();
        boolean a = true;
        if (0x1 != (flags & 0x1)) {
            a = false;
        }
        s.a = a;
        return super.onFilterTouchEventForSecurity(motionEvent);
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final ImageView d = this.a.d;
        if (d == null) {
            return;
        }
        ImageView$ScaleType scaleType;
        if (n > n2) {
            scaleType = ImageView$ScaleType.CENTER_CROP;
        }
        else {
            scaleType = ImageView$ScaleType.FIT_CENTER;
        }
        d.setScaleType(scaleType);
    }
}
