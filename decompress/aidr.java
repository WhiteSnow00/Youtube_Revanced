import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidr extends ahcz implements aheo
{
    public static final aidr a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aisc f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aidr.class, a = new aidr());
    }
    
    private aidr() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aidr.b) == null) {
                    synchronized (aidr.class) {
                        if (aidr.b == null) {
                            aidr.b = (ahev)new ahcs((ahcz)aidr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aidr.a;
            }
            case 4: {
                return new ahcr((ahcz)aidr.a);
            }
            case 3: {
                return new aidr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidr.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
