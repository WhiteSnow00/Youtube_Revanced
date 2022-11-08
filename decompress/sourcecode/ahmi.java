import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmi extends agzi implements ahax
{
    public static final ahmi a;
    private static volatile ahbe d;
    public anss b;
    public ahmh c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ahmi.class, (agzi)(a = new ahmi()));
    }
    
    private ahmi() {
        this.f = 2;
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
                final ahbe d;
                if ((d = ahmi.d) == null) {
                    synchronized (ahmi.class) {
                        if (ahmi.d == null) {
                            ahmi.d = (ahbe)new agzb((agzi)ahmi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahmi.a;
            }
            case 4: {
                return new agza((agzi)ahmi.a);
            }
            case 3: {
                return new ahmi();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
