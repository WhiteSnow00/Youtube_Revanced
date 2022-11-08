import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhz extends agzi implements ahax
{
    public static final aqhz a;
    private static volatile ahbe b;
    private int c;
    private CommandOuterClass$Command d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqhz.class, (agzi)(a = new aqhz()));
    }
    
    private aqhz() {
        this.e = 2;
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
                if ((b2 = aqhz.b) == null) {
                    synchronized (aqhz.class) {
                        if (aqhz.b == null) {
                            aqhz.b = (ahbe)new agzb((agzi)aqhz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqhz.a;
            }
            case 4: {
                return new agza((agzi)aqhz.a);
            }
            case 3: {
                return new aqhz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhz.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
