import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyc extends ahcz implements aheo
{
    public static final apyc a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apyc.class, a = new apyc());
    }
    
    private apyc() {
        emptyProtobufList();
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
                if ((b = apyc.b) == null) {
                    synchronized (apyc.class) {
                        if (apyc.b == null) {
                            apyc.b = (ahev)new ahcs((ahcz)apyc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apyc.a;
            }
            case 4: {
                return new ahcr((ahcz)apyc.a);
            }
            case 3: {
                return new apyc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyc.a, "\u0001\u0000", null);
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
