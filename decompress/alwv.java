import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwv extends ahcz implements aheo
{
    public static final alwv a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(alwv.class, a = new alwv());
    }
    
    private alwv() {
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
                if ((c = alwv.c) == null) {
                    synchronized (alwv.class) {
                        if (alwv.c == null) {
                            alwv.c = (ahev)new ahcs((ahcz)alwv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alwv.a;
            }
            case 4: {
                return new ahcr((ahcz)alwv.a);
            }
            case 3: {
                return new alwv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwv.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
