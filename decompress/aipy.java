import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipy extends ahcz implements aheo
{
    public static final aipy a;
    private static volatile ahev c;
    public aiqc b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aipy.class, a = new aipy());
    }
    
    private aipy() {
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
                if ((c = aipy.c) == null) {
                    synchronized (aipy.class) {
                        if (aipy.c == null) {
                            aipy.c = (ahev)new ahcs((ahcz)aipy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aipy.a;
            }
            case 4: {
                return new ahcr((ahcz)aipy.a);
            }
            case 3: {
                return new aipy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipy.a, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\t\u1009\u0000", new Object[] { "d", "b" });
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
