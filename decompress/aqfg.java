import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfg extends ahbc implements ahbd
{
    public static final aqfg a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqfg.class, (ahbh)(a = new aqfg()));
    }
    
    private aqfg() {
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
                if ((b = aqfg.b) == null) {
                    synchronized (aqfg.class) {
                        if (aqfg.b == null) {
                            aqfg.b = (ahdd)new ahba((ahbh)aqfg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqfg.a;
            }
            case 4: {
                return new ahbb((ahbc)aqfg.a);
            }
            case 3: {
                return new aqfg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfg.a, "\u0001\u0000", (Object[])null);
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
