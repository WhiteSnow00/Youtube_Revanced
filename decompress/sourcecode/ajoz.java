import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajoz extends agzi implements ahax
{
    public static final ajoz a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)ajoz.class, (agzi)(a = new ajoz()));
    }
    
    private ajoz() {
        this.g = 2;
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
                if ((b2 = ajoz.b) == null) {
                    synchronized (ajoz.class) {
                        if (ajoz.b == null) {
                            ajoz.b = (ahbe)new agzb((agzi)ajoz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajoz.a;
            }
            case 4: {
                return new agza((agzi)ajoz.a);
            }
            case 3: {
                return new ajoz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajoz.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0004\u0005\u1409\u0001", new Object[] { "c", "d", "f", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
