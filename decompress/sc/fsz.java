import android.view.View;
import android.widget.ImageView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fsz implements View$OnClickListener
{
    final abpu a;
    final CommandOuterClass$Command b;
    final arkg c;
    final ImageView d;
    final CommandOuterClass$Command e;
    final dsx f;
    
    public fsz(final abpu a, final CommandOuterClass$Command b, final arkg c, final ImageView d, final CommandOuterClass$Command e, final dsx f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void onClick(final View view) {
        final ota f = ota.a().f();
        if (this.a.n().f() && this.b != null) {
            ((otc)this.c.a()).a(this.b, f).X();
            this.d.setImageResource(2131232458);
        }
        else if (this.e != null) {
            ((otc)this.c.a()).a(this.e, f).X();
            this.d.setImageResource(2131232454);
        }
        this.d.setColorFilter(tpe.cr(this.f.b, 2130970924));
    }
}
