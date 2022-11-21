import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbo extends ahcz implements aheo
{
    public static final arbo a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(arbo.class, a = new arbo());
    }
    
    private arbo() {
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = arbo.c) == null) {
                    synchronized (arbo.class) {
                        if (arbo.c == null) {
                            arbo.c = (ahev)new ahcs((ahcz)arbo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return arbo.a;
            }
            case 4: {
                return new ahcr((ahcz)arbo.a);
            }
            case 3: {
                return new arbo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbo.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", arbm.class });
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
