import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwe extends agzi implements ahax
{
    public static final ahwe a;
    private static volatile ahbe b;
    private int c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahwe.class, a = new ahwe());
    }
    
    private ahwe() {
        this.f = 2;
    }
    
    @Override
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
                if ((b2 = ahwe.b) == null) {
                    synchronized (ahwe.class) {
                        if (ahwe.b == null) {
                            ahwe.b = (ahbe)new agzb((agzi)ahwe.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahwe.a;
            }
            case 4: {
                return new agza((agzi)ahwe.a);
            }
            case 3: {
                return new ahwe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwe.a, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0005\u1409\u0004", new Object[] { "c", "d", "e" });
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
