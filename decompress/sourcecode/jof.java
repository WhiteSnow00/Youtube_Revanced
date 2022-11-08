import android.text.TextPaint;
import android.view.View;
import android.text.style.ClickableSpan;

// 
// Decompiled by Procyon v0.6.0
// 

final class jof extends ClickableSpan
{
    final /* synthetic */ jog a;
    
    public jof(final jog a) {
        this.a = a;
    }
    
    public final void onClick(final View view) {
        this.a.a();
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
