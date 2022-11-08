import android.graphics.drawable.Drawable;
import android.view.View$OnLongClickListener;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jim extends jhx
{
    public final Context i;
    public final aeby j;
    private final ImageView k;
    private final aceo l;
    
    public jim(final Context i, final acng acng, final aceo l, final Typeface typeface, final aeby j, final byte[] array, final byte[] array2, final byte[] array3) {
        super(i, acng, typeface);
        this.i = i;
        this.k = (ImageView)this.d.findViewById(2131432006);
        this.l = l;
        this.j = j;
    }
    
    public final Spanned i(final ajzo ajzo) {
        if (ajzo == null) {
            return (Spanned)SpannableStringBuilder.valueOf((CharSequence)"");
        }
        ajsq ajsq;
        if ((ajzo.b & 0x2) != 0x0) {
            if ((ajsq = ajzo.f) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        return this.f(abyh.b(ajsq));
    }
}
