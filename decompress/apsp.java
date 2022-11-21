import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsp extends ahcz implements aheo
{
    public static final apsp a;
    private static volatile ahev e;
    public apsq b;
    public ahbt c;
    public boolean d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(apsp.class, a = new apsp());
    }
    
    private apsp() {
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
                final ahev e;
                if ((e = apsp.e) == null) {
                    synchronized (apsp.class) {
                        if (apsp.e == null) {
                            apsp.e = (ahev)new ahcs((ahcz)apsp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apsp.a;
            }
            case 4: {
                return new ahcr((ahcz)apsp.a);
            }
            case 3: {
                return new apsp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100a\u0001\u0003\u1007\u0002", new Object[] { "f", "b", "c", "d" });
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
