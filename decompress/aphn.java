import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphn extends ahcz implements aheo
{
    public static final aphn a;
    private static volatile ahev b;
    private int c;
    private amjl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aphn.class, a = new aphn());
    }
    
    private aphn() {
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
                final ahev b;
                if ((b = aphn.b) == null) {
                    synchronized (aphn.class) {
                        if (aphn.b == null) {
                            aphn.b = (ahev)new ahcs((ahcz)aphn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphn.a;
            }
            case 4: {
                return new ahcr((ahcz)aphn.a);
            }
            case 3: {
                return new aphn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphn.a, "\u0001\u0001\u0000\u0001\ue592\u1be6\ue592\u1be6\u0001\u0000\u0000\u0001\ue592\u1be6\u1409\u0000", new Object[] { "c", "d" });
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
