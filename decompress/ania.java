import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ania extends ahbh implements ahcw
{
    public static final ania a;
    private static volatile ahdd m;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public String k;
    public boolean l;
    
    static {
        ahbh.registerDefaultInstance((Class)ania.class, (ahbh)(a = new ania()));
    }
    
    private ania() {
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        final ahab b = ahab.b;
        this.k = "";
        emptyProtobufList();
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = ania.m) == null) {
                    synchronized (ania.class) {
                        if (ania.m == null) {
                            ania.m = (ahdd)new ahba((ahbh)ania.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ania.a;
            }
            case 4: {
                return new ahaz((ahbh)ania.a);
            }
            case 3: {
                return new ania();
            }
            case 2: {
                return newMessageInfo((MessageLite)ania.a, "\u0001\n\u0000\u0001\u0002\u001e\n\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0004\u0005\u1008\u0006\u0006\u100c\u0000\n\u1008\b\u000b\u1008\t\r\u100c\u000b\u0011\u1008\u000f\u001d\u1007\u0016\u001e\u1008\u0005", new Object[] { "b", "d", "e", "g", "c", anci.u, "h", "i", "j", anic.m, "k", "l", "f" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
