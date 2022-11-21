import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsb extends ahcz implements aheo
{
    public static final agsb a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(agsb.class, a = new agsb());
    }
    
    private agsb() {
        ahcz.emptyProtobufList();
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
                if ((b = agsb.b) == null) {
                    synchronized (agsb.class) {
                        if (agsb.b == null) {
                            agsb.b = (ahev)new ahcs((ahcz)agsb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agsb.a;
            }
            case 4: {
                return new ahcr((ahcz)agsb.a);
            }
            case 3: {
                return new agsb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsb.a, "\u0000\u0000", null);
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
