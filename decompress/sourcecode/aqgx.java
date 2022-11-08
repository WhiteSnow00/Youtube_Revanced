import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgx extends agzi implements ahax
{
    public static final aqgx a;
    private static volatile ahbe b;
    private int c;
    private aqfm d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aqgx.class, (agzi)(a = new aqgx()));
    }
    
    private aqgx() {
        this.g = 2;
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
                if ((b2 = aqgx.b) == null) {
                    synchronized (aqgx.class) {
                        if (aqgx.b == null) {
                            aqgx.b = (ahbe)new agzb((agzi)aqgx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqgx.a;
            }
            case 4: {
                return new agza((agzi)aqgx.a);
            }
            case 3: {
                return new aqgx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgx.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
