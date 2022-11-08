import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqha extends agzi implements ahax
{
    public static final aqha a;
    private static volatile ahbe c;
    public String b;
    private int d;
    private CommandOuterClass$Command e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aqha.class, (agzi)(a = new aqha()));
    }
    
    private aqha() {
        this.g = 2;
        final agyc b = agyc.b;
        this.b = "";
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
                final ahbe c;
                if ((c = aqha.c) == null) {
                    synchronized (aqha.class) {
                        if (aqha.c == null) {
                            aqha.c = (ahbe)new agzb((agzi)aqha.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqha.a;
            }
            case 4: {
                return new agza((agzi)aqha.a);
            }
            case 3: {
                return new aqha();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqha.a, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0000\u0002\u0004\u1409\u0003\u0006\u1409\u0005\u0007\u1008\u0006", new Object[] { "d", "e", "f", "b" });
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
