import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwq extends ahcz implements aheo
{
    public static final alwq a;
    private static volatile ahev d;
    public int b;
    public alwo c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alwq.class, a = new alwq());
    }
    
    private alwq() {
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
                final ahev d;
                if ((d = alwq.d) == null) {
                    synchronized (alwq.class) {
                        if (alwq.d == null) {
                            alwq.d = (ahev)new ahcs((ahcz)alwq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alwq.a;
            }
            case 4: {
                return new ahcr((ahcz)alwq.a);
            }
            case 3: {
                return new alwq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwq.a, "\u0001\u0001\u0000\u0001\uee84\u3cd6\uee84\u3cd6\u0001\u0000\u0000\u0001\uee84\u3cd6\u1409\u0000", new Object[] { "b", "c" });
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
