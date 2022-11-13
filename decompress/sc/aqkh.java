import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkh extends ahbh implements ahcw
{
    public static final aqkh a;
    private static volatile ahdd b;
    private int c;
    private aqkg d;
    private aqkg e;
    private ahhu f;
    private aqjj g;
    private aqke h;
    private CommandOuterClass$Command i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aqkh.class, (ahbh)(a = new aqkh()));
    }
    
    private aqkh() {
        this.j = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqkh.b) == null) {
                    synchronized (aqkh.class) {
                        if (aqkh.b == null) {
                            aqkh.b = (ahdd)new ahba((ahbh)aqkh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqkh.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkh.a);
            }
            case 3: {
                return new aqkh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkh.a, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0005\u0007\u1409\u0006\f\u1409\n\u000f\u1409\r", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
