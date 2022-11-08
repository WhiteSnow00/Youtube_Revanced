import java.util.concurrent.CopyOnWriteArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class dxz implements dxx
{
    private final CopyOnWriteArrayList a;
    
    public dxz() {
        this.a = new CopyOnWriteArrayList();
    }
    
    @Override
    public final void a(final dxy dxy) {
        this.a.add(dxy);
    }
    
    @Override
    public final void c(final dxy dxy) {
        this.a.remove(dxy);
    }
    
    final void g() {
        int size = this.a.size();
        while (--size >= 0) {
            ((dxy)this.a.get(size)).b(this);
        }
    }
    
    public final void h() {
        int size = this.a.size();
        while (--size >= 0) {
            ((dxy)this.a.get(size)).c(this);
        }
    }
    
    final void i() {
        int size = this.a.size();
        while (--size >= 0) {
            ((dxy)this.a.get(size)).d(this);
        }
    }
    
    final boolean j() {
        int size = this.a.size();
        int n;
        do {
            n = size - 1;
            if (n < 0) {
                return true;
            }
            size = n;
        } while (((dxy)this.a.get(n)).e(this));
        return false;
    }
}
