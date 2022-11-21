import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfk extends ahcz implements aheo
{
    public static final alfk a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alfk.class, a = new alfk());
    }
    
    private alfk() {
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
                if ((b = alfk.b) == null) {
                    synchronized (alfk.class) {
                        if (alfk.b == null) {
                            alfk.b = (ahev)new ahcs((ahcz)alfk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alfk.a;
            }
            case 4: {
                return new ahcr((ahcz)alfk.a);
            }
            case 3: {
                return new alfk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfk.a, "\u0001\u0000", null);
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
