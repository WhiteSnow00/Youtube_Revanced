import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvb extends ahcz implements aheo
{
    public static final apvb a;
    private static volatile ahev b;
    private int c;
    private aifb d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apvb.class, a = new apvb());
    }
    
    private apvb() {
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
                if ((b = apvb.b) == null) {
                    synchronized (apvb.class) {
                        if (apvb.b == null) {
                            apvb.b = (ahev)new ahcs((ahcz)apvb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apvb.a;
            }
            case 4: {
                return new ahcr((ahcz)apvb.a);
            }
            case 3: {
                return new apvb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvb.a, "\u0001\u0001\u0000\u0001\ue5d8\u2622\ue5d8\u2622\u0001\u0000\u0000\u0001\ue5d8\u2622\u1409\u0000", new Object[] { "c", "d" });
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
