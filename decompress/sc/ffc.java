import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffc extends iw
{
    public boolean a;
    public RecyclerView b;
    public final toj c;
    public final tgd d;
    
    public ffc(final tgd d, final toj c, final RecyclerView b) {
        this.a = false;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public final void d() {
        if (this.a) {
            this.b.aH((iw)this);
        }
        this.a = false;
    }
    
    public final void py(final RecyclerView recyclerView, final int n, final int n2) {
        if (this.a && (n > 10 || n2 > 10)) {
            this.c.s(34);
            this.d.d((Object)new fim());
            this.d();
        }
    }
}
