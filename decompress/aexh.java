import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexh extends ahcz implements aheo
{
    public static final aexh a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aexh.class, a = new aexh());
    }
    
    private aexh() {
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
                if ((b = aexh.b) == null) {
                    synchronized (aexh.class) {
                        if (aexh.b == null) {
                            aexh.b = (ahev)new ahcs((ahcz)aexh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aexh.a;
            }
            case 4: {
                return new ahcr((ahcz)aexh.a);
            }
            case 3: {
                return new aexh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexh.a, "\u0000\u0000", null);
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
