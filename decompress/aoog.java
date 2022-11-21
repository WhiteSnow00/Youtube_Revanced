import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoog extends ahcz implements aheo
{
    public static final aoog a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    
    static {
        ahcz.registerDefaultInstance(aoog.class, a = new aoog());
    }
    
    private aoog() {
        this.c = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aoog.d) == null) {
                    synchronized (aoog.class) {
                        if (aoog.d == null) {
                            aoog.d = (ahev)new ahcs((ahcz)aoog.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoog.a;
            }
            case 4: {
                return new ahcr((ahcz)aoog.a);
            }
            case 3: {
                return new aoog();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoog.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
