import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoq extends ahbh implements ahcw
{
    public static final apoq a;
    private static volatile ahdd f;
    public int b;
    public apop c;
    public int d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)apoq.class, (ahbh)(a = new apoq()));
    }
    
    private apoq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = apoq.f) == null) {
                    synchronized (apoq.class) {
                        if (apoq.f == null) {
                            apoq.f = (ahdd)new ahba((ahbh)apoq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apoq.a;
            }
            case 4: {
                return new ahaz((ahbh)apoq.a);
            }
            case 3: {
                return new apoq();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", apow.l, "e" });
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
