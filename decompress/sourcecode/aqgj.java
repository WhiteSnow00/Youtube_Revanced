import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgj extends agzi implements ahax
{
    public static final aqgj a;
    private static volatile ahbe b;
    private int c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private CommandOuterClass$Command h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aqgj.class, (agzi)(a = new aqgj()));
    }
    
    private aqgj() {
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
                final ahbe b2;
                if ((b2 = aqgj.b) == null) {
                    synchronized (aqgj.class) {
                        if (aqgj.b == null) {
                            aqgj.b = (ahbe)new agzb((agzi)aqgj.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqgj.a;
            }
            case 4: {
                return new agza((agzi)aqgj.a);
            }
            case 3: {
                return new aqgj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgj.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
