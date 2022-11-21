import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtf extends ahcz implements aheo
{
    public static final agtf a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(agtf.class, a = new agtf());
    }
    
    private agtf() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = agtf.b) == null) {
                    synchronized (agtf.class) {
                        if (agtf.b == null) {
                            agtf.b = (ahev)new ahcs((ahcz)agtf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agtf.a;
            }
            case 4: {
                return new ahcr((ahcz)agtf.a);
            }
            case 3: {
                return new agtf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtf.a, "\u0001\u0000", null);
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
