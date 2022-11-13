import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hso extends acld
{
    private final View a;
    private final TextView b;
    private final TextView c;
    
    public hso(final Context context) {
        final View inflate = LayoutInflater.from(context).inflate(2131624222, (ViewGroup)null);
        this.a = inflate;
        this.b = (TextView)inflate.findViewById(2131428350);
        this.c = (TextView)inflate.findViewById(2131428351);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acku acku) {
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aitk)o).d.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aitk aitk = (aitk)o;
        final TextView b = this.b;
        ajut ajut;
        if ((ajut = aitk.b) == null) {
            ajut = ajut.a;
        }
        b.setText((CharSequence)acak.b(ajut));
        final TextView c = this.c;
        ajut ajut2;
        if ((ajut2 = aitk.c) == null) {
            ajut2 = ajut.a;
        }
        c.setText((CharSequence)acak.b(ajut2));
    }
}
