import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhh extends agzi implements ahax
{
    public static final aqhh a;
    private static volatile ahbe c;
    public aqga b;
    private int d;
    private aqhd e;
    private aqgb f;
    private CommandOuterClass$Command g;
    private CommandOuterClass$Command h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aqhh.class, (agzi)(a = new aqhh()));
    }
    
    private aqhh() {
        this.i = 2;
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
                final ahbe c;
                if ((c = aqhh.c) == null) {
                    synchronized (aqhh.class) {
                        if (aqhh.c == null) {
                            aqhh.c = (ahbe)new agzb((agzi)aqhh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqhh.a;
            }
            case 4: {
                return new agza((agzi)aqhh.a);
            }
            case 3: {
                return new aqhh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhh.a, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1409\u0002\b\u1409\u0006\u000b\u1409\t", new Object[] { "d", "e", "b", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
