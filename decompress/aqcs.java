import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcs extends ahbc implements ahbd
{
    public static final aqcs a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcs.class, (ahbh)(a = new aqcs()));
    }
    
    private aqcs() {
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
                if ((b = aqcs.b) == null) {
                    synchronized (aqcs.class) {
                        if (aqcs.b == null) {
                            aqcs.b = (ahdd)new ahba((ahbh)aqcs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqcs.a;
            }
            case 4: {
                return new ahbb((ahbc)aqcs.a);
            }
            case 3: {
                return new aqcs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcs.a, "\u0001\u0000", (Object[])null);
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
