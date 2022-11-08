import android.view.View;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyc
{
    public final ImageView a;
    public final ProgressBar b;
    public final kye c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    
    public kyc(final ImageView a, final ProgressBar b, final kye c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    final void a(final int n) {
        final ImageView a = this.a;
        boolean b = true;
        a.setEnabled(true);
        this.a.setOnClickListener((View$OnClickListener)new kmk(this, 15));
        this.b.setVisibility(8);
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        b = false;
                    }
                }
                else {
                    if (this.h == null) {
                        this.h = agw.a(this.a.getContext(), 2131233630);
                    }
                    this.b(this.h, 2132017375);
                }
            }
            else {
                if (this.g == null) {
                    this.g = agw.a(this.a.getContext(), 2131233572);
                }
                this.b(this.g, 2132017326);
            }
        }
        else {
            if (this.i == null) {
                this.i = agw.a(this.a.getContext(), 2131233566);
            }
            this.b(this.i, 2132017324);
        }
        tmy.v((View)this.a, b);
    }
    
    public final void b(final Drawable imageDrawable, final int n) {
        this.a.setImageDrawable(imageDrawable);
        final ImageView a = this.a;
        a.setContentDescription(a.getContext().getText(n));
    }
    
    public final void c(final int max, final int progress) {
        this.b.setMax(max);
        this.b.setProgress(progress);
    }
}
