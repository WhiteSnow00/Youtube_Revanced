import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlm extends ahbh implements ahcw
{
    public static final aqlm a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public aqli d;
    public aqll e;
    public aqll f;
    public aqll g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlm.class, (ahbh)(a = new aqlm()));
    }
    
    private aqlm() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aqlm.h) == null) {
                    synchronized (aqlm.class) {
                        if (aqlm.h == null) {
                            aqlm.h = (ahdd)new ahba((ahbh)aqlm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqlm.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlm.a);
            }
            case 3: {
                return new aqlm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlm.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0004\u1009\u0003\u0005\u1009\u0004\u0006\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
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
