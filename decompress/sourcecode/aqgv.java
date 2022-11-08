import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgv extends agzi implements ahax
{
    public static final aqgv a;
    private static volatile ahbe b;
    private int c;
    private aqfl d;
    private aqfh e;
    private aqhz f;
    private CommandOuterClass$Command g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)aqgv.class, (agzi)(a = new aqgv()));
    }
    
    private aqgv() {
        this.h = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aqgv.b) == null) {
                    synchronized (aqgv.class) {
                        if (aqgv.b == null) {
                            aqgv.b = (ahbe)new agzb((agzi)aqgv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqgv.a;
            }
            case 4: {
                return new agza((agzi)aqgv.a);
            }
            case 3: {
                return new aqgv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgv.a, "\u0001\u0004\u0000\u0001\u0011\u0019\u0004\u0000\u0000\u0004\u0011\u1409\u0012\u0015\u1409\u0016\u0016\u1409\u0017\u0019\u1409\u0018", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
