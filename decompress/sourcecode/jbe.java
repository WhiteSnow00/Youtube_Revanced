import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbe implements jbc
{
    public final asho a;
    public final int b;
    private final aays c;
    private final asho d;
    private final int e;
    
    public jbe(final aays c, final asho a, final asho d, final int e, final int b) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.b = b;
    }
    
    public final asgn a(asgn c) {
        final aays c2 = this.c;
        final int e = this.e;
        final ardu m = new ardu(e, (byte[])null);
        c2.m = m;
        if (e < c2.n(abcg.f).length) {
            ((atit)m.b).tu();
        }
        c2.m(3);
        c = ((asgn)m.b).T((Object)true).n((ashs)c.S((Callable)eiy.c)).c((asjc)new jax(this, 2)).A((asgq)c).C(this.d);
        final aays c3 = this.c;
        c3.getClass();
        return c.o((asir)new jbd(c3, 0));
    }
    
    public final boolean b() {
        return true;
    }
}
