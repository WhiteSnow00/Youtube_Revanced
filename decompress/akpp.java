import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpp extends ahcz implements aheo
{
    public static final akpp a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(akpp.class, a = new akpp());
    }
    
    private akpp() {
        ahcz.emptyProtobufList();
        ahcz.emptyProtobufList();
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
                if ((b = akpp.b) == null) {
                    synchronized (akpp.class) {
                        if (akpp.b == null) {
                            akpp.b = (ahev)new ahcs((ahcz)akpp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akpp.a;
            }
            case 4: {
                return new ahcr((ahcz)akpp.a);
            }
            case 3: {
                return new akpp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpp.a, "\u0001\u0000", null);
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
