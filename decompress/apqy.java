import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqy extends ahcz implements aheo
{
    public static final apqy a;
    private static volatile ahev b;
    private int c;
    private amkb d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apqy.class, a = new apqy());
    }
    
    private apqy() {
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
                if ((b = apqy.b) == null) {
                    synchronized (apqy.class) {
                        if (apqy.b == null) {
                            apqy.b = (ahev)new ahcs((ahcz)apqy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqy.a;
            }
            case 4: {
                return new ahcr((ahcz)apqy.a);
            }
            case 3: {
                return new apqy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqy.a, "\u0001\u0001\u0000\u0001\ue5b3\u21fc\ue5b3\u21fc\u0001\u0000\u0000\u0001\ue5b3\u21fc\u1409\u0000", new Object[] { "c", "d" });
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
