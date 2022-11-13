import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcx extends ahbh implements ahcw
{
    public static final ajcx a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcx.class, (ahbh)(a = new ajcx()));
    }
    
    private ajcx() {
        this.c = 2;
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
                if ((b = ajcx.b) == null) {
                    synchronized (ajcx.class) {
                        if (ajcx.b == null) {
                            ajcx.b = (ahdd)new ahba((ahbh)ajcx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajcx.a;
            }
            case 4: {
                return new ahaz((ahbh)ajcx.a);
            }
            case 3: {
                return new ajcx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcx.a, "\u0001\u0000", (Object[])null);
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
