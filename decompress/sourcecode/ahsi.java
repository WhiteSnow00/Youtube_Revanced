import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsi extends agzi implements ahax
{
    public static final ahsi a;
    private static volatile ahbe f;
    public long b;
    public long c;
    public aorm d;
    public agyc e;
    private int g;
    private ahfw h;
    private aioe i;
    private anss j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(ahsi.class, a = new ahsi());
    }
    
    private ahsi() {
        this.k = 2;
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
                if ((f = ahsi.f) == null) {
                    synchronized (ahsi.class) {
                        if (ahsi.f == null) {
                            ahsi.f = (ahbe)new agzb((agzi)ahsi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahsi.a;
            }
            case 4: {
                return new agza((agzi)ahsi.a);
            }
            case 3: {
                return new ahsi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsi.a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0004\u0001\u1002\u0000\u0002\u1002\u0001\u0006\u1409\u0002\b\u1409\u0003\t\u100a\u0004\n\u1409\u0005\f\u1409\u0007", new Object[] { "g", "b", "c", "d", "h", "e", "i", "j" });
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
