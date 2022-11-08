import android.content.res.Resources;
import android.text.Spanned;
import android.view.ViewGroup$LayoutParams;
import java.util.List;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkb extends kcs implements jkh
{
    private final TextView C;
    private final TextView D;
    private final acih a;
    private final acio b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    
    public jkb(final Context context, final aceo aceo, final vax vax, final giz b, final uyi uyi) {
        super(context, aceo, vax, (acio)b, 2131625785, (ViewGroup)null, (qbo)null, (cxz)null, (jjg)null, uyi, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        b.getClass();
        this.b = (acio)b;
        this.a = new acih(vax, (acio)b);
        final View i = super.i;
        this.c = i.findViewById(2131432026);
        this.d = (TextView)i.findViewById(2131432149);
        this.e = (TextView)i.findViewById(2131432153);
        this.f = (TextView)i.findViewById(2131427850);
        this.C = (TextView)i.findViewById(2131427856);
        this.D = (TextView)i.findViewById(2131427549);
    }
    
    private static void b(final View view, final int n) {
        ana.ab(view, n, view.getPaddingTop(), ana.i(view), view.getPaddingBottom());
    }
    
    public final View a() {
        return ((giz)this.b).a;
    }
    
    public final void c(final acir acir) {
        super.c(acir);
        this.a.c();
    }
    
    public final TextView f() {
        return this.D;
    }
    
    public final TextView g() {
        return this.f;
    }
    
    public final TextView h() {
        return this.C;
    }
    
    public final TextView i() {
        return super.n;
    }
    
    public final TextView j() {
        return this.d;
    }
    
    public final TextView l() {
        return this.e;
    }
}
