import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjz extends ahcz implements aheo
{
    public static final amjz a;
    private static volatile ahev b;
    private int c;
    private aqkr d;
    private aqkn e;
    private aqne f;
    private CommandOuterClass$Command g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amjz.class, a = new amjz());
    }
    
    private amjz() {
        this.h = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amjz.b) == null) {
                    synchronized (amjz.class) {
                        if (amjz.b == null) {
                            amjz.b = (ahev)new ahcs((ahcz)amjz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amjz.a;
            }
            case 4: {
                return new ahcr((ahcz)amjz.a);
            }
            case 3: {
                return new amjz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjz.a, "\u0001\u0004\u0000\u0001\u0011\u0019\u0004\u0000\u0000\u0004\u0011\u1409\u0012\u0015\u1409\u0016\u0016\u1409\u0017\u0019\u1409\u0018", new Object[] { "c", "d", "e", "f", "g" });
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
