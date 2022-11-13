import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjm extends ahbh implements ahcw
{
    public static final aqjm a;
    private static volatile ahdd c;
    public String b;
    private int d;
    private CommandOuterClass$Command e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjm.class, (ahbh)(a = new aqjm()));
    }
    
    private aqjm() {
        this.g = 2;
        final ahab b = ahab.b;
        this.b = "";
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
                final ahdd c;
                if ((c = aqjm.c) == null) {
                    synchronized (aqjm.class) {
                        if (aqjm.c == null) {
                            aqjm.c = (ahdd)new ahba((ahbh)aqjm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqjm.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjm.a);
            }
            case 3: {
                return new aqjm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjm.a, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0000\u0002\u0004\u1409\u0003\u0006\u1409\u0005\u0007\u1008\u0006", new Object[] { "d", "e", "f", "b" });
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
