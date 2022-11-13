import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anpb extends ahbh implements ahcw
{
    public static final anpb a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)anpb.class, (ahbh)(a = new anpb()));
    }
    
    private anpb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anpb.c) == null) {
                    synchronized (anpb.class) {
                        if (anpb.c == null) {
                            anpb.c = (ahdd)new ahba((ahbh)anpb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anpb.a;
            }
            case 4: {
                return new ahaz((ahbh)anpb.a);
            }
            case 3: {
                return new anpb();
            }
            case 2: {
                return newMessageInfo((MessageLite)anpb.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100b\u0000", new Object[] { "d", "b" });
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
