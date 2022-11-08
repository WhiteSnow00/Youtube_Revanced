import android.view.View;
import android.view.View$OnLayoutChangeListener;
import android.animation.Animator$AnimatorListener;
import android.widget.TextView;
import android.animation.ObjectAnimator;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyn implements View$OnClickListener
{
    public final ObjectAnimator a;
    public final TextView b;
    public final int c;
    public boolean d;
    public int e;
    private final int f;
    
    public fyn(final TextView b, final int c, final int f) {
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = false;
        this.e = b.getLineCount();
        final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)b, "maxLines", new int[] { c, this.a() });
        (this.a = ofInt).setDuration(150L);
        ofInt.addListener((Animator$AnimatorListener)new gsu(this, 1));
        b.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fta(this, 3));
        this.c();
    }
    
    public final int a() {
        final int e = this.e;
        if (e <= this.c) {
            return this.f;
        }
        return Math.min(e, this.f);
    }
    
    public final void b() {
        this.d = false;
        this.b.setMaxLines(this.c);
    }
    
    public final void c() {
        int maxLines;
        if (this.d) {
            maxLines = this.f;
        }
        else {
            maxLines = this.c;
        }
        if (this.b.getMaxLines() != maxLines) {
            this.b.setMaxLines(maxLines);
        }
    }
    
    public final boolean d() {
        final int min = Math.min(this.b.getLineCount(), this.c);
        final int visibility = this.b.getVisibility();
        boolean b2;
        final boolean b = b2 = false;
        if (visibility == 0) {
            if (this.b.getLineCount() <= this.c) {
                b2 = b;
                if (this.b.getLayout() != null) {
                    if (this.b.getLayout().getEllipsisCount(min - 1) != 0) {
                        return true;
                    }
                    b2 = b;
                }
            }
            else {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void onClick(final View view) {
        this.d ^= true;
        if (!this.d()) {
            this.c();
            return;
        }
        if (!this.a.isRunning() && this.d) {
            this.a.start();
            return;
        }
        this.a.reverse();
    }
}
