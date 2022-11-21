import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuq extends ahcz implements aheo
{
    public static final aiuq a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aiuq.class, a = new aiuq());
    }
    
    private aiuq() {
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
                if ((d = aiuq.d) == null) {
                    synchronized (aiuq.class) {
                        if (aiuq.d == null) {
                            aiuq.d = (ahev)new ahcs((ahcz)aiuq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiuq.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuq.a);
            }
            case 3: {
                return new aiuq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuq.a, "\u0001\u0001\u0001\u0000\ue952\u24a1\ue952\u24a1\u0001\u0000\u0000\u0001\ue952\u24a1\u143c\u0000", new Object[] { "c", "b", aolg.class });
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
