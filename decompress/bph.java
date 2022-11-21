import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bph implements axz
{
    public static final bph a;
    public final int b;
    private final afgh c;
    private int d;
    
    static {
        a = new bph(new azo[0]);
    }
    
    public bph(final azo... array) {
        this.c = afgh.p(array);
        this.b = array.length;
        int n;
        for (int i = 0; i < ((afjx)this.c).c; i = n) {
            int n2;
            n = (n2 = i + 1);
            while (true) {
                final afgh c = this.c;
                if (n2 >= ((afjx)c).c) {
                    break;
                }
                if (((azo)c.get(i)).equals(this.c.get(n2))) {
                    baq.b("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
                ++n2;
            }
        }
    }
    
    public final int a(final azo azo) {
        final int index = this.c.indexOf(azo);
        if (index >= 0) {
            return index;
        }
        return -1;
    }
    
    public final azo b(final int n) {
        return this.c.get(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bph bph = (bph)o;
                if (this.b == bph.b && agpx.T(this.c, bph.c)) {
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
