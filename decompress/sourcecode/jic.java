import com.google.android.apps.youtube.app.common.widget.WrappingTextViewForClarifyBox;
import android.view.ViewGroup;
import android.os.Handler;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jic extends jib
{
    private final TextView l;
    private final TextView m;
    
    public jic(final Context context, final aceo aceo, final vax vax, final acnj acnj, final Handler handler, final acng acng, final ViewGroup viewGroup) {
        super(context, aceo, vax, acnj, handler, acng, 2131624185, viewGroup);
        this.l = (TextView)this.g.findViewById(2131429196);
        this.m = (TextView)this.g.findViewById(2131431332);
    }
    
    protected final void f(final aijg aijg) {
        super.f(aijg);
        final TextView l = this.l;
        ajsq ajsq;
        if ((ajsq = aijg.j) == null) {
            ajsq = ajsq.a;
        }
        tmy.t(l, (CharSequence)abyh.b(ajsq));
        final TextView m = this.m;
        ajsq ajsq2;
        if ((ajsq2 = aijg.k) == null) {
            ajsq2 = ajsq.a;
        }
        tmy.t(m, (CharSequence)abyh.b(ajsq2));
        final WrappingTextViewForClarifyBox h = this.h;
        ajsq ajsq3;
        if ((ajsq3 = aijg.e) == null) {
            ajsq3 = ajsq.a;
        }
        tmy.t((TextView)h, (CharSequence)abyh.b(ajsq3));
    }
    
    public final void g(final int n, final boolean b) {
    }
}
