import android.graphics.drawable.Drawable;
import android.widget.GridLayout$LayoutParams;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxa extends acja
{
    private final aceo a;
    private final acio b;
    private final acih c;
    private final Resources d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final acqu k;
    private final TextView l;
    
    public fxa(final Context context, final aceo a, final aeby aeby, final zhb zhb, final giz b, final byte[] array, final byte[] array2) {
        this.c = aeby.V((acio)b);
        a.getClass();
        this.a = a;
        this.b = (acio)b;
        this.d = context.getResources();
        final View inflate = View.inflate(context, 2131624243, (ViewGroup)null);
        this.e = inflate;
        this.f = (ImageView)inflate.findViewById(2131432006);
        this.g = (TextView)inflate.findViewById(2131431992);
        this.h = (TextView)inflate.findViewById(2131432092);
        this.i = (TextView)inflate.findViewById(2131431819);
        this.j = (TextView)inflate.findViewById(2131432148);
        final TextView l = (TextView)inflate.findViewById(2131430110);
        this.l = l;
        this.k = zhb.g(l);
        b.c(inflate);
    }
    
    public final View a() {
        return ((giz)this.b).a;
    }
    
    public final void c(final acir acir) {
        this.c.c();
    }
}
