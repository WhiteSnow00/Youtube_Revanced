import android.text.Spanned;
import java.util.function.Function;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import java.util.Iterator;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fty implements acil
{
    public final Object a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;
    
    public fty(final Context context, final int b) {
        this.b = b;
        final LinearLayout c = (LinearLayout)LayoutInflater.from(context).inflate(2131624773, (ViewGroup)null);
        this.c = c;
        final LinearLayout linearLayout = c;
        this.a = c.findViewById(2131428917);
        final LinearLayout linearLayout2 = c;
        this.d = c.findViewById(2131428919);
    }
    
    public fty(final Context context, final int n, final wwv a, final int b) {
        this.b = b;
        this.a = a;
        final View inflate = LayoutInflater.from(context).inflate(n, (ViewGroup)null);
        this.d = inflate;
        final View view = inflate;
        final TextView c = (TextView)inflate.findViewById(2131432092);
        this.c = c;
        final OptionalInt cv = tmy.cv(context, 2130970915);
        final TextView textView = c;
        cv.ifPresent((IntConsumer)new rix(c, 1));
        final Optional cr = tmy.cr(context, 2130970926);
        c.getClass();
        cr.ifPresent((Consumer)new lke(c, 14));
    }
    
    public fty(final Context d, final acng a, final int b) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = View.inflate(d, 17367043, (ViewGroup)null);
    }
    
    public fty(final Context d, final aeyr aeyr, final int b) {
        this.b = b;
        this.d = d;
        final acio a = (acio)aeyr.a();
        this.a = a;
        final View inflate = View.inflate(d, 2131624400, (ViewGroup)null);
        this.c = inflate;
        final View view = inflate;
        a.c(inflate);
    }
    
    public fty(final Context context, final ViewGroup viewGroup, final acnx c, final lzi a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = LayoutInflater.from(context).inflate(2131625800, viewGroup, false);
    }
    
    public fty(final Context context, final giz a, final int b) {
        this.b = b;
        context.getClass();
        a.getClass();
        this.a = a;
        final View inflate = View.inflate(context, 2131624424, (ViewGroup)null);
        this.d = inflate;
        final View view = inflate;
        this.c = inflate.findViewById(2131432092);
        final View view2 = inflate;
        a.c(inflate);
    }
    
    public fty(final Context context, final gtx gtx, final wwv a, final ViewGroup viewGroup, final int b, final byte[] array) {
        this.b = b;
        final TextView d = (TextView)LayoutInflater.from(context).inflate(2131625527, viewGroup, false);
        this.d = d;
        final TextView textView = d;
        this.c = gtx.d(d);
        this.a = a;
    }
    
    public fty(final Context context, final rjf rjf, final int b) {
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131624787, (ViewGroup)null);
        this.d = inflate;
        final View view = inflate;
        inflate.findViewById(2131427946).setVisibility(8);
        final View view2 = inflate;
        final TextView a = (TextView)inflate.findViewById(2131430009);
        this.a = a;
        final View view3 = inflate;
        this.c = inflate.findViewById(2131432006);
        final rhj onClickListener = new rhj(rjf, 9);
        final View view4 = inflate;
        inflate.setOnClickListener((View$OnClickListener)onClickListener);
        final OptionalInt cv = tmy.cv(context, 2130970914);
        final TextView textView = a;
        cv.ifPresent((IntConsumer)new rix(a, 0));
        final Optional cr = tmy.cr(context, 2130968579);
        a.getClass();
        cr.ifPresent((Consumer)new lke(a, 15));
    }
    
    public fty(final Context context, final vax a, final ViewGroup viewGroup, final int b) {
        this.b = b;
        this.a = a;
        final View inflate = LayoutInflater.from(context).inflate(2131625339, viewGroup, false);
        this.d = inflate;
        final View view = inflate;
        this.c = inflate.findViewById(2131431983);
    }
    
    public fty(final blt blt, final Context d, final uyi a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = blt.j(2131624820);
    }
    
    public static aexq b(final anww anww) {
        final int b = anww.b;
        agyc f;
        if ((b & 0x8) != 0x0) {
            f = anww.f;
        }
        else {
            f = null;
        }
        if (f != null && !f.H()) {
            return aexq.k((Object)new wws(f));
        }
        if ((b & 0x4) != 0x0) {
            ahfw ahfw;
            if ((ahfw = anww.e) == null) {
                ahfw = ahfw.a;
            }
            if (wya.d(ahfw.c)) {
                ahfw ahfw2;
                if ((ahfw2 = anww.e) == null) {
                    ahfw2 = ahfw.a;
                }
                return aexq.k((Object)new wws(wya.c(ahfw2.c)));
            }
        }
        return aewp.a;
    }
    
    public final View a() {
        switch (this.b) {
            default: {
                return (View)this.d;
            }
            case 8: {
                return (View)this.d;
            }
            case 7: {
                return ((acio)this.a).a();
            }
            case 6: {
                return (View)this.c;
            }
            case 5: {
                return ((giz)this.a).a;
            }
            case 4: {
                return (View)this.d;
            }
            case 3: {
                return ((fum)this.c).a;
            }
            case 2: {
                return (View)this.c;
            }
            case 1: {
                return (View)this.d;
            }
            case 0: {
                return (View)this.d;
            }
        }
    }
    
    public final void c(final acir acir) {
        final int b = this.b;
        if (b == 0) {
            for (evf evf : ((lzi)this.a).a) {}
            return;
        }
        if (b == 1) {
            ((fwh)this.c).g((aokt)null, (wwv)this.a);
            return;
        }
        if (b != 3) {
            return;
        }
        ((fum)this.c).c(acir);
    }
}
