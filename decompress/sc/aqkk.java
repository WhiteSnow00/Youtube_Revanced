import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkk extends ahbh implements ahcw
{
    public static final aqkk a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqkk.class, (ahbh)(a = new aqkk()));
    }
    
    private aqkk() {
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
                if ((b = aqkk.b) == null) {
                    synchronized (aqkk.class) {
                        if (aqkk.b == null) {
                            aqkk.b = (ahdd)new ahba((ahbh)aqkk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqkk.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkk.a);
            }
            case 3: {
                return new aqkk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkk.a, "\u0001\u0000", (Object[])null);
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
