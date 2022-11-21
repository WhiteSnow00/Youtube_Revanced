import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmo extends ahcz implements aheo
{
    public static final ajmo a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ajmo.class, a = new ajmo());
    }
    
    private ajmo() {
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
                if ((b = ajmo.b) == null) {
                    synchronized (ajmo.class) {
                        if (ajmo.b == null) {
                            ajmo.b = (ahev)new ahcs((ahcz)ajmo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajmo.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmo.a);
            }
            case 3: {
                return new ajmo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmo.a, "\u0001\u0000", null);
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
