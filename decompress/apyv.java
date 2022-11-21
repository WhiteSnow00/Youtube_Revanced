import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyv extends ahcz implements aheo
{
    public static final apyv a;
    private static volatile ahev e;
    public int b;
    public ahbt c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(apyv.class, a = new apyv());
    }
    
    private apyv() {
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
                if ((e = apyv.e) == null) {
                    synchronized (apyv.class) {
                        if (apyv.e == null) {
                            apyv.e = (ahev)new ahcs((ahcz)apyv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apyv.a;
            }
            case 4: {
                return new ahcr((ahcz)apyv.a);
            }
            case 3: {
                return new apyv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", apvm.l });
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
