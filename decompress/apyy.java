import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyy extends ahcz implements aheo
{
    public static final apyy a;
    private static volatile ahev e;
    public int b;
    public ahbt c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(apyy.class, a = new apyy());
    }
    
    private apyy() {
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
                if ((e = apyy.e) == null) {
                    synchronized (apyy.class) {
                        if (apyy.e == null) {
                            apyy.e = (ahev)new ahcs((ahcz)apyy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apyy.a;
            }
            case 4: {
                return new ahcr((ahcz)apyy.a);
            }
            case 3: {
                return new apyy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", apvm.l });
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
