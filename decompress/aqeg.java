import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqeg extends ahbc implements ahbd
{
    public static final aqeg a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqeg.class, (ahbh)(a = new aqeg()));
    }
    
    private aqeg() {
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
                if ((b = aqeg.b) == null) {
                    synchronized (aqeg.class) {
                        if (aqeg.b == null) {
                            aqeg.b = (ahdd)new ahba((ahbh)aqeg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqeg.a;
            }
            case 4: {
                return new ahbb((ahbc)aqeg.a);
            }
            case 3: {
                return new aqeg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqeg.a, "\u0001\u0000", (Object[])null);
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
