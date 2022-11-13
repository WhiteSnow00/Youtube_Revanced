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
public final class fuj implements View$OnClickListener, AdapterView$OnItemClickListener
{
    public static final WeakHashMap a;
    public final LayoutInflater b;
    public final fuh c;
    private final Activity d;
    private final nb e;
    private View f;
    
    static {
        a = new WeakHashMap();
    }
    
    public fuj(final Activity d) {
        d.getClass();
        this.d = d;
        this.b = d.getLayoutInflater();
        d.getResources();
        final fuh c = new fuh(this);
        this.c = c;
        final nb e = new nb((Context)d);
        this.e = e;
        e.f = (int)d.getResources().getDimension(2131166972);
        e.z();
        e.e((ListAdapter)c);
        e.m = (AdapterView$OnItemClickListener)this;
        fuj.a.put(this, null);
    }
    
    public final void a() {
        if (this.f != null) {
            this.f = null;
            this.e.m();
        }
    }
    
    public final void b(final String s, final fui fui) {
        final fuh c = this.c;
        final int size = c.a.size();
        final fzw fzw = new fzw(c.d++, s, fui);
        c.a.add(size, fzw);
        c.b.put((int)fzw.a, (Object)fzw);
        c.notifyDataSetChanged();
        ((Integer)fzw.a).intValue();
    }
    
    public final void onClick(final View view) {
        this.c.notifyDataSetChanged();
        this.f = view;
        this.e.f = (int)tpe.f((Context)this.d, (float)tpe.h((Context)this.d, (ListAdapter)this.c, (ViewGroup)null), this.d.getResources().getDimension(2131166973));
        final nb e = this.e;
        e.j = 8388661;
        e.l = view;
        e.v();
    }
    
    public final void onItemClick(final AdapterView adapterView, View f, final int n, final long n2) {
        final Object a = ((hft)this.c.c.get(n).b).a;
        if (a != null) {
            f = this.f;
            if (f != null) {
                ((fui)a).a(f.getTag());
                this.a();
            }
        }
    }
}
