import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class an extends ak
{
    public final ArrayList al;
    
    public an() {
        this.al = new ArrayList();
    }
    
    public void D() {
        this.q();
        final ArrayList al = this.al;
        if (al == null) {
            return;
        }
        for (int size = al.size(), i = 0; i < size; ++i) {
            final ak ak = this.al.get(i);
            if (ak instanceof an) {
                ((an)ak).D();
            }
        }
    }
    
    public final void F(final ak ak) {
        this.al.remove(ak);
        ak.r = null;
    }
    
    public void i() {
        this.al.clear();
        super.i();
    }
    
    public final void n(int i, int size) {
        super.n(i, size);
        for (size = this.al.size(), i = 0; i < size; ++i) {
            this.al.get(i).n(super.w + super.A, super.x + super.B);
        }
    }
    
    public final void q() {
        super.q();
        final ArrayList al = this.al;
        if (al == null) {
            return;
        }
        for (int size = al.size(), i = 0; i < size; ++i) {
            final ak ak = this.al.get(i);
            ak.n(this.b(), this.c());
            if (!(ak instanceof al)) {
                ak.q();
            }
        }
    }
    
    public final void z(final cdn cdn) {
        super.z(cdn);
        for (int size = this.al.size(), i = 0; i < size; ++i) {
            ((ak)this.al.get(i)).z(cdn);
        }
    }
}
