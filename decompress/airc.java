import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airc extends ahcz implements aheo
{
    public static final airc a;
    private static volatile ahev e;
    public int b;
    public aisc c;
    public aisc d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(airc.class, a = new airc());
    }
    
    private airc() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = airc.e) == null) {
                    synchronized (airc.class) {
                        if (airc.e == null) {
                            airc.e = (ahev)new ahcs((ahcz)airc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return airc.a;
            }
            case 4: {
                return new ahcr((ahcz)airc.a);
            }
            case 3: {
                return new airc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)airc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
