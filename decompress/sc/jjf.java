import android.view.ViewGroup;
import android.os.Handler;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjf extends jjd
{
    private final TextView l;
    
    public jjf(final Context context, final acgs acgs, final vcy vcy, final acpn acpn, final Handler handler, final acpk acpk, final int n, final ViewGroup viewGroup) {
        super(context, acgs, vcy, acpn, handler, acpk, n, viewGroup);
        this.l = (TextView)this.g.findViewById(2131429196);
    }
    
    protected final void f(final aile aile) {
        super.f(aile);
        final TextView l = this.l;
        ajut ajut;
        if ((ajut = aile.j) == null) {
            ajut = ajut.a;
        }
        tpe.t(l, (CharSequence)acak.b(ajut));
    }
}
