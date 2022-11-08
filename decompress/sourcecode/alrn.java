import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrn extends agzi implements ahax
{
    public static final alrn a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aibc e;
    private ajsq f;
    private ajsq g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(alrn.class, a = new alrn());
    }
    
    private alrn() {
        this.h = 2;
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
                final ahbe b2;
                if ((b2 = alrn.b) == null) {
                    synchronized (alrn.class) {
                        if (alrn.b == null) {
                            alrn.b = (ahbe)new agzb((agzi)alrn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return alrn.a;
            }
            case 4: {
                return new agza((agzi)alrn.a);
            }
            case 3: {
                return new alrn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrn.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
