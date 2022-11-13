import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqef extends ahbc implements ahbd
{
    public static final aqef a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqef.class, (ahbh)(a = new aqef()));
    }
    
    private aqef() {
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
                if ((b = aqef.b) == null) {
                    synchronized (aqef.class) {
                        if (aqef.b == null) {
                            aqef.b = (ahdd)new ahba((ahbh)aqef.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqef.a;
            }
            case 4: {
                return new ahbb((ahbc)aqef.a);
            }
            case 3: {
                return new aqef();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqef.a, "\u0001\u0000", (Object[])null);
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
