import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ic implements iz
{
    protected final Context a;
    public Context b;
    public im c;
    public final LayoutInflater d;
    public iy e;
    public jb f;
    public int g;
    
    public ic(final Context a) {
        this.a = a;
        this.d = LayoutInflater.from(a);
    }
    
    public final int a() {
        return this.g;
    }
    
    public View b(final io io, final View view, final ViewGroup viewGroup) {
        throw null;
    }
    
    public void c(final Context context, final im im) {
        throw null;
    }
    
    public void d(final im im, final boolean b) {
        throw null;
    }
    
    public final void e(final iy iy) {
        throw null;
    }
    
    public boolean f() {
        throw null;
    }
    
    public boolean g(final jg jg) {
        throw null;
    }
    
    public final boolean h(final io io) {
        return false;
    }
    
    public final boolean i(final io io) {
        return false;
    }
    
    public void j() {
        throw null;
    }
}
