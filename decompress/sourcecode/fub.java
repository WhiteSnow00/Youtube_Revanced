import android.widget.AdapterView;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.content.Context;
import android.view.View;
import android.app.Activity;
import android.view.LayoutInflater;
import java.util.WeakHashMap;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class fub implements View$OnClickListener, AdapterView$OnItemClickListener
{
    public static final WeakHashMap a;
    public final LayoutInflater b;
    public final ftz c;
    private final Activity d;
    private final nb e;
    private View f;
    
    static {
        a = new WeakHashMap();
    }
    
    public fub(final Activity d) {
        d.getClass();
        this.d = d;
        this.b = d.getLayoutInflater();
        d.getResources();
        final ftz c = new ftz(this);
        this.c = c;
        final nb e = new nb((Context)d);
        this.e = e;
        e.f = (int)d.getResources().getDimension(2131166973);
        e.z();
        e.e((ListAdapter)c);
        e.m = (AdapterView$OnItemClickListener)this;
        fub.a.put(this, null);
    }
    
    public final void a() {
        if (this.f != null) {
            this.f = null;
            this.e.m();
        }
    }
    
    public final void b(final String s, final fua fua) {
        final ftz c = this.c;
        final int size = c.a.size();
        final fzo fzo = new fzo(c.d++, s, fua);
        c.a.add(size, fzo);
        c.b.put((int)fzo.a, (Object)fzo);
        c.notifyDataSetChanged();
        ((Integer)fzo.a).intValue();
    }
    
    public final void onClick(final View view) {
        this.c.notifyDataSetChanged();
        this.f = view;
        this.e.f = (int)tmy.f((Context)this.d, (float)tmy.h((Context)this.d, (ListAdapter)this.c, (ViewGroup)null), this.d.getResources().getDimension(2131166974));
        final nb e = this.e;
        e.j = 8388661;
        e.l = view;
        e.v();
    }
    
    public final void onItemClick(final AdapterView adapterView, View f, final int n, final long n2) {
        final Object b = ((hez)this.c.c.get(n).b).b;
        if (b != null) {
            f = this.f;
            if (f != null) {
                ((fua)b).a(f.getTag());
                this.a();
            }
        }
    }
}
