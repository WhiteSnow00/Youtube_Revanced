import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjt extends ahbh implements ahcw
{
    public static final aqjt a;
    private static volatile ahdd c;
    public aqim b;
    private int d;
    private aqjp e;
    private aqin f;
    private CommandOuterClass$Command g;
    private CommandOuterClass$Command h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjt.class, (ahbh)(a = new aqjt()));
    }
    
    private aqjt() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqjt.c) == null) {
                    synchronized (aqjt.class) {
                        if (aqjt.c == null) {
                            aqjt.c = (ahdd)new ahba((ahbh)aqjt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqjt.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjt.a);
            }
            case 3: {
                return new aqjt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjt.a, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1409\u0002\b\u1409\u0006\u000b\u1409\t", new Object[] { "d", "e", "b", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
