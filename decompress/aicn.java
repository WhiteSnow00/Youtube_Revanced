import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicn extends ahcz implements aheo
{
    public static final aicn a;
    private static volatile ahev c;
    public ajws b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aicn.class, a = new aicn());
    }
    
    private aicn() {
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
                if ((c = aicn.c) == null) {
                    synchronized (aicn.class) {
                        if (aicn.c == null) {
                            aicn.c = (ahev)new ahcs((ahcz)aicn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aicn.a;
            }
            case 4: {
                return new ahcr((ahcz)aicn.a);
            }
            case 3: {
                return new aicn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aicn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
