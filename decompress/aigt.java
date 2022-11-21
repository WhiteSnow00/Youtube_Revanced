import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigt extends ahcz implements aheo
{
    public static final aigt a;
    private static volatile ahev c;
    public anwr b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aigt.class, a = new aigt());
    }
    
    private aigt() {
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
                if ((c = aigt.c) == null) {
                    synchronized (aigt.class) {
                        if (aigt.c == null) {
                            aigt.c = (ahev)new ahcs((ahcz)aigt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aigt.a;
            }
            case 4: {
                return new ahcr((ahcz)aigt.a);
            }
            case 3: {
                return new aigt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aigt.a, "\u0001\u0001\u0000\u0001\uf697\u1cd7\uf697\u1cd7\u0001\u0000\u0000\u0001\uf697\u1cd7\u1409\u0000", new Object[] { "d", "b" });
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
