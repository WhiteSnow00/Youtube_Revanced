import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyw
{
    public final ArrayList a;
    public boolean b;
    public boolean c;
    public final abcr d;
    public final eg e;
    public qpt f;
    
    public dyw(final abcr d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = new eg((byte[])null);
        this.a = new ArrayList();
        this.b = false;
        this.c = false;
        this.d = d;
    }
    
    public final void a(final dzc dzc, final dzc dzc2, final String s) {
        if (!this.c) {
            final eg e = this.e;
            ((ArrayList)e.d).add(dzc);
            ((ArrayList)e.b).add(dzc2);
            ((ArrayList)e.c).add(s);
            this.a.add(dzc);
            this.a.add(dzc2);
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
            final dzc dzc = ((ArrayList)e.d).get(i);
            final dzc dzc2 = ((ArrayList)e.b).get(i);
            final String s = ((ArrayList)e.c).get(i);
            if (dzc2.g(s) == dzc) {
                eg.D(dzc, dzc2, s);
            }
        }
    }
}
