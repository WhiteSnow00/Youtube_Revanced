import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqso extends ahbc implements ahbd
{
    public static final aqso a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqso.class, (ahbh)(a = new aqso()));
    }
    
    private aqso() {
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
                if ((b = aqso.b) == null) {
                    synchronized (aqso.class) {
                        if (aqso.b == null) {
                            aqso.b = (ahdd)new ahba((ahbh)aqso.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqso.a;
            }
            case 4: {
                return new ahbb((ahbc)aqso.a);
            }
            case 3: {
                return new aqso();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqso.a, "\u0001\u0000", (Object[])null);
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
