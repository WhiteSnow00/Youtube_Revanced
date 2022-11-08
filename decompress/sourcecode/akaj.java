import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akaj extends agzd implements agze
{
    public static final akaj a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private anss f;
    private anss g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)akaj.class, (agzi)(a = new akaj()));
    }
    
    private akaj() {
        this.i = 2;
        emptyProtobufList();
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
                if ((b2 = akaj.b) == null) {
                    synchronized (akaj.class) {
                        if (akaj.b == null) {
                            akaj.b = (ahbe)new agzb((agzi)akaj.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return akaj.a;
            }
            case 4: {
                return new agzc(akaj.a);
            }
            case 3: {
                return new akaj();
            }
            case 2: {
                return newMessageInfo((MessageLite)akaj.a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002\u1409\u0004\u0003\u1409\u0000\u0005\u1409\u0001\u0006\u1409\u0002\u0007\u1409\u0003", new Object[] { "c", "h", "d", "e", "f", "g" });
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
