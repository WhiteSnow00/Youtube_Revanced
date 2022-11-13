import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsk extends ahbh implements ahcw
{
    private static volatile ahdd C;
    public static final apsk a;
    public apsi A;
    public String B;
    private apsg D;
    private byte E;
    public int b;
    public int c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public float k;
    public float l;
    public String m;
    public aotp n;
    public apsl o;
    public int p;
    public amxr q;
    public apsn r;
    public apsb s;
    public ahcr t;
    public boolean u;
    public apsa v;
    public int w;
    public boolean x;
    public apse y;
    public ahab z;
    
    static {
        ahbh.registerDefaultInstance((Class)apsk.class, (ahbh)(a = new apsk()));
    }
    
    private apsk() {
        this.t = ahcr.a;
        this.E = 2;
        this.d = "";
        this.e = "";
        this.g = "";
        this.h = "";
        emptyProtobufList();
        this.m = "";
        this.z = ahab.b;
        this.B = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = apsk.C) == null) {
                    synchronized (apsk.class) {
                        if (apsk.C == null) {
                            apsk.C = (ahdd)new ahba((ahbh)apsk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apsk.a;
            }
            case 4: {
                return new ahaz((ahbh)apsk.a);
            }
            case 3: {
                return new apsk();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsk.a, "\u0001\u001a\u0000\u0002\u0001\uf49c\u4129\u001a\u0001\u0000\u0003\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100b\u0002\u0005\u1008\u0005\u0006\u1007\u0006\u0007\u1001\b\b\u1001\t\t\u1008\u000b\f\u100c\u0012\r\u1008\u0003\u0010\u1009\u0019\u00122\u0014\u1007\u001d\u0015\u1409\u001e\u0016\u100c\u001f\u0017\u1007 \u0019\u1007\u0007\u001a\u1009\"\u001c\u100a$\u001d\u1009% \u1008'#\u1409\r\uf70f\u207e\u1009\u000e\ue8f4\u2614\u1009\u0013\uf1b8\u3d17\u1009\u0016\uf49c\u4129\u1409\u0018", new Object[] { "b", "c", "d", "e", "f", "h", "i", "k", "l", "m", "p", apow.s, "g", "s", "t", apsj.a, "u", "v", "w", amud.m, "x", "j", "y", "z", "A", "B", "n", "o", "q", "r", "D" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.E = e;
                return null;
            }
            case 0: {
                return this.E;
            }
        }
    }
}
