import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknn extends agzi implements ahax
{
    public static final aknn a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aknn.class, a = new aknn());
    }
    
    private aknn() {
        this.e = 2;
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
                final ahbe b2;
                if ((b2 = aknn.b) == null) {
                    synchronized (aknn.class) {
                        if (aknn.b == null) {
                            aknn.b = (ahbe)new agzb((agzi)aknn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aknn.a;
            }
            case 4: {
                return new agza((agzi)aknn.a);
            }
            case 3: {
                return new aknn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknn.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
