import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbc extends ahbh implements ahcw
{
    public static final ajbc a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbc.class, (ahbh)(a = new ajbc()));
    }
    
    private ajbc() {
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
                if ((b = ajbc.b) == null) {
                    synchronized (ajbc.class) {
                        if (ajbc.b == null) {
                            ajbc.b = (ahdd)new ahba((ahbh)ajbc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbc.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbc.a);
            }
            case 3: {
                return new ajbc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbc.a, "\u0001\u0000", (Object[])null);
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
