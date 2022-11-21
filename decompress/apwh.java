import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwh extends ahcz implements aheo
{
    public static final apwh a;
    private static volatile ahev d;
    public int b;
    public apvt c;
    
    static {
        ahcz.registerDefaultInstance(apwh.class, a = new apwh());
    }
    
    private apwh() {
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
                if ((d = apwh.d) == null) {
                    synchronized (apwh.class) {
                        if (apwh.d == null) {
                            apwh.d = (ahev)new ahcs((ahcz)apwh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apwh.a;
            }
            case 4: {
                return new ahcr((ahcz)apwh.a);
            }
            case 3: {
                return new apwh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwh.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1009\u0000", new Object[] { "b", "c" });
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
