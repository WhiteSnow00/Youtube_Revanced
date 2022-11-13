import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aght extends ahbh implements ahcw
{
    public static final aght a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public aptg d;
    
    static {
        ahbh.registerDefaultInstance((Class)aght.class, (ahbh)(a = new aght()));
    }
    
    private aght() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aght.e) == null) {
                    synchronized (aght.class) {
                        if (aght.e == null) {
                            aght.e = (ahdd)new ahba((ahbh)aght.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aght.a;
            }
            case 4: {
                return new ahaz((ahbh)aght.a);
            }
            case 3: {
                return new aght();
            }
            case 2: {
                return newMessageInfo((MessageLite)aght.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
