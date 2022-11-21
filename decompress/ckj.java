// 
// Decompiled by Procyon v0.6.0
// 

class ckj extends cjd
{
    protected aig[] m;
    String n;
    int o;
    int p;
    
    public ckj() {
        this.m = null;
        this.o = 0;
    }
    
    public ckj(final ckj ckj) {
        this.m = null;
        this.o = 0;
        this.n = ckj.n;
        final int p = ckj.p;
        this.p = 0;
        this.m = vi.c(ckj.m);
    }
    
    public aig[] getPathData() {
        return this.m;
    }
    
    public String getPathName() {
        return this.n;
    }
    
    public boolean n() {
        return false;
    }
    
    public void setPathData(final aig[] array) {
        final aig[] m = this.m;
        Label_0154: {
            if (m != null) {
                if (array != null) {
                    if (m.length == array.length) {
                        for (int i = 0; i < m.length; ++i) {
                            final aig aig = m[i];
                            final char a = aig.a;
                            final aig aig2 = array[i];
                            if (a != aig2.a || aig.b.length != aig2.b.length) {
                                break Label_0154;
                            }
                        }
                        final aig[] j = this.m;
                        for (int k = 0; k < array.length; ++k) {
                            j[k].a = array[k].a;
                            int n = 0;
                            while (true) {
                                final float[] b = array[k].b;
                                if (n >= b.length) {
                                    break;
                                }
                                j[k].b[n] = b[n];
                                ++n;
                            }
                        }
                        return;
                    }
                }
            }
        }
        this.m = vi.c(array);
    }
}
