import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class araj extends ahcz implements aheo
{
    public static final araj a;
    private static volatile ahev b;
    private ahej c;
    private ahej d;
    
    static {
        ahcz.registerDefaultInstance(araj.class, a = new araj());
    }
    
    private araj() {
        this.c = ahej.a;
        this.d = ahej.a;
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
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
                if ((b = araj.b) == null) {
                    synchronized (araj.class) {
                        if (araj.b == null) {
                            araj.b = (ahev)new ahcs((ahcz)araj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return araj.a;
            }
            case 4: {
                return new ahcr((ahcz)araj.a);
            }
            case 3: {
                return new araj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)araj.a, "\u0001\u0002\u0000\u0000\u0018\u0019\u0002\u0002\u0000\u0000\u00182\u00192", new Object[] { "c", arah.a, "d", arai.a });
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
