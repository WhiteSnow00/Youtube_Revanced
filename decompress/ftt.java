import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ftt implements acko
{
    private final acgs a;
    public final View b;
    protected final TextView c;
    protected final TextView d;
    protected final TextView e;
    private final ImageView f;
    private final acgo g;
    
    public ftt(final Context context, final acgs a, final int n) {
        a.getClass();
        this.a = a;
        final View inflate = LayoutInflater.from(context).inflate(n, (ViewGroup)null);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(2131428131);
        this.d = (TextView)inflate.findViewById(2131432302);
        this.e = (TextView)inflate.findViewById(2131431813);
        this.f = (ImageView)inflate.findViewById(2131428086);
        final acgn b = a.b().b();
        b.b(2131232282);
        this.g = b.a();
    }
    
    public final void b(final aotp aotp) {
        this.a.j(this.f, aotp, this.g);
    }
    
    public final void d(final CharSequence charSequence) {
        tpe.t(this.e, charSequence);
    }
    
    public final void f(final CharSequence text) {
        this.c.setText(text);
    }
}
