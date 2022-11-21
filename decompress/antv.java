import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antv extends ahcz implements aheo
{
    public static final antv a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    
    static {
        ahcz.registerDefaultInstance(antv.class, a = new antv());
    }
    
    private antv() {
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
                if ((d = antv.d) == null) {
                    synchronized (antv.class) {
                        if (antv.d == null) {
                            antv.d = (ahev)new ahcs((ahcz)antv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return antv.a;
            }
            case 4: {
                return new ahcr((ahcz)antv.a);
            }
            case 3: {
                return new antv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
