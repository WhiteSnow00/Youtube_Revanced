import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhd extends agzi implements ahax
{
    public static final aqhd a;
    private static volatile ahbe b;
    private int c;
    private aqbm d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private aqhi g;
    private CommandOuterClass$Command h;
    private CommandOuterClass$Command i;
    private ahfw j;
    private aqhm k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)aqhd.class, (agzi)(a = new aqhd()));
    }
    
    private aqhd() {
        this.l = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                if ((b2 = aqhd.b) == null) {
                    synchronized (aqhd.class) {
                        if (aqhd.b == null) {
                            aqhd.b = (ahbe)new agzb((agzi)aqhd.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqhd.a;
            }
            case 4: {
                return new agza((agzi)aqhd.a);
            }
            case 3: {
                return new aqhd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhd.a, "\u0001\b\u0000\u0001\b%\b\u0000\u0000\b\b\u1409\u0016\t\u1409\t\u000b\u1409\u0011\u001f\u1409\u0007!\u1409\b#\u1409\u001c$\u1409\u000f%\u1409\u0013", new Object[] { "c", "j", "f", "h", "d", "e", "k", "g", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
