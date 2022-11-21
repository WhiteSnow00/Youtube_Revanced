import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyk extends ahcz implements aheo
{
    public static final akyk a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(akyk.class, a = new akyk());
    }
    
    private akyk() {
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
                if ((c = akyk.c) == null) {
                    synchronized (akyk.class) {
                        if (akyk.c == null) {
                            akyk.c = (ahev)new ahcs((ahcz)akyk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akyk.a;
            }
            case 4: {
                return new ahcr((float[][][])null, (char[][])null);
            }
            case 3: {
                return new akyk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyk.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", akyj.class });
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
