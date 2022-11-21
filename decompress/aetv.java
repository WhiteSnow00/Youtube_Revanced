import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetv extends ahcz implements aheo
{
    public static final aetv a;
    private static volatile ahev e;
    public int b;
    public aetu c;
    public aett d;
    
    static {
        ahcz.registerDefaultInstance(aetv.class, a = new aetv());
    }
    
    private aetv() {
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
                if ((e = aetv.e) == null) {
                    synchronized (aetv.class) {
                        if (aetv.e == null) {
                            aetv.e = (ahev)new ahcs((ahcz)aetv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aetv.a;
            }
            case 4: {
                return new ahcr((ahcz)aetv.a);
            }
            case 3: {
                return new aetv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aetv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
