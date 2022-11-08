import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzp extends agzi implements ahax
{
    public static final ahzp a;
    private static volatile ahbe d;
    public aioe b;
    public anss c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahzp.class, a = new ahzp());
    }
    
    private ahzp() {
        this.f = 2;
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
                final ahbe d;
                if ((d = ahzp.d) == null) {
                    synchronized (ahzp.class) {
                        if (ahzp.d == null) {
                            ahzp.d = (ahbe)new agzb((agzi)ahzp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahzp.a;
            }
            case 4: {
                return new agza((agzi)ahzp.a);
            }
            case 3: {
                return new ahzp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
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
