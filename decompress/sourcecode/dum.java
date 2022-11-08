// 
// Decompiled by Procyon v0.6.0
// 

public class dum implements dui
{
    public duu b;
    public final int c;
    public final Object[] d;
    
    protected dum(final duu duu, final int n) {
        this(duu, n, null);
    }
    
    public dum(final duu b, final int c, final Object[] d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public boolean c(final dum dum) {
        if (this == dum) {
            return true;
        }
        if (dum == null) {
            return false;
        }
        if (dum.getClass() != this.getClass()) {
            return false;
        }
        if (this.c != dum.c) {
            return false;
        }
        final Object[] d = this.d;
        final Object[] d2 = dum.d;
        if (d == d2) {
            return true;
        }
        if (d != null) {
            if (d2 != null) {
                if (d.length == d2.length) {
                    int n = 1;
                    while (true) {
                        final Object[] d3 = this.d;
                        if (n >= d3.length) {
                            return true;
                        }
                        final Object o = d3[n];
                        final Object o2 = dum.d[n];
                        if (o == null) {
                            if (o2 != null) {
                                break;
                            }
                        }
                        else if (!o.equals(o2)) {
                            break;
                        }
                        ++n;
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    public void ls(final Object o) {
        this.b.l().P(this, o);
    }
    
    @Override
    public final String toString() {
        final duu b = this.b;
        String s;
        if (b != null && b != this) {
            s = b.toString();
        }
        else {
            s = super.toString();
        }
        return s;
    }
}
