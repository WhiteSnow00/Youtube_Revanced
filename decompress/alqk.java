import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqk extends ahcz implements aheo
{
    public static final alqk a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aisc e;
    private ahjl f;
    private ajws g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alqk.class, a = new alqk());
    }
    
    private alqk() {
        this.h = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alqk.b) == null) {
                    synchronized (alqk.class) {
                        if (alqk.b == null) {
                            alqk.b = (ahev)new ahcs((ahcz)alqk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqk.a;
            }
            case 4: {
                return new ahcr((ahcz)alqk.a);
            }
            case 3: {
                return new alqk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqk.a, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0004\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004\b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
