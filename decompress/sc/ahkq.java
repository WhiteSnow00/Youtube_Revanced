import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkq extends ahbh implements ahcw
{
    public static final ahkq a;
    public static final ahbf b;
    private static volatile ahdd g;
    public CommandOuterClass$Command c;
    public CommandOuterClass$Command d;
    public ahmz e;
    public String f;
    private int h;
    private byte i;
    
    static {
        final ahkq a2 = new ahkq();
        ahbh.registerDefaultInstance((Class)ahkq.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqhl.a, (Object)a2, (MessageLite)a2, (ahbm)null, 201264127, ahek.k, (Class)ahkq.class);
    }
    
    private ahkq() {
        this.i = 2;
        this.f = "";
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
                final ahdd g;
                if ((g = ahkq.g) == null) {
                    synchronized (ahkq.class) {
                        if (ahkq.g == null) {
                            ahkq.g = (ahdd)new ahba((ahbh)ahkq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahkq.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkq.a);
            }
            case 3: {
                return new ahkq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkq.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1009\u0002\u0004\u1008\u0003", new Object[] { "h", "c", "d", "e", "f" });
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
