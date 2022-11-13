import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkp extends ahbh implements ahcw
{
    public static final aqkp a;
    private static volatile ahdd c;
    public aqkm b;
    private int d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private aqiv h;
    private CommandOuterClass$Command i;
    private ahko j;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)aqkp.class, (ahbh)(a = new aqkp()));
    }
    
    private aqkp() {
        this.l = 2;
        final ahab b = ahab.b;
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
                final ahdd c;
                if ((c = aqkp.c) == null) {
                    synchronized (aqkp.class) {
                        if (aqkp.c == null) {
                            aqkp.c = (ahdd)new ahba((ahbh)aqkp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqkp.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkp.a);
            }
            case 3: {
                return new aqkp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkp.a, "\u0001\b\u0000\u0001\u0001\u0019\b\u0000\u0000\b\u0001\u1409\u0000\u0004\u1409\u0003\u0005\u1409\u0006\u0006\u1409\u0007\b\u1409\t\t\u1409\n\u000f\u1409\u0004\u0019\u1409\u0016", new Object[] { "d", "b", "e", "g", "h", "i", "j", "f", "k" });
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
