import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuo extends ahcz implements aheo
{
    public static final aiuo a;
    private static volatile ahev b;
    private int c;
    private aiun d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aiuo.class, a = new aiuo());
    }
    
    private aiuo() {
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
                if ((b = aiuo.b) == null) {
                    synchronized (aiuo.class) {
                        if (aiuo.b == null) {
                            aiuo.b = (ahev)new ahcs((ahcz)aiuo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiuo.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuo.a);
            }
            case 3: {
                return new aiuo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuo.a, "\u0001\u0001\u0000\u0001\ue431\u454e\ue431\u454e\u0001\u0000\u0000\u0001\ue431\u454e\u1409\u0000", new Object[] { "c", "d" });
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
