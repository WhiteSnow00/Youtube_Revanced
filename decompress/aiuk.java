import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuk extends ahcz implements aheo
{
    public static final aiuk a;
    private static volatile ahev d;
    public int b;
    public aiuj c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aiuk.class, a = new aiuk());
    }
    
    private aiuk() {
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
                if ((d = aiuk.d) == null) {
                    synchronized (aiuk.class) {
                        if (aiuk.d == null) {
                            aiuk.d = (ahev)new ahcs((ahcz)aiuk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiuk.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuk.a);
            }
            case 3: {
                return new aiuk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuk.a, "\u0001\u0001\u0000\u0001\uf1a6\u3d67\uf1a6\u3d67\u0001\u0000\u0000\u0001\uf1a6\u3d67\u1409\u0000", new Object[] { "b", "c" });
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
