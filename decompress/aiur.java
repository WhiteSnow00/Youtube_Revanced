import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiur extends ahcz implements aheo
{
    public static final aiur a;
    private static volatile ahev d;
    public int b;
    public aiup c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aiur.class, a = new aiur());
    }
    
    private aiur() {
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
                if ((d = aiur.d) == null) {
                    synchronized (aiur.class) {
                        if (aiur.d == null) {
                            aiur.d = (ahev)new ahcs((ahcz)aiur.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiur.a;
            }
            case 4: {
                return new ahcr((ahcz)aiur.a);
            }
            case 3: {
                return new aiur();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiur.a, "\u0001\u0001\u0000\u0001\uff91\u1f05\uff91\u1f05\u0001\u0000\u0000\u0001\uff91\u1f05\u1409\u0000", new Object[] { "b", "c" });
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
