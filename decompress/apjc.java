import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjc extends ahcz implements aheo
{
    public static final apjc a;
    private static volatile ahev e;
    public int b;
    public aisc c;
    public akfj d;
    private ajws f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apjc.class, a = new apjc());
    }
    
    private apjc() {
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
                final ahev e;
                if ((e = apjc.e) == null) {
                    synchronized (apjc.class) {
                        if (apjc.e == null) {
                            apjc.e = (ahev)new ahcs((ahcz)apjc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apjc.a;
            }
            case 4: {
                return new ahcr((ahcz)apjc.a);
            }
            case 3: {
                return new apjc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjc.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004", new Object[] { "b", "f", "c", "g", "d" });
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
