import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpb extends agzi implements ahax
{
    public static final ajpb a;
    private static volatile ahbe f;
    public anss b;
    public anss c;
    public anss d;
    public agyc e;
    private int g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)ajpb.class, (agzi)(a = new ajpb()));
    }
    
    private ajpb() {
        this.i = 2;
        this.e = agyc.b;
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
                final ahbe f;
                if ((f = ajpb.f) == null) {
                    synchronized (ajpb.class) {
                        if (ajpb.f == null) {
                            ajpb.f = (ahbe)new agzb((agzi)ajpb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajpb.a;
            }
            case 4: {
                return new agza((agzi)ajpb.a);
            }
            case 3: {
                return new ajpb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpb.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004", new Object[] { "g", "b", "c", "d", "h", "e" });
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
