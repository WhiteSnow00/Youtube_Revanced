import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvx extends agzi implements ahax
{
    public static final ajvx a;
    private static volatile ahbe f;
    public int b;
    public akjf c;
    public aioe d;
    public agyc e;
    private ahfw g;
    private ajtl h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ajvx.class, a = new ajvx());
    }
    
    private ajvx() {
        this.i = 2;
        this.e = agyc.b;
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
                final ahbe f;
                if ((f = ajvx.f) == null) {
                    synchronized (ajvx.class) {
                        if (ajvx.f == null) {
                            ajvx.f = (ahbe)new agzb((agzi)ajvx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajvx.a;
            }
            case 4: {
                return new agza((agzi)ajvx.a);
            }
            case 3: {
                return new ajvx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvx.a, "\u0001\u0005\u0000\u0001\u0001\u0309\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0309\u1409\u0004", new Object[] { "b", "c", "d", "g", "e", "h" });
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
