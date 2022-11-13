import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqk extends ahbh implements ahcw
{
    public static final apqk a;
    private static volatile ahdd i;
    public int b;
    public ajut c;
    public ajut d;
    public anuv e;
    public anuv f;
    public int g;
    public ahab h;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)apqk.class, (ahbh)(a = new apqk()));
    }
    
    private apqk() {
        this.k = 2;
        this.h = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = apqk.i) == null) {
                    synchronized (apqk.class) {
                        if (apqk.i == null) {
                            apqk.i = (ahdd)new ahba((ahbh)apqk.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apqk.a;
            }
            case 4: {
                return new ahaz((ahbh)apqk.a);
            }
            case 3: {
                return new apqk();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqk.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u100a\u0006\u0007\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "j", "h", "g", apow.n });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
