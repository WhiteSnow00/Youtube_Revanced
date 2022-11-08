import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsy extends agzi implements ahax
{
    public static final ahsy a;
    private static volatile ahbe i;
    public int b;
    public aorm c;
    public ahsx d;
    public ahsw e;
    public agzy f;
    public agyc g;
    public boolean h;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(ahsy.class, a = new ahsy());
    }
    
    private ahsy() {
        this.k = 2;
        this.f = agzi.emptyProtobufList();
        this.g = agyc.b;
        emptyProtobufList();
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
                final ahbe i;
                if ((i = ahsy.i) == null) {
                    synchronized (ahsy.class) {
                        if (ahsy.i == null) {
                            ahsy.i = (ahbe)new agzb((agzi)ahsy.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahsy.a;
            }
            case 4: {
                return new agza((agzi)ahsy.a);
            }
            case 3: {
                return new ahsy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsy.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u001b\u0005\u1409\u0003\u0006\u100a\u0004\b\u1007\u0005", new Object[] { "b", "c", "d", "e", "f", ahjf.class, "j", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
