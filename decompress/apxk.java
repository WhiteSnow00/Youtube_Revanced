import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxk extends ahcz implements aheo
{
    public static final apxk a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apxk.class, a = new apxk());
    }
    
    private apxk() {
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
                if ((b = apxk.b) == null) {
                    synchronized (apxk.class) {
                        if (apxk.b == null) {
                            apxk.b = (ahev)new ahcs((ahcz)apxk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apxk.a;
            }
            case 4: {
                return new ahcr((ahcz)apxk.a);
            }
            case 3: {
                return new apxk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxk.a, "\u0001\u0000", null);
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
