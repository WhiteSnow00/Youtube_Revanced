import com.facebook.litho.ComponentTree;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtg
{
    public final dsx a;
    public boolean b;
    public dst c;
    public boolean d;
    public boolean e;
    public boolean f;
    public dvk g;
    public dws h;
    public boolean i;
    public dtj j;
    public boolean k;
    public final dul l;
    public boolean m;
    public String n;
    public msr o;
    
    public dtg(final dsx a) {
        this.b = true;
        this.d = true;
        this.e = false;
        this.f = true;
        this.i = false;
        this.k = dyp.j;
        this.l = dtx.a;
        this.m = dyp.l;
        this.a = a;
    }
    
    public final ComponentTree a() {
        if (this.c == null) {
            this.c = dwo.b(this.a).a;
        }
        if (this.o != null && this.n == null) {
            this.n = this.c.q();
        }
        return new ComponentTree(this);
    }
}
