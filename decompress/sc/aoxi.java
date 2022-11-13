import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxi extends ahbh implements ahcw
{
    public static final aoxi a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxi.class, (ahbh)(a = new aoxi()));
    }
    
    private aoxi() {
        this.c = 2;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = aoxi.b) == null) {
                    synchronized (aoxi.class) {
                        if (aoxi.b == null) {
                            aoxi.b = (ahdd)new ahba((ahbh)aoxi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxi.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxi.a);
            }
            case 3: {
                return new aoxi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxi.a, "\u0001\u0000", (Object[])null);
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
