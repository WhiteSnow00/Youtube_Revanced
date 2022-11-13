import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuv extends ahbc implements ahbd
{
    public static final anuv a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)anuv.class, (ahbh)(a = new anuv()));
    }
    
    private anuv() {
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
                if ((b = anuv.b) == null) {
                    synchronized (anuv.class) {
                        if (anuv.b == null) {
                            anuv.b = (ahdd)new ahba((ahbh)anuv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anuv.a;
            }
            case 4: {
                return new ahbb((ahbc)anuv.a);
            }
            case 3: {
                return new anuv();
            }
            case 2: {
                return newMessageInfo((MessageLite)anuv.a, "\u0001\u0000", (Object[])null);
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
