import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxt extends ahcz implements aheo
{
    public static final apxt a;
    private static volatile ahev c;
    public ahbt b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apxt.class, a = new apxt());
    }
    
    private apxt() {
        this.b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = apxt.c) == null) {
                    synchronized (apxt.class) {
                        if (apxt.c == null) {
                            apxt.c = (ahev)new ahcs((ahcz)apxt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apxt.a;
            }
            case 4: {
                return new ahcr((ahcz)apxt.a);
            }
            case 3: {
                return new apxt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "d", "b" });
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
