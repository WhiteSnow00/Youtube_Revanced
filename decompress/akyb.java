import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyb extends ahcz implements aheo
{
    public static final akyb a;
    private static volatile ahev e;
    public int b;
    public int c;
    public apqd d;
    
    static {
        ahcz.registerDefaultInstance(akyb.class, a = new akyb());
    }
    
    private akyb() {
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
                if ((e = akyb.e) == null) {
                    synchronized (akyb.class) {
                        if (akyb.e == null) {
                            akyb.e = (ahev)new ahcs((ahcz)akyb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akyb.a;
            }
            case 4: {
                return new ahcr((ahcz)akyb.a);
            }
            case 3: {
                return new akyb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001", new Object[] { "b", "c", apvn.a(), "d" });
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
