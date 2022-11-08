import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acpj extends MetricAffectingSpan
{
    private final float a;
    private final int b;
    
    public acpj(final float a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        this.updateMeasureState(textPaint);
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        textPaint.baselineShift = this.b;
        final float a = this.a;
        if (a > 0.0f) {
            textPaint.setTextSize(a);
        }
    }
}
