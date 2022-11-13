import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.graphics.Typeface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jke extends jiz
{
    public jke(final Context context, final acpk acpk, final Typeface typeface) {
        super(context, acpk, typeface);
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((anyb)o).e.I();
    }
    
    public final /* bridge */ Spanned g(final Object o) {
        final anyb anyb = (anyb)o;
        Object o2;
        if (anyb == null) {
            o2 = SpannableStringBuilder.valueOf((CharSequence)"");
        }
        else {
            ajut ajut;
            if ((anyb.b & 0x1) != 0x0) {
                if ((ajut = anyb.c) == null) {
                    ajut = ajut.a;
                }
            }
            else {
                ajut = null;
            }
            o2 = this.f(acak.b(ajut));
        }
        return (Spanned)o2;
    }
    
    protected final /* bridge */ akdi h(final Object o) {
        final anyb anyb = (anyb)o;
        final ahbb ahbb = (ahbb)((ahbh)akdi.a).createBuilder();
        final akdh ap = akdh.aP;
        ((ahaz)ahbb).copyOnWrite();
        final akdi akdi = (akdi)ahbb.instance;
        akdi.c = ap.sy;
        akdi.b |= 0x1;
        return (akdi)((ahaz)ahbb).build();
    }
}
