import android.view.ViewGroup;
import android.os.Handler;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jid extends jib
{
    private final TextView l;
    
    public jid(final Context context, final aceo aceo, final vax vax, final acnj acnj, final Handler handler, final acng acng, final int n, final ViewGroup viewGroup) {
        super(context, aceo, vax, acnj, handler, acng, n, viewGroup);
        this.l = (TextView)this.g.findViewById(2131429196);
    }
    
    protected final void f(final aijg aijg) {
        super.f(aijg);
        final TextView l = this.l;
        ajsq ajsq;
        if ((ajsq = aijg.j) == null) {
            ajsq = ajsq.a;
        }
        tmy.t(l, (CharSequence)abyh.b(ajsq));
    }
}
