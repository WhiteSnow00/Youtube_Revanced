import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuc extends ahcz implements aheo
{
    public static final aiuc a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public aisc d;
    public String e;
    private byte g;
    
    static {
        final aiuc a2 = new aiuc();
        ahcz.registerDefaultInstance(aiuc.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aies.a, a2, (MessageLite)a2, null, 388817581, ahgc.k, aiuc.class);
    }
    
    private aiuc() {
        this.g = 2;
        this.e = "";
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
                final ahev f;
                if ((f = aiuc.f) == null) {
                    synchronized (aiuc.class) {
                        if (aiuc.f == null) {
                            aiuc.f = (ahev)new ahcs((ahcz)aiuc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aiuc.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuc.a);
            }
            case 3: {
                return new aiuc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
