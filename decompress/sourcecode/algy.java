import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algy extends agzd implements agze
{
    public static final algy a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)algy.class, (agzi)(a = new algy()));
    }
    
    private algy() {
        this.e = 2;
        this.c = agyc.b;
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
                if ((d = algy.d) == null) {
                    synchronized (algy.class) {
                        if (algy.d == null) {
                            algy.d = (ahbe)new agzb((agzi)algy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algy.a;
            }
            case 4: {
                return new agzc(algy.a);
            }
            case 3: {
                return new algy();
            }
            case 2: {
                return newMessageInfo((MessageLite)algy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
