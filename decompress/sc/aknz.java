import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknz extends ahbh implements ahcw
{
    public static final aknz a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public long d;
    
    static {
        ahbh.registerDefaultInstance((Class)aknz.class, (ahbh)(a = new aknz()));
    }
    
    private aknz() {
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
                if ((e = aknz.e) == null) {
                    synchronized (aknz.class) {
                        if (aknz.e == null) {
                            aknz.e = (ahdd)new ahba((ahbh)aknz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aknz.a;
            }
            case 4: {
                return new ahaz((ahbh)aknz.a);
            }
            case 3: {
                return new aknz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
