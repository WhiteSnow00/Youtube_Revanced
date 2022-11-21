import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appp extends ahcz implements aheo
{
    public static final appp a;
    private static volatile ahev b;
    private int c;
    private aies d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(appp.class, a = new appp());
    }
    
    private appp() {
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
                if ((b = appp.b) == null) {
                    synchronized (appp.class) {
                        if (appp.b == null) {
                            appp.b = (ahev)new ahcs((ahcz)appp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appp.a;
            }
            case 4: {
                return new ahcr((ahcz)appp.a);
            }
            case 3: {
                return new appp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appp.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "c", "d" });
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
