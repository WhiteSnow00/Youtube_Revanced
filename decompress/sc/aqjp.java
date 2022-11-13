import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjp extends ahbh implements ahcw
{
    public static final aqjp a;
    private static volatile ahdd b;
    private int c;
    private aqdy d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private aqju g;
    private CommandOuterClass$Command h;
    private CommandOuterClass$Command i;
    private ahhu j;
    private aqjy k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjp.class, (ahbh)(a = new aqjp()));
    }
    
    private aqjp() {
        this.l = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqjp.b) == null) {
                    synchronized (aqjp.class) {
                        if (aqjp.b == null) {
                            aqjp.b = (ahdd)new ahba((ahbh)aqjp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqjp.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjp.a);
            }
            case 3: {
                return new aqjp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjp.a, "\u0001\b\u0000\u0001\b%\b\u0000\u0000\b\b\u1409\u0016\t\u1409\t\u000b\u1409\u0011\u001f\u1409\u0007!\u1409\b#\u1409\u001c$\u1409\u000f%\u1409\u0013", new Object[] { "c", "j", "f", "h", "d", "e", "k", "g", "i" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
