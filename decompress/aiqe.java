import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqe extends ahcz implements aheo
{
    public static final aiqe a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aiqe.class, a = new aiqe());
    }
    
    private aiqe() {
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
                if ((b = aiqe.b) == null) {
                    synchronized (aiqe.class) {
                        if (aiqe.b == null) {
                            aiqe.b = (ahev)new ahcs((ahcz)aiqe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiqe.a;
            }
            case 4: {
                return new ahcr((ahcz)aiqe.a);
            }
            case 3: {
                return new aiqe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiqe.a, "\u0001\u0000", null);
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
