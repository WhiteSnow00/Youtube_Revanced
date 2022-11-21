import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnj extends ahcz implements aheo
{
    public static final ahnj a;
    private static volatile ahev e;
    public int b;
    public ahov c;
    public ahng d;
    
    static {
        ahcz.registerDefaultInstance(ahnj.class, a = new ahnj());
    }
    
    private ahnj() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ahnj.e) == null) {
                    synchronized (ahnj.class) {
                        if (ahnj.e == null) {
                            ahnj.e = (ahev)new ahcs((ahcz)ahnj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahnj.a;
            }
            case 4: {
                return new ahcr((ahcz)ahnj.a);
            }
            case 3: {
                return new ahnj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
