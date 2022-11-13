import java.util.Map;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

final class gjc extends gje
{
    public final TextView a;
    final gjf b;
    
    public gjc(final gjf b, final View view) {
        super(this.b = b, view);
        this.a = (TextView)view.findViewById(2131428624);
    }
    
    @Override
    public final void a(final int n) {
        super.a(n);
        final glx g = this.g;
        g.getClass();
        if (this.a != null) {
            final Map b = this.b.b.b;
            if (b != null && b.containsKey(g)) {
                this.a.setText((int)this.b.b.b.get(g));
            }
        }
        if (this.c != null) {
            if (this.b.b.a() == g) {
                if (this.b.b.d.isPresent() && ((vai)this.b.b.d.get()).aU()) {
                    this.d.setBackgroundColor(tpe.cr(this.b.b.getContext(), 2130970829));
                }
                else {
                    this.d.setBackgroundColor(tpe.cr(this.b.b.getContext(), 2130970822));
                }
            }
            int n2 = (int)this.b.b.getResources().getDimension(2131170215);
            int n3;
            if (n == 0) {
                n3 = n2;
            }
            else {
                n3 = 0;
            }
            if (n != this.b.getCount() - 1) {
                n2 = 0;
            }
            this.c.setPadding(0, n3, 0, n2);
        }
    }
}
