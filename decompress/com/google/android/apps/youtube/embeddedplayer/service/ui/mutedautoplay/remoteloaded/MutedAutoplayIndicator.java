// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class MutedAutoplayIndicator extends ImageView
{
    private boolean a;
    private ckb b;
    
    public MutedAutoplayIndicator(final Context context) {
        super(context);
    }
    
    public MutedAutoplayIndicator(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public MutedAutoplayIndicator(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public MutedAutoplayIndicator(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    public final void a() {
        synchronized (this) {
            if (this.getVisibility() == 0) {
                final ckb b = this.b;
                if (b != null) {
                    b.start();
                }
            }
        }
    }
    
    public final void setVisibility(final int visibility) {
        synchronized (this) {
            if (this.a && this.getVisibility() == visibility) {
                return;
            }
            super.setVisibility(visibility);
            if (visibility == 0) {
                this.setAlpha(0.0f);
                if (!this.a) {
                    this.setImageDrawable((Drawable)(this.b = ckb.a(this.getContext(), 2131230809)));
                    final ckb b = this.b;
                    if (b != null) {
                        b.b((cjv)new b(this));
                        this.a = true;
                    }
                }
                final ckb b2 = this.b;
                if (b2 != null) {
                    b2.start();
                }
                this.animate().alpha(0.8f).start();
                return;
            }
            this.animate().cancel();
            this.setAlpha(0.0f);
            final ckb b3 = this.b;
            if (b3 != null) {
                b3.stop();
            }
        }
    }
}
