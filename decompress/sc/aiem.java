import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiem extends ahbh implements ahcw
{
    public static final aiem a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public String d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)aiem.class, (ahbh)(a = new aiem()));
    }
    
    private aiem() {
        this.c = "";
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aiem.f) == null) {
                    synchronized (aiem.class) {
                        if (aiem.f == null) {
                            aiem.f = (ahdd)new ahba((ahbh)aiem.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aiem.a;
            }
            case 4: {
                return new ahaz((ahbh)aiem.a);
            }
            case 3: {
                return new aiem();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiem.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
