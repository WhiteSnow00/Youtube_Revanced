import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfq extends agzi implements ahax
{
    public static final aqfq a;
    private static volatile ahbe b;
    private int c;
    private aqia d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private aqbw h;
    private aqfr i;
    private aqfp j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)aqfq.class, (agzi)(a = new aqfq()));
    }
    
    private aqfq() {
        this.k = 2;
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
                if ((b2 = aqfq.b) == null) {
                    synchronized (aqfq.class) {
                        if (aqfq.b == null) {
                            aqfq.b = (ahbe)new agzb((agzi)aqfq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqfq.a;
            }
            case 4: {
                return new agza((agzi)aqfq.a);
            }
            case 3: {
                return new aqfq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfq.a, "\u0001\u0007\u0000\u0001\u0001\u0011\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\b\u1409\u0007\t\u1009\b\n\u1409\t\u0011\u1409\f", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
