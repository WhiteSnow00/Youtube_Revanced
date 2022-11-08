import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovh extends MetricAffectingSpan
{
    private final float a;
    
    public ovh(final float a) {
        this.a = a;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        textPaint.setLetterSpacing(this.a);
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        textPaint.setLetterSpacing(this.a);
    }
}
