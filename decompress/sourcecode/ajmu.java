import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmu extends agzi implements ahax
{
    public static final ajmu a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajmu.class, (agzi)(a = new ajmu()));
    }
    
    private ajmu() {
        this.e = 2;
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
                if ((b2 = ajmu.b) == null) {
                    synchronized (ajmu.class) {
                        if (ajmu.b == null) {
                            ajmu.b = (ahbe)new agzb((agzi)ajmu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajmu.a;
            }
            case 4: {
                return new agza((agzi)ajmu.a);
            }
            case 3: {
                return new ajmu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
