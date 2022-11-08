import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbb implements acil
{
    public final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    
    public adbb(final Context context) {
        final View inflate = View.inflate(context, 2131625369, (ViewGroup)null);
        this.a = inflate;
        this.b = (TextView)inflate.findViewById(2131431684);
        this.c = (TextView)inflate.findViewById(2131431686);
        this.d = (TextView)inflate.findViewById(2131428443);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void b(final aoxx aoxx) {
        final int b = aoxx.b;
        if ((b & 0x1) != 0x0 && (b & 0x2) != 0x0 && (b & 0x4) != 0x0) {
            final TextView b2 = this.b;
            ajsq ajsq;
            if ((ajsq = aoxx.c) == null) {
                ajsq = ajsq.a;
            }
            b2.setText((CharSequence)abyh.b(ajsq));
            final TextView c = this.c;
            ajsq ajsq2;
            if ((ajsq2 = aoxx.d) == null) {
                ajsq2 = ajsq.a;
            }
            c.setText((CharSequence)abyh.b(ajsq2));
            final TextView d = this.d;
            ajsq ajsq3;
            if ((ajsq3 = aoxx.e) == null) {
                ajsq3 = ajsq.a;
            }
            d.setText((CharSequence)abyh.b(ajsq3));
        }
    }
    
    public final void c(final acir acir) {
    }
}
