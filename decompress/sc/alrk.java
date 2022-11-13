import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrk extends ahbh implements ahcw
{
    public static final alrk a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ankw e;
    private anuv f;
    private anuv g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)alrk.class, (ahbh)(a = new alrk()));
    }
    
    private alrk() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alrk.b) == null) {
                    synchronized (alrk.class) {
                        if (alrk.b == null) {
                            alrk.b = (ahdd)new ahba((ahbh)alrk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alrk.a;
            }
            case 4: {
                return new ahaz((ahbh)alrk.a);
            }
            case 3: {
                return new alrk();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrk.a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0004\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
