import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfs extends agzi implements ahax
{
    public static final aqfs a;
    private static volatile ahbe b;
    private int c;
    private aqfh d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aqfs.class, (agzi)(a = new aqfs()));
    }
    
    private aqfs() {
        this.i = 2;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b2 = aqfs.b) == null) {
                    synchronized (aqfs.class) {
                        if (aqfs.b == null) {
                            aqfs.b = (ahbe)new agzb((agzi)aqfs.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqfs.a;
            }
            case 4: {
                return new agza((agzi)aqfs.a);
            }
            case 3: {
                return new aqfs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfs.a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0005\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0004\b\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h" });
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
