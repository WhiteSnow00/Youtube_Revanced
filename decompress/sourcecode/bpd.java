import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpd implements axx
{
    public static final bpd a;
    public final int b;
    private final afcr c;
    private int d;
    
    static {
        a = new bpd(new azm[0]);
    }
    
    public bpd(final azm... array) {
        this.c = afcr.p((Object[])array);
        this.b = array.length;
        int n;
        for (int i = 0; i < ((afgh)this.c).c; i = n) {
            int n2;
            n = (n2 = i + 1);
            while (true) {
                final afcr c = this.c;
                if (n2 >= ((afgh)c).c) {
                    break;
                }
                if (((azm)c.get(i)).equals(this.c.get(n2))) {
                    bao.b("TrackGroupArray", "", (Throwable)new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
                ++n2;
            }
        }
    }
    
    public final int a(final azm azm) {
        final int index = this.c.indexOf((Object)azm);
        if (index >= 0) {
            return index;
        }
        return -1;
    }
    
    public final azm b(final int n) {
        return (azm)this.c.get(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bpd bpd = (bpd)o;
                if (this.b == bpd.b && adwd.ar((List)this.c, bpd.c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int d;
        if ((d = this.d) == 0) {
            d = this.c.hashCode();
            this.d = d;
        }
        return d;
    }
}
