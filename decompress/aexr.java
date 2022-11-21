import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexr extends ahcz implements aheo
{
    public static final aexr a;
    private static volatile ahev c;
    public ahbt b;
    
    static {
        ahcz.registerDefaultInstance(aexr.class, a = new aexr());
    }
    
    private aexr() {
        final ahbt b = ahbt.b;
        this.b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aexr.c) == null) {
                    synchronized (aexr.class) {
                        if (aexr.c == null) {
                            aexr.c = (ahev)new ahcs((ahcz)aexr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aexr.a;
            }
            case 4: {
                return new ahcr((ahcz)aexr.a);
            }
            case 3: {
                return new aexr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexr.a, "\u0000\u0001\u0000\u0000\u000f\u000f\u0001\u0000\u0000\u0000\u000f\n", new Object[] { "b" });
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
