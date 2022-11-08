import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.graphics.Typeface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jiu extends jhx
{
    public jiu(final Context context, final acng acng, final Typeface typeface) {
        super(context, acng, typeface);
    }
    
    protected static final akbf j() {
        final agzc agzc = (agzc)((agzi)akbf.a).createBuilder();
        final akbe ap = akbe.aP;
        agzc.copyOnWrite();
        final akbf akbf = (akbf)agzc.instance;
        akbf.c = ap.sv;
        akbf.b |= 0x1;
        return (akbf)agzc.build();
    }
    
    public final Spanned i(final ankl ankl) {
        if (ankl == null) {
            return (Spanned)SpannableStringBuilder.valueOf((CharSequence)"");
        }
        ajsq ajsq;
        if ((ankl.b & 0x2) != 0x0) {
            if ((ajsq = ankl.d) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        return this.f(abyh.b(ajsq));
    }
}
