import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcn extends ahcz implements aheo
{
    public static final akcn a;
    private static volatile ahev c;
    public akcm b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akcn.class, a = new akcn());
    }
    
    private akcn() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = akcn.c) == null) {
                    synchronized (akcn.class) {
                        if (akcn.c == null) {
                            akcn.c = (ahev)new ahcs((ahcz)akcn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akcn.a;
            }
            case 4: {
                return new ahcr((ahcz)akcn.a);
            }
            case 3: {
                return new akcn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
