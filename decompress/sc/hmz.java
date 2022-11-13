import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class hmz extends LinearLayoutManager
{
    final hne a;
    
    public hmz(final hne a, final Context context) {
        this.a = a;
        super((int)(a.u ? 1 : 0));
        a.E = 117.46f / ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getWidth();
    }
    
    public final boolean ae() {
        final hne a = this.a;
        if (!a.u && !a.p()) {
            return !a.f.c;
        }
        return super.ae();
    }
    
    public final boolean af() {
        final hne a = this.a;
        if (a.u && !a.p()) {
            final hnk f = a.f;
            return !f.c && f.g;
        }
        return super.af();
    }
    
    public final void ao(final RecyclerView recyclerView, final int b) {
        final hna hna = new hna(this.a, recyclerView.getContext());
        hna.b = b;
        ((nw)this).bf((oj)hna);
    }
}
