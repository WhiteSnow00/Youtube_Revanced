import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzi extends ahcz implements aheo
{
    public static final apzi a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apzi.class, a = new apzi());
    }
    
    private apzi() {
        this.e = 2;
        final ahbt b = ahbt.b;
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
                if ((b = apzi.b) == null) {
                    synchronized (apzi.class) {
                        if (apzi.b == null) {
                            apzi.b = (ahev)new ahcs((ahcz)apzi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apzi.a;
            }
            case 4: {
                return new ahcr((ahcz)apzi.a);
            }
            case 3: {
                return new apzi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
