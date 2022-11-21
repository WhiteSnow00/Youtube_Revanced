import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidg extends ahcz implements aheo
{
    public static final aidg a;
    private static volatile ahev d;
    public aisc b;
    public anxb c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aidg.class, a = new aidg());
    }
    
    private aidg() {
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
                final ahev d;
                if ((d = aidg.d) == null) {
                    synchronized (aidg.class) {
                        if (aidg.d == null) {
                            aidg.d = (ahev)new ahcs((ahcz)aidg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aidg.a;
            }
            case 4: {
                return new ahcr((ahcz)aidg.a);
            }
            case 3: {
                return new aidg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
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
