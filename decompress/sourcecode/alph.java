import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alph extends agzi implements ahax
{
    public static final alph a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private anit e;
    private anss f;
    private anss g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(alph.class, a = new alph());
    }
    
    private alph() {
        this.h = 2;
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
                if ((b2 = alph.b) == null) {
                    synchronized (alph.class) {
                        if (alph.b == null) {
                            alph.b = (ahbe)new agzb((agzi)alph.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return alph.a;
            }
            case 4: {
                return new agza((agzi)alph.a);
            }
            case 3: {
                return new alph();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alph.a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0004\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
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
