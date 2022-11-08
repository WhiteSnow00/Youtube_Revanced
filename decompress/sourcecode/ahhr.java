import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhr extends agzi implements ahax
{
    public static final ahhr a;
    private static volatile ahbe f;
    public int b;
    public ajsq c;
    public aioe d;
    public agyc e;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahhr.class, a = new ahhr());
    }
    
    private ahhr() {
        this.h = 2;
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
                if ((f = ahhr.f) == null) {
                    synchronized (ahhr.class) {
                        if (ahhr.f == null) {
                            ahhr.f = (ahbe)new agzb((agzi)ahhr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahhr.a;
            }
            case 4: {
                return new agza((agzi)ahhr.a);
            }
            case 3: {
                return new ahhr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhr.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003", new Object[] { "b", "c", "d", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
