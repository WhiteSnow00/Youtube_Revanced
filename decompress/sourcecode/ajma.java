import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajma extends agzi implements ahax
{
    public static final ajma a;
    private static volatile ahbe d;
    public aqbm b;
    public CommandOuterClass$Command c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ajma.class, (agzi)(a = new ajma()));
    }
    
    private ajma() {
        this.f = 2;
        agzi.emptyProtobufList();
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
                final ahbe d;
                if ((d = ajma.d) == null) {
                    synchronized (ajma.class) {
                        if (ajma.d == null) {
                            ajma.d = (ahbe)new agzb((agzi)ajma.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajma.a;
            }
            case 4: {
                return new agza((agzi)ajma.a);
            }
            case 3: {
                return new ajma();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajma.a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003\u1409\u0001\u0005\u1409\u0003", new Object[] { "e", "b", "c" });
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
