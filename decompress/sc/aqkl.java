import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkl extends ahbh implements ahcw
{
    public static final aqkl a;
    private static volatile ahdd b;
    private int c;
    private CommandOuterClass$Command d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqkl.class, (ahbh)(a = new aqkl()));
    }
    
    private aqkl() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqkl.b) == null) {
                    synchronized (aqkl.class) {
                        if (aqkl.b == null) {
                            aqkl.b = (ahdd)new ahba((ahbh)aqkl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqkl.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkl.a);
            }
            case 3: {
                return new aqkl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkl.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
