import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apuz extends ahcz implements aheo
{
    public static final apuz a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(apuz.class, a = new apuz());
    }
    
    private apuz() {
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
                if ((d = apuz.d) == null) {
                    synchronized (apuz.class) {
                        if (apuz.d == null) {
                            apuz.d = (ahev)new ahcs((ahcz)apuz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apuz.a;
            }
            case 4: {
                return new ahcr((ahcz)apuz.a);
            }
            case 3: {
                return new apuz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apuz.a, "\u0001\u0001\u0001\u0000\ufd80\u3d39\ufd80\u3d39\u0001\u0000\u0000\u0000\ufd80\u3d39\u103c\u0000", new Object[] { "c", "b", apuy.class });
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
