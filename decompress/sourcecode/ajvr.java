import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvr extends agzi implements ahax
{
    public static final ajvr a;
    private static volatile ahbe f;
    public int b;
    public akjf c;
    public aioe d;
    public agyc e;
    private ajtl g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ajvr.class, a = new ajvr());
    }
    
    private ajvr() {
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
                if ((f = ajvr.f) == null) {
                    synchronized (ajvr.class) {
                        if (ajvr.f == null) {
                            ajvr.f = (ahbe)new agzb((agzi)ajvr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajvr.a;
            }
            case 4: {
                return new agza((agzi)ajvr.a);
            }
            case 3: {
                return new ajvr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvr.a, "\u0001\u0005\u0000\u0001\u0001\u0309\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u100a\u0004\u0309\u1409\u0002", new Object[] { "b", "c", "d", "h", "e", "g" });
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
