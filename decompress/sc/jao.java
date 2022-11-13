import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jao implements acgq
{
    final Object a;
    private final int b;
    
    public jao(final jak a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jao(final jap a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jao(final ufo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final ImageView imageView) {
        final int b = this.b;
        if (b == 0) {
            ((jap)this.a).f.setImageResource(2131233454);
            zlm.b(zll.a, zlk.a, "CollapsibleAdCtaOverlay failed to load image:");
            return;
        }
        if (b != 1) {
            ttr.b("Failed to load avatar for comment sticker.");
            ((ufo)this.a).c();
            return;
        }
        ((jak)this.a).f.setImageResource(2131230959);
        zlm.b(zll.a, zlk.a, "AppPromoAdCtaInnerOverlay failed to load image:");
    }
    
    @Override
    public final void b(final ImageView imageView) {
        final int b = this.b;
        if (b != 0 && b != 1) {
            ((ufo)this.a).c();
        }
    }
    
    @Override
    public final void c(final ImageView imageView) {
    }
}
