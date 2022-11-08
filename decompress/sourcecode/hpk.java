import android.graphics.Typeface;
import android.text.TextPaint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpk extends vbc
{
    final /* synthetic */ wax a;
    
    public hpk(final wax a, final vax vax, final aioe aioe, final boolean b, final byte[] array) {
        this.a = a;
        super(vax, (Map)null, aioe, b);
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (!((hpm)this.a.a).P.f(45383830L)) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }
}
