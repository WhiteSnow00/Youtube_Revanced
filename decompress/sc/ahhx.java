import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhx extends ahbh implements ahcw
{
    public static final ahhx a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public String d;
    public String e;
    public int f;
    public ahab g;
    
    static {
        ahbh.registerDefaultInstance((Class)ahhx.class, (ahbh)(a = new ahhx()));
    }
    
    private ahhx() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.g = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = ahhx.h) == null) {
                    synchronized (ahhx.class) {
                        if (ahhx.h == null) {
                            ahhx.h = (ahdd)new ahba((ahbh)ahhx.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahhx.a;
            }
            case 4: {
                return new ahaz((ahbh)ahhx.a);
            }
            case 3: {
                return new ahhx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahhx.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1004\u0003\u0005\u100a\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
