import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khr extends acld
{
    private final View a;
    private final TextView b;
    private final ViewGroup c;
    private final fvf d;
    private fve e;
    
    public khr(final Context context, final fvf d) {
        this.d = d;
        final View inflate = View.inflate(context, 2131625465, (ViewGroup)null);
        this.a = inflate;
        this.b = (TextView)inflate.findViewById(2131432095);
        this.c = (ViewGroup)inflate.findViewById(2131431608);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acku acku) {
        this.c.removeAllViews();
        final fve e = this.e;
        if (e != null) {
            e.c(acku);
        }
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aoiv)o).e.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aoiv aoiv = (aoiv)o;
        final TextView b = this.b;
        final int b2 = aoiv.b;
        boolean b3 = true;
        aoix aoix = null;
        ajut ajut;
        if ((b2 & 0x1) != 0x0) {
            if ((ajut = aoiv.c) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        b.setText((CharSequence)acak.b(ajut));
        anuv anuv;
        if ((anuv = aoiv.d) == null) {
            anuv = anuv.a;
        }
        if (anuv.ry((ahaq)SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer)) {
            anuv anuv2;
            if ((anuv2 = aoiv.d) == null) {
                anuv2 = anuv.a;
            }
            aoix = (aoix)anuv2.rx((ahaq)SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer);
        }
        if (aoix != null) {
            if (this.e == null) {
                this.e = this.d.b(this.c);
            }
            this.c.addView((View)this.e.c);
            this.e.b(ackm, aoix);
        }
        final ViewGroup c = this.c;
        if (aoix == null) {
            b3 = false;
        }
        tpe.v((View)c, b3);
    }
}
