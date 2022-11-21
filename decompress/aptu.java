import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aptu extends ahcz implements aheo
{
    public static final aptu a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aptu.class, a = new aptu());
    }
    
    private aptu() {
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
                if ((d = aptu.d) == null) {
                    synchronized (aptu.class) {
                        if (aptu.d == null) {
                            aptu.d = (ahev)new ahcs((ahcz)aptu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptu.a;
            }
            case 4: {
                return new ahcr((ahcz)aptu.a);
            }
            case 3: {
                return new aptu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptu.a, "\u0001\u0003\u0001\u0000\uf395\u1e2b\uf185\u1e33\u0003\u0000\u0000\u0003\uf395\u1e2b\u143c\u0000\ue4e1\u1e2d\u143c\u0000\uf185\u1e33\u143c\u0000", new Object[] { "c", "b", apty.class, aptn.class, aptx.class });
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
