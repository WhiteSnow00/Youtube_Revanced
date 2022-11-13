import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggu extends ahbh implements ahcw
{
    public static final aggu a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aggu.class, (ahbh)(a = new aggu()));
    }
    
    private aggu() {
        this.c = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        ahbh.emptyProtobufList();
        ahbh.emptyProtobufList();
        ahbh.emptyProtobufList();
        ahbh.emptyProtobufList();
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
                if ((b = aggu.b) == null) {
                    synchronized (aggu.class) {
                        if (aggu.b == null) {
                            aggu.b = (ahdd)new ahba((ahbh)aggu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aggu.a;
            }
            case 4: {
                return new ahaz((ahbh)aggu.a);
            }
            case 3: {
                return new aggu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aggu.a, "\u0000\u0000", (Object[])null);
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
