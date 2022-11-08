import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezv extends acja
{
    private final fvj a;
    private final View b;
    
    public ezv(final Context context, final hyc hyc, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final View inflate = LayoutInflater.from(context).inflate(2131625643, (ViewGroup)null);
        this.b = inflate;
        final int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131165776);
        inflate.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        hyc.getClass();
        this.a = hyc.o(inflate);
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acir acir) {
        this.a.b(null);
    }
}
