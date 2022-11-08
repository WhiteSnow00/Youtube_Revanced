import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izq implements acem
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public izq(final izm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izq(final izr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izq(final udl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final ImageView imageView) {
        final int b = this.b;
        if (b == 0) {
            ((izr)this.a).f.setImageResource(2131233454);
            zjp.b(zjo.a, zjn.a, "CollapsibleAdCtaOverlay failed to load image:");
            return;
        }
        if (b != 1) {
            trn.b("Failed to load avatar for comment sticker.");
            ((udl)this.a).c();
            return;
        }
        ((izm)this.a).f.setImageResource(2131230959);
        zjp.b(zjo.a, zjn.a, "AppPromoAdCtaInnerOverlay failed to load image:");
    }
    
    public final void b(final ImageView imageView) {
        final int b = this.b;
        if (b != 0 && b != 1) {
            ((udl)this.a).c();
        }
    }
    
    public final void c(final ImageView imageView) {
    }
}
