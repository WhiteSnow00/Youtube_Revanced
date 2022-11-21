import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuw extends ahcz implements aheo
{
    public static final aiuw a;
    private static volatile ahev d;
    public int b;
    public amth c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aiuw.class, a = new aiuw());
    }
    
    private aiuw() {
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
                if ((d = aiuw.d) == null) {
                    synchronized (aiuw.class) {
                        if (aiuw.d == null) {
                            aiuw.d = (ahev)new ahcs((ahcz)aiuw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiuw.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuw.a);
            }
            case 3: {
                return new aiuw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuw.a, "\u0001\u0001\u0000\u0001\ueee9\u18d1\ueee9\u18d1\u0001\u0000\u0000\u0001\ueee9\u18d1\u1409\u0000", new Object[] { "b", "c" });
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
