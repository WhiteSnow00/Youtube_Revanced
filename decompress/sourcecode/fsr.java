import android.view.View;
import android.widget.ImageView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fsr implements View$OnClickListener
{
    final /* synthetic */ abns a;
    final /* synthetic */ CommandOuterClass$Command b;
    final /* synthetic */ arhr c;
    final /* synthetic */ ImageView d;
    final /* synthetic */ CommandOuterClass$Command e;
    final /* synthetic */ dsw f;
    
    public fsr(final abns a, final CommandOuterClass$Command b, final arhr c, final ImageView d, final CommandOuterClass$Command e, final dsw f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void onClick(final View view) {
        final orr f = orr.a().f();
        if (this.a.o().f() && this.b != null) {
            ((ort)this.c.a()).a(this.b, f).X();
            this.d.setImageResource(2131232458);
        }
        else if (this.e != null) {
            ((ort)this.c.a()).a(this.e, f).X();
            this.d.setImageResource(2131232454);
        }
        this.d.setColorFilter(tmy.cn(this.f.b, 2130970924));
    }
}
