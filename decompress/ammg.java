import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammg extends ahcz implements aheo
{
    public static final ammg a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ammg.class, a = new ammg());
    }
    
    private ammg() {
        this.b = 0;
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
                if ((d = ammg.d) == null) {
                    synchronized (ammg.class) {
                        if (ammg.d == null) {
                            ammg.d = (ahev)new ahcs((ahcz)ammg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ammg.a;
            }
            case 4: {
                return new ahcr((ahcz)ammg.a);
            }
            case 3: {
                return new ammg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammg.a, "\u0001\u0002\u0001\u0000\uf66d\u43e2\uf2ce\u4414\u0002\u0000\u0000\u0001\uf66d\u43e2\u143c\u0000\uf2ce\u4414\u103c\u0000", new Object[] { "c", "b", ammc.class, apol.class });
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
