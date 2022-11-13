import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khs extends acld
{
    private final ackr a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final int e;
    private final int f;
    private final int g;
    
    public khs(final Context context, final gjh a) {
        this.a = (ackr)a;
        final View inflate = View.inflate(context, 2131625506, (ViewGroup)null);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(2131432095);
        this.d = (TextView)inflate.findViewById(2131428440);
        this.e = tpe.cx(context, 2130970924).orElse(0);
        this.f = tpe.cx(context, 2130970926).orElse(0);
        this.g = tpe.cx(context, 2130970922).orElse(0);
        a.c(inflate);
    }
    
    public final View a() {
        return ((gjh)this.a).a;
    }
    
    public final void c(final acku acku) {
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aokq)o).f.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aokq aokq = (aokq)o;
        final TextView c = this.c;
        final int b = aokq.b;
        final ajut ajut = null;
        ajut ajut2;
        if ((b & 0x1) != 0x0) {
            if ((ajut2 = aokq.c) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        c.setText((CharSequence)acak.b(ajut2));
        final TextView d = this.d;
        ajut ajut3 = ajut;
        if ((aokq.b & 0x2) != 0x0 && (ajut3 = aokq.d) == null) {
            ajut3 = ajut.a;
        }
        d.setText((CharSequence)acak.b(ajut3));
        if (aokq.e ^ true) {
            this.c.setTextColor(this.e);
            this.d.setTextColor(this.f);
        }
        else {
            this.c.setTextColor(this.g);
            this.d.setTextColor(this.g);
        }
        this.a.e(ackm);
    }
}
