import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifl extends ahcz implements aheo
{
    public static final aifl a;
    private static volatile ahev b;
    private int c;
    private ajts d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aifl.class, a = new aifl());
    }
    
    private aifl() {
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
                if ((b = aifl.b) == null) {
                    synchronized (aifl.class) {
                        if (aifl.b == null) {
                            aifl.b = (ahev)new ahcs((ahcz)aifl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifl.a;
            }
            case 4: {
                return new ahcr((ahcz)aifl.a);
            }
            case 3: {
                return new aifl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifl.a, "\u0001\u0001\u0000\u0001\uf90f\u1b55\uf90f\u1b55\u0001\u0000\u0000\u0001\uf90f\u1b55\u1409\u0000", new Object[] { "c", "d" });
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
