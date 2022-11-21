import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitr extends ahcz implements aheo
{
    public static final aitr a;
    private static volatile ahev d;
    public int b;
    public aitq c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aitr.class, a = new aitr());
    }
    
    private aitr() {
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
                if ((d = aitr.d) == null) {
                    synchronized (aitr.class) {
                        if (aitr.d == null) {
                            aitr.d = (ahev)new ahcs((ahcz)aitr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aitr.a;
            }
            case 4: {
                return new ahcr((ahcz)aitr.a);
            }
            case 3: {
                return new aitr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aitr.a, "\u0001\u0001\u0000\u0001\uea1e\u455b\uea1e\u455b\u0001\u0000\u0000\u0001\uea1e\u455b\u1409\u0000", new Object[] { "b", "c" });
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
