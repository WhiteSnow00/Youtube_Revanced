import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlg extends ahcz implements aheo
{
    public static final amlg a;
    private static volatile ahev c;
    public amks b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amlg.class, a = new amlg());
    }
    
    private amlg() {
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
                if ((c = amlg.c) == null) {
                    synchronized (amlg.class) {
                        if (amlg.c == null) {
                            amlg.c = (ahev)new ahcs((ahcz)amlg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amlg.a;
            }
            case 4: {
                return new ahcr((ahcz)amlg.a);
            }
            case 3: {
                return new amlg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlg.a, "\u0001\u0001\u0000\u0001\ue309\u3ff2\ue309\u3ff2\u0001\u0000\u0000\u0001\ue309\u3ff2\u1409\u0000", new Object[] { "d", "b" });
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
