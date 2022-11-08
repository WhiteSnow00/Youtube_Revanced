import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfh extends agzi implements ahax
{
    public static final aqfh a;
    private static volatile ahbe b;
    private int c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aqfh.class, (agzi)(a = new aqfh()));
    }
    
    private aqfh() {
        this.g = 2;
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
                if ((b2 = aqfh.b) == null) {
                    synchronized (aqfh.class) {
                        if (aqfh.b == null) {
                            aqfh.b = (ahbe)new agzb((agzi)aqfh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqfh.a;
            }
            case 4: {
                return new agza((agzi)aqfh.a);
            }
            case 3: {
                return new aqfh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfh.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002\u1409\u0003\u0003\u1409\u0004\u0005\u1409\u0005", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
