import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjj extends ahbh implements ahcw
{
    public static final aqjj a;
    private static volatile ahdd b;
    private int c;
    private aqhy d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjj.class, (ahbh)(a = new aqjj()));
    }
    
    private aqjj() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqjj.b) == null) {
                    synchronized (aqjj.class) {
                        if (aqjj.b == null) {
                            aqjj.b = (ahdd)new ahba((ahbh)aqjj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqjj.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjj.a);
            }
            case 3: {
                return new aqjj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjj.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
