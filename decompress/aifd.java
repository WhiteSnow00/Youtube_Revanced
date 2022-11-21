import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifd extends ahcz implements aheo
{
    public static final aifd a;
    private static volatile ahev c;
    public aies b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aifd.class, a = new aifd());
    }
    
    private aifd() {
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
                if ((c = aifd.c) == null) {
                    synchronized (aifd.class) {
                        if (aifd.c == null) {
                            aifd.c = (ahev)new ahcs((ahcz)aifd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aifd.a;
            }
            case 4: {
                return new ahcr((ahcz)aifd.a);
            }
            case 3: {
                return new aifd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifd.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "d", "b" });
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
