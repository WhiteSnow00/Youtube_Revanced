import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqg extends ahcz implements aheo
{
    public static final akqg a;
    private static volatile ahev e;
    public int b;
    public boolean c;
    public akqh d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akqg.class, a = new akqg());
    }
    
    private akqg() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = akqg.e) == null) {
                    synchronized (akqg.class) {
                        if (akqg.e == null) {
                            akqg.e = (ahev)new ahcs((ahcz)akqg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akqg.a;
            }
            case 4: {
                return new ahcr((ahcz)akqg.a);
            }
            case 3: {
                return new akqg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1007\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
