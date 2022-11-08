import android.text.TextPaint;

// 
// Decompiled by Procyon v0.6.0
// 

final class jht extends wxi
{
    final /* synthetic */ jhu a;
    
    public jht(final jhu a, final vax vax, final aioe aioe, final String s) {
        this.a = a;
        super(vax, aioe, s);
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(tmy.cn(this.a.a, 2130970852));
    }
}
