import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcr extends ahcz implements aheo
{
    public static final aqcr a;
    private static volatile ahev c;
    public agwi b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aqcr.class, a = new aqcr());
    }
    
    private aqcr() {
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
                if ((c = aqcr.c) == null) {
                    synchronized (aqcr.class) {
                        if (aqcr.c == null) {
                            aqcr.c = (ahev)new ahcs((ahcz)aqcr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqcr.a;
            }
            case 4: {
                return new ahcr((ahcz)aqcr.a);
            }
            case 3: {
                return new aqcr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqcr.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "d", "b" });
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
