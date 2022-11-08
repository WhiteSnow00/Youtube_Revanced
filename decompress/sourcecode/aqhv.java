import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhv extends agzi implements ahax
{
    public static final aqhv a;
    private static volatile ahbe b;
    private int c;
    private aqhu d;
    private aqhu e;
    private ahfw f;
    private aqgx g;
    private aqhs h;
    private CommandOuterClass$Command i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)aqhv.class, (agzi)(a = new aqhv()));
    }
    
    private aqhv() {
        this.j = 2;
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
                if ((b2 = aqhv.b) == null) {
                    synchronized (aqhv.class) {
                        if (aqhv.b == null) {
                            aqhv.b = (ahbe)new agzb((agzi)aqhv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqhv.a;
            }
            case 4: {
                return new agza((agzi)aqhv.a);
            }
            case 3: {
                return new aqhv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhv.a, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0005\u0007\u1409\u0006\f\u1409\n\u000f\u1409\r", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
