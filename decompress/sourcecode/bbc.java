import java.util.Collections;
import java.util.Map;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bbc implements bbk
{
    private final boolean a;
    private final ArrayList b;
    private int c;
    private bbo d;
    
    protected bbc(final boolean a) {
        this.a = a;
        this.b = new ArrayList(1);
    }
    
    public final void e(final bcn bcn) {
        dk.d((Object)bcn);
        if (!this.b.contains(bcn)) {
            this.b.add(bcn);
            ++this.c;
        }
    }
    
    protected final void g(final int n) {
        final bbo d = this.d;
        final int a = baw.a;
        for (int i = 0; i < this.c; ++i) {
            ((bcn)this.b.get(i)).a((bbk)this, d, this.a, n);
        }
    }
    
    protected final void h() {
        final bbo d = this.d;
        final int a = baw.a;
        for (int i = 0; i < this.c; ++i) {
            ((bcn)this.b.get(i)).b((bbk)this, d, this.a);
        }
        this.d = null;
    }
    
    protected final void i(final bbo bbo) {
        for (int i = 0; i < this.c; ++i) {
            ((bcn)this.b.get(i)).c((bbk)this, bbo, this.a);
        }
    }
    
    protected final void j(final bbo d) {
        this.d = d;
        for (int i = 0; i < this.c; ++i) {
            ((bcn)this.b.get(i)).d((bbk)this, d, this.a);
        }
    }
}
