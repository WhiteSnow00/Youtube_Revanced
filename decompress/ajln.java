import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajln extends ahcz implements aheo
{
    private static final ajln a;
    private static volatile ahev b;
    private ahdp c;
    
    static {
        ahcz.registerDefaultInstance(ajln.class, a = new ajln());
    }
    
    private ajln() {
        this.c = ahcz.emptyProtobufList();
    }
    
    public static ajln a() {
        return ajln.a;
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
                if ((b = ajln.b) == null) {
                    synchronized (ajln.class) {
                        if (ajln.b == null) {
                            ajln.b = (ahev)new ahcs((ahcz)ajln.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajln.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new ajln();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajln.a, "\u0001\u0000", null);
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
