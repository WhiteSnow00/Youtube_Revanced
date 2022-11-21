import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkt extends ahcz implements aheo
{
    public static final ahkt a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(ahkt.class, a = new ahkt());
    }
    
    private ahkt() {
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
                if ((c = ahkt.c) == null) {
                    synchronized (ahkt.class) {
                        if (ahkt.c == null) {
                            ahkt.c = (ahev)new ahcs((ahcz)ahkt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahkt.a;
            }
            case 4: {
                return new ahcr((float[][][])null, (byte[][])null);
            }
            case 3: {
                return new ahkt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahkt.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ahks.class });
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
