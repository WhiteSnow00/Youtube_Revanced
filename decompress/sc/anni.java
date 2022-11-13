import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anni extends ahbh implements ahcw
{
    public static final anni a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)anni.class, (ahbh)(a = new anni()));
    }
    
    private anni() {
        this.c = 2;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anni.b) == null) {
                    synchronized (anni.class) {
                        if (anni.b == null) {
                            anni.b = (ahdd)new ahba((ahbh)anni.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anni.a;
            }
            case 4: {
                return new ahaz((ahbh)anni.a);
            }
            case 3: {
                return new anni();
            }
            case 2: {
                return newMessageInfo((MessageLite)anni.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                byte c;
                if (o == null) {
                    c = 0;
                }
                else {
                    c = 1;
                }
                this.c = c;
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
