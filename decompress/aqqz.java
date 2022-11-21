import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqz extends ahcz implements aheo
{
    public static final aqqz a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqqz.class, a = new aqqz());
    }
    
    private aqqz() {
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
                if ((b = aqqz.b) == null) {
                    synchronized (aqqz.class) {
                        if (aqqz.b == null) {
                            aqqz.b = (ahev)new ahcs((ahcz)aqqz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqqz.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqz.a);
            }
            case 3: {
                return new aqqz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqz.a, "\u0001\u0000", null);
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
