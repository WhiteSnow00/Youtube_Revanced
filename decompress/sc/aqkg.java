import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkg extends ahbh implements ahcw
{
    public static final aqkg a;
    private static volatile ahdd b;
    private int c;
    private CommandOuterClass$Command d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqkg.class, (ahbh)(a = new aqkg()));
    }
    
    private aqkg() {
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
                if ((b = aqkg.b) == null) {
                    synchronized (aqkg.class) {
                        if (aqkg.b == null) {
                            aqkg.b = (ahdd)new ahba((ahbh)aqkg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqkg.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkg.a);
            }
            case 3: {
                return new aqkg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkg.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
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
