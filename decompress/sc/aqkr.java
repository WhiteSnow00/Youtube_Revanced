import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkr extends ahbh implements ahcw
{
    public static final aqkr a;
    private static volatile ahdd b;
    private int c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqkr.class, (ahbh)(a = new aqkr()));
    }
    
    private aqkr() {
        this.f = 2;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqkr.b) == null) {
                    synchronized (aqkr.class) {
                        if (aqkr.b == null) {
                            aqkr.b = (ahdd)new ahba((ahbh)aqkr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqkr.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkr.a);
            }
            case 3: {
                return new aqkr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkr.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003\u1409\u0000\u0004\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
