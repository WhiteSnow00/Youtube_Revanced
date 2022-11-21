import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyr extends ahcz implements aheo
{
    public static final apyr a;
    private static volatile ahev e;
    public int b;
    public ahbt c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(apyr.class, a = new apyr());
    }
    
    private apyr() {
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
                if ((e = apyr.e) == null) {
                    synchronized (apyr.class) {
                        if (apyr.e == null) {
                            apyr.e = (ahev)new ahcs((ahcz)apyr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apyr.a;
            }
            case 4: {
                return new ahcr((ahcz)apyr.a);
            }
            case 3: {
                return new apyr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", apvm.l });
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
