import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adg extends adf
{
    public int m;
    
    public adg(final ado ado) {
        super(ado);
        int l;
        if (ado instanceof adk) {
            l = 2;
        }
        else {
            l = 3;
        }
        this.l = l;
    }
    
    public final void c(final int f) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = f;
        final Iterator iterator = this.j.iterator();
        while (iterator.hasNext()) {
            ((add)iterator.next()).f();
        }
    }
}
