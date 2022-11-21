import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojr extends ahcz implements aheo
{
    public static final aojr a;
    private static volatile ahev c;
    public ahpb b;
    private int d;
    private ahjl e;
    private ahoi f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aojr.class, a = new aojr());
    }
    
    private aojr() {
        this.g = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aojr.c) == null) {
                    synchronized (aojr.class) {
                        if (aojr.c == null) {
                            aojr.c = (ahev)new ahcs((ahcz)aojr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aojr.a;
            }
            case 4: {
                return new ahcr((ahcz)aojr.a);
            }
            case 3: {
                return new aojr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojr.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0002\u0005\u1409\u0004", new Object[] { "d", "b", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
