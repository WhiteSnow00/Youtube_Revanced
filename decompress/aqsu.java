import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsu extends ahbc implements ahbd
{
    public static final aqsu a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsu.class, (ahbh)(a = new aqsu()));
    }
    
    private aqsu() {
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
                if ((b = aqsu.b) == null) {
                    synchronized (aqsu.class) {
                        if (aqsu.b == null) {
                            aqsu.b = (ahdd)new ahba((ahbh)aqsu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqsu.a;
            }
            case 4: {
                return new ahbb((ahbc)aqsu.a);
            }
            case 3: {
                return new aqsu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsu.a, "\u0001\u0000", (Object[])null);
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
