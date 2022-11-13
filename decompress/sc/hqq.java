import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqq implements View$OnClickListener
{
    public final hqu a;
    public final ansy b;
    public final boolean c;
    
    public hqq(final hqu a, final ansy b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onClick(final View view) {
        final hqu a = this.a;
        final ansy b = this.b;
        final boolean c = this.c;
        aiqj aiqj;
        if ((aiqj = b.f) == null) {
            aiqj = aiqj.a;
        }
        if (c && ((ahbc)aiqj).ry((ahaq)AddToToastActionOuterClass$AddToToastAction.addToToastAction) && (aiqj.b & 0x1) != 0x0) {
            a.c.pF().J(3, (wzz)new wyt(aiqj.c), (alhi)null);
        }
        a.b.a(aiqj);
    }
}
