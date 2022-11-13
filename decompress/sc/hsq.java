import android.view.View;
import android.content.Context;
import j$.util.Optional;
import androidx.core.widget.NestedScrollView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsq extends utv
{
    public final accf a;
    public final acbm b;
    public final NestedScrollView c;
    public final hqv d;
    public final wyv e;
    public final boolean f;
    public ajut g;
    public Optional h;
    public int i;
    public final vai j;
    private final vcy k;
    
    public hsq(final cl cl, final Context context, final accf a, final acbm b, final vcy k, final hqv d, final wyv e, final Optional optional, final boolean f, final vai j) {
        super(context, cl, (wyw)null, optional, true, f, true);
        this.i = 0;
        this.a = a;
        this.b = b;
        this.k = k;
        this.f = f;
        this.c = new NestedScrollView(context);
        this.d = d;
        this.e = e;
        this.h = Optional.empty();
        this.j = j;
    }
    
    protected final View a() {
        return (View)this.c;
    }
    
    protected final String f() {
        final ajut g = this.g;
        String string;
        if (g == null) {
            string = "";
        }
        else {
            string = acak.b(g).toString();
        }
        return string;
    }
    
    public final void h() {
        super.h();
        this.g = null;
        this.b.c((acku)null);
        this.c.removeAllViews();
        if (this.h.isPresent()) {
            this.k.a((aiqj)this.h.get());
            this.h = Optional.empty();
        }
        final int i = this.i;
        if (i != 0) {
            this.d.c(i);
            this.i = 0;
        }
    }
}
