import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoux extends ahbh implements ahcw
{
    public static final aoux a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aoux.class, (ahbh)(a = new aoux()));
    }
    
    private aoux() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aoux.c) == null) {
                    synchronized (aoux.class) {
                        if (aoux.c == null) {
                            aoux.c = (ahdd)new ahba((ahbh)aoux.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoux.a;
            }
            case 4: {
                return new ahaz((ahbh)aoux.a);
            }
            case 3: {
                return new aoux();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoux.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
