import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amln extends ahcz implements aheo
{
    public static final amln a;
    private static volatile ahev c;
    public alht b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amln.class, a = new amln());
    }
    
    private amln() {
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
                if ((c = amln.c) == null) {
                    synchronized (amln.class) {
                        if (amln.c == null) {
                            amln.c = (ahev)new ahcs((ahcz)amln.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amln.a;
            }
            case 4: {
                return new ahcr((ahcz)amln.a);
            }
            case 3: {
                return new amln();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amln.a, "\u0001\u0001\u0000\u0001\ueadb\u3b09\ueadb\u3b09\u0001\u0000\u0000\u0001\ueadb\u3b09\u1409\u0000", new Object[] { "d", "b" });
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
