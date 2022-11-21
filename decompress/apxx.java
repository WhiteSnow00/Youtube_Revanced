import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxx extends ahcz implements aheo
{
    public static final apxx a;
    private static volatile ahev d;
    public ahbt b;
    public ahbt c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(apxx.class, a = new apxx());
    }
    
    private apxx() {
        this.b = ahbt.b;
        this.c = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = apxx.d) == null) {
                    synchronized (apxx.class) {
                        if (apxx.d == null) {
                            apxx.d = (ahev)new ahcs((ahcz)apxx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apxx.a;
            }
            case 4: {
                return new ahcr((ahcz)apxx.a);
            }
            case 3: {
                return new apxx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100a\u0001", new Object[] { "e", "b", "c" });
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
