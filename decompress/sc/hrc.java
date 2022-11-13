import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrc implements Runnable
{
    public final float a;
    public final Object b;
    private final int c;
    
    public hrc(final aaqz b, final float a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hrc(final aast b, final float a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hrc(final aave b, final float a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hrc(final View b, final float a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hrc(final arcx b, final float a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hrc(final b b, final float a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hrc(final gxu b, final float a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hrc(final ynp b, final float a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hrc(final ypo b, final float a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hrc(final ypq b, final float a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        int visibility = 0;
        switch (c) {
            default: {
                final RelativeLayout$LayoutParams layoutParams = (RelativeLayout$LayoutParams)((arcx)this.b).g.getLayoutParams();
                final Context a = ((arcx)this.b).a;
                final float a2 = this.a;
                final float n = (float)(int)a.getResources().getDimension(2131165390);
                final int rule = layoutParams.getRule(15);
                final int n2 = (int)(n * a2);
                if (rule == -1) {
                    layoutParams.width = n2;
                }
                else {
                    layoutParams.height = n2;
                }
                ((arcx)this.b).g.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                return;
            }
            case 9: {
                ((abde)((aave)this.b).k).g(this.a);
                return;
            }
            case 8: {
                ((aast)this.b).j.setTextSize(0, (float)aask.s(this.a));
                return;
            }
            case 7: {
                final Object b = this.b;
                final float a3 = this.a;
                final aaqz aaqz = (aaqz)b;
                final aatn i = aaqz.i;
                if (i != null) {
                    try {
                        i.c(a3);
                    }
                    catch (final aatr aatr) {
                        aaqz.s(aatr);
                    }
                }
                return;
            }
            case 6: {
                ((ypq)this.b).a.o(this.a);
                return;
            }
            case 5: {
                ((ypo)this.b).o(this.a);
                return;
            }
            case 4: {
                ((ynp)this.b).D(this.a);
                return;
            }
            case 3: {
                ((ynp)this.b).A(this.a);
                return;
            }
            case 2: {
                ((b)this.b).a.g(this.a);
                return;
            }
            case 1: {
                ((gxu)this.b).a.animate().translationY(-this.a).setStartDelay(5000L).setDuration(500L).start();
                return;
            }
            case 0: {
                final Object b2 = this.b;
                if (this.a == 0.0f) {
                    visibility = 4;
                }
                ((View)b2).setVisibility(visibility);
            }
        }
    }
}
