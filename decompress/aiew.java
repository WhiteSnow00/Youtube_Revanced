import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiew extends ahcz implements aheo
{
    public static final aiew a;
    private static volatile ahev d;
    public int b;
    public aifb c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aiew.class, a = new aiew());
    }
    
    private aiew() {
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
                if ((d = aiew.d) == null) {
                    synchronized (aiew.class) {
                        if (aiew.d == null) {
                            aiew.d = (ahev)new ahcs((ahcz)aiew.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiew.a;
            }
            case 4: {
                return new ahcr((ahcz)aiew.a);
            }
            case 3: {
                return new aiew();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiew.a, "\u0001\u0001\u0000\u0001\ue5d8\u2622\ue5d8\u2622\u0001\u0000\u0000\u0001\ue5d8\u2622\u1409\u0000", new Object[] { "b", "c" });
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
