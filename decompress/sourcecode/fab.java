import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class fab extends ftl
{
    final /* synthetic */ fad a;
    private final fwd f;
    private final fve g;
    private final acih h;
    private final View i;
    private boolean j;
    
    public fab(final fad a) {
        this.a = a;
        super(a.a, a.b, 2131624498);
        this.h = a.g.V((acio)a.c);
        this.i = super.b.findViewById(2131428145);
        final TextView textView = (TextView)super.b.findViewById(2131431807);
        final fwd k = a.f.k(super.b.findViewById(2131431815));
        this.f = k;
        this.g = a.e.a(textView, k);
    }
    
    public final View a() {
        return super.b;
    }
    
    public final void c(final acir acir) {
        this.h.c();
        this.g.f();
    }
}
