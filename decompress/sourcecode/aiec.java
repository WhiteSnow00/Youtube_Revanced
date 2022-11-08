import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiec extends agzi implements ahax
{
    public static final aiec a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aibc f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aiec.class, (agzi)(a = new aiec()));
    }
    
    private aiec() {
        this.g = 2;
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
                if ((b2 = aiec.b) == null) {
                    synchronized (aiec.class) {
                        if (aiec.b == null) {
                            aiec.b = (ahbe)new agzb((agzi)aiec.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiec.a;
            }
            case 4: {
                return new agza((agzi)aiec.a);
            }
            case 3: {
                return new aiec();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiec.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
