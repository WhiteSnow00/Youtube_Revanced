import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgu extends agzi implements ahax
{
    public static final aqgu a;
    private static volatile ahbe b;
    private int c;
    private CommandOuterClass$Command d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aqgu.class, (agzi)(a = new aqgu()));
    }
    
    private aqgu() {
        this.f = 2;
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
                if ((b2 = aqgu.b) == null) {
                    synchronized (aqgu.class) {
                        if (aqgu.b == null) {
                            aqgu.b = (ahbe)new agzb((agzi)aqgu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqgu.a;
            }
            case 4: {
                return new agza((agzi)aqgu.a);
            }
            case 3: {
                return new aqgu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgu.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
