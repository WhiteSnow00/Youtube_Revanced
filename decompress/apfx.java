import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfx extends ahcz implements aheo
{
    public static final apfx a;
    private static volatile ahev b;
    private int c;
    private apft d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apfx.class, a = new apfx());
    }
    
    private apfx() {
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
                if ((b = apfx.b) == null) {
                    synchronized (apfx.class) {
                        if (apfx.b == null) {
                            apfx.b = (ahev)new ahcs((ahcz)apfx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfx.a;
            }
            case 4: {
                return new ahcr((ahcz)apfx.a);
            }
            case 3: {
                return new apfx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfx.a, "\u0001\u0001\u0000\u0001\ue8f8\u3bd7\ue8f8\u3bd7\u0001\u0000\u0000\u0001\ue8f8\u3bd7\u1409\u0000", new Object[] { "c", "d" });
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
