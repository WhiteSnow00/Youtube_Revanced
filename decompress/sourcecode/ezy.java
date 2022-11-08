import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezy extends acja
{
    private final acio a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final gkv e;
    private aiid f;
    
    public ezy(final Context context, final giz a, final hmb hmb, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = (acio)a;
        final View inflate = View.inflate(context, 2131624171, (ViewGroup)null);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(2131432089);
        this.d = (TextView)inflate.findViewById(2131432088);
        this.e = hmb.b((TextView)inflate.findViewById(2131432087));
        a.c(inflate);
    }
    
    public final View a() {
        return ((giz)this.a).a;
    }
    
    public final void c(final acir acir) {
    }
}
