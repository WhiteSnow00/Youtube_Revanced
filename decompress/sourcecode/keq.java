import android.widget.TextView;
import android.view.View$OnClickListener;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class keq implements acil
{
    public final View a;
    public final Object b;
    public final Object c;
    public Object d;
    private final /* synthetic */ int e;
    
    public keq(final Activity activity, final aceo c, final vax vax, final ViewGroup viewGroup, final int e) {
        this.e = e;
        this.c = c;
        viewGroup.getClass();
        final ImageView a = (ImageView)LayoutInflater.from((Context)activity).inflate(2131625037, viewGroup, false);
        this.a = (View)a;
        final kdw onClickListener = new kdw(this, vax, 19, null);
        final ImageView imageView = a;
        a.setOnClickListener((View$OnClickListener)onClickListener);
        final acej a2 = acek.a();
        a2.b(2131232282);
        this.b = a2.a();
    }
    
    public keq(final Context context, final int e) {
        this.e = e;
        final View inflate = View.inflate(context, 2131624420, (ViewGroup)null);
        this.a = inflate;
        this.c = inflate.findViewById(2131429856);
        final View viewById = inflate.findViewById(2131429898);
        this.b = viewById;
        final jtw onClickListener = new jtw(this, 18);
        final View view = viewById;
        viewById.setOnClickListener((View$OnClickListener)onClickListener);
    }
    
    public keq(final Context context, final aceo aceo, final vax vax, final fvf fvf, final acnj acnj, final ViewGroup viewGroup, final int e) {
        this.e = e;
        final View inflate = LayoutInflater.from(context).inflate(2131624231, viewGroup, false);
        this.a = inflate;
        this.b = new kdp(context, aceo, fvf, acnj, inflate, 2131428077);
        this.c = new kdp(context, aceo, fvf, acnj, inflate, 2131429518);
        inflate.setOnClickListener((View$OnClickListener)new jjz(this, vax, 20, null));
        inflate.setTag(2131430139, (Object)new jji(this, 2, (byte[])null));
    }
    
    public final View a() {
        final int e = this.e;
        if (e == 0) {
            return this.a;
        }
        if (e != 1) {
            return this.a;
        }
        return this.a;
    }
    
    public final void c(final acir acir) {
        final int e = this.e;
        if (e != 0) {
            if (e != 1) {
                ((aceo)this.c).d((ImageView)this.a);
                return;
            }
            ((kdp)this.b).b();
            ((kdp)this.c).b();
        }
    }
}
