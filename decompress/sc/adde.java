import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adde implements acko
{
    public final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    
    public adde(final Context context) {
        final View inflate = View.inflate(context, 2131625374, (ViewGroup)null);
        this.a = inflate;
        this.b = (TextView)inflate.findViewById(2131431687);
        this.c = (TextView)inflate.findViewById(2131431689);
        this.d = (TextView)inflate.findViewById(2131428443);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void b(final apab apab) {
        final int b = apab.b;
        if ((b & 0x1) != 0x0 && (b & 0x2) != 0x0 && (b & 0x4) != 0x0) {
            final TextView b2 = this.b;
            ajut ajut;
            if ((ajut = apab.c) == null) {
                ajut = ajut.a;
            }
            b2.setText((CharSequence)acak.b(ajut));
            final TextView c = this.c;
            ajut ajut2;
            if ((ajut2 = apab.d) == null) {
                ajut2 = ajut.a;
            }
            c.setText((CharSequence)acak.b(ajut2));
            final TextView d = this.d;
            ajut ajut3;
            if ((ajut3 = apab.e) == null) {
                ajut3 = ajut.a;
            }
            d.setText((CharSequence)acak.b(ajut3));
        }
    }
    
    public final void c(final acku acku) {
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        this.b((apab)o);
    }
}
