import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkc extends ahbh implements ahcw
{
    public static final aqkc a;
    private static volatile ahdd b;
    private int c;
    private CommandOuterClass$Command d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqkc.class, (ahbh)(a = new aqkc()));
    }
    
    private aqkc() {
        this.f = 2;
        ahbh.emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = aqkc.b) == null) {
                    synchronized (aqkc.class) {
                        if (aqkc.b == null) {
                            aqkc.b = (ahdd)new ahba((ahbh)aqkc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqkc.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkc.a);
            }
            case 3: {
                return new aqkc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkc.a, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0002\u0004\u1409\u0002\u0006\u1409\u0004", new Object[] { "c", "d", "e" });
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
