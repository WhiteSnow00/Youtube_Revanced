import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfc extends ahbc implements ahbd
{
    public static final aqfc a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqfc.class, (ahbh)(a = new aqfc()));
    }
    
    private aqfc() {
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
                if ((b = aqfc.b) == null) {
                    synchronized (aqfc.class) {
                        if (aqfc.b == null) {
                            aqfc.b = (ahdd)new ahba((ahbh)aqfc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqfc.a;
            }
            case 4: {
                return new ahbb((ahbc)aqfc.a);
            }
            case 3: {
                return new aqfc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfc.a, "\u0001\u0000", (Object[])null);
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
