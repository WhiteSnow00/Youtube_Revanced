import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.graphics.Typeface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjw extends jiz
{
    public jjw(final Context context, final acpk acpk, final Typeface typeface) {
        super(context, acpk, typeface);
    }
    
    protected static final akdi j() {
        final ahbb ahbb = (ahbb)((ahbh)akdi.a).createBuilder();
        final akdh ap = akdh.aP;
        ((ahaz)ahbb).copyOnWrite();
        final akdi akdi = (akdi)ahbb.instance;
        akdi.c = ap.sy;
        akdi.b |= 0x1;
        return (akdi)((ahaz)ahbb).build();
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((anmo)o).f.I();
    }
    
    public final /* bridge */ Spanned g(final Object o) {
        return this.i((anmo)o);
    }
    
    protected final /* bridge */ akdi h(final Object o) {
        final anmo anmo = (anmo)o;
        return j();
    }
    
    public final Spanned i(final anmo anmo) {
        if (anmo == null) {
            return (Spanned)SpannableStringBuilder.valueOf((CharSequence)"");
        }
        ajut ajut;
        if ((anmo.b & 0x2) != 0x0) {
            if ((ajut = anmo.d) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        return this.f(acak.b(ajut));
    }
    
    public final /* bridge */ void lR(final ackm ackm, final Object o) {
        final anmo g = (anmo)o;
        this.g = g;
        this.d.setOnClickListener((View$OnClickListener)new jgx(this, 15));
        this.e.setOnClickListener((View$OnClickListener)new jgx(this, 16));
        this.f = (jiy)ackm.c("SEARCH_SUGGESTION_PRESENTER_EVENT_LISTENER");
        this.b.setText((CharSequence)this.i(g));
        final akdi j = j();
        final ImageView c = this.c;
        final acpk a = this.a;
        akdh akdh;
        if (j != null) {
            if ((akdh = akdh.b(j.c)) == null) {
                akdh = akdh.a;
            }
        }
        else {
            akdh = akdh.a;
        }
        c.setImageResource(a.a(akdh));
        this.c.setVisibility(0);
    }
}
