// 
// Decompiled by Procyon v0.6.0
// 

class ckf extends ciw
{
    protected aie[] m;
    String n;
    int o;
    int p;
    
    public ckf() {
        this.m = null;
        this.o = 0;
    }
    
    public ckf(final ckf ckf) {
        this.m = null;
        this.o = 0;
        this.n = ckf.n;
        final int p = ckf.p;
        this.p = 0;
        this.m = vi.c(ckf.m);
    }
    
    public aie[] getPathData() {
        return this.m;
    }
    
    public String getPathName() {
        return this.n;
    }
    
    public boolean m() {
        return false;
    }
    
    public void setPathData(final aie[] array) {
        final aie[] m = this.m;
        Label_0151: {
            if (m != null) {
                if (array != null) {
                    if (m.length == array.length) {
                        for (int i = 0; i < m.length; ++i) {
                            final aie aie = m[i];
                            final char a = aie.a;
                            final aie aie2 = array[i];
                            if (a != aie2.a || aie.b.length != aie2.b.length) {
                                break Label_0151;
                            }
                        }
                        final aie[] j = this.m;
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
