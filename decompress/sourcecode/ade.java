import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ade extends add
{
    public int m;
    
    public ade(final adm adm) {
        super(adm);
        int l;
        if (adm instanceof adi) {
            l = 2;
        }
        else {
            l = 3;
        }
        this.l = l;
    }
    
    @Override
    public final void c(final int f) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = f;
        final Iterator iterator = this.j.iterator();
        while (iterator.hasNext()) {
            ((adb)iterator.next()).f();
        }
    }
}
