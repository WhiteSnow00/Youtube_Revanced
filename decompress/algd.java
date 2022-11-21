import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algd extends ahcz implements aheo
{
    public static final algd a;
    private static volatile ahev h;
    public int b;
    public algc c;
    public algb d;
    public alfz e;
    public alga f;
    public ajam g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(algd.class, a = new algd());
    }
    
    private algd() {
        this.i = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = algd.h) == null) {
                    synchronized (algd.class) {
                        if (algd.h == null) {
                            algd.h = (ahev)new ahcs((ahcz)algd.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return algd.a;
            }
            case 4: {
                return new ahcr((ahcz)algd.a);
            }
            case 3: {
                return new algd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algd.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
