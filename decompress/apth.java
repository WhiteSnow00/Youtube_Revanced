import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apth extends ahcz implements aheo
{
    public static final apth a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(apth.class, a = new apth());
    }
    
    private apth() {
        this.b = 0;
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
                if ((d = apth.d) == null) {
                    synchronized (apth.class) {
                        if (apth.d == null) {
                            apth.d = (ahev)new ahcs((ahcz)apth.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apth.a;
            }
            case 4: {
                return new ahcr((ahcz)apth.a);
            }
            case 3: {
                return new apth();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apth.a, "\u0001\u0001\u0001\u0000\uec16\u387f\uec16\u387f\u0001\u0000\u0000\u0000\uec16\u387f\u103c\u0000", new Object[] { "c", "b", aicx.class });
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
