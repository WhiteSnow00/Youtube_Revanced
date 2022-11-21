import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojh extends ahcz implements aheo
{
    public static final aojh a;
    private static volatile ahev c;
    public aowb b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aojh.class, a = new aojh());
    }
    
    private aojh() {
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
                if ((c = aojh.c) == null) {
                    synchronized (aojh.class) {
                        if (aojh.c == null) {
                            aojh.c = (ahev)new ahcs((ahcz)aojh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aojh.a;
            }
            case 4: {
                return new ahcr((ahcz)aojh.a);
            }
            case 3: {
                return new aojh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
