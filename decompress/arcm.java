import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcm extends ahcz implements aheo
{
    public static final arcm a;
    private static volatile ahev g;
    public int b;
    public int c;
    public Object d;
    public boolean e;
    public boolean f;
    
    static {
        ahcz.registerDefaultInstance(arcm.class, a = new arcm());
    }
    
    private arcm() {
        this.c = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = arcm.g) == null) {
                    synchronized (arcm.class) {
                        if (arcm.g == null) {
                            arcm.g = (ahev)new ahcs((ahcz)arcm.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return arcm.a;
            }
            case 4: {
                return new ahcr((ahcz)arcm.a);
            }
            case 3: {
                return new arcm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcm.a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u1007\f\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000\u000b\u1007\r\f\u103c\u0000\r\u103c\u0000\u000e\u103c\u0000", new Object[] { "d", "c", "b", ardc.class, arda.class, arcb.class, aray.class, "e", arau.class, ardh.class, ardd.class, arbb.class, ardl.class, "f", arbc.class, arbz.class, arbh.class });
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
