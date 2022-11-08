import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfw extends agzi implements ahax
{
    public static final aqfw a;
    private static volatile ahbe b;
    private int c;
    private aqfl d;
    private CommandOuterClass$Command e;
    private aqfy f;
    private aqfz g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aqfw.class, (agzi)(a = new aqfw()));
    }
    
    private aqfw() {
        this.i = 2;
        final agyc b = agyc.b;
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
                if ((b2 = aqfw.b) == null) {
                    synchronized (aqfw.class) {
                        if (aqfw.b == null) {
                            aqfw.b = (ahbe)new agzb((agzi)aqfw.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqfw.a;
            }
            case 4: {
                return new agza((agzi)aqfw.a);
            }
            case 3: {
                return new aqfw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfw.a, "\u0001\u0005\u0000\u0001\u0001\u000e\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0007\u1409\u0006\n\u1009\t\f\u1409\n\u000e\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "h" });
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
