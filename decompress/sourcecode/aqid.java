import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqid extends agzi implements ahax
{
    public static final aqid a;
    private static volatile ahbe c;
    public aqia b;
    private int d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private aqgj h;
    private CommandOuterClass$Command i;
    private ahiq j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)aqid.class, (agzi)(a = new aqid()));
    }
    
    private aqid() {
        this.l = 2;
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
                final ahbe c;
                if ((c = aqid.c) == null) {
                    synchronized (aqid.class) {
                        if (aqid.c == null) {
                            aqid.c = (ahbe)new agzb((agzi)aqid.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqid.a;
            }
            case 4: {
                return new agza((agzi)aqid.a);
            }
            case 3: {
                return new aqid();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqid.a, "\u0001\b\u0000\u0001\u0001\u0019\b\u0000\u0000\b\u0001\u1409\u0000\u0004\u1409\u0003\u0005\u1409\u0006\u0006\u1409\u0007\b\u1409\t\t\u1409\n\u000f\u1409\u0004\u0019\u1409\u0016", new Object[] { "d", "b", "e", "g", "h", "i", "j", "f", "k" });
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
