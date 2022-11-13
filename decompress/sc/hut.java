import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hut extends acld
{
    public final vcy a;
    private final ImageButton b;
    private final View c;
    private final View d;
    private final kja e;
    
    public hut(final Context context, final vcy a, final kja e, final byte[] array, final byte[] array2) {
        this.a = a;
        this.e = e;
        final View inflate = LayoutInflater.from(context).inflate(2131624830, (ViewGroup)null);
        this.c = inflate;
        final ImageButton b = (ImageButton)inflate.findViewById(2131429748);
        this.b = b;
        this.d = inflate.findViewById(2131429750);
        final Drawable drawable = context.getDrawable(2131233757);
        if (drawable != null) {
            b.setImageDrawable((Drawable)new zge(context, new tqb(context).b(drawable, tpe.cr(context, 2130970881))));
        }
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acku acku) {
        this.d.setOnClickListener((View$OnClickListener)null);
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        final amco amco = (amco)o;
        return null;
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final amco amco = (amco)o;
        final kja e = this.e;
        e.g = this.c.findViewById(2131429749);
        final aujg aujg = new aujg(e.a, (ImageView)e.g, (acgs)e.f);
        ((asiq)e.c).c(((zhk)e.b).h().af((asid)e.e).aH((asjm)new gng(e, amco, aujg, 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null)));
        if (((zhk)e.b).c() == null) {
            e.d(amco, aujg);
        }
        this.d.setOnClickListener((View$OnClickListener)new hqd(this, amco, 9));
    }
}
