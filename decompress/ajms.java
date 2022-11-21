import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajms extends ahcz implements aheo
{
    public static final ajms a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ajms.class, a = new ajms());
    }
    
    private ajms() {
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
                if ((b = ajms.b) == null) {
                    synchronized (ajms.class) {
                        if (ajms.b == null) {
                            ajms.b = (ahev)new ahcs((ahcz)ajms.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajms.a;
            }
            case 4: {
                return new ahcr((ahcz)ajms.a);
            }
            case 3: {
                return new ajms();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajms.a, "\u0001\u0000", null);
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
