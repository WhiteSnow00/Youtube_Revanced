import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apph extends ahcz implements aheo
{
    public static final apph a;
    private static volatile ahev b;
    private int c;
    private aigh d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apph.class, a = new apph());
    }
    
    private apph() {
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
                if ((b = apph.b) == null) {
                    synchronized (apph.class) {
                        if (apph.b == null) {
                            apph.b = (ahev)new ahcs((ahcz)apph.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apph.a;
            }
            case 4: {
                return new ahcr((ahcz)apph.a);
            }
            case 3: {
                return new apph();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apph.a, "\u0001\u0001\u0000\u0001\uf151\u208b\uf151\u208b\u0001\u0000\u0000\u0001\uf151\u208b\u1409\u0000", new Object[] { "c", "d" });
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