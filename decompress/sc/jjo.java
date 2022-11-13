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

public final class jjo extends jiz
{
    public final Context i;
    public final aeea j;
    private final ImageView k;
    private final acgs l;
    
    public jjo(final Context i, final acpk acpk, final acgs l, final Typeface typeface, final aeea j, final byte[] array, final byte[] array2, final byte[] array3) {
        super(i, acpk, typeface);
        this.i = i;
        this.k = (ImageView)this.d.findViewById(2131432009);
        this.l = l;
        this.j = j;
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((akbr)o).i.I();
    }
    
    public final /* bridge */ Spanned g(final Object o) {
        return this.i((akbr)o);
    }
    
    public final akdi h(final Object o) {
        akdi akdi;
        if ((akdi = ((akbr)o).e) == null) {
            akdi = akdi.a;
        }
        return akdi;
    }
    
    public final Spanned i(final akbr akbr) {
        if (akbr == null) {
            return (Spanned)SpannableStringBuilder.valueOf((CharSequence)"");
        }
        ajut ajut;
        if ((akbr.b & 0x2) != 0x0) {
            if ((ajut = akbr.f) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        return this.f(acak.b(ajut));
    }
    
    public final /* bridge */ void lR(final ackm ackm, final Object o) {
        final akbr akbr = (akbr)o;
        super.lR(ackm, (Object)akbr);
        this.d.setOnLongClickListener((View$OnLongClickListener)new jjn(this, 0));
        if ((akbr.b & 0x80) != 0x0) {
            this.k.setImageDrawable((Drawable)null);
            final acgs l = this.l;
            final ImageView k = this.k;
            anxw anxw;
            if ((anxw = akbr.h) == null) {
                anxw = anxw.a;
            }
            aotp aotp;
            if ((aotp = anxw.b) == null) {
                aotp = aotp.a;
            }
            l.g(k, aotp);
            this.k.setVisibility(0);
            return;
        }
        this.k.setImageDrawable((Drawable)null);
        this.k.setVisibility(8);
    }
}
