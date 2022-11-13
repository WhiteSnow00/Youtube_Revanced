import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyx
{
    public final ArrayList a;
    public boolean b;
    public boolean c;
    public final abem d;
    public final eg e;
    public pvh f;
    
    public dyx(final abem d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = new eg((byte[])null);
        this.a = new ArrayList();
        this.b = false;
        this.c = false;
        this.d = d;
    }
    
    public final void a(final dzd dzd, final dzd dzd2, final String s) {
        if (!this.c) {
            final eg e = this.e;
            ((ArrayList)e.d).add(dzd);
            ((ArrayList)e.b).add(dzd2);
            ((ArrayList)e.c).add(s);
            this.a.add(dzd);
            this.a.add(dzd2);
            return;
        }
        throw new RuntimeException("Trying to add binding after DataFlowGraph has already been activated.");
    }
    
    public final void b() {
        if (!this.b) {
            return;
        }
        int i = 0;
        this.b = false;
        this.d.k(this);
        for (eg e = this.e; i < ((ArrayList)e.d).size(); ++i) {
            final dzd dzd = ((ArrayList)e.d).get(i);
            final dzd dzd2 = ((ArrayList)e.b).get(i);
            final String s = ((ArrayList)e.c).get(i);
            if (dzd2.g(s) == dzd) {
                eg.D(dzd, dzd2, s);
            }
        }
    }
}
