import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfl extends ahbc implements ahbd
{
    public static final aqfl a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqfl.class, (ahbh)(a = new aqfl()));
    }
    
    private aqfl() {
        this.c = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqfl.b) == null) {
                    synchronized (aqfl.class) {
                        if (aqfl.b == null) {
                            aqfl.b = (ahdd)new ahba((ahbh)aqfl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqfl.a;
            }
            case 4: {
                return new ahbb((ahbc)aqfl.a);
            }
            case 3: {
                return new aqfl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfl.a, "\u0001\u0000", (Object[])null);
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
