import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apey extends ahcz implements aheo
{
    public static final apey a;
    private static volatile ahev b;
    private int c;
    private apex d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apey.class, a = new apey());
    }
    
    private apey() {
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
                if ((b = apey.b) == null) {
                    synchronized (apey.class) {
                        if (apey.b == null) {
                            apey.b = (ahev)new ahcs((ahcz)apey.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apey.a;
            }
            case 4: {
                return new ahcr((ahcz)apey.a);
            }
            case 3: {
                return new apey();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apey.a, "\u0001\u0001\u0000\u0001\ue39b\u4404\ue39b\u4404\u0001\u0000\u0000\u0001\ue39b\u4404\u1409\u0000", new Object[] { "c", "d" });
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
