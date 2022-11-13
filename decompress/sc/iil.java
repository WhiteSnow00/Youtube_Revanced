import j$.util.Optional;
import java.util.concurrent.TimeoutException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iil implements aezf
{
    public static final iil a;
    public static final iil b;
    public static final iil c;
    public static final iil d;
    public static final iil e;
    public static final iil f;
    public static final iil g;
    public static final iil h;
    public static final iil i;
    public static final iil j;
    public static final iil k;
    public static final iil l;
    public static final iil m;
    public static final iil n;
    public static final iil o;
    public static final iil p;
    public static final iil q;
    public static final iil r;
    public static final iil s;
    public static final iil t;
    private final int u;
    
    static {
        t = new iil(20);
        s = new iil(18);
        r = new iil(17);
        q = new iil(16);
        p = new iil(15);
        o = new iil(14);
        n = new iil(13);
        m = new iil(12);
        l = new iil(11);
        k = new iil(10);
        j = new iil(9);
        i = new iil(8);
        h = new iil(7);
        g = new iil(6);
        f = new iil(5);
        e = new iil(4);
        d = new iil(3);
        c = new iil(2);
        b = new iil(1);
        a = new iil(0);
    }
    
    public iil(final int u) {
        this.u = u;
    }
    
    public final Object apply(final Object o) {
        switch (this.u) {
            default: {
                final ahaz builder = ((ahbh)o).toBuilder();
                builder.copyOnWrite();
                final fnd fnd = (fnd)builder.instance;
                fnd.b &= 0xFFFFFFFE;
                fnd.c = fnd.a.c;
                return builder.build();
            }
            case 19: {
                return o;
            }
            case 18: {
                final TimeoutException ex = (TimeoutException)o;
                return Optional.empty();
            }
            case 17: {
                return Optional.ofNullable((Object)o);
            }
            case 16: {
                return ajju.d((String)o);
            }
            case 15: {
                return glb.O((String)o);
            }
            case 14: {
                return glb.P((String)o);
            }
            case 13: {
                return glb.W((String)o);
            }
            case 12: {
                return glb.M((String)o);
            }
            case 11: {
                return glb.x((String)o);
            }
            case 10: {
                return o;
            }
            case 9: {
                return glb.Y((String)o);
            }
            case 8: {
                return glb.O((String)o);
            }
            case 7: {
                return glb.P((String)o);
            }
            case 6: {
                return glb.J((String)o);
            }
            case 5: {
                return o;
            }
            case 4: {
                return glb.W((String)o);
            }
            case 3: {
                return glb.M((String)o);
            }
            case 2: {
                ttr.d("Error adding the smart downloads MainVideoEntity", (Throwable)o);
                final aaby b = aabz.b.b();
                b.b = 17;
                return b.a();
            }
            case 1: {
                aabz aabz;
                if (o) {
                    aabz = aabz.a;
                }
                else {
                    final aaby b2 = aabz.b.b();
                    b2.b = 6;
                    aabz = b2.a();
                }
                return aabz;
            }
            case 0: {
                ttr.d("Error deleting the MainVideoEntity", (Throwable)o);
                final aaby b3 = aabz.c.b();
                b3.b = 44;
                return b3.a();
            }
        }
    }
}
