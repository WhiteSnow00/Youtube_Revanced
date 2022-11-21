import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuv extends ahcz implements aheo
{
    public static final aiuv a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aiuv.class, a = new aiuv());
    }
    
    private aiuv() {
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
                if ((d = aiuv.d) == null) {
                    synchronized (aiuv.class) {
                        if (aiuv.d == null) {
                            aiuv.d = (ahev)new ahcs((ahcz)aiuv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiuv.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuv.a);
            }
            case 3: {
                return new aiuv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuv.a, "\u0001\u0001\u0001\u0000\ue952\u24a1\ue952\u24a1\u0001\u0000\u0000\u0001\ue952\u24a1\u143c\u0000", new Object[] { "c", "b", aolg.class });
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
