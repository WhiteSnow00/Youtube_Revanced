import android.content.res.Resources;
import android.widget.RadioButton;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfu
{
    public final boolean a;
    
    public agfu() {
        this.a = true;
    }
    
    public agfu(final qgy qgy) {
        qgy.getClass();
        qgy.a();
        this.a = false;
    }
    
    public agfu(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        final boolean bf = alvl.bf;
        this.a = bf;
    }
    
    public agfu(final boolean a) {
        this.a = a;
    }
    
    public agfu(final boolean a, final byte[] array) {
        this.a = a;
    }
    
    public agfu(final byte[] array) {
        this.a = false;
    }
    
    public agfu(final char[] array) {
        this.a = (aao.a.E(aap.class) != null);
    }
    
    public static final boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
    
    public final void a(final RadioButton radioButton, final int n) {
        if (this.a) {
            radioButton.getClass();
            radioButton.setButtonDrawable(tmy.cq(radioButton.getContext(), n));
        }
    }
    
    public final void b(final RadioButton radioButton) {
        this.a(radioButton, 2130970890);
    }
    
    public final void c(final RadioButton radioButton, int dimensionPixelSize, int dimensionPixelSize2) {
        if (this.a) {
            final Resources resources = radioButton.getContext().getResources();
            dimensionPixelSize = resources.getDimensionPixelSize(dimensionPixelSize);
            final int dimensionPixelSize3 = resources.getDimensionPixelSize(dimensionPixelSize2);
            dimensionPixelSize2 = resources.getDimensionPixelSize(dimensionPixelSize2);
            radioButton.setPaddingRelative(dimensionPixelSize, dimensionPixelSize3, radioButton.getPaddingEnd(), dimensionPixelSize2);
        }
    }
}
