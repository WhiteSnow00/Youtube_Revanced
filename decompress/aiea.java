import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiea extends ahcz implements aheo
{
    public static final aiea a;
    private static volatile ahev f;
    public anxb b;
    public anxb c;
    public anxb d;
    public anxb e;
    private int g;
    private aisc h;
    private ajws i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aiea.class, a = new aiea());
    }
    
    private aiea() {
        this.j = 2;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aiea.f) == null) {
                    synchronized (aiea.class) {
                        if (aiea.f == null) {
                            aiea.f = (ahev)new ahcs((ahcz)aiea.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aiea.a;
            }
            case 4: {
                return new ahcr((ahcz)aiea.a);
            }
            case 3: {
                return new aiea();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiea.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006", new Object[] { "g", "h", "b", "c", "d", "e", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
