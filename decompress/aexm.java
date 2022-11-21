import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexm extends ahcz implements aheo
{
    public static final aexm a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aexm.class, a = new aexm());
    }
    
    private aexm() {
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
                if ((e = aexm.e) == null) {
                    synchronized (aexm.class) {
                        if (aexm.e == null) {
                            aexm.e = (ahev)new ahcs((ahcz)aexm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aexm.a;
            }
            case 4: {
                return new ahcr((ahcz)aexm.a);
            }
            case 3: {
                return new aexm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexm.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004", new Object[] { "b", "c", "d" });
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
