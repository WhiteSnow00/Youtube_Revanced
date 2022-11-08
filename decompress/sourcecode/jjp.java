import android.text.Spanned;
import java.util.List;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

final class jjp extends kcs
{
    protected final Resources a;
    protected final LinearLayout b;
    protected final RelativeLayout c;
    private final acih d;
    private final acng e;
    private final ViewGroup f;
    
    public jjp(final Context context, final aceo aceo, final vax vax, final acio acio, final acng e, final uyi uyi) {
        super(context, aceo, vax, acio, 2131625772, null, null, uyi, null, null, null, null);
        this.a = context.getResources();
        this.d = new acih(vax, acio);
        final LinearLayout b = (LinearLayout)super.i.findViewById(2131432315);
        this.b = b;
        this.c = (RelativeLayout)b.findViewById(2131432026);
        this.f = (ViewGroup)b.findViewById(2131427768);
        this.e = e;
    }
    
    public final View a() {
        return super.i;
    }
    
    @Override
    public final void c(final acir acir) {
        super.c(acir);
        this.d.c();
    }
}
