import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexk extends ahcz implements aheo
{
    public static final aexk a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(aexk.class, a = new aexk());
    }
    
    private aexk() {
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
                if ((d = aexk.d) == null) {
                    synchronized (aexk.class) {
                        if (aexk.d == null) {
                            aexk.d = (ahev)new ahcs((ahcz)aexk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aexk.a;
            }
            case 4: {
                return new ahcr((ahcz)aexk.a);
            }
            case 3: {
                return new aexk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexk.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[] { "b", "c" });
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
