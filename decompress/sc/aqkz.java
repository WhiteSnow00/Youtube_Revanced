import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkz extends ahbh implements ahcw
{
    public static final aqkz a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public String d;
    public float e;
    public CommandOuterClass$Command f;
    private byte h;
    
    static {
        final aqkz a2 = new aqkz();
        ahbh.registerDefaultInstance((Class)aqkz.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 315252720, ahek.k, (Class)aqkz.class);
    }
    
    private aqkz() {
        this.h = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqkz.g) == null) {
                    synchronized (aqkz.class) {
                        if (aqkz.g == null) {
                            aqkz.g = (ahdd)new ahba((ahbh)aqkz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqkz.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkz.a);
            }
            case 3: {
                return new aqkz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1001\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
