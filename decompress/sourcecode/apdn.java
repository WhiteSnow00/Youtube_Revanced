import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdn extends agzi implements ahax
{
    public static final apdn a;
    private static volatile ahbe b;
    private int c;
    private aibc d;
    private ajsq e;
    private ajsq f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(apdn.class, a = new apdn());
    }
    
    private apdn() {
        this.h = 2;
        final agyc b = agyc.b;
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
                if ((b2 = apdn.b) == null) {
                    synchronized (apdn.class) {
                        if (apdn.b == null) {
                            apdn.b = (ahbe)new agzb((agzi)apdn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apdn.a;
            }
            case 4: {
                return new agza((agzi)apdn.a);
            }
            case 3: {
                return new apdn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdn.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
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
