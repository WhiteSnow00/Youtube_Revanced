import android.graphics.Typeface;
import android.text.TextPaint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqf extends vdd
{
    final wcx a;
    
    public hqf(final wcx a, final vcy vcy, final aiqj aiqj, final boolean b, final byte[] array) {
        this.a = a;
        super(vcy, (Map)null, aiqj, b);
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (!((hqh)this.a.a).P.f(45383830L)) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }
}
