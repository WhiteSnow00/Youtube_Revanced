import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokf extends ahcz implements aheo
{
    public static final aokf a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aokf.class, a = new aokf());
    }
    
    private aokf() {
        emptyProtobufList();
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
                if ((b = aokf.b) == null) {
                    synchronized (aokf.class) {
                        if (aokf.b == null) {
                            aokf.b = (ahev)new ahcs((ahcz)aokf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aokf.a;
            }
            case 4: {
                return new ahcr((ahcz)aokf.a);
            }
            case 3: {
                return new aokf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aokf.a, "\u0001\u0000", null);
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
