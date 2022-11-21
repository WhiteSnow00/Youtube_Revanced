import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1;
import android.content.Context;
import android.view.LayoutInflater;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public class arnz extends ContextWrapper
{
    public br a;
    public LayoutInflater b;
    public LayoutInflater c;
    private final aun d;
    
    public arnz(final Context context, final br a) {
        areq.w(context);
        super(context);
        final ViewComponentManager$FragmentContextWrapper$1 d = new ViewComponentManager$FragmentContextWrapper$1(this);
        this.d = (aun)d;
        this.b = null;
        this.a = a;
        a.getLifecycle().b((auo)d);
    }
    
    public arnz(final LayoutInflater b, final br a) {
        areq.w(b);
        final Context context = b.getContext();
        areq.w(context);
        super(context);
        final ViewComponentManager$FragmentContextWrapper$1 d = new ViewComponentManager$FragmentContextWrapper$1(this);
        this.d = (aun)d;
        this.b = b;
        this.a = a;
        a.getLifecycle().b((auo)d);
    }
    
    public final br a() {
        areq.x(this.a, "The fragment has already been destroyed.");
        return this.a;
    }
    
    public final Object getSystemService(final String s) {
        if (!"layout_inflater".equals(s)) {
            return this.getBaseContext().getSystemService(s);
        }
        if (this.c == null) {
            if (this.b == null) {
                this.b = (LayoutInflater)this.getBaseContext().getSystemService("layout_inflater");
            }
            this.c = this.b.cloneInContext((Context)this);
        }
        return this.c;
    }
}
