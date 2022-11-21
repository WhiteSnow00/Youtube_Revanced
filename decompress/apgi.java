import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgi extends ahcz implements aheo
{
    private static final apgi a;
    private static volatile ahev b;
    private ahdp c;
    
    static {
        ahcz.registerDefaultInstance(apgi.class, a = new apgi());
    }
    
    private apgi() {
        this.c = ahcz.emptyProtobufList();
    }
    
    public static apgi a() {
        return apgi.a;
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
                if ((b = apgi.b) == null) {
                    synchronized (apgi.class) {
                        if (apgi.b == null) {
                            apgi.b = (ahev)new ahcs((ahcz)apgi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgi.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new apgi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgi.a, "\u0001\u0000", null);
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
