import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknf extends ahbh implements ahcw
{
    public static final aknf a;
    private static volatile ahdd p;
    public int b;
    public aklg c;
    public String d;
    public int e;
    public ahab f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public int k;
    public boolean l;
    public int m;
    public long n;
    public int o;
    private byte q;
    
    static {
        ahbh.registerDefaultInstance((Class)aknf.class, (ahbh)(a = new aknf()));
    }
    
    private aknf() {
        this.q = 2;
        this.d = "";
        this.f = ahab.b;
        this.g = "";
        this.h = "";
        this.i = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd p3;
                if ((p3 = aknf.p) == null) {
                    synchronized (aknf.class) {
                        if (aknf.p == null) {
                            aknf.p = (ahdd)new ahba((ahbh)aknf.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return aknf.a;
            }
            case 4: {
                return new ahaz((ahbh)aknf.a);
            }
            case 3: {
                return new aknf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknf.a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u100a\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1007\u0007\t\u100b\b\u000b\u1007\n\f\u100c\u000b\r\u1002\f\u000e\u100c\r", new Object[] { "b", "c", "d", "e", ajqf.d, "f", "g", "h", "i", "j", "k", "l", "m", ajqf.g, "n", "o", ajqf.f });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
